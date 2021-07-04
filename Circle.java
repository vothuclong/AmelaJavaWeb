package com.company;

    public class Circle {
        public double radius;
        public String color;
        public boolean filled;

        public Circle() {
        }

        public Circle(double radius) {
            this.radius = radius;
        }

        public Circle(double radius, String color, boolean filled) {
            this.radius = radius;
            this.color = color;
            this.filled = filled;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public double getArea() {
            return radius * radius * Math.PI;
        }
        public double getPerimeter() {
            return 2 * radius * Math.PI;
        }


        @Override
        public String toString() {
            return "Circle{" +
                    "radius = " + radius +
                    '}';
        }
    }