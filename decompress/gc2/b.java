// 
// Decompiled by Procyon v0.6.0
// 

package gc2;

import java.util.Iterator;
import com.sendbird.android.shadow.okhttp3.internal.Internal;
import fc2.q$a;
import fc2.q;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import fc2.r;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.net.Socket;
import java.io.Closeable;
import java.util.concurrent.TimeUnit;
import java.net.InetAddress;
import java.util.Locale;
import java.net.IDN;
import java.io.IOException;
import rc2.e;
import java.util.Comparator;
import j$.util.DesugarTimeZone;
import fc2.t;
import fc2.x;
import com.sendbird.android.shadow.okio.a;
import java.util.regex.Pattern;
import java.lang.reflect.Method;
import java.util.TimeZone;
import java.nio.charset.Charset;
import com.sendbird.android.shadow.okio.ByteString;
import fc2.b0;

public final class b
{
    public static final byte[] a;
    public static final String[] b;
    public static final b0 c;
    public static final ByteString d;
    public static final ByteString e;
    public static final ByteString f;
    public static final ByteString g;
    public static final ByteString h;
    public static final Charset i;
    public static final Charset j;
    public static final Charset k;
    public static final Charset l;
    public static final Charset m;
    public static final TimeZone n;
    public static final b$a o;
    public static final Method p;
    public static final Pattern q;
    
    static {
        final byte[] array = a = new byte[0];
        b = new String[0];
        Object declaredMethod = new a();
        ((a)declaredMethod).write(array);
        final long n2 = 0;
        c = new b0(n2, (a)declaredMethod);
        Label_0214: {
            if ((n2 | n2) < 0L || n2 > n2 || n2 - n2 < n2) {
                break Label_0214;
            }
            declaredMethod = null;
            new x(0, (t)null, array);
            d = ByteString.decodeHex("efbbbf");
            e = ByteString.decodeHex("feff");
            f = ByteString.decodeHex("fffe");
            g = ByteString.decodeHex("0000ffff");
            h = ByteString.decodeHex("ffff0000");
            i = Charset.forName("UTF-8");
            Charset.forName("ISO-8859-1");
            j = Charset.forName("UTF-16BE");
            k = Charset.forName("UTF-16LE");
            l = Charset.forName("UTF-32BE");
            m = Charset.forName("UTF-32LE");
            n = DesugarTimeZone.getTimeZone("GMT");
            o = new Comparator<String>() {
                @Override
                public final int compare(final Object o, final Object o2) {
                    return ((String)o).compareTo((String)o2);
                }
            };
            while (true) {
                try {
                    declaredMethod = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
                    p = (Method)declaredMethod;
                    q = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
                    return;
                    throw new ArrayIndexOutOfBoundsException();
                }
                catch (final Exception ex) {
                    continue;
                }
                break;
            }
        }
    }
    
    public static AssertionError a(String s, final Exception ex) {
        s = (String)new AssertionError((Object)s);
        try {
            ((Throwable)s).initCause(ex);
            return (AssertionError)s;
        }
        catch (final IllegalStateException ex2) {
            return (AssertionError)s;
        }
    }
    
    public static Charset b(final e e, final Charset charset) throws IOException {
        final ByteString d = gc2.b.d;
        if (e.g(d)) {
            e.skip((long)d.size());
            return gc2.b.i;
        }
        final ByteString e2 = gc2.b.e;
        if (e.g(e2)) {
            e.skip((long)e2.size());
            return gc2.b.j;
        }
        final ByteString f = gc2.b.f;
        if (e.g(f)) {
            e.skip((long)f.size());
            return gc2.b.k;
        }
        final ByteString g = gc2.b.g;
        if (e.g(g)) {
            e.skip((long)g.size());
            return gc2.b.l;
        }
        final ByteString h = gc2.b.h;
        if (e.g(h)) {
            e.skip((long)h.size());
            return gc2.b.m;
        }
        return charset;
    }
    
