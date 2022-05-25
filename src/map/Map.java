package map;

public interface Map<K, V>
{
   boolean containsKey(K key);
   boolean equals(Object obj);
   V get(K key);
   V put(K key, V value);
   V remove(K key);
  
   @Override
   String toString();
}