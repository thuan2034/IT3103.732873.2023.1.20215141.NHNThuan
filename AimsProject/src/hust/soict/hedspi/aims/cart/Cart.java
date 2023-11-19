public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private int qtyOrdered;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

	public Cart() {
		qtyOrdered = 0; // Initialize the quantity ordered to 0 when a Cart object is created.
	}
	// Method to add a DigitalVideoDisc to the cart
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered < MAX_NUMBERS_ORDERED) {
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered++;
			System.out.println("Added " + disc.getTitle() + " to the cart.");
		} else {
			System.out.println("Cart is full, cannot add more items.");
		}
	}

	// ... (Previous code remains the same)

	// Method to remove a DigitalVideoDisc from the cart
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		boolean found = false;
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemsOrdered[i] == disc) {
				// Shift remaining items to cover the removed item
				for (int j = i; j < qtyOrdered - 1; j++) {
					itemsOrdered[j] = itemsOrdered[j + 1];
				}
				qtyOrdered--;
				itemsOrdered[qtyOrdered] = null; // Remove the last reference
				found = true;
				System.out.println("Removed " + disc.getTitle() + " from the cart.");
				break;
			}
		}
		if (!found) {
			System.out.println("Item not found in the cart.");
		}
	}

	// Method to calculate the total cost of items in the cart
	public float totalCost() {
		float total = 0.0f;
		for (int i = 0; i < qtyOrdered; i++) {
			total += itemsOrdered[i].getCost();
		}
		return total;
	}

	// Method to display the items in the cart
	public void showCart() {
		if (qtyOrdered == 0) {
			System.out.println("The cart is empty.");
		} else {
			System.out.println("Items in the cart:");
			for (int i = 0; i < qtyOrdered; i++) {
				System.out.println((i + 1) + ". " + itemsOrdered[i].getTitle() + " - $" + itemsOrdered[i].getCost());
			}
		}
	}

	// Getter for the quantity ordered
	public int getQtyOrdered() {
		return qtyOrdered;
	}

}
