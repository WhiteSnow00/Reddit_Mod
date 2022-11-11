// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.collections;

import rg2.a;
import ig2.u;
import a4.a0;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Collection;
import ig2.g;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Comparator;
import yg2.h;
import yg2.i;
import lg.e0;
import rg2.l;
import java.util.NoSuchElementException;
import java.util.List;
import bj2.f;
import bj2.k;
import kotlin.Pair;
import sg2.e;
import java.util.ArrayList;
import ig2.j;

public class b extends j
{
    public static final ArrayList A1(final Object[] array, final Object[] array2) {
        e.f((Object)array, "<this>");
        e.f((Object)array2, "other");
        final int min = Math.min(array.length, array2.length);
        final ArrayList list = new ArrayList<Pair>(min);
        for (int i = 0; i < min; ++i) {
            list.add(new Pair(array[i], array2[i]));
        }
        return list;
    }
    
    public static final <T> Iterable<T> Q0(final T[] array) {
        e.f((Object)array, "<this>");
        if (array.length == 0) {
            return (Iterable<T>)EmptyList.INSTANCE;
        }
        return (Iterable<T>)new b$a((Object[])array);
    }
    
    public static final <T> k<T> R0(final T[] array) {
        e.f((Object)array, "<this>");
        if (array.length == 0) {
            return (k<T>)f.a;
        }
        return (k<T>)new b$b((Object[])array);
    }
    
    public static final boolean S0(final int n, final int[] array) {
        e.f((Object)array, "<this>");
        return e1(n, array) >= 0;
    }
    
    public static final boolean T0(final Object o, final Object[] array) {
        e.f((Object)array, "<this>");
        return f1(o, array) >= 0;
    }
    
    public static final List U0(final Object[] array) {
        final int n = array.length - 3;
        boolean b = false;
        int n2 = n;
        if (n < 0) {
            n2 = 0;
        }
        if (n2 >= 0) {
            b = true;
        }
        if (b) {
            Object o;
            if (n2 == 0) {
                o = EmptyList.INSTANCE;
            }
            else {
                final int length = array.length;
                if (n2 >= length) {
                    o = v1(array);
                }
                else if (n2 == 1) {
                    o = lw0.b.r1(array[length - 1]);
                }
                else {
                    final ArrayList list = new ArrayList<Object>(n2);
                    for (int i = length - n2; i < length; ++i) {
                        list.add(array[i]);
                    }
                    o = list;
                }
            }
            return (List)o;
        }
        throw new IllegalArgumentException(d.i("Requested element count ", n2, " is less than zero.").toString());
    }
    
    public static final ArrayList V0(final Object[] array) {
        e.f((Object)array, "<this>");
        final ArrayList list = new ArrayList();
        for (final Object o : array) {
            if (o != null) {
                list.add(o);
            }
        }
        return list;
    }
    
