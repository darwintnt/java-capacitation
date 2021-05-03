package utils;

import static java.lang.Math.sqrt;
import static java.lang.Math.ceil;
import static java.lang.Math.floor;
import static java.lang.Math.pow;
import static java.lang.Math.PI;


import static java.lang.System.out;

public class Operation {

    public static void main(String[] args) {
        double x = 6.36;
        double y = 2;

        out.println(sqrt(2));
        out.println(ceil(x));
        out.println(floor(x));
        out.println(pow(y,3));
    }

    public static double getCircleArea(double value) {
        return PI * pow(value,2);
    }

    public static double getSphereArea(double value) {
        return 4 * PI * pow(value,2);
    }

    public static double getSphereVolume(double value) {
        return (4/3) * PI * pow(value,3);
    }

}
