package project.warehouse;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

public class Stocktaking {

    private static final Path FILE = null;

    private Stocktaking() {
    }

    public static void registerBox(VesselBox box) throws IOException {
        BufferedWriter out = new BufferedWriter(new FileWriter(""));//find how-to
        out.write("");
        out.close();
    }

    public static void disposeBox(VesselBox box) {
    }

    public static void getInfo() {
    }
//информация о каждом новом ящике записывается в виде новой строки в формате #hashCode#name
}
