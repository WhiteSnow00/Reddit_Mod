// 
// Decompiled by Procyon v0.6.0
// 

package jj2;

import sg2.e;
import kotlin.coroutines.CoroutineContext$b;

public final class w implements CoroutineContext$b<v<?>>
{
    public final ThreadLocal<?> f;
    
    public w(final ThreadLocal<?> f) {
        this.f = f;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof w && e.a((Object)this.f, (Object)((w)o).f));
    }
    
    @Override
    public final int hashCode() {
        return this.f.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("ThreadLocalKey(threadLocal=");
        r.append(this.f);
        r.append(')');
        return r.toString();
    }
}
