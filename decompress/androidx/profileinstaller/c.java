// 
// Decompiled by Procyon v0.6.0
// 

package androidx.profileinstaller;

import java.util.Iterator;
import java.util.Map;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.TreeMap;
import ak0.m;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import ak0.n;
import java.io.IOException;
import java.util.Arrays;
import h5.j;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import h5.b;

public final class c
{
    public static final byte[] a;
    public static final byte[] b;
    
    static {
        a = new byte[] { 112, 114, 111, 0 };
        b = new byte[] { 112, 114, 109, 0 };
    }
    
    public static byte[] a(final b[] array, final byte[] array2) throws IOException {
        final int length = array.length;
        final int n = 0;
        final int n2 = 0;
        int n3;
        for (int i = n3 = 0; i < length; ++i) {
            final b b = array[i];
            n3 += (b.b(b.g, 2, 8, -1) & 0xFFFFFFF8) / 8 + (b.e * 2 + (b(b.a, b.b, array2).getBytes(StandardCharsets.UTF_8).length + 16) + b.f);
        }
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(n3);
        if (Arrays.equals(array2, j.c)) {
            for (int length2 = array.length, j = n2; j < length2; ++j) {
                final b b2 = array[j];
                l(byteArrayOutputStream, b2, b(b2.a, b2.b, array2));
                n(byteArrayOutputStream, b2);
                k(byteArrayOutputStream, b2);
                m(byteArrayOutputStream, b2);
            }
        }
        else {
            for (final b b3 : array) {
                l(byteArrayOutputStream, b3, b(b3.a, b3.b, array2));
            }
            for (int length4 = array.length, l = n; l < length4; ++l) {
                final b b4 = array[l];
                n(byteArrayOutputStream, b4);
                k(byteArrayOutputStream, b4);
                m(byteArrayOutputStream, b4);
            }
        }
        if (byteArrayOutputStream.size() == n3) {
            return byteArrayOutputStream.toByteArray();
        }
        final StringBuilder m = a.k("The bytes saved do not match expectation. actual=");
        m.append(byteArrayOutputStream.size());
        m.append(" expected=");
        m.append(n3);
        throw new IllegalStateException(m.toString());
    }
    
    public static String b(String s, final String s2, final byte[] array) {
        final byte[] e = j.e;
        final boolean equals = Arrays.equals(array, e);
        final String s3 = "!";
        String s4 = null;
        Label_0044: {
            if (!equals) {
                if (!Arrays.equals(array, j.d)) {
                    s4 = "!";
                    break Label_0044;
                }
            }
            s4 = ":";
        }
        if (s.length() <= 0) {
            if ("!".equals(s4)) {
                s = s2.replace(":", "!");
            }
            else {
                s = s2;
                if (":".equals(s4)) {
                    s = s2.replace("!", ":");
                }
            }
            return s;
        }
        if (s2.equals("classes.dex")) {
            return s;
        }
        if (s2.contains("!") || s2.contains(":")) {
            if ("!".equals(s4)) {
                s = s2.replace(":", "!");
            }
            else {
                s = s2;
                if (":".equals(s4)) {
                    s = s2.replace("!", ":");
                }
            }
            return s;
        }
        if (s2.endsWith(".apk")) {
            return s2;
        }
        final StringBuilder k = a.k(s);
        if (!Arrays.equals(array, e)) {
            s = s3;
            if (!Arrays.equals(array, j.d)) {
                return a2.b.j(k, s, s2);
            }
        }
        s = ":";
        return a2.b.j(k, s, s2);
    }
    
    public static int c(final int n, final int n2, final int n3) {
        if (n == 1) {
            throw new IllegalStateException("HOT methods are not stored in the bitmap");
        }
        if (n == 2) {
            return n2;
        }
        if (n == 4) {
            return n2 + n3;
        }
        throw new IllegalStateException(n.k("Unexpected flag: ", n));
    }
    
    public static int[] d(final ByteArrayInputStream byteArrayInputStream, final int n) throws IOException {
        final int[] array = new int[n];
        int i = 0;
        int n2 = 0;
        while (i < n) {
            n2 += h5.c.e((InputStream)byteArrayInputStream);
            array[i] = n2;
            ++i;
        }
        return array;
    }
    
