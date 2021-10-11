public class PortableComputer extends ComputerImpl{
    String AGP; // видеокарта
    public PortableComputer(){}
    public PortableComputer (String name, String CPU, String RAM, String HDD, String AGP){
        super(name, CPU, RAM, HDD);
        this.AGP = AGP;
    }

}