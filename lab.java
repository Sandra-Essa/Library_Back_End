package task;
import java.util.Scanner;
public class lab {

	Scanner input=new Scanner(System.in);
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int operation=0;
		Book books[]=readBooks();
		Member members[]=readmembers();
		//Book Library_list =getLibrary_list(book);
		//operation
		System.out.println("Welcome Mr Admin\r\n" + "Which one of the following operation would you like to do, please press");
		System.out.println("1 for Book Insertion");
		System.out.println("2 for searching for book");
		System.out.println("3 for searching for member or ID");
		System.out.println("4 for borrow book ");
		System.out.println("5 for delete a member and ID");
		System.out.println("-1  to exit the program");
		operation=input.nextInt();
		
		
		//Book insertion
		if(operation==1) {
			Book_Insertation( );
			System.out.println("operation accomplished suuccessfully");}
		
		//searching for book
		else if(operation==2 ) {
			if(EXIST ()) 
				books output=search_book(book);
						System.out.println("The number of copies of this book =  " + output.copies);
				else
			System.out.println("Book is Not exist");}
		
		// borrow book
		//else if(operation==3) {
			
			
			
			 
		}
		
		//library
		public static Book[] readBooks() {
			Scanner input=new Scanner(System.in);
			System.out.println(" please enter number of books");
			int noOfBooks=input.nextInt();
			Book books []= new Book[noOfBooks*2];
			for(int i=0; i<noOfBooks;i++) {
				books[i]= readBooksInfo();
			}
			return books;
		}
		  
		public static Book readBooksInfo() {
			Scanner input=new Scanner(System.in);
			Book book_I =new Book();
			
			System.out.println("please enter name of book");
			book_I.Book_Name =input.nextLine();
			
			System.out.println("please enter name of author");
			book_I.Book_Author =input.nextLine();
			
			System.out.println("please enter publishing date");
			book_I.Book_Date =input.nextLine();
			
			System.out.println("please enter number of copies ");
			book_I.Book_copies =input.nextInt();
			return book_I;
		}
		//members of library
		public static Member[] readmembers() {
			Scanner input=new Scanner(System.in);
			System.out.println(" please enter number of members");
			int noOfMembers=input.nextInt();
			Member members []= new Member[noOfMembers*2];
			for(int i=0; i<noOfMembers;i++) {
				members[i]= readMembersInfo();
			}
			return members;
		}
		
		public static Member readMembersInfo() {
			Scanner input=new Scanner(System.in);
			Member member_1 =new Member();
			
			System.out.println("please enter name of member");
			member_1.Member_Name =input.nextLine();
			
			System.out.println("please enter ID of member");
			member_1.Member_ID =input.nextInt();
			
			return member_1;
		}
		
		//Book insertion
		public static void Book_Insertation( ) {
			Scanner input=new Scanner(System.in);
			System.out.println (" please enter Number of book, you want to insert");
			 int Size_Book=input.nextInt();
			 Book Book[]=new Book[Size_Book*2];
			 for(int i=0;i< Size_Book;i++) {
				 System.out.println("please Enter name of book");
				 Book First=new Book();
				 First.Book_Name=input.next();
				 System.out.println("please Enter publishing date of book");
				 First. Book_Date=input.next();
				 System.out.println("please Enter Author of book");
				 First. Book_Author=input.next();
				 System.out.println("please Enter no.copies of book");
				 First.Book_copies =input.nextInt();
				 Book[i]=First;}
			 }
		
		//searching for book by author or name of book
		public static boolean EXIST () {
	     Scanner input=new Scanner(System.in);
	 	System.out.println (" please enter number of book , you want to search about them");
	 	int No_Book=input.nextInt();
	 	 Book Book_exist[]=new Book[No_Book*2];
	 	for(int i=0;i< No_Book*2;i++){
	 		 System.out.println("please Enter name of book OR name of author");
			 Book book=new Book();
			 //System.out.println("please Enter Author of book");
			 //Book author=new Book();
			 if(readBooks()[i]==book ){
				 Book_exist[i]=book;
                  return true;
				   }
				   return false;
			                }
						return false;
					       }

	 	
			
			 
	
	}
	
	
	
	
	
	
	
	
	