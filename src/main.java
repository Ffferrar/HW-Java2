public class main {
    public static void main(String[] args) throws Exception{
        Computer[] com = new Computer [6];
        com[0] = new PortableComputer("IMAC", "Core 235", "6 mb", "64 GB", "Videocard1");
        com[1] = new Laptop("Lenovo", "Core i5", "4 mb", "64 GB", "Videocard2");
        com[2] = new NetBook("Marusya", "Core hi", "32 mb", "128 GB", "Videocard3");
        com[3] = new Monoblock("Huawei", "Core hello", "6 mb", "64 GB");
        com[4] = new Server("PULL REQ", "Core world", "6 mb", "256 GB");
        com[5] = new Nettop("PE", "Core i696", "6 mb", "8 GB");

       // System.out.println(com[0].CPU);
        for (int i=0; i<6; i++){
            com[i].On(com[i].getClass().getName(), com[i].name);

            com[i].Param(com[i].getClass().getName(), com[i].name, com[i].CPU, com[i].RAM, com[i].HDD);
            com[i].Internet(com[i].getClass().getName(), com[i].name);

            com[i].Off(com[i].getClass().getName(), com[i].name);
            System.out.println("\n-------------------------\n");
        }
        //test.Internet(test.getClass().getName(), test.name);
    }
}
