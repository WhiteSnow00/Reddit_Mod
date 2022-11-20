// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import okhttp3.Headers$Builder;
import java.util.Iterator;
import tg2.i;
import dg2.w;
import java.util.ArrayList;
import dg2.m;
import okhttp3.internal.http2.Header;
import cg2.j;
import java.util.concurrent.ThreadFactory;
import java.io.InterruptedIOException;
import fk2.c;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.net.SocketAddress;
import java.net.InetSocketAddress;
import java.net.SocketTimeoutException;
import fk2.f;
import java.util.Collections;
import cg.d;
import java.util.List;
import okhttp3.Response;
import java.util.Arrays;
import java.util.Locale;
import java.io.IOException;
import fk2.g0;
import java.net.Socket;
import java.net.ServerSocket;
import java.util.concurrent.TimeUnit;
import okhttp3.HttpUrl;
import gb2.a;
import okhttp3.EventListener$Factory;
import okhttp3.Call;
import okhttp3.EventListener;
import kotlin.text.b;
import okhttp3.OkHttpClient;
import ng2.e;
import j$.util.DesugarTimeZone;
import okhttp3.MediaType;
import okhttp3.ResponseBody$Companion;
import java.util.TimeZone;
import okhttp3.ResponseBody;
import okhttp3.RequestBody;
import okhttp3.Headers;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000²\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u0016\u0010\b\u001a\u00020\u0000*\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0002H\u0000\u001a)\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n\"\u00020\u000b¢\u0006\u0004\b\t\u0010\r\u001a\u0014\u0010\u0011\u001a\u00020\u000f*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000\u001a\"\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0000\u001a\u0012\u0010\u001b\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0000\u001a\u0012\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018*\u00020\u001aH\u0000\u001a\u0014\u0010\u001e\u001a\u00020\u0002*\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006H\u0000\u001a\f\u0010!\u001a\u00020 *\u00020\u001fH\u0000\u001a\u001c\u0010$\u001a\u00020\u0002*\u00020\"2\u0006\u0010\u0013\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u0014H\u0000\u001a\u001c\u0010&\u001a\u00020\u0002*\u00020\"2\u0006\u0010%\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u0014H\u0000\u001a\n\u0010(\u001a\u00020\u0000*\u00020'\u001a\u0014\u0010*\u001a\u00020\u0002*\u00020'2\u0006\u0010)\u001a\u00020\u000eH\u0000\u001a\"\u0010.\u001a\u00020,2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+H\u0080\b\u00f8\u0001\u0000\u001a\f\u00100\u001a\u00020\u0012*\u00020/H\u0000\u001a\u001c\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018\"\u0004\b\u0000\u00101*\b\u0012\u0004\u0012\u00028\u00000\u0018\u001a/\u00104\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018\"\u0004\b\u0000\u001012\u0012\u00103\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n\"\u00028\u0000H\u0007¢\u0006\u0004\b4\u00105\u001a0\u00109\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000108\"\u0004\b\u0000\u00106\"\u0004\b\u0001\u00107*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000108H\u0000\u001a\f\u0010:\u001a\u00020,*\u00020'H\u0000\u001a\n\u0010:\u001a\u00020,*\u00020;\u001a\f\u0010<\u001a\u00020\u0000*\u00020\u0012H\u0000\u001a\f\u0010<\u001a\u00020\u0000*\u00020\u0016H\u0000\u001a\r\u0010=\u001a\u00020,*\u00020\u000bH\u0080\b\u001a\r\u0010>\u001a\u00020,*\u00020\u000bH\u0080\b\u001a\r\u0010?\u001a\u00020,*\u00020\u000bH\u0080\b\u001a5\u0010D\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u001012\u0006\u0010@\u001a\u00020\u000b2\f\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000A2\u0006\u0010C\u001a\u00020\u0000H\u0000¢\u0006\u0004\bD\u0010E\u001a\r\u0010F\u001a\u00020,*\u00020\u000bH\u0080\b\u001a\r\u0010G\u001a\u00020,*\u00020\u000bH\u0080\b\"\u0014\u0010H\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bH\u0010I\"\u0014\u0010K\u001a\u00020J8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bK\u0010L\"\u0014\u0010N\u001a\u00020M8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bN\u0010O\"\u0014\u0010Q\u001a\u00020P8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\bQ\u0010R\"\u0014\u0010S\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\bS\u0010T\"\u0014\u0010U\u001a\u00020\u00008\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\bU\u0010V*\n\u0010W\"\u00020\u00062\u00020\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006X" }, d2 = { "", "name", "", "daemon", "Ljava/util/concurrent/ThreadFactory;", "threadFactory", "Lokhttp3/HttpUrl;", "includeDefaultPort", "toHostHeader", "format", "", "", "args", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "Lfk2/f;", "Ljava/nio/charset/Charset;", "default", "readBomAsCharset", "", "duration", "Ljava/util/concurrent/TimeUnit;", "unit", "", "checkDuration", "", "Lokhttp3/internal/http2/Header;", "Lokhttp3/Headers;", "toHeaders", "toHeaderList", "other", "canReuseConnectionFor", "Lokhttp3/EventListener;", "Lokhttp3/EventListener$Factory;", "asFactory", "Lfk2/g0;", "timeUnit", "skipAll", "timeout", "discard", "Ljava/net/Socket;", "peerName", "source", "isHealthy", "Lkotlin/Function0;", "Lcg2/j;", "block", "threadName", "Lokhttp3/Response;", "headersContentLength", "T", "toImmutableList", "elements", "immutableListOf", "([Ljava/lang/Object;)Ljava/util/List;", "K", "V", "", "toImmutableMap", "closeQuietly", "Ljava/net/ServerSocket;", "toHexString", "wait", "notify", "notifyAll", "instance", "Ljava/lang/Class;", "fieldType", "fieldName", "readFieldOrNull", "(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;", "assertThreadHoldsLock", "assertThreadDoesntHoldLock", "EMPTY_HEADERS", "Lokhttp3/Headers;", "Lokhttp3/RequestBody;", "EMPTY_REQUEST", "Lokhttp3/RequestBody;", "Lokhttp3/ResponseBody;", "EMPTY_RESPONSE", "Lokhttp3/ResponseBody;", "Ljava/util/TimeZone;", "UTC", "Ljava/util/TimeZone;", "assertionsEnabled", "Z", "okHttpName", "Ljava/lang/String;", "HttpUrlRepresentation", "okhttp" }, k = 2, mv = { 1, 6, 0 })
public final class _UtilJvmKt
{
    public static final Headers EMPTY_HEADERS;
    public static final RequestBody EMPTY_REQUEST;
    public static final ResponseBody EMPTY_RESPONSE;
    public static final TimeZone UTC;
    public static final boolean assertionsEnabled;
    public static final String okHttpName;
    
