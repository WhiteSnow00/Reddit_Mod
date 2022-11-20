// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.http;

import okhttp3.HttpUrl;
import ng2.e;
import java.net.Proxy;
import okhttp3.Request;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r¨\u0006\u000e" }, d2 = { "Lokhttp3/internal/http/RequestLine;", "", "()V", "get", "", "request", "Lokhttp3/Request;", "proxyType", "Ljava/net/Proxy$Type;", "includeAuthorityInRequestLine", "", "requestPath", "url", "Lokhttp3/HttpUrl;", "okhttp" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
public final class RequestLine
{
    public static final RequestLine INSTANCE;
    
    static {
        INSTANCE = new RequestLine();
    }
    
    private RequestLine() {
    }
    
    private final boolean includeAuthorityInRequestLine(final Request request, final Proxy.Type type) {
        return !request.isHttps() && type == Proxy.Type.HTTP;
    }
    
    public final String get(final Request request, final Proxy.Type type) {
        e.f((Object)request, "request");
        e.f((Object)type, "proxyType");
        final StringBuilder sb = new StringBuilder();
        sb.append(request.method());
        sb.append(' ');
        final RequestLine instance = RequestLine.INSTANCE;
        if (instance.includeAuthorityInRequestLine(request, type)) {
            sb.append(request.url());
        }
        else {
            sb.append(instance.requestPath(request.url()));
        }
        sb.append(" HTTP/1.1");
        final String string = sb.toString();
        e.e((Object)string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
    
    public final String requestPath(final HttpUrl httpUrl) {
        e.f((Object)httpUrl, "url");
        final String encodedPath = httpUrl.encodedPath();
        final String encodedQuery = httpUrl.encodedQuery();
        String string = encodedPath;
        if (encodedQuery != null) {
            final StringBuilder sb = new StringBuilder();
            sb.append(encodedPath);
            sb.append('?');
            sb.append((Object)encodedQuery);
            string = sb.toString();
        }
        return string;
    }
}
