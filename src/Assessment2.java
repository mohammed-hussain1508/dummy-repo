import java.util.Scanner;

public class Assessment2 {
    public static void StringReversal1(){
        System.out.println("IN ASSESSMENT-2.1");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Input String");
        String input = sc.nextLine();
        StringBuilder str = new StringBuilder(input);
        String reversedString = str.reverse().toString();

        System.out.println("Reversed string (Approach 1 - String builder): " + reversedString);
    }


    public static void StringReversal2(){
        System.out.println("IN ASSESSMENT-2.2");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Input String");
        String input = sc.nextLine();
        char[] charArray = input.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }

        String reversedString = new String(charArray);
        System.out.println("Reversed string (Approach 2 using loop): " + reversedString);
    }
}
