package Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Ex383_RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<String, Integer> map = new HashMap<>();
        Arrays.stream(magazine.split(""))
                .forEach(s -> map.put(s, map.getOrDefault(s, 0) + 1));
        for (String st:ransomNote.split("")) {
            if (map.getOrDefault(st,0).equals(0)){
                return false;
            } else {
                map.replace(st, map.get(st)-1);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("a","b"));
        System.out.println(canConstruct("aa","ab"));
        System.out.println(canConstruct("aa","aab"));
    }
}
