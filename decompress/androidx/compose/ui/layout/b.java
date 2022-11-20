// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.layout;

import java.util.Map;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import z0.k0;
import android.view.ViewGroup$LayoutParams;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import e2.i0;
import androidx.compose.ui.platform.a2;
import kotlin.jvm.internal.Lambda;
import i1.f$a;
import cg2.j;
import z0.d;
import mg2.p;
import z0.f;
import ng2.e;
import c2.m0$a;
import java.util.LinkedHashMap;
import c2.m0;
import z0.g;
import androidx.compose.ui.node.LayoutNode;

public final class b
{
    public final LayoutNode a;
    public g b;
    public m0 c;
    public int d;
    public final LinkedHashMap e;
    public final LinkedHashMap f;
    public final b.b$b g;
    public final LinkedHashMap h;
    public final m0$a i;
    public int j;
    public int k;
    public final String l;
    
    public b(final LayoutNode a, final m0 c) {
        ng2.e.f((Object)a, "root");
        ng2.e.f((Object)c, "slotReusePolicy");
        this.a = a;
        this.c = c;
        this.e = new LinkedHashMap();
        this.f = new LinkedHashMap();
        this.g = new b.b$b(this);
        this.h = new LinkedHashMap();
        this.i = new m0$a(0);
        this.l = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing,, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }
    
    public final void a(final int n) {
        this.j = 0;
        final int n2 = this.a.w().size() - this.k - 1;
        if (n <= n2) {
            this.i.clear();
            if (n <= n2) {
                int n3 = n;
                while (true) {
                    final m0$a i = this.i;
                    final Object value = this.e.get(this.a.w().get(n3));
                    ng2.e.c(value);
                    i.f.add(((a)value).a);
                    if (n3 == n2) {
                        break;
                    }
                    ++n3;
                }
            }
            this.c.c(this.i);
            for (int j = n2; j >= n; --j) {
                final LayoutNode layoutNode = this.a.w().get(j);
                final Object value2 = this.e.get(layoutNode);
                ng2.e.c(value2);
                final a a = (a)value2;
                final Object a2 = a.a;
                if (this.i.contains(a2)) {
                    final LayoutNode.UsageByParent notUsed = LayoutNode.UsageByParent.NotUsed;
                    layoutNode.getClass();
                    ng2.e.f((Object)notUsed, "<set-?>");
                    layoutNode.B = notUsed;
                    ++this.j;
                    ((SnapshotMutableStateImpl)a.e).setValue((Object)Boolean.FALSE);
                }
                else {
                    final LayoutNode a3 = this.a;
                    a3.o = true;
                    this.e.remove(layoutNode);
                    final f c = a.c;
                    if (c != null) {
                        c.dispose();
                    }
                    this.a.Q(j, 1);
                    a3.o = false;
                }
                this.f.remove(a2);
            }
        }
        this.b();
    }
    
    public final void b() {
        final int size = this.e.size();
        final int size2 = this.a.w().size();
        final int n = 1;
        if (size != size2) {
            final StringBuilder t = a.t("Inconsistency between the count of nodes tracked by the state (");
            t.append(this.e.size());
            t.append(") and the children count on the SubcomposeLayout (");
            t.append(this.a.w().size());
            t.append("). Are you trying to use the state of the disposed SubcomposeLayout?");
            throw new IllegalArgumentException(t.toString().toString());
        }
        if (this.a.w().size() - this.j - this.k < 0) {
            final StringBuilder t2 = a.t("Incorrect state. Total children ");
            t2.append(this.a.w().size());
            t2.append(". Reusable children ");
            t2.append(this.j);
            t2.append(". Precomposed children ");
            t2.append(this.k);
            throw new IllegalArgumentException(t2.toString().toString());
        }
        int n2;
        if (this.h.size() == this.k) {
            n2 = n;
        }
        else {
            n2 = 0;
        }
        if (n2 != 0) {
            return;
        }
        final StringBuilder t3 = a.t("Incorrect state. Precomposed children ");
        t3.append(this.k);
        t3.append(". Map size ");
        t3.append(this.h.size());
        throw new IllegalArgumentException(t3.toString().toString());
    }
    
