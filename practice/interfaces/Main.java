package practice.interfaces;

public class Main {
    public static void main(String[] args) {
        DeveloperDBService developerDBService = new DeveloperDBService();

        //declaration
        DBService devDBService;

        //initialization
        devDBService = new DeveloperDBService();
        devDBService = new ManagerDBService();
    }
}
