// 
// Decompiled by Procyon v0.6.0
// 

package q0;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.ui.layout.BeyondBoundsLayoutKt;
import d2.e;
import kotlin.NoWhenBranchMatchedException;
import c2.f0;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Ref$ObjectRef;
import zg2.l;
import ah2.f;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.foundation.lazy.LazyListState;
import c2.b;
import d2.c;

public final class h implements c<b>, b
{
    public final LazyListState f;
    public final g g;
    public final boolean h;
    public final LayoutDirection i;
    
    public h(final LazyListState f, final g g, final boolean h, final LayoutDirection i) {
        ah2.f.f((Object)f, "state");
        ah2.f.f((Object)i, "layoutDirection");
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public static final boolean d(final g.a a, final h h) {
        final int b = a.b;
        final int a2 = h.f.h().a();
        boolean b2 = true;
        if (b >= a2 - 1) {
            b2 = false;
        }
        return b2;
    }
    
    @Override
    public final <T> T a(final int n, final l<? super c2.b.a, ? extends T> l) {
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        final g g = this.g;
        final int f = this.f.f();
        final int index = ((j)CollectionsKt___CollectionsKt.A1((List)this.f.h().b())).getIndex();
        g.getClass();
        final g.a element = new g.a(f, index);
        g.a.b(element);
        ref$ObjectRef.element = element;
        Object invoke;
        for (invoke = null; invoke == null && this.b((g.a)ref$ObjectRef.element, n); invoke = l.invoke((Object)new h$b(this, ref$ObjectRef, n))) {
            final g.a a = (g.a)ref$ObjectRef.element;
            int a2 = a.a;
            final int b = a.b;
            final int n2 = 0;
            int n4 = 0;
            Label_0396: {
                Label_0380: {
                    if (n != 1) {
                        if (n != 2) {
                            if (n == 5) {
                                if (!this.h) {
                                    break Label_0380;
                                }
                            }
                            else if (n == 6) {
                                if (this.h) {
                                    break Label_0380;
                                }
                            }
                            else if (n == 3) {
                                final int n3 = q0.h.a.a[this.i.ordinal()];
                                if (n3 != 1) {
                                    if (n3 != 2) {
                                        n4 = b;
                                        break Label_0396;
                                    }
                                    if (this.h) {
                                        break Label_0380;
                                    }
                                }
                                else if (!this.h) {
                                    break Label_0380;
                                }
                            }
                            else {
                                int n5 = n2;
                                if (n == 4) {
                                    n5 = 1;
                                }
                                if (n5 == 0) {
                                    throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction".toString());
                                }
                                final int n6 = q0.h.a.a[this.i.ordinal()];
                                if (n6 != 1) {
                                    if (n6 != 2) {
                                        n4 = b;
                                        break Label_0396;
                                    }
                                    if (!this.h) {
                                        break Label_0380;
                                    }
                                }
                                else if (this.h) {
                                    break Label_0380;
                                }
                            }
                        }
                        n4 = b + 1;
                        break Label_0396;
                    }
                }
                --a2;
                n4 = b;
            }
            final g g2 = this.g;
            g2.getClass();
            final g.a element2 = new g.a(a2, n4);
            g2.a.b(element2);
            final g g3 = this.g;
            final g.a a3 = (g.a)ref$ObjectRef.element;
            g3.getClass();
            ah2.f.f((Object)a3, "interval");
            g3.a.l(a3);
            ref$ObjectRef.element = element2;
            final f0 f2 = ((SnapshotMutableStateImpl<f0>)this.f.k).getValue();
            if (f2 != null) {
                f2.b();
            }
        }
        final g g4 = this.g;
        final g.a a4 = (g.a)ref$ObjectRef.element;
        g4.getClass();
        ah2.f.f((Object)a4, "interval");
        g4.a.l(a4);
        final f0 f3 = ((SnapshotMutableStateImpl<f0>)this.f.k).getValue();
        if (f3 != null) {
            f3.b();
        }
        return (T)invoke;
    }
    
    public final boolean b(final g.a a, int n) {
        boolean b = false;
        if (n == 1) {
            if (a.a <= 0) {
                return b;
            }
        }
        else {
            if (n == 2) {
                b = d(a, this);
                return b;
            }
            if (n == 5) {
                if (this.h) {
                    b = d(a, this);
                    return b;
                }
                if (a.a <= 0) {
                    return b;
                }
            }
            else if (n == 6) {
                if (!this.h) {
                    b = d(a, this);
                    return b;
                }
                if (a.a <= 0) {
                    return b;
                }
            }
            else if (n == 3) {
                n = q0.h.a.a[this.i.ordinal()];
                if (n != 1) {
                    if (n != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (!this.h) {
                        b = d(a, this);
                        return b;
                    }
                    if (a.a <= 0) {
                        return b;
                    }
                }
                else {
                    if (this.h) {
                        b = d(a, this);
                        return b;
                    }
                    if (a.a <= 0) {
                        return b;
                    }
                }
            }
            else {
                if (n == 4) {
                    n = 1;
                }
                else {
                    n = 0;
                }
                if (n == 0) {
                    throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction".toString());
                }
                n = q0.h.a.a[this.i.ordinal()];
                if (n != 1) {
                    if (n != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (this.h) {
                        b = d(a, this);
                        return b;
                    }
                    if (a.a <= 0) {
                        return b;
                    }
                }
                else {
                    if (!this.h) {
                        b = d(a, this);
                        return b;
                    }
                    if (a.a <= 0) {
                        return b;
                    }
                }
            }
        }
        b = true;
        return b;
    }
    
    @Override
    public final e<b> getKey() {
        return BeyondBoundsLayoutKt.a;
    }
    
    @Override
    public final Object getValue() {
        return this;
    }
}
