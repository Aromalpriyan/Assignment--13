# Assignement Java - 13
## Question
### <p>1. Given an array of n integers count the number of elements that have at least one elements greater than itself?<p>
## Output
```
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
```
### <p>2. You are given a lower case String A= and you have to tell a count of vowels and consonants?<p>
## Output
```
import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a lowercase string: ");
        String A = sc.nextLine();

        int vowels = 0, consonants = 0;

        for(int i = 0; i < A.length(); i++){
            char ch = A.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    vowels++;
                }else{
                    consonants++;
                }
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consontants: " + consonants);
    }
    
}
```
### <p>3. Given an array check if it is increasing order or not?<p>
## Output
```
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
            if(arr[i] > arr[i+1]){
            return false;
        }
    }
    return true;
}   
}
```
### <p>4. Given an dynamic arr a return an dynamic array which has all unique elements from the given array?<p>
## Output
```
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class UniqueArray {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(4,2,5,3,4,1,5));
        ArrayList<Integer> unique = getUniqueElements(a);
        System.out.println("Original array: " + a);
        System.out.println("Unique elements: " + unique);
    }
    public static ArrayList<Integer> getUniqueElements(ArrayList<Integer> a){
        ArrayList<Integer> result = new ArrayList<>();
        HashSet<Integer> seen = new HashSet<>();

        for(int num : a){
            if (!seen.contains(num)){
                result.add(num);
                seen.add(num);
            }
        }
        return result;
    }
    
}
```
[githublink](https://github.com/Aromalpriyan/Assignment--13)



