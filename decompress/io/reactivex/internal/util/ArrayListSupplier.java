// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.util;

import java.util.ArrayList;
import ff2.o;
import java.util.List;
import java.util.concurrent.Callable;

public enum ArrayListSupplier implements Callable<List<Object>>, o<Object, List<Object>>
{
    private static final ArrayListSupplier[] $VALUES;
    
    INSTANCE;
    
    public static <T> Callable<List<T>> asCallable() {
        return (Callable<List<T>>)ArrayListSupplier.INSTANCE;
    }
    
    public static <T, O> o<O, List<T>> asFunction() {
        return (o<O, List<T>>)ArrayListSupplier.INSTANCE;
    }
    
    public /* bridge */ Object apply(final Object o) throws Exception {
        return this.apply(o);
    }
    
    public List<Object> apply(final Object o) throws Exception {
        return new ArrayList<Object>();
    }
    
    @Override
    public /* bridge */ Object call() throws Exception {
        return this.call();
    }
    
    @Override
    public List<Object> call() throws Exception {
        return new ArrayList<Object>();
    }
}
