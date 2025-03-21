import java.util.*;
import java.io.*;
class merge{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		int i;


		System.out.print("Enter array size");
		a=sc.nextInt();
		int s[]=new int[a];
		System.out.print("Enter array");
		for( i=0;i<a;i++){
			s[i]=sc.nextInt();
		}

		System.out.println("/nEnter 2nd array size");
		b=sc.nextInt();
		int s1[]=new int[b];
		System.out.print("Enter array");
		for(i=0;i<b;i++){
			s1[i]=sc.nextInt();
		}
		int n=a+b;
		int s2[]=new int[n];

		for(i=0;i<a;i++){
			 s2[i]=s[i];
		}
		for(i=0;i<b;i++){
			s2[s.length+i]=s1[i];
		}
		
		System.out.println("Merged array ");
		for(i=0;i<s2.length;i++){
			System.out.println(s2[i]);
		}

		


	}
}