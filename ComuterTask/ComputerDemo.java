
public class ComputerDemo {

	public static void main(String[] args) {
		Computer pc = new Computer();
		pc.year = 2014;
		pc.price = 800;
		pc.isNotebook = false;
		pc.hardDiskMemory = 800;
		pc.freeMemory = 300;
		pc.operationSystem = "Windows";
		pc.type = "Personal Computer";
		Computer notebook = new Computer();

		notebook.year = 2016;
		notebook.price = 1000;
		notebook.isNotebook = true;
		notebook.hardDiskMemory = 800;
		notebook.freeMemory = 400;
		notebook.operationSystem = "Windows";
		notebook.type = "Notebook";

		pc.useMemory(-100);
		notebook.operationSystem = notebook.changeOperationSystem("Linux");

		pc.print();
		notebook.print();
	}

}
