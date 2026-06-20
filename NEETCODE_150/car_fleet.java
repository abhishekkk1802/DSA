class Solution {

    public int carFleet(int target, int[] position, int[] speed) {

        int n = position.length;

        double[][] cars = new double[n][2];

        for(int i = 0; i < n; i++){
            cars[i][0] = position[i];
            cars[i][1] = (double)(target - position[i]) / speed[i];
        }

        Arrays.sort(cars, (a, b) -> Double.compare(b[0], a[0]));

        int fleets = 0;
        double maxTime = 0;

        for(int i = 0; i < n; i++){

            if(cars[i][1] > maxTime){
                fleets++;
                maxTime = cars[i][1];
            }
        }

        return fleets;
    }
}

Time Complexity :- O(nlogn)
Space Complexity :- O(n)

Approach :- We can use a greedy approach to solve this problem. We can sort the cars by their position in descending order.
            We can then iterate through the cars and check if the current car can catch up with the previous car.
            If it can, we can increment the fleet count.
            If it can't, we can start a new fleet.
            Finally, we can return the fleet count.


Approach 2 : Using Stack
    We can use a stack to store the cars that are in the same fleet.
    We can iterate through the cars and check if the current car can catch up with the previous car.
    If it can, we can pop the previous car from the stack.
    If it can't, we can push the current car onto the stack.
    Finally, we can return the size of the stack.

Time Complexity :- O(nlogn)
Space Complexity :- O(n)

class Solution {
    class Pair{
        int x;
        int y;

        Pair(int x,int y){
            this.x = x;
            this.y = y;
        }
    }

    public int carFleet(int target, int[] position, int[] speed) {

       List<Pair> l = new ArrayList<>();

       int n = position.length;

       for(int i=0;i<n;i++){
            l.add(new Pair(target-position[i],speed[i]));
       }

       Collections.sort(l,(a,b)->a.x-b.x);
       Collections.reverse(l);

       Stack<Double> s = new Stack<>();

       for(int i=0;i<n;i++){
        int x = l.get(i).x;
        int y = l.get(i).y;

        Double z =1.0* x/y;

        while(!s.isEmpty() && s.peek()<=z){
            s.pop();
        }

        s.push(z);
       }

       return s.size();  
        
    }
}