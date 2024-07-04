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

//Summary: Given 'root' of a binary tree, return the maximum depth, the number of nodes along the longest path from teh root node to the farthest leaf node, as an int. 
//Approach: Do a tree traversal (check left and right node and use recursion) then keep a running total of the maximum depth. Check the maximum depth number against the current depth number. If the current depth number is greater than the maximum, update it. RETURN the max depth.
//Solution:
class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }else{
            int lDepth = maxDepth(root.left);
            int rDepth = maxDepth(root.right);
            
            if(lDepth > rDepth){
                return lDepth +1;
            }else{
                return rDepth +1;
            }
        }
    }
}
