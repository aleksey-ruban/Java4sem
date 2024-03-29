package unit3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MapUnit3<K, V> implements Map<K, V> { // Имплементация интерфейса Map

    private final Map<K, V> map; // Переменая, хранящая объект Map
    private static final Lock lock = new ReentrantLock(); // Мьютекс для синхронихации операций

    public MapUnit3() {
        this.map = new HashMap<>();
    } // Конструтор

    @Override
    public int size() {
        lock.lock(); // Блокирование доступа к объекту map
        try {
            return map.size();
        } finally {
            lock.unlock(); // Разблокировка объекта map
        }
    }

    @Override
    public boolean isEmpty() {
        lock.lock();
        try {
            return map.isEmpty();
        } finally {
            lock.unlock();
        }
    }

    @Override
    public boolean containsKey(Object key) {
        lock.lock();
        try {
            return map.containsKey(key);
        } finally {
            lock.unlock();
        }
    }

    @Override
    public boolean containsValue(Object value) {
        lock.lock();
        try {
            return map.containsValue(value);
        } finally {
            lock.unlock();
        }
    }

    @Override
    public V get(Object key) {
        lock.lock();
        try {
            return map.get(key);
        } finally {
            lock.unlock();
        }
    }

    @Override
    public V put(K key, V value) {
        lock.lock();
        try {
            return map.put(key, value);
        } finally {
            lock.unlock();
        }
    }

    @Override
    public V remove(Object key) {
        lock.lock();
        try {
            return map.remove(key);
        } finally {
            lock.unlock();
        }
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        lock.lock();
        try {
            map.putAll(m);
        } finally {
            lock.unlock();
        }
    }

    @Override
    public void clear() {
        lock.lock();
        try {
            map.clear();
        } finally {
            lock.unlock();
        }
    }

    @Override
    public Set<K> keySet() {
        lock.lock();
        try {
            return map.keySet();
        } finally {
            lock.unlock();
        }
    }

    @Override
    public Collection<V> values() {
        lock.lock();
        try {
            return map.values();
        } finally {
            lock.unlock();
        }
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        lock.lock();
        try {
            return entrySet();
        } finally {
            lock.unlock();
        }
    }
}
