
public class CarDealership implements Comparable<CarDealership>{

	private String name;
	private CarLinkedList cars;
	private int avgCost;
	private int size;
	
	public CarDealership(String name) {
		this.name = name;
		cars = new CarLinkedList();
		avgCost = 0;
	}
	
	public void addCar(String brand, String color, int cost) {
		Car newCar = new Car(brand, color, cost);
		cars.addBack(newCar);
		size++;
		updateAvgCost(newCar.getCost(), true);
	}
	
	public Car removeACar() {
		Car temp = cars.popFront();
		size--;
		updateAvgCost(temp.getCost(), false);
		return temp;
	}
	
	/**
	 * Asssuming most students might try to implement this
	 * in O(n) time. 
	 */
	public void updateAvgCost(int newCost, boolean added) {
		int newTotalCost = 0;
		if (added) {
			newTotalCost = ((size-1) * avgCost) + newCost;
			avgCost = newTotalCost/size;
		}
		else {
			newTotalCost = ((size+1) * avgCost) - newCost;
			avgCost = newTotalCost/size;
		}
	}
	
	public int getAvgCost() {
		return avgCost;
	}
	
	@Override
	public int compareTo(CarDealership o) {
		if (this.avgCost < o.getAvgCost()) {
			return -1;
		}
		else if (this.avgCost > o.getAvgCost()) {
			return 1;
		}
		else {
			return 0;
		}
	}

}
