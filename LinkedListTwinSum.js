/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {number}
 */
//Summary: In a linked list the size of n, where the value of n is always even. The ith node of the linked list and the (n-1-i)th node are twins. Find the max twin sum (the sum of a node and its twin) given the head of a linked list with even length.
//Approach: Get the head and the tail of the linked list and add them together. For loop that takes the ith number and (n-1-i)th number and adds them. This value gets checked against the current max. If the new value is greater, update the current max. Return the final max.
//Solution:
var pairSum = function(head) {
    /*finalMax = 0;
    for (i in head.length){
        currentMax = i + (n-1-i);
        if(currentMax > finalMax){
            finalMax = currentMax;
        }
    }
    return finalMax;
    */
    
    var st = []; 
    while(head != null){
        st.push(head.val);
        head = head.next;
    }
    let max = 0;
    for(let i=0; i<st.length; i++){
        max = Math.max(max, (st[i] + st[st.length-1-i]));
    }
    return max;
};
