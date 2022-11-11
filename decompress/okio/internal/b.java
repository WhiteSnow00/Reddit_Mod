// 
// Decompiled by Procyon v0.6.0
// 

package okio.internal;

import kotlin.jvm.internal.Ref$ObjectRef;
import jk2.i;
import cj2.j;
import jk2.y$a;
import rg2.p;
import jk2.f;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$LongRef;
import java.util.GregorianCalendar;
import java.io.IOException;
import jk2.b0;
import sg2.e;
import jk2.y;
import java.util.Iterator;
import kk2.c;
import java.util.Comparator;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kk2.d;
import java.util.LinkedHashMap;
import java.util.ArrayList;

public final class b
{
    public static final LinkedHashMap a(final ArrayList list) {
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator iterator = CollectionsKt___CollectionsKt.f4((Iterable)list, (Comparator)new d()).iterator();
        while (iterator.hasNext()) {
            final c c = (c)iterator.next();
            final Iterator iterator2 = iterator;
            c c2 = c;
            if (linkedHashMap.put(c.a, c) != null) {
                continue;
            }
            while (true) {
                final y c3 = c2.a.c();
                if (c3 == null) {
                    iterator = iterator2;
                    break;
                }
                final c c4 = linkedHashMap.get(c3);
                if (c4 != null) {
                    c4.h.add(c2.a);
                    iterator = iterator2;
                    break;
                }
                final c c5 = new c(c3, true, "", -1L, -1L, -1, (Long)null, -1L);
                linkedHashMap.put(c3, c5);
                c5.h.add(c2.a);
                c2 = c5;
            }
        }
        return linkedHashMap;
    }
    
    public static final String b(final int n) {
        lw0.b.T(16);
        final String string = Integer.toString(n, 16);
        e.e((Object)string, "java.lang.Integer.toStri\u2026(this, checkRadix(radix))");
        return e.l((Object)string, "0x");
    }
    
    public static final c c(final b0 b0) throws IOException {
        final int j2 = b0.j2();
        if (j2 != 33639248) {
            final StringBuilder r = a.r("bad zip: expected ");
            r.append(b(33639248));
            r.append(" but was ");
            r.append(b(j2));
            throw new IOException(r.toString());
        }
        b0.skip(4L);
        final int n = b0.b() & 0xFFFF;
        if ((n & 0x1) != 0x0) {
            throw new IOException(e.l((Object)b(n), "unsupported zip: general purpose bit flag="));
        }
        final short b2 = b0.b();
        final int n2 = b0.b() & 0xFFFF;
        final int n3 = b0.b() & 0xFFFF;
        Long value;
        if (n2 == -1) {
            value = null;
        }
        else {
            final GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.set(14, 0);
            gregorianCalendar.set((n3 >> 9 & 0x7F) + 1980, (n3 >> 5 & 0xF) - 1, n3 & 0x1F, n2 >> 11 & 0x1F, n2 >> 5 & 0x3F, (n2 & 0x1F) << 1);
            value = gregorianCalendar.getTime().getTime();
        }
        b0.j2();
        final Ref$LongRef ref$LongRef = new Ref$LongRef();
        ref$LongRef.element = ((long)b0.j2() & 0xFFFFFFFFL);
        final Ref$LongRef ref$LongRef2 = new Ref$LongRef();
        ref$LongRef2.element = ((long)b0.j2() & 0xFFFFFFFFL);
        final short b3 = b0.b();
        final short b4 = b0.b();
        final short b5 = b0.b();
        b0.skip(8L);
        final Ref$LongRef ref$LongRef3 = new Ref$LongRef();
        ref$LongRef3.element = ((long)b0.j2() & 0xFFFFFFFFL);
        final String i = b0.j((long)(b3 & 0xFFFF));
        if (kotlin.text.b.Q0((CharSequence)i, '\0')) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        long n4;
        if (ref$LongRef2.element == 4294967295L) {
            n4 = 8 + 0L;
        }
        else {
            n4 = 0L;
        }
        if (ref$LongRef.element == 4294967295L) {
            n4 += 8;
        }
        long n5 = n4;
        if (ref$LongRef3.element == 4294967295L) {
            n5 = n4 + 8;
        }
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        d(b0, b4 & 0xFFFF, (p)new ZipKt$readEntry$1(ref$BooleanRef, n5, ref$LongRef2, (f)b0, ref$LongRef, ref$LongRef3));
        if (n5 > 0L && !ref$BooleanRef.element) {
            throw new IOException("bad zip: zip64 extra required but absent");
        }
        final String k = b0.j((long)(b5 & 0xFFFF));
        final String g = y.g;
        return new c(y$a.a("/", false).d(i), j.D0(i, "/", false), k, ref$LongRef.element, ref$LongRef2.element, b2 & 0xFFFF, value, ref$LongRef3.element);
    }
    
    public static final void d(final b0 b0, int n, final p p3) {
        long n3;
        long n4;
        for (long n2 = n; n2 != 0L; n2 = n4 - n3) {
            if (n2 < 4L) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            n = (b0.b() & 0xFFFF);
            n3 = ((long)b0.b() & 0xFFFFL);
            n4 = n2 - 4;
            if (n4 < n3) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            b0.c1(n3);
            final long g = b0.g.g;
            p3.invoke(n, n3);
            final jk2.c g2 = b0.g;
            final long n5 = g2.g + n3 - g;
            final long n6 = lcmp(n5, 0L);
            if (n6 < 0) {
                throw new IOException(e.l((Object)n, "unsupported zip: too many bytes processed for "));
            }
            if (n6 > 0) {
                g2.skip(n5);
            }
        }
    }
    
    public static final i e(final b0 b0, final i i) {
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Object f;
        if (i == null) {
            f = null;
        }
        else {
            f = i.f;
        }
        ref$ObjectRef.element = f;
        final Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        final Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
        final int j2 = b0.j2();
        if (j2 != 67324752) {
            final StringBuilder r = a.r("bad zip: expected ");
            r.append(b(67324752));
            r.append(" but was ");
            r.append(b(j2));
            throw new IOException(r.toString());
        }
        b0.skip(2L);
        final int n = b0.b() & 0xFFFF;
        if ((n & 0x1) != 0x0) {
            throw new IOException(e.l((Object)b(n), "unsupported zip: general purpose bit flag="));
        }
        b0.skip(18L);
        final long n2 = b0.b();
        final int n3 = b0.b() & 0xFFFF;
        b0.skip(n2 & 0xFFFFL);
        if (i == null) {
            b0.skip((long)n3);
            return null;
        }
        d(b0, n3, (p)new ZipKt$readOrSkipLocalHeader$1((f)b0, ref$ObjectRef, ref$ObjectRef2, ref$ObjectRef3));
        return new i(i.a, i.b, (y)null, i.d, (Long)ref$ObjectRef3.element, (Long)ref$ObjectRef.element, (Long)ref$ObjectRef2.element);
    }
}
