class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int great=candies[0];
        for(int i = 1; i<candies.length;i++){
            if(candies[i]>great){
                great=candies[i];
            }
        }
    ArrayList<Boolean> la= new ArrayList<>();
        for(int i = 0 ; i<candies.length;i++){
            if(candies[i]+extraCandies>= great){
                la.add(true);
                
            }else{
                la.add(false);
            }
        }
     return la;
    }
}