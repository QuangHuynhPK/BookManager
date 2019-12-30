package com.pk.bookmanager.dao;

import java.util.Collection;
import java.util.HashMap;

public class EntityDao<ID, T> implements GenericDao<ID, T> {
    private HashMap<ID, T> m_entity;

    public EntityDao() {
        m_entity = new HashMap<ID, T>();
    }

    public Collection<T> getAll() {
        return this.m_entity.values();
    }

    public T getById(ID id) {
        return this.m_entity.get(id);
    }

    public void create(ID id, T t) {
        this.m_entity.put(id, t);
    }

    public void update(ID id, T t) {
        this.m_entity.put(id, t);
    }

    public void delete(ID id) {
        this.m_entity.remove(id);
    }
}
