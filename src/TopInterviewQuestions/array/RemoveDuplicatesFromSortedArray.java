package TopInterviewQuestions.array;

import java.util.Arrays;

//https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/727/
public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int index = 0;
        for (int i=1; i<nums.length; i++) {
            if (nums[index]!=nums[i]) {
                index++;
                nums[index]=nums[i];
            }
        }
        return index+1;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1,1,2})); //[1,2,_] 2
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4})); //[0,1,2,3,4,_,_,_,_,_] 5
    }
}
