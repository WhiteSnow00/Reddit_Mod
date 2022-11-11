// 
// Decompiled by Procyon v0.6.0
// 

package s1;

import java.util.List;
import o1.r;
import kotlin.collections.EmptyList;

public final class j
{
    public static final EmptyList a;
    
    static {
        a = EmptyList.INSTANCE;
        final int m = r.m;
    }
    
    public static final List<d> a(final String s) {
        Object o;
        if (s == null) {
            o = j.a;
        }
        else {
            final e e = new e();
            e.a.clear();
            int i = 1;
            int n = 0;
            while (i < s.length()) {
                while (i < s.length()) {
                    final char char1 = s.charAt(i);
                    if (((char1 - 'Z') * (char1 - 'A') <= 0 || (char1 - 'z') * (char1 - 'a') <= 0) && char1 != 'e' && char1 != 'E') {
                        break;
                    }
                    ++i;
                }
                final String substring = s.substring(n, i);
                sg2.e.e((Object)substring, "this as java.lang.String\u2026ing(startIndex, endIndex)");
                int n2 = substring.length() - 1;
                int n3;
                int j = n3 = 0;
                while (j <= n2) {
                    int n4;
                    if (n3 == 0) {
                        n4 = j;
                    }
                    else {
                        n4 = n2;
                    }
                    final boolean b = sg2.e.h((int)substring.charAt(n4), 32) <= 0;
                    if (n3 == 0) {
                        if (!b) {
                            n3 = 1;
                        }
                        else {
                            ++j;
                        }
                    }
                    else {
                        if (!b) {
                            break;
                        }
                        --n2;
                    }
                }
                final String string = substring.subSequence(j, n2 + 1).toString();
                if (string.length() > 0) {
                    float[] array2;
                    int n17;
                    if (string.charAt(0) != 'z' && string.charAt(0) != 'Z') {
                        final int length = string.length();
                        final float[] array = new float[length];
                        final e.a a = new e.a(0);
                        final int length2 = string.length();
                        int k = 1;
                        int n5 = 0;
                        while (k < length2) {
                            a.b = false;
                            final int n6 = 0;
                            int n8;
                            final int n7 = n8 = n6;
                            int l = k;
                            int n9 = n7;
                            int n10 = n6;
                            while (l < string.length()) {
                                final char char2 = string.charAt(l);
                                boolean b2 = false;
                                Label_0389: {
                                    if (char2 != ' ') {
                                        if (char2 != ',') {
                                            b2 = false;
                                            break Label_0389;
                                        }
                                    }
                                    b2 = true;
                                }
                                int n13 = 0;
                                Label_0534: {
                                    int n11 = 0;
                                    int n12 = 0;
                                    Label_0473: {
                                        if (!b2) {
                                            if (char2 == '-') {
                                                n11 = n10;
                                                n12 = n8;
                                                if (l == k) {
                                                    break Label_0473;
                                                }
                                                n11 = n10;
                                                n12 = n8;
                                                if (n9 != 0) {
                                                    break Label_0473;
                                                }
                                                a.b = true;
                                            }
                                            else if (char2 == '.') {
                                                if (n10 == 0) {
                                                    n11 = 1;
                                                    n12 = n8;
                                                    break Label_0473;
                                                }
                                                a.b = true;
                                            }
                                            else {
                                                boolean b3 = false;
                                                Label_0502: {
                                                    if (char2 != 'e') {
                                                        if (char2 != 'E') {
                                                            b3 = false;
                                                            break Label_0502;
                                                        }
                                                    }
                                                    b3 = true;
                                                }
                                                n11 = n10;
                                                n12 = n8;
                                                if (b3) {
                                                    n13 = 1;
                                                    break Label_0534;
                                                }
                                                break Label_0473;
                                            }
                                        }
                                        n12 = 1;
                                        n11 = n10;
                                    }
                                    final int n14 = 0;
                                    n8 = n12;
                                    n13 = n14;
                                    n10 = n11;
                                }
                                if (n8 != 0) {
                                    break;
                                }
                                ++l;
                                n9 = n13;
                            }
                            a.a = l;
                            int n15 = n5;
                            if (k < l) {
                                final String substring2 = string.substring(k, l);
                                sg2.e.e((Object)substring2, "this as java.lang.String\u2026ing(startIndex, endIndex)");
                                array[n5] = Float.parseFloat(substring2);
                                n15 = n5 + 1;
                            }
                            if (!a.b) {
                                ++l;
                            }
                            k = l;
                            n5 = n15;
                        }
                        if (n5 < 0) {
                            throw new IllegalArgumentException();
                        }
                        if (length < 0) {
                            throw new IndexOutOfBoundsException();
                        }
                        final int n16 = n5 + 0;
                        final int min = Math.min(n16, length + 0);
                        array2 = new float[n16];
                        n17 = 0;
                        System.arraycopy(array, 0, array2, 0, min + 0 - 0);
                    }
                    else {
                        n17 = 0;
                        array2 = new float[n17];
                    }
                    e.a(string.charAt(n17), array2);
                }
                n = i;
                ++i;
            }
            if (i - n == 1 && n < s.length()) {
                e.a(s.charAt(n), new float[0]);
            }
            o = e.a;
        }
        return (List<d>)o;
    }
}
