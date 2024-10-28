import java.util.Scanner;

class Account {
    private int current_Money, balance_Money;

    public Account(int initialBalance) {
        this.current_Money = initial_Balance;
        this.balance_Money = initial_Balance;
    }

    void deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the money to be added:");
        int addMoney = sc.nextInt();
        current_Money += addMoney;
        balance_Money += addMoney;
        System.out.println("Current money = " + current_Money);
    }

    void withdrawal() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the money to be withdrawn:");
        int withdrawMoney = sc.nextInt();
        if (balance_Money < withdrawMoney) {
            System.out.println("Insufficient balance");
        } else {
            current_Money = withdrawMoney;
            balance_Money = withdrawMoney;
            System.out.println("Balance amount = " + current_Money);
        }
    }

    void display() {
        System.out.println("Total balance amount = " + current_Money);
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of accounts:");
        int n = sc.nextInt();
        Account[] accounts = new Account[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter current balance for account " + (i + 1) + ":");
            int initial_Balance = sc.nextInt();
            accounts[i] = new Account(initial_Balance);
        }

        while (true) {
            System.out.println("--MENU--- \n1. Deposit \n2. Withdraw \n3. Check Balance \n4. Exit");
            System.out.print("Choose an option: ");
            int ch = sc.nextInt();

            if (ch == 4) {
                System.out.println("Exiting...");
                break;
            }

            System.out.print("Select account number (1 to " + n + "): ");
            int acc = sc.nextInt();

            switch (ch) {
                case 1:
                    accounts[acc].deposit();
                    break;
                case 2:
                    accounts[acc].withdrawal();
                    break;
                case 3:
                    accounts[acc].display();
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
        sc.close();
    }
}
