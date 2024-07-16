package interfaces.heranca_multipla.devices;

public class ComboDevice extends Device implements Scanner, Printer {

    public ComboDevice(String serialNumber) {
        super(serialNumber);
    }

    public void processDoc(String doc){
        System.out.println("Combo printing: " + doc);
    }
    public String scan(){
        return "Combo scan result";
    }

    public void print(String doc){
        System.out.println("Combo processing: " + doc);
    }

}