    public static final byte W0(final byte[] array) {
        e.f((Object)array, "<this>");
        if (array.length != 0) {
            return array[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }
    
    public static final int X0(final int[] array) {
        e.f((Object)array, "<this>");
        if (array.length != 0) {
            return array[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }
    
    public static final <T> T Y0(final T[] array) {
        e.f((Object)array, "<this>");
        if (array.length != 0) {
            return array[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }
    
    public static final <T> T Z0(final T[] array) {
        e.f((Object)array, "<this>");
        T t;
        if (array.length == 0) {
            t = null;
        }
        else {
            t = array[0];
        }
        return t;
    }
    
    public static final <T> int a1(final T[] array) {
        e.f((Object)array, "<this>");
        return array.length - 1;
    }
    
    public static final Byte b1(final int n, final byte[] array) {
        Byte value;
        if (n >= 0 && n <= array.length - 1) {
            value = array[n];
        }
        else {
            value = null;
        }
        return value;
    }
    
    public static final Integer c1(final int n, final int[] array) {
        e.f((Object)array, "<this>");
        Integer value;
        if (n >= 0 && n <= array.length - 1) {
            value = array[n];
        }
        else {
            value = null;
        }
        return value;
    }
    
    public static final Object d1(final int n, final Object[] array) {
        e.f((Object)array, "<this>");
        Object o;
        if (n >= 0 && n <= array.length - 1) {
            o = array[n];
        }
        else {
            o = null;
        }
        return o;
    }
    
    public static final int e1(final int n, final int[] array) {
        e.f((Object)array, "<this>");
        for (int length = array.length, i = 0; i < length; ++i) {
            if (n == array[i]) {
                return i;
            }
        }
        return -1;
    }
    
    public static final int f1(final Object o, final Object[] array) {
        e.f((Object)array, "<this>");
        final int n = 0;
        int i = 0;
        if (o == null) {
            while (i < array.length) {
                if (array[i] == null) {
                    return i;
                }
                ++i;
            }
        }
        else {
            for (int length = array.length, j = n; j < length; ++j) {
                if (e.a(o, array[j])) {
                    return j;
                }
            }
        }
        return -1;
    }
    
    public static final void g1(final Object[] array, final StringBuilder sb, final CharSequence charSequence, final CharSequence charSequence2, final CharSequence charSequence3, final int n, final CharSequence charSequence4, final l l) {
        e.f((Object)array, "<this>");
        e.f((Object)charSequence, "separator");
        e.f((Object)charSequence2, "prefix");
        e.f((Object)charSequence3, "postfix");
        e.f((Object)charSequence4, "truncated");
        sb.append(charSequence2);
        final int length = array.length;
        int n2 = 0;
        int n3 = 0;
        int n4;
        while (true) {
            n4 = n3;
            if (n2 >= length) {
                break;
            }
            final Object o = array[n2];
            if (++n3 > 1) {
                sb.append(charSequence);
            }
            if (n >= 0 && (n4 = n3) > n) {
                break;
            }
            e0.n((Appendable)sb, o, l);
            ++n2;
        }
        if (n >= 0 && n4 > n) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
    }
    
    public static String h1(final byte[] array, final l l) {
        e.f((Object)array, "<this>");
        final StringBuilder sb = new StringBuilder();
        sb.append((CharSequence)"");
        final int length = array.length;
        int i = 0;
        int n = 0;
        while (i < length) {
            final byte b = array[i];
            if (++n > 1) {
                sb.append((CharSequence)"");
            }
            if (l != null) {
                sb.append((CharSequence)l.invoke(b));
            }
            else {
                sb.append((CharSequence)String.valueOf(b));
            }
            ++i;
        }
        sb.append((CharSequence)"");
        final String string = sb.toString();
        e.e((Object)string, "joinTo(StringBuilder(), \u2026ed, transform).toString()");
        return string;
    }
    
    public static String i1(final Object[] array, String s, String s2, String s3, l l, final int n) {
        if ((n & 0x1) != 0x0) {
            s = ", ";
        }
        if ((n & 0x2) != 0x0) {
            s2 = "";
        }
        if ((n & 0x4) != 0x0) {
            s3 = "";
        }
        int n2;
        if ((n & 0x8) != 0x0) {
            n2 = -1;
        }
        else {
            n2 = 0;
        }
        String s4;
        if ((n & 0x10) != 0x0) {
            s4 = "...";
        }
        else {
            s4 = null;
        }
        if ((n & 0x20) != 0x0) {
            l = null;
        }
        e.f((Object)array, "<this>");
        e.f((Object)s2, "prefix");
        e.f((Object)s3, "postfix");
        e.f((Object)s4, "truncated");
        final StringBuilder sb = new StringBuilder();
        g1(array, sb, s, s2, s3, n2, s4, l);
        final String string = sb.toString();
        e.e((Object)string, "joinTo(StringBuilder(), \u2026ed, transform).toString()");
        return string;
    }
    
    public static final <T> T j1(final T[] array) {
        e.f((Object)array, "<this>");
        if (array.length != 0) {
            return array[array.length - 1];
        }
        throw new NoSuchElementException("Array is empty.");
    }
    
    public static final Integer k1(final int[] array) {
        e.f((Object)array, "<this>");
        if (array.length == 0) {
            return null;
        }
        int n = array[0];
        final h e = ((yg2.g)new i(1, array.length - 1)).e();
        while (e.h) {
            final int n2 = array[e.nextInt()];
            if (n < n2) {
                n = n2;
            }
        }
        return n;
    }
    
    public static final Integer l1(final int[] array) {
        e.f((Object)array, "<this>");
        if (array.length == 0) {
            return null;
        }
        int n = array[0];
        final h e = ((yg2.g)new i(1, array.length - 1)).e();
        while (e.h) {
            final int n2 = array[e.nextInt()];
            if (n > n2) {
                n = n2;
            }
        }
        return n;
    }
    
    public static final char m1(final char[] array) {
        e.f((Object)array, "<this>");
        final int length = array.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return array[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }
    
    public static final <T> T n1(final T[] array) {
        e.f((Object)array, "<this>");
        final int length = array.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return array[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }
    
    public static final <T> T[] o1(final T[] array, final i i) {
        e.f((Object)array, "<this>");
        if (i.isEmpty()) {
            return (T[])j.L0(0, 0, (Object[])array);
        }
        return (T[])j.L0((int)i.n(), i.m() + 1, (Object[])array);
    }
    
    public static final List p1(final Comparator comparator, Object[] array) {
        e.f((Object)array, "<this>");
        if (array.length != 0) {
            final Object[] copy = Arrays.copyOf(array, array.length);
            e.e((Object)copy, "copyOf(this, size)");
            array = copy;
            if (copy.length > 1) {
                Arrays.sort(copy, comparator);
                array = copy;
            }
        }
        return j.B0(array);
    }
    
    public static final List q1(final Object[] array) {
        if (2 >= array.length) {
            return v1(array);
        }
        final ArrayList list = new ArrayList(2);
        final int length = array.length;
        int i = 0;
        int n = 0;
        while (i < length) {
            list.add(array[i]);
            if (++n == 2) {
                break;
            }
            ++i;
        }
        return list;
    }
    
    public static final List r1(final byte[] array) {
        final int length = array.length;
        if (32 >= length) {
            return t1(array);
        }
        final ArrayList list = new ArrayList(32);
        for (int i = length - 32; i < length; ++i) {
            list.add(array[i]);
        }
        return list;
    }
    
    public static final void s1(final HashSet set, final Object[] array) {
        e.f((Object)array, "<this>");
        for (int length = array.length, i = 0; i < length; ++i) {
            set.add(array[i]);
        }
    }
    
    public static final List<Byte> t1(final byte[] array) {
        e.f((Object)array, "<this>");
        final int length = array.length;
        Object o;
        if (length != 0) {
            int n = 0;
            if (length != 1) {
                final ArrayList list = new ArrayList(array.length);
                final int length2 = array.length;
                while (true) {
                    o = list;
                    if (n >= length2) {
                        break;
                    }
                    list.add(array[n]);
                    ++n;
                }
            }
            else {
                o = lw0.b.r1((Object)array[0]);
            }
        }
        else {
            o = EmptyList.INSTANCE;
        }
        return (List<Byte>)o;
    }
    
    public static final List<Integer> u1(final int[] array) {
        e.f((Object)array, "<this>");
        final int length = array.length;
        Object o;
        if (length != 0) {
            int n = 0;
            if (length != 1) {
                final ArrayList list = new ArrayList(array.length);
                final int length2 = array.length;
                while (true) {
                    o = list;
                    if (n >= length2) {
                        break;
                    }
                    list.add(array[n]);
                    ++n;
                }
            }
            else {
                o = lw0.b.r1((Object)array[0]);
            }
        }
        else {
            o = EmptyList.INSTANCE;
        }
        return (List<Integer>)o;
    }
    
    public static final <T> List<T> v1(final T[] array) {
        e.f((Object)array, "<this>");
        final int length = array.length;
        Object o;
        if (length != 0) {
            if (length != 1) {
                o = w1(array);
            }
            else {
                o = lw0.b.r1((Object)array[0]);
            }
        }
        else {
            o = EmptyList.INSTANCE;
        }
        return (List<T>)o;
    }
    
    public static final ArrayList w1(final Object[] array) {
        e.f((Object)array, "<this>");
        return new ArrayList((Collection<? extends E>)new g(array, false));
    }
    
    public static final <T> Set<T> x1(final T[] array) {
        e.f((Object)array, "<this>");
        final LinkedHashSet set = new LinkedHashSet(bg.d.o0(array.length));
        s1(set, array);
        return set;
    }
    
    public static final <T> Set<T> y1(final T[] array) {
        e.f((Object)array, "<this>");
        final int length = array.length;
        Object o;
        if (length != 0) {
            if (length != 1) {
                final LinkedHashSet set = new LinkedHashSet(bg.d.o0(array.length));
                s1(set, array);
                o = set;
            }
            else {
                o = a0.A0(array[0]);
            }
        }
        else {
            o = EmptySet.INSTANCE;
        }
        return (Set<T>)o;
    }
    
    public static final u z1(final Object[] array) {
        e.f((Object)array, "<this>");
        return new u((a)new ArraysKt___ArraysKt$withIndex$1(array));
    }
}
