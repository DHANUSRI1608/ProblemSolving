class SmallestPallindromicRearrangement {
    public String smallestPalindrome(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        char[] ans = new char[s.length()];
        int left = 0;
        int right = s.length() - 1;
        for (int i = 0; i < 26; i++) {
            while (freq[i] >= 2) {
                ans[left++] = (char) ('a' + i);
                ans[right--] = (char) ('a' + i);
                freq[i] -= 2;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] == 1) {
                ans[left] = (char) ('a' + i);
                break;
            }
        }
        return new String(ans);
    }
}