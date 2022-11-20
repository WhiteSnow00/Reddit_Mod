// 
// Decompiled by Procyon v0.6.0
// 

package wh2;

import mg2.l;
import java.util.ArrayList;
import kotlin.collections.EmptyList;
import kotlin.collections.CollectionsKt___CollectionsKt;
import dg2.i;
import kotlin.collections.b;
import ng2.e;
import java.util.List;

public abstract class a
{
    public final int[] a;
    public final int b;
    public final int c;
    public final int d;
    public final List<Integer> e;
    
    public a(final int... a) {
        ng2.e.f((Object)a, "numbers");
        this.a = a;
        final Integer l2 = kotlin.collections.b.l2(0, a);
        final int n = -1;
        int intValue;
        if (l2 != null) {
            intValue = l2;
        }
        else {
            intValue = -1;
        }
        this.b = intValue;
        final Integer l3 = kotlin.collections.b.l2(1, a);
        int intValue2;
        if (l3 != null) {
            intValue2 = l3;
        }
        else {
            intValue2 = -1;
        }
        this.c = intValue2;
        final Integer l4 = kotlin.collections.b.l2(2, a);
        int intValue3 = n;
        if (l4 != null) {
            intValue3 = l4;
        }
        this.d = intValue3;
        Object e;
        if (a.length > 3) {
            if (a.length > 1024) {
                throw new IllegalArgumentException(d.j(a.t("BinaryVersion with length more than 1024 are not supported. Provided length "), a.length, '.'));
            }
            e = CollectionsKt___CollectionsKt.I5((Iterable)new dg2.a.d(new i(a), 3, a.length));
        }
        else {
            e = EmptyList.INSTANCE;
        }
        this.e = (List<Integer>)e;
    }
    
    public final boolean a(int c, final int n, final int n2) {
        final int b = this.b;
        boolean b2 = true;
        if (b > c) {
            return true;
        }
        if (b < c) {
            return false;
        }
        c = this.c;
        if (c > n) {
            return true;
        }
        if (c < n) {
            return false;
        }
        if (this.d < n2) {
            b2 = false;
        }
        return b2;
    }
    
    public final boolean b(final a a) {
        ng2.e.f((Object)a, "ourVersion");
        final int b = this.b;
        boolean b2 = true;
        if (b == 0) {
            if (a.b == 0 && this.c == a.c) {
                return b2;
            }
        }
        else if (b == a.b && this.c <= a.c) {
            return b2;
        }
        b2 = false;
        return b2;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o != null && ng2.e.a((Object)this.getClass(), (Object)o.getClass())) {
            final int b = this.b;
            final a a = (a)o;
            if (b == a.b && this.c == a.c && this.d == a.d && ng2.e.a((Object)this.e, (Object)a.e)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int b = this.b;
        final int n = b * 31 + this.c + b;
        final int n2 = n * 31 + this.d + n;
        return this.e.hashCode() + n2 * 31 + n2;
    }
    
    @Override
    public final String toString() {
        final int[] a = this.a;
        final ArrayList list = new ArrayList();
        for (final int n : a) {
            if (n == -1) {
                break;
            }
            list.add(n);
        }
        String a2;
        if (list.isEmpty()) {
            a2 = "unknown";
        }
        else {
            a2 = CollectionsKt___CollectionsKt.a5((Iterable)list, (CharSequence)".", (String)null, (String)null, (l)null, 62);
        }
        return a2;
    }
}
