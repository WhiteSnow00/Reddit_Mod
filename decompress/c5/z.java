// 
// Decompiled by Procyon v0.6.0
// 

package c5;

import aw.b;
import java.util.Arrays;
import sg2.e;
import kotlin.collections.EmptyList;
import java.util.List;

public final class z<T>
{
    public static final z<Object> e;
    public final int[] a;
    public final List<T> b;
    public final int c;
    public final List<Integer> d;
    
    static {
        e = new z<Object>(0, (List<?>)EmptyList.INSTANCE);
    }
    
    public z(final int n, final List<? extends T> list) {
        sg2.e.f((Object)list, "data");
        this(new int[] { n }, list, n, null);
    }
    
    public z(final int[] a, final List<? extends T> b, int length, final List<Integer> d) {
        sg2.e.f((Object)a, "originalPageOffsets");
        sg2.e.f((Object)b, "data");
        this.a = a;
        this.b = (List<T>)b;
        this.c = length;
        this.d = d;
        length = a.length;
        final int n = 0;
        if (length == 0) {
            length = 1;
        }
        else {
            length = 0;
        }
        if ((length ^ 0x1) == 0x0) {
            throw new IllegalArgumentException("originalPageOffsets cannot be empty when constructing TransformablePage".toString());
        }
        Label_0086: {
            if (d != null) {
                length = n;
                if (d.size() != b.size()) {
                    break Label_0086;
                }
            }
            length = 1;
        }
        if (length != 0) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("If originalIndices (size = ");
        sg2.e.c((Object)d);
        sb.append(d.size());
        sb.append(") is provided, it must be same length as data (size = ");
        sb.append(b.size());
        sb.append(')');
        throw new IllegalArgumentException(sb.toString().toString());
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        Object class1;
        if (o == null) {
            class1 = null;
        }
        else {
            class1 = o.getClass();
        }
        if (!sg2.e.a((Object)z.class, class1)) {
            return false;
        }
        if (o != null) {
            final z z = (z)o;
            return Arrays.equals(this.a, z.a) && sg2.e.a((Object)this.b, (Object)z.b) && this.c == z.c && sg2.e.a((Object)this.d, (Object)z.d);
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.paging.TransformablePage<*>");
    }
    
    @Override
    public final int hashCode() {
        final int c = aw.b.c((List)this.b, Arrays.hashCode(this.a) * 31, 31);
        final int c2 = this.c;
        final List<Integer> d = this.d;
        int hashCode;
        if (d == null) {
            hashCode = 0;
        }
        else {
            hashCode = d.hashCode();
        }
        return (c + c2) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("TransformablePage(originalPageOffsets=");
        r.append(Arrays.toString(this.a));
        r.append(", data=");
        r.append(this.b);
        r.append(", hintOriginalPageOffset=");
        r.append(this.c);
        r.append(", hintOriginalIndices=");
        return d.o(r, (List)this.d, ')');
    }
}
