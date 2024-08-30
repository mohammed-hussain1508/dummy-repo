public class Assessment3 {

    public static void SecondLargest() {

        int[] arr = {6, 4, 11, 21, 12, 13, 6};
        Integer largest = null;
        Integer secondLargest = null;

        for (int num : arr) {
            if (largest == null || num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num != largest && (secondLargest == null || num > secondLargest)) {
                secondLargest = num;
            }
        }

        System.out.println("The second largest number is: " + secondLargest);



    }
}





