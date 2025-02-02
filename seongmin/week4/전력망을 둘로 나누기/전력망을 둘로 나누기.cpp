#include <vector>
#include <cmath>
#include <algorithm>

using namespace std;

vector<vector<int>> graph;
vector<int> subtreeSize;

void dfs(int node, int parent = -1) {
    subtreeSize[node] = 1;
    for (int neighbor : graph[node]) {
        if (neighbor != parent) {
            dfs(neighbor, node);
            subtreeSize[node] += subtreeSize[neighbor];
        }
    }
}

int solution(int n, vector<vector<int>> wires) {
    int minDifference = n;
    graph.resize(n + 1);
    subtreeSize.resize(n + 1);

    for (const auto& wire : wires) {
        int a = wire[0], b = wire[1];
        graph[a].push_back(b);
        graph[b].push_back(a);
    }

    dfs(1);

    for (int i = 2; i <= n; i++) {
        minDifference = min(minDifference, abs(n - 2 * subtreeSize[i]));
    }

    return minDifference;
}
