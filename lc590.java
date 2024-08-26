class Solution {
    public void dfs(Node root,List<Integer> list){
        if(root==null) return;
        for(Node child: root.children){
            dfs(child,list);
        }
        list.add(root.val);
    }
    public List<Integer> postorder(Node root) {
        List<Integer> list=new ArrayList<>();
        dfs(root,list);
        return list;

        
    }
}
