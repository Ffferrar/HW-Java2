public class Computer
{
    String name;
    String CPU; //процессор
    String RAM; // озу
    String HDD; // жестки диск
    public Computer (String name, String CPU, String RAM, String HDD){
        this.name = name;
        this.CPU = CPU;
        this.RAM = RAM;
        this.HDD = HDD;
    }
    public Computer(){}
    void On (String Type, String Model){
            System.out.println (Type + " " + Model + " Включён" + "\n");
        }
    void Off (String Type, String Model){
        System.out.println (Type + " " + Model + " Выключен" + "\n");
        }
    void Internet (String Type, String Model){
        System.out.println(Type + " " + Model + " Подключён к интернету" + "\n");
    }
    void Param (String Type, String Model, String CPU, String RAM, String HDD){
        System.out.println ("Parametrs of " + Type + " " + Model + ":\n");
        System.out.println ("Процессор: " + CPU);
        System.out.println ("ОЗУ: " + RAM);
        System.out.println ("Жесткий диск: " + HDD);
    }
}

class Keyboard{

}

class Displey{}
