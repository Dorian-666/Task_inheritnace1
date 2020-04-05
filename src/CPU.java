public class CPU {
    private String Model;

    private int yearCpu,generation;

    private double speedCpu;
    public CPU(String m,int yC,int g,double sC){

        Model=m;
        yearCpu=yC;
        generation =g;
        speedCpu=sC;

    }
    public String getModel(){
        return Model;
    }

    public int getYearCpu(){
        return yearCpu;
    }

    public int getGeneration() {
        return generation;
    }

    public void setGeneration(int i){
        this.generation=generation;
    }

    public double getSpeedCpu() {
        return speedCpu;
    }

    public void  setSpeedCpu(double speedCpu){
        this.speedCpu=speedCpu;

    }



}
