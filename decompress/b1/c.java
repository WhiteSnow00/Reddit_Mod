// 
// Decompiled by Procyon v0.6.0
// 

package b1;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder;
import zg2.l;
import java.util.Collection;

public interface c<E> extends a<E>, Collection, bh2.a
{
    c<E> V(final l<? super E, Boolean> p0);
    
    c<E> add(final int p0, final E p1);
    
    c<E> add(final E p0);
    
    c<E> addAll(final Collection<? extends E> p0);
    
    PersistentVectorBuilder builder();
    
    c<E> r0(final int p0);
    
    c<E> remove(final E p0);
    
    c<E> removeAll(final Collection<? extends E> p0);
    
    c<E> set(final int p0, final E p1);
}
