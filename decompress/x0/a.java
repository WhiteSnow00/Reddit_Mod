// 
// Decompiled by Procyon v0.6.0
// 

package x0;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import z0.a1;
import bg.d;
import z0.h1;
import o1.r;
import z0.l0;

public final class a
{
    public final l0 a;
    public final l0 b;
    public final l0 c;
    public final l0 d;
    public final l0 e;
    public final l0 f;
    public final l0 g;
    public final l0 h;
    public final l0 i;
    public final l0 j;
    public final l0 k;
    public final l0 l;
    public final l0 m;
    
    public a(final long n, final long n2, final long n3, final long n4, final long n5, final long n6, final long n7, final long n8, final long n9, final long n10, final long n11, final long n12, final boolean b) {
        final r r = new r(n);
        final h1 a = h1.a;
        this.a = bg.d.s0((Object)r, (a1)a);
        this.b = wu.a.c(n2, a);
        this.c = wu.a.c(n3, a);
        this.d = wu.a.c(n4, a);
        this.e = wu.a.c(n5, a);
        this.f = wu.a.c(n6, a);
        this.g = wu.a.c(n7, a);
        this.h = wu.a.c(n8, a);
        this.i = wu.a.c(n9, a);
        this.j = wu.a.c(n10, a);
        this.k = wu.a.c(n11, a);
        this.l = wu.a.c(n12, a);
        this.m = bg.d.s0((Object)b, (a1)a);
    }
    
    public final long a() {
        return ((r)((SnapshotMutableStateImpl)this.e).getValue()).a;
    }
    
    public final long b() {
        return ((r)((SnapshotMutableStateImpl)this.h).getValue()).a;
    }
    
    public final long c() {
        return ((r)((SnapshotMutableStateImpl)this.i).getValue()).a;
    }
    
    public final long d() {
        return ((r)((SnapshotMutableStateImpl)this.k).getValue()).a;
    }
    
    public final long e() {
        return ((r)((SnapshotMutableStateImpl)this.a).getValue()).a;
    }
    
    public final long f() {
        return ((r)((SnapshotMutableStateImpl)this.c).getValue()).a;
    }
    
    public final long g() {
        return ((r)((SnapshotMutableStateImpl)this.d).getValue()).a;
    }
    
    public final long h() {
        return ((r)((SnapshotMutableStateImpl)this.f).getValue()).a;
    }
    
    public final boolean i() {
        return (boolean)((SnapshotMutableStateImpl)this.m).getValue();
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("Colors(primary=");
        r.append((Object)o1.r.i(this.e()));
        r.append(", primaryVariant=");
        r.append((Object)o1.r.i(((r)((SnapshotMutableStateImpl)this.b).getValue()).a));
        r.append(", secondary=");
        r.append((Object)o1.r.i(this.f()));
        r.append(", secondaryVariant=");
        r.append((Object)o1.r.i(this.g()));
        r.append(", background=");
        r.append((Object)o1.r.i(this.a()));
        r.append(", surface=");
        r.append((Object)o1.r.i(this.h()));
        r.append(", error=");
        r.append((Object)o1.r.i(((r)((SnapshotMutableStateImpl)this.g).getValue()).a));
        r.append(", onPrimary=");
        r.append((Object)o1.r.i(this.b()));
        r.append(", onSecondary=");
        r.append((Object)o1.r.i(this.c()));
        r.append(", onBackground=");
        r.append((Object)o1.r.i(((r)((SnapshotMutableStateImpl)this.j).getValue()).a));
        r.append(", onSurface=");
        r.append((Object)o1.r.i(this.d()));
        r.append(", onError=");
        r.append((Object)o1.r.i(((r)((SnapshotMutableStateImpl)this.l).getValue()).a));
        r.append(", isLight=");
        r.append(this.i());
        r.append(')');
        return r.toString();
    }
}
