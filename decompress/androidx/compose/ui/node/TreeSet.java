// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.node;

import ng2.e;
import java.util.Comparator;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B!\u0012\u001a\u0010\u0003\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0004j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007" }, d2 = { "Landroidx/compose/ui/node/TreeSet;", "E", "Ljava/util/TreeSet;", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "(Ljava/util/Comparator;)V", "ui_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class TreeSet<E> extends java.util.TreeSet<E>
{
    public TreeSet(final Comparator<? super E> comparator) {
        e.f((Object)comparator, "comparator");
        super(comparator);
    }
    
    public /* bridge */ int getSize() {
        return super.size();
    }
    
    @Override
    public final /* bridge */ int size() {
        return this.getSize();
    }
}
