// 
// Decompiled by Procyon v0.6.0
// 

package jj2;

import kotlin.coroutines.CoroutineContext;
import ej2.b0;

public final class f implements b0
{
    public final CoroutineContext f;
    
    public f(final CoroutineContext f) {
        this.f = f;
    }
    
    public final CoroutineContext ox() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("CoroutineScope(coroutineContext=");
        r.append(this.f);
        r.append(')');
        return r.toString();
    }
}
