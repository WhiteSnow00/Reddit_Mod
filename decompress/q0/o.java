// 
// Decompiled by Procyon v0.6.0
// 

package q0;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import c2.f0;
import d2.e;
import androidx.compose.foundation.lazy.layout.PinnableParentKt;
import d2.d;
import ah2.f;
import androidx.compose.foundation.lazy.LazyListState;
import d2.b;
import s0.k;
import d2.c;

public final class o implements c<k>, b, k
{
    public static final o$a i;
    public final LazyListState f;
    public final g g;
    public k h;
    
    static {
        i = new a() {
            @Override
            public final void a() {
            }
        };
    }
    
    public o(final LazyListState f, final g g) {
        ah2.f.f((Object)f, "state");
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void C0(final d2.d d) {
        ah2.f.f((Object)d, "scope");
        this.h = (k)d.a((e)PinnableParentKt.a);
    }
    
    @Override
    public final a a() {
        final g g = this.g;
        Object o;
        if (g.a.k()) {
            o = new a() {
                public final a a;
                public final g.a b;
                public final /* synthetic */ o c;
                
                {
                    final k h = o.this.h;
                    Object a;
                    if (h != null) {
                        a = h.a();
                    }
                    else {
                        a = null;
                    }
                    this.a = (a)a;
                    final g.a b = new g.a(d.b(), d.a());
                    d.a.b(b);
                    this.b = b;
                }
                
                @Override
                public final void a() {
                    final g d = g;
                    final g.a b = this.b;
                    d.getClass();
                    ah2.f.f((Object)b, "interval");
                    d.a.l(b);
                    final a a = this.a;
                    if (a != null) {
                        a.a();
                    }
                    final f0 f0 = ((SnapshotMutableStateImpl<f0>)this.c.f.k).getValue();
                    if (f0 != null) {
                        f0.b();
                    }
                }
            };
        }
        else {
            final k h = this.h;
            if (h == null || (o = h.a()) == null) {
                o = q0.o.i;
            }
        }
        return (a)o;
    }
    
    @Override
    public final e<k> getKey() {
        return PinnableParentKt.a;
    }
    
    @Override
    public final Object getValue() {
        return this;
    }
}
