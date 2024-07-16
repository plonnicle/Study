/**
 * @param {string} word1
 * @param {string} word2
 * @return {string}
 */
//Summary: Given two words, 'word1' and 'word2', return a merge of the strings by adding letters in alternating order, starting with the first letter of word1. If one string is longer than another, append the additional letters to the end
//Approach: Hop between each word and add them to the final string.
//Pseudo: for each (word1.length)
//Solution:
var mergeAlternately = function(word1, word2) {
    let result = ""; 
    // For every index in the strings 
    for (let i = 0; i < word1.length || i < word2.length; i++) { 
  
        // First choose the ith character of the 
        // first string if it exists 
        if (i < word1.length) 
            result += word1.charAt(i); 
  
        // Then choose the ith character of the 
        // second string if it exists 
        if (i < word2.length) 
            result += word2.charAt(i); 
    } 
  
    return result; 
};
