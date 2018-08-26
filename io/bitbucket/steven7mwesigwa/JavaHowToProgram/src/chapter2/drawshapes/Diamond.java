/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2.drawshapes;

/**
 *
 * @author jaguar
 */
public class Diamond implements DrawShape {

    @Override
    public void drawShape() {
        System.out.printf("%s*%s%n", "    ", "    ");
        System.out.printf("%s*%s*%s%n", "   ", " ", "   ");
        System.out.printf("%s*%s*%s%n", "  ", "   ", "  ");
        System.out.printf("%s*%s*%s%n", " ", "     ", " ");
        System.out.printf("*%s*%n", "       ");
        System.out.printf("%s*%s*%s%n", " ", "     ", " ");
        System.out.printf("%s*%s*%s%n", "  ", "   ", "  ");
        System.out.printf("%s*%s*%s%n", "   ", " ", "   ");
        System.out.printf("%s*%s%n", "    ", "    ");

    }

}
