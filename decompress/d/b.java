// 
// Decompiled by Procyon v0.6.0
// 

package d;

import mg2.l;
import ng2.e;
import z0.c1;

public final class b implements androidx.activity.result.b
{
    public final c1 f;
    
    public b(final c1 f) {
        this.f = f;
    }
    
    public final void b(final Object o) {
        final c1 f = this.f;
        e.f((Object)f, "$currentOnResult");
        ((l)f.getValue()).invoke(o);
    }
}
