package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {
    Turtle zofka;
    public void main(String[] args) {

        zofka = new Turtle();

//        nakresliSnehulaka();
//
//        nakresliLokomotivu();
//
//        nakresliZmrzlinu();

        double stranaC;
        double velikostRamene = 170.0;
        double uhelMeziRameny = 46.0;
        stranaC = vypocitejDelkuTretiStrany(velikostRamene, uhelMeziRameny);
        System.out.println("Strana A je " + velikostRamene + ", strana B je "
            + velikostRamene + " a uhel mezi nimi je " + uhelMeziRameny + "°");
        System.out.println("Pak je strana C dlouha " + stranaC);



    }




    public void nakresliCtverec ( int delkaStrany){
        for (int i = 0; i < 4; i++) {
            zofka.move(delkaStrany);
            zofka.turnLeft(90);
        }
    }

    public void nakresliPravouhlyTrojuhelnik(int velikostRamene, int stranaC){
        zofka.turnRight(45);
        zofka.move(stranaC);
        zofka.turnRight(135);
        zofka.move(velikostRamene);
        zofka.turnRight(90);
        zofka.move(velikostRamene);
        zofka.turnRight(90);
    }

    public void nakresliRovnoramennyTrojuhelnik(int stranaC, int velikostRamene,
                                                int uhelA, int uhelB) {
        zofka.turnRight(90);
        zofka.move(stranaC);
        zofka.turnRight(180 - uhelA);
        zofka.move(velikostRamene);
        zofka.turnRight(180 - uhelB);
        zofka.move(velikostRamene);
        zofka.turnRight(180 - uhelA);
    }

    public void nakresliObdelnik ( int delkaStranyA, int delkaStranyB){
        zofka.move(delkaStranyA);
        zofka.turnRight(90);
        zofka.move(delkaStranyB);
        zofka.turnRight(90);
        zofka.move(delkaStranyA);
        zofka.turnRight(90);
        zofka.move(delkaStranyB);
        zofka.turnRight(90);
    }

    public void nakresliKruh ( int delkaStrany){
        zofka.turnRight(90);
        for (int i = 0; i < 36; i++) {
            zofka.move(delkaStrany);
            zofka.turnLeft(10);
        }
        zofka.turnLeft(90);
    }

    public double vypocitejDelkuTretiStrany(double velikostRamene, double uhelMeziRameny) {
        double tretiStrana;
        tretiStrana = Math.abs((velikostRamene
                * Math.sin((uhelMeziRameny * Math.PI / 180.0) /2.0)) * 2.0);
        return (int) tretiStrana;
    }

    public void nakresliSnehulaka(){
        zofka.setLocation(450, 400);
        nakresliKruh(14);
        zofka.penUp();
        zofka.move(160);
        zofka.penDown();
        nakresliKruh(10);
        zofka.penUp();
        zofka.move(116);
        zofka.penDown();
        nakresliKruh(6);
        zofka.turnRight(90);
        zofka.penUp();
        zofka.move(62);
        zofka.turnRight(90);
        zofka.move(55);
        zofka.turnLeft(90);
        zofka.penDown();
        nakresliKruh(2);
        zofka.turnLeft(180);
        zofka.penUp();
        zofka.move(116);
        zofka.penDown();
        nakresliKruh(2);
        zofka.turnRight(90);
    }
    public void nakresliLokomotivu() {
        zofka.setLocation(700, 400);
        nakresliKruh(14);
        zofka.turnLeft(90);
        zofka.penUp();
        zofka.move(75);
        zofka.turnRight(90);
        zofka.move(75);
        zofka.penDown();
        nakresliObdelnik(250, 160);
        zofka.turnLeft(90);
        nakresliObdelnik(260, 120);
        zofka.turnLeft(90);
        zofka.penUp();
        zofka.move(40);
        zofka.turnRight(90);
        zofka.move(60);
        zofka.penDown();
        nakresliKruh(6);
        zofka.penUp();
        zofka.move(100);
        zofka.penDown();
        nakresliKruh(6);
        zofka.penUp();
        zofka.move(220);
        zofka.penDown();
        zofka.turnRight(90);
        nakresliPravouhlyTrojuhelnik(120, 170);
    }

    public void nakresliZmrzlinu() {
        nakresliRovnoramennyTrojuhelnik(133, 170, 67, 46);
        zofka.penUp();
        zofka.move(62);
        zofka.turnRight(90);
        zofka.move(45);
        zofka.turnRight(180);
        zofka.penDown();
        nakresliKruh(12);

    }
}
