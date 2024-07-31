//Summary: Arguments two strings, return the int value of common characters between them.
//Approach: HashSet: Split the strings into separate character arrays. Then insert the values into a hashset. Loop through the array, and for each value in the hashset that is the same as the current character, add one to the counter. Return the counter.
//Solution:
int solution(String s1, String s2) {
    //a = 2
    //b = 1
    //c = 2
    /*
    int counter = 0;
    //Count unique characters in both strings
    HashMap<Character, Integer> s1Map = new HashMap();
    for(int i = 0; i < s1.length(); i++){
        s1Map.put(s1.charAt(i), 1);
    }
    
 System.out.println(s1Map.toString());
    for(int j = 0; j < s2.length(); j++){
        if(s1Map.containsKey(s2.charAt(j))){ //Boolean value check for current char
           counter++; 
        }
    }
    
    return counter;
    */
    int counter = 0;
    for(int i = 0; i < s1.length(); i++){
        if(s2.contains(String.valueOf(s1.charAt(i)))){
            counter++;
            s2 = s2.replaceFirst(String.valueOf(s1.charAt(i)), "");
        }
    }
    return counter;
}
