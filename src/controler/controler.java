package controler;

import model.*;
import view.*;

public class controler {
    private View view;
    private model model;
    public controler(){
        System.out.println("controler");
        this.model = new model();
        this.view = new View();
    }
}
