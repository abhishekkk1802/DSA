class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Map<String,List<String>> l = new HashMap<>();


        int n = strs.length;

        for(String s:strs){
            String p = s;
            char[] chArray = p.toCharArray(); // O(k)
            Arrays.sort(chArray);               //O(klogK)
            String temp = new String(chArray);   // O(k)
            // List<String> list = l.getOrDefault(temp,new ArrayList<>());
            // list.add(s);
            // l.put(temp,list);

            // l.putIfAbsent(temp,new ArrayList<>());
            // l.get(temp).add(s);

            l.computeIfAbsent(temp,k->new ArrayList()).add(s);

        }

        for(Map.Entry<String,List<String>> mp : l.entrySet()){
            ans.add(mp.getValue());
        }
        return ans;
    }
}


Approach :- We can use a hashmap to store the strings that are anagrams of each other. 
            We can sort the string and use it as the key of the map. 
            Then we can add the string to the list of the key.

Time Complexity :- O(n*klogk)
Space Complexity :- O(n*k)




