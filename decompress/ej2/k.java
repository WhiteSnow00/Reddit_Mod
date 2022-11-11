// 
// Decompiled by Procyon v0.6.0
// 

package ej2;

import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import hg2.j;
import rg2.l;
import jj2.t;
import lg2.c;

public interface k<T> extends c<T>
{
    t E(final Object p0, final Object p1);
    
    void F(final l<? super Throwable, j> p0);
    
    t X(final Throwable p0);
    
    boolean h();
    
    boolean isActive();
    
    boolean isCancelled();
    
    t j0(final Object p0, final LockFreeLinkedListNode.a p1, final l p2);
    
    void k();
    
    void k0(final CoroutineDispatcher p0, final T p1);
    
    boolean o(final Throwable p0);
    
    void y(final l p0, final Object p1);
}
