class Solution {
    class Pair {
        int x;
        int y;

        Pair(int x,int y){
            this.x = x;
            this.y = y;
        }
    }

    public int[] topKFrequent(int[] nums, int k) {

        int[] ans = new int[k];

        int n = nums.length;
        Map<Integer,Integer> freq = new HashMap<>();

        int cnt =0;
        for(int num:nums){
            freq.putIfAbsent(num,0);
            freq.put(num,freq.get(num)+1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a,b)-> a.x-b.x
        );

        for(Map.Entry<Integer,Integer> mp : freq.entrySet()){
            pq.add(new Pair(mp.getValue(),mp.getKey()));
            if(pq.size()>k)pq.remove();
        }

        while(pq.size()>0){
            ans[cnt++] = pq.poll().y;
        }

        return ans;
        
    }
}

Approach :- We can use a hashmap to store the frequency of each number in the array.
            Then we can use a priority queue to store the numbers based on their frequency.
            Finally, we can return the top k numbers from the priority queue.

Time Complexity :- O(nlogk)
Space Complexity :- O(n)

Approach 2 : Using Bucket Sort
    Why Bucket Sort Works :Frequency of an element can never exceed n (length of the array)

    So possible frequencies are 1 to n

    We create buckets where bucket[i] stores all numbers having frequency i.

    Finally, we can return the top k numbers from the buckets.

    class Solution {

    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] bucket = new ArrayList[nums.length + 1];

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {

            int number = entry.getKey();
            int frequency = entry.getValue();

            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }

            bucket[frequency].add(number);
        }

        int[] ans = new int[k];
        int idx = 0;

        for (int i = bucket.length - 1; i >= 0 && idx < k; i--) {

            if (bucket[i] != null) {

                for (int num : bucket[i]) {
                    ans[idx++] = num;

                    if (idx == k) {
                        break;
                    }
                }
            }
        }

        return ans;
    }
}


Time Complexity :- O(n)
Space Complexity :- O(n)
