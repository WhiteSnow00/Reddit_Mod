// 
// Decompiled by Procyon v0.6.0
// 

package q0;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.ui.layout.BeyondBoundsLayoutKt;
import kotlin.NoWhenBranchMatchedException;
import c2.f0;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Ref$ObjectRef;
import c2.b$a;
import rg2.l;
import sg2.e;
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
        e.f((Object)f, "state");
        e.f((Object)i, "layoutDirection");
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public static final boolean d(final g$a g$a, final h h) {
        final int b = g$a.b;
        final int a = h.f.h().a();
        boolean b2 = true;
        if (b >= a - 1) {
            b2 = false;
        }
        return b2;
    }
    
    public final <T> T a(final int n, final l<? super b$a, ? extends T> l) {
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        final g g = this.g;
        final int f = this.f.f();
        final int index = ((j)CollectionsKt___CollectionsKt.K3(this.f.h().b())).getIndex();
        g.getClass();
        final g$a element = new g$a(f, index);
        g.a.b((Object)element);
        ref$ObjectRef.element = element;
        T invoke;
        for (invoke = null; invoke == null && this.b((g$a)ref$ObjectRef.element, n); invoke = (T)l.invoke((Object)new h$b(this, ref$ObjectRef, n))) {
            final g$a g$a = (g$a)ref$ObjectRef.element;
            int a = g$a.a;
            final int b = g$a.b;
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
                                final int n3 = q0.h.h$a.a[this.i.ordinal()];
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
                                final int n6 = q0.h.h$a.a[this.i.ordinal()];
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
                --a;
                n4 = b;
            }
            final g g2 = this.g;
            g2.getClass();
            final g$a element2 = new g$a(a, n4);
            g2.a.b((Object)element2);
            final g g3 = this.g;
            final g$a g$a2 = (g$a)ref$ObjectRef.element;
            g3.getClass();
            e.f((Object)g$a2, "interval");
            g3.a.l((Object)g$a2);
            ref$ObjectRef.element = element2;
            final f0 f2 = (f0)((SnapshotMutableStateImpl)this.f.k).getValue();
            if (f2 != null) {
                f2.b();
            }
        }
        final g g4 = this.g;
        final g$a g$a3 = (g$a)ref$ObjectRef.element;
        g4.getClass();
        e.f((Object)g$a3, "interval");
        g4.a.l((Object)g$a3);
        final f0 f3 = (f0)((SnapshotMutableStateImpl)this.f.k).getValue();
        if (f3 != null) {
            f3.b();
        }
        return invoke;
    }
    
    public final boolean b(final g$a g$a, int n) {
        boolean b = false;
        if (n == 1) {
            if (g$a.a <= 0) {
                return b;
            }
        }
        else {
            if (n == 2) {
                b = d(g$a, this);
                return b;
            }
            if (n == 5) {
                if (this.h) {
                    b = d(g$a, this);
                    return b;
                }
                if (g$a.a <= 0) {
                    return b;
                }
            }
            else if (n == 6) {
                if (!this.h) {
                    b = d(g$a, this);
                    return b;
                }
                if (g$a.a <= 0) {
                    return b;
                }
            }
            else if (n == 3) {
                n = q0.h.h$a.a[this.i.ordinal()];
                if (n != 1) {
                    if (n != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (!this.h) {
                        b = d(g$a, this);
                        return b;
                    }
                    if (g$a.a <= 0) {
                        return b;
                    }
                }
                else {
                    if (this.h) {
                        b = d(g$a, this);
                        return b;
                    }
                    if (g$a.a <= 0) {
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
                n = q0.h.h$a.a[this.i.ordinal()];
                if (n != 1) {
                    if (n != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (this.h) {
                        b = d(g$a, this);
                        return b;
                    }
                    if (g$a.a <= 0) {
                        return b;
                    }
                }
                else {
                    if (!this.h) {
                        b = d(g$a, this);
                        return b;
                    }
                    if (g$a.a <= 0) {
                        return b;
                    }
                }
            }
        }
        b = true;
        return b;
    }
    
    public final d2.e<b> getKey() {
        return BeyondBoundsLayoutKt.a;
    }
    
    public final Object getValue() {
        return this;
    }
}
