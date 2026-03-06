/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adapter_presentacion;

class PS2Controller {

    void pressCross() {
        System.out.println("Entrada boton cruz (PS2)");
    }

    void pressCircle() {
        System.out.println("Entrada boton circulo (PS2)");
    }

    void pressR1() {
        System.out.println("Entrada boton R1 (PS2)");
    }

    void moveAnalog(float horizontal, float vertical) {
        System.out.println("Joystick PS2 movido: " + horizontal + ", " + vertical);
    }
}
