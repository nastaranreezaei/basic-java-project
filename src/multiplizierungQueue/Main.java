package multiplizierungQueue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
	/**
	 * This program fills a Queue with numbers from 1 to 50,
	 * then multiplies each number by a random number between 2 and 8,
	 * and prints the result.
	 */


	public static void main(String[] args) {
		Queue<Integer> zahlen = new LinkedList<Integer>();
		
		for(int i = 1;i<=50;i++) {
			zahlen.offer(i);
		}
		int a = (int) (Math.random()*7)+2;
		
		Integer b;
		while((b=zahlen.poll())!=null) {
			int ergebniss = b*a;
			
			System.out.println(b + " × " + a + " = " + ergebniss);

			
			
			
		}
		

	}

}
