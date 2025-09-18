/*
 * QueueCharArray.java
 * fall 2025
 * Dylan Neese
 * 
 * Queue approach has first and last point
 * to first and last elements in array.
 * The variable size is used to denote
 * an empty vs. full queue
 */
public class QueueCharArray {

	// data
	char data[]; //holds q value
	int front;  
	int back;
	int size;   // Current num
	int MAX;   // Max size of q

	// default constructor
	public QueueCharArray() {
        this(5);  //defult to 5

	}

	// alternate constructor
    // creates userspecified size
	public QueueCharArray(int max) {
        MAX = max;
        data = new char[MAX];
        front = 0;
        back = 0;
        size = 0;
	}

	// Clear Q
	public void clear() {
        front = 0;
        back = 0;
        size = 0;

	}

	// add to back of queue
	public void add(char v) {
        if(!full()){ //only add if not full
            data[back] = v;
            back = (back + 1) % MAX; // wrap around
            size++;  //increase size
        }
	}

	// see if queue is empty
	public boolean empty() {
		return size == 0;
	}

	// see if queue is full
	public boolean full() {
		return size == MAX;
	}

	// return element from front of queue
	public char front() {
		if (empty()) {
            return '?'; // returns ? if empty
            }
            return data[front];
	}

	// remove element from front of queue
	public boolean remove() {
		if (empty()) {
            return false; //empty Q
        
            }
            front = (front + 1) % MAX; //move front forward
            size--;   // size decrease
            return true;
        }
	
// return size of Q
	public int size() {
		return size;
	}

	 /**
     * use with println to display queue
     * 
     * @return String representation of the queue
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Queue: [");
        for (int i = 0; i < size; i++) {
            int idx = (front + i) % MAX; // calculates right intex wrap around
            sb.append(data[idx]);
            if (i < size - 1) 
                sb.append(", "); // commas between numbers exept last
            
        
        
        }
        

                sb.append("]");
               return sb.toString();

            }
        }// class
