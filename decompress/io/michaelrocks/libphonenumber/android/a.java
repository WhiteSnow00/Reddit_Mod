// 
// Decompiled by Procyon v0.6.0
// 

package io.michaelrocks.libphonenumber.android;

import java.util.logging.Level;
import androidx.lifecycle.w;
import java.util.Iterator;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.logging.Logger;

public final class a
{
    public static final Logger e;
    public static final Map<Integer, String> f;
    public static final Set<Integer> g;
    public static final Set<Integer> h;
    public static final Map<Character, Character> i;
    public static final Map<Character, Character> j;
    public static final Map<Character, Character> k;
    public static final Map<Character, Character> l;
    public final Map<Integer, List<String>> a;
    public final HashSet b;
    public final HashSet c;
    public final HashSet d;
    
    static {
        e = Logger.getLogger(a.class.getName());
        final HashMap hashMap = new HashMap();
        final Integer value = 54;
        final Character value2 = '6';
        hashMap.put(value, "9");
        f = Collections.unmodifiableMap((Map<?, ?>)hashMap);
        final HashSet set = new HashSet();
        set.add(86);
        g = Collections.unmodifiableSet((Set<?>)set);
        final HashSet set2 = new HashSet();
        final Character value3 = '4';
        set2.add(52);
        set2.add(value);
        final Character value4 = '7';
        set2.add(55);
        set2.add(62);
        set2.addAll(set);
        h = Collections.unmodifiableSet((Set<?>)set2);
        final HashMap hashMap2 = new HashMap();
        final Character value5 = '0';
        hashMap2.put(value5, value5);
        final Character value6 = '1';
        hashMap2.put(value6, value6);
        final Character value7 = '2';
        hashMap2.put(value7, value7);
        final Character value8 = '3';
        hashMap2.put(value8, value8);
        hashMap2.put(value3, value3);
        final Character value9 = '5';
        hashMap2.put(value9, value9);
        hashMap2.put(value2, value2);
        hashMap2.put(value4, value4);
        final Character value10 = '8';
        hashMap2.put(value10, value10);
        final Character value11 = '9';
        hashMap2.put(value11, value11);
        final HashMap hashMap3 = new HashMap(40);
        hashMap3.put('A', value7);
        hashMap3.put('B', value7);
        hashMap3.put('C', value7);
        hashMap3.put('D', value8);
        hashMap3.put('E', value8);
        hashMap3.put('F', value8);
        hashMap3.put('G', value3);
        hashMap3.put('H', value3);
        hashMap3.put('I', value3);
        hashMap3.put('J', value9);
        hashMap3.put('K', value9);
        hashMap3.put('L', value9);
        hashMap3.put('M', value2);
        hashMap3.put('N', value2);
        hashMap3.put('O', value2);
        hashMap3.put('P', value4);
        hashMap3.put('Q', value4);
        hashMap3.put('R', value4);
        hashMap3.put('S', value4);
        hashMap3.put('T', value10);
        hashMap3.put('U', value10);
        hashMap3.put('V', value10);
        hashMap3.put('W', value11);
        hashMap3.put('X', value11);
        hashMap3.put('Y', value11);
        hashMap3.put('Z', value11);
        final Map<Character, Character> map = j = Collections.unmodifiableMap((Map<? extends Character, ? extends Character>)hashMap3);
        final HashMap hashMap4 = new HashMap(100);
        hashMap4.putAll(map);
        hashMap4.putAll(hashMap2);
        k = Collections.unmodifiableMap((Map<?, ?>)hashMap4);
        final HashMap hashMap5 = new HashMap();
        hashMap5.putAll(hashMap2);
        final Character value12 = '+';
        hashMap5.put(value12, value12);
        final Character value13 = '*';
        hashMap5.put(value13, value13);
        final Character value14 = '#';
        hashMap5.put(value14, value14);
        i = Collections.unmodifiableMap((Map<?, ?>)hashMap5);
        final HashMap hashMap6 = new HashMap();
        for (final char charValue : map.keySet()) {
            hashMap6.put(Character.toLowerCase(charValue), charValue);
            hashMap6.put(charValue, charValue);
        }
        hashMap6.putAll(hashMap2);
        hashMap6.put('-', '-');
        hashMap6.put('\uff0d', '-');
        hashMap6.put('\u2010', '-');
        hashMap6.put('\u2011', '-');
        hashMap6.put('\u2012', '-');
        hashMap6.put('\u2013', '-');
        hashMap6.put('\u2014', '-');
        hashMap6.put('\u2015', '-');
        hashMap6.put('\u2212', '-');
        hashMap6.put('/', '/');
        hashMap6.put('\uff0f', '/');
        hashMap6.put(' ', ' ');
        hashMap6.put('\u3000', ' ');
        hashMap6.put('\u2060', ' ');
        hashMap6.put('.', '.');
        hashMap6.put('\uff0e', '.');
        l = Collections.unmodifiableMap((Map<?, ?>)hashMap6);
        Pattern.compile("[\\d]+(?:[~\u2053\u223c\uff5e][\\d]+)?");
        final StringBuilder sb = new StringBuilder();
        final Map<Character, Character> m = a.j;
        sb.append(Arrays.toString(m.keySet().toArray()).replaceAll("[, \\[\\]]", ""));
        sb.append(Arrays.toString(m.keySet().toArray()).toLowerCase().replaceAll("[, \\[\\]]", ""));
        final String string = sb.toString();
        Pattern.compile("[+\uff0b]+");
        Pattern.compile("[-x\u2010-\u2015\u2212\u30fc\uff0d-\uff0f  \u00ad\u200b\u2060\u3000()\uff08\uff09\uff3b\uff3d.\\[\\]/~\u2053\u223c\uff5e]+");
        Pattern.compile("(\\p{Nd})");
        Pattern.compile("[+\uff0b\\p{Nd}]");
        Pattern.compile("[\\\\/] *x");
        Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$");
        Pattern.compile("(?:.*?[A-Za-z]){3}.*");
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("\\p{Nd}{2}|[+\uff0b]*+(?:[-x\u2010-\u2015\u2212\u30fc\uff0d-\uff0f  \u00ad\u200b\u2060\u3000()\uff08\uff09\uff3b\uff3d.\\[\\]/~\u2053\u223c\uff5e*]*\\p{Nd}){3,}[-x\u2010-\u2015\u2212\u30fc\uff0d-\uff0f  \u00ad\u200b\u2060\u3000()\uff08\uff09\uff3b\uff3d.\\[\\]/~\u2053\u223c\uff5e*");
        sb2.append(string);
        sb2.append("\\p{Nd}");
        sb2.append("]*");
        final String string2 = sb2.toString();
        final String a = a(",;x\uff58#\uff03~\uff5e");
        a("x\uff58#\uff03~\uff5e");
        final StringBuilder sb3 = new StringBuilder();
        sb3.append("(?:");
        sb3.append(a);
        sb3.append(")$");
        Pattern.compile(sb3.toString(), 66);
        final StringBuilder sb4 = new StringBuilder();
        sb4.append(string2);
        sb4.append("(?:");
        sb4.append(a);
        sb4.append(")?");
        Pattern.compile(sb4.toString(), 66);
        Pattern.compile("(\\D+)");
        Pattern.compile("(\\$\\d)");
        Pattern.compile("\\(?\\$1\\)?");
    }
    
