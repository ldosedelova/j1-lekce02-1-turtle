package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();

        for (int i = 0; i < 4 ; i++) {
            zofka.move(100);
            zofka.turnLeft(90);
        }

        zofka.move(100);

        zofka.turnLeft(30);
        zofka.move(100);
        zofka.turnLeft(120);
        zofka.move(100);
        zofka.turnLeft(30);

    }


}
