package slidingWIndow;

public class BestTimeToBuyAndSelStocks {

    public static int maxProfit(int[] prices) {

        int minPrice = prices[0];
        int maxProfit = 0;
        int profit;

        for (int i = 1; i < prices.length; i++) {

            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }

            profit = prices[i] - minPrice;
            if (profit > maxProfit) {
                maxProfit = profit;
            }

        }

        return maxProfit;
    }

    public static void main(String[] args) {

        int[] arr1 = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(arr1));

        int[] arr2 = {7, 6, 4, 3, 1};
        System.out.println(maxProfit(arr2));
    }

}
