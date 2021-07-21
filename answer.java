import java.util.*;

public class answer{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        if(str.length()>20||str.length()<5){
            System.out.println("Invalid Sentence");
        }
        String letters = str.replaceAll("[^A-Za-z]", "");
        String numbers = str.replaceAll("[^0-9]", "");
        // System.out.println(letters);
        // System.out.println(numbers);
        System.out.println("Digits " + numbers.length());
        System.out.println("Letters "+letters.length());

    }
}