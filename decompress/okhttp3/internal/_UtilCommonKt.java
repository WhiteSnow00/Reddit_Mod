// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal;

import tg2.g;
import fk2.c;
import fk2.f;
import kotlin.text.Regex;
import fk2.e0;
import kotlin.collections.builders.ListBuilder;
import mg2.a;
import dg2.v;
import java.util.Comparator;
import ng2.k;
import java.util.ArrayList;
import kotlin.collections.EmptyList;
import mg2.l;
import kotlin.text.b;
import java.util.Iterator;
import java.io.FileNotFoundException;
import java.io.IOException;
import fk2.y;
import fk2.j;
import java.util.Arrays;
import java.io.Closeable;
import ng2.e;
import java.util.List;
import okhttp3.MediaType;
import okhttp3.RequestBody$Companion;
import okio.ByteString$a;
import okio.ByteString;
import okhttp3.RequestBody;
import okhttp3.Headers;
import fk2.w;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u00ce\u0001\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001aI\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u001a\u0010\f\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\b0\nj\n\u0012\u0006\b\u0000\u0012\u00020\b`\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001aE\u0010\u0010\u001a\u00020\u000f*\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u001a\u0010\f\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\b0\nj\n\u0012\u0006\b\u0000\u0012\u00020\b`\u000bH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a9\u0010\u0013\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0012\u001a\u00020\b2\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\b0\nj\b\u0012\u0004\u0012\u00020\b`\u000bH\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a'\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0012\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a \u0010\u0019\u001a\u00020\u0003*\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u0003H\u0000\u001a \u0010\u001a\u001a\u00020\u0003*\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u0003H\u0000\u001a\u001e\u0010\u001b\u001a\u00020\b*\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u0003\u001a&\u0010\u001d\u001a\u00020\u0003*\u00020\b2\u0006\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u0003\u001a&\u0010\u001d\u001a\u00020\u0003*\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u0003\u001a\f\u0010 \u001a\u00020\u0003*\u00020\bH\u0000\u001a\u0010\u0010\"\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\bH\u0000\u001a\f\u0010#\u001a\u00020\u0003*\u00020\u001eH\u0000\u001a\u0015\u0010&\u001a\u00020\u0003*\u00020$2\u0006\u0010%\u001a\u00020\u0003H\u0080\u0004\u001a\u0015\u0010&\u001a\u00020\u0003*\u00020'2\u0006\u0010%\u001a\u00020\u0003H\u0080\u0004\u001a\u0015\u0010&\u001a\u00020(*\u00020\u00032\u0006\u0010%\u001a\u00020(H\u0080\u0004\u001a\u0014\u0010,\u001a\u00020+*\u00020)2\u0006\u0010*\u001a\u00020\u0003H\u0000\u001a\f\u0010.\u001a\u00020\u0003*\u00020-H\u0000\u001a\u001a\u00101\u001a\u00020+2\f\u00100\u001a\b\u0012\u0004\u0012\u00020+0/H\u0080\b\u00f8\u0001\u0000\u001a\u0014\u00104\u001a\u00020\u0003*\u0002022\u0006\u00103\u001a\u00020$H\u0000\u001a\u0016\u00105\u001a\u00020\u0003*\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\u0003H\u0000\u001a\u0012\u00107\u001a\u00020(*\u00020\b2\u0006\u00106\u001a\u00020(\u001a\u0016\u00108\u001a\u00020\u0003*\u0004\u0018\u00010\b2\u0006\u00106\u001a\u00020\u0003H\u0000\u001a\u000e\u0010;\u001a\u00020+*\u000609j\u0002`:\u001a\u0014\u0010?\u001a\u00020\u000f*\u00020<2\u0006\u0010>\u001a\u00020=H\u0000\u001a\u0014\u0010A\u001a\u00020+*\u00020<2\u0006\u0010@\u001a\u00020=H\u0000\u001a\u0014\u0010C\u001a\u00020+*\u00020<2\u0006\u0010B\u001a\u00020=H\u0000\u001a'\u0010G\u001a\u00020+\"\u0004\b\u0000\u0010D*\b\u0012\u0004\u0012\u00028\u00000E2\u0006\u0010F\u001a\u00028\u0000H\u0000¢\u0006\u0004\bG\u0010H\u001a\"\u0010N\u001a\u00020M*\u00060Ij\u0002`J2\u0010\u0010L\u001a\f\u0012\b\u0012\u00060Ij\u0002`J0KH\u0000\u001a6\u0010S\u001a\b\u0012\u0004\u0012\u00028\u00000K\"\u0004\b\u0000\u0010O*\b\u0012\u0004\u0012\u00028\u00000P2\u0012\u0010R\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0QH\u0080\b\u00f8\u0001\u0000\u001a \u0010W\u001a\u00020+2\u0006\u0010T\u001a\u00020(2\u0006\u0010U\u001a\u00020(2\u0006\u0010V\u001a\u00020(H\u0000\u001a0\u0010Y\u001a\b\u0012\u0004\u0012\u00028\u00000K\"\u0004\b\u0000\u0010O2\f\u0010X\u001a\b\u0012\u0004\u0012\u00028\u00000P2\f\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000PH\u0000\"\u0014\u0010[\u001a\u00020Z8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b[\u0010\\\"\u0014\u0010]\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b]\u0010^\"\u0017\u0010`\u001a\u00020_8\u0006¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0017\u0010e\u001a\u00020d8\u0006¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u001a\u0010j\u001a\u00020i8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006n" }, d2 = { "Lkotlin/text/Regex;", "", "input", "", "index", "Lxi2/e;", "matchAtPolyfill", "", "", "other", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "intersect", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)[Ljava/lang/String;", "", "hasIntersection", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z", "value", "indexOf", "([Ljava/lang/String;Ljava/lang/String;Ljava/util/Comparator;)I", "concat", "([Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;", "startIndex", "endIndex", "indexOfFirstNonAsciiWhitespace", "indexOfLastNonAsciiWhitespace", "trimSubstring", "delimiters", "delimiterOffset", "", "delimiter", "indexOfControlOrNonAscii", "name", "isSensitiveHeader", "parseHexDigit", "", "mask", "and", "", "", "Lfk2/e;", "medium", "Lcg2/j;", "writeMedium", "Lfk2/f;", "readMedium", "Lkotlin/Function0;", "block", "ignoreIoExceptions", "Lfk2/c;", "b", "skipAll", "indexOfNonWhitespace", "defaultValue", "toLongOrDefault", "toNonNegativeInt", "Ljava/io/Closeable;", "Lokio/Closeable;", "closeQuietly", "Lfk2/j;", "Lfk2/y;", "file", "isCivilized", "path", "deleteIfExists", "directory", "deleteContents", "E", "", "element", "addIfAbsent", "(Ljava/util/List;Ljava/lang/Object;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "suppressed", "", "withSuppressed", "T", "", "Lkotlin/Function1;", "predicate", "filterList", "arrayLength", "offset", "count", "checkOffsetAndCount", "a", "interleave", "", "EMPTY_BYTE_ARRAY", "[B", "userAgent", "Ljava/lang/String;", "Lokhttp3/Headers;", "commonEmptyHeaders", "Lokhttp3/Headers;", "getCommonEmptyHeaders", "()Lokhttp3/Headers;", "Lokhttp3/RequestBody;", "commonEmptyRequestBody", "Lokhttp3/RequestBody;", "getCommonEmptyRequestBody", "()Lokhttp3/RequestBody;", "Lfk2/w;", "UNICODE_BOMS", "Lfk2/w;", "getUNICODE_BOMS", "()Lfk2/w;", "okhttp" }, k = 2, mv = { 1, 6, 0 })
public final class _UtilCommonKt
{
    public static final byte[] EMPTY_BYTE_ARRAY;
    private static final w UNICODE_BOMS;
    private static final Headers commonEmptyHeaders;
    private static final RequestBody commonEmptyRequestBody;
    public static final String userAgent = "okhttp/5.0.0-alpha.6";
    
