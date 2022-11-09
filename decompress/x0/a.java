// 
// Decompiled by Procyon v0.6.0
// 

package x0;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import a2.b;
import z0.a1;
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
        this.a = a80.a.m0(r, (a1)a);
        this.b = a2.b.q(n2, a);
        this.c = a2.b.q(n3, a);
        this.d = a2.b.q(n4, a);
        this.e = a2.b.q(n5, a);
        this.f = a2.b.q(n6, a);
        this.g = a2.b.q(n7, a);
        this.h = a2.b.q(n8, a);
        this.i = a2.b.q(n9, a);
        this.j = a2.b.q(n10, a);
        this.k = a2.b.q(n11, a);
        this.l = a2.b.q(n12, a);
        this.m = a80.a.m0(b, (a1)a);
    }
    
    public final long a() {
        return ((SnapshotMutableStateImpl<r>)this.e).getValue().a;
    }
    
    public final long b() {
        return ((SnapshotMutableStateImpl<r>)this.h).getValue().a;
    }
    
    public final long c() {
        return ((SnapshotMutableStateImpl<r>)this.i).getValue().a;
    }
    
    public final long d() {
        return ((SnapshotMutableStateImpl<r>)this.k).getValue().a;
    }
    
    public final long e() {
        return ((SnapshotMutableStateImpl<r>)this.a).getValue().a;
    }
    
    public final long f() {
        return ((SnapshotMutableStateImpl<r>)this.c).getValue().a;
    }
    
    public final long g() {
        return ((SnapshotMutableStateImpl<r>)this.d).getValue().a;
    }
    
    public final long h() {
        return ((SnapshotMutableStateImpl<r>)this.f).getValue().a;
    }
    
    public final boolean i() {
        return ((SnapshotMutableStateImpl<Boolean>)this.m).getValue();
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("Colors(primary=");
        k.append((Object)r.i(this.e()));
        k.append(", primaryVariant=");
        k.append((Object)r.i(((SnapshotMutableStateImpl<r>)this.b).getValue().a));
        k.append(", secondary=");
        k.append((Object)r.i(this.f()));
        k.append(", secondaryVariant=");
        k.append((Object)r.i(this.g()));
        k.append(", background=");
        k.append((Object)r.i(this.a()));
        k.append(", surface=");
        k.append((Object)r.i(this.h()));
        k.append(", error=");
        k.append((Object)r.i(((SnapshotMutableStateImpl<r>)this.g).getValue().a));
        k.append(", onPrimary=");
        k.append((Object)r.i(this.b()));
        k.append(", onSecondary=");
        k.append((Object)r.i(this.c()));
        k.append(", onBackground=");
        k.append((Object)r.i(((SnapshotMutableStateImpl<r>)this.j).getValue().a));
        k.append(", onSurface=");
        k.append((Object)r.i(this.d()));
        k.append(", onError=");
        k.append((Object)r.i(((SnapshotMutableStateImpl<r>)this.l).getValue().a));
        k.append(", isLight=");
        k.append(this.i());
        k.append(')');
        return k.toString();
    }
}
