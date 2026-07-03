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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        
        if(root==null){
            return list;
        }

        Stack<TreeNode> st=new Stack<>();
        st.push(root);

        while(!st.isEmpty()){
            root=st.pop();
            list.add(root.val);

            //check if root.right exits and if it does push into the stack before left bcs in a staxk the top should be left node as it is LIFO
            if(root.right!=null){
                st.push(root.right);
            }
            //left node check
            if(root.left!=null){
                st.push(root.left);
            }
         
        } 
    return list;
    }
}