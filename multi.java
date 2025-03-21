class student{
    int rollno=12;    
}
class test extends student{

        int sub1=40;
        int sub2=30;

}
class result extends test{
    void displayresult(){
        System.out.println("Roll number is "+rollno);
        System.out.println("Got marks out of 50 in AOOC "+sub1);
        System.out.println("Got marks out of 50 in Automata theory  "+sub2);
        
    }
}

class multi{
     public static void main(String[] args){
        result obj=new result();
        obj.displayresult();
    }
}
