public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.name="laptop";
        product.id = 23;
        product.description = "Lenovo";
        product.price = 35000;
        product.stockAmount = 44;
        System.out.println(product.name);

        Productmanager productmanager = new Productmanager();
        productmanager.AddProduct(product);
    }
}