class ProductOfNumbers {
    ArrayList<Integer> arr;

    public ProductOfNumbers() {
        arr=new ArrayList<>();

        
    }
    
    public void add(int num) {
        arr.add(num);
        
    }
    
    public int getProduct(int k) {
        int n=arr.size();
        int ans=1;
        for(int i=n-k;i<n;i++){
            ans*=arr.get(i);
        }

        return ans;
        
    }
}
