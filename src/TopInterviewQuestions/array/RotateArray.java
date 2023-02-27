package TopInterviewQuestions.array;

import java.util.Arrays;

//https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/646/
public class RotateArray {

    public static void rotate_naive(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            int lastValue = nums[nums.length - 1];
            for (int j = nums.length - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = lastValue;
        }
    }

    public static void rotate(int[] nums, int k) {
        int len = nums.length;
        int shift = k % len;
        int[] result = nums.clone();
        for (int i = 0; i < len; i++) {
            int pos = i + shift;
            if (pos >= len) {
                pos = pos - len;
            }
            nums[pos] = result[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        rotate(arr, 3);
        System.out.println(Arrays.toString(arr)); //[5,6,7,1,2,3,4]

        int[] arr2 = new int[]{1, 2}; //[3,99,-1,-100]
        rotate(arr2, 5);
        System.out.println(Arrays.toString(arr2));

    }
}
