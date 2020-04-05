public class Model {
    private String corporation,computerModel;

    public Model(String corporation,String computerModel){

        this.corporation =corporation;
        this.computerModel = computerModel;


    }

    public String getCorporation() {
        return corporation;
    }

    public String getComputer_model() {
        return computerModel;
    }
}
