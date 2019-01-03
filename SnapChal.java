package snapChal;

import java.util.Arrays;
import java.util.Comparator;

//given an array of time intervals (start, end) for classroom lectures (possibly overlapping),
//find the minimum numbers of rooms required

public class SnapChal {

	private int start;
	private int end;


	public SnapChal() {

	}

	public SnapChal(int start, int end) {

		if (end> start) {


			this.start=start;
			this.end=end;

		}

	}

	public static void main(String[] args) {
		
		SnapChal snap1 = new SnapChal(30,50);
		SnapChal snap2 = new SnapChal(20,30);
		SnapChal snap3 = new SnapChal(20,30);
		SnapChal snap4 = new SnapChal(20,30);
		SnapChal snap5 = new SnapChal(20,30);

		SnapChal [] arraytest = {snap1,snap2,snap3,snap4,snap5};



		System.out.println(calcMinRooms (arraytest));
	}





	public static int calcMinRooms(SnapChal[] nodes) {

		int rooms  = 0;
		int max_r  = 0;
		int size = nodes.length;

		for(int index = 0; index < size; index++) {
			rooms = 1;

			for(int jndex = 0; jndex < size; jndex++) {

				// We check if the current index element falls into the range of jndex intervals.
				// If so, we increment the number of rooms.
				if(nodes[index].start > nodes[jndex].start && nodes[index].start < nodes[jndex].end ) {
					rooms += 1;
				}
				
				if (nodes[index].start == nodes[jndex].start && nodes[index].end== nodes[jndex].end 
						&& index !=jndex) {
					rooms += 1;
					
				}
			}

			// After the second loops, we check if the number of rooms is greater than
			// max_r, if so, we insert rooms into max_r variable.
			if(rooms > max_r) {
				max_r = rooms;
			}
		}



		return max_r;

	}


}


