package TopInterviewQuestions.array;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/549/
public class SingleNumber {

    public static int singleNumber(int[] nums) {
        return Arrays.stream(nums)
                .boxed()
                .parallel()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .parallel()
                .filter(k -> k.getValue() == 1)
                .findAny().get()
                .getKey();
    }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{4, 1, 2, 1, 2}));
    }


}
