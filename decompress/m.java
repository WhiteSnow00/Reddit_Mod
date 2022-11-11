// 
// Decompiled by Procyon v0.6.0
// 

package zg2;

import rg2.l;

public interface m<T, V> extends k<V>, l<T, V>
{
    V get(final T p0);
    
    Object getDelegate(final T p0);
    
    a<T, V> getGetter();
    
    public interface a<T, V> extends b<V>, l<T, V>
    {
    }
}
