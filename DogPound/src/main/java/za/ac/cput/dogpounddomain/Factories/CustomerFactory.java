package za.ac.cput.dogpounddomain.Factories;

public class CustomerFactory {
    //singleton
    private static CustomerFactory instance=null;

    public CustomerFactory(){}

    public static CustomerFactory getInstance(){
        if (instance == null) {
            instance = new CustomerFactory();
        }
        return instance;
    }

}