    static {
        final byte[] array = EMPTY_BYTE_ARRAY = new byte[0];
        ByteString.Companion.getClass();
        UNICODE_BOMS = w.a.b(ByteString$a.b("efbbbf"), ByteString$a.b("feff"), ByteString$a.b("fffe"), ByteString$a.b("0000ffff"), ByteString$a.b("ffff0000"));
        commonEmptyHeaders = Headers.Companion.of(new String[0]);
        commonEmptyRequestBody = RequestBody$Companion.create$default(RequestBody.Companion, array, (MediaType)null, 0, 0, 7, (Object)null);
    }
    
    public static final <E> void addIfAbsent(final List<E> list, final E e) {
        e.f((Object)list, "<this>");
        if (!list.contains(e)) {
            list.add(e);
        }
    }
    
    public static final int and(final byte b, final int n) {
        return b & n;
    }
    
    public static final int and(final short n, final int n2) {
        return n & n2;
    }
    
    public static final long and(final int n, final long n2) {
        return (long)n & n2;
    }
    
    public static final void checkOffsetAndCount(final long n, final long n2, final long n3) {
        if ((n2 | n3) >= 0L && n2 <= n && n - n2 >= n3) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("length=");
        sb.append(n);
        sb.append(", offset=");
        sb.append(n2);
        sb.append(", count=");
        sb.append(n2);
        throw new ArrayIndexOutOfBoundsException(sb.toString());
    }
    
