// 
// Decompiled by Procyon v0.6.0
// 

package z0;

import ah2.f;
import zg2.a;

public abstract class o0<T> extends k<T>
{
    public o0(final a<? extends T> a) {
        f.f((Object)a, "defaultFactory");
        super(a);
    }
    
    public final p0<T> b(final T t) {
        return new p0<T>(this, t, true);
    }
}
