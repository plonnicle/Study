#Summary: Input: Integer n, 2D integer array edges, integer source, integer destination / Output: Boolean isPath
#Approach: Need to start at the source's first edge[ui, vi]. Do an if check to Then, check to see if there are any edges with vi. Keep doing this until destination is found or vi has nowhere to go. If found, return true.
#Solution: Graph, Depth-First Search
class Solution:
    visited = []
    def validPath(self, n: int, edges: List[List[int]], source: int, destination: int) -> bool:
        #isPath = False
        #for neighbor in self.visited[n]:
        #    if neighbor not in visited:
        #        self.validPath()
        #    else:
        #        isPath = True
        #return isPath
    
        graph = defaultdict(list)

        for a, b in edges:
            graph[a].append(b)
            graph[b].append(a)

        seen = {source}

        def dfs(node):
            if node == destination:
                return True

            res = False

            for nei in graph[node]:
                if nei not in seen and not res:
                    seen.add(nei)
                    res = res or dfs(nei)

            return res

        return dfs(source)
