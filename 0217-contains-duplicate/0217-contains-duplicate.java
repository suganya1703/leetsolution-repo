class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Boolean> array= new HashMap<>();
        for(int i:nums) {
          if(array.containsKey(i)) {
            return true;
          }
            array.put(i,true);
          
    }
    return false;
    }
}