package homework;

public class Main {
    public static void main(String[] args) {
        USBank usBank = new USBank(988775,"USA", Currency.USD, 600, 1300, 1, 2000000);
        EUBank euBank = new EUBank(984444,"EU", Currency.EUR, 500, 1200, 2, 3000000);
        ChinaBank chinaBank = new ChinaBank(9855555, "China", Currency.EUR, 700, 900,3, 4000000);

        User user1 = new User(674987,"Ann", 3000, 24, "Oracle", 1500, usBank);
        User user2 = new User(499, "Max", 2000, 12, "IBM", 1300, usBank);

        User user3 = new User(399999,"Bill", 4000, 30, "Google", 1250, euBank);
        User user4 = new User(30000, "Susan", 7000, 48,"Amazon", 2000, euBank);

        User user5 = new User(29775, "Li", 300, 9, "Xi", 700, chinaBank);
        User user6 = new User(398777, "Chan", 2800, 27, "Lenovo", 800, chinaBank);

        BankSystem bankSystem = new BankSystemImpl();

        System.out.println("Balance of " + user1.getName() + " " + user1.getBalance());
        bankSystem.paySalary(user1);
        System.out.println("Balance after salary " + user1.getBalance());
        bankSystem.fundUser(user1, 500);
        System.out.println("Balance after funding " + user1.getBalance());
        bankSystem.withdrawOfUser(user1, 700);
        System.out.println("Balance after withdrawal " + user1.getBalance());
        System.out.println("Balance of " + user2.getName() + " " + user2.getBalance());
        bankSystem.transferMoney(user1, user2, 600);
        System.out.println("Balance of " + user1.getName() + " after transfer " + user1.getBalance());
        System.out.println("Balance of " + user2.getName() + " after transfer " + user2.getBalance());

        System.out.println();

        System.out.println("Balance of " + user2.getName() + " " + user2.getBalance());
        bankSystem.paySalary(user2);
        System.out.println("Balance after salary " + user2.getBalance());
        bankSystem.fundUser(user2, 600);
        System.out.println("Balance after funding " + user2.getBalance());
        bankSystem.withdrawOfUser(user2, 800);
        System.out.println("Balance after withdrawal " + user2.getBalance());
        System.out.println("Balance of " + user1.getName() + " " + user1.getBalance());
        bankSystem.transferMoney(user2, user1, 900);
        System.out.println("Balance of " + user2.getName() + " after transfer " + user2.getBalance());
        System.out.println("Balance of " + user1.getName() + " after transfer " + user1.getBalance());

        System.out.println();

        System.out.println("Balance of " + user3.getName() + " " + user3.getBalance());
        bankSystem.paySalary(user3);
        System.out.println("Balance after salary " + user3.getBalance());
        bankSystem.fundUser(user3, 400);
        System.out.println("Balance after funding " + user3.getBalance());
        bankSystem.withdrawOfUser(user3, 900);
        System.out.println("Balance after withdrawal " + user3.getBalance());
        System.out.println("Balance of " + user4.getName() + " " + user4.getBalance());
        bankSystem.transferMoney(user3, user4, 700);
        System.out.println("Balance of " + user3.getName() + " after transfer " + user3.getBalance());
        System.out.println("Balance of " + user4.getName() + " after transfer " + user4.getBalance());

        System.out.println();

        System.out.println("Balance of " + user4.getName() + " " + user4.getBalance());
        bankSystem.paySalary(user4);
        System.out.println("Balance after salary " + user4.getBalance());
        bankSystem.fundUser(user4, 600);
        System.out.println("Balance after funding " + user4.getBalance());
        bankSystem.withdrawOfUser(user4, 800);
        System.out.println("Balance after withdrawal " + user4.getBalance());
        System.out.println("Balance of " + user3.getName() + " " + user3.getBalance());
        bankSystem.transferMoney(user4, user3, 900);
        System.out.println("Balance of " + user4.getName() + " after transfer " + user4.getBalance());
        System.out.println("Balance of " + user3.getName() + " after transfer " + user3.getBalance());

        System.out.println();

        System.out.println("Balance of " + user5.getName() + " " + user5.getBalance());
        bankSystem.paySalary(user5);
        System.out.println("Balance after salary " + user5.getBalance());
        bankSystem.fundUser(user5, 600);
        System.out.println("Balance after funding " + user5.getBalance());
        bankSystem.withdrawOfUser(user5, 80);
        System.out.println("Balance after withdrawal " + user5.getBalance());
        System.out.println("Balance of " + user6.getName() + " " + user6.getBalance());
        bankSystem.transferMoney(user5, user6, 90);
        System.out.println("Balance of " + user5.getName() + " after transfer " + user5.getBalance());
        System.out.println("Balance of " + user6.getName() + " after transfer " + user6.getBalance());

        System.out.println();

        System.out.println("Balance of " + user6.getName() + " " + user6.getBalance());
        bankSystem.paySalary(user6);
        System.out.println("Balance after salary " + user6.getBalance());
        bankSystem.fundUser(user6, 600);
        System.out.println("Balance after funding " + user6.getBalance());
        bankSystem.withdrawOfUser(user6, 50);
        System.out.println("Balance after withdrawal " + user6.getBalance());
        System.out.println("Balance of " + user5.getName() + " " + user5.getBalance());
        bankSystem.transferMoney(user6, user5, 10);
        System.out.println("Balance of " + user6.getName() + " after transfer " + user6.getBalance());
        System.out.println("Balance of " + user5.getName() + " after transfer " + user5.getBalance());
    }
}
