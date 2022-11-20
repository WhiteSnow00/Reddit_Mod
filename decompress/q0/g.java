// 
// Decompiled by Procyon v0.6.0
// 

package q0;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import cg2.j;
import gg2.c;
import mg2.p;
import u2.b;
import kotlin.collections.CollectionsKt___CollectionsKt;
import n0.i;
import java.util.List;
import ng2.e;
import androidx.compose.foundation.lazy.LazyListState;
import s0.d;

public final class g implements d
{
    public final LazyListState a;
    public final int b;
    
    public g(final LazyListState a) {
        e.f((Object)a, "state");
        this.a = a;
        this.b = 100;
    }
    
    @Override
    public final int M() {
        return this.a.h().a();
    }
    
    @Override
    public final float a(final int n, final int n2) {
        final List b = this.a.h().b();
        final int size = b.size();
        int i = 0;
        int n3 = 0;
        while (i < size) {
            n3 += b.get(i).getSize();
            ++i;
        }
        return (n - this.c()) * (n3 / b.size()) + (float)n2 - this.g();
    }
    
    @Override
    public final void b(final i i, final int n, final int n2) {
        e.f((Object)i, "<this>");
        this.a.j(n, n2);
    }
    
    @Override
    public final int c() {
        return this.a.f();
    }
    
    @Override
    public final int d() {
        final k k = (k)CollectionsKt___CollectionsKt.e5(this.a.h().b());
        int index;
        if (k != null) {
            index = k.getIndex();
        }
        else {
            index = 0;
        }
        return index;
    }
    
    @Override
    public final Integer e(final int n) {
        final List b = this.a.h().b();
        final int size = b.size();
        int n2 = 0;
        Integer n3;
        Object value;
        while (true) {
            n3 = null;
            if (n2 >= size) {
                value = null;
                break;
            }
            value = b.get(n2);
            if (((k)value).getIndex() == n) {
                break;
            }
            ++n2;
        }
        final k k = (k)value;
        Integer value2 = n3;
        if (k != null) {
            value2 = k.getOffset();
        }
        return value2;
    }
    
    @Override
    public final int f() {
        return this.b;
    }
    
    @Override
    public final int g() {
        return this.a.g();
    }
    
    @Override
    public final b getDensity() {
        return (b)((SnapshotMutableStateImpl)this.a.f).getValue();
    }
    
    public final Object h(final p<? super i, ? super c<? super j>, ?> p2, final c<? super j> c) {
        final Object a = n0.j.a((n0.j)this.a, (p)p2, (c)c);
        if (a == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return a;
        }
        return j.a;
    }
}
