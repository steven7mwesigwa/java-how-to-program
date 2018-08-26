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
public class Box implements DrawShape {

    @Override
    public void drawShape() {
        System.out.println("*********");
        int boxLength = 0;
        while (boxLength <= 7) {
            System.out.println("*       *");
            boxLength++;
        }
        System.out.println("*********");

    }

}
