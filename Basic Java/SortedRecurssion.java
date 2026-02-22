public class SortedRecurssion {
    
    public static Boolean sorted(int[] arr, int num){
        
        if(num == arr.length-1){
            return true;
        }

        if(arr[num] < arr[num+1]){
            return sorted(arr, num+1);
        }else{
            return false;
        }
        
    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,3,10};
        System.out.println(sorted(arr, 0));
    }
}
