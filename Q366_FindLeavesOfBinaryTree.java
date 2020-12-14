package Solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q366_FindLeavesOfBinaryTree {
    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    List<List<Integer>> allLeaves = new ArrayList<List<Integer>>();

    public List<List<Integer>> findLeaves(TreeNode root) {
        traverse(root);
        // Collections.reverse(allLeaves);
        return allLeaves;
    }

    public int traverse(TreeNode root){
        if(root==null){
            return -1;
        }

        int leftTraverse = traverse(root.left);
        int rightTraverse = traverse(root.right);

        int currentHeight = Math.max(leftTraverse,rightTraverse)+1;

        if(allLeaves.size() == currentHeight){
            allLeaves.add(new ArrayList<Integer>());
        }

        allLeaves.get(currentHeight).add(root.val);

        return currentHeight;
    }
//
//    //below solution does not represent levels properly, only works for
//    public List<List<Integer>> findLeaves(TreeNode root) {
//        allLeaves.add(new ArrayList<Integer>());
//        traverse(root,0);
//        Collections.reverse(allLeaves);
//        return allLeaves;
//    }
//
//    public void traverse(TreeNode root, int level){
//        if(root.left != null){
//            allLeaves.add(new ArrayList<Integer>());
//            traverse(root.left,level+1);
//        }
//        if(root.right != null){
//            if(allLeaves.get(level)!=null){
//                traverse(root.right,level+1);
//            }else{
//                allLeaves.add(new ArrayList<Integer>());
//            }
//        }
//
//        allLeaves.get(level).add(root.val);
//        // allLeaves.add(root.val);
//    }

}
