public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.setName("laptop");
        product.setId(23);
        product.setDescription("Lenovo");
        product.setPrice(35000);
        product.setStockAmount(44);
        System.out.println(product.getName());

        Productmanager productmanager = new Productmanager();
        productmanager.AddProduct(product);
        System.out.println(product.getKod());

}}