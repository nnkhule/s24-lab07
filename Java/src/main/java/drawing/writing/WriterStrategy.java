package drawing.writing;

import java.io.IOException;
import java.io.Writer;

public interface WriterStrategy {
    Writer createWriter(String filename) throws IOException;
}