    public static final void closeQuietly(final Closeable closeable) {
        e.f((Object)closeable, "<this>");
        try {
            closeable.close();
        }
        catch (final RuntimeException ex) {
            throw ex;
        }
        catch (final Exception ex2) {}
    }
    
    public static final String[] concat(String[] array, final String s) {
        e.f((Object)array, "<this>");
        e.f((Object)s, "value");
        final String[] copy = Arrays.copyOf(array, array.length + 1);
        e.e((Object)copy, "copyOf(this, newSize)");
        array = copy;
        array[array.length - 1] = s;
        return array;
    }
    
    public static final void deleteContents(final j j, y y) {
        e.f((Object)j, "<this>");
        e.f((Object)y, "directory");
        try {
            final Iterator<y> iterator = j.list(y).iterator();
            y = null;
            while (iterator.hasNext()) {
                final y y2 = iterator.next();
                try {
                    if (j.metadata(y2).b) {
                        deleteContents(j, y2);
                    }
                    j.delete(y2);
                }
                catch (final IOException y3) {
                    if (y != null) {
                        continue;
                    }
                    y = y3;
                }
            }
            if (y == null) {
                return;
            }
            throw y;
        }
        catch (final FileNotFoundException ex) {}
    }
    
    public static final void deleteIfExists(final j j, final y y) {
        e.f((Object)j, "<this>");
        e.f((Object)y, "path");
        try {
            j.delete(y);
        }
        catch (final FileNotFoundException ex) {}
    }
    
    public static final int delimiterOffset(final String s, final char c, int i, final int n) {
        e.f((Object)s, "<this>");
        while (i < n) {
            if (s.charAt(i) == c) {
                return i;
            }
            ++i;
        }
        return n;
    }
    
    public static final int delimiterOffset(final String s, final String s2, int i, final int n) {
        e.f((Object)s, "<this>");
        e.f((Object)s2, "delimiters");
        while (i < n) {
            if (b.K0((CharSequence)s2, s.charAt(i))) {
                return i;
            }
            ++i;
        }
        return n;
    }
    
    public static int delimiterOffset$default(final String s, final char c, int n, int length, final int n2, final Object o) {
        if ((n2 & 0x2) != 0x0) {
            n = 0;
        }
        if ((n2 & 0x4) != 0x0) {
            length = s.length();
        }
        return delimiterOffset(s, c, n, length);
    }
    
    public static int delimiterOffset$default(final String s, final String s2, int n, int length, final int n2, final Object o) {
        if ((n2 & 0x2) != 0x0) {
            n = 0;
        }
        if ((n2 & 0x4) != 0x0) {
            length = s.length();
        }
        return delimiterOffset(s, s2, n, length);
    }
    
