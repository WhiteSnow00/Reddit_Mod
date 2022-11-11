// 
// Decompiled by Procyon v0.6.0
// 

package sj2;

import java.util.Iterator;
import sg2.e;
import pj2.b;
import java.util.Collection;

public abstract class q<E, C extends Collection<? extends E>, B> extends p<E, C, B>
{
    public q(final b<E> b) {
        e.f((Object)b, "element");
        super((b)b);
    }
    
    public final Iterator c(final Object o) {
        final Collection collection = (Collection)o;
        e.f((Object)collection, "<this>");
        return collection.iterator();
    }
    
    public final int d(final Object o) {
        final Collection collection = (Collection)o;
        e.f((Object)collection, "<this>");
        return collection.size();
    }
}
