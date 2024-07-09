public class SelectionSort {
    public static void main(String[] args) {
        int nums[] = {6,5,2,8,9,4};
        int size = nums.length;
        int temp = 0;
        int minIndex = -1;

        // CODE FOR PRINT ONLY
        System.out.println("before sorting");
        for (int num : nums){
            System.out.print(num + " ");
        }

        for(int i=0; i < size-1; i++){
            minIndex = i;
            for(int j=i+1; j < size; j++){    //j=i so that when the iteration starts we can skip the first value (first iteration will start with 5)
                if (nums[minIndex] > nums[j]){
                    minIndex = j;           //find the Index of minimum value that is 2
                }
            }
            //SWAPPING OF 6 with minimum value 2
            temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i]= temp;
//            temp = nums[j];
//            nums[j] = nums[j+1];
//            nums[j+1]= temp;

            // CODE FOR PRINT ONLY
            System.out.println();
            for(int num : nums){
                System.out.print(num + " ");
            }


        }

        // CODE FOR PRINT ONLY
        System.out.println();
        System.out.println("after sorting");
        for(int num : nums){
            System.out.print(num + " ");
        }
    }
}
