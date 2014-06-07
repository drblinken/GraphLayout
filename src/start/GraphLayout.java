package start;

import original.Graph;

public class GraphLayout {
	public static void main(String[] args) {

		try {
			int exampleNumber = -1; // will trigger default of switch
			if (args.length > 0) {
				exampleNumber = Integer.valueOf(args[0]);
			}
			PseudoApplet applet = new Graph();
			addParametersForExample(exampleNumber, applet);
			applet.init();
			applet.start();
		} catch (NumberFormatException e) {
			System.out
					.println("usage: java start.GraphLayout [<examplenumber>]");
			System.out.println("examplenumber must be an integer");

		}

	}

	private static void addParametersForExample(int exampleNumber,
			PseudoApplet applet) {
		switch (exampleNumber) {
		case 1:
			applet.addParameter(
					"edges",
					"joe-food,joe-dog,joe-tea,joe-cat,joe-table,table-plate/50,plate-food/30,food-mouse/100,food-dog/100,mouse-cat/150,"
							+ "table-cup/30,cup-tea/30,dog-cat/80,cup-spoon/50,plate-fork,dog-flea1,dog-flea2,flea1-flea2/20,plate-knife");
			applet.addParameter("center", "joe");
			break;
		case 2:
			applet.addParameter("edges",
					"zero-one,one-two,two-three,three-four,four-five,five-six,six-seven,seven-zero");
			break;
		case 3:
			applet.addParameter(
					"edges",
					"zero-one,zero-two,zero-three,zero-four,zero-five,zero-six,zero-seven,zero-eight,zero-nine,one-ten,two-twenty,three-thirty,four-fourty,five-fifty,six-sixty,seven-seventy,eight-eighty,nine-ninety,ten-twenty/80,twenty-thirty/80,thirty-fourty/80,fourty-fifty/80,fifty-sixty/80,sixty-seventy/80,seventy-eighty/80,eighty-ninety/80,ninety-ten/80,one-two/30,two-three/30,three-four/30,four-five/30,five-six/30,six-seven/30,seven-eight/30,eight-nine/30,nine-one/30");
			break;
		case 4:
			applet.addParameter(
					"edges",
					"a1-a2,a2-a3,a3-a4,a4-a5,a5-a6,b1-b2,b2-b3,b3-b4,b4-b5,b5-b6,c1-c2,c2-c3,c3-c4,c4-c5,c5-c6,x-a1,x-b1,x-c1,x-a6,x-b6,x-c6");

			break;
		default:
		case 5:
			applet.addParameter("edges", "10-7,10-13,7-3,13-11,13-20,11-12");
			applet.addParameter("center", "10");
			break;

		}
	}
}
