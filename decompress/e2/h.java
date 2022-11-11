// 
// Decompiled by Procyon v0.6.0
// 

package e2;

import java.util.TreeSet;
import java.util.AbstractCollection;
import androidx.compose.ui.node.LayoutNode$LayoutState;
import kotlin.NoWhenBranchMatchedException;
import androidx.compose.ui.unit.LayoutDirection;
import c2.e0;
import c2.e0$a;
import androidx.compose.ui.node.OuterMeasurablePlaceable;
import androidx.compose.ui.node.LayoutNode$UsageByParent;
import java.util.Comparator;
import java.util.ArrayList;
import a1.e;
import androidx.compose.ui.node.a;
import androidx.compose.ui.node.LayoutNode;

public final class h
{
    public final LayoutNode a;
    public final androidx.compose.ui.node.a b;
    public boolean c;
    public final k d;
    public final e<m.a> e;
    public long f;
    public final ArrayList g;
    public u2.a h;
    
    public h(final LayoutNode a) {
        sg2.e.f((Object)a, "root");
        this.a = a;
        this.b = new androidx.compose.ui.node.a();
        this.d = new k();
        this.e = (e<m.a>)new e((Object[])new m.a[16]);
        this.f = 1L;
        this.g = new ArrayList();
    }
    
    public final void a(final boolean b) {
        if (b) {
            final k d = this.d;
            final LayoutNode a = this.a;
            d.getClass();
            sg2.e.f((Object)a, "rootNode");
            d.a.e();
            d.a.b((Object)a);
            a.T = true;
        }
        final k d2 = this.d;
        d2.a.o((Comparator)j.f);
        final e<LayoutNode> a2 = d2.a;
        int h = a2.h;
        if (h > 0) {
            --h;
            final Object[] f = a2.f;
            do {
                final LayoutNode layoutNode = (LayoutNode)f[h];
                if (layoutNode.T) {
                    k.a(layoutNode);
                }
            } while (--h >= 0);
        }
        d2.a.e();
    }
    
    public final boolean b(final LayoutNode layoutNode, u2.a a) {
        boolean b;
        if (a != null) {
            if (layoutNode.E == LayoutNode$UsageByParent.NotUsed) {
                layoutNode.l();
            }
            b = layoutNode.I.B0(a.a);
        }
        else {
            final OuterMeasurablePlaceable i = layoutNode.I;
            if (i.l) {
                a = new u2.a(((e0)i).i);
            }
            else {
                a = null;
            }
            if (a != null) {
                if (layoutNode.E == LayoutNode$UsageByParent.NotUsed) {
                    layoutNode.l();
                }
                b = layoutNode.I.B0(a.a);
            }
            else {
                b = false;
            }
        }
        final LayoutNode t = layoutNode.t();
        if (b && t != null) {
            final LayoutNode$UsageByParent d = layoutNode.D;
            if (d == LayoutNode$UsageByParent.InMeasureBlock) {
                this.h(t, false);
            }
            else if (d == LayoutNode$UsageByParent.InLayoutBlock) {
                this.g(t, false);
            }
        }
        return b;
    }
    
