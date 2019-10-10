import java.util.HashMap;

public class CareTaker {
    private HashMap<String, Memento> savedStates = new HashMap<>();

    public void addMemento(String name, Memento m) {
        savedStates.put(name, m);
    }

    public Memento getMemento(String name) {
        return savedStates.get(name);
    }
}