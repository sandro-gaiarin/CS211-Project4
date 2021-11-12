/**
 * Generic class, uses Comparable as an interface
 * @version 1.0
 * @author Alessandro Gaiarin
 * @param <K>
 * @param <V> this parameter should be a child class of Comparable
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

    /**
     * Compares the arg object against this.Label.
     * @param obj any Object
     * @return returns True if the argument Object matches this.Label. Otherwise it returns false.
     */
    public boolean equals(Object obj) {
        if (obj instanceof Label && this.value.equals(((Label<?, ?>) obj).getValue())){ //this.value.equals(obj.value);
            return true;
        }
        return false;
    }

    /**
     * Okay, this one is kind of weird and I still am not sure I completely understand it.
     * Basically, this one will compare the value of this.Label to the label that's passed in, using the
     * superclass compareTo.
     * @param other a Label object. K,V should be the same objects as used here, I believe.
     * @return Int, dictates which Label object comes first.
     * @see Music#compareTo(Media) uses a similar methodology for the return
     */
    public int compareTo(Label<K,V> other) {
        return value.compareTo(other.getValue()); //if the generic specification is correct, there should be no need to cast anything
    }
}
