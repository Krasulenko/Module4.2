package homework;

import homework.BankSystem;

public class BankSystemImpl implements BankSystem {

    @Override
    public void withdrawOfUser(User user, int amount) {
        double amountOfWithdrawal = amount + amount * user.getBank().getCommission(amount) * 0.01;
        if (user.getBank().getLimitOfWithdrawel() >= amountOfWithdrawal){
            if (user.getBalance() >= amountOfWithdrawal) {
                user.setBalance(user.getBalance() - amountOfWithdrawal);
            }
            else System.out.println("You do not have enough money in your account");
        }
        else System.out.println("You are out of limit");
    }

    @Override
    public void fundUser(User user, int amount) {
        double amountOfFunding = amount - amount * user.getBank().getCommission(amount) * 0.01;
        if (user.getBank().getLimitOfFunding() >= amount) user.setBalance(user.getBalance() + amountOfFunding);
        else System.out.println("You are out of limit");
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        double amountOfWidrawal = amount + amount * fromUser.getBank().getCommission(amount) * 0.01;
        double amountOfFunding = amount - amount * toUser.getBank().getCommission(amount) * 0.01;
        if (fromUser.getBank().getLimitOfWithdrawel() >= amountOfWidrawal){
            if (toUser.getBank().getLimitOfFunding() >= amount){
                if (fromUser.getBalance() >= amountOfWidrawal) {
                    fromUser.setBalance(fromUser.getBalance() - amountOfWidrawal);
                    toUser.setBalance(toUser.getBalance() + amountOfFunding);
                }
                else System.out.println("You do not have enough money in your account");
            }
            else System.out.println("You are out of funding limit");
        }
        else System.out.println("You are out of withdrawal limit");
    }

    @Override
    public void paySalary(User user) {
        user.setBalance(user.getBalance() + user.getSalary());
    }
}
