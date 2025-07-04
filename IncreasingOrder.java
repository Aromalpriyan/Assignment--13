public class IncreasingOrder {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,8};

        if (isIncreasing(arr)) {
            System.out.println("The array is in increasing order.");    
        }else{
            System.out.println("The array is not in increasing order.");
        }
    }
    public static boolean isIncreasing(int[] arr){
        for (int i = 0 ; i < arr.length-1 ; i++){
// if current element is greater than the next one,it's not increasing
            if(arr[i] > arr[i+1]){
            return false;
        }
    }
// all elements were in increasing order
    return true;
}   
}
