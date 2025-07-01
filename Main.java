public class Main {
    public static void main(String[] args) {
        int[] arr = {3,1,4,5,4,2};

        int max = arr[0];
        int maxcount = 0;

        for (int num:arr){
            if(num>max){
                max=num;
            }
        }
         for (int num:arr){
            if(num==max){
                maxcount++;
            }
         }

        int result = arr.length-maxcount;
            System.out.println("Number of elements with at least one element greater " + result);
    }
}
