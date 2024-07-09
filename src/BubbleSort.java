public class BubbleSort {
    //  WORST O(n^2)

    public static void main(String[] args) {
        int nums[] = {6,5,2,8,9,4};
        int size = nums.length;
        int temp = 0;

        // CODE FOR PRINT ONLY
        System.out.println("before bubble sorting");
        for (int num : nums){
            System.out.print(num + " ");
        }

        //OUTER LOOP
        for(int i=0; i < size; i++){

            //INNER LOOP
            for(int j=0; j < size-i-1; j++){    //size-i-1 is done to avoid checking the sorted numbers in the end

                //SWAPPING IS INSIDE INNER LOOP - SO There is more SWAPPING
                if (nums[j] > nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1]= temp;
                }
            }

            // CODE FOR PRINT ONLY
            System.out.println();
            for(int num : nums){
                System.out.print(num + " ");
            }
        }

        // CODE FOR PRINT ONLY
        System.out.println();
        System.out.println("after bubble sorting");
        for(int num : nums){
            System.out.print(num + " ");
        }
    }
}
