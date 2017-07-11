package Converter;
import Geometry.*;
import java.lang.reflect.Field;


public class Converting
{
    public static String convertToXML(Shape shape)throws IllegalAccessException{
       
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
        stringBuilder.append("<shape>")
        .append("\t<class>").append(shape.getClass().getName()).append("</class>");
        stringBuilder.append("\t<properties>");
        for (Field field : shape.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            stringBuilder.append("\t\t<property>")
            .append("\t\t").append("<").append(field.getName().toLowerCase()).append(">")
            .append(field.get(shape)).append("</").append(field.getName().toLowerCase())
            .append(">");
            stringBuilder.append("\t\t</property>");
        }
        stringBuilder.append("\t</properties>").append("</shape>");
        return stringBuilder.toString();
    }

    public static String convertToJSON(Shape shape) throws IllegalAccessException{

        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("{\n");
        stringBuilder.append("\tclass :").append(shape.getClass().getName()).append(",");
        stringBuilder.append("\tproperties: {");
        for (Field field : shape.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            stringBuilder.append("\t\t").append(field.getName().toLowerCase()).append(": " )
            .append(field.get(shape))
            .append(",\n");
        }
        stringBuilder.append("}\n");
        return stringBuilder.toString();
    }
}

