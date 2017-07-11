package Geometry;
import Converter.*;

public abstract class Shape {

    public void toXML() throws IllegalAccessException {
        Converting.convertToXML(this);
    }

    public void toJSON() throws IllegalAccessException {
        Converting.convertToJSON(this);
    }
}