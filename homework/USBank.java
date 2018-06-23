package homework;

import homework.Bank;

public class USBank extends Bank {

    @Override
    public int getLimitOfWithdrawel() {
        if (getCurrency() == Currency.USD) return 1000;
        else return 1200;
    }

    @Override
    public int getLimitOfFunding() {
        if (getCurrency() == Currency.EUR) return 10000;
        else return 2147483647;
    }

    @Override
    public int getMonthlyRate() {
        if (getCurrency() == Currency.USD) return 1;
        else return 2;
    }

    @Override
    public int getCommission(int summ) {
        if (getCurrency() == Currency.USD){
            if (summ <= 1000) return 5;
            else return 7;
        }
        else {
            if (summ <= 1000) return 6;
            else return 8;
        }
    }

    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }
}
