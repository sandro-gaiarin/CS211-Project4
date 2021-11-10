/**
 * Generic class
 * @param <K>
 * @param <V>
 */

//TODO: Fix class declaration?
// IT'S PASSING TESTS BUT I DON'T KNOW WHY LMAO
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
    // IS THIS RIGHT???
    public int compareTo(Label<K,V> other) {
        return value.compareTo(other.getValue()); //if the generic specification is correct, there should be no need to cast anything
    }
}
