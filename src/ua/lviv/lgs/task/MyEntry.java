package ua.lviv.lgs.task;

public class MyEntry<K,V> {
    private V v;
    private K k;

    public MyEntry(K k,V v) {
        this.v = v;
        this.k = k;
    }

    public K getK() {
        return k;
    }

    public void setT(K K) {
        this.k = k;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }

    @Override
    public String toString() {
        return "MyEntry{" +
                "t=" + k +
                ", v=" + v +
                '}';
    }
}
