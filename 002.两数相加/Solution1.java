/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //定义头结点
		ListNode l3=new ListNode(0);
        l3.next=null;
		ListNode now=l3;
		int next=0;//进位
        int nownum=0;//当前数字
		while(l1!=null && l2!=null){
            nownum=l1.val+l2.val+next;
            next=nownum/10;
            nownum=nownum%10;
            ListNode newL=new ListNode(nownum);
            newL.next=null;
            now.next=newL;
            now=now.next;
            l1=l1.next;
            l2=l2.next;
		}
        while(l1!=null){
            nownum=l1.val+next;
            next=nownum/10;
            nownum=nownum%10;
            ListNode newL=new ListNode(nownum);
            newL.next=null;
            now.next=newL;
            now=now.next;
            l1=l1.next;
        }
        while(l2!=null){
            nownum=l2.val+next;
            next=nownum/10;
            nownum=nownum%10;
            ListNode newL=new ListNode(nownum);
            newL.next=null;
            now.next=newL;
            now=now.next;
            l2=l2.next;
        }
		//当还有进位再增加一个结点
        if(next==1){
            ListNode newL=new ListNode(1);
            newL.next=null;
            now.next=newL;
        }
        return l3.next;
    }
}