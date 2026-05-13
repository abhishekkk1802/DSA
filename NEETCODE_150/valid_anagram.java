class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        int n = s.length();
        int[] freq = new int[26];

        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }

        for(char c:t.toCharArray()){
            if(freq[c-'a']==0)return false;
            freq[c-'a']--;
        }

        return true;   
    }
}

Approach :- We can use a frequency array to store the frequency of each character in the string s. 
            Then we can iterate through the string t and check if the frequency of each character 
            in t is equal to the frequency of the same character in s. If it is,
            then the strings are anagrams of each other. If it is not, 
            then the strings are not anagrams of each other.

Time Complexity :- O(n)
Space Complexity :- O(1)






