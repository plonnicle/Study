/**
 * @param {number[]} cost
 * @return {number}
 */
//Summary: Given an array of integers 'cost' where cost[i] represents the cost of the ith step on a staircase, return the minimum cost to reach the top of the floor. Once the cost is paid, one can either climb one or two steps. Can start from index 0 or index 1.
//Approach: 
//Solution:
var minCostClimbingStairs = function(cost) {
    cost.push(0)
    for(let i=cost.length-4;i>=0;i--){
        cost[i]+=Math.min(cost[i+1],cost[i+2])
    }
    return Math.min(cost[0],cost[1])
};
