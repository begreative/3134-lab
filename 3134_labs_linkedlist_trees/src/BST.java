
public class BST {
	
	BSTNode root;
	
	public BST() {
		root = null;
	}
	
	public void insert(CarDealership c) {
		root = insert(c, root);
	}
	
	private BSTNode insert(CarDealership c, BSTNode curr) {
		if (curr == null) {
			curr = new BSTNode(c, null, null);
		}
		int compareResult = c.compareTo(curr.dealership);
		if (compareResult < 0) {
			curr.left = insert(c, curr.left);
		}
		else if (compareResult > 0) {
			curr.right = insert(c, curr.right);
		}
		else {
			;
		}
		return curr;
	}
	
	public boolean isEmpty() {
		return root == null ? true : false;
	}
	
	//IMPLEMENT THIS
	public CarDealership findMin() {
		if (isEmpty()) {
			return null;
		}
		return findMin(root).dealership;
	}
	
	//IMPLEMENT THIS
	private BSTNode findMin(BSTNode curr) {
		if (curr == null) {
			return null;
		}
		else if (curr.left == null) {
			return curr;
		}
		else {
			return findMin(curr.left);
		}
	}
	
    private static class BSTNode {
    	CarDealership dealership;
    	BSTNode left;
    	BSTNode right;
    	BSTNode (CarDealership c, BSTNode left, BSTNode right) {
    		dealership = c;
    		this.left = left;
    		this.right = right;
    	}
  
    }
}
