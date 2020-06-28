package juls.springframework.petclinic.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T,ID> {
    private Map<ID,T> map = new HashMap<ID, T>();

    T save(ID id, T obj){
        return map.put(id, obj);
    }
    T findById(ID id){
        return map.get(id);
    }
    Set<T> findAll(){
        return new HashSet<T>(map.values());
    }
    void deleteById(ID id){
        map.remove(id);
    }
    void delete(T obj){
        map.entrySet().removeIf(entry -> entry.getValue().equals(obj));
    }
}
