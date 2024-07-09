public class SelectionSort {

    //  WORST O(n^2)

    public static void main(String[] args) {
        int nums[] = {6,5,2,8,9,4};
        int size = nums.length;
        int temp = 0;

        int minIndex = -1;
        //In this example we SELECTED Minimum Value (using minIndex)
        //Alternately, we could also SELECT Maximum value - in that case code will change

        // CODE FOR PRINT ONLY
        System.out.println("before selection sorting");
        for (int num : nums){
            System.out.print(num + " ");
        }

        //OUTER LOOP
        for(int i=0; i < size-1; i++){
            minIndex = i;

            //INNER LOOP
            for(int j=i+1; j < size; j++){    //j=i so that when the iteration starts we can skip the first value (first iteration will start with 5)
                if (nums[minIndex] > nums[j]){
                    minIndex = j;           //find the Index of minimum value that is 2
                }
            }

            //SWAPPING IS OUTSIDE INNER LOOP - SO There is lesser SWAPPING
            //SWAPPING OF 6 with minimum value 2
            temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i]= temp;

            // CODE FOR PRINT ONLY
            System.out.println();
            for(int num : nums){
                System.out.print(num + " ");
            }

        }

        // CODE FOR PRINT ONLY
        System.out.println();
        System.out.println("after selection sorting");
        for(int num : nums){
            System.out.print(num + " ");
        }
    }
}
