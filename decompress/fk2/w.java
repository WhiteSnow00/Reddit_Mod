// 
// Decompiled by Procyon v0.6.0
// 

package fk2;

import ng2.e;
import cg.d;
import java.util.Arrays;
import java.util.List;
import dg2.n;
import kotlin.collections.b;
import java.util.ArrayList;
import java.util.RandomAccess;
import okio.ByteString;
import dg2.a;

public final class w extends dg2.a<ByteString> implements RandomAccess
{
    public final ByteString[] f;
    public final int[] g;
    
    public w(final ByteString[] f, final int[] g) {
        this.f = f;
        this.g = g;
    }
    
    public final int a() {
        return this.f.length;
    }
    
    public final /* bridge */ boolean contains(final Object o) {
        return o instanceof ByteString && super.contains((Object)o);
    }
    
    public final Object get(final int n) {
        return this.f[n];
    }
    
    public final /* bridge */ int indexOf(final Object o) {
        if (!(o instanceof ByteString)) {
            return -1;
        }
        return super.indexOf((Object)o);
    }
    
    public final /* bridge */ int lastIndexOf(final Object o) {
        if (!(o instanceof ByteString)) {
            return -1;
        }
        return super.lastIndexOf((Object)o);
    }
    
    public static final class a
    {
        public static void a(long n, final c c, int n2, final ArrayList list, int i, final int n3, final ArrayList list2) {
            int n4 = n2;
            if (i < n3) {
                n2 = 1;
            }
            else {
                n2 = 0;
            }
            if (n2 != 0) {
                if (i < n3) {
                    n2 = i;
                    while (true) {
                        final int n5 = n2 + 1;
                        if (list.get(n2).size() >= n4) {
                            n2 = 1;
                        }
                        else {
                            n2 = 0;
                        }
                        if (n2 == 0) {
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                        if (n5 >= n3) {
                            break;
                        }
                        n2 = n5;
                    }
                }
                ByteString byteString = list.get(i);
                final ByteString byteString2 = list.get(n3 - 1);
                int intValue;
                if (n4 == byteString.size()) {
                    intValue = ((Number)list2.get(i)).intValue();
                    n2 = i + 1;
                    byteString = list.get(n2);
                }
                else {
                    n2 = i;
                    intValue = -1;
                }
                if (byteString.getByte(n4) != byteString2.getByte(n4)) {
                    int n6 = n2 + 1;
                    i = 1;
                    int n7 = 1;
                    if (n6 < n3) {
                        while (true) {
                            final int n8 = n6 + 1;
                            i = n7;
                            if (((ByteString)list.get(n6 - 1)).getByte(n4) != ((ByteString)list.get(n6)).getByte(n4)) {
                                i = n7 + 1;
                            }
                            if (n8 >= n3) {
                                break;
                            }
                            n6 = n8;
                            n7 = i;
                        }
                    }
                    final long g = c.g;
                    final long n9 = 4;
                    n = i * 2 + (g / n9 + n + 2);
                    c.V(i);
                    c.V(intValue);
                    if (n2 < n3) {
                        i = n2;
                        while (true) {
                            final int n10 = i + 1;
                            final byte byte1 = list.get(i).getByte(n4);
                            if (i == n2 || byte1 != list.get(i - 1).getByte(n4)) {
                                c.V(byte1 & 0xFF);
                            }
                            if (n10 >= n3) {
                                break;
                            }
                            i = n10;
                        }
                    }
                    final c c2 = new c();
                    byte byte2;
                    int n11;
                    int n12;
                    for (i = n2; i < n3; i = n2) {
                        byte2 = list.get(i).getByte(n4);
                        n11 = i + 1;
                        Label_0510: {
                            if (n11 < n3) {
                                n2 = n11;
                                while (true) {
                                    n12 = n2 + 1;
                                    if (byte2 != list.get(n2).getByte(n4)) {
                                        break Label_0510;
                                    }
                                    if (n12 >= n3) {
                                        break;
                                    }
                                    n2 = n12;
                                }
                            }
                            n2 = n3;
                        }
                        if (n11 == n2 && n4 + 1 == list.get(i).size()) {
                            c.V(((Number)list2.get(i)).intValue());
                        }
                        else {
                            c.V((int)(c2.g / n9 + n) * -1);
                            a(n, c2, n4 + 1, list, i, n2, list2);
                        }
                    }
                    c.T1((g0)c2);
                }
                else {
                    final int min = Math.min(byteString.size(), byteString2.size());
                    int n15;
                    if (n4 < min) {
                        int n13 = n4;
                        i = 0;
                        while (true) {
                            final int n14 = n13 + 1;
                            n15 = i;
                            if (byteString.getByte(n13) != byteString2.getByte(n13)) {
                                break;
                            }
                            ++i;
                            if (n14 >= min) {
                                n15 = i;
                                break;
                            }
                            n13 = n14;
                        }
                    }
                    else {
                        n15 = 0;
                    }
                    final long g2 = c.g;
                    final long n16 = 4;
                    n = g2 / n16 + n + 2 + n15 + 1L;
                    c.V(-n15);
                    c.V(intValue);
                    final int n17 = n4 + n15;
                    if (n4 < n17) {
                        while (true) {
                            i = n4 + 1;
                            c.V(byteString.getByte(n4) & 0xFF);
                            if (i >= n17) {
                                break;
                            }
                            n4 = i;
                        }
                    }
                    if (n2 + 1 == n3) {
                        if (n17 == list.get(n2).size()) {
                            i = 1;
                        }
                        else {
                            i = 0;
                        }
                        if (i == 0) {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                        c.V(((Number)list2.get(n2)).intValue());
                    }
                    else {
                        final c c3 = new c();
                        c.V((int)(c3.g / n16 + n) * -1);
                        a(n, c3, n17, list, n2, n3, list2);
                        c.T1((g0)c3);
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        
        public static w b(final ByteString... array) {
            final int length = array.length;
            final int n = 0;
            if (length == 0) {
                return new w(new ByteString[0], new int[] { 0, -1 });
            }
            final ArrayList f2 = b.F2((Object[])array);
            dg2.n.w4((List<Comparable>)f2);
            final ArrayList<Integer> list = new ArrayList<Integer>(array.length);
            for (final ByteString byteString : array) {
                list.add(-1);
            }
            final Integer[] array2 = list.toArray(new Integer[0]);
            if (array2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            final Integer[] array3 = array2;
            final ArrayList t3 = d.t3((Object[])Arrays.copyOf(array3, array3.length));
            for (int length3 = array.length, j = 0, n2 = 0; j < length3; ++j, ++n2) {
                t3.set(d.M0(f2, (Comparable)array[j]), n2);
            }
            if (((ByteString)f2.get(0)).size() > 0) {
                int n3;
                for (int k = 0; k < f2.size(); k = n3) {
                    final ByteString byteString2 = f2.get(k);
                    int l;
                    n3 = (l = k + 1);
                    while (l < f2.size()) {
                        final ByteString byteString3 = f2.get(l);
                        if (!byteString3.startsWith(byteString2)) {
                            break;
                        }
                        if (byteString3.size() == byteString2.size()) {
                            throw new IllegalArgumentException(e.l((Object)byteString3, "duplicate option: ").toString());
                        }
                        if (((Number)t3.get(l)).intValue() > ((Number)t3.get(k)).intValue()) {
                            f2.remove(l);
                            t3.remove(l);
                        }
                        else {
                            ++l;
                        }
                    }
                }
                final c c = new c();
                a(0L, c, 0, f2, 0, f2.size(), t3);
                final int[] array4 = new int[(int)(c.g / 4)];
                int n4 = n;
                while (!c.e1()) {
                    array4[n4] = c.readInt();
                    ++n4;
                }
                final ByteString[] copy = Arrays.copyOf(array, array.length);
                e.e((Object)copy, "java.util.Arrays.copyOf(this, size)");
                return new w(copy, array4);
            }
            throw new IllegalArgumentException("the empty byte string is not a supported option".toString());
        }
    }
}
