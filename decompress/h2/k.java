// 
// Decompiled by Procyon v0.6.0
// 

package h2;

import java.util.LinkedHashMap;
import java.util.Iterator;
import androidx.compose.ui.semantics.a;
import java.util.Map;
import e2.m;
import j1.d;
import ah2.f;
import androidx.compose.ui.node.LayoutNodeWrapper;
import e2.g;

public final class k extends g<k, l>
{
    public k(final LayoutNodeWrapper layoutNodeWrapper, final l l) {
        f.f((Object)layoutNodeWrapper, "wrapped");
        f.f((Object)l, "modifier");
        super(layoutNodeWrapper, (d)l);
    }
    
    public final void a() {
        super.i = true;
        final m l = super.f.j.l;
        if (l != null) {
            l.y();
        }
    }
    
    public final void b() {
        super.i = false;
        final m l = super.f.j.l;
        if (l != null) {
            l.y();
        }
    }
    
    public final j c() {
        k k = (k)super.h;
        final k i = null;
        k j = null;
        Label_0177: {
            if (k == null) {
                LayoutNodeWrapper layoutNodeWrapper = super.f.Z0();
                j = i;
                if (layoutNodeWrapper == null) {
                    break Label_0177;
                }
                while (layoutNodeWrapper != null && !dg.d.f0(layoutNodeWrapper.x, 2)) {
                    layoutNodeWrapper = layoutNodeWrapper.Z0();
                }
                j = i;
                if (layoutNodeWrapper == null) {
                    break Label_0177;
                }
                k = (k)layoutNodeWrapper.x[2];
                j = i;
                if (k == null) {
                    break Label_0177;
                }
                LayoutNodeWrapper layoutNodeWrapper2 = k.f;
                while (true) {
                    j = i;
                    if (layoutNodeWrapper2 == null) {
                        break Label_0177;
                    }
                    if (k != null) {
                        break;
                    }
                    layoutNodeWrapper2 = layoutNodeWrapper2.Z0();
                    if (layoutNodeWrapper2 != null) {
                        k = (k)layoutNodeWrapper2.x[2];
                    }
                    else {
                        k = null;
                    }
                }
            }
            else {
                LayoutNodeWrapper layoutNodeWrapper3 = k.f;
                while (true) {
                    j = i;
                    if (layoutNodeWrapper3 == null) {
                        break Label_0177;
                    }
                    if (k != null) {
                        break;
                    }
                    layoutNodeWrapper3 = layoutNodeWrapper3.Z0();
                    if (layoutNodeWrapper3 != null) {
                        k = (k)layoutNodeWrapper3.x[2];
                    }
                    else {
                        k = null;
                    }
                }
            }
            j = k;
        }
        if (j != null && !((l)super.g).Q0().h) {
            final j q0 = ((l)super.g).Q0();
            q0.getClass();
            final j l = new j();
            l.g = q0.g;
            l.h = q0.h;
            l.f.putAll(q0.f);
            final j c = j.c();
            f.f((Object)c, "peer");
            if (c.g) {
                l.g = true;
            }
            if (c.h) {
                l.h = true;
            }
            for (final Map.Entry<a, V> entry : c.f.entrySet()) {
                final a a = entry.getKey();
                final V value = entry.getValue();
                if (!l.f.containsKey(a)) {
                    l.f.put(a, value);
                }
                else {
                    if (!(value instanceof h2.a)) {
                        continue;
                    }
                    final Object value2 = l.f.get(a);
                    if (value2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                    }
                    final h2.a a2 = (h2.a)value2;
                    final LinkedHashMap f = l.f;
                    String s;
                    if ((s = a2.a) == null) {
                        s = ((h2.a)value).a;
                    }
                    pg2.d d;
                    if ((d = a2.b) == null) {
                        d = ((h2.a)value).b;
                    }
                    f.put(a, new h2.a(s, d));
                }
            }
            return l;
        }
        return ((l)super.g).Q0();
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" id: ");
        sb.append(((l)super.g).getId());
        sb.append(" config: ");
        sb.append(((l)super.g).Q0());
        return sb.toString();
    }
}
