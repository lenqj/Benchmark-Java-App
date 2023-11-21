package Model;

public class Model {
    Processor processor;
    public Model(){
         this.processor = new Processor();
    }
    public Processor getProcessor(){
        return this.processor;
    }
}
