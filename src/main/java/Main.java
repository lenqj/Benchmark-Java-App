import Controller.Controller;
import View.*;
import Model.*;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        new Controller(view, model);
    }
}