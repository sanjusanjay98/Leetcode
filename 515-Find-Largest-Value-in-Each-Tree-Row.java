/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
// class Solution {
//     private List<Integer> result;
//     public List<Integer> largestValues(TreeNode root) {
//         result = new ArrayList<>();
//         dfs(root, 0);
//         return result;
//     }

//     public void dfs(TreeNode root, int level) {
//         if(root != null) {
//             int val = root.val;
//             if(result.size() == level)
//                 result.add(val);
//             else
//                 result.set(level, Math.max(result.get(level), val));
//             dfs(root.left, level+1);
//             dfs(root.right, level+1);
//         }
//     }
// }

class Solution {
    List<Integer> ans;
    public List<Integer> largestValues(TreeNode root) {
        ans = new ArrayList<>();
        dfs(root, 0);
        return ans;
    }

    private void dfs(TreeNode node, int l) {
        if(node != null) {
            int v = node.val;
            if(l == ans.size()) {
                ans.add(v);
            } else {
                ans.set(l, Math.max(ans.get(l), v));
            }
            dfs(node.left, l + 1);
            dfs(node.right, l + 1);
        }
    }
}