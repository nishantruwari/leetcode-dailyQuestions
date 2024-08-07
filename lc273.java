class Solution {
    public String numberToWords(int num) {
        StringBuilder str = new StringBuilder();
        if (num == 0) {
            return "Zero";
        }
        String nums = Integer.toString(num);
        HashMap<Character, String> ones = new HashMap<>();
        ones.put('1', "One ");
        ones.put('2', "Two ");
        ones.put('3', "Three ");
        ones.put('4', "Four ");
        ones.put('5', "Five ");
        ones.put('6', "Six ");
        ones.put('7', "Seven ");
        ones.put('8', "Eight ");
        ones.put('9', "Nine ");
        ones.put('0', "");
        HashMap<Character, String> tens = new HashMap<>();
        // ones.put(1,"One");
        tens.put('2', "Twenty ");
        tens.put('3', "Thirty ");
        tens.put('4', "Forty ");
        tens.put('5', "Fifty ");
        tens.put('6', "Sixty ");
        tens.put('7', "Seventy ");
        tens.put('8', "Eighty ");
        tens.put('9', "Ninety ");
        tens.put('0', "");
        HashMap<Character, String> tenth = new HashMap<>();

        tenth.put('0', "Ten ");
        tenth.put('1', "Eleven ");
        tenth.put('2', "Twelve ");
        tenth.put('3', "Thirteen ");
        tenth.put('4', "Fourteen ");
        tenth.put('5', "Fifteen ");
        tenth.put('6', "Sixteen ");
        tenth.put('7', "Seventeen ");
        tenth.put('8', "Eighteen ");
        tenth.put('9', "Nineteen ");
        int count = nums.length();

        for (int i = 0; count > 0; i++) {
            if (count == 10) {
                str.append(ones.get(nums.charAt(i)));
                str.append("Billion ");
                --count;
                continue;
            }
            if (count == 9) {
                if (nums.charAt(i) == '0') {
                    --count;
                    continue;
                }

                str.append(ones.get(nums.charAt(i)));
                str.append("Hundred ");
                --count;
                continue;
            }
            if (count == 8) {
                if (nums.charAt(i) == '0' || nums.charAt(i) == '1') {
                    --count;
                    continue;
                }
                // continue;

                str.append(tens.get(nums.charAt(i)));
                // str.append("Billion");
                --count;
                continue;
            }
            if (count == 7) {
                if (nums.length() > 7)
                    if (nums.charAt(i - 1) == '1') {
                        str.append(tenth.get(nums.charAt(i)));
                        str.append("Million ");
                        --count;
                        continue;

                    }
                if (nums.length() > 8)
                    if (nums.charAt(i) == '0' && nums.charAt(i - 2) != '0') {
                        str.append("Million ");
                        --count;
                        continue;
                    }
                if (nums.length() > 9 && nums.charAt(i) == '0' && nums.charAt(i - 1) == '0'
                        && nums.charAt(i - 2) == '0') {
                    --count;
                    continue;
                }

                str.append(ones.get(nums.charAt(i)));
                str.append("Million ");
                --count;
                continue;
            }

            if (count == 6) {
                if (nums.charAt(i) == '0') {
                    --count;
                    continue;
                }
                // continue;
                str.append(ones.get(nums.charAt(i)));
                str.append("Hundred ");
                --count;
                continue;
            }
            if (count == 5) {
                if (nums.charAt(i) == '0' || nums.charAt(i) == '1') {
                    --count;
                    continue;
                }
                str.append(tens.get(nums.charAt(i)));
                // str.append("Billion");
                --count;
                continue;
            }
            if (count == 4) {
                if (nums.length() > 4)
                    if (nums.charAt(i - 1) == '1') {
                        str.append(tenth.get(nums.charAt(i)));
                        str.append("Thousand ");
                        --count;
                        continue;

                    }
                if (nums.length() > 5)
                    if (nums.charAt(i) == '0' && nums.charAt(i - 2) != '0') {
                        str.append("Thousand ");
                        --count;
                        continue;
                    }
                // if (nums.length() > 5)
                // if (nums.charAt(i) == '0' && nums.charAt(i - 2) == 0 && nums.charAt(i - 3) ==
                // 0)

                if (nums.length() > 5 && nums.charAt(i) == '0' && nums.charAt(i - 1) == '0'
                        && nums.charAt(i - 2) == '0') {
                    --count;
                    continue;
                }
                str.append(ones.get(nums.charAt(i)));
                // if()
                str.append("Thousand ");
                --count;
                continue;
            }

            if (count == 3) {
                if (nums.charAt(i) == '0') {
                    --count;
                    continue;
                }
                str.append(ones.get(nums.charAt(i)));
                str.append("Hundred ");
                --count;
                continue;
            }
            if (count == 2) {
                if (nums.charAt(i) == '0' || nums.charAt(i) == '1') {
                    --count;
                    continue;
                }

                str.append(tens.get(nums.charAt(i)));
                // str.append("Billion");
                --count;
                continue;
            }
            if (count == 1) {
                if (nums.length() > 1)
                    if (nums.charAt(i - 1) == '1') {
                        str.append(tenth.get(nums.charAt(i)));
                        // str.append("Million");
                        --count;
                        continue;

                    }

                str.append(ones.get(nums.charAt(i)));
                // str.append("Thousand");
                --count;
                continue;
            }

        }
        String ans = str.toString();
        ans.trim();

        return ans.trim();

    }
}