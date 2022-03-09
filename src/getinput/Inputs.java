package getinput;

import java.util.Scanner;
import com.kinlib.currenttime.CrtTime;

public class Inputs {
	//this is on global variable. in java not global is identify on instance variable    
	public static int option =0;
	public static String StdId=null;
	public static String bookid=null;
	public static String BookName=null;
	public static String TakeData=null;
	static Scanner sc = new Scanner(System.in) ;
	
	// user getting on choice
	public static  int choise() {
		
		
		System.out.println("choose your option");
		System.out.println("add     ==>  1   , fine d or r ==>  2" );
		System.out.println("retuen  ==>  3	 , update   ==>  4");
		System.out.println("display ==>  5");
			option=sc.nextInt();
			return option;
		
}
	//get a input for insert query
	public static void getIputInsert() {
		System.out.println("enter std id");
		 StdId=sc.next();
		 System.out.println("enter bookid");
		 bookid=sc.next();
		 System.out.println("enter bookname");
		 BookName=sc.next();
		 System.out.println("enter date");
		 TakeData= CrtTime.currenttime();
		 System.out.println(TakeData);
		
	}	
	public static void GetIputDelet() {
		System.out.println("enter std id");
		StdId=sc.next();
		System.out.println("enter bookid");
		bookid=sc.next();
		
	}
	public static int moneyCheck() {
		
		System.out.println("choose your option");
		System.out.println("paid 	 ==>1");
		System.out.println("not paid ==>2");
		 option=sc.nextInt();
		return option;
	}
public static int ReturnRenve() {
		
		System.out.println("choose your option");
		System.out.println("return 	 ==>1");
		System.out.println("reneve   ==>2");
		 option=sc.nextInt();
		return option;
	}
}

