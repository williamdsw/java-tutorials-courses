package simple.gui;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.image.MemoryImageSource;

/**
 * @author William
 */

// SIMPLE GUI
public class TransparentCursor {
    public Cursor createTransparentCursor() {
        int[] pixels = new int[16 * 16];
        MemoryImageSource memoryImageSource = new MemoryImageSource(16, 16, pixels, 0, 16);
        Image image = Toolkit.getDefaultToolkit().createImage(memoryImageSource);
        Point point = new Point(0, 0);
        Cursor cursor = Toolkit.getDefaultToolkit().createCustomCursor(image, point, "invisibleCursor");
        return cursor;
    }
}