    public static final <T> List<T> filterList(final Iterable<? extends T> iterable, final l<? super T, Boolean> l) {
        e.f((Object)iterable, "<this>");
        e.f((Object)l, "predicate");
        Object instance = EmptyList.INSTANCE;
        for (final T next : iterable) {
            if (l.invoke((Object)next)) {
                Object o = instance;
                if (((List)instance).isEmpty()) {
                    o = new ArrayList();
                }
                k.b((List)o);
                ((List)o).add(next);
                instance = o;
            }
        }
        return (List<T>)instance;
    }
    
    public static final Headers getCommonEmptyHeaders() {
        return _UtilCommonKt.commonEmptyHeaders;
    }
    
    public static final RequestBody getCommonEmptyRequestBody() {
        return _UtilCommonKt.commonEmptyRequestBody;
    }
    
    public static final w getUNICODE_BOMS() {
        return _UtilCommonKt.UNICODE_BOMS;
    }
    
    public static final boolean hasIntersection(final String[] array, final String[] array2, final Comparator<? super String> comparator) {
        e.f((Object)array, "<this>");
        e.f((Object)comparator, "comparator");
        if (array.length != 0 && array2 != null) {
            if (array2.length != 0) {
                final int length = array.length;
                int i = 0;
            Label_0058:
                while (i < length) {
                    final String s = array[i];
                    final int n = i + 1;
                    final v o0 = ah0.b.O0((Object[])array2);
                    do {
                        i = n;
                        if (o0.hasNext()) {
                            continue;
                        }
                        continue Label_0058;
                    } while (comparator.compare(s, (String)o0.next()) != 0);
                    return true;
                }
            }
        }
        return false;
    }
    
    public static final void ignoreIoExceptions(final a<cg2.j> a) {
        e.f((Object)a, "block");
        try {
            a.invoke();
        }
        catch (final IOException ex) {}
    }
    
    public static final int indexOf(final String[] array, final String s, final Comparator<String> comparator) {
        e.f((Object)array, "<this>");
        e.f((Object)s, "value");
        e.f((Object)comparator, "comparator");
        for (int length = array.length, i = 0; i < length; ++i) {
            if (comparator.compare(array[i], s) == 0) {
                return i;
            }
        }
        return -1;
    }
    
