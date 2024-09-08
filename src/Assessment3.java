public class Assessment3 {

    public static void SecondLargest() {

        int[] arr = {6, 4, 11, 21, 12, 13, 6};
        int largest = 0;
        int secondLargest = 0;

        for (int num : arr) {
            if (largest == 0 || num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num != largest && (secondLargest == 0 || num > secondLargest)) {
                secondLargest = num;
            }
        }

        System.out.println("The second largest number is: " + secondLargest);



    }
}





