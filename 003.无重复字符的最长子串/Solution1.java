class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] str=s.toCharArray();
		int max=0;
		int leftIndex=0;//左指针指向字符串的开始位置
		//end代表字符串结束位置
		for(int end=0;end<str.length;end++){
			for(int i=leftIndex;i<end;i++){
				if(str[i]==str[end]){
					max=max>(end-leftIndex)?max:end-leftIndex;
					leftIndex=i+1;
					break;
				}
			}
		}
		//到最后可能没有使str[i]==str[end]
        return max>(str.length-leftIndex)?max:str.length-leftIndex;
    }
}