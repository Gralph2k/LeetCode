package Easy;

import java.util.Arrays;

public class Ex724_FindPivotIndex {
    public static int pivotIndex(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        int leftSum = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (leftSum == sum-leftSum-nums[i]) {
                return i;
            }
            leftSum+=nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[] {1,7,3,6,5,6})); //3
        System.out.println(pivotIndex(new int[] {1,2,3})); //-1
        System.out.println(pivotIndex(new int[] {2,1,-1})); //0
    }
}
