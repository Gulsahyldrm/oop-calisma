public class CustomerManager {

    //BU ŞEKİLDE KULLAN >>

    BaseDatabaseManager databaseManager;

    public void getCustomers(){

        databaseManager.getData();


        /*
        SAKIN BÖYLE KULLANMA!
        SOLID prensiplerindeki Open closed 'a aykırı hareket etmiş olursun daha sonraki geliştirmelerde
        yeni bir şey eklemeyi, değiştirmeyi zorlaştırırsın çünkü bu şekilde bağımlı hale getiririsin

        OracleDatabaseManager oracleDatabaseManager = new OracleDatabaseManager();
        oracleDatabaseManager.getData();
         */
    }
}
