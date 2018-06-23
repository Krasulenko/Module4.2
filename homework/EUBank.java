package homework;

import homework.Bank;

public class EUBank extends Bank {

    @Override
    public int getLimitOfWithdrawel() {
        if (getCurrency() == Currency.USD) return 2000;
        else return 2200;
    }

    @Override
    public int getLimitOfFunding() {
        if (getCurrency() == Currency.USD) return 10000;
        else return 20000;
    }

    @Override
    public int getMonthlyRate() {
        if (getCurrency() == Currency.USD) return 0;
        else return 1;
    }

    @Override
    public int getCommission(int summ) {
        if (getCurrency() == Currency.USD) {
            if (summ <= 1000) return 5;
            else return 7;
        }
        else {
            if (summ <= 1000) return 2;
            else return 4;
        }
    }

    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }
}
