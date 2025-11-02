import java.util.*;
public class practice {
	class Node{
		int data;
		Node right,left;
		Node(int data){
			this.data=data;
			this.right=this.left=null;
		}
	}
	int idx=-1;
	Node build(int nodes[]) {
		idx++;
		if(nodes[idx]==-1) {
			return null;
		}
		Node newnode=new Node(nodes[idx]);
		newnode.left=build(nodes);
		newnode.right=build(nodes);
		return newnode;
		
	}
	void inorder(Node root) {
		if(root==null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
		
	}
	void levelorder(Node root) {
		if(root==null) {
			return;
		}
		Queue<Node>q=new LinkedList<>();
		q.add(root);
		q.add(null);
		while(!q.isEmpty()) {
			Node curr=q.remove();
			if(curr==null) {
				System.out.println();
				if(q.isEmpty()) {
					break;
				}else {
					q.add(null);
				}
			}else {
				System.out.print(curr.data+" ");
				if(curr.left!=null) {
					q.add(curr.left);
					
				}
				if(curr.right!=null) {
					q.add(curr.right);
				}
			}
		}
		
	}
	int sum(Node root) {
		if(root==null) {
			return 0;
		}
		int leftsum=sum(root.left);
		int rightsum=sum(root.right);
		int total=leftsum+rightsum+root.data;
		return total;
	}
	int couninternal(Node root) {
		if(root==null) {
			return 0;
		}
		if(root.left==null&& root.right==null) {
			return 0;
		}
		return couninternal(root.left)+couninternal(root.right)+1;
		
	}
	int countleaf(Node root) {
		if(root==null) {
			return 0;
		}
		if(root.left==null&& root.right==null) {
			return 1;
		}
		return countleaf(root.left)+countleaf(root.right);
		
	}
	void mirror(Node root) {
		if(root==null) {
			return;
		}
		Node temp=root.left;
		root.left=root.right;
		root.right=temp;
		mirror(root.left);
		mirror(root.right);
		
	}
	int height(Node root) {
		if(root==null) {
			return 0;
		}
		int left=height(root.left);
		int right=height(root.right);
		int max=Math.max(left, right);
		return max+1;
		
		
	}
	boolean ancestors(Node root,int key) {
		if(root==null) {
			return false;
			
		}
		if(root.data==key) {
			return true;
		}
		if(ancestors(root.left,key)||ancestors(root.right,key)) {
			System.out.print(root.data+" ");
			return true;
		}
		return false;
		
	}
	boolean isEmpty(Node root) {
		return root==null;
		
	}
	boolean isroot(Node root,Node n) {
		return root==n;
	}
	boolean isexternal(Node n) {
		return (n.left==null &&n.right==null) ;
	}
	Node find(Node root, int key) {
        if (root == null) return null;
        if (root.data == key) return root;
        Node left = find(root.left, key);
        if (left != null) return left;
        return find(root.right, key);
    }

	public static void main(String args[]) {
		int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,7,-1,-1,-1};
		practice p=new practice();
		Node root=p.build(nodes);
		p.inorder(root);
		p.levelorder(root);
		System.out.println("sum is "+p.sum(root));
		System.out.println("sum is "+p.couninternal(root));
		System.out.println("sum is "+p.countleaf(root));
		p.mirror(root);
		p.inorder(root);
		System.out.println("sum is "+p.height(root));
		p.ancestors(root, 7);
		System.out.println("sum is "+p.isEmpty(root));
		Node x=p.find(root, 7);
		System.out.println(p.isroot(root, x));
		System.out.println(p.isexternal(x));
		
		
	}
		
	
    
}
