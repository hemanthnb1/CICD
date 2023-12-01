public class BubbleSort {

    public static  void bubbleSort(int arr[]){
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    // Swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false)
                break;
        }
    }

    public static void main(String[] args) {
        int arr[]={9,8,7,6,2,3,4,5,6,0,9,8,7,6};
        bubbleSort(arr);
        System.out.println(arr);
    }
}
