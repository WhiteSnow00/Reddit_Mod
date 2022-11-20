// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal;

import okhttp3.CacheControl;
import okhttp3.Request;
import okhttp3.Protocol;
import java.io.IOException;
import fk2.b0;
import fk2.f;
import fk2.c;
import okhttp3.Headers;
import java.util.List;
import okhttp3.Response$Builder;
import okhttp3.ResponseBody;
import ng2.e;
import okhttp3.Response;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a \u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0007\u001a\u0012\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007\u001a\n\u0010\f\u001a\u00020\u000b*\u00020\u0000\u001a\n\u0010\u000e\u001a\u00020\r*\u00020\u0000\u001a\n\u0010\u000f\u001a\u00020\u0001*\u00020\u0000\u001a\u0012\u0010\u0012\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010\u001a\u0012\u0010\u0015\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013\u001a\u0012\u0010\u0018\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016\u001a\u0012\u0010\u001a\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0001\u001a\u001a\u0010\u0006\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u0001\u001a\u001a\u0010\u001c\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u0001\u001a\u0012\u0010\u001d\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0012\u0010\u0004\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001e\u001a\u0014\u0010!\u001a\u00020\u000b*\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010\t\u001a\u0014\u0010#\u001a\u00020\u000b*\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010\u0000\u001a\u0014\u0010%\u001a\u00020\u000b*\u00020\u000b2\b\u0010$\u001a\u0004\u0018\u00010\u0000\u001a\u001a\u0010'\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010&\u001a\u0004\u0018\u00010\u0000H\u0002\u001a\u0014\u0010)\u001a\u00020\u000b*\u00020\u000b2\b\u0010(\u001a\u0004\u0018\u00010\u0000\u001a\u0012\u0010*\u001a\u00020\r2\b\u0010&\u001a\u0004\u0018\u00010\u0000H\u0002\"\u0015\u0010.\u001a\u00020+*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b,\u0010-\"\u0015\u00100\u001a\u00020+*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b/\u0010-\"\u0015\u00104\u001a\u000201*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00065" }, d2 = { "Lokhttp3/Response;", "", "name", "", "commonHeaders", "defaultValue", "commonHeader", "", "byteCount", "Lokhttp3/ResponseBody;", "commonPeekBody", "Lokhttp3/Response$Builder;", "commonNewBuilder", "Lcg2/j;", "commonClose", "commonToString", "Lokhttp3/Request;", "request", "commonRequest", "Lokhttp3/Protocol;", "protocol", "commonProtocol", "", "code", "commonCode", "message", "commonMessage", "value", "commonAddHeader", "commonRemoveHeader", "Lokhttp3/Headers;", "headers", "body", "commonBody", "networkResponse", "commonNetworkResponse", "cacheResponse", "commonCacheResponse", "response", "checkSupportResponse", "priorResponse", "commonPriorResponse", "checkPriorResponse", "", "getCommonIsSuccessful", "(Lokhttp3/Response;)Z", "commonIsSuccessful", "getCommonIsRedirect", "commonIsRedirect", "Lokhttp3/CacheControl;", "getCommonCacheControl", "(Lokhttp3/Response;)Lokhttp3/CacheControl;", "commonCacheControl", "okhttp" }, k = 2, mv = { 1, 6, 0 })
public final class _ResponseCommonKt
{
    private static final void checkPriorResponse(final Response response) {
        if (response != null) {
            if (response.body() != null) {
                throw new IllegalArgumentException("priorResponse.body != null".toString());
            }
        }
    }
    
    private static final void checkSupportResponse(final String s, final Response response) {
        if (response != null) {
            final ResponseBody body = response.body();
            final int n = 1;
            if (body != null) {
                throw new IllegalArgumentException(e.l((Object)".body != null", s).toString());
            }
            if (response.networkResponse() != null) {
                throw new IllegalArgumentException(e.l((Object)".networkResponse != null", s).toString());
            }
            if (response.cacheResponse() != null) {
                throw new IllegalArgumentException(e.l((Object)".cacheResponse != null", s).toString());
            }
            int n2;
            if (response.priorResponse() == null) {
                n2 = n;
            }
            else {
                n2 = 0;
            }
            if (n2 == 0) {
                throw new IllegalArgumentException(e.l((Object)".priorResponse != null", s).toString());
            }
        }
    }
    
    public static final Response$Builder commonAddHeader(final Response$Builder response$Builder, final String s, final String s2) {
        e.f((Object)response$Builder, "<this>");
        e.f((Object)s, "name");
        e.f((Object)s2, "value");
        response$Builder.getHeaders$okhttp().add(s, s2);
        return response$Builder;
    }
    
    public static final Response$Builder commonBody(final Response$Builder response$Builder, final ResponseBody body$okhttp) {
        e.f((Object)response$Builder, "<this>");
        response$Builder.setBody$okhttp(body$okhttp);
        return response$Builder;
    }
    
    public static final Response$Builder commonCacheResponse(final Response$Builder response$Builder, final Response cacheResponse$okhttp) {
        e.f((Object)response$Builder, "<this>");
        checkSupportResponse("cacheResponse", cacheResponse$okhttp);
        response$Builder.setCacheResponse$okhttp(cacheResponse$okhttp);
        return response$Builder;
    }
    
