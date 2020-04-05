public class Main {

    public static void main(String[] args){

        CPU cpu = new CPU("Intel", 2012, 3, 2.8);
        Storage storage = new Storage(12, 500);
        Model model = new Model("Hp", "Pavillion");

        Computer computer = new Computer(cpu, storage, model);

        System.out.println("Before change");

        System.out.println(" ");

        computer.change();

        System.out.println(" ");

        System.out.println("After change");

        System.out.println(" ");

        cpu.setSpeedCpu(4.0);
        cpu.setGeneration(9);

        storage.setRam(4);
        storage.setRom(256);

        computer.change();



    }
}
