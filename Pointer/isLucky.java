//Summary: Input: integer n; Output: Boolean value; Process: Check if the sum of the first half of digits is equal to the sum of the second half.
//Approach: Two Pointer: Turn n into an array of separate ints by first turning it into a string then separating and converting to ints. Then iterate through both ends of the int array. Keep a counter for both halves. When both counts reach the half way point, check their values. Return true if they are equal and false otherwise.
//Solution:
boolean solution(int n) {
    /*
    String tempN = String.valueOf(n);
    char[] digits = tempN.toCharArray();
    int counterFront = 0;
    int counterEnd = 0;
    
    for(int i = 0; i < (digits.length / 2); i++){
        counterFront += digits[i];
        System.out.println(counterFront);
    }
    for(int j = (digits.length - 1); j > (digits.length / 2); j--){
        counterEnd += digits[j];
        System.out.println(counterEnd);
    }
    
    System.out.println("Counter First Half = " + counterFront + " Counter Second Half = " + counterEnd);
    if(counterFront == counterEnd){
        return true;
    }
    return false;
    */
        
    String num = Integer.toString(n);

    // Add first half, subtract second half.
    int sum = 0;
    int mid = num.length()/2;
    
    for (int i=0; i<mid; i++) {
        sum += num.charAt(i);
        sum -= num.charAt(i+mid);
     }

    // If zero, halves match
    return (sum == 0);
}
