public class Search {
    public static void main(String[] args) {
        int nums[] = {5,7,9,11,13};
        int target = 11;

//        int result = binarySearch(nums, target);
        int result = recursiveBinarySearch(nums, target, 0, nums.length-1);
        if(result != -1) {
            System.out.println("Element found at Index : " + result);
        } else {
            System.out.println("Element not found");
        }

    }

    //SLOW - DO NOT USE
    public static int linearSearch(int[] nums, int target){
        for(int i=0; i < nums.length; i++){
            if(nums[i]== target){
                return i;
            }
        }

        return -1;
    }

    //SLOW - DO NOT USE
    public static int binarySearch(int[] nums, int target){
        int left = 0;
        int right = nums.length-1;

        while (left <= right){
            int mid = (left+right)/2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target){
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
        return -1;
    }

    //BETTER - USE
    public static int recursiveBinarySearch(int[] nums, int target, int left, int right){
//        int left = 0;
//        int right = nums.length-1;


        if (left <= right){
            int mid = (left+right)/2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target){
                return recursiveBinarySearch(nums, target, mid+1, right);
            } else {
                return recursiveBinarySearch(nums, target, left, mid-1);
            }
        }

//        while (left <= right){
//            int mid = (left+right)/2;
//            if (nums[mid] == target) {
//                return mid;
//            } else if (nums[mid] < target){
//                left = mid+1;
//            } else {
//                right = mid-1;
//            }
//        }
        return -1;
    }
}