    public static b[] e(FileInputStream fileInputStream, byte[] array, final byte[] array2, final b[] array3) throws IOException {
        final byte[] f = j.f;
        if (Arrays.equals(array, f)) {
            if (Arrays.equals(j.a, array2)) {
                throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            }
            if (Arrays.equals(array, f)) {
                final int n = (int)h5.c.d((InputStream)fileInputStream, 1);
                array = h5.c.c(fileInputStream, (int)h5.c.d((InputStream)fileInputStream, 4), (int)h5.c.d((InputStream)fileInputStream, 4));
                if (fileInputStream.read() <= 0) {
                    fileInputStream = (FileInputStream)new ByteArrayInputStream(array);
                    try {
                        final b[] f2 = f((ByteArrayInputStream)fileInputStream, n, array3);
                        fileInputStream.close();
                        return f2;
                    }
                    finally {
                        try {
                            fileInputStream.close();
                        }
                        finally {
                            final Throwable t;
                            ((Throwable)(Object)array).addSuppressed(t);
                        }
                    }
                }
                throw new IllegalStateException("Content found after the end of file");
            }
            throw new IllegalStateException("Unsupported meta version");
        }
        else {
            if (Arrays.equals(array, j.g)) {
                final int e = h5.c.e((InputStream)fileInputStream);
                array = h5.c.c(fileInputStream, (int)h5.c.d((InputStream)fileInputStream, 4), (int)h5.c.d((InputStream)fileInputStream, 4));
                if (fileInputStream.read() <= 0) {
                    fileInputStream = (FileInputStream)new ByteArrayInputStream(array);
                    try {
                        final b[] g = g((ByteArrayInputStream)fileInputStream, array2, e, array3);
                        fileInputStream.close();
                        return g;
                    }
                    finally {
                        try {
                            fileInputStream.close();
                        }
                        finally {
                            final Throwable t2;
                            ((Throwable)(Object)array).addSuppressed(t2);
                        }
                    }
                }
                throw new IllegalStateException("Content found after the end of file");
            }
            throw new IllegalStateException("Unsupported meta version");
        }
    }
    