    public a(final HashMap a) {
        new w(14);
        this.b = new HashSet(35);
        new io.michaelrocks.libphonenumber.android.internal.a();
        this.c = new HashSet(320);
        this.d = new HashSet();
        this.a = a;
        for (final Map.Entry<K, List> entry : a.entrySet()) {
            final List list = entry.getValue();
            if (list.size() == 1 && "001".equals(list.get(0))) {
                this.d.add(entry.getKey());
            }
            else {
                this.c.addAll(list);
            }
        }
        if (this.c.remove("001")) {
            io.michaelrocks.libphonenumber.android.a.e.log(Level.WARNING, "invalid metadata (country calling code was mapped to the non-geo entity as well as specific region(s))");
        }
        this.b.addAll(a.get(1));
    }
    
    public static String a(final String s) {
        return a.o(d.r(";ext=(\\p{Nd}{1,7})|[  \\t,]*(?:e?xt(?:ensi(?:o\u0301?|\u00f3))?n?|\uff45?\uff58\uff54\uff4e?|\u0434\u043e\u0431|[", s, "]|int|anexo|\uff49\uff4e\uff54)[:\\.\uff0e]?[  \\t,-]*", "(\\p{Nd}{1,7})", "#?|[- ]+("), "\\p{Nd}", "{1,5})#");
    }
}
