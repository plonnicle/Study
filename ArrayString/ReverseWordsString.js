/**
 * @param {string} s
 * @return {string}
 */
/*
Question: Given an input string s, reverse the order of the words.
Abstract: Search the string for spaces. When a space is found, concatenate the entire string and add it to a reverse sentence string with a space in front of it.
Solution:
*/
var reverseWords = function(s) {
    //let reverseString = "";
    //reverseString = s.split();
    //return reverseString.reverse();
    
    
    let reverse = '';
    let words = s.split(' ');
    
    for( let i = words.length-1; i >= 0; i-- ) {
         if( words[i] == '' ) {
             continue;
         } 
         reverse += words[i] + ' ';               
    }
    
    return reverse.trim();
};
