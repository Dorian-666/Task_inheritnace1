public class Main {

    public static void main(String[] args){

        CPU cpu = new CPU("Intel", 2012, 3, 2.8);
        Storage storage = new Storage(12, 500);
        Model model = new Model("Pavillion");

        Acer acer = new Acer(cpu, storage, model,"Computer","Acer");

        System.out.println("Before change");


        System.out.println(" ");

        System.out.println("Device:"+acer.getDevice());
        System.out.println("Corporation:"+acer.getCorporation());

        acer.change();


        System.out.println(" ");

        System.out.println("After change");


        System.out.println(" ");

        System.out.println("Device:"+acer.getDevice());



        acer.getCpu().setSpeedCpu(4.0);
        acer.getCpu().setGeneration(9);

        acer.getStorage().setRam(4);
        acer.getStorage().setRom(256);

        acer.setCorporation("Hp");

        System.out.println("Corporation:"+acer.getCorporation());
        System.out.println("Device:"+acer.getDevice());

        acer.change();







    }
}
