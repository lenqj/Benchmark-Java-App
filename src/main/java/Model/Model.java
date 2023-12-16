package Model;

public class Model {
    private final Processor processor;
    private final GPU gpu;
    private final RAM ram;
    public Model(){
         this.processor = new Processor();
         this.gpu = new GPU();
         this.ram = new RAM();
    }
    public Processor getProcessor(){
        return this.processor;
    }

    public GPU getGpu() {
        return this.gpu;
    }

    public RAM getRam() {
        return this.ram;
    }
}
