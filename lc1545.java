class Solution {

    public StringBuilder invert(StringBuilder st) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == '0') {
                s.append("1");
            } else {
                s.append("0");
            }
        }

        // System.out.println("given "+str.toString()+ " inverted :"+s.toString());

        return s;
    }

    // public String reverse

    public void build(StringBuilder str, int n, int count) {
        if (count == n) {
            return;
        }
        StringBuilder s = new StringBuilder(str);
        str.append("1");

        StringBuilder rev = invert(s).reverse();
        str.append(rev);
        // System.out.println(" s "+s.toString()+" inverted "+ invert(s));
        // System.out.println(" count " + count+ " "+str.toString());

        build(str, n, count + 1);
    }

    public char findKthBit(int n, int k) {

        if (n == 1) {
            return '0';
        }
        StringBuilder str = new StringBuilder("0");

        build(str, n, 1);

        // System.out.println(str);

        return str.charAt(k - 1);

    }
}
