package interfaces.heranca_multipla.devices;

public class ConcretePrinter extends Device implements Printer {

    public ConcretePrinter(String serialNumber) {
        super(serialNumber);
    }

    public void processDoc(String doc){
        System.out.println("Printer processing: " + doc);
    }
    public void print(String doc){
        System.out.println("Printing: " + doc);
    }
}
