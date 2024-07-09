public class QuickSort {

    //  BEST O(n logn), - Only one loop & we are doing Partitions of it (so they can run parallel)
    //  WORST O(n^2)
    public static void quickSort(int[] arr, int low, int high) {
        if (low<high){

            int pi = partition(arr, low, high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi +1, high);
        }
    }

    private static int partition(int[] arr, int low, int high){
        int pivot = arr[high];               //always assume pivot to be the last index of the array OR sub-array - in our case 4
        int i = low-1;

        //ONLY ONE LOOP
        for(int j = low; j<high; j++){  //start j with index 0 and i with index -1
            if (arr[j] < pivot){
                i++;
                //SWAP arr[i] with arr [j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] =  temp;
            }
        }
        //SWAP arr[i+1] with arr[high]
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] =  temp;

        return i+1;     //this refers to the pivot
    }
    public static void main(String[] args) {
//        int arr[] = {5,6,2,3,1,8,4};
        int arr[] = {5,62,2,3,111,81,4};

        // CODE FOR PRINT ONLY
        System.out.println();
        System.out.println("before quick sorting");
        for(int num : arr){
            System.out.print(num + " ");
        }

        //SORT
        quickSort(arr,0, arr.length-1);


        // CODE FOR PRINT ONLY
        System.out.println();
        System.out.println("after quick sorting");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
