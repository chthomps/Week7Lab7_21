

//Code (except Exercise2 removeBottomHalf) taken from "Additional Examples"
// This class implements a Stack ADT as a linked list
		public class LinkedStack {
			
			LinkedNode front; // Reference to the first LinkedNode in the list
			int count; // Number of nodes in the list

			// Constructor - initializes the front and count variables
			LinkedStack() {
				front = null;
				count = 0;
			}

			// Implements the push operation
			void push(int x) {
				LinkedNode newNode = new LinkedNode(x);
				newNode.next = front;
				front = newNode;
				count++;
			}

			// Implements the pop operation
			int pop() {
				int x = front.x;
				front = front.next;
				count--;
				return x;
			}

			// Implements the peek operation
			int peek() {
				return front.x;
			}

			// Implements the isEmpty operation
			boolean isEmpty() {
				return front == null;
			}

			// Implements the size operation
			int size() {
				return count;
			}

			// This method returns a String containing
			// a space separated representation of the underlying linked list
			public String toString() {
				String str = "";

				LinkedNode cur = front;
				while (cur != null) {
					str += cur.x + " ";
					cur = cur.next;
				}

				return str;
			}
			
			// Exercise 2
			// Method removing elements from the bottom half of any stack
			public void removeBottomHalf(LinkedStack half) {

				// Declare and initialize variables
				int x = (half.size() / 2);
				LinkedNode currentNode = half.front;

				// Time complexity should be O(N)
				// Loop through until the middle node of the LinkedList is found  
				for (int index = 0; index < x-1; index++) {
					currentNode = currentNode.next;
				}

				// Break link by setting node to null 
				currentNode.next = null;

			}

		
		
	}



