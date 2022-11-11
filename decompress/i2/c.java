// 
// Decompiled by Procyon v0.6.0
// 

package i2;

import o1.k0;
import o1.p;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.Collection;
import ig2.o;
import n1.d;
import java.util.List;
import lw0.b;
import androidx.compose.ui.text.platform.AndroidParagraph;
import ej2.c0;
import u2.a;
import java.util.ArrayList;
import androidx.compose.ui.text.MultiParagraphIntrinsics;

public final class c
{
    public final MultiParagraphIntrinsics a;
    public final int b;
    public final boolean c;
    public final float d;
    public final float e;
    public final int f;
    public final ArrayList g;
    public final ArrayList h;
    
    public c(final MultiParagraphIntrinsics a, final long n, int i, final boolean b) {
        this.a = a;
        this.b = i;
        if (u2.a.j(n) == 0 && u2.a.i(n) == 0) {
            i = 1;
        }
        else {
            i = 0;
        }
        if (i != 0) {
            final ArrayList<e> h = new ArrayList<e>();
            final ArrayList e = a.e;
            final int size = e.size();
            float e2 = 0.0f;
            int j = 0;
            i = 0;
            while (true) {
                while (j < size) {
                    final f f = (f)e.get(j);
                    final g a2 = f.a;
                    final int h2 = u2.a.h(n);
                    int g;
                    if (u2.a.c(n)) {
                        if ((g = u2.a.g(n) - (int)(float)Math.ceil(e2)) < 0) {
                            g = 0;
                        }
                    }
                    else {
                        g = u2.a.g(n);
                    }
                    final long n2 = c0.n2(h2, g, 5);
                    final int b2 = this.b;
                    sg2.e.f((Object)a2, "paragraphIntrinsics");
                    final AndroidParagraph androidParagraph = new AndroidParagraph((androidx.compose.ui.text.platform.a)a2, b2 - i, b, n2);
                    final float n3 = androidParagraph.getHeight() + e2;
                    final int n4 = i + androidParagraph.d.c;
                    h.add(new e(androidParagraph, f.b, f.c, i, n4, e2, n3));
                    if (androidParagraph.d.a || (n4 == this.b && j != lw0.b.L0((List)this.a.e))) {
                        e2 = n3;
                        final boolean c = true;
                        i = n4;
                        this.e = e2;
                        this.f = i;
                        this.c = c;
                        this.h = h;
                        this.d = (float)u2.a.h(n);
                        final ArrayList list = new ArrayList(h.size());
                        int size2;
                        e e3;
                        List<d> t;
                        ArrayList list2;
                        int size3;
                        int k;
                        d d;
                        d a3;
                        for (size2 = h.size(), i = 0; i < size2; ++i) {
                            e3 = h.get(i);
                            t = e3.a.t();
                            list2 = new ArrayList<d>(t.size());
                            for (size3 = t.size(), k = 0; k < size3; ++k) {
                                d = t.get(k);
                                if (d != null) {
                                    a3 = e3.a(d);
                                }
                                else {
                                    a3 = null;
                                }
                                list2.add(a3);
                            }
                            o.j3((Iterable)list2, (Collection)list);
                        }
                        ArrayList w3 = list;
                        if (list.size() < this.a.b.size()) {
                            final int n5 = this.a.b.size() - list.size();
                            final ArrayList list3 = new ArrayList<Object>(n5);
                            for (i = 0; i < n5; ++i) {
                                list3.add(null);
                            }
                            w3 = CollectionsKt___CollectionsKt.W3((Iterable)list3, (Collection)list);
                        }
                        this.g = w3;
                        return;
                    }
                    ++j;
                    i = n4;
                    e2 = n3;
                }
                final boolean c = false;
                continue;
            }
        }
        throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.".toString());
    }
    
    public final void a(final p p4, final long n, final k0 k0, final t2.e e) {
        p4.save();
        final ArrayList h = this.h;
        for (int size = h.size(), i = 0; i < size; ++i) {
            final e e2 = (e)h.get(i);
            e2.a.j(p4, n, k0, e);
            p4.f(0.0f, e2.a.getHeight());
        }
        p4.restore();
    }
    
    public final void b(final int n) {
        int n2 = 0;
        if (n >= 0) {
            n2 = n2;
            if (n <= this.a.a.f.length()) {
                n2 = 1;
            }
        }
        if (n2 != 0) {
            return;
        }
        final StringBuilder i = al0.b.i("offset(", n, ") is out of bounds [0, ");
        i.append(this.a.a.length());
        i.append(']');
        throw new IllegalArgumentException(i.toString().toString());
    }
    
    public final void c(final int n) {
        int n2 = 0;
        if (n >= 0) {
            n2 = n2;
            if (n < this.f) {
                n2 = 1;
            }
        }
        if (n2 != 0) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("lineIndex(");
        sb.append(n);
        sb.append(") is out of bounds [0, ");
        sb.append(n);
        sb.append(')');
        throw new IllegalArgumentException(sb.toString().toString());
    }
}