    public static final int indexOfControlOrNonAscii(final String s) {
        e.f((Object)s, "<this>");
        for (int length = s.length(), i = 0; i < length; ++i) {
            final char char1 = s.charAt(i);
            if (e.h((int)char1, 31) <= 0 || e.h((int)char1, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }
    
    public static final int indexOfFirstNonAsciiWhitespace(final String s, int i, final int n) {
        e.f((Object)s, "<this>");
        while (i < n) {
            final char char1 = s.charAt(i);
            final int n2 = 0;
            int n3 = 0;
            Label_0109: {
                if (char1 != '\t' && char1 != '\n' && char1 != '\f' && char1 != '\r') {
                    n3 = n2;
                    if (char1 != ' ') {
                        break Label_0109;
                    }
                }
                n3 = 1;
            }
            if (n3 == 0) {
                return i;
            }
            ++i;
        }
        return n;
    }
    
    public static int indexOfFirstNonAsciiWhitespace$default(final String s, int n, int length, final int n2, final Object o) {
        if ((n2 & 0x1) != 0x0) {
            n = 0;
        }
        if ((n2 & 0x2) != 0x0) {
            length = s.length();
        }
        return indexOfFirstNonAsciiWhitespace(s, n, length);
    }
    
    public static final int indexOfLastNonAsciiWhitespace(final String s, final int n, int n2) {
        e.f((Object)s, "<this>");
        --n2;
        if (n <= n2) {
            while (true) {
                final char char1 = s.charAt(n2);
                final int n3 = 0;
                int n4 = 0;
                Label_0112: {
                    if (char1 != '\t' && char1 != '\n' && char1 != '\f' && char1 != '\r') {
                        n4 = n3;
                        if (char1 != ' ') {
                            break Label_0112;
                        }
                    }
                    n4 = 1;
                }
                if (n4 == 0) {
                    return n2 + 1;
                }
                if (n2 == n) {
                    break;
                }
                --n2;
            }
        }
        return n;
    }
    
    public static int indexOfLastNonAsciiWhitespace$default(final String s, int n, int length, final int n2, final Object o) {
        if ((n2 & 0x1) != 0x0) {
            n = 0;
        }
        if ((n2 & 0x2) != 0x0) {
            length = s.length();
        }
        return indexOfLastNonAsciiWhitespace(s, n, length);
    }
    
    public static final int indexOfNonWhitespace(final String s, int i) {
        e.f((Object)s, "<this>");
        while (i < s.length()) {
            final char char1 = s.charAt(i);
            if (char1 != ' ' && char1 != '\t') {
                return i;
            }
            ++i;
        }
        return s.length();
    }
    
    public static int indexOfNonWhitespace$default(final String s, int n, final int n2, final Object o) {
        if ((n2 & 0x1) != 0x0) {
            n = 0;
        }
        return indexOfNonWhitespace(s, n);
    }
    
    public static final <T> List<T> interleave(final Iterable<? extends T> iterable, final Iterable<? extends T> iterable2) {
        e.f((Object)iterable, "a");
        e.f((Object)iterable2, "b");
        final Iterator<? extends T> iterator = iterable.iterator();
        final Iterator<? extends T> iterator2 = iterable2.iterator();
        final ListBuilder listBuilder = new ListBuilder();
        while (iterator.hasNext() || iterator2.hasNext()) {
            if (iterator.hasNext()) {
                ((List<Object>)listBuilder).add(iterator.next());
            }
            if (iterator2.hasNext()) {
                ((List<Object>)listBuilder).add(iterator2.next());
            }
        }
        return listBuilder.build();
    }
    
    public static final String[] intersect(final String[] array, final String[] array2, final Comparator<? super String> comparator) {
        e.f((Object)array, "<this>");
        e.f((Object)array2, "other");
        e.f((Object)comparator, "comparator");
        final ArrayList list = new ArrayList();
        final int length = array.length;
        int i = 0;
    Label_0035:
        while (i < length) {
            final String s = array[i];
            final int n = i + 1;
            final int length2 = array2.length;
            int n2 = 0;
            String s2;
            do {
                i = n;
                if (n2 >= length2) {
                    continue Label_0035;
                }
                s2 = array2[n2];
                ++n2;
            } while (comparator.compare(s, s2) != 0);
            list.add(s);
            i = n;
        }
        final Object[] array3 = list.toArray(new String[0]);
        if (array3 != null) {
            return (String[])array3;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }
    
    public static final boolean isCivilized(final j j, final y y) {
        e.f((Object)j, "<this>");
        e.f((Object)y, "file");
        final e0 sink = j.sink(y);
        cg2.j a = null;
        Label_0043: {
            try {
                try {
                    j.delete(y);
                    return true;
                }
                finally {}
            }
            catch (final IOException ex) {
                a = cg2.j.a;
                break Label_0043;
            }
            a = null;
        }
        Throwable t = null;
        if (sink != null) {
            try {
                sink.close();
            }
            finally {
                if (t == null) {
                    final Throwable t2;
                    t = t2;
                }
                else {
                    final Throwable t2;
                    xd.a.t(t, t2);
                }
            }
        }
        if (t == null) {
            e.c((Object)a);
            j.delete(y);
            return false;
        }
    }
    
    public static final boolean isSensitiveHeader(final String s) {
        e.f((Object)s, "name");
        boolean b2;
        final boolean b = b2 = true;
        if (!xi2.j.z0(s, "Authorization", true)) {
            b2 = b;
            if (!xi2.j.z0(s, "Cookie", true)) {
                b2 = b;
                if (!xi2.j.z0(s, "Proxy-Authorization", true)) {
                    b2 = (xi2.j.z0(s, "Set-Cookie", true) && b);
                }
            }
        }
        return b2;
    }
    
    public static final xi2.e matchAtPolyfill(final Regex regex, final CharSequence charSequence, final int n) {
        e.f((Object)regex, "<this>");
        e.f((Object)charSequence, "input");
        final xi2.e find = regex.find(charSequence, n);
        if (find == null) {
            return null;
        }
        if (((g)find.d()).f != n) {
            return null;
        }
        return find;
    }
    
    public static final int parseHexDigit(char c) {
        final int n = 1;
        if ('0' <= c && c < ':') {
            c -= 48;
        }
        else {
            final char c2 = 'a';
            char c3;
            if ('a' <= c && c < 'g') {
                c3 = c2;
            }
            else {
                final char c4 = 'A';
                int n2;
                if ('A' <= c && c < 'G') {
                    n2 = n;
                }
                else {
                    n2 = 0;
                }
                if (n2 == 0) {
                    c = (char)(-1);
                    return c;
                }
                c3 = c4;
            }
            c = (char)(c - c3 + 10);
        }
        return c;
    }
    
    public static final int readMedium(final f f) throws IOException {
        e.f((Object)f, "<this>");
        return and(f.readByte(), 255) | (and(f.readByte(), 255) << 16 | and(f.readByte(), 255) << 8);
    }
    
    public static final int skipAll(final c c, final byte b) {
        e.f((Object)c, "<this>");
        int n = 0;
        while (!c.e1() && c.s(0L) == b) {
            ++n;
            c.readByte();
        }
        return n;
    }
    
    public static final long toLongOrDefault(final String s, long long1) {
        e.f((Object)s, "<this>");
        try {
            long1 = Long.parseLong(s);
            return long1;
        }
        catch (final NumberFormatException ex) {
            return long1;
        }
    }
    
    public static final int toNonNegativeInt(final String s, int n) {
        Label_0017: {
            if (s == null) {
                final Long value = null;
                break Label_0017;
            }
            try {
                final Long value = Long.parseLong(s);
                if (value == null) {
                    return n;
                }
                final long longValue = value;
                if (longValue > 2147483647L) {
                    n = Integer.MAX_VALUE;
                }
                else if (longValue < 0L) {
                    n = 0;
                }
                else {
                    n = (int)longValue;
                }
                return n;
            }
            catch (final NumberFormatException ex) {
                return n;
            }
        }
    }
    
    public static final String trimSubstring(String substring, int indexOfFirstNonAsciiWhitespace, final int n) {
        e.f((Object)substring, "<this>");
        indexOfFirstNonAsciiWhitespace = indexOfFirstNonAsciiWhitespace(substring, indexOfFirstNonAsciiWhitespace, n);
        substring = substring.substring(indexOfFirstNonAsciiWhitespace, indexOfLastNonAsciiWhitespace(substring, indexOfFirstNonAsciiWhitespace, n));
        e.e((Object)substring, "this as java.lang.String\u2026ing(startIndex, endIndex)");
        return substring;
    }
    
    public static String trimSubstring$default(final String s, int n, int length, final int n2, final Object o) {
        if ((n2 & 0x1) != 0x0) {
            n = 0;
        }
        if ((n2 & 0x2) != 0x0) {
            length = s.length();
        }
        return trimSubstring(s, n, length);
    }
    
    public static final Throwable withSuppressed(final Exception ex, final List<? extends Exception> list) {
        e.f((Object)ex, "<this>");
        e.f((Object)list, "suppressed");
        final Iterator<? extends Exception> iterator = list.iterator();
        while (iterator.hasNext()) {
            xd.a.t((Throwable)ex, (Throwable)iterator.next());
        }
        return ex;
    }
    
    public static final void writeMedium(final fk2.e e, final int n) throws IOException {
        e.f((Object)e, "<this>");
        e.writeByte(n >>> 16 & 0xFF);
        e.writeByte(n >>> 8 & 0xFF);
        e.writeByte(n & 0xFF);
    }
}
