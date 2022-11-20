// 
// Decompiled by Procyon v0.6.0
// 

package dg2;

import java.util.AbstractList;

public abstract class c<E> extends AbstractList<E> implements og2.c
{
    @Override
    public abstract void add(final int p0, final E p1);
    
    public abstract int getSize();
    
    @Override
    public final /* bridge */ E remove(final int n) {
        return this.removeAt(n);
    }
    
    public abstract E removeAt(final int p0);
    
    @Override
    public abstract E set(final int p0, final E p1);
    
    public final /* bridge */ int size() {
        return this.getSize();
    }
}
