//////将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
//////
////// 
//////
////// 示例 1： 
//////
////// 
//////输入：l1 = [1,2,4], l2 = [1,3,4]
//////输出：[1,1,2,3,4,4]
////// 
//////
////// 示例 2： 
//////
////// 
//////输入：l1 = [], l2 = []
//////输出：[]
////// 
//////
////// 示例 3： 
//////
////// 
//////输入：l1 = [], l2 = [0]
//////输出：[0]
////// 
//////
////// 
//////
////// 提示： 
//////
////// 
////// 两个链表的节点数目范围是 [0, 50] 
////// -100 <= Node.val <= 100 
////// l1 和 l2 均按 非递减顺序 排列 
////// 
////// Related Topics 递归 链表 👍 2284 👎 0
////
//

import java.util.ArrayList;
import java.util.List;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
public class MergeTwoSortedLists {
    public static void main(String[] args) {
        Solution solution = new MergeTwoSortedLists().new Solution();
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        solution.mergeTwoLists(list1, list2);
    }

    //leetcode submit region begin(Prohibit modification and deletion)


    class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            if (list1 == null && list2 == null) {
                return null;
            }

            if (list1 == null) return list2;
            if (list2 == null) return list1;

            List<Integer> list = new ArrayList<>();
            list.add(list1.val);
            list.add(list2.val);

            ListNode node = list1.next;
            while (node != null) {
                list.add(node.val);
                node = node.next;
            }
            node = list2.next;
            while (node != null) {
                list.add(node.val);
                node = node.next;
            }

            list.sort(Integer::compare);
            ListNode result = new ListNode(list.get(0));
            ListNode next = new ListNode(list.get(1));
            result.next = next;
            for (int i = 2; i < list.size(); i++) {
                ListNode next1 = new ListNode(list.get(i));
                next.next = next1;
                next = next1;
            }
            return result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}