package practice.interfaces;

import practice.abstractclassesandmethods.DeveloperEmployee;

public class DeveloperDBService implements DBService, Test {
    @Override
    public void save(DeveloperEmployee employee) {
        //
    }

    @Override
    public DeveloperEmployee get(long id) {
        return null;
    }

    @Override
    public void update(DeveloperEmployee employee) {
        //
    }

    @Override
    public DeveloperEmployee[] getAllDevelopers() {
        return new DeveloperEmployee[0];
    }

    @Override
    public void test() {

    }
}
