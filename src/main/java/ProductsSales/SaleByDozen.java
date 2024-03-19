package ProductsSales;

public class SaleByDozen implements ISaleMethod {
    @Override
    public double getSalePrice(Product product, int saleQuantity) {
        if (validateQuantity(product, saleQuantity)) {
            product.setStockQuantity(product.getStockQuantity() - saleQuantity);
            return (product.getPrice() * 10) * ((double)saleQuantity / 12);
        }
        System.out.println("The product cannot be sold. There is not enough quantity in stock");
        return 0;
    }

    public boolean validateQuantity(Product product, int saleQuantity) {
        return product.getStockQuantity() >= saleQuantity;
    }
}
