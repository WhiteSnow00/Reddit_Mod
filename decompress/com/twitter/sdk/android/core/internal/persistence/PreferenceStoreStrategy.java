// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.internal.persistence;

public class PreferenceStoreStrategy<T> implements PersistenceStrategy<T>
{
    private final String key;
    private final SerializationStrategy<T> serializer;
    private final PreferenceStore store;
    
    public PreferenceStoreStrategy(final PreferenceStore store, final SerializationStrategy<T> serializer, final String key) {
        this.store = store;
        this.serializer = serializer;
        this.key = key;
    }
    
    public void clear() {
        this.store.edit().remove(this.key).commit();
    }
    
    public T restore() {
        return (T)this.serializer.deserialize(this.store.get().getString(this.key, (String)null));
    }
    
    public void save(final T t) {
        final PreferenceStore store = this.store;
        store.save(store.edit().putString(this.key, this.serializer.serialize((Object)t)));
    }
}
