package interfaces.heranca_multipla.application;

import interfaces.heranca_multipla.devices.ComboDevice;
import interfaces.heranca_multipla.devices.ConcretePrinter;
import interfaces.heranca_multipla.devices.ConcreteScanner;

public class Program {

    //é argumentado que isso não é herança multipla pois não existe reuso;

    public static void main(String[] args) {
        ConcretePrinter p = new ConcretePrinter("1080");
        p.processDoc("My Email");
        p.print("My Letter");

        System.out.println();
        ConcreteScanner s = new ConcreteScanner("2003");
        s.processDoc("My Email");
        System.out.println("Scan result: " + s.scan());

        System.out.println();
        ComboDevice c = new ComboDevice("2081");
        c.processDoc("My dissertation");
        c.print("My Dissertation");
        System.out.println("Scan result: " + c.scan());
    }
}
