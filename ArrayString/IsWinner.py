#Summary: Input: integer[] player1, integer[] player2 / Output: integer result
#Approach: for i in player1{calculate player1.score} for j in player2{calculate player2.score} if(player1.score > player2.score) {return 1} elif(player2.score > player1.score) {return 2} elif(player1.score == player2.score){return 0}
#Solution:
class Solution:
    def isWinner(self, player1: List[int], player2: List[int]) -> int:
        #score1 = player1[0]
        #score2 = player2[0]
        #for i in range(1, len(player1)):
        #    if player1[i-1] == 0 or (i > 1 and player1[i-2] == 10):
        #        score1 += (2 * player1[i])
        #    else:
        #        score1 += player1[i]
        #        
        #for j in range(1, len(player2)):
        #    if player2[j-1]  == 0 or (j > 1 and player2[j-2] == 10):
        #        score2 += (2 * player2[j])
        #    else:
        #        score2 += player2[j]
        #    
        #if score1 > score2:
        #    return 1
        #elif score2 > score1:
        #    return 2
        #else:
        #    return 0
        
        
        sum1 = player1[0]
        sum2 = player2[0]
        n = len(player1)

        for i in range(1, n):
            if player1[i-1] == 10 or (i > 1 and player1[i-2] == 10):
                sum1 += 2*player1[i]
            else:
                sum1 += player1[i]
            
            if player2[i-1] == 10 or (i > 1 and player2[i-2] == 10):
                sum2 += 2*player2[i]
            else:
                sum2 += player2[i]
        
        if sum1 > sum2:
            return 1
        if sum2 > sum1:
            return 2
        if sum1 == sum2:
            return 0
