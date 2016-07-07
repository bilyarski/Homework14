
public class Computer {

	int year;
	double price;
	boolean isNotebook;
	int hardDiskMemory;
	int freeMemory;
	String operationSystem = "";
	String type = "";

	String changeOperationSystem(String newOpSys) {

		if (newOpSys.equals("")) {
			System.out.println("No OP system entered!");
		}
		return newOpSys;
	}

	void useMemory(int value) {

		if (value < 0) {
			System.out.println("invalid memory request!");

		} else {
			if (freeMemory >= value) {
				freeMemory -= value;
			} else {
				System.out.println("Not enough free memory!");
			}
		}
	}

	void print() {
		System.out.println(type + "\nyear= " + year + ": Prise = " + price + "lv: HDD memory =" + hardDiskMemory
				+ ":GB Free memory =" + freeMemory + ":GB Operation System -" + operationSystem + ": Notebook: "
				+ isNotebook);
	}

}
