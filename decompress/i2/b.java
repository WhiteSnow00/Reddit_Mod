// 
// Decompiled by Procyon v0.6.0
// 

package i2;

import java.util.ArrayList;
import kotlin.collections.EmptyList;
import sg2.e;
import java.util.List;

public final class b
{
    public static final a a;
    
    static {
        a = new a(6, "", null);
    }
    
    public static a a(final String s, final k k) {
        e.f((Object)s, "text");
        return new a(s, lw0.b.r1((Object)new a.b(k, 0, s.length())), (List<a.b<h>>)EmptyList.INSTANCE);
    }
    
    public static final ArrayList b(final int n, final int n2, final List list) {
        final int n3 = 0;
        if (n <= n2) {
            final ArrayList<a.b> list2 = new ArrayList<a.b>(list.size());
            for (int size = list.size(), i = 0; i < size; ++i) {
                final Object value = list.get(i);
                final a.b b = (a.b)value;
                if (c(n, n2, b.b, b.c)) {
                    list2.add((a.b)value);
                }
            }
            final ArrayList list3 = new ArrayList<a.b>(list2.size());
            for (int size2 = list2.size(), j = n3; j < size2; ++j) {
                final a.b b2 = (a.b)list2.get(j);
                list3.add(new a.b(b2.a, b2.d, Math.max(n, b2.b) - n, Math.min(n2, b2.c) - n));
            }
            return list3;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("start (");
        sb.append(n);
        sb.append(") should be less than or equal to end (");
        sb.append(n2);
        sb.append(')');
        throw new IllegalArgumentException(sb.toString().toString());
    }
    
    public static final boolean c(int n, int n2, final int n3, final int n4) {
        final int max = Math.max(n, n3);
        final int min = Math.min(n2, n4);
        boolean b = false;
        if (max >= min && (n > n3 || n4 > n2 || (n2 == n4 && n3 == n4 != (n == n2)))) {
            Label_0139: {
                Label_0137: {
                    if (n3 <= n && n2 <= n4) {
                        if (n4 == n2) {
                            if (n == n2) {
                                n = 1;
                            }
                            else {
                                n = 0;
                            }
                            if (n3 == n4) {
                                n2 = 1;
                            }
                            else {
                                n2 = 0;
                            }
                            if (n != n2) {
                                break Label_0137;
                            }
                        }
                        n = 1;
                        break Label_0139;
                    }
                }
                n = 0;
            }
            if (n == 0) {
                return b;
            }
        }
        b = true;
        return b;
    }
}
