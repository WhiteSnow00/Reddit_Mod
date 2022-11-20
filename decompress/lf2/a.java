// 
// Decompiled by Procyon v0.6.0
// 

package lf2;

import af2.g;

public abstract class a<T, R> extends g<R>
{
    public final g<T> f;
    
    public a(final g<T> f) {
        if (f != null) {
            this.f = f;
            return;
        }
        throw new NullPointerException("source is null");
    }
}