    static {
        EMPTY_HEADERS = _UtilCommonKt.getCommonEmptyHeaders();
        EMPTY_REQUEST = _UtilCommonKt.getCommonEmptyRequestBody();
        EMPTY_RESPONSE = ResponseBody$Companion.create$default(ResponseBody.Companion, _UtilCommonKt.EMPTY_BYTE_ARRAY, (MediaType)null, 1, (Object)null);
        final TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
        e.c((Object)timeZone);
        UTC = timeZone;
        assertionsEnabled = false;
        okHttpName = b.c1("Client", b.b1((CharSequence)"okhttp3.", OkHttpClient.class.getName()));
    }
    
    public static EventListener a(final EventListener eventListener, final Call call) {
        return asFactory$lambda-7(eventListener, call);
    }
    
    public static final EventListener$Factory asFactory(final EventListener eventListener) {
        e.f((Object)eventListener, "<this>");
        return (EventListener$Factory)new a((Object)eventListener);
    }
    
    private static final EventListener asFactory$lambda-7(final EventListener eventListener, final Call call) {
        e.f((Object)eventListener, "$this_asFactory");
        e.f((Object)call, "it");
        return eventListener;
    }
    
    public static final void assertThreadDoesntHoldLock(final Object o) {
        e.f(o, "<this>");
        if (_UtilJvmKt.assertionsEnabled && Thread.holdsLock(o)) {
            final StringBuilder t = a.t("Thread ");
            t.append((Object)Thread.currentThread().getName());
            t.append(" MUST NOT hold lock on ");
            t.append(o);
            throw new AssertionError((Object)t.toString());
        }
    }
    
