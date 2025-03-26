package drawing;

import java.io.IOException;
import java.io.Writer;
import java.util.List;

import drawing.shapes.Shape;
import drawing.writing.WriterStrategy;

/**
 * Refactor Task 3: (Mis-)Shaped
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22)
 */
public class Drawing {

    private List<Shape> shapes;

    public Drawing(List<Shape> shapes) {
        this.shapes = shapes;
    }

    /**
     * Draw shapes to a file with given file format.
     *
     * @param format   file format
     * @param filename file name
     */
    public void draw(WriterStrategy strategy, String filename) {
        try (Writer writer = strategy.createWriter(filename)) {
            for (Shape shape : shapes) {
                shape.draw(writer, shape.toLines());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
