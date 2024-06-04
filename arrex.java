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
            System.out.println(i);
        }

        
    }
}