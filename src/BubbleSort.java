public class BubbleSort {
    public static void main(String[] args) {
        int nums[] = {6,5,2,8,9,4};
        int size = nums.length;
        int temp = 0;

        // CODE FOR PRINT ONLY
        System.out.println("before bubble sorting");
        for (int num : nums){
            System.out.print(num + " ");
        }

        for(int i=0; i < size; i++){
            for(int j=0; j < size-i-1; j++){    //size-i-1 is done to avoid checking the sorted numbers in the end
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
