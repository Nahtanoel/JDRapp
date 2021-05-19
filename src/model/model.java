package model;
import java.util.ArrayList;

public class model {
    public ArrayList<module> modules;
    public model(){
        this.modules = new ArrayList<module>();
        this.modules.add(new compteur("PV"));
        this.modules.add(new compteur("Mana"));
    }
}
