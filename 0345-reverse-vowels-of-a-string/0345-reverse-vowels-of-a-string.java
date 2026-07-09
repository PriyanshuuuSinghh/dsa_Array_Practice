class Solution {

    public boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' ||
               c == 'o' || c == 'u';
    }

    public String reverseVowels(String s) {

        char[] arr = s.toCharArray();
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            if (isVowel(arr[start]) && isVowel(arr[end])) {

                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;

            } else if (isVowel(arr[start]) && !isVowel(arr[end])) {

                end--;

            } else if (!isVowel(arr[start]) && isVowel(arr[end])) {

                start++;

            } else {

                start++;
                end--;
            }
        }

        return new String(arr);
    }
}