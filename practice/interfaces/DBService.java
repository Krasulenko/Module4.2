package practice.interfaces;

import practice.abstractclassesandmethods.DeveloperEmployee;

public interface DBService {
    //void test ();
    //void method (int a, int b, String name);
    //
    //

    void save(DeveloperEmployee employee);

    DeveloperEmployee get(long id);

    void update(DeveloperEmployee employee);

    DeveloperEmployee[] getAllDevelopers();
}
