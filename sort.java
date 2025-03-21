import java.util.*;
import java.io.*;
class sort{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,a,b,c,j;
		System.out.print("Enter array size");
		a=sc.nextInt();
		int s[]=new int[a];
		System.out.print("Enter array");
		for( i=0;i<a;i++){
			s[i]=sc.nextInt();
		}
		System.out.println("Array is");
		for( i=0;i<a;i++){
			System.out.println(s[i]);
		}
		int temp=0;
		for(i=0;i<a;i++){
			for(j=0;j<a;j++){
				if (s[i]<s[j]) {
					temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
        }
		System.out.println("Sorted array");

		for(i=0;i<a;i++){
			System.out.println(s[i]);
		}
	}
}