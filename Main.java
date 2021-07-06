package com.company;

public class Main {
    public static void main(String[] args){
        Shape[] shapes = new Shape[5];
        shapes[0] = new Square(1.2);
        shapes[1] = new Circle(2.5);
        shapes[2] = new Rectangle(2.2, 5.5);

        for (Shape shape : shapes){
            System.out.println(shape.toString());
            if (shape instanceof Colorable){
                ((Colorable)shape).howToColor();
            }
        }
    }
}