package arrays_Day_1;


import java.util.ArrayList;

public class StockBuyAndSell {
	
	public static int maxProfitBruteForce(ArrayList<Integer> prices) {
		int maxProfit = 0;
         for(int i=0;i<prices.size()-1;i++){
             for(int j=i+1;j<prices.size();j++){
                 int diff = prices.get(j) - prices.get(i);
                 maxProfit = Math.max(maxProfit, diff);
             }
         }
         
         return maxProfit;
	}
	
	public static int maxProfitOptimal(ArrayList<Integer> prices) {
		int maxProfit = 0;
		int minPrice = Integer.MAX_VALUE;
        for(int i=0;i<prices.size();i++){
            minPrice = Math.min(minPrice,prices.get(i));

            maxProfit = Math.max(maxProfit,prices.get(i)-minPrice);
            
        }
        return maxProfit;
	}

	public static void main(String[] args) {
		ArrayList<Integer> prices = new ArrayList<>();
		
		prices.add(98);
		prices.add(101);
		prices.add(66);
		prices.add(72);
		
//		int ans = maxProfitBruteForce(prices);
		int ans = maxProfitOptimal(prices);
		System.out.println(ans);
	}

}
