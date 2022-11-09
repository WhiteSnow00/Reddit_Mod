// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.lazy;

import ah2.f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import zg2.l;

public interface b
{
    default void b(final Object o, final Object o2, final ComposableLambdaImpl composableLambdaImpl) {
        f.f((Object)composableLambdaImpl, "content");
        throw new IllegalStateException("The method is not implemented".toString());
    }
    
    void c(final Object p0, final Object p1, final ComposableLambdaImpl p2);
    
    default void e(final int n, final l l, final l i, final ComposableLambdaImpl composableLambdaImpl) {
        f.f((Object)i, "contentType");
        f.f((Object)composableLambdaImpl, "itemContent");
        throw new IllegalStateException("The method is not implemented".toString());
    }
}
