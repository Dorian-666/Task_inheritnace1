public class Computer extends Device {
    private CPU cpu;

    private Storage storage;

    private Model model;
    Acer acer;

    public Computer(CPU givenCpu,Storage givenStroage,Model givenModel,String device) {
        super(device);
        cpu=givenCpu;
        storage = givenStroage;
        model=givenModel;

    }

    public CPU getCpu() {return cpu; }

    public Model getModel() { return model; }

    public Storage getStorage() { return storage; }


    public Acer getAcer() { return acer; }

    @Override
    public String getDevice() { return super.getDevice(); }

    public void change(){


        System.out.println("Model:"+model.getComputer_model());

        System.out.println("Year:"+cpu.getYearCpu());

        System.out.println("RAM:"+storage.getRam());
        System.out.println("ROM:"+storage.getRom());

        System.out.println("CPU:"+cpu.getModel());

        System.out.println("Generation:"+cpu.getGeneration());
        System.out.println("Speed:"+cpu.getSpeedCpu());
    }





}


