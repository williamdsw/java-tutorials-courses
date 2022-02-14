package simple.gui;

import java.awt.Color;

/**
 * @author William
 */

// SIMPLE GUI
public class Slice {
    private final double value;
    private final Color color;

    public Slice(double value, Color color) {
        this.value = value;
        this.color = color;
    }

    public double getValue() {
        return value;
    }

    public Color getColor() {
        return color;
    }
}