import java.util.Scanner; // import the Scanner class 

public class Hello {
		public static void main (String[] args) {
//			int n,flag = 1,x,loc=0;
//			int a1[] = new int[1];
//			System.out.println(a1[0]);
//			Scanner S = new Scanner(System.in);
//			System.out.print("Enter number of elemnts ");
//			n = S.nextInt();
//			int a[] = new int[n];
//			System.out.println("Enter all the elements");
//			for (int i = 0;i<n;i++)
//			{
//				a[i] = S.nextInt();
//			}
//			
//			for (int i = 0;i<n;i++)
//			{
//				System.out.println("Element at " + i + " is " +a[i]);
//			}
//			
//			System.out.println("Enter the number you want to delete");
//			x = S.nextInt();
//			
//			for(int i = 0;i<n;i++)
//			{
//				if (a[i] == x)
//				{
//					flag = 1;
//					loc = i;
//				}
//			}
//			if (flag == 1)
//			{
//				for(int i = loc+1;i< n;i++)
//				{
//					a[i-1] = a[i];
//				}
//			}
			
			
			Student.change();
			Student s1 = new Student();
			Student s2 = new Student();
			
			s1.display();
			s1.college="VJIT";
			s1.display();
			s2.display();
		}
}