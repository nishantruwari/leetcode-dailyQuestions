class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {

        String[] str = sentence.split("\\s"); // Correct regex for splitting on whitespace
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() >= searchWord.length() && str[i].startsWith(searchWord)) {
                return i + 1; // Return 1-based index
            }
        }
        return -1; // Return -1 if no match is found
    }
}
