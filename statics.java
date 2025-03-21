class statics{
    static int count = 10;
    
    static {
        System.out.println("Static block executed");
    }
    
    static void display() {
        System.out.println("Count: " + count);
    }

    public static void main(String[] args) {
        statics.display();
    }
}