    public static String c(String lowerCase) {
        final boolean contains = lowerCase.contains(":");
        final boolean b = true;
        int n = -1;
        final int n2 = 0;
        if (contains) {
            InetAddress inetAddress;
            if (lowerCase.startsWith("[") && lowerCase.endsWith("]")) {
                inetAddress = h(lowerCase, 1, lowerCase.length() - 1);
            }
            else {
                inetAddress = h(lowerCase, 0, lowerCase.length());
            }
            if (inetAddress == null) {
                return null;
            }
            final byte[] address = inetAddress.getAddress();
            if (address.length == 16) {
                int i = 0;
                int n3 = 0;
                while (i < address.length) {
                    int n4;
                    for (n4 = i; n4 < 16 && address[n4] == 0 && address[n4 + 1] == 0; n4 += 2) {}
                    final int n5 = n4 - i;
                    int n6 = n3;
                    int n7 = n;
                    if (n5 > n3) {
                        n6 = n3;
                        n7 = n;
                        if (n5 >= 4) {
                            n6 = n5;
                            n7 = i;
                        }
                    }
                    i = n4 + 2;
                    n3 = n6;
                    n = n7;
                }
                final a a = new a();
                int j = n2;
                while (j < address.length) {
                    if (j == n) {
                        a.A(58);
                        final int n8 = j + n3;
                        if ((j = n8) != 16) {
                            continue;
                        }
                        a.A(58);
                        j = n8;
                    }
                    else {
                        if (j > 0) {
                            a.A(58);
                        }
                        a.B((long)((address[j] & 0xFF) << 8 | (address[j + 1] & 0xFF)));
                        j += 2;
                    }
                }
                return a.s();
            }
            throw new AssertionError((Object)a.n("Invalid IPv6 address: '", lowerCase, "'"));
        }
        else {
            try {
                lowerCase = IDN.toASCII(lowerCase).toLowerCase(Locale.US);
                if (lowerCase.isEmpty()) {
                    return null;
                }
                int k = 0;
                while (true) {
                    while (k < lowerCase.length()) {
                        final char char1 = lowerCase.charAt(k);
                        int n9 = b ? 1 : 0;
                        if (char1 > '\u001f') {
                            if (char1 >= '\u007f') {
                                n9 = (b ? 1 : 0);
                            }
                            else {
                                if (" #%/:?@[\\]".indexOf(char1) == -1) {
                                    ++k;
                                    continue;
                                }
                                n9 = (b ? 1 : 0);
                            }
                        }
                        if (n9 != 0) {
                            return null;
                        }
                        return lowerCase;
                    }
                    int n9 = 0;
                    continue;
                }
            }
            catch (final IllegalArgumentException ex) {
                return null;
            }
        }
    }
    
    public static int d(long millis, final TimeUnit timeUnit) {
        final long n = lcmp(millis, 0L);
        if (n < 0) {
            throw new IllegalArgumentException("timeout < 0");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        millis = timeUnit.toMillis(millis);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("timeout too large.");
        }
        if (millis == 0L && n > 0) {
            throw new IllegalArgumentException("timeout too small.");
        }
        return (int)millis;
    }
    
    public static void e(final Closeable closeable) {
        if (closeable == null) {
            goto Label_0016;
        }
        try {
            closeable.close();
            goto Label_0016;
        }
        catch (final RuntimeException ex) {
            throw ex;
        }
        catch (final Exception ex2) {
            goto Label_0016;
        }
    }
    
    public static void f(final Socket socket) {
        if (socket == null) {
            goto Label_0027;
        }
        try {
            socket.close();
            goto Label_0027;
        }
        catch (final RuntimeException ex) {
            throw ex;
        }
        catch (final AssertionError assertionError) {
            if (q(assertionError)) {
                goto Label_0027;
            }
            throw assertionError;
        }
        catch (final Exception ex2) {
            goto Label_0027;
        }
    }
    
