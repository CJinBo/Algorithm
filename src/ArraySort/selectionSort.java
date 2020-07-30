package ArraySort;

public class selectionSort {

    public static void selectionSort(int[] arr){
        if (arr == null || arr.length < 2){
            return;
        }

        for (int i = 0; i<arr.length-1; i++){
            int minIndex = i;
            for (int j = i+1; j<arr.length-1;i++){
                minIndex = j<arr[minIndex] ?j: minIndex ;
            }
            swap(arr, i, minIndex);

        }
    }
    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
