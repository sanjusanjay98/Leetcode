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
class Solution {
    private List<Integer> list = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        inOrder(root, list);
        Collections.sort(list);
        return list.get(k - 1);
    }
    public void inOrder(TreeNode root, List<Integer> li) {
        if (root == null)
            return;
        inOrder(root.left, li);
        li.add(root.val);
        inOrder(root.right, li);
    }
}