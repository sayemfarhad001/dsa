package StackADT;

public class Runner {
    public static void main(String[] args) {
        FixedStack nums = new FixedStack();

        System.out.println("Stack - Fixed Array");
        System.out.println("/////////////////////////////////////////////");

        /////////////////////////////////////////////////////////////
        System.out.println("Is stack Empty : " + nums.isEmpty());
        System.out.println("Push - Add form top of the stack");
        nums.push(15);
        nums.push(8);
        nums.push(10);
        nums.show();        //Print

        /////////////////////////////////////////////////////////////
        System.out.println("Size - returns size of the stack");
        System.out.println("size : " + nums.size());
        nums.show();        //Print

        /////////////////////////////////////////////////////////////
        System.out.println("Pop - Delete from top of the stack");
        System.out.println(nums.pop());
        nums.show();        //Print

        /////////////////////////////////////////////////////////////
        System.out.println("Peek - After previous Delete, Peek from top of the stack");
        System.out.println(nums.peek());
        nums.show();        //Print

        /////////////////////////////////////////////////////////////
        System.out.println("isEmpty - returns if stack empty");
        System.out.println("Is stack Empty : " + nums.isEmpty());
        nums.show();        //Print

        /////////////////////////////////////////////
        System.out.println("EMPTY THE STACK");
        System.out.println(nums.pop());
        System.out.println(nums.pop());
        System.out.println(nums.pop());

        //////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////

        DynamicStack nums2 = new DynamicStack();

        System.out.println("/////////////////////////////////////////////");
        System.out.println("/////////////////////////////////////////////");
        System.out.println("Dynamic Stack");
        System.out.println("/////////////////////////////////////////////");
        System.out.println("Is stack Empty : " + nums2.isEmpty());
        System.out.println("/////////////////////////////////////////////");


        /////////////////////////////////////////////////////////////
        System.out.println("Push - Expandable");
        nums2.push(15);
        nums2.show();        //Print
        nums2.push(8);
        nums2.show();        //Print
        nums2.push(10);
        nums2.show();        //Print
        nums2.push(10);
        nums2.show();        //Print
        nums2.push(10);
        nums2.show();        //Print

        System.out.println("Pop - Shrinking");
        nums2.pop();
        nums2.show();        //Print
        nums2.pop();
        nums2.show();        //Print
        nums2.pop();
        nums2.show();        //Print

        //////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////
    }
}
