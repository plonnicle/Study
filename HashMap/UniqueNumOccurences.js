/**
 * @param {number[]} arr
 * @return {boolean}
 */

//Summary: Given array of integers 'arr', return true if the number of instances of an int are unique or false otherwise.
//Approach: FOR LOOP through 'arr'. Create a map by checking to see if the value exists in the map as a key yet. If so, add one to its value. If not, add it as a key and give it the value one. AFTER FOR LOOP check the map to see if any two values are the same. If so, return false. Otherwise, return true.
//Solution: 

var uniqueOccurrences = function(arr) {
//    const endMap = new Map();
//    for(i in arr){
//        for(){
//            
//        }
//        if(arr[i] == ){
//           
//        }
//    }
//    
//};
    let obj = {}

    for(let elem of arr){
        if(!obj[elem]) obj[elem] = 0

        ++obj[elem]
    }

    let occurences = Object.values(obj)

    let set = new Set()

    for(let elem of occurences){
        if(set.has(elem)) return false

        set.add(elem)
    }

    return true
};
