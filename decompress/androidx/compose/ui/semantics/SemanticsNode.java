// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.semantics;

import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.EmptyList;
import n1.d;
import wd.a;
import androidx.compose.ui.node.b;
import androidx.compose.ui.node.LayoutNodeWrapper;
import h2.m;
import h2.q;
import h2.g;
import java.util.ArrayList;
import java.util.List;
import h2.l;
import sg2.e;
import androidx.compose.ui.node.LayoutNode;
import h2.j;
import h2.k;

public final class SemanticsNode
{
    public final k a;
    public final boolean b;
    public boolean c;
    public SemanticsNode d;
    public final j e;
    public final int f;
    public final LayoutNode g;
    
    public SemanticsNode(final k a, final boolean b) {
        sg2.e.f((Object)a, "outerSemanticsEntity");
        this.a = a;
        this.b = b;
        this.e = a.c();
        this.f = ((l)((e2.g)a).g).getId();
        this.g = ((e2.g)a).f.j;
    }
    
    public static List b(final SemanticsNode semanticsNode, List list, boolean b, int i) {
        if ((i & 0x1) != 0x0) {
            list = new ArrayList();
        }
        if ((i & 0x2) != 0x0) {
            b = false;
        }
        semanticsNode.getClass();
        final List<SemanticsNode> j = semanticsNode.j(b, false);
        int size;
        SemanticsNode semanticsNode2;
        for (size = j.size(), i = 0; i < size; ++i) {
            semanticsNode2 = j.get(i);
            if (semanticsNode2.h()) {
                list.add(semanticsNode2);
            }
            else if (!semanticsNode2.e.h) {
                b(semanticsNode2, list, false, 2);
            }
        }
        return list;
    }
    
    public final SemanticsNode a(final g g, final rg2.l<? super q, hg2.j> l) {
        final b h = new LayoutNode(true).H;
        int n;
        int n2;
        if (g != null) {
            n = this.f;
            n2 = 1000000000;
        }
        else {
            n = this.f;
            n2 = 2000000000;
        }
        final SemanticsNode semanticsNode = new SemanticsNode(new k((LayoutNodeWrapper)h, (l)new m(false, false, l, n + n2)), false);
        semanticsNode.c = true;
        semanticsNode.d = this;
        return semanticsNode;
    }
    
    public final LayoutNodeWrapper c() {
        LayoutNodeWrapper layoutNodeWrapper;
        if (this.e.g) {
            k k;
            if ((k = wd.a.M(this.g)) == null) {
                k = this.a;
            }
            layoutNodeWrapper = ((e2.g)k).f;
        }
        else {
            layoutNodeWrapper = ((e2.g)this.a).f;
        }
        return layoutNodeWrapper;
    }
    
    public final d d() {
        if (!this.g.B()) {
            return n1.d.e;
        }
        return yg.a.X((c2.l)this.c());
    }
    
    public final List e(final boolean b) {
        if (this.e.h) {
            return (List)EmptyList.INSTANCE;
        }
        if (this.h()) {
            return b(this, null, b, 1);
        }
        return this.j(b, true);
    }
    
    public final j f() {
        if (this.h()) {
            final j e = this.e;
            e.getClass();
            final j j = new j();
            j.g = e.g;
            j.h = e.h;
            j.f.putAll(e.f);
            this.i(j);
            return j;
        }
        return this.e;
    }
    
    public final SemanticsNode g() {
        final SemanticsNode d = this.d;
        if (d != null) {
            return d;
        }
        LayoutNode layoutNode2 = null;
        Label_0067: {
            if (this.b) {
                final LayoutNode g = this.g;
                final SemanticsNode$parent$1 instance = SemanticsNode$parent$1.INSTANCE;
                for (LayoutNode layoutNode = g.t(); layoutNode != null; layoutNode = layoutNode.t()) {
                    if (((rg2.l<LayoutNode, Boolean>)instance).invoke(layoutNode)) {
                        layoutNode2 = layoutNode;
                        break Label_0067;
                    }
                }
            }
            layoutNode2 = null;
        }
        LayoutNode layoutNode3 = layoutNode2;
        Label_0120: {
            if (layoutNode2 == null) {
                final LayoutNode g2 = this.g;
                final SemanticsNode$parent$2 instance2 = SemanticsNode$parent$2.INSTANCE;
                for (layoutNode3 = g2.t(); layoutNode3 != null; layoutNode3 = layoutNode3.t()) {
                    if (((rg2.l<LayoutNode, Boolean>)instance2).invoke(layoutNode3)) {
                        break Label_0120;
                    }
                }
                layoutNode3 = null;
            }
        }
        k n;
        if (layoutNode3 != null) {
            n = wd.a.N(layoutNode3);
        }
        else {
            n = null;
        }
        if (n == null) {
            return null;
        }
        return new SemanticsNode(n, this.b);
    }
    
    public final boolean h() {
        return this.b && this.e.g;
    }
    
    public final void i(final j j) {
        if (!this.e.h) {
            int i = 0;
            for (List<SemanticsNode> k = this.j(false, false); i < k.size(); ++i) {
                final SemanticsNode semanticsNode = k.get(i);
                if (!semanticsNode.h()) {
                    final j e = semanticsNode.e;
                    sg2.e.f((Object)e, "child");
                    for (final Map.Entry<androidx.compose.ui.semantics.a, V> entry : e.f.entrySet()) {
                        final androidx.compose.ui.semantics.a a = entry.getKey();
                        final T invoke = a.b.invoke(j.f.get(a), (T)entry.getValue());
                        if (invoke != null) {
                            j.f.put(a, invoke);
                        }
                    }
                    semanticsNode.i(j);
                }
            }
        }
    }
    
    public final List<SemanticsNode> j(final boolean b, final boolean b2) {
        if (this.c) {
            return (List<SemanticsNode>)EmptyList.INSTANCE;
        }
        final ArrayList list = new ArrayList();
        ArrayList list2;
        if (b) {
            final LayoutNode g = this.g;
            list2 = new ArrayList();
            aa1.a.i0(g, (List)list2);
        }
        else {
            final LayoutNode g2 = this.g;
            list2 = new ArrayList();
            wd.a.F(g2, (List)list2);
        }
        for (int size = list2.size(), i = 0; i < size; ++i) {
            list.add(new SemanticsNode((k)list2.get(i), this.b));
        }
        if (b2) {
            final g g3 = SemanticsConfigurationKt.a(this.e, SemanticsProperties.p);
            if (g3 != null && this.e.g && (list.isEmpty() ^ true)) {
                list.add(this.a(g3, (rg2.l<? super q, hg2.j>)new SemanticsNode$emitFakeNodes$fakeNode$1(g3)));
            }
            final j e = this.e;
            final androidx.compose.ui.semantics.a<List<String>> a = SemanticsProperties.a;
            if (e.c((androidx.compose.ui.semantics.a)a) && (list.isEmpty() ^ true)) {
                final j e2 = this.e;
                if (e2.g) {
                    final List list3 = SemanticsConfigurationKt.a(e2, (androidx.compose.ui.semantics.a<List>)a);
                    String s;
                    if (list3 != null) {
                        s = (String)CollectionsKt___CollectionsKt.C3((List)list3);
                    }
                    else {
                        s = null;
                    }
                    if (s != null) {
                        list.add(0, this.a(null, (rg2.l<? super q, hg2.j>)new SemanticsNode$emitFakeNodes$fakeNode$2(s)));
                    }
                }
            }
        }
        return list;
    }
}
