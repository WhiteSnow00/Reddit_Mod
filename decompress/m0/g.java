// 
// Decompiled by Procyon v0.6.0
// 

package m0;

import o1.s;
import q1.e;
import o1.r;
import z0.e1;
import z0.h0;
import z0.d$a;
import androidx.compose.foundation.interaction.b;
import androidx.compose.foundation.interaction.c;
import ah2.f;
import z0.d;
import o0.i;

public final class g implements k
{
    public static final g a;
    
    static {
        a = new g();
    }
    
    public final l a(final i i, final d d) {
        f.f((Object)i, "interactionSource");
        d.A(1683566979);
        final h0 a = androidx.compose.foundation.interaction.d.a(i, d, 0);
        final h0 a2 = c.a(i, d, 0);
        final h0 a3 = b.a(i, d, 0);
        d.A(1157296644);
        final boolean l = d.l(i);
        final Object b = d.B();
        a a4;
        if (l || (a4 = (a)b) == d$a.a) {
            a4 = new a(a, a2, a3);
            d.v(a4);
        }
        d.I();
        final a a5 = a4;
        d.I();
        return (l)a5;
    }
    
    public static final class a implements l
    {
        public final e1<Boolean> f;
        public final e1<Boolean> g;
        public final e1<Boolean> h;
        
        public a(final h0 f, final h0 g, final h0 h) {
            f.f((Object)f, "isPressed");
            f.f((Object)g, "isHovered");
            f.f((Object)h, "isFocused");
            this.f = f;
            this.g = g;
            this.h = h;
        }
        
        public final void b(final e2.f f) {
            f.c0();
            if (this.f.getValue()) {
                e.P0(f, r.b(r.b, 0.3f), 0L, f.b(), 0.0f, null, 122);
            }
            else if (this.g.getValue() || this.h.getValue()) {
                e.P0(f, r.b(r.b, 0.1f), 0L, f.b(), 0.0f, null, 122);
            }
        }
    }
}
