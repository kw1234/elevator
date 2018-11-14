import java.util.*;


/*

  elevator starts on bottom floor.

  person gets in elevator, presses button to go to certain floor. elevator is now on floor 3.

  It is at a standstill.



  There are two modes:
  1) someone on a floor calling an elevator
  2) 

 */

public class Elevator {

    int direction;
    int state;
    int floor;
    PriorityQueue<Integer> floorQue;

    public Elevator(int direction, int state, int floor, PriorityQueue<Integer> que) {
	this.direction = direction;
	this.state = state;
	this.floor = floor;
	this.floorQue = que;
    }

    public static void main(String[] args) {


    }

}