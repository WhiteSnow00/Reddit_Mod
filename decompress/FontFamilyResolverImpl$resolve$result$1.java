// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.text.font;

import android.graphics.Typeface;
import n2.o;
import n2.n;
import n2.r;
import n2.d;
import zg2.p;
import kotlin.coroutines.CoroutineContext;
import mj2.b0;
import mj2.g;
import kotlinx.coroutines.CoroutineStart;
import java.util.List;
import kotlin.Result;
import kotlin.Pair;
import at1.a;
import n2.m;
import java.util.ArrayList;
import n2.i;
import ah2.f;
import n2.w;
import kotlin.Metadata;
import pg2.j;
import n2.y;
import zg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005" }, d2 = { "Lkotlin/Function1;", "Ln2/y;", "Lpg2/j;", "onAsyncCompletion", "invoke", "(Lzg2/l;)Ln2/y;", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class FontFamilyResolverImpl$resolve$result$1 extends Lambda implements l<l<? super y, ? extends j>, y>
{
    public final /* synthetic */ w $typefaceRequest;
    public final /* synthetic */ c this$0;
    
    public FontFamilyResolverImpl$resolve$result$1(final c this$0, final w $typefaceRequest) {
        this.this$0 = this$0;
        this.$typefaceRequest = $typefaceRequest;
        super(1);
    }
    
    public final y invoke(final l<? super y, j> l) {
        f.f((Object)l, "onAsyncCompletion");
        final c this$0 = this.this$0;
        final n2.j d = this$0.d;
        final w $typefaceRequest = this.$typefaceRequest;
        final n2.p a = this$0.a;
        final l<w, Object> f = this$0.f;
        d.getClass();
        ah2.f.f((Object)$typefaceRequest, "typefaceRequest");
        ah2.f.f((Object)a, "platformFontLoader");
        ah2.f.f((Object)f, "createDefaultTypeface");
        final n2.g a2 = $typefaceRequest.a;
        y y = null;
        Label_2250: {
            if (a2 instanceof i) {
                ArrayList<n2.f> h = ((i)a2).h;
                final m b = $typefaceRequest.b;
                final int c = $typefaceRequest.c;
                ah2.f.f((Object)h, "fontList");
                ah2.f.f((Object)b, "fontWeight");
                Object o = new ArrayList<Object>(h.size());
                for (int size = h.size(), i = 0; i < size; ++i) {
                    final n2.f value = h.get(i);
                    final n2.f f2 = value;
                    if (ah2.f.a((Object)f2.b(), (Object)b) && f2.c() == c) {
                        ((ArrayList<n2.f>)o).add(value);
                    }
                }
                ArrayList<n2.f> list4 = null;
                Label_1390: {
                    if (!(((ArrayList)o).isEmpty() ^ true)) {
                        final j a3 = j.a;
                        final ArrayList list = new ArrayList<n2.f>(h.size());
                        for (int size2 = h.size(), j = 0; j < size2; ++j) {
                            final n2.f value2 = h.get(j);
                            if (value2.c() == c) {
                                list.add(value2);
                            }
                        }
                        if (!list.isEmpty()) {
                            h = (ArrayList<n2.f>)list;
                        }
                        if (b.a(m.g) < 0) {
                            final int size3 = h.size();
                            m m = null;
                            m k = null;
                            int n = 0;
                            m m2;
                            m m3;
                            while (true) {
                                m2 = m;
                                m3 = k;
                                if (n >= size3) {
                                    break;
                                }
                                final m b2 = h.get(n).b();
                                m m4 = null;
                                m m5 = null;
                                Label_0480: {
                                    if (b2.a(b) < 0) {
                                        if (m != null) {
                                            m4 = m;
                                            m5 = k;
                                            if (b2.a(m) <= 0) {
                                                break Label_0480;
                                            }
                                        }
                                        m4 = b2;
                                        m5 = k;
                                    }
                                    else {
                                        if (b2.a(b) <= 0) {
                                            m2 = (m3 = b2);
                                            break;
                                        }
                                        if (k != null) {
                                            m4 = m;
                                            m5 = k;
                                            if (b2.a(k) >= 0) {
                                                break Label_0480;
                                            }
                                        }
                                        m5 = b2;
                                        m4 = m;
                                    }
                                }
                                ++n;
                                m = m4;
                                k = m5;
                            }
                            m m6;
                            if ((m6 = m2) == null) {
                                m6 = m3;
                            }
                            final ArrayList list2 = new ArrayList<n2.f>(h.size());
                            final int size4 = h.size();
                            int n2 = 0;
                            while (true) {
                                o = list2;
                                if (n2 >= size4) {
                                    break;
                                }
                                final Object value3 = h.get(n2);
                                if (ah2.f.a((Object)((n2.f)value3).b(), (Object)m6)) {
                                    list2.add(value3);
                                }
                                ++n2;
                            }
                        }
                        else {
                            final m h2 = m.h;
                            if (b.a(h2) > 0) {
                                final int size5 = h.size();
                                m m7 = null;
                                m m8 = null;
                                int n3 = 0;
                                m m9;
                                m m10;
                                while (true) {
                                    m9 = m7;
                                    m10 = m8;
                                    if (n3 >= size5) {
                                        break;
                                    }
                                    final m b3 = h.get(n3).b();
                                    m m11 = null;
                                    m m12 = null;
                                    Label_0740: {
                                        if (b3.a(b) < 0) {
                                            if (m7 != null) {
                                                m11 = m7;
                                                m12 = m8;
                                                if (b3.a(m7) <= 0) {
                                                    break Label_0740;
                                                }
                                            }
                                            m11 = b3;
                                            m12 = m8;
                                        }
                                        else {
                                            if (b3.a(b) <= 0) {
                                                m9 = (m10 = b3);
                                                break;
                                            }
                                            if (m8 != null) {
                                                m11 = m7;
                                                m12 = m8;
                                                if (b3.a(m8) >= 0) {
                                                    break Label_0740;
                                                }
                                            }
                                            m12 = b3;
                                            m11 = m7;
                                        }
                                    }
                                    ++n3;
                                    m7 = m11;
                                    m8 = m12;
                                }
                                if (m10 != null) {
                                    m9 = m10;
                                }
                                final ArrayList list3 = new ArrayList<n2.f>(h.size());
                                final int size6 = h.size();
                                int n4 = 0;
                                while (true) {
                                    o = list3;
                                    if (n4 >= size6) {
                                        break;
                                    }
                                    final Object value4 = h.get(n4);
                                    if (ah2.f.a((Object)((n2.f)value4).b(), (Object)m9)) {
                                        list3.add(value4);
                                    }
                                    ++n4;
                                }
                            }
                            else {
                                final int size7 = h.size();
                                m m13 = null;
                                m m14 = null;
                                int n5 = 0;
                                m b4;
                                m m15;
                                while (true) {
                                    b4 = m13;
                                    m15 = m14;
                                    if (n5 >= size7) {
                                        break;
                                    }
                                    b4 = h.get(n5).b();
                                    m m16 = m13;
                                    m m17 = m14;
                                    Label_1008: {
                                        if (b4.a(h2) <= 0) {
                                            if (b4.a(b) < 0) {
                                                if (m13 != null) {
                                                    m16 = m13;
                                                    m17 = m14;
                                                    if (b4.a(m13) <= 0) {
                                                        break Label_1008;
                                                    }
                                                }
                                                m16 = b4;
                                                m17 = m14;
                                            }
                                            else {
                                                if (b4.a(b) <= 0) {
                                                    m15 = b4;
                                                    break;
                                                }
                                                if (m14 != null) {
                                                    m16 = m13;
                                                    m17 = m14;
                                                    if (b4.a(m14) >= 0) {
                                                        break Label_1008;
                                                    }
                                                }
                                                m16 = m13;
                                                m17 = b4;
                                            }
                                        }
                                    }
                                    ++n5;
                                    m13 = m16;
                                    m14 = m17;
                                }
                                if (m15 != null) {
                                    b4 = m15;
                                }
                                o = new ArrayList<n2.f>(h.size());
                                for (int size8 = h.size(), n6 = 0; n6 < size8; ++n6) {
                                    final Object value5 = h.get(n6);
                                    if (ah2.f.a((Object)((n2.f)value5).b(), (Object)b4)) {
                                        ((ArrayList)o).add(value5);
                                    }
                                }
                                list4 = (ArrayList<n2.f>)o;
                                if (!((ArrayList)o).isEmpty()) {
                                    break Label_1390;
                                }
                                final m h3 = m.h;
                                final int size9 = h.size();
                                m m18 = null;
                                m m19 = null;
                                int n7 = 0;
                                m m20;
                                m m21;
                                while (true) {
                                    m20 = m18;
                                    m21 = m19;
                                    if (n7 >= size9) {
                                        break;
                                    }
                                    final m b5 = h.get(n7).b();
                                    m m22 = null;
                                    m m23 = null;
                                    Label_1276: {
                                        if (h3 != null) {
                                            m22 = m18;
                                            m23 = m19;
                                            if (b5.a(h3) < 0) {
                                                break Label_1276;
                                            }
                                        }
                                        if (b5.a(b) < 0) {
                                            if (m18 != null) {
                                                m22 = m18;
                                                m23 = m19;
                                                if (b5.a(m18) <= 0) {
                                                    break Label_1276;
                                                }
                                            }
                                            m22 = b5;
                                            m23 = m19;
                                        }
                                        else {
                                            if (b5.a(b) <= 0) {
                                                m20 = (m21 = b5);
                                                break;
                                            }
                                            if (m19 != null) {
                                                m22 = m18;
                                                m23 = m19;
                                                if (b5.a(m19) >= 0) {
                                                    break Label_1276;
                                                }
                                            }
                                            m23 = b5;
                                            m22 = m18;
                                        }
                                    }
                                    ++n7;
                                    m18 = m22;
                                    m19 = m23;
                                }
                                if (m21 != null) {
                                    m20 = m21;
                                }
                                final ArrayList list5 = new ArrayList<n2.f>(h.size());
                                final int size10 = h.size();
                                int n8 = 0;
                                while (true) {
                                    o = list5;
                                    if (n8 >= size10) {
                                        break;
                                    }
                                    final Object value6 = h.get(n8);
                                    if (ah2.f.a((Object)((n2.f)value6).b(), (Object)m20)) {
                                        list5.add(value6);
                                    }
                                    ++n8;
                                }
                            }
                        }
                    }
                    list4 = (ArrayList<n2.f>)o;
                }
                final b a4 = d.a;
                final int size11 = list4.size();
                List<Object> list6 = null;
                int n9 = 0;
            Label_2167:
                while (true) {
                    while (n9 < size11) {
                        final n2.f f3 = list4.get(n9);
                        final int a5 = f3.a();
                        if (a5 == 0) {
                            synchronized (a4.c) {
                                final b.b b6 = new b.b(f3, a.b());
                                if ((o = a4.a.a((Object)b6)) == null) {
                                    o = a4.b.a((Object)b6);
                                }
                                Label_1568: {
                                    if (o != null) {
                                        o = ((b.a)o).a;
                                        monitorexit(a4.c);
                                        break Label_1568;
                                    }
                                    o = j.a;
                                    monitorexit(a4.c);
                                    try {
                                        o = a.a(f3);
                                        androidx.compose.ui.text.font.b.a(a4, f3, a, o);
                                        if (o != null) {
                                            o = new Pair((Object)list6, at1.a.T1($typefaceRequest.d, o, f3, $typefaceRequest.b, $typefaceRequest.c));
                                            break Label_2167;
                                        }
                                        final StringBuilder sb = new StringBuilder();
                                        sb.append("Unable to load font ");
                                        sb.append(f3);
                                        throw new IllegalStateException(sb.toString());
                                    }
                                    catch (final Exception o) {
                                        final StringBuilder sb2 = new StringBuilder();
                                        sb2.append("Unable to load font ");
                                        sb2.append(f3);
                                        throw new IllegalStateException(sb2.toString(), (Throwable)o);
                                    }
                                }
                            }
                        }
                        Label_2099: {
                            if (a5 == 1) {
                                synchronized (a4.c) {
                                    final b.b b7 = new b.b(f3, a.b());
                                    if ((o = a4.a.a((Object)b7)) == null) {
                                        o = a4.b.a((Object)b7);
                                    }
                                    if (o != null) {
                                        o = ((b.a)o).a;
                                        monitorexit(a4.c);
                                    }
                                    else {
                                        o = j.a;
                                        monitorexit(a4.c);
                                        Object constructor-impl;
                                        try {
                                            Result.constructor-impl(a.a(f3));
                                        }
                                        finally {
                                            constructor-impl = Result.constructor-impl((Object)aj2.c.G((Throwable)o));
                                        }
                                        o = constructor-impl;
                                        if (Result.isFailure-impl(constructor-impl)) {
                                            o = null;
                                        }
                                        androidx.compose.ui.text.font.b.a(a4, f3, a, o);
                                    }
                                    if (o != null) {
                                        o = new Pair((Object)list6, at1.a.T1($typefaceRequest.d, o, f3, $typefaceRequest.b, $typefaceRequest.c));
                                        break Label_2167;
                                    }
                                    o = list6;
                                    break Label_2099;
                                }
                            }
                            if (a5 != 2) {
                                break Label_2099;
                            }
                            a4.getClass();
                            final b.b b8 = new b.b(f3, a.b());
                            synchronized (a4.c) {
                                if ((o = a4.a.a((Object)b8)) == null) {
                                    o = a4.b.a((Object)b8);
                                }
                                monitorexit(a4.c);
                                if (o == null) {
                                    if (list6 == null) {
                                        o = ah2.c.a0((Object[])new n2.f[] { f3 });
                                    }
                                    else {
                                        list6.add(f3);
                                        o = list6;
                                    }
                                }
                                else {
                                    final Object a6 = ((b.a)o).a;
                                    if (a6 == null) {
                                        o = list6;
                                    }
                                    else {
                                        o = list6;
                                        if (a6 != null) {
                                            o = new Pair((Object)list6, at1.a.T1($typefaceRequest.d, a6, f3, $typefaceRequest.b, $typefaceRequest.c));
                                            break Label_2167;
                                        }
                                    }
                                }
                                ++n9;
                                list6 = (List<Object>)o;
                                continue;
                            }
                        }
                        final StringBuilder sb3 = new StringBuilder();
                        sb3.append("Unknown font type ");
                        sb3.append(f3);
                        throw new IllegalStateException(sb3.toString());
                        final List list7 = (List)((Pair)o).component1();
                        final Object component2 = ((Pair)o).component2();
                        if (list7 == null) {
                            y = new y.b(component2, true);
                            break Label_2250;
                        }
                        final AsyncFontListLoader asyncFontListLoader = new AsyncFontListLoader(list7, component2, $typefaceRequest, d.a, l, a);
                        g.i((b0)d.b, (CoroutineContext)null, CoroutineStart.UNDISPATCHED, (p)new FontListFontFamilyTypefaceAdapter$resolve$1(asyncFontListLoader, null), 1);
                        y = new y.a(asyncFontListLoader);
                        break Label_2250;
                    }
                    o = new Pair((Object)list6, f.invoke((Object)$typefaceRequest));
                    continue Label_2167;
                }
            }
            y = null;
        }
        y y2 = y;
        if (y == null) {
            final c this$2 = this.this$0;
            final a2.c e = this$2.e;
            final w $typefaceRequest2 = this.$typefaceRequest;
            final n2.p a7 = this$2.a;
            final l<w, Object> f4 = this$2.f;
            e.getClass();
            ah2.f.f((Object)$typefaceRequest2, "typefaceRequest");
            ah2.f.f((Object)a7, "platformFontLoader");
            ah2.f.f((Object)f4, "createDefaultTypeface");
            final n2.g a8 = $typefaceRequest2.a;
            y y3 = null;
            Label_2422: {
                Typeface typeface;
                if (a8 == null || a8 instanceof d) {
                    typeface = ((r)e.f).i($typefaceRequest2.b, $typefaceRequest2.c);
                }
                else if (a8 instanceof n) {
                    typeface = ((r)e.f).v((n)a8, $typefaceRequest2.b, $typefaceRequest2.c);
                }
                else {
                    if (!(a8 instanceof o)) {
                        y3 = null;
                        break Label_2422;
                    }
                    ((o)a8).getClass();
                    throw null;
                }
                y3 = new y.b(typeface, true);
            }
            if (y3 == null) {
                throw new IllegalStateException("Could not load font");
            }
            y2 = y3;
        }
        return y2;
    }
}
