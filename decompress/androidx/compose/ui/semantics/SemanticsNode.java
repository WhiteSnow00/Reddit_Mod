// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.semantics;

import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.EmptyList;
import gn.a;
import n1.d;
import a4.u1;
import androidx.compose.ui.node.b;
import androidx.compose.ui.node.LayoutNodeWrapper;
import h2.m;
import h2.q;
import h2.g;
import java.util.ArrayList;
import java.util.List;
import h2.l;
import ah2.f;
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
        ah2.f.f((Object)a, "outerSemanticsEntity");
        this.a = a;
        this.b = b;
        this.e = a.c();
        this.f = ((l)a.g).getId();
        this.g = a.f.j;
    }
    
    public static List b(SemanticsNode semanticsNode, List list, boolean b, int i) {
        if ((i & 0x1) != 0x0) {
            list = new ArrayList();
        }
        if ((i & 0x2) != 0x0) {
            b = false;
        }
        semanticsNode.getClass();
        final List<SemanticsNode> j = semanticsNode.j(b, false);
        int size;
        for (size = j.size(), i = 0; i < size; ++i) {
            semanticsNode = (SemanticsNode)j.get(i);
            if (semanticsNode.h()) {
                list.add(semanticsNode);
            }
            else if (!semanticsNode.e.h) {
                b(semanticsNode, list, false, 2);
            }
        }
        return list;
    }
    
    public final SemanticsNode a(final g g, final zg2.l<? super q, pg2.j> l) {
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
        final SemanticsNode semanticsNode = new SemanticsNode(new k(h, new m(false, false, l, n + n2)), false);
        semanticsNode.c = true;
        semanticsNode.d = this;
        return semanticsNode;
    }
    
    public final LayoutNodeWrapper c() {
        LayoutNodeWrapper layoutNodeWrapper;
        if (this.e.g) {
            k k;
            if ((k = u1.W(this.g)) == null) {
                k = this.a;
            }
            layoutNodeWrapper = k.f;
        }
        else {
            layoutNodeWrapper = this.a.f;
        }
        return layoutNodeWrapper;
    }
    
    public final d d() {
        if (!this.g.B()) {
            return n1.d.e;
        }
        return gn.a.k0((c2.l)this.c());
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
        LayoutNode layoutNode = null;
        Label_0065: {
            if (this.b) {
                final LayoutNode g = this.g;
                final SemanticsNode$parent.SemanticsNode$parent$1 instance = SemanticsNode$parent.SemanticsNode$parent$1.INSTANCE;
                for (LayoutNode layoutNode = g.s(); layoutNode != null; layoutNode = layoutNode.s()) {
                    if (((zg2.l)instance).invoke((Object)layoutNode)) {
                        break Label_0065;
                    }
                }
            }
            layoutNode = null;
        }
        LayoutNode layoutNode2 = layoutNode;
        Label_0118: {
            if (layoutNode == null) {
                final LayoutNode g2 = this.g;
                final SemanticsNode$parent.SemanticsNode$parent$2 instance2 = SemanticsNode$parent.SemanticsNode$parent$2.INSTANCE;
                for (layoutNode2 = g2.s(); layoutNode2 != null; layoutNode2 = layoutNode2.s()) {
                    if (((zg2.l)instance2).invoke((Object)layoutNode2)) {
                        break Label_0118;
                    }
                }
                layoutNode2 = null;
            }
        }
        k x;
        if (layoutNode2 != null) {
            x = u1.X(layoutNode2);
        }
        else {
            x = null;
        }
        if (x == null) {
            return null;
        }
        return new SemanticsNode(x, this.b);
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
                    ah2.f.f((Object)e, "child");
                    for (final Map.Entry<androidx.compose.ui.semantics.a, V> entry : e.f.entrySet()) {
                        final androidx.compose.ui.semantics.a a = entry.getKey();
                        final Object invoke = a.b.invoke(j.f.get(a), (Object)entry.getValue());
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
            at1.a.o0(g, (List)list2);
        }
        else {
            final LayoutNode g2 = this.g;
            list2 = new ArrayList();
            u1.L(g2, (List)list2);
        }
        for (int size = list2.size(), i = 0; i < size; ++i) {
            list.add(new SemanticsNode((k)list2.get(i), this.b));
        }
        if (b2) {
            final g g3 = SemanticsConfigurationKt.a(this.e, SemanticsProperties.p);
            if (g3 != null && this.e.g && (list.isEmpty() ^ true)) {
                list.add(this.a(g3, (zg2.l<? super q, pg2.j>)new SemanticsNode$emitFakeNodes$fakeNode$1(g3)));
            }
            final j e = this.e;
            final androidx.compose.ui.semantics.a<List<String>> a = SemanticsProperties.a;
            if (e.b((androidx.compose.ui.semantics.a<Object>)a) && (list.isEmpty() ^ true)) {
                final j e2 = this.e;
                if (e2.g) {
                    final List list3 = SemanticsConfigurationKt.a(e2, (androidx.compose.ui.semantics.a<List>)a);
                    String s;
                    if (list3 != null) {
                        s = (String)CollectionsKt___CollectionsKt.s1((List)list3);
                    }
                    else {
                        s = null;
                    }
                    if (s != null) {
                        list.add(0, this.a(null, (zg2.l<? super q, pg2.j>)new SemanticsNode$emitFakeNodes$fakeNode$2(s)));
                    }
                }
            }
        }
        return list;
    }
}
