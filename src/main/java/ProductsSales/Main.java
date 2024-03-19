package ProductsSales;

public class Main {
    public static void main(String[] args) {
        InputReader inputReader = new InputReader();

        Product product = inputReader.readProduct();
        int saleQuantity = inputReader.readSaleQuantity();
        ISaleMethod saleMethod = inputReader.readSaleMethod();

        ProductSale productSale = new ProductSale(product, saleMethod);
        productSale.sellProduct(saleQuantity);
    }
}
