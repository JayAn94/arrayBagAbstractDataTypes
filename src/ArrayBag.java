import java.util.Arrays;

public class ArrayBag<T> implements Baggable<T> {

	private final T[] bag;
	private static final int MAX_CAPACITY = 10;
	int entry = 0;
	// Constructor to create an empty bag Array equal to DEFAULT_CAPACITY
	public ArrayBag() {
		this(MAX_CAPACITY);
	}

	public ArrayBag(int defaultCapacity) {
		@SuppressWarnings("unchecked")
		T[] tempBag = (T[]) new Object[defaultCapacity];
		this.bag = tempBag;
	}
	
	// Returns true if an item was added to the array
	@Override
	public boolean add(T newItem) {
		boolean result = true;		
		
		bag[entry] = newItem; // Adds new item
		entry++;  // Moved pointer to the next index to insert a value
		
		return result;
	}
	
	// Removes specific item if possible
	@Override	
	public boolean remove(T removeItem) {
		
		int index = getIndex(removeItem); // Gets the index of the passed value of removeItem
		
		T result = removeItem(index); // Sets the result of the value in index
		
		return removeItem.equals(result); // Removes the specified value in the array
		
	}
	
	// Gets the index of the specific value you want to remove
	private int getIndex(T entry) {
		int index = -1;
		
		for(int i = 0; i < bag.length; i++) {  // Searches the array for specified item
			if(contains(entry)) { 
				index = i;
				return index;
			} 
		}
		
		return index;
	}
	
	// Removes specified value and replaces duplicate item at the end of the index with null
	private T removeItem(int index) {
		T result = null;
		
		if (index >= 0) {
			for(int i = index; i < bag.length - 1; i++) { // Removes specified item
				bag[i] = bag[i + 1];		
			} 
			bag[MAX_CAPACITY - 1] = null; // Replaces the duplicate item at the end of the array with the removed item with null value
		}
		
		
		return result;
		
	}
	
	// Displays current size of the array
	@Override
	public int numOfItems() {
		int counter = 0;
		for(int i = 0; i < bag.length; i++) {
			if(bag[i] != null)
			counter++;
		}
		//System.out.println("Bag Size: " + counter);
		return counter;
	}

	
	// Check if array bag contains a specified item and returns true if found and false if not found
	@Override
	public boolean contains(T checkItem) {
		for(int i = 0; i < bag.length; i++) {
			if(bag[i] == checkItem)
				return true;
		
		}
		return false;
	}
	
	// Displays contents of the bag
	@Override
	public void displaybag() {
		System.out.println(Arrays.toString(bag));
	}

}
