import java.util.*;
public class StudentMarks {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first subject Marks:");
		int sub1=sc.nextInt();
		System.out.println("Enter the second Marks:");
		int sub2=sc.nextInt();
		System.out.println("Enter the third subject Marks:");
		int sub3=sc.nextInt();
		if(sub1>=60 && sub2>=60 && sub3>=60) {
			System.out.println("pass");
		}
		else if((sub1>=60 && sub2>=60) || (sub2>60 && sub3>=60) || (sub3>=60 && sub1>=60))
			System.out.println("promoted");
	}
	else if((sub1<60 && sub2<60 && sub3<60) ||(sub1>60 || sub2>60 || sub3>60)) {
		System.out.println("fail");
		
	      }
	
   }


}

