// 
// Decompiled by Procyon v0.6.0
// 

package androidx.paging;

import lg2.c;
import rg2.p;

public abstract class PageEvent<T>
{
    public Object a(final p<? super T, ? super c<? super Boolean>, ?> p2, final c<? super PageEvent<T>> c) {
        return this;
    }
    
    public <R> Object b(final p<? super T, ? super c<? super R>, ?> p2, final c<? super PageEvent<R>> c) {
        return this;
    }
}
