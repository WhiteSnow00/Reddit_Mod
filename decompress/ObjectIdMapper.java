// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.helper;

import java.util.IdentityHashMap;
import java.util.Map;
import android.util.SparseArray;

public class ObjectIdMapper
{
    private SparseArray<Object> mIdToObjectMap;
    private int mNextId;
    private final Map<Object, Integer> mObjectToIdMap;
    public final Object mSync;
    
    public ObjectIdMapper() {
        this.mSync = new Object();
        this.mNextId = 1;
        this.mObjectToIdMap = new IdentityHashMap<Object, Integer>();
        this.mIdToObjectMap = (SparseArray<Object>)new SparseArray();
    }
    
    public void clear() {
        synchronized (this.mSync) {
            final SparseArray<Object> mIdToObjectMap = this.mIdToObjectMap;
            this.mObjectToIdMap.clear();
            this.mIdToObjectMap = (SparseArray<Object>)new SparseArray();
            monitorexit(this.mSync);
            for (int size = mIdToObjectMap.size(), i = 0; i < size; ++i) {
                this.onUnmapped(mIdToObjectMap.valueAt(i), mIdToObjectMap.keyAt(i));
            }
        }
    }
    
    public boolean containsId(final int n) {
        synchronized (this.mSync) {
            return this.mIdToObjectMap.get(n) != null;
        }
    }
    
    public boolean containsObject(final Object o) {
        synchronized (this.mSync) {
            return this.mObjectToIdMap.containsKey(o);
        }
    }
    
    public Integer getIdForObject(final Object o) {
        synchronized (this.mSync) {
            return this.mObjectToIdMap.get(o);
        }
    }
    
    public Object getObjectForId(final int n) {
        synchronized (this.mSync) {
            return this.mIdToObjectMap.get(n);
        }
    }
    
    public void onMapped(final Object o, final int n) {
    }
    
    public void onUnmapped(final Object o, final int n) {
    }
    
    public int putObject(final Object o) {
        synchronized (this.mSync) {
            final Integer n = this.mObjectToIdMap.get(o);
            if (n != null) {
                return n;
            }
            final Integer value = this.mNextId++;
            this.mObjectToIdMap.put(o, value);
            this.mIdToObjectMap.put((int)value, o);
            monitorexit(this.mSync);
            this.onMapped(o, value);
            return value;
        }
    }
    
    public Integer removeObject(final Object o) {
        synchronized (this.mSync) {
            final Integer n = this.mObjectToIdMap.remove(o);
            if (n == null) {
                return null;
            }
            this.mIdToObjectMap.remove((int)n);
            monitorexit(this.mSync);
            this.onUnmapped(o, n);
            return n;
        }
    }
    
    public Object removeObjectById(final int n) {
        synchronized (this.mSync) {
            final Object value = this.mIdToObjectMap.get(n);
            if (value == null) {
                return null;
            }
            this.mIdToObjectMap.remove(n);
            this.mObjectToIdMap.remove(value);
            monitorexit(this.mSync);
            this.onUnmapped(value, n);
            return value;
        }
    }
    
    public int size() {
        synchronized (this.mSync) {
            return this.mObjectToIdMap.size();
        }
    }
}
