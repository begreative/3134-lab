
public class CarLinkedList {
	protected LLNode head; //sentinel node
	protected LLNode tail; //reference to last REAL node in the LL
	
	public CarLinkedList() {
		head = new LLNode(null, null);
		tail = head;
	}
	
	public void addBack(Car inCar) {
		LLNode newNode = new LLNode(inCar, null);
		tail.next = newNode;
		tail = newNode;
	}
	/**
	 * 2 corner cases to consider:
	 * 1) if head == tail, that means the list is empty
	 * 2) if temp == tail, that means you are popping the last item
	 * in the list so the reference to tail should now point to head
	 * 
	 * @return the value of the popped node
	 */
	public Car popFront() {
		if (head == tail) {
			return null;
		}
		LLNode temp = head.next;
		head.next = temp.next;
		if (temp == tail) {
			tail = head;
		}
		return temp.theCar;
	}

	
	private static class LLNode {
		LLNode next;
		Car theCar;
		
		public LLNode(Car theCar, LLNode next) {
			this.next = next;
			this.theCar = theCar;
		}
	}
}
