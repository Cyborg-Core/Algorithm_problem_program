package SolvedProblem.CanFinish;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    boolean vaild = true;
    int[] visited ;
    int[] result;
    List<List<Integer>> graph;
    int index = 0;

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }
        visited = new int[numCourses];
        result  = new int[numCourses];
        index = numCourses-1;
        for (int[] l: prerequisites
             ) {
            graph.get(l[0]).add(l[1]);
        }

        for(int i = 0;i<numCourses;i++)
        {
            if(visited[i] ==0)
            {
                dfs(i);
            }
        }
        return vaild;
    }

    void dfs(int i){
        visited[i] = 1;
        for(int child: graph.get(i))
        {
            if(visited[child] ==0)
            {
                dfs(child);
            }else if(visited[child] ==1)
            {
                vaild = false;
            }
        }
        visited[i] =2;
        result[index] = i;
        index--;
    }
}
