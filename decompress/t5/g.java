// 
// Decompiled by Procyon v0.6.0
// 

package t5;

import java.util.ArrayList;

public final class g extends p
{
    public final Object a;
    public final ArrayList b;
    public final Object c;
    public final ArrayList d;
    public final Object e;
    public final ArrayList f;
    public final f g;
    
    public g(final f g, final Object a, final ArrayList b, final Object e, final ArrayList f) {
        this.g = g;
        this.a = a;
        this.b = b;
        this.c = null;
        this.d = null;
        this.e = e;
        this.f = f;
    }
    
    public final void a(final m m) {
        m.x((m.d)this);
    }
    
    public final void c(final m m) {
        final Object a = this.a;
        if (a != null) {
            this.g.s(a, this.b, (ArrayList)null);
        }
        final Object c = this.c;
        if (c != null) {
            this.g.s(c, this.d, (ArrayList)null);
        }
        final Object e = this.e;
        if (e != null) {
            this.g.s(e, this.f, (ArrayList)null);
        }
    }
}
