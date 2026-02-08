import java.util.*;
import java.util.stream.Collectors;

class Sale {
    int productId;
    int quantity;
    double price;

    public Sale(int productId, int quantity, double price) {
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}

class ProductSales {
    int productId;
    double totalRevenue;

    public ProductSales(int productId, double totalRevenue) {
        this.productId = productId;
        this.totalRevenue = totalRevenue;
    }

    public double getTotalRevenue() {
        return totalRevenue;
    }

    @Override
    public String toString() {
        return "ProductId: " + productId + ", Revenue: " + totalRevenue;
    }
}

public class ProductSalesAnalysis {

    public static void main(String[] args) {

        List<Sale> sales = Arrays.asList(
                new Sale(101, 15, 100),
                new Sale(102, 8, 200),
                new Sale(103, 20, 50),
                new Sale(104, 12, 150),
                new Sale(105, 25, 80),
                new Sale(106, 30, 60)
        );

        List<ProductSales> topProducts =
                sales.stream()
                        .filter(s -> s.getQuantity() > 10)
                        .map(s -> new ProductSales(
                                s.getProductId(),
                                s.getQuantity() * s.getPrice()
                        ))
                        .sorted(Comparator.comparingDouble(ProductSales::getTotalRevenue).reversed())
                        .limit(5)
                        .collect(Collectors.toList());

        System.out.println("Top 5 Products by Revenue:");
        topProducts.forEach(System.out::println);
    }
}
