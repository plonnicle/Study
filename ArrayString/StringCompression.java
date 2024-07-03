//Summary: Given an array of characters 'chars', compress it by applying the following rules:
//  If the group's length is 1, append the character to s
//  Otherwise, append the character followed by the group's length
//  The compressed string s should be stored in the input character array chars. Return the new length of the array.
//Approach: Iterate through array chars. For each element, start a running counter until the character is verified to change on the next character. If the next char is different than the current, make the current running total the next char in the return array. Return the array.
//Solution:
class Solution {
    public int compress(char[] chars) {
    //    for(int i = 0; i < chars.length; i++){
    //        int currentTotal = 0;
    //        if(chars[i-1] == chars[i]){
    //            currentTotal++;
    //            chars[i] = currentTotal;
    //        }else{
    //            continue;
    //        }
    //        return chars;
    //    }
    //}
        char previousChar = chars[0];
        int count=1;
        StringBuilder sb = new StringBuilder();

        // STEP-1 : iterate through input array
        for(int i=1; i<chars.length; i++){
            char currentChar = chars[i];

            // STEP-2 : if current char is matched with previous char, then increase the count
            if(previousChar == currentChar){
                count++;
            } 
            // STEP-3 : else add the character and count in the answer String builder
            else {
                sb.append(previousChar);
                if(count > 1) sb.append(count);
                previousChar = currentChar;
                count=1;
            }
        }        
        sb.append(previousChar);
        if(count > 1) sb.append(count);

        // STEP-4 : copy answer from StringBuilder to input array
        for(int i=0; i<sb.length(); i++){
            chars[i] = sb.charAt(i);
        }
        return sb.length();
    }
}
