//Summary: Given an array 'rooms' where 'rooms[i]' is the set of keys one can obtain to visit other rooms, return TRUE if you can visit all the rooms by going in order and false otherwise. Each INTEGER value in 'rooms[i]' represents a key that opens the corresponding room. All the rooms are locked except for 'rooms[0]'.
//Approach: FOR each iterate through 'rooms', keeping a running counter of keys as an INTEGER key array. Starting at room 0, deposit the value(s) into the key array. Each room, check to see if the array has the value of the current room. If so, enter and repeat the process. Else, break out and return FALSE. IF at the end of the array and each room has been checked, return TRUE.
//Solution:

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
    //    int[] heldKeys;
    //    for(int i = 0; i < (rooms.length() - 1); i++){
    //        if(i == 0){
    //            heldKeys.add(rooms[i]);
    //        }else if(i > 0){
    //            if(heldKeys.contains(i)){
    //                heldKeys.add(rooms[i]);
    //            }else{
    //                continue;
    //            }
    //        }else{
    //            return true;
    //        }
    //    }
    //}
            
        Stack<Integer> keys = new Stack<>();
        Set<Integer> set = new HashSet<>();

        set.add(0);
        for(int ele : rooms.get(0)){
            keys.push(ele);
        }

        while(!keys.isEmpty()){
            int key = keys.pop();
            if(!set.contains(key)){
                set.add(key);

                for(int ele : rooms.get(key)){
                    if(!set.contains(ele)){
                        keys.push(ele);
                    }
                }
            }
                
        }
        if(set.size() == rooms.size()) return true;

        return false;
    }
}
