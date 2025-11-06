def processQueries(c, connections, queries):
    #Dont copy this one, it will throw TLE, It is just for Understanding
    graph = defaultdict(list)
    for u, v in connections:
        graph[u].append(v)
        graph[v].append(u)

    online = [True] * (c + 1)
    res = []

    def dfs(x, visited):
        visited.add(x)
        for nei in graph[x]:
            if nei not in visited:
                dfs(nei, visited)

    for t, x in queries:
        if t == 1:
            if online[x]:
                res.append(x)
            else:
                visited = set()
                dfs(x, visited)
                online_nodes = [n for n in visited if online[n]]
                res.append(min(online_nodes) if online_nodes else -1)
        else:
            online[x] = False
    return res