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
    public int countNodes(TreeNode root,int max){
    int count = 0;
    if(root==null) return 0;
      if(root.val>=max)
      {
        count++;
        max = root.val;
      }
      return count + countNodes(root.left,max)+countNodes(root.right,max);
    }
    public int goodNodes(TreeNode root) {
        int[] max = new int[1];
        max[0] = Integer.MIN_VALUE;
        if(root==null) return 0;
        return countNodes(root,max[0]);
        
        
    }
}
