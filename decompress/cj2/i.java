// 
// Decompiled by Procyon v0.6.0
// 

package cj2;

import lw0.b;
import sg2.e;

public class i extends h
{
    public static final Integer A0(final String s) {
        e.f((Object)s, "<this>");
        b.T(10);
        final int length = s.length();
        if (length != 0) {
            int n = 0;
            final char char1 = s.charAt(0);
            final int h = e.h((int)char1, 48);
            int n2 = -2147483647;
            int n3 = 1;
            int n4;
            if (h < 0) {
                if (length == 1) {
                    return null;
                }
                if (char1 == '-') {
                    n2 = Integer.MIN_VALUE;
                    n4 = 1;
                }
                else {
                    if (char1 != '+') {
                        return null;
                    }
                    n4 = 0;
                }
            }
            else {
                n4 = (n3 = 0);
            }
            int n5 = -59652323;
            int n6;
            for (int i = n3; i < length; ++i, n5 = n6) {
                final int digit = Character.digit((int)s.charAt(i), 10);
                if (digit < 0) {
                    return null;
                }
                if (n < (n6 = n5)) {
                    if (n5 != -59652323) {
                        return null;
                    }
                    if (n < (n6 = n2 / 10)) {
                        return null;
                    }
                }
                final int n7 = n * 10;
                if (n7 < n2 + digit) {
                    return null;
                }
                n = n7 - digit;
            }
            if (n4 != 0) {
                return n;
            }
            return -n;
        }
        return null;
    }
    
    public static final Long B0(final String s) {
        b.T(10);
        final int length = s.length();
        if (length != 0) {
            int i = 0;
            final char char1 = s.charAt(0);
            final int h = e.h((int)char1, 48);
            long n = -9223372036854775807L;
            boolean b = true;
            if (h < 0) {
                if (length == 1) {
                    return null;
                }
                if (char1 == '-') {
                    n = Long.MIN_VALUE;
                    i = 1;
                }
                else {
                    if (char1 != '+') {
                        return null;
                    }
                    b = false;
                    i = 1;
                }
            }
            else {
                b = false;
            }
            long n2 = 0L;
            long n3 = -256204778801521550L;
            while (i < length) {
                final int digit = Character.digit((int)s.charAt(i), 10);
                if (digit < 0) {
                    return null;
                }
                long n4 = n3;
                if (n2 < n3) {
                    if (n3 != -256204778801521550L) {
                        return null;
                    }
                    if (n2 < (n4 = n / 10)) {
                        return null;
                    }
                }
                final long n5 = n2 * 10;
                final long n6 = digit;
                if (n5 < n + n6) {
                    return null;
                }
                n2 = n5 - n6;
                ++i;
                n3 = n4;
            }
            if (b) {
                return n2;
            }
            return -n2;
        }
        return null;
    }
    
    public static final Float z0(final String s) {
        e.f((Object)s, "<this>");
        Float value = null;
        try {
            if (f.a.matches((CharSequence)s)) {
                value = Float.parseFloat(s);
            }
            return value;
        }
        catch (final NumberFormatException ex) {
            value = value;
            return value;
        }
    }
}