    public static int g(final char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        char c2 = 'a';
        if (c < 'a' || c > 'f') {
            c2 = 'A';
            if (c < 'A' || c > 'F') {
                return -1;
            }
        }
        return c - c2 + 10;
    }
    
    public static InetAddress h(final String s, int i, int n) {
        final byte[] array = new byte[16];
        int j = i;
        int n2 = -1;
        int n3 = -1;
        int n14;
    Label_0308_Outer:
        for (i = 0; j < n; j = i, i = n14) {
            if (i == 16) {
                return null;
            }
            final int n4 = j + 2;
            int n5;
            if (n4 <= n && s.regionMatches(j, "::", 0, 2)) {
                if (n2 != -1) {
                    return null;
                }
                i += 2;
                if (n4 == n) {
                    n2 = i;
                    break;
                }
                n2 = i;
                n3 = n4;
                n5 = i;
            }
            else {
                int n6 = j;
                if (i != 0) {
                    if (s.regionMatches(j, ":", 0, 1)) {
                        n6 = j + 1;
                    }
                    else {
                        if (!s.regionMatches(j, ".", 0, 1)) {
                            return null;
                        }
                        int n8;
                        final int n7 = n8 = i - 2;
                        int k = n3;
                    Label_0315:
                        while (true) {
                        Label_0308:
                            while (true) {
                                while (k < n) {
                                    Label_0160: {
                                        if (n8 != 16) {
                                            int n9 = k;
                                            if (n8 != n7) {
                                                if (s.charAt(k) != '.') {
                                                    break Label_0160;
                                                }
                                                n9 = k + 1;
                                            }
                                            int n10 = 0;
                                            for (k = n9; k < n; ++k) {
                                                final char char1 = s.charAt(k);
                                                if (char1 < '0') {
                                                    break;
                                                }
                                                if (char1 > '9') {
                                                    break;
                                                }
                                                if (n10 == 0 && n9 != k) {
                                                    break Label_0308;
                                                }
                                                n10 = n10 * 10 + char1 - 48;
                                                if (n10 > 255) {
                                                    break Label_0308;
                                                }
                                            }
                                            if (k - n9 != 0) {
                                                array[n8] = (byte)n10;
                                                ++n8;
                                                continue Label_0308_Outer;
                                            }
                                            n = 0;
                                            break Label_0315;
                                        }
                                    }
                                    n = 0;
                                    if (n == 0) {
                                        return null;
                                    }
                                    i += 2;
                                    break Label_0308_Outer;
                                }
                                if (n8 != n7 + 4) {
                                    continue Label_0308;
                                }
                                break;
                            }
                            n = 1;
                            continue Label_0315;
                        }
                    }
                }
                n3 = n6;
                n5 = i;
            }
            i = n3;
            int n11 = 0;
            while (i < n) {
                final int g = g(s.charAt(i));
                if (g == -1) {
                    break;
                }
                n11 = (n11 << 4) + g;
                ++i;
            }
            final int n12 = i - n3;
            if (n12 == 0 || n12 > 4) {
                return null;
            }
            final int n13 = n5 + 1;
            array[n5] = (byte)(n11 >>> 8 & 0xFF);
            n14 = n13 + 1;
            array[n13] = (byte)(n11 & 0xFF);
        }
        if (i != 16) {
            if (n2 == -1) {
                return null;
            }
            n = i - n2;
            System.arraycopy(array, n2, array, 16 - n, n);
            Arrays.fill(array, n2, 16 - i + n2, (byte)0);
        }
        try {
            return InetAddress.getByAddress(array);
        }
        catch (final UnknownHostException ex) {
            throw new AssertionError();
        }
    }
    
    public static int i(final String s, int i, final int n, final char c) {
        while (i < n) {
            if (s.charAt(i) == c) {
                return i;
            }
            ++i;
        }
        return n;
    }
    