    public static final void assertThreadHoldsLock(final Object o) {
        e.f(o, "<this>");
        if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(o)) {
            final StringBuilder t = a.t("Thread ");
            t.append((Object)Thread.currentThread().getName());
            t.append(" MUST hold lock on ");
            t.append(o);
            throw new AssertionError((Object)t.toString());
        }
    }
    
    public static Thread b(final String s, final boolean b, final Runnable runnable) {
        return threadFactory$lambda-1(s, b, runnable);
    }
    
    public static final boolean canReuseConnectionFor(final HttpUrl httpUrl, final HttpUrl httpUrl2) {
        e.f((Object)httpUrl, "<this>");
        e.f((Object)httpUrl2, "other");
        return e.a((Object)httpUrl.host(), (Object)httpUrl2.host()) && httpUrl.port() == httpUrl2.port() && e.a((Object)httpUrl.scheme(), (Object)httpUrl2.scheme());
    }
    
    public static final int checkDuration(final String s, long millis, final TimeUnit timeUnit) {
        e.f((Object)s, "name");
        final long n = lcmp(millis, 0L);
        final boolean b = true;
        if (n < 0) {
            throw new IllegalStateException(e.l((Object)" < 0", s).toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null".toString());
        }
        millis = timeUnit.toMillis(millis);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException(e.l((Object)" too large.", s).toString());
        }
        int n2 = b ? 1 : 0;
        if (millis == 0L) {
            if (n <= 0) {
                n2 = (b ? 1 : 0);
            }
            else {
                n2 = 0;
            }
        }
        if (n2 != 0) {
            return (int)millis;
        }
        throw new IllegalArgumentException(e.l((Object)" too small.", s).toString());
    }
    
    public static final void closeQuietly(final ServerSocket serverSocket) {
        e.f((Object)serverSocket, "<this>");
        try {
            serverSocket.close();
        }
        catch (final RuntimeException ex) {
            throw ex;
        }
        catch (final Exception ex2) {}
    }
    
    public static final void closeQuietly(final Socket socket) {
        e.f((Object)socket, "<this>");
        try {
            socket.close();
        }
        catch (final RuntimeException ex) {
            if (e.a((Object)ex.getMessage(), (Object)"bio == null")) {
                return;
            }
            throw ex;
        }
        catch (final AssertionError assertionError) {
            throw assertionError;
        }
        catch (final Exception ex2) {}
    }
    
    public static final boolean discard(final g0 g0, final int n, final TimeUnit timeUnit) {
        e.f((Object)g0, "<this>");
        e.f((Object)timeUnit, "timeUnit");
        boolean skipAll;
        try {
            skipAll = skipAll(g0, n, timeUnit);
        }
        catch (final IOException ex) {
            skipAll = false;
        }
        return skipAll;
    }
    
    public static final String format(String format, Object... copy) {
        e.f((Object)format, "format");
        e.f((Object)copy, "args");
        final Locale us = Locale.US;
        copy = Arrays.copyOf(copy, copy.length);
        format = String.format(us, format, Arrays.copyOf(copy, copy.length));
        e.e((Object)format, "format(locale, format, *args)");
        return format;
    }
    
    public static final long headersContentLength(final Response response) {
        e.f((Object)response, "<this>");
        final String value = response.headers().get("Content-Length");
        long longOrDefault = -1L;
        if (value != null) {
            longOrDefault = _UtilCommonKt.toLongOrDefault(value, -1L);
        }
        return longOrDefault;
    }
    
    @SafeVarargs
    public static final <T> List<T> immutableListOf(final T... array) {
        e.f((Object)array, "elements");
        final T[] array2 = array.clone();
        final List<Object> unmodifiableList = Collections.unmodifiableList((List<?>)d.m3((Object[])Arrays.copyOf(array2, array2.length)));
        e.e((Object)unmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return (List<T>)unmodifiableList;
    }
    
    public static final boolean isHealthy(final Socket socket, final f f) {
        e.f((Object)socket, "<this>");
        e.f((Object)f, "source");
        try {
            final int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                f.e1();
                socket.setSoTimeout(soTimeout);
            }
            finally {
                socket.setSoTimeout(soTimeout);
            }
        }
        catch (final IOException ex) {}
        catch (final SocketTimeoutException ex2) {
            goto Label_0057;
        }
    }
    
    public static final void notify(final Object o) {
        e.f(o, "<this>");
        o.notify();
    }
    
    public static final void notifyAll(final Object o) {
        e.f(o, "<this>");
        o.notifyAll();
    }
    
    public static final String peerName(final Socket socket) {
        e.f((Object)socket, "<this>");
        final SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
        String s;
        if (remoteSocketAddress instanceof InetSocketAddress) {
            s = ((InetSocketAddress)remoteSocketAddress).getHostName();
            e.e((Object)s, "address.hostName");
        }
        else {
            s = remoteSocketAddress.toString();
        }
        return s;
    }
    
    public static final Charset readBomAsCharset(final f f, Charset charset) throws IOException {
        e.f((Object)f, "<this>");
        e.f((Object)charset, "default");
        final int q1 = f.Q1(_UtilCommonKt.getUNICODE_BOMS());
        if (q1 != -1) {
            if (q1 != 0) {
                if (q1 != 1) {
                    if (q1 != 2) {
                        Charset charset2;
                        if (q1 != 3) {
                            if (q1 != 4) {
                                throw new AssertionError();
                            }
                            xi2.a.a.getClass();
                            charset = xi2.a.g;
                            if ((charset2 = charset) == null) {
                                charset2 = Charset.forName("UTF-32LE");
                                e.e((Object)charset2, "forName(\"UTF-32LE\")");
                                xi2.a.g = charset2;
                            }
                        }
                        else {
                            xi2.a.a.getClass();
                            charset = xi2.a.h;
                            if ((charset2 = charset) == null) {
                                charset2 = Charset.forName("UTF-32BE");
                                e.e((Object)charset2, "forName(\"UTF-32BE\")");
                                xi2.a.h = charset2;
                            }
                        }
                        charset = charset2;
                    }
                    else {
                        charset = xi2.a.d;
                    }
                }
                else {
                    charset = xi2.a.c;
                }
            }
            else {
                charset = xi2.a.b;
            }
        }
        return charset;
    }
    
    public static final <T> T readFieldOrNull(Object o, final Class<T> clazz, final String s) {
        e.f(o, "instance");
        e.f((Object)clazz, "fieldType");
        e.f((Object)s, "fieldName");
        Class<?> clazz2 = o.getClass();
        while (true) {
            final boolean a = e.a((Object)clazz2, (Object)Object.class);
            final Object o2 = null;
            if (!a) {
                try {
                    final Field declaredField = clazz2.getDeclaredField(s);
                    declaredField.setAccessible(true);
                    final Object value = declaredField.get(o);
                    if (!clazz.isInstance(value)) {
                        o = o2;
                    }
                    else {
                        o = clazz.cast(value);
                    }
                    return (T)o;
                }
                catch (final NoSuchFieldException ex) {
                    clazz2 = clazz2.getSuperclass();
                    e.e((Object)clazz2, "c.superclass");
                    continue;
                }
                break;
            }
            break;
        }
        if (!e.a((Object)s, (Object)"delegate")) {
            o = readFieldOrNull(o, Object.class, "delegate");
            if (o != null) {
                return (T)readFieldOrNull(o, (Class<Object>)clazz, s);
            }
        }
        return null;
    }
    
    public static final boolean skipAll(final g0 g0, final int n, final TimeUnit timeUnit) throws IOException {
        e.f((Object)g0, "<this>");
        e.f((Object)timeUnit, "timeUnit");
        final long nanoTime = System.nanoTime();
        long n2;
        if (g0.timeout().hasDeadline()) {
            n2 = g0.timeout().deadlineNanoTime() - nanoTime;
        }
        else {
            n2 = Long.MAX_VALUE;
        }
        g0.timeout().deadlineNanoTime(Math.min(n2, timeUnit.toNanos(n)) + nanoTime);
        boolean b = false;
    Label_0136_Outer:
        while (true) {
            while (true) {
                try {
                    final c c = new c();
                    while (g0.read(c, 8192L) != -1L) {
                        c.b();
                    }
                    b = true;
                    final boolean b2 = true;
                    if (n2 == Long.MAX_VALUE) {
                        b = b2;
                        g0.timeout().clearDeadline();
                    }
                    else {
                        g0.timeout().deadlineNanoTime(nanoTime + n2);
                    }
                }
                catch (final InterruptedIOException ex) {
                    b = false;
                    final boolean b3 = false;
                    if (n2 == Long.MAX_VALUE) {
                        b = b3;
                        continue Label_0136_Outer;
                    }
                    continue;
                }
                finally {
                    if (n2 == Long.MAX_VALUE) {
                        g0.timeout().clearDeadline();
                    }
                    else {
                        g0.timeout().deadlineNanoTime(nanoTime + n2);
                    }
                }
                break;
            }
            break;
        }
        return b;
    }
    
    public static final ThreadFactory threadFactory(final String s, final boolean b) {
        e.f((Object)s, "name");
        return (ThreadFactory)new ek2.a(s, b);
    }
    
    private static final Thread threadFactory$lambda-1(final String s, final boolean daemon, final Runnable runnable) {
        e.f((Object)s, "$name");
        final Thread thread = new Thread(runnable, s);
        thread.setDaemon(daemon);
        return thread;
    }
    
    public static final void threadName(final String name, final mg2.a<j> a) {
        e.f((Object)name, "name");
        e.f((Object)a, "block");
        final Thread currentThread = Thread.currentThread();
        final String name2 = currentThread.getName();
        currentThread.setName(name);
        try {
            a.invoke();
        }
        finally {
            currentThread.setName(name2);
        }
    }
    
    public static final List<Header> toHeaderList(final Headers headers) {
        e.f((Object)headers, "<this>");
        final i w1 = zd.b.w1(0, headers.size());
        final ArrayList list = new ArrayList(m.u4((Iterable)w1, 10));
        final Iterator iterator = ((Iterable)w1).iterator();
        while (iterator.hasNext()) {
            final int nextInt = ((w)iterator).nextInt();
            list.add((Object)new Header(headers.name(nextInt), headers.value(nextInt)));
        }
        return (List<Header>)list;
    }
    
    public static final Headers toHeaders(final List<Header> list) {
        e.f((Object)list, "<this>");
        final Headers$Builder headers$Builder = new Headers$Builder();
        for (final Header header : list) {
            headers$Builder.addLenient$okhttp(header.component1().utf8(), header.component2().utf8());
        }
        return headers$Builder.build();
    }
    
    public static final String toHexString(final int n) {
        final String hexString = Integer.toHexString(n);
        e.e((Object)hexString, "toHexString(this)");
        return hexString;
    }
    
    public static final String toHexString(final long n) {
        final String hexString = Long.toHexString(n);
        e.e((Object)hexString, "toHexString(this)");
        return hexString;
    }
    
    public static final String toHostHeader(final HttpUrl httpUrl, final boolean b) {
        e.f((Object)httpUrl, "<this>");
        String s;
        if (b.J0((CharSequence)httpUrl.host(), (CharSequence)":", false)) {
            final StringBuilder o = d.o('[');
            o.append(httpUrl.host());
            o.append(']');
            s = o.toString();
        }
        else {
            s = httpUrl.host();
        }
        if (!b) {
            final String string = s;
            if (httpUrl.port() == HttpUrl.Companion.defaultPort(httpUrl.scheme())) {
                return string;
            }
        }
        final StringBuilder n = android.support.v4.media.a.n(s, ':');
        n.append(httpUrl.port());
        return n.toString();
    }
    
    public static String toHostHeader$default(final HttpUrl httpUrl, boolean b, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            b = false;
        }
        return toHostHeader(httpUrl, b);
    }
    
    public static final <T> List<T> toImmutableList(final List<? extends T> list) {
        e.f((Object)list, "<this>");
        final List<Object> unmodifiableList = Collections.unmodifiableList((List<?>)CollectionsKt___CollectionsKt.J5((Collection)list));
        e.e((Object)unmodifiableList, "unmodifiableList(toMutableList())");
        return (List<T>)unmodifiableList;
    }
    
    public static final <K, V> Map<K, V> toImmutableMap(final Map<K, ? extends V> map) {
        e.f((Object)map, "<this>");
        Map<Object, Object> map2;
        if (map.isEmpty()) {
            map2 = kotlin.collections.c.u4();
        }
        else {
            map2 = Collections.unmodifiableMap((Map<?, ?>)new LinkedHashMap<Object, Object>(map));
            e.e((Object)map2, "{\n    Collections.unmodi\u2026(LinkedHashMap(this))\n  }");
        }
        return (Map<K, V>)map2;
    }
    
    public static final void wait(final Object o) {
        e.f(o, "<this>");
        o.wait();
    }
}
