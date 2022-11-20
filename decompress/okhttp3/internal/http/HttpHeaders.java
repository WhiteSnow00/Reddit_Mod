// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.http;

import okhttp3.Cookie;
import okhttp3.HttpUrl;
import okhttp3.CookieJar;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Collections;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import java.io.EOFException;
import okhttp3.internal.platform.Platform;
import fk2.c;
import xi2.j;
import java.util.ArrayList;
import okhttp3.Challenge;
import java.util.List;
import okhttp3.Headers;
import ng2.e;
import okhttp3.Response;
import okio.ByteString$a;
import okio.ByteString;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u001a\u0010\n\u001a\u00020\t*\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0002\u001a\f\u0010\f\u001a\u00020\u000b*\u00020\u0006H\u0002\u001a\u0014\u0010\u000f\u001a\u00020\u000b*\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002\u001a\u000e\u0010\u0010\u001a\u0004\u0018\u00010\u0001*\u00020\u0006H\u0002\u001a\u000e\u0010\u0011\u001a\u0004\u0018\u00010\u0001*\u00020\u0006H\u0002\u001a\u001a\u0010\u0016\u001a\u00020\t*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0000\u001a\n\u0010\u0018\u001a\u00020\u000b*\u00020\u0017\u001a\u0010\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0017H\u0007\"\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\"\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001d¨\u0006\u001f" }, d2 = { "Lokhttp3/Headers;", "", "headerName", "", "Lokhttp3/Challenge;", "parseChallenges", "Lfk2/c;", "", "result", "Lcg2/j;", "readChallengeHeader", "", "skipCommasAndWhitespace", "", "prefix", "startsWith", "readQuotedString", "readToken", "Lokhttp3/CookieJar;", "Lokhttp3/HttpUrl;", "url", "headers", "receiveHeaders", "Lokhttp3/Response;", "promisesBody", "response", "hasBody", "Lokio/ByteString;", "QUOTED_STRING_DELIMITERS", "Lokio/ByteString;", "TOKEN_DELIMITERS", "okhttp" }, k = 2, mv = { 1, 6, 0 })
public final class HttpHeaders
{
    private static final ByteString QUOTED_STRING_DELIMITERS;
    private static final ByteString TOKEN_DELIMITERS;
    
    static {
        ByteString.Companion.getClass();
        QUOTED_STRING_DELIMITERS = ByteString$a.c("\"\\");
        TOKEN_DELIMITERS = ByteString$a.c("\t ,=");
    }
    
    public static final boolean hasBody(final Response response) {
        e.f((Object)response, "response");
        return promisesBody(response);
    }
    
    public static final List<Challenge> parseChallenges(final Headers headers, final String s) {
        e.f((Object)headers, "<this>");
        e.f((Object)s, "headerName");
        final ArrayList list = new ArrayList();
        for (int size = headers.size(), i = 0; i < size; ++i) {
            if (j.z0(s, headers.name(i), true)) {
                final c c = new c();
                c.a0(headers.value(i));
                try {
                    readChallengeHeader(c, list);
                }
                catch (final EOFException ex) {
                    Platform.Companion.get().log("Unable to parse challenge", 5, (Throwable)ex);
                }
            }
        }
        return list;
    }
    
    public static final boolean promisesBody(final Response response) {
        e.f((Object)response, "<this>");
        if (e.a((Object)response.request().method(), (Object)"HEAD")) {
            return false;
        }
        final int code = response.code();
        return ((code < 100 || code >= 200) && code != 204 && code != 304) || _UtilJvmKt.headersContentLength(response) != -1L || j.z0("chunked", Response.header$default(response, "Transfer-Encoding", (String)null, 2, (Object)null), true);
    }
    
