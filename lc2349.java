class NumberContainers {
    HashMap<Integer,Integer> idxToNum;
    HashMap<Integer,TreeSet<Integer> > numToIdx;


    public NumberContainers() {
        idxToNum=new HashMap<>();
        numToIdx=new HashMap<>();

        
    }
    
    public void change(int index, int number) {
        if(idxToNum.containsKey(index)){
            int prevNum=idxToNum.get(index);
            numToIdx.get(prevNum).remove(index);
            if(numToIdx.get(prevNum).size()==0){
                numToIdx.remove(prevNum);
            }

        }
        idxToNum.put(index,number);
        if(!numToIdx.containsKey(number)){
            numToIdx.put(number,new TreeSet<>());
        }
        numToIdx.get(number).add(index);
        
    }
    
    public int find(int number) {
        if(!numToIdx.containsKey(number)){
            return -1;
        }
        return numToIdx.get(number).first();
        
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */
