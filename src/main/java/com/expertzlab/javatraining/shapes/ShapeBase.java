package com.expertzlab.javatraining.shapes;

/**
 * Created by gireeshbabu on 20/11/16.
 */
public class ShapeBase {

    //Inner Class
    public static class Color {
        float m_red, m_green, m_blue;

        public Color() {
            // call the other overloaded Color constructor by passing default values
            this(0, 0, 0);
        }

        public Color(float red, float green, float blue) {
            m_red = red;
            m_green = green;
            m_blue = blue;
        }

        public String toString() {
            return " red = " + m_red + " green = " + m_green + " blue = " + m_blue; // other color members elided
        }
    }
}
