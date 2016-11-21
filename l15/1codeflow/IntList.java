import java.util.List;
import java.util.ArrayList;

public class IntList {
	public void launch(int userInput) {
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		intList.add(6);
		System.out.println("intList.get(0): " + intList.get(0));
		System.out.println("intList.get(1): " + intList.get(1));
		System.out.println("intList.get(2): " + intList.get(2));
		System.out.println("intList.get(3): " + intList.get(3));
		System.out.println("intList.get(4): " + intList.get(4));
		System.out.println("intList.get(5): " + intList.get(5));
		try {
			intList.remove(0);
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));
		} catch (IndexOutOfBoundsException ex) {
			ex.printStackTrace();
		}
	}
}

