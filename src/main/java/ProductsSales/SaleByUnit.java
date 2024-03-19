package ProductsSales;

public class SaleByUnit implements ISaleMethod{
    @Override
    public double getSalePrice(Product product, int saleQuantity) {
        if (validateQuantity(product, saleQuantity)) {
            product.setStockQuantity(product.getStockQuantity() - saleQuantity);
            return product.getPrice() * saleQuantity;
        }
        System.out.println("The product cannot be sold. There is not enough quantity in stock");
        return 0;
    }

    public boolean validateQuantity(Product product, int saleQuantity) {
        return product.getStockQuantity() >= saleQuantity;
    }
}
