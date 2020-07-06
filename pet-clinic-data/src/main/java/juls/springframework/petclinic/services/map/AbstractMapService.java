package juls.springframework.petclinic.services.map;

import juls.springframework.petclinic.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity,ID extends Long> {
    private Map<Long,T> map = new HashMap<>();

    T save(T obj){
        if(obj != null) {
            if (obj.getId() == null)
                obj.setId(getNextId());
                map.put(obj.getId(), obj);
        }else {
            throw new RuntimeException("Object can't be null!!");
        }
        return obj;
    }
    T findById(ID id){
        return map.get(id);
    }
    Set<T> findAll(){
        return new HashSet<>(map.values());
    }
    void deleteById(ID id){
        map.remove(id);
    }
    void delete(T obj){
        map.entrySet().removeIf(entry -> entry.getValue().equals(obj));
    }
    private Long getNextId(){
        Long nextId = 1L;
        if(!map.keySet().isEmpty()) {
            nextId = Collections.max(map.keySet()) + 1L;
        }
        return nextId;

    }
}