    private static final void readChallengeHeader(final c c, final List<Challenge> list) throws EOFException {
        while (true) {
            String token = null;
            while (true) {
                String token2 = token;
                if (token == null) {
                    skipCommasAndWhitespace(c);
                    if ((token2 = readToken(c)) == null) {
                        return;
                    }
                }
                final boolean skipCommasAndWhitespace = skipCommasAndWhitespace(c);
                String token3 = readToken(c);
                if (token3 == null) {
                    if (!c.e1()) {
                        return;
                    }
                    list.add(new Challenge(token2, kotlin.collections.c.u4()));
                }
                else {
                    final byte b = 61;
                    final int skipAll = _UtilCommonKt.skipAll(c, b);
                    final boolean skipCommasAndWhitespace2 = skipCommasAndWhitespace(c);
                    if (!skipCommasAndWhitespace && (skipCommasAndWhitespace2 || c.e1())) {
                        final Map<Object, String> singletonMap = Collections.singletonMap((Object)null, e.l((Object)j.D0(skipAll, "="), token3));
                        e.e((Object)singletonMap, "singletonMap<String, Str\u2026ek + \"=\".repeat(eqCount))");
                        list.add(new Challenge(token2, (Map)singletonMap));
                        break;
                    }
                    final LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int skipAll2 = _UtilCommonKt.skipAll(c, b) + skipAll;
                    while (true) {
                        token = token3;
                        if (token3 == null) {
                            token = readToken(c);
                            if (skipCommasAndWhitespace(c)) {
                                break;
                            }
                            skipAll2 = _UtilCommonKt.skipAll(c, b);
                        }
                        if (skipAll2 == 0) {
                            break;
                        }
                        if (skipAll2 > 1) {
                            return;
                        }
                        if (skipCommasAndWhitespace(c)) {
                            return;
                        }
                        String s;
                        if (startsWith(c, (byte)34)) {
                            s = readQuotedString(c);
                        }
                        else {
                            s = readToken(c);
                        }
                        if (s == null) {
                            return;
                        }
                        if (linkedHashMap.put(token, s) != null) {
                            return;
                        }
                        if (!skipCommasAndWhitespace(c) && !c.e1()) {
                            return;
                        }
                        token3 = null;
                    }
                    list.add(new Challenge(token2, (Map)linkedHashMap));
                    continue;
                }
            }
        }
    }
    
    private static final String readQuotedString(final c c) throws EOFException {
        final byte byte1 = c.readByte();
        final byte b = 34;
        if (byte1 != b) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        final c c2 = new c();
        while (true) {
            final long k1 = c.k1(HttpHeaders.QUOTED_STRING_DELIMITERS);
            if (k1 == -1L) {
                return null;
            }
            if (c.s(k1) == b) {
                c2.write(c, k1);
                c.readByte();
                return c2.E();
            }
            if (c.g == k1 + 1L) {
                return null;
            }
            c2.write(c, k1);
            c.readByte();
            c2.write(c, 1L);
        }
    }
    
    private static final String readToken(final c c) {
        long n;
        if ((n = c.k1(HttpHeaders.TOKEN_DELIMITERS)) == -1L) {
            n = c.g;
        }
        String f;
        if (n != 0L) {
            f = c.F(n);
        }
        else {
            f = null;
        }
        return f;
    }
    
    public static final void receiveHeaders(final CookieJar cookieJar, final HttpUrl httpUrl, final Headers headers) {
        e.f((Object)cookieJar, "<this>");
        e.f((Object)httpUrl, "url");
        e.f((Object)headers, "headers");
        if (cookieJar == CookieJar.NO_COOKIES) {
            return;
        }
        final List all = Cookie.Companion.parseAll(httpUrl, headers);
        if (all.isEmpty()) {
            return;
        }
        cookieJar.saveFromResponse(httpUrl, all);
    }
    
    private static final boolean skipCommasAndWhitespace(final c c) {
        boolean b = false;
        while (!c.e1()) {
            final byte s = c.s(0L);
            if (s == (byte)44) {
                c.readByte();
                b = true;
            }
            else {
                if (s != (byte)32 && s != (byte)9) {
                    break;
                }
                c.readByte();
            }
        }
        return b;
    }
    
    private static final boolean startsWith(final c c, final byte b) {
        return !c.e1() && c.s(0L) == b;
    }
}
