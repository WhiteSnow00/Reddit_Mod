// 
// Decompiled by Procyon v0.6.0
// 

package x0;

import java.util.Iterator;
import jj2.k;
import at1.a;
import u2.i;
import kotlin.sequences.SequencesKt__SequencesKt;
import androidx.compose.material.MenuKt;
import ah2.f;
import androidx.compose.ui.unit.LayoutDirection;
import pg2.j;
import u2.h;
import zg2.p;
import u2.b;
import w2.d;

public final class e implements d
{
    public final long a;
    public final b b;
    public final p<h, h, j> c;
    
    public e() {
        throw null;
    }
    
    public e(final long a, final b b, final p c) {
        this.a = a;
        this.b = b;
        this.c = (p<h, h, j>)c;
    }
    
    public final long a(final h h, final long n, final LayoutDirection layoutDirection, final long n2) {
        f.f((Object)layoutDirection, "layoutDirection");
        final int s0 = this.b.s0(MenuKt.b);
        final int s2 = this.b.s0(u2.e.a(this.a));
        final int s3 = this.b.s0(u2.e.b(this.a));
        final int n3 = h.a + s2;
        final int c = h.c;
        final int n4 = (int)(n2 >> 32);
        final int n5 = c - s2 - n4;
        final int n6 = (int)(n >> 32);
        int n7 = n6 - n4;
        k k;
        if (layoutDirection == LayoutDirection.Ltr) {
            if (h.a < 0) {
                n7 = 0;
            }
            k = SequencesKt__SequencesKt.O0((Object[])new Integer[] { n3, n5, n7 });
        }
        else {
            if (h.c <= n6) {
                n7 = 0;
            }
            k = SequencesKt__SequencesKt.O0((Object[])new Integer[] { n5, n3, n7 });
        }
        final Iterator iterator = k.iterator();
        while (true) {
            int intValue;
            do {
                final boolean hasNext = iterator.hasNext();
                final Integer n8 = null;
                if (!hasNext) {
                    final Object next = null;
                    final Integer n9 = (Integer)next;
                    int intValue2 = n5;
                    if (n9 != null) {
                        intValue2 = n9;
                    }
                    final int max = Math.max(h.d + s3, s0);
                    final int n10 = h.b - s3 - i.b(n2);
                    final Iterator iterator2 = SequencesKt__SequencesKt.O0((Object[])new Integer[] { max, n10, h.b - i.b(n2) / 2, i.b(n) - i.b(n2) - s0 }).iterator();
                    int intValue3;
                    Object next2;
                    do {
                        next2 = n8;
                        if (!iterator2.hasNext()) {
                            break;
                        }
                        next2 = iterator2.next();
                        intValue3 = ((Number)next2).intValue();
                    } while (intValue3 < s0 || i.b(n2) + intValue3 > i.b(n) - s0);
                    final Integer n11 = (Integer)next2;
                    int intValue4 = n10;
                    if (n11 != null) {
                        intValue4 = n11;
                    }
                    this.c.invoke((Object)h, (Object)new h(intValue2, intValue4, n4 + intValue2, i.b(n2) + intValue4));
                    return at1.a.h(intValue2, intValue4);
                }
                final Object next = iterator.next();
                intValue = ((Number)next).intValue();
            } while (intValue < 0 || intValue + n4 > n6);
            continue;
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof e)) {
            return false;
        }
        final e e = (e)o;
        final long a = this.a;
        final long a2 = e.a;
        final int d = u2.e.d;
        return a == a2 && f.a((Object)this.b, (Object)e.b) && f.a((Object)this.c, (Object)e.c);
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        final int d = u2.e.d;
        return this.c.hashCode() + (this.b.hashCode() + Long.hashCode(a) * 31) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("DropdownMenuPositionProvider(contentOffset=");
        k.append((Object)u2.e.c(this.a));
        k.append(", density=");
        k.append(this.b);
        k.append(", onPositionCalculated=");
        k.append(this.c);
        k.append(')');
        return k.toString();
    }
}
