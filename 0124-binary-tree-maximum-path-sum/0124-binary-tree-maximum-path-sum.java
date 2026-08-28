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
    int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        helperSum(root);
        return maxSum;
    }
    
    private int helperSum(TreeNode node){
        if(node == null) return 0;
        int left = Math.max(0,helperSum(node.left));
        int right  = Math.max(0,helperSum(node.right));
        maxSum = Math.max(maxSum , right +left + node.val);
        return  node.val + Math.max(left , right);

    } 

   
}