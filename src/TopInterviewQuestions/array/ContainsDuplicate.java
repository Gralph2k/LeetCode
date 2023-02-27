package TopInterviewQuestions.array;

import java.util.Arrays;
import java.util.HashSet;
//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/578/

public class ContainsDuplicate {
    public static boolean containsDuplicateNaive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (set.contains(i)) {
                return true;
            } else {
                set.add(i);
            }
        }
        return false;
    }

    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 4, 10, 6}));
    }
}
