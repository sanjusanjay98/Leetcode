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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        inOrder(root1, list);
        inOrder(root2, list);
        Collections.sort(list);
        return list;

    }
    public void inOrder(TreeNode root, List<Integer> li) {
        if (root == null)
            return;
        inOrder(root.left, li);
        li.add(root.val);
        inOrder(root.right, li);
    }
}