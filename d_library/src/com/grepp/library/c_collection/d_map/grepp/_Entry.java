package com.grepp.library.c_collection.d_map.grepp;

import java.util.Objects;

public class _Entry<K,V> {

    private K Key;
    private V value;

    public _Entry(K key, V value) {
        this.Key = key;
        this.value = value;
    }

    public K getKey() {
        return Key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof _Entry<?, ?> entry)) {
            return false;
        }
        return Objects.equals(Key, entry.Key);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(Key);
    }

    @Override
    public String toString() {
        return "_Entry{" +
            "Key=" + Key +
            ", value=" + value +
            '}';
    }
}
