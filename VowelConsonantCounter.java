import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a lowercase string: ");
        String A = sc.nextLine();

        int vowels = 0, consonants = 0;

        for(int i = 0; i < A.length(); i++){
            char ch = A.charAt(i);
        // check if character is a letter
            if(ch >= 'a' && ch <= 'z'){
        // check for vowels
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
