public class Acer extends Computer{

    private String corporation;

    public Acer(CPU givenCpu, Storage givenStroage, Model givenModel, String device,String corporation) {

        super(givenCpu, givenStroage, givenModel, device);
        this.corporation=corporation;
    }


    public String getCorporation() {
        return corporation;
    }

    public void setCorporation(String model) {
        this.corporation = corporation;
    }
}
