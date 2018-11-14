import java.util.*;

public class Controller {

    Elevator[] arr;
    
    public Controller(int num) {
	this.arr = new Elevator[num];
	populateElevators();
    }

    public void populateElevators() {
	for (int i = 0; i < this.arr.length; i++) {
	    this.arr[i] = new Elevator(1, 0, 0, new PriorityQueue<Integer>());
	}
    }

    public int findAvailableElevator(int callFloor, int direction) {
	int minDiff = 100;
	int minIndex = -1;
	int minDirection = -1;
	for (int i = 0; i < this.arr.length; i++) {
	    Elevator curr = this.arr[i];
	    /* 
	       To determine the next elevator to choose, need to determine the minDiff between the
	       curr elevator's floor and the calling floor, as well as if they are going the same direction.
	     */
	}
    }

    public void moveElevator(int index, int newFloor) {
	this.arr[index].floor = newFloor;
    }

    public void printElevators() {
	for (Elevator e: this.arr) {
	    for (int i = 0; i < e.floor; i++) {
		System.out.print("X");
	    }
	    System.out.println();
	}
    }

    public static void main(String[] args) {
	Controller cont = new Controller(4);
	cont.moveElevator(0, 1);
	cont.moveElevator(1, 5);
	cont.moveElevator(2, 2);
	cont.moveElevator(3, 4);
	cont.printElevators();

    }

}