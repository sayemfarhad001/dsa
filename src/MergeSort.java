public class MergeSort {

    public static void mergeSort(int[] arr, int l, int r) {

        if(l<r){

            int mid = (l+r)/2;

            mergeSort(arr, l, mid);
            mergeSort(arr, mid+1, r);

            merge(arr, l, mid, r);
        }
    }

    private static void merge(int[] arr, int l, int mid, int r) {
        //array size
        int n1 = mid - l +1;        //Left array
        int n2 = r - mid;           //Right array
        //declare left and right arrays with size
        int lArr[] = new int[n1];
        int rArr[] = new int[n2];

        //For Loop 1 - COPY VALUES Left Array
        for(int x=0; x<n1; x++){
            lArr[x] = arr[l+x];
        }

        //For Lopp 2 - COPY VALUES Right Array
        for(int x=0; x<n2; x++){
            rArr[x] = arr[mid+1+x];
        }

        //MERGING - 3 while loops
        int i = 0;  //First array
        int j = 0;  //Second array
        int k= l;   //Main merged array

        //While Loop 1 - MERGING
        while(i<n1 && j<n2){

            //Compare 5,8,9 vs 1,6,7 and place
            if (lArr[i] <= rArr[j]){
                arr[k] = lArr[i];
                i++;
            } else {
                arr[k] = rArr[j];
                j++;
            }
            k++;
        }

        //Left out values after merge in left array
        while(i<n1){
            arr[k] = lArr[i];
            i++;
            k++;
        }
        //Left out values after merge in right array
        while(j<n2){
            arr[k] = rArr[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,5,1,4,6,2};
//        int arr[] = {8,5,9,1,6,7};
//        int arr[] = {8,57,9,111,6,7,75};

        // CODE FOR PRINT ONLY
        System.out.println("before merge sorting");
        for (int num : arr){
            System.out.print(num + " ");
        }

        //MERGESORT
        mergeSort(arr, 0, arr.length-1);

        // CODE FOR PRINT ONLY
        System.out.println();
        System.out.println("after merge sorting");
        for (int num : arr){
            System.out.print(num + " ");
        }

    }
}
