package practiseclass;

public class Printer_Runner {

	public static void main(String[] args) {
		
		Printer printer = new Printer(20,true);
		System.out.println("Toner level is " + printer.addToner(25));
		printer.printPages(9);
		printer.printPages(3);
		System.out.println("The number of papers that you need to use is  : " + printer.getPagesPrinted());
		printer.getPagesPrinted();
	}

}
