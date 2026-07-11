class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
      Map<String, Integer> map = new HashMap<>();
      for(int i = 0; i < list1.length; i++){
        map.put(list1[i], i);
      }  
      List<String> list = new ArrayList<>();
      int minSum = Integer.MAX_VALUE;
      for(int i = 0; i < list2.length; i++){
        if(map.containsKey(list2[i])){
            int sum = i + map.get(list2[i]);
            if(sum < minSum){
                list.clear();
                list.add(list2[i]);
                minSum = sum;
            }else if(minSum == sum) {
                list.add(list2[i]);
            }
        }
      }
      return list.toArray(new String[0]);
    }
}