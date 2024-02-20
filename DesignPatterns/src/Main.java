import component.Beverage;
import component.DarkRoast;
import component.Espresso;
import component.HouseBlend;
import decorator.Mocha;
import decorator.Soy;
import decorator.Whip;

import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Beverage beverage = new Espresso();
//        System.out.println(beverage.getDescription() + " " + beverage.cost() + "$");
//
//        Beverage beverage2 = new DarkRoast();
//        beverage2 = new Mocha(beverage2);
//        beverage2 = new Mocha(beverage2);
//        beverage2 = new Whip(beverage2);
//        System.out.println(beverage2.getDescription() + " " + beverage2.cost() + "$");
//
//        Beverage beverage3 = new HouseBlend();
//        beverage3.setSize(Beverage.Size.LARGE);
//        beverage3 = new Soy(beverage3);
//        beverage3 = new Mocha(beverage3);
//        beverage3 = new Whip(beverage3);
//        System.out.println(beverage3.getDescription() + " " + beverage3.cost() + "$");


        int c;
        try {
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream(
                    "/Users/20036207/Desktop/DesignPatterns/src/test.txt")));
            while ((c = in.read()) >= 0)    {
                System.out.print((char) c);
            }
        }catch (IOException e)   {
            e.printStackTrace();
        }
    }
}