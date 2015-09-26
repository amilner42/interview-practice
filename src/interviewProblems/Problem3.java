package interviewProblems;

public class Problem3 {

    public static void main(String[] args) {

        int[] data1 = new int[]{};
        int[] data2 = new int[]{1};
        int[] data3 = new int[]{1, 10};
        int[] data4 = new int[]{1, 10, 2, 3, 8, 7, 1, 5, 9, 12, 5};
        int[] data5 = new int[]{10, 7, 5, 2, 1};
        int[] data6 = new int[]{50, 1, 40};


        try {
            System.out.println(bestStockTrade(data1));
        } catch (NotEnoughStockPricesException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(bestStockTrade(data3));
            System.out.println(bestStockTrade(data4));
            System.out.println(bestStockTrade(data5));
            System.out.println(bestStockTrade(data6));
        } catch(Exception e) {
            System.out.println("Should not be seeing this!!");
        }
    }

    // O(n) speed
    // O(1) memory
    private static int bestStockTrade(int[] stockPrices) throws NotEnoughStockPricesException {

        if (stockPrices.length < 2) {
            throw new NotEnoughStockPricesException("You need more stock prices, you only entered " + stockPrices.length);
        }

        int bestSale = Integer.MIN_VALUE;            // start at the lowest possible value
        int currentMinimum = stockPrices[0];

        for (int i = 1; i < stockPrices.length; i++) {
            if (stockPrices[i] - currentMinimum > bestSale) {
                bestSale = stockPrices[i] - currentMinimum;
            }
            if (stockPrices[i] < currentMinimum) {
                currentMinimum = stockPrices[i];
            }
        }

        return bestSale;
    }
}

// I make this exception a checked exception because you can deal with it easily
class NotEnoughStockPricesException extends Exception {

    public NotEnoughStockPricesException(String info) {
        super(info);
    }
}