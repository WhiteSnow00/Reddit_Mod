// 
// Decompiled by Procyon v0.6.0
// 

package x2;

import androidx.concurrent.futures.AbstractResolvableFuture;

public final class a<V> extends AbstractResolvableFuture<V>
{
    public final boolean h(final V v) {
        boolean b;
        if (AbstractResolvableFuture.k.b((AbstractResolvableFuture)this, (Object)null, AbstractResolvableFuture.l)) {
            AbstractResolvableFuture.c(this);
            b = true;
        }
        else {
            b = false;
        }
        return b;
    }
}
