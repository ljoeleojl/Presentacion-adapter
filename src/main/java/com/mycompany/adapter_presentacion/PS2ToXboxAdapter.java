/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adapter_presentacion;

class PS2ToXboxAdapter implements XboxController {

    private PS2Controller ps2;

    public PS2ToXboxAdapter(PS2Controller ps2) {
        this.ps2 = ps2;
    }

    public void pressA() {
        System.out.println("Adaptando A (Xbox) -> Cruz (PS2)");
        ps2.pressCross();
    }

    public void pressB() {
        System.out.println("Adaptando B (Xbox) -> Circulo (PS2)");
        ps2.pressCircle();
    }

    public void pressRT() {
        System.out.println("Adaptando RT (Xbox) -> R1 (PS2)");
        ps2.pressR1();
    }

    public void moveLeftStick(float x, float y) {

        System.out.println("Adaptando stick Xbox -> analogico PS2");

        ps2.moveAnalog(x, y);
    }
}
