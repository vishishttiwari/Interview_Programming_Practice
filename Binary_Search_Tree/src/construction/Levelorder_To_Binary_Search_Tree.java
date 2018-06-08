/* If an BST is not able to form then function returns null */
/* Beautiful piece of code right here */

package construction;

import java.util.LinkedList;
import java.util.Queue;

import util.Node;

class NodeDetails {
	int value;
	int min;
	int max;
	NodeDetails(int value, int min, int max) {
		this.value = value;
		this.min = min;
		this.max = max;
	}
}

public class Levelorder_To_Binary_Search_Tree {		
	public static Node construct(int[] level) {
		Queue<NodeDetails> nodesDetails = new LinkedList<NodeDetails>();
		Queue<Node> nodes = new LinkedList<Node>();
		int index = 0;
		Node root = new Node(level[index]);
		nodesDetails.add(new NodeDetails(level[index++], Integer.MIN_VALUE, Integer.MAX_VALUE));
		nodes.add(root);
		
		while(true) {
			if (nodes.isEmpty()) return null;
			NodeDetails detailedNode = nodesDetails.poll();
			Node node = nodes.poll();
			if ((level[index] > detailedNode.min) && (level[index] < detailedNode.value)) {
				nodesDetails.add(new NodeDetails(level[index], detailedNode.min, detailedNode.value));
				Node temp = new Node(level[index++]);
				node.left = temp;
				nodes.add(temp);
			}	
			if ((level[index] > detailedNode.value) && (level[index] < detailedNode.max)) {
				nodesDetails.add(new NodeDetails(level[index], detailedNode.value, detailedNode.max));
				Node temp = new Node(level[index++]);
				node.right = temp;
				nodes.add(temp);
			}
			if (index == level.length) break;
		}
		return root;
	}
}

/*Construct BST from its given level order traversal
Construct the BST (Binary Search Tree) from its given level order traversal.

Examples:

Input : arr[] = {7, 4, 12, 3, 6, 8, 1, 5, 10}
Output : BST: 
        7        
       / \       
      4   12      
     / \  /     
    3  6 8    
   /  /   \
  1   5   10
*/