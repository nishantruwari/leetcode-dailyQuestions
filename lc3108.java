public class DSU{
    int[] rank;
    int [] parent;

    DSU(int n){
        this.rank=new int[n];
        this.parent=new int[n];
        for(int i=0;i<n;i++){
            parent[i]=i;
        }
    }

    public int findRootParent(int node){
        if(node==parent[node]){
            return node;
        }

        parent[node]=findRootParent(parent[node]);
        return parent[node];

    }

    public void unionByRank(int node1,int node2 ){
        int root1=findRootParent(node1);
        int root2=findRootParent(node2);

        if(root1==root2){
            return;
        }

        if(rank[root1] >rank[root2]){
            parent[root2]=root1;
            //rank[root1]++;

        }else if(rank[root1] <rank[root2]){
            parent[root1]=root2;
           // rank[root2]++;

        }else{
            parent[root2]=root1;
            rank[root1]++;

        }
    }
}
class Solution {
    public int[] minimumCost(int n, int[][] edges, int[][] query) {
        DSU dsu =new DSU(n);
        for(int[] edge: edges){
            dsu.unionByRank(edge[0],edge[1]);
        }
        int[] compCost=new int[n];
        Arrays.fill(compCost,Integer.MAX_VALUE);

        for(int[] edge: edges){
            int rootParent=dsu.findRootParent(edge[0]);
            compCost[rootParent]=compCost[rootParent] & edge[2];
        }

        int m=query.length;
        int[] res=new int[m];
        for(int i=0;i<m;i++){
            int rootParent1=dsu.findRootParent(query[i][0]);
            int rootParent2=dsu.findRootParent(query[i][1]);

            if(rootParent1!=rootParent2){
                res[i]=-1;
            }else{
                res[i]=compCost[rootParent1];
            }



        }

        return res;
        
    }
}
