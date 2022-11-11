// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.semantics;

import kotlin.Metadata;
import androidx.compose.ui.node.LayoutNodeWrapper;
import androidx.compose.ui.node.b;
import c2.l;
import aa1.a;
import sg2.e;
import androidx.compose.ui.unit.LayoutDirection;
import n1.d;
import androidx.compose.ui.node.LayoutNode;

public final class NodeLocationHolder implements Comparable<NodeLocationHolder>
{
    public static ComparisonStrategy j;
    public final LayoutNode f;
    public final LayoutNode g;
    public final d h;
    public final LayoutDirection i;
    
    static {
        NodeLocationHolder.j = ComparisonStrategy.Stripe;
    }
    
    public NodeLocationHolder(final LayoutNode f, final LayoutNode g) {
        e.f((Object)f, "subtreeRoot");
        this.f = f;
        this.g = g;
        this.i = f.w;
        final b h = f.H;
        final LayoutNodeWrapper j0 = a.j0(g);
        d a;
        if (((LayoutNodeWrapper)h).isAttached() && j0.isAttached()) {
            a = ((LayoutNodeWrapper)h).A((l)j0, true);
        }
        else {
            a = null;
        }
        this.h = a;
    }
    
    public final int a(final NodeLocationHolder nodeLocationHolder) {
        e.f((Object)nodeLocationHolder, "other");
        final d h = this.h;
        final int n = 1;
        final int n2 = 1;
        final int n3 = 1;
        final int n4 = 1;
        final int n5 = 1;
        if (h == null) {
            return 1;
        }
        final d h2 = nodeLocationHolder.h;
        if (h2 == null) {
            return -1;
        }
        if (NodeLocationHolder.j == ComparisonStrategy.Stripe) {
            if (h.d - h2.b <= 0.0f) {
                return -1;
            }
            if (h.b - h2.d >= 0.0f) {
                return 1;
            }
        }
        final LayoutDirection i = this.i;
        final LayoutDirection ltr = LayoutDirection.Ltr;
        final int n6 = 0;
        if (i == ltr) {
            final float n7 = fcmpg(h.a - h2.a, 0.0f);
            if (n7 != 0) {
                int n8 = n5;
                if (n7 < 0) {
                    n8 = -1;
                }
                return n8;
            }
        }
        else {
            final float n9 = fcmpg(h.c - h2.c, 0.0f);
            if (n9 != 0) {
                int n10;
                if (n9 < 0) {
                    n10 = n;
                }
                else {
                    n10 = -1;
                }
                return n10;
            }
        }
        final float b = h.b;
        final float b2 = h2.b;
        final float n11 = fcmpg(b - b2, 0.0f);
        if (n11 != 0) {
            int n12 = n2;
            if (n11 < 0) {
                n12 = -1;
            }
            return n12;
        }
        final float n13 = fcmpg(h.d - b - (h2.d - b2), 0.0f);
        if (n13 != 0) {
            int n14;
            if (n13 < 0) {
                n14 = n3;
            }
            else {
                n14 = -1;
            }
            return n14;
        }
        final float n15 = fcmpg(h.c - h.a - (h2.c - h2.a), 0.0f);
        int n16 = n6;
        if (n15 == 0) {
            n16 = 1;
        }
        if (n16 == 0) {
            int n17;
            if (n15 < 0) {
                n17 = n4;
            }
            else {
                n17 = -1;
            }
            return n17;
        }
        final d x = yg.a.X((l)a.j0(this.g));
        final d x2 = yg.a.X((l)a.j0(nodeLocationHolder.g));
        final LayoutNode h3 = a.h0(this.g, (rg2.l)new NodeLocationHolder$compareTo$child1$1(x));
        final LayoutNode h4 = a.h0(nodeLocationHolder.g, (rg2.l)new NodeLocationHolder$compareTo$child2$1(x2));
        if (h3 != null && h4 != null) {
            return new NodeLocationHolder(this.f, h3).a(new NodeLocationHolder(nodeLocationHolder.f, h4));
        }
        if (h3 != null) {
            return 1;
        }
        return -1;
    }
    
    @Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005" }, d2 = { "Landroidx/compose/ui/semantics/NodeLocationHolder$ComparisonStrategy;", "", "(Ljava/lang/String;I)V", "Stripe", "Location", "ui_release" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
    public enum ComparisonStrategy
    {
        Location, 
        Stripe;
    }
}
