public class BinarySearch {
    public static int binarySearch(int n[],int key){
        int start=0,end=n.length-1;
        while( start <= end){
            int mid=(start + end)/2;
            if(n[mid]==key){
                return mid;
            }
            if(n[mid]<key){
                start= mid + 1;
            }else{
                end= mid - 1;
            }
        }  
        return -1;
    }
    public static void main(String[] args) {
        int n[]={2,4,6,8,10,12,14};
        int key=14;
        System.out.println("Key found at Index:"+binarySearch(n, key));
    }
    
}
