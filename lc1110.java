class Solution {
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        Set<Integer> set=new HashSet<>();
        for(int i: to_delete){
            set.add(i);
        }
        List<TreeNode> ans=new ArrayList<>();
        
        if(!set.contains(root.val)) ans.add(root);
        traverse(root,set,null,ans,false);
        return ans;

        
    }
    private void traverse(TreeNode root,Set<Integer> set,TreeNode parent,List<TreeNode> ans,Boolean isLeft){
        if (root==null) return ;
        
        if(set.contains(root.val)){
            if(parent!=null){
                if(isLeft){
                    parent.left=null;
                }else{
                    parent.right=null;
                }
            }
            if(root.left!=null && !set.contains(root.left.val)){
                ans.add(root.left);
            }
            if(root.right!=null && !set.contains(root.right.val)){
                ans.add(root.right);
            }
        }
        traverse(root.left,set,root,ans,true);
        traverse(root.right,set,root,ans,false);
    }
}