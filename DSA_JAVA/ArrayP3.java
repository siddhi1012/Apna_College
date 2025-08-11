public class ArrayP3 {
    public static int BuySell(int num []){
        int Buyprice= num[0];
        int maxPrice= 0;
        for(int i=0; i<num.length; i++){
            if(Buyprice < num [i]){
               int profit = num[i] - Buyprice;
               maxPrice = Math.max(maxPrice,profit);
            }else{
                Buyprice = num[i];
            }
        }
        return maxPrice;

    } 
    public static void main(String[] args) {
        int num[] = {7,6,4,3,1};
        System.out.println(BuySell(num));
    }
    
}
