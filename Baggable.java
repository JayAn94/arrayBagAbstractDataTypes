
public interface Baggable<T> {
	
	// Adds a new entry into the bag
	public boolean add(T newItem);	
	
	// Removes specified entry from the bag
	public boolean remove(T removeItem);
	
	// Displays the current size of the bag
	public int numOfItems();
	
	// Displays all contents inside of the bag
	public void displaybag();
	
	// Returns true or false if specified item is inside the bag
	boolean contains(T checkEntry);
	
}
