// 
// Decompiled by Procyon v0.6.0
// 

package dg2;

import java.util.AbstractSet;

public abstract class e<E> extends AbstractSet<E> implements og2.e
{
    public abstract boolean add(final E p0);
    
    public abstract int getSize();
    
    public final /* bridge */ int size() {
        return this.getSize();
    }
}