    public static final void commonClose(final Response response) {
        e.f((Object)response, "<this>");
        final ResponseBody body = response.body();
        if (body != null) {
            body.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
    }
    
    public static final Response$Builder commonCode(final Response$Builder response$Builder, final int code$okhttp) {
        e.f((Object)response$Builder, "<this>");
        response$Builder.setCode$okhttp(code$okhttp);
        return response$Builder;
    }
    
    public static final String commonHeader(final Response response, final String s, final String s2) {
        e.f((Object)response, "<this>");
        e.f((Object)s, "name");
        String value = response.headers().get(s);
        if (value == null) {
            value = s2;
        }
        return value;
    }
    
    public static final Response$Builder commonHeader(final Response$Builder response$Builder, final String s, final String s2) {
        e.f((Object)response$Builder, "<this>");
        e.f((Object)s, "name");
        e.f((Object)s2, "value");
        response$Builder.getHeaders$okhttp().set(s, s2);
        return response$Builder;
    }
    
    public static final List<String> commonHeaders(final Response response, final String s) {
        e.f((Object)response, "<this>");
        e.f((Object)s, "name");
        return response.headers().values(s);
    }
    
    public static final Response$Builder commonHeaders(final Response$Builder response$Builder, final Headers headers) {
        e.f((Object)response$Builder, "<this>");
        e.f((Object)headers, "headers");
        response$Builder.setHeaders$okhttp(headers.newBuilder());
        return response$Builder;
    }
    
    public static final Response$Builder commonMessage(final Response$Builder response$Builder, final String message$okhttp) {
        e.f((Object)response$Builder, "<this>");
        e.f((Object)message$okhttp, "message");
        response$Builder.setMessage$okhttp(message$okhttp);
        return response$Builder;
    }
    
    public static final Response$Builder commonNetworkResponse(final Response$Builder response$Builder, final Response networkResponse$okhttp) {
        e.f((Object)response$Builder, "<this>");
        checkSupportResponse("networkResponse", networkResponse$okhttp);
        response$Builder.setNetworkResponse$okhttp(networkResponse$okhttp);
        return response$Builder;
    }
    
    public static final Response$Builder commonNewBuilder(final Response response) {
        e.f((Object)response, "<this>");
        return new Response$Builder(response);
    }
    
    public static final ResponseBody commonPeekBody(final Response response, final long n) throws IOException {
        e.f((Object)response, "<this>");
        final ResponseBody body = response.body();
        e.c((Object)body);
        final b0 peek = body.source().peek();
        final c c = new c();
        peek.request(n);
        c.P((f)peek, Math.min(n, peek.g.g));
        return ResponseBody.Companion.create((f)c, response.body().contentType(), c.g);
    }
    
    public static final Response$Builder commonPriorResponse(final Response$Builder response$Builder, final Response priorResponse$okhttp) {
        e.f((Object)response$Builder, "<this>");
        checkPriorResponse(priorResponse$okhttp);
        response$Builder.setPriorResponse$okhttp(priorResponse$okhttp);
        return response$Builder;
    }
    
    public static final Response$Builder commonProtocol(final Response$Builder response$Builder, final Protocol protocol$okhttp) {
        e.f((Object)response$Builder, "<this>");
        e.f((Object)protocol$okhttp, "protocol");
        response$Builder.setProtocol$okhttp(protocol$okhttp);
        return response$Builder;
    }
    
    public static final Response$Builder commonRemoveHeader(final Response$Builder response$Builder, final String s) {
        e.f((Object)response$Builder, "<this>");
        e.f((Object)s, "name");
        response$Builder.getHeaders$okhttp().removeAll(s);
        return response$Builder;
    }
    
    public static final Response$Builder commonRequest(final Response$Builder response$Builder, final Request request$okhttp) {
        e.f((Object)response$Builder, "<this>");
        e.f((Object)request$okhttp, "request");
        response$Builder.setRequest$okhttp(request$okhttp);
        return response$Builder;
    }
    
    public static final String commonToString(final Response response) {
        e.f((Object)response, "<this>");
        final StringBuilder sb = new StringBuilder();
        sb.append("Response{protocol=");
        sb.append(response.protocol());
        sb.append(", code=");
        sb.append(response.code());
        sb.append(", message=");
        sb.append(response.message());
        sb.append(", url=");
        sb.append(response.request().url());
        sb.append('}');
        return sb.toString();
    }
    
    public static final CacheControl getCommonCacheControl(final Response response) {
        e.f((Object)response, "<this>");
        CacheControl lazyCacheControl$okhttp;
        if ((lazyCacheControl$okhttp = response.getLazyCacheControl$okhttp()) == null) {
            lazyCacheControl$okhttp = CacheControl.Companion.parse(response.headers());
            response.setLazyCacheControl$okhttp(lazyCacheControl$okhttp);
        }
        return lazyCacheControl$okhttp;
    }
    
    public static final boolean getCommonIsRedirect(final Response response) {
        e.f((Object)response, "<this>");
        final int code = response.code();
        if (code != 307 && code != 308) {
            switch (code) {
                default: {
                    return false;
                }
                case 300:
                case 301:
                case 302:
                case 303: {
                    break;
                }
            }
        }
        return true;
    }
    
    public static final boolean getCommonIsSuccessful(final Response response) {
        e.f((Object)response, "<this>");
        final int code = response.code();
        boolean b = false;
        if (200 <= code) {
            b = b;
            if (code < 300) {
                b = true;
            }
        }
        return b;
    }
}
