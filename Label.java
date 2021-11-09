/**
 * Generic class
 * @param <K>
 * @param <V>
 */

public class Label<K,V extends Comparable<V>> implements Comparable<Label<K,V>>{
    K key; //reference of first generic type
    V value; //reference of second generic type

    //Getters:
    public K getKey() {return key;}
    public V getValue() {return value;}

    //Constructor:
    public Label(K key, V value) {
        this.key = key;
        this.value = value;
    }

    //TODO: Figure this one out
    // Test this. Pretty sure that second half of the if-and statement is correct, but we'll see.
    public boolean equals(Object obj) {
        if (obj instanceof Label && this.value.equals(((Label<?, ?>) obj).getValue())){ //this.value.equals(obj.value);
            return true;
        }
        return false;
    }

    //TODO:
    // There's no way this one is right
    // I've fallen behind in class and now I'm really fuckin worried
    public int compareTo(Label other) {
        return value.compareTo(other.getValue()); //if the generic specification is correct, there should be no need to cast anything
    }





}
