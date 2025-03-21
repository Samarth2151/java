import java.util.Scanner;

class Area {
    int a;
    int b;
    
    public void setDim(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    public int getArea() {
        return a * b;
    }
}

public class area1 {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        Area a = new Area();
        
        System.out.println("Enter the length of the rectangle:");
        int b = c.nextInt();
        
        System.out.println("Enter the breadth of the rectangle:");
        int d = c.nextInt();
        
        a.setDim(b, d);
        
        System.out.println("The area of the rectangle is: " + a.getArea());
        
        c.close();
    }
}
