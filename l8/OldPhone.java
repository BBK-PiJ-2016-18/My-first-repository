public class OldPhone implements Phone {
	
	//private numberQueue listOfDialledNumbers = new numberQueue();
	private int[] listOfDialledNumbers = new int[10]; // zero means there are no numbers dialled
	public int indexOfLastNumberDialled = 0;
	
	public int getNumberFromTheList(int index) {
		if(index < listOfDialledNumbers.length)
			return this.listOfDialledNumbers[index];
		return 0;
	}
	
	public int getLastNumberDialled() {
		int numToReturn = 0; // zero here denotes that there is no number to return
		for(int i = listOfDialledNumbers.length-1; i >= 0; i--) {
			if(listOfDialledNumbers[i] > 0) {
				numToReturn = listOfDialledNumbers[i];
				break;
			}
		}
		return numToReturn;
	}
	
	public void call (String number) {
		System.out.println("Now calling " + number);
			
		if(indexOfLastNumberDialled < listOfDialledNumbers.length - 1) {
			this.listOfDialledNumbers[indexOfLastNumberDialled] = Integer.parseInt(number);
			indexOfLastNumberDialled++;
		}
		else {
			for(int i = 1; i <= listOfDialledNumbers.length - 1; i++)
				this.listOfDialledNumbers[i - 1] = this.listOfDialledNumbers[i];
			this.listOfDialledNumbers[indexOfLastNumberDialled] = Integer.parseInt(number);
		}
	}
}