    public final void c(final LayoutNode layoutNode, Object o, final p<? super d, ? super Integer, j> b) {
        Object o2 = this.e;
        Object o3;
        if ((o3 = ((LinkedHashMap<K, i1.f>)o2).get(layoutNode)) == null) {
            o3 = new a(o, ComposableSingletons$SubcomposeLayoutKt.a);
            ((Map<K, i1.f>)o2).put((K)layoutNode, (i1.f)o3);
        }
        final a a = (a)o3;
        final f c = a.c;
        final boolean b2 = c == null || c.x();
        if (a.b == b && !b2 && !a.d) {
            return;
        }
        ng2.e.f((Object)b, "<set-?>");
        a.b = b;
        o3 = f$a.a();
        try {
            o2 = ((i1.f)o3).i();
            Label_0278: {
                try {
                    final LayoutNode a2 = this.a;
                    a2.o = true;
                    final p<? super d, ? super Integer, j> b3 = a.b;
                    final f c2 = a.c;
                    final g b4 = this.b;
                    if (b4 != null) {
                        final ComposableLambdaImpl d = xd.a.D((Lambda)new LayoutNodeSubcompositionsState$subcompose$2$1$1(a, (p)b3), -34810602, true);
                        Object a3 = null;
                        Label_0217: {
                            if (c2 != null) {
                                a3 = c2;
                                if (!c2.isDisposed()) {
                                    break Label_0217;
                                }
                            }
                            final ViewGroup$LayoutParams a4 = androidx.compose.ui.platform.a2.a;
                            o = new i0(layoutNode);
                            a3 = z0.j.a((z0.a)o, b4);
                        }
                        ((f)a3).k((p<? super d, ? super Integer, j>)d);
                        a.c = (f)a3;
                        a2.o = false;
                        final j a5 = cg2.j.a;
                        i1.f.o((i1.f)o2);
                        ((i1.f)o3).c();
                        a.d = false;
                        return;
                    }
                }
                finally {
                    break Label_0278;
                }
                throw new IllegalStateException("parent composition reference not set".toString());
            }
            i1.f.o((i1.f)o2);
        }
        finally {
            ((i1.f)o3).c();
        }
    }
    
    public final LayoutNode d(final Object a) {
        final int j = this.j;
        final LayoutNode layoutNode = null;
        if (j == 0) {
            return null;
        }
        final int n = this.a.w().size() - this.k;
        while (true) {
            int i;
            for (int n2 = n - this.j, n3 = i = n - 1; i >= n2; --i) {
                final Object value = this.e.get(this.a.w().get(i));
                ng2.e.c(value);
                if (ng2.e.a(((a)value).a, a)) {
                    final int n4 = i;
                    int n5 = n4;
                    Label_0213: {
                        if (n4 == -1) {
                            for (i = n3; i >= n2; --i) {
                                final Object value2 = this.e.get(this.a.w().get(i));
                                ng2.e.c(value2);
                                final a a2 = (a)value2;
                                if (this.c.g(a, a2.a)) {
                                    a2.a = a;
                                    n5 = i;
                                    break Label_0213;
                                }
                            }
                            n5 = n4;
                        }
                    }
                    LayoutNode layoutNode2;
                    if (n5 == -1) {
                        layoutNode2 = layoutNode;
                    }
                    else {
                        if (i != n2) {
                            final LayoutNode a3 = this.a;
                            a3.o = true;
                            a3.L(i, n2, 1);
                            a3.o = false;
                        }
                        --this.j;
                        layoutNode2 = this.a.w().get(n2);
                        final Object value3 = this.e.get(layoutNode2);
                        ng2.e.c(value3);
                        final a a4 = (a)value3;
                        ((SnapshotMutableStateImpl)a4.e).setValue((Object)Boolean.TRUE);
                        a4.d = true;
                        f$a.d();
                    }
                    return layoutNode2;
                }
            }
            final int n4 = -1;
            continue;
        }
    }
    
    public static final class a
    {
        public Object a;
        public p<? super d, ? super Integer, j> b;
        public f c;
        public boolean d;
        public final k0 e;
        
        public a() {
            throw null;
        }
        
        public a(final Object a, final ComposableLambdaImpl b) {
            e.f((Object)b, "content");
            this.a = a;
            this.b = (p<? super d, ? super Integer, j>)b;
            this.c = null;
            this.e = ah0.b.Z0((Object)Boolean.TRUE);
        }
    }
}
