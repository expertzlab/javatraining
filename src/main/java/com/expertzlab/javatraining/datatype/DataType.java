package com.expertzlab.javatraining.datatype;

/**
 * Created by gireeshbabu on 13/06/17.
 */

import com.expertzlab.javatraining.circle.AreaCalculator;
import static com.expertzlab.javatraining.circle.AreaCalculator.radius;

public class DataType {

    public static void main(String[] args) {

            AreaCalculator areaCalculator = new AreaCalculator(10);
            float area = areaCalculator.getArea();
            System.out.println("Area =" + area);
            System.out.println(""+radius);
    }
}