    public static int j(final String s, int i, final int n, final String s2) {
        while (i < n) {
            if (s2.indexOf(s.charAt(i)) != -1) {
                return i;
            }
            ++i;
        }
        return n;
    }
    
    public static boolean k(final Object o, final Object o2) {
        return o == o2 || (o != null && o.equals(o2));
    }
    
    public static String l(final String s, final Object... array) {
        return String.format(Locale.US, s, array);
    }
    
    public static String m(final r r, final boolean b) {
        String s;
        if (r.d.contains(":")) {
            s = ph0.a.f(a.t("["), r.d, "]");
        }
        else {
            s = r.d;
        }
        if (!b) {
            final String string = s;
            if (r.e == r.c(r.a)) {
                return string;
            }
        }
        final StringBuilder q = android.support.v4.media.a.q(s, ":");
        q.append(r.e);
        return q.toString();
    }
    
    public static <T> List<T> n(final List<T> list) {
        return Collections.unmodifiableList((List<? extends T>)new ArrayList<T>((Collection<? extends T>)list));
    }
    
    public static <T> List<T> o(final T... array) {
        return Collections.unmodifiableList((List<? extends T>)Arrays.asList((T[])array.clone()));
    }
    
    public static String[] p(final Comparator<? super String> comparator, final String[] array, final String[] array2) {
        final ArrayList list = new ArrayList();
        for (final String s : array) {
            for (int length2 = array2.length, j = 0; j < length2; ++j) {
                if (comparator.compare(s, array2[j]) == 0) {
                    list.add(s);
                    break;
                }
            }
        }
        return list.toArray(new String[list.size()]);
    }
    
    public static boolean q(final AssertionError assertionError) {
        return assertionError.getCause() != null && assertionError.getMessage() != null && assertionError.getMessage().contains("getsockname failed");
    }
    
    public static boolean r(final Comparator<String> comparator, final String[] array, final String[] array2) {
        if (array != null && array2 != null && array.length != 0) {
            if (array2.length != 0) {
                for (final String s : array) {
                    for (int length2 = array2.length, j = 0; j < length2; ++j) {
                        if (comparator.compare(s, array2[j]) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    public static boolean s(final rc2.t t, final int n, final TimeUnit timeUnit) throws IOException {
        final long nanoTime = System.nanoTime();
        long n2;
        if (t.timeout().e()) {
            n2 = t.timeout().c() - nanoTime;
        }
        else {
            n2 = Long.MAX_VALUE;
        }
        t.timeout().d(Math.min(n2, timeUnit.toNanos(n)) + nanoTime);
        try {
            final a a = new a();
            while (t.m(a, 8192L) != -1L) {
                a.b();
            }
            return true;
        }
        catch (final InterruptedIOException ex) {
            return false;
        }
        finally {
            if (n2 == Long.MAX_VALUE) {
                t.timeout().a();
            }
            else {
                t.timeout().d(nanoTime + n2);
            }
        }
    }
    
    public static int t(final String s, int i, final int n) {
        while (i < n) {
            final char char1 = s.charAt(i);
            if (char1 != '\t' && char1 != '\n' && char1 != '\f' && char1 != '\r' && char1 != ' ') {
                return i;
            }
            ++i;
        }
        return n;
    }
    
    public static int u(final String s, final int n, int i) {
        --i;
        while (i >= n) {
            final char char1 = s.charAt(i);
            if (char1 != '\t' && char1 != '\n' && char1 != '\f' && char1 != '\r' && char1 != ' ') {
                return i + 1;
            }
            --i;
        }
        return n;
    }
    
    public static q v(final ArrayList list) {
        final q$a q$a = new q$a();
        for (final lc2.a a : list) {
            Internal.instance.addLenient(q$a, a.a.utf8(), a.b.utf8());
        }
        return new q(q$a);
    }
    
    public static String w(final String s, int t, final int n) {
        t = t(s, t, n);
        return s.substring(t, u(s, t, n));
    }
}
