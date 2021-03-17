import java.util.Random;

public class BagTester {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static  void main(String arg[]) {
		
		Random rand = new Random();
		
		ArrayBag bag = new ArrayBag();
		ArrayBag bag2 = new ArrayBag();		
		
				
		bag.add(1);
		bag.add(2);
		bag.add(3);
		bag.add(4);
		bag.add(5);
		bag.add(6);
		bag.add(7);
		bag.add(8);
		bag.add(9);
		bag.add(10);
		
		bag.displaybag();	
		
		bag.remove(1);
		
		System.out.println("Bag after removing 1");
		bag.displaybag();
		System.out.println("Does the bag contain 11? " + bag.contains(11));
		System.out.println("Size of the bag " + bag.numOfItems());
		
		bag2.add("Eggs");
		bag2.add("Lettuce");
		bag2.add("Onions");
		bag2.add("Garlic");
		bag2.add("Cheese");
		bag2.add("Carrots");
		bag2.add("Milk");
		bag2.add("Bread");
		bag2.add("Plates");
		bag2.add("Forks");
		
	    bag2.displaybag();	
		
		bag2.remove("Eggs");
		bag2.remove("Lettuce");
		
		System.out.println("Bag after removing Eggs");
		bag2.displaybag();
		System.out.println("Does the bag contain Plates? " + bag2.contains("Plates"));
		System.out.println("Size of the bag " + bag2.numOfItems());
	}
}