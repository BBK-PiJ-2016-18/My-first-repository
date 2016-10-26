public class OldPhone implements Phone {
	
	//private numberQueue listOfDiallednumbers = new numberQueue();
	private int[] listOfDiallednumbers = new int[10]; // zero means theere are no numbers dailed
	public int indexOfLastNumberDailed = 0;
	
	public int getNumberFromTheList(int index) {
		if(index < listOfDiallednumbers.length)
			return this.listOfDiallednumbers[index];
		return 0;
	}
	
	public int getLastNumberDailed() {
		int numToReturn = 0; // zero here denotes that there is no number to return
		for(int i = listOfDiallednumbers.length-1; i >= 0; i--) {
			if(listOfDiallednumbers[i] > 0) {
				numToReturn = listOfDiallednumbers[i];
				break;
			}
		}
		return numToReturn;
	}
	
	public void addNumber(int num) {
		
	}
	
	public void call (String number) {
		if (number.length() == 3) {
			System.out.println("Now calling" + number);
			
			if(indexOfLastNumberDailed < listOfDiallednumbers.length-1) {
				this.listOfDiallednumbers[indexOfLastNumberDailed] = Integer.parseInt(number);
				indexOfLastNumberDailed++;
			}
			else {
				for(int i = 1; i <= listOfDiallednumbers.length-1; i++)
					this.listOfDiallednumbers[i-1] = this.listOfDiallednumbers[i];
				this.listOfDiallednumbers[indexOfLastNumberDailed] = Integer.parseInt(number);
			}
		}
		else {
			System.out.println("That is not a valid number");
		}
	}
}