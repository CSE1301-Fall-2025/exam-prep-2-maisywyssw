package exam.codewriting;

import edu.princeton.cs.introcs.StdDraw;

public class Q02 {

	/**
	* Draw a dashed line from (x,0) to (x,1)
	* on a standard StdDraw canvas. The length of the
	* dashes and the space between the dashes should
	* both be 0.02.
	* @param x is the x coordinate for the dashed line
	*
	**/
	public static void dashedLine(double x) {
		//StdDraw.line(x,0.0,x,1.0);
		double space = 0.02;
		double y =0.0;
		while (y<1.0){
			StdDraw.line(x,y,x,y+space);
			y=y+space+space;


		}
	}

	public static void main(String[] args) {
		dashedLine(0.25);
	}

}
