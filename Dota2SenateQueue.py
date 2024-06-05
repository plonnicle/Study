#Question: Given a string "senate" of size n with 'R' representing party Radiant and 'D' representing party Dire, determine which party will win. Each round, each senator can exercise one of two rights: ban adjacent senator's rights if they are in the opposite party and declare victory if all remaining senators are from the same party.
#Abstract: Go one by one and execute each action with if statements for each senator. If there are no more opposing members, declare victory and end the loop.
#Solution: 
class Solution:
    def predictPartyVictory(self, senate: str) -> str:
        #Iterate through each char in string senate
            #If has rights: 
                #Banning rights: Check if adjacent character is not current char. If so, ban their rights.
                #Announce victory: Check if remaining string has same char value. If so, declare victory and output party name. Else, go to next senator
            #Else, go to next senator
        # O(n) time and space
        r_positions = deque([i for i, s in enumerate(senate) if s == 'R'])
        d_positions = deque([i for i, s in enumerate(senate) if s == 'D'])
        next_position = len(senate)
        while r_positions and d_positions:
            if r_positions[0] < d_positions[0]:
                r_positions.append(next_position)
            else:
                d_positions.append(next_position)
            r_positions.popleft()
            d_positions.popleft()
            next_position += 1
        return 'Radiant' if r_positions else 'Dire'
