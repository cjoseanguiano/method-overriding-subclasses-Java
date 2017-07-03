package com.devix.www;

public class Main {

    public static void main(String[] args) {

        Figure figure = new Rentangle(9, 5);
        Rentangle rentangle = new Rentangle(9, 5);
        Figure figref;
        figref = figure;
        System.out.println("Area is : " + figref.area());
        figref = rentangle;
        System.out.println("Area is : " + figref.area());
    }

    private static class Figure {
        double dim1;
        double dim2;

        Figure(double a, double b) {
            dim1 = a;
            dim2 = b;
        }

        Double area() {
            System.out.println("Inside area for figure");
            return (dim1 * dim2);
        }
    }

    private static class Rentangle extends Figure {
        public Rentangle(int a1, int b1) {
            super(a1, b1);
        }

        Double area() {
            System.out.println("Inside area for rentangle");
            return (dim1 * dim2);
        }
    }
}
