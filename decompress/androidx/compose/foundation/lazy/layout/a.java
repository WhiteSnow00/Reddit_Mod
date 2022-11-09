// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import z0.l0;
import kotlin.jvm.internal.Lambda;
import pg2.j;
import zg2.p;
import mj2.c0;
import u2.c;
import ah2.f;
import androidx.compose.runtime.saveable.SaveableStateHolderImpl;
import u2.b;
import java.util.LinkedHashMap;
import s0.d;

public final class a
{
    public final a a;
    public final zg2.a<d> b;
    public final LinkedHashMap c;
    public b d;
    public long e;
    
    public a(final SaveableStateHolderImpl a, final zg2.a b) {
        f.f((Object)a, "saveableStateHolder");
        this.a = (a)a;
        this.b = (zg2.a<d>)b;
        this.c = new LinkedHashMap();
        this.d = new c(0.0f, 0.0f);
        this.e = c0.b(0, 0, 15);
    }
    
    public final p<z0.d, Integer, j> a(final int n, final Object o) {
        f.f(o, "key");
        final a a = this.c.get(o);
        final Object c = ((d)this.b.invoke()).c(n);
        Object o2;
        if (a != null && ((SnapshotMutableStateImpl<Number>)a.c).getValue().intValue() == n && f.a(a.b, c)) {
            if ((o2 = a.d) == null) {
                o2 = at1.a.b0((Lambda)new LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1(a.e, a), 1403994769, true);
                a.d = (p<? super z0.d, ? super Integer, j>)o2;
            }
        }
        else {
            final a a2 = new a(n, o, c);
            this.c.put(o, a2);
            if ((o2 = a2.d) == null) {
                o2 = at1.a.b0((Lambda)new LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1(a2.e, a2), 1403994769, true);
                a2.d = (p<? super z0.d, ? super Integer, j>)o2;
            }
        }
        return (p<z0.d, Integer, j>)o2;
    }
    
    public final Object b(Object o) {
        final a a = this.c.get(o);
        if (a != null) {
            o = a.b;
        }
        else {
            final d d = (d)this.b.invoke();
            final Integer n = d.d().get(o);
            if (n != null) {
                o = d.c(n);
            }
            else {
                o = null;
            }
        }
        return o;
    }
    
    public final class a
    {
        public final Object a;
        public final Object b;
        public final l0 c;
        public p<? super z0.d, ? super Integer, j> d;
        public final /* synthetic */ androidx.compose.foundation.lazy.layout.a e;
        
        public a(final int n, final Object a, final Object b) {
            f.f(a, "key");
            this.a = a;
            this.b = b;
            this.c = a80.a.n0(n);
        }
    }
}
