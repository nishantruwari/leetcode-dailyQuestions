class Solution {
    public int maximumGain(String s, int x, int y) {
        char ch = 'a';
        char cj = 'b';
        int ans = 0;

        char ck, cl;
        int u, l;
        if (x > y) {
            ck = 'a';
            cl = 'b';
            u = x;
            l = y;
        } else {
            ck = 'b';
            cl = 'a';
            u = y;
            l = x;
        }
        StringBuilder str = new StringBuilder(s);

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == ck && str.charAt(i + 1) == cl) {
                ans += u;
                str.delete(i, i + 2);
                i = i == 0 ? -1 : i - 2;

            }

        }
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == cl && str.charAt(i + 1) == ck) {
                ans += l;
                str.delete(i, i + 2);
                i = i == 0 ? -1 : i - 2;

            }

        }

        return ans;

    }
}