    public final void c(final LayoutNode layoutNode) {
        sg2.e.f((Object)layoutNode, "layoutNode");
        if (((AbstractCollection)this.b.b).isEmpty()) {
            return;
        }
        if (!this.c) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (layoutNode.V ^ true) {
            final e v = layoutNode.v();
            final int h = v.h;
            if (h > 0) {
                int n = 0;
                final Object[] f = v.f;
                do {
                    final LayoutNode layoutNode2 = (LayoutNode)f[n];
                    if (layoutNode2.V && this.b.b(layoutNode2)) {
                        this.f(layoutNode2);
                    }
                    if (!layoutNode2.V) {
                        this.c(layoutNode2);
                    }
                } while (++n < h);
            }
            if (layoutNode.V && this.b.b(layoutNode)) {
                this.f(layoutNode);
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
    
    public final boolean d(final rg2.a<hg2.j> a) {
        if (!this.a.B()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!this.a.z) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (this.c ^ true) {
            final u2.a h = this.h;
            int n = 0;
            boolean f = false;
            Label_0177: {
                if (h != null) {
                    this.c = true;
                    try {
                        if (((AbstractCollection)this.b.b).isEmpty() ^ true) {
                            final androidx.compose.ui.node.a b = this.b;
                            boolean b2 = false;
                            while (((AbstractCollection)b.b).isEmpty() ^ true) {
                                final LayoutNode layoutNode = ((TreeSet<LayoutNode>)b.b).first();
                                sg2.e.e((Object)layoutNode, "node");
                                b.b(layoutNode);
                                f = this.f(layoutNode);
                                if (layoutNode == this.a && f) {
                                    b2 = true;
                                }
                            }
                            f = b2;
                            if (a != null) {
                                a.invoke();
                                f = b2;
                            }
                        }
                        else {
                            f = false;
                        }
                        break Label_0177;
                    }
                    finally {
                        this.c = false;
                    }
                }
                f = false;
            }
            final e<m.a> e = this.e;
            final int h2 = e.h;
            if (h2 > 0) {
                final Object[] f2 = e.f;
                do {
                    ((m.a)f2[n]).f();
                } while (++n < h2);
            }
            this.e.e();
            return f;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
    
    public final void e(final LayoutNode layoutNode, final long n) {
        sg2.e.f((Object)layoutNode, "layoutNode");
        if (!(sg2.e.a((Object)layoutNode, (Object)this.a) ^ true)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!this.a.B()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!this.a.z) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (this.c ^ true) {
            final u2.a h = this.h;
            int n2 = 0;
            if (h != null) {
                this.c = true;
                try {
                    this.b.b(layoutNode);
                    this.b(layoutNode, new u2.a(n));
                    if (layoutNode.W && layoutNode.z) {
                        layoutNode.P();
                        final k d = this.d;
                        d.getClass();
                        d.a.b((Object)layoutNode);
                        layoutNode.T = true;
                    }
                }
                finally {
                    this.c = false;
                }
            }
            final e<m.a> e = this.e;
            final int h2 = e.h;
            if (h2 > 0) {
                final Object[] f = e.f;
                do {
                    ((m.a)f[n2]).f();
                } while (++n2 < h2);
            }
            this.e.e();
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
    
    public final boolean f(LayoutNode layoutNode) {
        final boolean z = layoutNode.z;
        boolean b = false;
        if (!z) {
            boolean b2 = false;
            Label_0070: {
                Label_0067: {
                    if (layoutNode.V) {
                        if (layoutNode.D != LayoutNode$UsageByParent.InMeasureBlock) {
                            final e2.e y = layoutNode.y;
                            y.c();
                            if (y.h == null) {
                                break Label_0067;
                            }
                        }
                        b2 = true;
                        break Label_0070;
                    }
                }
                b2 = false;
            }
            if (!b2) {
                final e2.e y2 = layoutNode.y;
                y2.c();
                if (y2.h == null) {
                    return b;
                }
            }
        }
        if (layoutNode.V) {
            u2.a h;
            if (layoutNode == this.a) {
                h = this.h;
                sg2.e.c((Object)h);
            }
            else {
                h = null;
            }
            b = this.b(layoutNode, h);
        }
        else {
            b = false;
        }
        if (layoutNode.W && layoutNode.z) {
            if (layoutNode == this.a) {
                if (layoutNode.E == LayoutNode$UsageByParent.NotUsed) {
                    layoutNode.m();
                }
                final e0$a.a a = e0$a.a;
                final int x = layoutNode.I.X();
                final LayoutDirection w = layoutNode.w;
                a.getClass();
                final int c = e0$a.c;
                final LayoutDirection b3 = e0$a.b;
                e0$a.c = x;
                e0$a.b = w;
                ((e0$a)a).e((e0)layoutNode.I, 0, 0, 0.0f);
                e0$a.c = c;
                e0$a.b = b3;
            }
            else {
                layoutNode.P();
            }
            final k d = this.d;
            d.getClass();
            d.a.b((Object)layoutNode);
            layoutNode.T = true;
        }
        if (this.g.isEmpty() ^ true) {
            final ArrayList g = this.g;
            for (int size = g.size(), i = 0; i < size; ++i) {
                layoutNode = (LayoutNode)g.get(i);
                if (layoutNode.B()) {
                    this.h(layoutNode, false);
                }
            }
            this.g.clear();
        }
        return b;
    }
    
    public final boolean g(final LayoutNode layoutNode, final boolean b) {
        sg2.e.f((Object)layoutNode, "layoutNode");
        final int n = e2.h.a.a[((Enum)layoutNode.n).ordinal()];
        boolean b3;
        final boolean b2 = b3 = false;
        if (n != 1) {
            b3 = b2;
            if (n != 2) {
                if (n != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if ((layoutNode.V || layoutNode.W) && !b) {
                    b3 = b2;
                }
                else {
                    layoutNode.W = true;
                    if (layoutNode.z) {
                        final LayoutNode t = layoutNode.t();
                        if ((t == null || !t.W) && (t == null || !t.V)) {
                            this.b.a(layoutNode);
                        }
                    }
                    b3 = b2;
                    if (!this.c) {
                        b3 = true;
                    }
                }
            }
        }
        return b3;
    }
    
    public final boolean h(final LayoutNode layoutNode, final boolean b) {
        sg2.e.f((Object)layoutNode, "layoutNode");
        final int n = e2.h.a.a[((Enum)layoutNode.n).ordinal()];
        boolean b3;
        final boolean b2 = b3 = false;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (layoutNode.V && !b) {
                    b3 = b2;
                }
                else {
                    layoutNode.V = true;
                    Label_0172: {
                        if (!layoutNode.z) {
                            boolean b4 = false;
                            Label_0128: {
                                if (layoutNode.D != LayoutNode$UsageByParent.InMeasureBlock) {
                                    final e2.e y = layoutNode.y;
                                    y.c();
                                    if (y.h == null) {
                                        b4 = false;
                                        break Label_0128;
                                    }
                                }
                                b4 = true;
                            }
                            if (!b4) {
                                break Label_0172;
                            }
                        }
                        final LayoutNode t = layoutNode.t();
                        if (t == null || !t.V) {
                            this.b.a(layoutNode);
                        }
                    }
                    b3 = b2;
                    if (!this.c) {
                        b3 = true;
                    }
                }
            }
            else {
                this.g.add(layoutNode);
                b3 = b2;
            }
        }
        return b3;
    }
    
    public final void i(final long n) {
        final u2.a h = this.h;
        if (h == null || !u2.a.b(h.a, n)) {
            if (!(this.c ^ true)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            this.h = new u2.a(n);
            final LayoutNode a = this.a;
            a.V = true;
            this.b.a(a);
        }
    }
}
