package strings.str_longestCommonPrefix;

/**
 * TaskId: 14
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 *
 * Constraints:
 * 1 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] consists of only lowercase English letters if it is non-empty.
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){return "";}
        if(strs.length == 1){return strs[0];}
        String prefix = strs[0];

        // check if prefix starts at index 0, trim by one until it fits.
        for(int i = 1; i < strs.length; i++){
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length()-1);
                if(prefix.isEmpty()){return "";}
            }
        }
        return prefix;
    }
}
