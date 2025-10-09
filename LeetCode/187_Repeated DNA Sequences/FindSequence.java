package Leetcode.fokus.strings.str_repeatedDNASequence;

    // 187. Repeated DNA Sequences

import java.util.*;

public class FindSequence {
    public List<String> findRepeatedDnaSequences(String s) {
        // Constraints
        if(s.length()<=10|| s.length()>10000){
            return new ArrayList<>();
        }

        Set<String> set = new HashSet<>();
        Set<String> result = new HashSet<>();

        for(int i = 0; i <= s.length()-10; i++){
            String sub = s.substring(i, i+10);
            if(set.contains(sub)){
                result.add(sub);
            }else{
                set.add(sub);
            }
        }
        // converting to Arraylist is faster than checking for doubles everytime
        return result.stream().toList();
    }

    static void print(List<String> list){
        for(String s:list){
            System.out.println(s);
        }
        System.out.println("----");
    }

    public static void main(String[] args) {
        FindSequence fs = new FindSequence();

        print(fs.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"));
        print(fs.findRepeatedDnaSequences("AAAAAAAAAAAAA"));
        print(fs.findRepeatedDnaSequences(""));
        print(fs.findRepeatedDnaSequences("AAAAAAAAA"));
    }
}
