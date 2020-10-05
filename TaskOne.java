public class TaskOne{
	public static void main(String[] args){
		int [] ex1 = new int[]{1,2,3,4,5};
		int [] ex2 = new int[]{3,2,1,4,5};
		int [] ex3 = new int[]{3,2,1,4,1};
		int [] ex4 = new int[]{};
		int [] ex5 = new int[]{10};

		System.out.println(checkArrayForCentered(ex1));
		System.out.println(checkArrayForCentered(ex2));
		System.out.println(checkArrayForCentered(ex3));
		System.out.println(checkArrayForCentered(ex4));
		System.out.println(checkArrayForCentered(ex5));
 	}

	public static int checkArrayForCentered(int [] inputArray){
		int arrLength = inputArray.length;

		if(arrLength == 1) return 1;
		if(arrLength / 2 == 0 || arrLength == 0) return 0;

		int middleEl = inputArray[arrLength/2];
		boolean isLessThanOthers = true;
		for(int i = 0; i < inputArray.length; i++){
			if(inputArray[i] <= middleEl & i != arrLength/2) {
				isLessThanOthers = false;
			}
		}

		if(!isLessThanOthers) return 0;

		return 1;
	}
}
