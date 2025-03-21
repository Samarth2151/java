public class employee{

String fn;
String ln;
int sal,year,r;

void employee(){}
void employee(String fn,String ln,int sal){
this.fn=fn;
this.ln=ln;
this.sal=sal;
}

void setn(String fn,String ln){
this.fn=fn;
this.ln=ln;
}

void sets(){
System.out.println("Employee Name");
System.out.print(fn+""+ln+"..");
}

void getn(int sal){
this.sal=sal;
if(sal<0){
sal=0;
}}

void gets(){
System.out.print("Monthly salary"+sal+"...");
}

void sety(){
year=sal*12;
System.out.println("Yearly salary of employee.."+year);
}

void setr(){
int r=sal*10/100;
r+=sal;
System.out.println("Raise is 10 % and that is "+r);
r*=12;
System.out.println("Yearly salary is"+r);
}

public static void main(String args[]){
employee obj=new employee();
employee obj1=new employee();

obj.setn("aniket","shinde");
obj.sets();
obj.getn(12000);
obj.gets();
obj.sety();
obj.setr();

obj1.setn("pratik","zende");
obj1.sets();
obj1.getn(15000);
obj1.gets();
obj1.sety();
obj1.setr();


}

}
