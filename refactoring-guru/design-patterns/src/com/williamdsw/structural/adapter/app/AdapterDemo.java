package com.williamdsw.structural.adapter.app;

import java.util.Random;

import com.williamdsw.structural.adapter.adapters.SquarePegAdapter;
import com.williamdsw.structural.adapter.classes.RoundHole;
import com.williamdsw.structural.adapter.classes.RoundPeg;
import com.williamdsw.structural.adapter.classes.SquarePeg;

public class AdapterDemo {

	public static void adapterDemo() {
		RoundHole roundHole = new RoundHole(5);
		RoundPeg roundPeg = new RoundPeg(5);
		if (roundHole.itFits(roundPeg)) {
			String str = "Round peg with %1s radius fits round role with %2s radius";
			str = String.format(str, roundPeg.getRadius(), roundHole.getRadius());
			System.out.println(str);
		}

		final int NUMBER_OF_SQUARE_PEGS = 3;
		for (int i = 0; i < NUMBER_OF_SQUARE_PEGS; i++) {
			Random random = new Random();
			double width = random.nextInt(20);
			SquarePeg squarePeg = new SquarePeg(width);

			SquarePegAdapter adapter = new SquarePegAdapter(squarePeg);
			String fits = (roundHole.itFits(adapter) ? "fits" : "doesn't fit");
			String str = "Square peg with %1s width adapted to %2s radius %3s round role with %4s radius";
			str = String.format(str, squarePeg.getWidth(), adapter.getRadius(), fits, roundHole.getRadius());
			System.out.println(str);
		}
	}

}
