public class Storage {

    private int ram,rom;

    public Storage(int ram,int rom){

        this.ram=ram;
        this.rom=rom;

    }

    public int getRam() {
        return ram;
    }

    public int getRom() {
        return rom;
    }

    public void setRam(int ram) {
        this.ram=ram;
    }

    public void setRom(int rom) {
        this.rom=rom;
    }
}
