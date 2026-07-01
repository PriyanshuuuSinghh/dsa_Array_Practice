class Solution {
    public int strStr(String haystack, String needle) {

        // Loop through every possible starting position
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {

            int j = 0;

            // Compare characters of needle with haystack
            while (j < needle.length() &&
                   haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }

            // If we matched the entire needle
            if (j == needle.length()) {
                return i;
            }
        }

        // Needle not found
        return -1;
    }
}