package liberary;

import java.util.Scanner;
import java.util.Arrays;

public class liberary {
 
	public static void main(String[] args){
		System.out.println("Welcom Mr Admin");
		books book[]=new books[1000];
		members member[]=new members[100];
		int g=0;
		
		while(g==0){
			Scanner scanner= new Scanner(System.in);
			System.out.println("\nto choose from the following list, press:"
					+"\n 1 to add book"
					+"\n 2 to search for a book"
					+"\n 3 to borrow a book"
					+"\n 4 to delet a book copy"
					+"\n 5 to search for a member and his borrow list "
					+"\n 6 to delet a member"
					+"\n 7 to add a new member"
					+"\n 8 to return a borrowed book"
					+"\n-1 to exit the program");
			int c = scanner.nextInt();
				
				if (c==1){             
					System.out.println("Inter the number of books");
					int num = scanner.nextInt(); 
					books info=bookinfo();
					add(book,info,num);
					System.out.println("the book is added successfully \n\n\n");
				    	}
				              
				if (c==2){    
						books output=search_book(book);
						System.out.println("The number of copies of this book =  " + output.copies);
						continue;
						}
				
				if (c==3){        
					System.out.println("The borrow period must be less than 14 days: \n inter 'true' for acception \n 'false' for refusal ");
					if(scanner.nextBoolean()){   
					    members ch = search_mem(member);
						if (ch.name !=null && ch.id !=0){
							books bow=search_book(book);
							int i=0;
							while(ch.b_list[i]!=null){
								i++;
							}
							borrow(bow,ch,i);
							System.out.println("Done!!");
						}
						continue;
						}
				}
				
				if (c==4){    
					    int copy=delet_copy(search_book(book));
						System.out.println("The remaining copies =  ");
						continue;
						}
				if (c==5){ 
						members out=search_mem(member);
						System.out.println("The borrow list of this username is :  " + Arrays.toString(out.b_list));
						continue;
						}
				if (c==6){ 
						delet_mem(search_mem(member));
						continue;
						}
				if (c==7){ 
					    System.out.println("Inter the number of members");
					    int num=scanner.nextInt();
					    members info = meminfo();
					    new_mem(member,info,num);
						System.out.println("The member is added successfully");
						continue;
						}
				if (c==8){
					    books rebook = search_book(book);
					    members relist=search_mem(member);
					    Return(rebook,relist);
					    System.out.println("Done!!");
				        }
					
				if (c==-1){ 
						System.out.println("Good Bye .. ");
						break;
						}
			}
	}
	
	public static void Return(books rebook,members relist){
		rebook.copies +=1;
		
		for (int y=0;y<relist.b_list.length;y++){
			if(rebook.title==relist.b_list[y]){
				relist.b_list[y]=null;
			}
		}
	}
	
	public static books search_book(books exist[]){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inter the book title");
		String title=scanner.nextLine();
		System.out.println("Inter the book's author");
		String author= scanner.nextLine();
		int r;
		for (r=0; r<exist.length;r++){
			if(exist[r].title != null && exist[r].author != null){
				if(exist[r].title == title && exist[r].author == author){
			}
				break;
			}break;
		}
		return exist[r];
	}
	
	public static int delet_copy(books one){
		Scanner scanner = new Scanner(System.in);
		books del=one;
		int copy = del.copies;
		copy-=1;
		return copy;
	}
		
	public static members search_mem(members exist[]){
		Scanner scanner = new Scanner(System.in);	
		System.out.println("Inter the username");
		String name=scanner.nextLine();
		System.out.println("Inter the id");
		int id = scanner.nextInt();
		int v;
		
		for ( v=0; v<exist.length;v++){
			if(exist[v].name!=null && exist[v].id!=0 ){
				if(exist[v].name==name && exist[v].id==id){
				break;
				}break;
			}
		}
		return exist[v];
	}
	
	public static members[] new_mem(members member[],members info,int num){
		Scanner scanner = new Scanner(System.in);
		
		
		
		for(int j=0; j<num;j++){
			member[j]=info;
		}
		return member;
	}		
		
	public static members meminfo(){
		Scanner scanner = new Scanner(System.in);
		members m_input = new members();
		System.out.println("Insert the member name");
		m_input.name = scanner.nextLine();
		
		System.out.println("Insert the member id");
		m_input.id= scanner.nextInt();
		
	return m_input;
	}
	
	public static books[] add(books book[] , books info, int num){
		Scanner scanner = new Scanner(System.in);
		for(int k=0; k<num; k++){
			book[k]= info;
		}
	    return book;
	}
	
	public static books bookinfo(){
		books b_input = new books();
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Insert the book title");
		b_input.title = scanner.nextLine();
		
		System.out.println("Insert the book author");
		b_input.author= scanner.nextLine();
		
		System.out.println("Insert the date of publishing");
		b_input.dop= scanner.nextLine();
		
		System.out.println("Insert the number of book cobies");
		b_input.copies = scanner.nextInt();
	
		return b_input;
	}
		
	public static void delet_mem(members mem){
		Scanner scanner = new Scanner(System.in);
		members del = mem;
		del.name=null;
		del.id=0;
		del.b_list=null;
	}
	
    public static void borrow(books bow,members ch,int i){
		Scanner scanner = new Scanner(System.in);
		bow.copies -=1;
		ch.b_list[i]=bow.title;
		

		}
	}