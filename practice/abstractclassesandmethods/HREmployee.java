package practice.abstractclassesandmethods;

public class HREmployee extends Employee {
    @Override
    void paySalary() {
        double k = 1.1;
        balance += salary * k;
    }
}
