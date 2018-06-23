package homework;

import homework.Bank;

public class ChinaBank extends Bank {

    @Override
    public int getLimitOfWithdrawel() {
        if (getCurrency() == Currency.USD) return 100;
        else return 150;
    }

    @Override
    public int getLimitOfFunding() {
        if (getCurrency() == Currency.USD) return 10000;
        else return 5000;
    }

    @Override
    public int getMonthlyRate() {
        if (getCurrency() == Currency.USD) return 1;
        else return 0;
    }

    @Override
    public int getCommission(int summ) {
        if (getCurrency() == Currency.USD){
            if (summ <= 1000) return 3;
            else return 5;
        }
        else {
            if (summ <= 1000) return 10;
            else return 11;
        }
    }

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }
}
