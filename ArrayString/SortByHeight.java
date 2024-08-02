//Summary: Reading an input of an integer array, return a re-ordered version of it with the non -1 values rearranged in ascending order. Keep the value -1 where it is always.
//Abstract: Iterate through the length of a. If an index has the value of -1, move to the next index. Otherwise, do something.
//Solution:
/*
int[] solution(int[] a) {
    for(int i = 0; i <= a.length; i++){
        if(a[i] == -1){
            continue;
        }else{
            if(a[i] > a[i+1]){
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
            }else{
                continue;
            }
        }
    }
    return a;
}
*/
int[] solution(int[] a) {

    int t;
    
    for(int i=0; i<a.length; i++)
        for(int j=i+1; j<a.length; j++)
            if(a[i]>a[j] && a[i]!=-1 && a[j]!=-1) {
                
                t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
    
    return a;
}
