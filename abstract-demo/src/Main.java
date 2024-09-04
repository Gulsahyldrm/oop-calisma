public class Main {
    public static void main(String[] args) {

        /*
        NullPointerException fırlatır bu şekilde >>

        CustomerManager customerManager = new CustomerManager();
        customerManager.getCustomers();

         */

        CustomerManager customerManager = new CustomerManager();
        customerManager.databaseManager = new OracleDatabaseManager();
        customerManager.getCustomers();

        // Daha sonra müsteri veri tabanını değiştirir veya yeni bir şey eklerse tek yapman gereken
        // eklenen veri tabanını new 'lemek
        //aşağıdaki gibi >>

        CustomerManager customerManager2 = new CustomerManager();
        customerManager2.databaseManager = new SplServerDatabaseManager();
        customerManager2.getCustomers();
    }
}