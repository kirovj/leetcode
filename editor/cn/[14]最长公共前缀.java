//编写一个函数来查找字符串数组中的最长公共前缀。 
//
// 如果不存在公共前缀，返回空字符串 ""。 
//
// 
//
// 示例 1： 
//
// 
//输入：strs = ["flower","flow","flight"]
//输出："fl"
// 
//
// 示例 2： 
//
// 
//输入：strs = ["dog","racecar","car"]
//输出：""
//解释：输入不存在公共前缀。 
//
// 
//
// 提示： 
//
// 
// 1 <= strs.length <= 200 
// 0 <= strs[i].length <= 200 
// strs[i] 仅由小写英文字母组成 
// 
// Related Topics 字符串 👍 2113 👎 0


import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String longestCommonPrefix(String[] strs) {
        char[] chars = strs[0].toCharArray();
        List<Character> prefix = new ArrayList<>();
        for (char c : chars) {
            prefix.add(c);
        }
        int end = prefix.size();
        for (int i = 1; i < strs.length; i++) {
            if (end == 0) {
                return "";
            }
            String str = strs[i];
            int len = str.length();
            for (int j = 0; j < end; j++) {
                if (j >= len) {
                    end = j;
                    break;
                }
                char c = prefix.get(j);
                if (c != str.charAt(j)) {
                    end = j;
                    break;
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < end; i++) {
            stringBuilder.append(prefix.get(i));
        }
        return stringBuilder.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)