    public static b[] f(final ByteArrayInputStream byteArrayInputStream, final int n, final b[] array) throws IOException {
        final int available = byteArrayInputStream.available();
        final int n2 = 0;
        if (available == 0) {
            return new b[0];
        }
        if (n == array.length) {
            final String[] array2 = new String[n];
            final int[] array3 = new int[n];
            int n3 = 0;
            int i;
            while (true) {
                i = n2;
                if (n3 >= n) {
                    break;
                }
                final int e = h5.c.e((InputStream)byteArrayInputStream);
                array3[n3] = h5.c.e((InputStream)byteArrayInputStream);
                array2[n3] = new String(h5.c.b((InputStream)byteArrayInputStream, e), StandardCharsets.UTF_8);
                ++n3;
            }
            while (i < n) {
                final b b = array[i];
                if (!b.b.equals(array2[i])) {
                    throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
                }
                final int e2 = array3[i];
                b.e = e2;
                b.h = d(byteArrayInputStream, e2);
                ++i;
            }
            return array;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }
    
    public static b[] g(final ByteArrayInputStream byteArrayInputStream, final byte[] array, final int n, final b[] array2) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        if (n == array2.length) {
            for (int i = 0; i < n; ++i) {
                h5.c.e((InputStream)byteArrayInputStream);
                final String s = new String(h5.c.b((InputStream)byteArrayInputStream, h5.c.e((InputStream)byteArrayInputStream)), StandardCharsets.UTF_8);
                final long d = h5.c.d((InputStream)byteArrayInputStream, 4);
                final int e = h5.c.e((InputStream)byteArrayInputStream);
                final int length = array2.length;
                final b b = null;
                b b2;
                if (length <= 0) {
                    b2 = b;
                }
                else {
                    int n2;
                    if ((n2 = s.indexOf("!")) < 0) {
                        n2 = s.indexOf(":");
                    }
                    String substring;
                    if (n2 > 0) {
                        substring = s.substring(n2 + 1);
                    }
                    else {
                        substring = s;
                    }
                    int n3 = 0;
                    while (true) {
                        b2 = b;
                        if (n3 >= array2.length) {
                            break;
                        }
                        if (array2[n3].b.equals(substring)) {
                            b2 = array2[n3];
                            break;
                        }
                        ++n3;
                    }
                }
                if (b2 == null) {
                    throw new IllegalStateException(m.l("Missing profile key: ", s));
                }
                b2.d = d;
                final int[] d2 = d(byteArrayInputStream, e);
                if (Arrays.equals(array, j.e)) {
                    b2.e = e;
                    b2.h = d2;
                }
            }
            return array2;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }
    
    public static b[] h(FileInputStream fileInputStream, byte[] c, final String s) throws IOException {
        if (Arrays.equals((byte[])c, j.b)) {
            final int n = (int)c.d((InputStream)fileInputStream, 1);
            c = c.c(fileInputStream, (int)c.d((InputStream)fileInputStream, 4), (int)c.d((InputStream)fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                fileInputStream = (FileInputStream)new ByteArrayInputStream((byte[])c);
                try {
                    final b[] i = i((ByteArrayInputStream)fileInputStream, s, n);
                    fileInputStream.close();
                    return i;
                }
                finally {
                    try {
                        fileInputStream.close();
                    }
                    finally {
                        final Throwable t;
                        ((Throwable)c).addSuppressed(t);
                    }
                }
            }
            throw new IllegalStateException("Content found after the end of file");
        }
        throw new IllegalStateException("Unsupported version");
    }
    
    public static b[] i(final ByteArrayInputStream byteArrayInputStream, final String s, final int n) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        final b[] array = new b[n];
        for (int i = 0; i < n; ++i) {
            final int e = h5.c.e((InputStream)byteArrayInputStream);
            final int e2 = h5.c.e((InputStream)byteArrayInputStream);
            array[i] = new b(s, new String(h5.c.b((InputStream)byteArrayInputStream, e), StandardCharsets.UTF_8), h5.c.d((InputStream)byteArrayInputStream, 4), e2, (int)h5.c.d((InputStream)byteArrayInputStream, 4), (int)h5.c.d((InputStream)byteArrayInputStream, 4), new int[e2], new TreeMap());
        }
        for (final b b : array) {
            final int n2 = byteArrayInputStream.available() - b.f;
            int n3 = 0;
            while (byteArrayInputStream.available() > n2) {
                final int n4 = n3 + h5.c.e((InputStream)byteArrayInputStream);
                b.i.put(n4, 1);
                int e3 = h5.c.e((InputStream)byteArrayInputStream);
                while (true) {
                    n3 = n4;
                    if (e3 <= 0) {
                        break;
                    }
                    h5.c.e((InputStream)byteArrayInputStream);
                    final int n5 = (int)h5.c.d((InputStream)byteArrayInputStream, 1);
                    if (n5 != 6) {
                        int k;
                        if ((k = n5) != 7) {
                            while (k > 0) {
                                h5.c.d((InputStream)byteArrayInputStream, 1);
                                for (int l = (int)h5.c.d((InputStream)byteArrayInputStream, 1); l > 0; --l) {
                                    h5.c.e((InputStream)byteArrayInputStream);
                                }
                                --k;
                            }
                        }
                    }
                    --e3;
                }
            }
            if (byteArrayInputStream.available() != n2) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            b.h = d(byteArrayInputStream, b.e);
            final BitSet value = BitSet.valueOf(h5.c.b((InputStream)byteArrayInputStream, (b.b(b.g, 2, 8, -1) & 0xFFFFFFF8) / 8));
            int n6 = 0;
            while (true) {
                final int g = b.g;
                if (n6 >= g) {
                    break;
                }
                int n7;
                if (value.get(c(2, n6, g))) {
                    n7 = 2;
                }
                else {
                    n7 = 0;
                }
                int n8 = n7;
                if (value.get(c(4, n6, g))) {
                    n8 = (n7 | 0x4);
                }
                if (n8 != 0) {
                    Integer value2;
                    if ((value2 = b.i.get(n6)) == null) {
                        value2 = 0;
                    }
                    b.i.put(n6, value2 | n8);
                }
                ++n6;
            }
        }
        return array;
    }
    
    public static boolean j(final ByteArrayOutputStream byteArrayOutputStream, byte[] array, final b[] array2) throws IOException {
        if (Arrays.equals(array, j.a)) {
            final ArrayList list = new ArrayList(3);
            final ArrayList list2 = new ArrayList<byte[]>(3);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                h5.c.g(byteArrayOutputStream2, array2.length);
                int i = 0;
                int n = 2;
                while (i < array2.length) {
                    final b b = array2[i];
                    h5.c.f(byteArrayOutputStream2, b.c, 4);
                    h5.c.f(byteArrayOutputStream2, b.d, 4);
                    h5.c.f(byteArrayOutputStream2, (long)b.g, 4);
                    final String b2 = b(b.a, b.b, j.a);
                    final int length = b2.getBytes(StandardCharsets.UTF_8).length;
                    h5.c.g(byteArrayOutputStream2, length);
                    n = n + 4 + 4 + 4 + 2 + length * 1;
                    byteArrayOutputStream2.write(b2.getBytes(StandardCharsets.UTF_8));
                    ++i;
                }
                final byte[] byteArray = byteArrayOutputStream2.toByteArray();
                if (n == byteArray.length) {
                    final d d = new d(FileSectionType.DEX_FILES, byteArray, false);
                    byteArrayOutputStream2.close();
                    list.add(d);
                    byteArrayOutputStream2 = new ByteArrayOutputStream();
                    int n2;
                    int j = n2 = 0;
                    try {
                        while (j < array2.length) {
                            final b b3 = array2[j];
                            h5.c.g(byteArrayOutputStream2, j);
                            h5.c.g(byteArrayOutputStream2, b3.e);
                            n2 = n2 + 2 + 2 + b3.e * 2;
                            k(byteArrayOutputStream2, b3);
                            ++j;
                        }
                        final byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                        if (n2 == byteArray2.length) {
                            final d d2 = new d(FileSectionType.CLASSES, byteArray2, true);
                            byteArrayOutputStream2.close();
                            list.add(d2);
                            byteArrayOutputStream2 = new ByteArrayOutputStream();
                            int n3;
                            int k = n3 = 0;
                            try {
                                while (k < array2.length) {
                                    final b b4 = array2[k];
                                    final Iterator iterator = b4.i.entrySet().iterator();
                                    int n4 = 0;
                                    while (iterator.hasNext()) {
                                        n4 |= ((Map.Entry<K, Integer>)iterator.next()).getValue();
                                    }
                                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                                    try {
                                        m(byteArrayOutputStream3, b4);
                                        final byte[] byteArray3 = byteArrayOutputStream3.toByteArray();
                                        byteArrayOutputStream3.close();
                                        byteArrayOutputStream3 = new ByteArrayOutputStream();
                                        try {
                                            n(byteArrayOutputStream3, b4);
                                            final byte[] byteArray4 = byteArrayOutputStream3.toByteArray();
                                            byteArrayOutputStream3.close();
                                            h5.c.g(byteArrayOutputStream2, k);
                                            final int n5 = byteArray3.length + 2 + byteArray4.length;
                                            h5.c.f(byteArrayOutputStream2, (long)n5, 4);
                                            h5.c.g(byteArrayOutputStream2, n4);
                                            byteArrayOutputStream2.write(byteArray3);
                                            byteArrayOutputStream2.write(byteArray4);
                                            n3 = n3 + 2 + 4 + n5;
                                            ++k;
                                        }
                                        finally {
                                            try {
                                                byteArrayOutputStream3.close();
                                            }
                                            finally {
                                                final Throwable t;
                                                ((Throwable)byteArrayOutputStream).addSuppressed(t);
                                            }
                                        }
                                    }
                                    finally {
                                        try {
                                            byteArrayOutputStream3.close();
                                        }
                                        finally {
                                            ((Throwable)byteArrayOutputStream).addSuppressed((Throwable)list2);
                                        }
                                    }
                                    break;
                                }
                                final byte[] byteArray5 = byteArrayOutputStream2.toByteArray();
                                if (n3 == byteArray5.length) {
                                    final d d3 = new d(FileSectionType.METHODS, byteArray5, true);
                                    byteArrayOutputStream2.close();
                                    list.add(d3);
                                    final long n6 = 4;
                                    long n7 = n6 + n6 + 4L + list.size() * 16;
                                    h5.c.f(byteArrayOutputStream, (long)list.size(), 4);
                                    for (int l = 0; l < list.size(); ++l) {
                                        final d d4 = list.get(l);
                                        h5.c.f(byteArrayOutputStream, d4.a.getValue(), 4);
                                        h5.c.f(byteArrayOutputStream, n7, 4);
                                        int n9;
                                        if (d4.c) {
                                            final byte[] b5 = d4.b;
                                            final long n8 = b5.length;
                                            final byte[] a = h5.c.a(b5);
                                            list2.add(a);
                                            h5.c.f(byteArrayOutputStream, (long)a.length, 4);
                                            h5.c.f(byteArrayOutputStream, n8, 4);
                                            n9 = a.length;
                                        }
                                        else {
                                            list2.add(d4.b);
                                            h5.c.f(byteArrayOutputStream, (long)d4.b.length, 4);
                                            h5.c.f(byteArrayOutputStream, 0L, 4);
                                            n9 = d4.b.length;
                                        }
                                        n7 += n9;
                                    }
                                    for (int n10 = 0; n10 < list2.size(); ++n10) {
                                        byteArrayOutputStream.write((byte[])list2.get(n10));
                                    }
                                    return true;
                                }
                                final StringBuilder sb = new StringBuilder();
                                sb.append("Expected size ");
                                sb.append(n3);
                                sb.append(", does not match actual size ");
                                sb.append(byteArray5.length);
                                throw new IllegalStateException(sb.toString());
                            }
                            finally {
                                try {
                                    byteArrayOutputStream2.close();
                                }
                                finally {
                                    final Throwable t2;
                                    ((Throwable)byteArrayOutputStream).addSuppressed(t2);
                                }
                            }
                        }
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("Expected size ");
                        sb2.append(n2);
                        sb2.append(", does not match actual size ");
                        sb2.append(byteArray2.length);
                        throw new IllegalStateException(sb2.toString());
                    }
                    finally {
                        try {
                            byteArrayOutputStream2.close();
                        }
                        finally {
                            final Throwable t3;
                            ((Throwable)byteArrayOutputStream).addSuppressed(t3);
                        }
                    }
                }
                final StringBuilder sb3 = new StringBuilder();
                sb3.append("Expected size ");
                sb3.append(n);
                sb3.append(", does not match actual size ");
                sb3.append(byteArray.length);
                throw new IllegalStateException(sb3.toString());
            }
            finally {
                try {
                    byteArrayOutputStream2.close();
                }
                finally {
                    final Throwable t4;
                    ((Throwable)byteArrayOutputStream).addSuppressed(t4);
                }
            }
        }
        final byte[] b6 = j.b;
        if (Arrays.equals(array, b6)) {
            array = a(array2, b6);
            h5.c.f(byteArrayOutputStream, (long)array2.length, 1);
            h5.c.f(byteArrayOutputStream, (long)array.length, 4);
            array = h5.c.a(array);
            h5.c.f(byteArrayOutputStream, (long)array.length, 4);
            byteArrayOutputStream.write(array);
            return true;
        }
        if (Arrays.equals(array, j.d)) {
            h5.c.f(byteArrayOutputStream, (long)array2.length, 1);
            for (final b b7 : array2) {
                final int size = b7.i.size();
                final String b8 = b(b7.a, b7.b, j.d);
                h5.c.g(byteArrayOutputStream, b8.getBytes(StandardCharsets.UTF_8).length);
                h5.c.g(byteArrayOutputStream, b7.h.length);
                h5.c.f(byteArrayOutputStream, (long)(size * 4), 4);
                h5.c.f(byteArrayOutputStream, b7.c, 4);
                byteArrayOutputStream.write(b8.getBytes(StandardCharsets.UTF_8));
                final Iterator iterator2 = b7.i.keySet().iterator();
                while (iterator2.hasNext()) {
                    h5.c.g(byteArrayOutputStream, (int)iterator2.next());
                    h5.c.g(byteArrayOutputStream, 0);
                }
                final int[] h = b7.h;
                for (int length3 = h.length, n12 = 0; n12 < length3; ++n12) {
                    h5.c.g(byteArrayOutputStream, h[n12]);
                }
            }
            return true;
        }
        final byte[] c = j.c;
        if (Arrays.equals(array, c)) {
            array = a(array2, c);
            h5.c.f(byteArrayOutputStream, (long)array2.length, 1);
            h5.c.f(byteArrayOutputStream, (long)array.length, 4);
            array = h5.c.a(array);
            h5.c.f(byteArrayOutputStream, (long)array.length, 4);
            byteArrayOutputStream.write(array);
            return true;
        }
        if (Arrays.equals(array, j.e)) {
            h5.c.g(byteArrayOutputStream, array2.length);
            for (final b b9 : array2) {
                final String b10 = b(b9.a, b9.b, j.e);
                h5.c.g(byteArrayOutputStream, b10.getBytes(StandardCharsets.UTF_8).length);
                h5.c.g(byteArrayOutputStream, b9.i.size());
                h5.c.g(byteArrayOutputStream, b9.h.length);
                h5.c.f(byteArrayOutputStream, b9.c, 4);
                byteArrayOutputStream.write(b10.getBytes(StandardCharsets.UTF_8));
                final Iterator iterator3 = b9.i.keySet().iterator();
                while (iterator3.hasNext()) {
                    h5.c.g(byteArrayOutputStream, (int)iterator3.next());
                }
                final int[] h2 = b9.h;
                for (int length5 = h2.length, n14 = 0; n14 < length5; ++n14) {
                    h5.c.g(byteArrayOutputStream, h2[n14]);
                }
            }
            return true;
        }
        return false;
    }
    
