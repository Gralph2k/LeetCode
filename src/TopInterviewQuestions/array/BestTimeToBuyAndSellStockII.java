package TopInterviewQuestions.array;

//https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/564/
public class BestTimeToBuyAndSellStockII {
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        Integer curPrice = null;
        for (int i = 0; i < prices.length-1; i++) {
            if ((prices[i] < prices[i + 1]) && (curPrice == null)) {
                curPrice = prices[i]; //Buy
            } else if ((prices[i] > prices[i + 1]) && (curPrice != null)) {
                maxProfit += prices[i]-curPrice; //Sell
                curPrice = null;
            }
           // System.out.println(String.format("i=%d curPrice=%d maxProfit=%d", i, curPrice, maxProfit));
        }
        if (curPrice!=null) {
            maxProfit+= prices[prices.length-1]-curPrice;
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4})); //7
        System.out.println(maxProfit(new int[]{1,2,3,4,5})); //4

        System.out.println(maxProfit(new int[]{7,6,4,3,1})); //0
    }
}
