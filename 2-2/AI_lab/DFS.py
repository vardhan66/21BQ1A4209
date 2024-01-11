graph = {
 'A' : ['B','D'],
 'B' : ['C','G', 'E'],
 'C' : ['A'],
 'D' : ['C'],
 'E' : ['H'],
 'F' : [],
 'G' : ['F'],
 'H' : ['G','F']
}
goal = 'F'
visited = set() 
def dfs(visited, graph, node):
    if node not in visited:
        print (node)
        visited.add(node)
        for neighbour in graph[node]:
            if goal in visited:
                break
            else:
                dfs(visited, graph, neighbour)
dfs(visited, graph, 'B')