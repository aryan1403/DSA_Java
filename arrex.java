public class arrex {
    public static void main(String[] args) {
        // Array --> Type [String, int, boolean, char]
        int[] arr = new int[5];
        // Range: 0 - 4, size = 5

        // declaration
        int[] arr2;

        // initialisation 
        arr2 = new int[5];

        arr[0] = 5;
        arr[1] = 6;
        arr[2] = 3;
        arr[3] = -1;
        arr[4] = 0;

        // Task1: copy the arr into arr2
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i]; 
            // assign the value of arr element wise
        }

        for (int i : arr2) {
            // System.out.println(i);
        }

        // Task2: create a num array and find the smallest and largest values
        int[] num = new int[10];
        num[0] = 9;
        num[1] = 0;
        num[2] = 8;
        num[3] = 11;
        num[4] = -1;
        num[5] = -16; // smallest
        num[6] = 20; // largest
        num[7] = -2;
        num[8] = 2;
        num[9] = -3;


        // sort --> 0 = smallest, length - 1 = largest
        // track a var and update it
        // min, max functions
        
        int smallest = num[0];
        int largest = num[0];

        for (int i = 0; i < num.length; i++) {
            if(smallest > num[i]) { // true
                smallest = num[i]; // smallest = 0
            } if(largest < num[i]) {
                largest = num[i];
            }
        }

        System.out.println(largest);





        
    }
}