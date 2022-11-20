// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.node;

import ng2.e;
import java.util.Comparator;
import e2.c;
import kotlin.LazyThreadSafetyMode;
import cg2.f;

public final class a
{
    public final f a;
    public final TreeSet<LayoutNode> b;
    
    public a() {
        this.a = kotlin.a.a(LazyThreadSafetyMode.NONE, (mg2.a)DepthSortedSet$mapOfOriginalDepth$2.INSTANCE);
        this.b = new TreeSet<LayoutNode>((Comparator<? super LayoutNode>)new c());
    }
    
    public final void a(final LayoutNode layoutNode) {
        e.f((Object)layoutNode, "node");
        if (layoutNode.G()) {
            this.b.add(layoutNode);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
    
    public final boolean b(final LayoutNode layoutNode) {
        e.f((Object)layoutNode, "node");
        if (layoutNode.G()) {
            return this.b.remove(layoutNode);
        }
        throw new IllegalStateException("Check failed.".toString());
    }
    
    @Override
    public final String toString() {
        final String string = this.b.toString();
        e.e((Object)string, "set.toString()");
        return string;
    }
}
