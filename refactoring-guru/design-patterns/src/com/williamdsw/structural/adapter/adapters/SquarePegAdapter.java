package com.williamdsw.structural.adapter.adapters;

import com.williamdsw.structural.adapter.classes.RoundPeg;
import com.williamdsw.structural.adapter.classes.SquarePeg;

public class SquarePegAdapter extends RoundPeg {

	private SquarePeg peg;

	public SquarePegAdapter(SquarePeg peg) {
		this.peg = peg;
	}

	@Override
	public double getRadius() {
		double halfWidth = (peg.getWidth() / 2);
		return (Math.sqrt(Math.pow(halfWidth, 2) * 2));
	}
}
