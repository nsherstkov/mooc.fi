public class Pair<K,V> {
    
    private K Key;
    private V value;
 
    public Pair(K Key, V value) {
        this.Key = Key;
        this.value = value;
    }
 
    public K getKey() {
        return this.Key;
    }
 
    public V getValue() {
        return this.value;
    }
 
    public void setValue(V value) {
        this.value = value;
    }    
}