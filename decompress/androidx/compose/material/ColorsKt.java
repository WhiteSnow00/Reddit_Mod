// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.material;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import z0.o0;
import z0.d;
import o1.r;
import sg2.e;
import rg2.a;
import androidx.compose.runtime.CompositionLocalKt;
import z0.f1;

public final class ColorsKt
{
    public static final f1 a;
    
    static {
        a = CompositionLocalKt.d((a)ColorsKt$LocalColors$1.INSTANCE);
    }
    
    public static final long a(final x0.a a, long n) {
        e.f((Object)a, "$this$contentColorFor");
        if (r.c(n, a.e())) {
            n = a.b();
        }
        else if (r.c(n, ((r)((SnapshotMutableStateImpl)a.b).getValue()).a)) {
            n = a.b();
        }
        else if (r.c(n, a.f())) {
            n = a.c();
        }
        else if (r.c(n, a.g())) {
            n = a.c();
        }
        else if (r.c(n, a.a())) {
            n = ((r)((SnapshotMutableStateImpl)a.j).getValue()).a;
        }
        else if (r.c(n, a.h())) {
            n = a.d();
        }
        else if (r.c(n, ((r)((SnapshotMutableStateImpl)a.g).getValue()).a)) {
            n = ((r)((SnapshotMutableStateImpl)a.l).getValue()).a;
        }
        else {
            n = r.l;
        }
        return n;
    }
    
    public static final long b(long n, final d d) {
        n = a(pd.r.u(d), n);
        if (n == r.l) {
            n = ((r)d.u((o0)ContentColorKt.a)).a;
        }
        return n;
    }
    
    public static x0.a c(long e, long e2, long d, long d2, long b, long b2, final int n) {
        if ((n & 0x1) != 0x0) {
            e = aa1.a.e(4284612846L);
        }
        long e3;
        if ((n & 0x2) != 0x0) {
            e3 = aa1.a.e(4281794739L);
        }
        else {
            e3 = 0L;
        }
        if ((n & 0x4) != 0x0) {
            e2 = aa1.a.e(4278442694L);
        }
        long e4;
        if ((n & 0x8) != 0x0) {
            e4 = aa1.a.e(4278290310L);
        }
        else {
            e4 = 0L;
        }
        if ((n & 0x10) != 0x0) {
            d = r.d;
        }
        if ((n & 0x20) != 0x0) {
            d2 = r.d;
        }
        long e5;
        if ((n & 0x40) != 0x0) {
            e5 = aa1.a.e(4289724448L);
        }
        else {
            e5 = 0L;
        }
        long d3;
        if ((n & 0x80) != 0x0) {
            d3 = r.d;
        }
        else {
            d3 = 0L;
        }
        long b3;
        if ((n & 0x100) != 0x0) {
            b3 = r.b;
        }
        else {
            b3 = 0L;
        }
        if ((n & 0x200) != 0x0) {
            b = r.b;
        }
        if ((n & 0x400) != 0x0) {
            b2 = r.b;
        }
        long d4;
        if ((n & 0x800) != 0x0) {
            d4 = r.d;
        }
        else {
            d4 = 0L;
        }
        return new x0.a(e, e3, e2, e4, d, d2, e5, d3, b3, b, b2, d4, true);
    }
}
