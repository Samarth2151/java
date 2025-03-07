import java.util.*;
import java.io.*;
class exp1_1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number to find factorial");
        int s=sc.nextInt();
        int fact=1;
        int i;
    for(i=1;i<=s;i++){
        fact=fact*i;
    }
    System.out.println("Factorial is" +fact);
    }


}