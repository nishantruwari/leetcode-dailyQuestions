class FindElements {

    public FindElements(TreeNode root) {
        dfs(root,0);
        
    }

    Set<Integer> set=new HashSet<>();
    
    private void dfs(TreeNode root,int val){
        if(root==null){
            return;
        }
        root.val=val;

        set.add(val);

        dfs(root.left,2*val+1);
        dfs(root.right,2*val+2);
    }
    
    public boolean find(int target) {
      return set.contains(target);
        
    }
}


//python 


# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class FindElements(object):

    def __init__(self, root):
        self.vals=set()
        self.dfs(root,0)
        """
        :type root: Optional[TreeNode]
        """
        

    def find(self, target):
        return target in self.vals
        """
        :type target: int
        :rtype: bool
        """
    
    def dfs(self, root, val):
        if not root:
            return

        root.val=val
        self.vals.add(val)
        self.dfs(root.left,val*2+1)
        self.dfs(root.right,val*2+2)   
        


# Your FindElements object will be instantiated and called as such:
# obj = FindElements(root)
# param_1 = obj.find(target)
