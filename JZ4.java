/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        return reConstruct(pre,0,pre.length-1,in,0,in.length-1);
    }
     
    public TreeNode reConstruct(int [] pre,int preS,int preE,int [] in,int inS,int inE){
        //preS==preE和inS==inE时可以继续创建节点
        if(preS > preE || inS > inE) return null;
        //创建根节点
        TreeNode temp = new TreeNode(pre[preS]);
        //在in中找到根节点的位置
        int k = 0;
        while(in[k] != pre[preS]){
            k++;
        }
        //进行递归
        //左子树的长度为k-inS。因为inS在递归参数中是不断变化的。
        temp.left = reConstruct(pre,preS+1,preS+k-inS,in,inS,k-1);
        temp.right = reConstruct(pre,preS+k-inS+1,preE,in,k+1,inE);
        return temp;
    }
}
