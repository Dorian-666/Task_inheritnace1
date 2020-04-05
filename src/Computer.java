public class Computer {
    CPU cpu;

    Storage storage;

    Model model;
    public Computer(CPU givenCpu,Storage givenStroage,Model givenModel){

        cpu=givenCpu;
        storage = givenStroage;
        model=givenModel;

    }
    public void change(){

        System.out.println("Model:"+model.getComputer_model());
        System.out.println("Corporation:"+model.getCorporation());

        System.out.println("RAM:"+storage.getRam());
        System.out.println("ROM:"+storage.getRom());

        System.out.println("CPU:"+cpu.getModel());
        System.out.println("Year:"+cpu.getYearCpu());
        System.out.println("Generation:"+cpu.getGeneration());
        System.out.println("Speed:"+cpu.getSpeedCpu());
    }





}
