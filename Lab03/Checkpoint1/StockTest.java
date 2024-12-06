public class StockTest {
    public static void main(String[] args) {
        Stock stock1 = new Stock("ORCL", "Oracle Corporation");
        stock1.setPreviousClosingPrice(34.5);
        stock1.setCurrentPrice(34.35);

        System.out.println("Previous Cloing Price: " + stock1.getPreviousClosingPrice());
        System.out.println("Current Price: " + stock1.getCurrentPrice());
        System.out.println("Price Change: " + stock1.getChangePercent(stock1.getPreviousClosingPrice(), stock1.getCurrentPrice()) + "%");
    }
}
