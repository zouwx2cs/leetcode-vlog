class Solution {
    public int[] twoSum(int[] nums, int target) {
     int[] num =new int[2];
	 //利用HashMap将对应的数值作为Key，位置作为Value
     HashMap<Integer,Integer> map=new HashMap<>();
     for(int i=0;i<nums.length;i++){
         int dex=target-nums[i];
		 //第二个数值如果在map中存在即代表找到答案
         if(map.get(dex)!=null){
             num[0]=map.get(dex);
             num[1]=i;
            return num;
         }
		 //将对应的数值和位置放入map
         map.put(nums[i],i);
     }
     return null;
}
}