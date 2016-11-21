import java.util.List;
import java.util.ArrayList;
import java.lang.Exception;
import java.lang.NullPointerException;

public class ExceptionClass {
	public void launch(int userInput) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		try {
			list.remove(0);
			System.out.println(list.get(userInput));
			list.remove(0);
			System.out.println(list.get(userInput));
			list.remove(0);
			System.out.println(list.get(userInput));
			list.remove(0);
			System.out.println(list.get(userInput));
			list.remove(0);
			System.out.println(list.get(userInput));
			list.add(7);
			list.remove(2);
			list.remove(2);
			list.remove(2);
		} catch (NullPointerException ex) {
			ex.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}