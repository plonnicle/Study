import java.util.LinkedList;
import java.util.Queue;
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

//Summary: Given the root of a binary tree with the root level numbered as 1, children 2, and so on, return the smalles level 'x' such that the sum is the max.
//Approach: If root is null, return 0. Else, add the value of the current node to 
//Solution:
class Solution {
    public int maxLevelSum(TreeNode root) {
        //if(root == null){
        //    return 0;
        //}
        //
        //int result = root.val;
        //
        //Queue<Node> q = new LinkedList<>();
        //q.add(root);
        //while(!q.isEmpty()){
        //    int count = q.size();
        //    int sum = 0;
        //    while(count-- > 0){
        //        Node temp = q.poll();
        //        sum = sum + temp.val;
        //        
        //        if(temp.left != null){
        //            q.add(temp.left);
        //        }if(temp.right != null){
        //            q.add(temp.right);
        //        }
        //    }
        //    
        //    result = Math.max(sum, result);
        //}
        //return result;
    
    
        if(root == null) return 0;
        int maxVal = Integer.MIN_VALUE; // To Store the maximum Value
        int ans = 1; // To Store Final answer
        int level = 1; // keeping track of level
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            int sum = 0;
            for(int i = 0; i < size; i++){
                TreeNode curr = q.poll();
                sum += curr.val;
                if(curr.left != null) q.offer(curr.left);
                if(curr.right != null) q.offer(curr.right);
            }
            if(sum > maxVal){ // updating the answer if found greater
                maxVal = sum;
                ans = level;
            }
            level++;
        }
        return ans;
    }
}
