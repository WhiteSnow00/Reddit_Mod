// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform.accessibility;

import java.util.Collection;
import h2.j;
import h2.b;
import b4.c$c;
import ng2.e;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.EmptyList;
import n1.c;
import androidx.compose.ui.semantics.SemanticsNode;
import java.util.List;
import cg.d;
import java.util.ArrayList;

public final class a
{
    public static final boolean a(final ArrayList list) {
        final int size = list.size();
        boolean b = true;
        if (size < 2) {
            return true;
        }
        Object instance;
        if (list.size() != 0 && list.size() != 1) {
            final ArrayList list2 = new ArrayList();
            SemanticsNode value = list.get(0);
            final int r2 = d.R2((List)list);
            int n = 0;
            while (true) {
                instance = list2;
                if (n >= r2) {
                    break;
                }
                ++n;
                final Object value2 = list.get(n);
                final SemanticsNode semanticsNode = (SemanticsNode)value2;
                final SemanticsNode semanticsNode2 = value;
                list2.add(new c(vl.a.T(Math.abs(c.e(semanticsNode2.d().b()) - c.e(semanticsNode.d().b())), Math.abs(c.f(semanticsNode2.d().b()) - c.f(semanticsNode.d().b())))));
                value = (SemanticsNode)value2;
            }
        }
        else {
            instance = EmptyList.INSTANCE;
        }
        long n2;
        if (((Collection)instance).size() == 1) {
            n2 = ((c)CollectionsKt___CollectionsKt.S4((List)instance)).a;
        }
        else {
            if (((List)instance).isEmpty()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object s4 = CollectionsKt___CollectionsKt.S4((List)instance);
            final int r3 = d.R2((List)instance);
            Object o = s4;
            if (1 <= r3) {
                int n3 = 1;
                while (true) {
                    s4 = (o = new c(c.h(((c)s4).a, ((c)((List)instance).get(n3)).a)));
                    if (n3 == r3) {
                        break;
                    }
                    ++n3;
                }
            }
            n2 = ((c)o).a;
        }
        if (c.f(n2) >= c.e(n2)) {
            b = false;
        }
        return b;
    }
    
    public static final boolean b(final SemanticsNode semanticsNode) {
        return SemanticsConfigurationKt.a(semanticsNode.f(), SemanticsProperties.f) != null || SemanticsConfigurationKt.a(semanticsNode.f(), SemanticsProperties.e) != null;
    }
    
    public static final void c(final b4.c c, final SemanticsNode semanticsNode) {
        if (SemanticsConfigurationKt.a(semanticsNode.f(), SemanticsProperties.g) != null) {
            final j f = semanticsNode.f();
            final androidx.compose.ui.semantics.a v = SemanticsProperties.v;
            final CollectionInfoKt$toAccessibilityCollectionItemInfo$1 instance = CollectionInfoKt$toAccessibilityCollectionItemInfo$1.INSTANCE;
            f.getClass();
            e.f((Object)v, "key");
            e.f((Object)instance, "defaultValue");
            Object o;
            if ((o = f.f.get(v)) == null) {
                o = ((mg2.a)instance).invoke();
            }
            c.r(c$c.a(0, 0, 0, 0, false, (boolean)o));
        }
        final SemanticsNode g = semanticsNode.g();
        if (g == null) {
            return;
        }
        if (SemanticsConfigurationKt.a(g.f(), SemanticsProperties.e) != null) {
            final b b = (b)SemanticsConfigurationKt.a(g.f(), SemanticsProperties.f);
            if (b != null && (b.a < 0 || b.b < 0)) {
                return;
            }
            if (!semanticsNode.f().c(SemanticsProperties.v)) {
                return;
            }
            final ArrayList<SemanticsNode> list = new ArrayList<SemanticsNode>();
            final List e = g.e(false);
            final int size = e.size();
            int i = 0;
            int n = 0;
            while (i < size) {
                final SemanticsNode semanticsNode2 = e.get(i);
                int n2;
                if (semanticsNode2.f().c(SemanticsProperties.v)) {
                    list.add(semanticsNode2);
                    n2 = n;
                    if (semanticsNode2.c.y < semanticsNode.c.y) {
                        n2 = n + 1;
                    }
                }
                else {
                    n2 = n;
                }
                ++i;
                n = n2;
            }
            if (list.isEmpty() ^ true) {
                final boolean a = a(list);
                int n3;
                if (a) {
                    n3 = 0;
                }
                else {
                    n3 = n;
                }
                if (!a) {
                    n = 0;
                }
                final j f2 = semanticsNode.f();
                final androidx.compose.ui.semantics.a v2 = SemanticsProperties.v;
                final CollectionInfoKt$setCollectionItemInfo$itemInfo$1 instance2 = CollectionInfoKt$setCollectionItemInfo$itemInfo$1.INSTANCE;
                f2.getClass();
                ng2.e.f((Object)v2, "key");
                ng2.e.f((Object)instance2, "defaultValue");
                Object o2;
                if ((o2 = f2.f.get(v2)) == null) {
                    o2 = ((mg2.a)instance2).invoke();
                }
                c.r(c$c.a(n3, 1, n, 1, false, (boolean)o2));
            }
        }
    }
}
