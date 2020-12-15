package dssc.assignment.bank;

import java.util.HashMap;

public class TwoWayHashMap<K, V> extends HashMap<K, V> {
    HashMap<V, K> inverseMap = new HashMap<V, K>();

    @Override
    public V put(K key, V value) {
        this.remove(inverseMap.get(value));
        inverseMap.remove(this.get(key));
        inverseMap.put(value, key);
        return super.put(key, value);
    }

    @Override
    public V remove(Object key) {
        inverseMap.remove(this.get(key));
        return super.remove(key);
    }

    public K getKey(V value) {
        return inverseMap.get(value);
    }
}
