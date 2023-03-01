package TopInterviewQuestions.array;

import java.util.*;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/674/
public class IntersectionofTwoArrays {
    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int pos1 = 0;
        int pos2 = 0;
        while ((pos1 < nums1.length) && (pos2 < nums2.length)) {
            if (nums1[pos1] == nums2[pos2]) {
                result.add(nums1[pos1]);
                pos1++;
                pos2++;
            } else if (nums1[pos1] < nums2[pos2]) {
                pos1++;
            } else {
                pos2++;
            }
            //      System.out.println(String.format("%d %d %s", pos1, pos2, result.toString()));
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }


    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));

        nums1 = new int[]{4, 9, 5};
        nums2 = new int[]{9, 4, 9, 8, 4};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));

        nums1 = new int[]{1, 2, 2, 1};
        nums2 = new int[]{2};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }


}
