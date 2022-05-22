package ShapesThreeDimensional;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.TypeCheckError;

public interface ShapeThreeDimensional {
    double calculateSurfaceArea() throws TypeCheckError;

    double calculateVolume() throws TypeCheckError;

}
