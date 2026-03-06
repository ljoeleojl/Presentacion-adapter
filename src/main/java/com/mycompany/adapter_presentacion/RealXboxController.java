/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adapter_presentacion;

/**
 *
 * @author yisus
 */
public class RealXboxController implements XboxController {
    
    @Override
    public void pressA(){
        System.out.println("Entrada boton A (Xbox)");
    }

    @Override
    public void pressB(){
        System.out.println("Entrada boton B (Xbox)");
    }

    @Override
    public void pressRT(){
        System.out.println("Entrada Gatillo RT (Xbox)");
    }

    @Override
    public void moveLeftStick(float x, float y){
        System.out.println("Entrada joystick izquierdo (Xbox)"+ x + "," +y);
        
    }
}
