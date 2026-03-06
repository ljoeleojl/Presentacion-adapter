/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adapter_presentacion;

import java.util.Scanner;

class Game {

    private XboxController controller;

    public Game(XboxController controller) {
        this.controller = controller;
    }

    public void play() {

        System.out.println("Jugador salta");
        controller.pressA();

        System.out.println("Jugador hace truco");
        controller.pressB();

        System.out.println("Jugador acelera");
        controller.pressRT();

        System.out.println("Jugador se mueve");
        controller.moveLeftStick(0.7f, 0.2f);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Seleccione control:");
        System.out.println("1. Xbox");
        System.out.println("2. PS2");
        
        int opcion = sc.nextInt();
        
        XboxController controller = new RealXboxController();
        
        switch(opcion){
            case 1: 
                break;
            case 2:
                PS2Controller ps2 = new PS2Controller();
                controller = new PS2ToXboxAdapter(ps2);
                break;
            default:
                System.out.println("Control no registrado");
                break;
        }

        Game game = new Game(controller);

        game.play();
    }
}
