// 
// Decompiled by Procyon v0.6.0
// 

package y2;

import c2.u;
import zg2.p;
import androidx.compose.ui.platform.InspectableValueKt;
import c2.d0;
import androidx.compose.ui.platform.q0;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import pg2.j;
import androidx.constraintlayout.compose.ConstrainScope;
import ah2.f;
import zg2.l;
import j1.d;
import java.util.ArrayList;
import androidx.constraintlayout.compose.a;

public final class c extends androidx.constraintlayout.compose.a
{
    public c.c$b e;
    public int f;
    public final ArrayList<y2.a> g;
    
    public c() {
        this.f = 0;
        this.g = new ArrayList<y2.a>();
    }
    
    public static d b(final d d, final y2.a a, final l l) {
        f.f((Object)d, "<this>");
        f.f((Object)l, "constrainBlock");
        return d.f0((d)new a(a, (l<? super ConstrainScope, j>)l));
    }
    
    public final y2.a c() {
        y2.a a;
        if ((a = (y2.a)CollectionsKt___CollectionsKt.t1(this.f++, (List)this.g)) == null) {
            a = new y2.a(Integer.valueOf(this.f));
            this.g.add(a);
        }
        return a;
    }
    
    public final c.c$b d() {
        c.c$b e;
        if ((e = this.e) == null) {
            e = new c.c$b(this);
            this.e = e;
        }
        return e;
    }
    
    public final void e() {
        super.a.clear();
        super.d = super.c;
        super.b = 0;
        this.f = 0;
    }
    
    public static final class a extends q0 implements d0
    {
        public final y2.a g;
        public final l<ConstrainScope, j> h;
        
        public a(final y2.a g, final l<? super ConstrainScope, j> h) {
            f.f((Object)h, "constrainBlock");
            super(InspectableValueKt.a);
            this.g = g;
            this.h = (l<ConstrainScope, j>)h;
        }
        
        public final <R> R e(final R r, final p<? super d.b, ? super R, ? extends R> p2) {
            return (R)p2.invoke((Object)this, (Object)r);
        }
        
        public final boolean equals(final Object o) {
            final l<ConstrainScope, j> h = this.h;
            final boolean b = o instanceof a;
            final Object o2 = null;
            a a;
            if (b) {
                a = (a)o;
            }
            else {
                a = null;
            }
            Object h2;
            if (a == null) {
                h2 = o2;
            }
            else {
                h2 = a.h;
            }
            return ah2.f.a((Object)h, h2);
        }
        
        public final d f0(final d d) {
            ah2.f.f((Object)d, "other");
            return d0.z0(this, d);
        }
        
        public final int hashCode() {
            return this.h.hashCode();
        }
        
        public final boolean p(final l<? super d.b, Boolean> l) {
            ah2.f.f((Object)l, "predicate");
            return d0.B(this, l);
        }
        
        public final <R> R w(final R r, final p<? super R, ? super d.b, ? extends R> p2) {
            ah2.f.f((Object)p2, "operation");
            return (R)p2.invoke((Object)r, (Object)this);
        }
        
        public final Object y0(final u u, final Object o) {
            ah2.f.f((Object)u, "<this>");
            return new b(this.g, this.h);
        }
    }
}
