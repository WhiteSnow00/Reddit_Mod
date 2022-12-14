// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.util;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

public enum HashMapSupplier implements Callable<Map<Object, Object>>
{
    INSTANCE;
    
    public static <K, V> Callable<Map<K, V>> asCallable() {
        return (Callable<Map<K, V>>)HashMapSupplier.INSTANCE;
    }
    
    @Override
    public Map<Object, Object> call() throws Exception {
        return new HashMap<Object, Object>();
    }
}
