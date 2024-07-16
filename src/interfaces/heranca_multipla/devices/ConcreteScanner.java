package interfaces.heranca_multipla.devices;

public class ConcreteScanner extends Device implements Scanner{

    public ConcreteScanner(String serialNumber) {
        super(serialNumber);
    }

    public void processDoc(String doc){
        System.out.println("Scanner processing: " + doc);
    }
    public String scan(){
        return "Scanner content";
    }
}
