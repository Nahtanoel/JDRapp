package model;
import java.util.HashMap;

public class liste extends module {
    public HashMap<String,Boolean> elements;
    public liste(String nom){
        super(nom);
        this.elements = new HashMap<String,Boolean>();
        this.elements.put("elem1", false);
        this.elements.put("elem2", true);
    }

    public HashMap<String,Boolean> getElements(){
        return this.elements;
    }

    public void setElements(String key, boolean value){
        this.elements.put(key, value);
    }
}
