class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int steps=0;
        int temp=capacity;
        for(int i=0;i<plants.length;i++){
            if(plants[i]<=temp){
                temp-=plants[i];
                 steps++;
            }else{
                steps+=2*i;
                steps++;
                temp=capacity;
                temp-=plants[i];
            }
        }
        return steps;
    }
}