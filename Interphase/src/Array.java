public class Array {

    public static void main(String[] args) {
        int[] numbersArray = new int[10];
        numbersArray[0] = 17;
        numbersArray[1] = 45;
        numbersArray[2] = 54;
        numbersArray[3] = 39;
        numbersArray[4] = 47;


        System.out.println("Original array:");
        for (int i = 0; i < numbersArray.length; i++) {
            System.out.println(numbersArray[i]);
        }


        System.out.println("Reversed array:");
        for (int i = numbersArray.length - 1; i >= 0; i--) {
            System.out.println(numbersArray[i]);
        }
    }
}
