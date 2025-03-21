class bank {
    int balance;

    bank(int amount) {
        balance = amount;
    }

    void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void showBalance() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        SavingsBank acc = new SavingsBank(500);
        acc.deposit(200);
        acc.withdraw(550);
        acc.withdraw(50);
        acc.showBalance();
    }
}

class SavingsBank extends bank {
    SavingsBank(int amount) {
        super(amount);
    }

    @Override
    void withdraw(int amount) {
        if (balance - amount < 100) {
            System.out.println("Withdrawal denied! Balance cannot fall below 100.");
        } else {
            super.withdraw(amount);
        }
    }
}
