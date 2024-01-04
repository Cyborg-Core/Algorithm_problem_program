package SolvedProblem.FindOrder;
import java.util.ArrayList;
import java.util.List;

/**
 * 拓扑排序经典问题
 *
 *
 *
 */
public class Solution {
    boolean imposable = true;
    List<List<Integer>> edges;
    int[] visited;
    int[] result;
    int index;
    public int[] findOrder(int numCourses, int[][] prerequisites) {

        edges = new ArrayList();
        for (int i = 0; i < numCourses; ++i) {
            edges.add(new ArrayList<Integer>());
        }
        for (int[] info : prerequisites) {
            edges.get(info[1]).add(info[0]);
        }
        visited = new int[numCourses];
        result = new int[numCourses];
        index = numCourses - 1;

        for(int i=0;i<numCourses;i++)
        {
            if(visited[i] == 0)
            {
                dfs(i);
            }
        }
        if(imposable)
            return result;
        else
            return new int[0];

    }
    void dfs(int i){
        visited[i] = 1;
        for(int child : edges.get(i)){
            if(visited[child] == 0)
            {
                dfs(child);
            } else if(visited[child] == 1)
            {
                imposable = false;
                return;
            }
        }
        visited[i] = 2;
        result[index] = i;
        index--;
    }
}
