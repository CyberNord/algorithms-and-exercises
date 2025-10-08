package Leetcode.ProgrammingSkills.Basic.str_MergeStringsAlternatively;

//1768. Merge Strings Alternately

public class MergeAlternatively {
    public String mergeAlternately(String word1, String word2) {

        int n1 = word1.length();
        int n2 = word2.length();
        int n = Math.max(n1,n2);


        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (i < n1) sb.append(word1.charAt(i));
            if (i < n2) sb.append(word2.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        MergeAlternatively mergeStr = new MergeAlternatively();

        String out1 = mergeStr.mergeAlternately("abc","pqr");
        System.out.println(out1.equals("apbqcr"));

        String out2 = mergeStr.mergeAlternately("ab","pqrs");
        System.out.println(out2.equals("apbqrs"));

        String out3 = mergeStr.mergeAlternately("abcd","pq");
        System.out.println(out3.equals("apbqcd"));

        String out4 = mergeStr.mergeAlternately("","");
        System.out.println(out4.isEmpty());

        String out5 = mergeStr.mergeAlternately("word","");
        System.out.println(out5.equals("word"));

        String out6 = mergeStr.mergeAlternately("","word");
        System.out.println(out6.equals("word"));
    }
}
