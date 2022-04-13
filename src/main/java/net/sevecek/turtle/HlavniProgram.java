package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {
        Turtle zofka;

    public void main(String[] args) {

        zofka = new Turtle();
        /*
        for (int i = 0; i < 4; i++) {
            nakresliDomecek();
        }
       */

        nakresliDomecek();
        nakresliPrasatko();


    }

    private void nakresliPrasatko() {
        for (int i = 0; i < 2; i++) {
            zofka.turnLeft(30);
            zofka.move(20);
            zofka.turnLeft(120);
            zofka.move(20);
            zofka.turnRight(60);
            zofka.penUp();
            zofka.move(80);
            zofka.penDown();
            zofka.turnRight(90);
        }

        zofka.turnRight(90);
        zofka.penUp();
        zofka.move(190);
        zofka.turnLeft(90);
        zofka.move(20);
        zofka.penDown();

        nakresliObdelnik();
        zofka.move(50);
        zofka.turnLeft(90);
        zofka.move(100);
        hlavaPrasatka();
    }

    private void hlavaPrasatka() {
        zofka.turnLeft(30);
        zofka.move(50);
        zofka.turnLeft(120);
        zofka.move(50);
    }

    private void nakresliDomecek() {
        nakresliCtverec();
        zofka.move(100);
        nakresliTrojuhelnik();
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.penUp();
        zofka. move(200);
        zofka.penDown();
        zofka.turnLeft(90);
    }

    public void  nakresliCtverec(){
        for (int i = 0; i < 4 ; i++) {
            zofka.move(100);
            zofka.turnLeft(90);
        }
    }

    public void nakresliTrojuhelnik(){
        zofka.turnLeft(30);
        zofka.move(100);
        zofka.turnLeft(120);
        zofka.move(100);
        zofka.turnLeft(30);
    }

    public void nakresliObdelnik(){
        for (int i = 0; i < 2; i++) {
            zofka.move(50);
            zofka.turnLeft(90);
            zofka.move(100);
            zofka.turnLeft(90);
        }

    }





}
