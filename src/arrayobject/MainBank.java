package arrayobject;
import java.util.Scanner;
public class MainBank {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        int n,i,ch=1;
        System.out.print("Enter number of depositers:");
        n = sc.nextInt();
        Bank[] depositer = new Bank[n];
        for(i = 0; i < n; i++) {
            depositer[i] = new Bank();
        }
        while(ch != 0) {
            System.out.print("\n1. Enter info\n2. Display info\n3. Deposit\n4. Withdraw\nEnter choice:");
            ch = sc.nextInt();
            switch(ch) {
                case 1:
                    System.out.print("Enter position of depositer: ");
                    i = sc.nextInt();
                    depositer[i-1].set();
                    break;
                case 2:
                    System.out.print("Enter position of depositer: ");
                    i = sc.nextInt();
                    depositer[i-1].display();
                    break;
                case 3:
                    System.out.print("Enter position of depositer: ");
                    i = sc.nextInt();
                    depositer[i-1].deposit();
                    break;
                case 4:
                    System.out.print("Enter position of depositer: ");
                    i = sc.nextInt();
                    depositer[i-1].withdraw();
                    break;
            }
            System.out.print("\nDo you want to continue? 0 for no, 1 for yes: ");
            ch = sc.nextInt();
        }
        sc.close();
    }
}

class Bank {
    Scanner sc = new Scanner(System.in);
    String name, add;
    int accno;
    double bal;
    static int unique = 1000;

    Bank() {
        name = "N/A";
        add = "N/A";
        bal = 0.0;
        accno = unique++;
    }

    void set() {
        System.out.print("Enter name:");
        name = sc.nextLine();
        System.out.print("Enter address:");
        add = sc.nextLine();
        System.out.print("Enter bank balance:");
        bal = sc.nextDouble();
    }

    void display() {
        System.out.println("\nName :\t" + name);
        System.out.println("Address :\t" + add);
        System.out.println("Account No. :\t" + accno);
        System.out.println("Bank Balance :\t" + bal);
    }

    void deposit() {
        System.out.print("Enter amount to deposit: ");
        float temp = sc.nextFloat();
        bal += temp;
        System.out.println("Amount deposited.\n");
    }

    void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        float temp = sc.nextFloat();
        if(temp > bal)
            System.out.println("Insufficient Balance.\n");
        else {
            bal -= temp;
            System.out.println("Amount Withdrawn.\n");
        }
    }
}




