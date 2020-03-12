package ohnouh;
import java.util.Scanner;
public class ArrayEdit {
	public static void main(String[] args) {
		Scanner ohyeah = new Scanner(System.in);
		MyUtilities m = new MyUtilities();
		int ohnouh[]= m.inputValues();
		System.out.println(m.printValues(ohnouh));
		//m.isInside(ohnouh);
		//m.printType(ohonuh);
		//m.sumProduct(ohnouh);
		//m.largestSmallest(ohnouh);
		//m.checkOrder(ohnouh);
		//m.splitArray(ohnouh);
		//m.bigSplit(ohnouh);
		//m.circularShift(ohnouh);
		m.arraySort(ohnouh);
	}

}
