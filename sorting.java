public class sorting {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    // bubble sort
    // public static void main(String args[]) {
    //     int arr[] = { 1, 9, 7, 5, 3 };
    //     for (int i = 0; i < arr.length - 1; i++) {
    //         for (int j = 0; j < arr.length - i - 1; j++) {
    //             if (arr[j] > arr[j + 1]) {
    //                 int temp = arr[j];
    //                 arr[j] = arr[j + 1];
    //                 arr[j + 1] = temp;
    //             }
    //         }
    //     }
    //     printArray(arr);
    // }
    public static void main(String args[]) {
        //selection sort
        int arr[] = { 15, 43, 23, 66, 3 };
        // for (int i = 0; i < arr.length - 1; i++) {
        //     int smallest = i;
        //     for (int j = i + 1; j < arr.length; j++) {
        //         if (arr[smallest] > arr[j]) {
        //             smallest = j;
        //         }
        //     }
        //     int temp = arr[smallest];
        //     arr[smallest] = arr[i];
        //     arr[i] = temp;

        // insertion sort
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        printArray(arr);
    }
}
