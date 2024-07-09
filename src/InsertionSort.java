public class InsertionSort {

    //  BEST O(n)   - if 1 iteration
    //  WORST O(n^2)

    public static void main(String[] args) {
        int nums[] = {5,6,2,3,1,8,4};
        int size = nums.length;

        // CODE FOR PRINT ONLY
        System.out.println("before insertion sorting");
        for (int num : nums){
            System.out.print(num + " ");
        }

        //OUTER LOOP
        for(int i=1; i < size; i++){    //start iteration from "6" and end with end of array

            int key = nums[i];          //we start with index 1 = "6"
            int j = i-1;                // compare "6" with the index 0 = "5"

            //INNER LOOP - WHILE
            while(j>=0 && nums[j]> key){    // if j goes below index O and Index[j] "5" > key : "6"
                //NO SWAPPING - SHIFTING IS DONE FOR INSERTION
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=key;      //j+1 is done as the j goes to -1 due to the j-- in the while loop


            // CODE FOR PRINT ONLY
            System.out.println();
            for(int num : nums){
                System.out.print(num + " ");
            }

        }

        // CODE FOR PRINT ONLY
        System.out.println();
        System.out.println("after insertion sorting");
        for(int num : nums){
            System.out.print(num + " ");
        }
    }
}
