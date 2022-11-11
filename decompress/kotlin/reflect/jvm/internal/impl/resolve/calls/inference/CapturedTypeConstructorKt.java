// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import java.util.Iterator;
import gi2.d;
import kotlin.Pair;
import java.util.ArrayList;
import ig2.m;
import ti2.s;
import ti2.q0;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$a;
import gi2.c;
import ti2.p0;
import ti2.t;
import rg2.a;
import si2.h;
import kotlin.reflect.jvm.internal.impl.types.b;
import sg2.e;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import hh2.j0;
import ti2.n0;

public final class CapturedTypeConstructorKt
{
    public static final n0 a(final n0 n0, final j0 j0) {
        if (j0 == null || n0.c() == Variance.INVARIANT) {
            return n0;
        }
        if (j0.i() == n0.c()) {
            p0 p2;
            if (n0.b()) {
                final LockBasedStorageManager$a e = LockBasedStorageManager.e;
                sg2.e.e((Object)e, "NO_LOCKS");
                p2 = new p0((t)new b((h)e, (a<? extends t>)new CapturedTypeConstructorKt$createCapturedIfNeeded$1(n0)));
            }
            else {
                p2 = new p0(n0.getType());
            }
            return (n0)p2;
        }
        final c c = new c(n0);
        ti2.j0.g.getClass();
        return (n0)new p0((t)new gi2.a(n0, (gi2.b)c, false, ti2.j0.h));
    }
    
    public static q0 b(final q0 q0) {
        Object o;
        if (q0 instanceof s) {
            final s s = (s)q0;
            final j0[] b = s.b;
            final ArrayList a1 = kotlin.collections.b.A1(s.c, b);
            final ArrayList list = new ArrayList<n0>(m.c3((Iterable)a1, 10));
            for (final Pair pair : a1) {
                list.add(a((n0)pair.getFirst(), (j0)pair.getSecond()));
            }
            final n0[] array = list.toArray(new n0[0]);
            e.d((Object)array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            o = new s(b, (n0[])array, true);
        }
        else {
            o = new d(q0, true);
        }
        return (q0)o;
    }
}
