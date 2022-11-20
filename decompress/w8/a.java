// 
// Decompiled by Procyon v0.6.0
// 

package w8;

import java.util.ArrayDeque;
import java.util.ArrayList;
import ng2.e;
import v8.m$a;
import v8.n$a;
import p8.g;
import v8.m;
import v8.f;
import java.io.InputStream;
import v8.n;

public abstract class a<Model> implements n<Model, InputStream>
{
    public final n<f, InputStream> a;
    public final m<Model, f> b;
    
    public a(final n<f, InputStream> a) {
        this.a = a;
        this.b = null;
    }
    
    public final n$a<InputStream> buildLoadData(final Model model, final int n, final int n2, g d) {
        final m<Model, f> b = this.b;
        Label_0069: {
            if (b != null) {
                final m$a a = m$a.a(n, n2, (Object)model);
                final Object a2 = ((l9.g)b.a).a((Object)a);
                d = (g)m$a.d;
                synchronized (d) {
                    ((ArrayDeque<m$a>)d).offer(a);
                    monitorexit(d);
                    d = (g)a2;
                    break Label_0069;
                }
            }
            d = null;
        }
        if (d == null) {
            final fr0.a a3 = (fr0.a)model;
            e.f((Object)a3, "model");
            pu2.a.a.m("Request to load model=%s, width=%d, height=%d", new Object[] { a3, n, n2 });
            throw null;
        }
        e.f((Object)model, "model");
        new(java.util.ArrayList.class)();
        dg2.m.u4((Iterable)null, 10);
        throw null;
    }
}
