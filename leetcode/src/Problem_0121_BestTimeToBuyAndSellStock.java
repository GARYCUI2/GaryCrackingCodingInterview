public class Problem_0121_BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int min = prices[0];
        int res = 0;

        for (int i = 1; i < prices.length; i++) {
            min = Math.min(prices[i], min);
            res = Math.max(res, prices[i] - min);
        }

        return res;
    }
}
