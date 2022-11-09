// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.text;

import t2.d;
import t2.c;
import kotlin.collections.EmptyList;
import i2.h;
import kotlin.LazyThreadSafetyMode;
import u2.b;
import i2.p;
import java.util.ArrayList;
import pg2.f;
import i2.j;
import i2.a$b;
import java.util.List;
import i2.a;
import i2.g;

public final class MultiParagraphIntrinsics implements g
{
    public final a a;
    public final List<a$b<j>> b;
    public final f c;
    public final f d;
    public final ArrayList e;
    
    public MultiParagraphIntrinsics(final a a, final p p5, final List<a$b<j>> b, final b b2, final n2.g.a a2) {
        ah2.f.f((Object)a, "annotatedString");
        ah2.f.f((Object)b, "placeholders");
        ah2.f.f((Object)b2, "density");
        ah2.f.f((Object)a2, "fontFamilyResolver");
        this.a = a;
        this.b = b;
        final LazyThreadSafetyMode none = LazyThreadSafetyMode.NONE;
        this.c = kotlin.a.a(none, (zg2.a)new MultiParagraphIntrinsics$minIntrinsicWidth.MultiParagraphIntrinsics$minIntrinsicWidth$2(this));
        this.d = kotlin.a.a(none, (zg2.a)new MultiParagraphIntrinsics$maxIntrinsicWidth.MultiParagraphIntrinsics$maxIntrinsicWidth$2(this));
        final h b3 = p5.b;
        final a a3 = i2.b.a;
        ah2.f.f((Object)b3, "defaultParagraphStyle");
        final int length = a.f.length();
        final List h = a.h;
        final ArrayList list = new ArrayList();
        final int size = h.size();
        int i = 0;
        int n = 0;
        while (i < size) {
            final a$b a$b = h.get(i);
            final h h2 = (h)a$b.a;
            final int b4 = a$b.b;
            final int c = a$b.c;
            if (b4 != n) {
                list.add(new a$b((Object)b3, n, b4));
            }
            list.add(new a$b((Object)b3.a(h2), b4, c));
            ++i;
            n = c;
        }
        if (n != length) {
            list.add(new a$b((Object)b3, n, length));
        }
        if (list.isEmpty()) {
            list.add(new a$b((Object)b3, 0, 0));
        }
        final ArrayList e = new ArrayList<i2.f>(list.size());
        for (int size2 = list.size(), j = 0; j < size2; ++j) {
            final a$b a$b2 = list.get(j);
            final int b5 = a$b2.b;
            final int c2 = a$b2.c;
            String substring;
            if (b5 != c2) {
                substring = a.f.substring(b5, c2);
                ah2.f.e((Object)substring, "this as java.lang.String\u2026ing(startIndex, endIndex)");
            }
            else {
                substring = "";
            }
            Object o;
            if (b5 == c2) {
                o = EmptyList.INSTANCE;
            }
            else if (b5 == 0 && c2 >= a.f.length()) {
                o = a.g;
            }
            else {
                final List g = a.g;
                final ArrayList list2 = new ArrayList<a$b>(g.size());
                for (int size3 = g.size(), k = 0; k < size3; ++k) {
                    final Object value = g.get(k);
                    final a$b a$b3 = (a$b)value;
                    if (i2.b.c(b5, c2, a$b3.b, a$b3.c)) {
                        list2.add((a$b)value);
                    }
                }
                final ArrayList list3 = new ArrayList<a$b>(list2.size());
                final int size4 = list2.size();
                int l = 0;
                final ArrayList<a$b> list4 = (ArrayList<a$b>)list2;
                while (l < size4) {
                    final a$b a$b4 = list4.get(l);
                    list3.add(new a$b(a$b4.a, yl.a.K(a$b4.b, b5, c2) - b5, yl.a.K(a$b4.c, b5, c2) - b5));
                    ++l;
                }
                o = list3;
            }
            final a a4 = new a(4, substring, (List)o);
            Object o2 = a$b2.a;
            if (((h)o2).b == null) {
                final t2.f b6 = b3.b;
                final d a5 = ((h)o2).a;
                final long c3 = ((h)o2).c;
                final t2.h d = ((h)o2).d;
                ((h)o2).getClass();
                o2 = new h(a5, b6, c3, d, (c)null);
            }
            final String f = a4.f;
            final p p6 = new p(p5.a, p5.b.a((h)o2));
            final List g2 = a4.g;
            final List<a$b<j>> b7 = this.b;
            final int b8 = a$b2.b;
            final int c4 = a$b2.c;
            final ArrayList list5 = new ArrayList<a$b>(b7.size());
            for (int size5 = b7.size(), n2 = 0; n2 < size5; ++n2) {
                final Object value2 = b7.get(n2);
                final a$b a$b5 = (a$b)value2;
                if (i2.b.c(b8, c4, a$b5.b, a$b5.c)) {
                    list5.add((a$b)value2);
                }
            }
            final ArrayList list6 = new ArrayList<a$b>(list5.size());
            final int size6 = list5.size();
            int n3 = 0;
            final int n4 = c4;
            while (n3 < size6) {
                final a$b a$b6 = list5.get(n3);
                final int b9 = a$b6.b;
                if (b8 > b9 || a$b6.c > n4) {
                    throw new IllegalArgumentException("placeholder can not overlap with paragraph.".toString());
                }
                list6.add(new a$b(a$b6.a, b9 - b8, a$b6.c - b8));
                ++n3;
            }
            ah2.f.f((Object)f, "text");
            ah2.f.f((Object)g2, "spanStyles");
            e.add(new i2.f(new androidx.compose.ui.text.platform.a(p6, a2, b2, f, g2, list6), a$b2.b, a$b2.c));
        }
        this.e = e;
    }
    
    public final boolean a() {
        final ArrayList e = this.e;
        final int size = e.size();
        final boolean b = false;
        int n = 0;
        boolean b2;
        while (true) {
            b2 = b;
            if (n >= size) {
                break;
            }
            if (((i2.f)e.get(n)).a.a()) {
                b2 = true;
                break;
            }
            ++n;
        }
        return b2;
    }
    
    public final float b() {
        return ((Number)this.c.getValue()).floatValue();
    }
    
    public final float c() {
        return ((Number)this.d.getValue()).floatValue();
    }
}
