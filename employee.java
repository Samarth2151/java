class employee {
    String a, b, c;
    int d;

    employee(String a, String b, String c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    void clbonus() {
        System.out.println("Bonus: " + (0.10 * d));
    }

    void gen() {
        System.out.println(c + " " + a + " has shown excellent performance.");
    }

    void mgp() {
        System.out.println("Name: " + a);
        System.out.println("Address: " + b);
        System.out.println("Job Title: " + c);
        System.out.println("Salary: " + d);
        clbonus();
    }
     public static void main(String[] args) {
        Manager e = new Manager("Pratik", "Islampur", 80000);
        Developer f = new Developer("Raj", "Solapur", 60000);
        Programmer g = new Programmer("Piyush", "Mumbai", 50000);

        e.mgp();
        e.clbonus();
        System.out.println();

        f.mgp();
        f.clbonus();
        System.out.println();

        g.mgp();
        g.clbonus();
    }
}

class Manager extends employee {
    Manager(String a, String b, int d) {
        super(a, b, "Manager", d);
    }

    void clbonus() {
        System.out.println("Bonus: " + (0.20 * d));
    }

    void mgp() {
        System.out.println(a + " is managing company projects.");
    }
}

class Developer extends employee {
    Developer(String a, String b, int d) {
        super(a, b, "Developer", d);
    }

    void clbonus() {
        System.out.println("Bonus: " + (0.15 * d));
    }

    void mgp() {
        System.out.println(a + " is developing software.");
    }
}

class Programmer extends employee {
    Programmer(String a, String b, int d) {
        super(a, b, "Programmer", d);
    }

    void clbonus() {
        System.out.println("Bonus: " + (0.12 * d));
    }

    void mgp() {
        System.out.println(a + " is debugging the code.");
    }
   
}


