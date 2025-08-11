public class Buy_Sell_Stock {
    public static int BuySellStock(int price[]){
        int BuyPrice = Integer.MAX_VALUE;
        int maxPrice = 0;
        for(int i=0; i<price.length; i++){
            if(BuyPrice < price[i]){
                int profit = price[i] - BuyPrice;
                maxPrice = Math.max(maxPrice,profit);
            }
            else{
                BuyPrice = price[i];
            }
        }
        return maxPrice;

    }
     public static void main(String[] args) {
        int price[]={ 7,1,5,3,6,4};
        System.out.println(BuySellStock(price));
        
     }
    
}
