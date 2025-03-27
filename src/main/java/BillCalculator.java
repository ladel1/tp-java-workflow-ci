import java.util.List;

public class BillCalculator {

    public double calculateTotalBill(List<Article> articles, double discountThreshold, double discountRate) {
        double total = 0;

        for (Article article : articles) {
            total += article.getPrice() * article.getQuantity();
        }

        if (total > discountThreshold) {
            total -= total * discountRate;
        }

        return total;
    }
}

class Article {
    private double price;
    private int quantity;

    public Article(double price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
