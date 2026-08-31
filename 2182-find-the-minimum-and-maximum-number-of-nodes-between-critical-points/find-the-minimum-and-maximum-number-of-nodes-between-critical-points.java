/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] result = {-1,-1};
        int minDistance = Integer.MAX_VALUE;

        ListNode prev = head;
        ListNode curr = head.next;
        int currentIndex = 1;
        int previousCrictalIndex = 0;
        int firstCritcalIndex = 0;

        while(curr.next != null){
            if((curr.val < prev.val && curr.val < curr.next.val) || (curr.val>prev.val && curr.val > curr.next.val)){
                if(previousCrictalIndex == 0){
                    previousCrictalIndex = currentIndex;
                    firstCritcalIndex = currentIndex;
                }
                else{
                    minDistance = Math.min(minDistance , currentIndex - previousCrictalIndex);
                    previousCrictalIndex = currentIndex;
                }
            }
            currentIndex++;
            prev = curr;
            curr = curr.next;
        }
        if(minDistance != Integer.MAX_VALUE){
            result[0] = minDistance;
            result[1] = previousCrictalIndex - firstCritcalIndex;
        }
        return result;
    }
}