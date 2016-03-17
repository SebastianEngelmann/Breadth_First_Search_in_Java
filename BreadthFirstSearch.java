import java.util.*;

class BreadthFirstSearch {
	
	public void bfs(Vertex root){
		Queue<Vertex> queue = new LinkedList<>();
		root.setVisited(true);
		queue.add(root);
		
		while(!queue.isEmpty()){
			Vertex actualVertex = queue.remove();
			System.out.print(actualVertex + "-");
			
			for(Vertex v: actualVertex.getNeighbourList()){
				if(!v.setVisited()){
					v.setVisited(true);
					queue.add(v);
				}
			}
		}
	}
	
}