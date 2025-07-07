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