    public static void k(final ByteArrayOutputStream byteArrayOutputStream, final b b) throws IOException {
        final int[] h = b.h;
        final int length = h.length;
        int i = 0;
        int intValue = 0;
        while (i < length) {
            final Integer value = h[i];
            h5.c.g(byteArrayOutputStream, value - intValue);
            intValue = value;
            ++i;
        }
    }
    
    public static void l(final ByteArrayOutputStream byteArrayOutputStream, final b b, final String s) throws IOException {
        h5.c.g(byteArrayOutputStream, s.getBytes(StandardCharsets.UTF_8).length);
        h5.c.g(byteArrayOutputStream, b.e);
        h5.c.f(byteArrayOutputStream, (long)b.f, 4);
        h5.c.f(byteArrayOutputStream, b.c, 4);
        h5.c.f(byteArrayOutputStream, (long)b.g, 4);
        byteArrayOutputStream.write(s.getBytes(StandardCharsets.UTF_8));
    }
    
    public static void m(final ByteArrayOutputStream byteArrayOutputStream, final b b) throws IOException {
        final byte[] array = new byte[(b.b(b.g, 2, 8, -1) & 0xFFFFFFF8) / 8];
        for (final Map.Entry<Integer, V> entry : b.i.entrySet()) {
            final int intValue = entry.getKey();
            final int intValue2 = (int)entry.getValue();
            if ((intValue2 & 0x2) != 0x0) {
                final int c = c(2, intValue, b.g);
                final int n = c / 8;
                array[n] |= (byte)(1 << c % 8);
            }
            if ((intValue2 & 0x4) != 0x0) {
                final int c2 = c(4, intValue, b.g);
                final int n2 = c2 / 8;
                array[n2] |= (byte)(1 << c2 % 8);
            }
        }
        byteArrayOutputStream.write(array);
    }
    
    public static void n(final ByteArrayOutputStream byteArrayOutputStream, final b b) throws IOException {
        final Iterator iterator = b.i.entrySet().iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final Map.Entry<Integer, V> entry = (Map.Entry<Integer, V>)iterator.next();
            final int intValue = entry.getKey();
            if (((int)entry.getValue() & 0x1) == 0x0) {
                continue;
            }
            h5.c.g(byteArrayOutputStream, intValue - n);
            h5.c.g(byteArrayOutputStream, 0);
            n = intValue;
        }
    }
}
