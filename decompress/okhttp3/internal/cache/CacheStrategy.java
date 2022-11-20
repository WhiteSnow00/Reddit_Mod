// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.cache;

import okhttp3.Headers$Builder;
import okhttp3.Response$Builder;
import okhttp3.CacheControl;
import java.util.concurrent.TimeUnit;
import okhttp3.Headers;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.http.DatesKt;
import xi2.j;
import java.util.Date;
import ng2.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Request;
import okhttp3.Response;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\u000b\fB\u001b\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\r" }, d2 = { "Lokhttp3/internal/cache/CacheStrategy;", "", "networkRequest", "Lokhttp3/Request;", "cacheResponse", "Lokhttp3/Response;", "(Lokhttp3/Request;Lokhttp3/Response;)V", "getCacheResponse", "()Lokhttp3/Response;", "getNetworkRequest", "()Lokhttp3/Request;", "Companion", "Factory", "okhttp" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
public final class CacheStrategy
{
    public static final Companion Companion;
    private final Response cacheResponse;
    private final Request networkRequest;
    
    static {
        Companion = new Companion(null);
    }
    
    public CacheStrategy(final Request networkRequest, final Response cacheResponse) {
        this.networkRequest = networkRequest;
        this.cacheResponse = cacheResponse;
    }
    
    public final Response getCacheResponse() {
        return this.cacheResponse;
    }
    
    public final Request getNetworkRequest() {
        return this.networkRequest;
    }
    
    @Metadata(d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t" }, d2 = { "Lokhttp3/internal/cache/CacheStrategy$Companion;", "", "()V", "isCacheable", "", "response", "Lokhttp3/Response;", "request", "Lokhttp3/Request;", "okhttp" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        public Companion(final DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
        
        public final boolean isCacheable(final Response response, final Request request) {
            e.f((Object)response, "response");
            e.f((Object)request, "request");
            final int code = response.code();
            final boolean b = false;
            Label_0163: {
                if (code != 200 && code != 410 && code != 414 && code != 501 && code != 203 && code != 204) {
                    if (code != 307) {
                        if (code == 308 || code == 404 || code == 405) {
                            break Label_0163;
                        }
                        switch (code) {
                            default: {
                                return false;
                            }
                            case 302: {
                                break;
                            }
                            case 300:
                            case 301: {
                                break Label_0163;
                            }
                        }
                    }
                    if (Response.header$default(response, "Expires", (String)null, 2, (Object)null) == null && response.cacheControl().maxAgeSeconds() == -1 && !response.cacheControl().isPublic() && !response.cacheControl().isPrivate()) {
                        return false;
                    }
                }
            }
            boolean b2 = b;
            if (!response.cacheControl().noStore()) {
                b2 = b;
                if (!request.cacheControl().noStore()) {
                    b2 = true;
                }
            }
            return b2;
        }
    }
    
    @Metadata(d1 = { "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0017\u001a\u00020\u0003H\u0002J\u0006\u0010\u0018\u001a\u00020\u0019J\b\u0010\u001a\u001a\u00020\u0019H\u0002J\b\u0010\u001b\u001a\u00020\u0003H\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\b\u0010\u001e\u001a\u00020\u001dH\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f" }, d2 = { "Lokhttp3/internal/cache/CacheStrategy$Factory;", "", "nowMillis", "", "request", "Lokhttp3/Request;", "cacheResponse", "Lokhttp3/Response;", "(JLokhttp3/Request;Lokhttp3/Response;)V", "ageSeconds", "", "etag", "", "expires", "Ljava/util/Date;", "lastModified", "lastModifiedString", "receivedResponseMillis", "getRequest$okhttp", "()Lokhttp3/Request;", "sentRequestMillis", "servedDate", "servedDateString", "cacheResponseAge", "compute", "Lokhttp3/internal/cache/CacheStrategy;", "computeCandidate", "computeFreshnessLifetime", "hasConditions", "", "isFreshnessLifetimeHeuristic", "okhttp" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
    public static final class Factory
    {
        private int ageSeconds;
        private final Response cacheResponse;
        private String etag;
        private Date expires;
        private Date lastModified;
        private String lastModifiedString;
        private final long nowMillis;
        private long receivedResponseMillis;
        private final Request request;
        private long sentRequestMillis;
        private Date servedDate;
        private String servedDateString;
        
        public Factory(final long nowMillis, final Request request, final Response cacheResponse) {
            e.f((Object)request, "request");
            this.nowMillis = nowMillis;
            this.request = request;
            this.cacheResponse = cacheResponse;
            this.ageSeconds = -1;
            if (cacheResponse != null) {
                this.sentRequestMillis = cacheResponse.sentRequestAtMillis();
                this.receivedResponseMillis = cacheResponse.receivedResponseAtMillis();
                final Headers headers = cacheResponse.headers();
                for (int i = 0; i < headers.size(); ++i) {
                    final String name = headers.name(i);
                    final String value = headers.value(i);
                    if (j.z0(name, "Date", true)) {
                        this.servedDate = DatesKt.toHttpDateOrNull(value);
                        this.servedDateString = value;
                    }
                    else if (j.z0(name, "Expires", true)) {
                        this.expires = DatesKt.toHttpDateOrNull(value);
                    }
                    else if (j.z0(name, "Last-Modified", true)) {
                        this.lastModified = DatesKt.toHttpDateOrNull(value);
                        this.lastModifiedString = value;
                    }
                    else if (j.z0(name, "ETag", true)) {
                        this.etag = value;
                    }
                    else if (j.z0(name, "Age", true)) {
                        this.ageSeconds = _UtilCommonKt.toNonNegativeInt(value, -1);
                    }
                }
            }
        }
        
        private final long cacheResponseAge() {
            final Date servedDate = this.servedDate;
            long max = 0L;
            if (servedDate != null) {
                max = Math.max(0L, this.receivedResponseMillis - servedDate.getTime());
            }
            final int ageSeconds = this.ageSeconds;
            long max2 = max;
            if (ageSeconds != -1) {
                max2 = Math.max(max, TimeUnit.SECONDS.toMillis(ageSeconds));
            }
            final long receivedResponseMillis = this.receivedResponseMillis;
            return max2 + (receivedResponseMillis - this.sentRequestMillis) + (this.nowMillis - receivedResponseMillis);
        }
        
        private final CacheStrategy computeCandidate() {
            if (this.cacheResponse == null) {
                return new CacheStrategy(this.request, null);
            }
            if (this.request.isHttps() && this.cacheResponse.handshake() == null) {
                return new CacheStrategy(this.request, null);
            }
            if (!CacheStrategy.Companion.isCacheable(this.cacheResponse, this.request)) {
                return new CacheStrategy(this.request, null);
            }
            final CacheControl cacheControl = this.request.cacheControl();
            if (!cacheControl.noCache() && !this.hasConditions(this.request)) {
                final CacheControl cacheControl2 = this.cacheResponse.cacheControl();
                final long cacheResponseAge = this.cacheResponseAge();
                long n2;
                final long n = n2 = this.computeFreshnessLifetime();
                if (cacheControl.maxAgeSeconds() != -1) {
                    n2 = Math.min(n, TimeUnit.SECONDS.toMillis(cacheControl.maxAgeSeconds()));
                }
                final int minFreshSeconds = cacheControl.minFreshSeconds();
                final long n3 = 0L;
                long millis;
                if (minFreshSeconds != -1) {
                    millis = TimeUnit.SECONDS.toMillis(cacheControl.minFreshSeconds());
                }
                else {
                    millis = 0L;
                }
                long millis2 = n3;
                if (!cacheControl2.mustRevalidate()) {
                    millis2 = n3;
                    if (cacheControl.maxStaleSeconds() != -1) {
                        millis2 = TimeUnit.SECONDS.toMillis(cacheControl.maxStaleSeconds());
                    }
                }
                if (!cacheControl2.noCache()) {
                    final long n4 = millis + cacheResponseAge;
                    if (n4 < millis2 + n2) {
                        final Response$Builder builder = this.cacheResponse.newBuilder();
                        if (n4 >= n2) {
                            builder.addHeader("Warning", "110 HttpURLConnection \"Response is stale\"");
                        }
                        if (cacheResponseAge > 86400000L && this.isFreshnessLifetimeHeuristic()) {
                            builder.addHeader("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                        }
                        return new CacheStrategy(null, builder.build());
                    }
                }
                String s = this.etag;
                String s2 = "If-Modified-Since";
                if (s != null) {
                    s2 = "If-None-Match";
                }
                else if (this.lastModified != null) {
                    s = this.lastModifiedString;
                }
                else {
                    if (this.servedDate == null) {
                        return new CacheStrategy(this.request, null);
                    }
                    s = this.servedDateString;
                }
                final Headers$Builder builder2 = this.request.headers().newBuilder();
                e.c((Object)s);
                builder2.addLenient$okhttp(s2, s);
                return new CacheStrategy(this.request.newBuilder().headers(builder2.build()).build(), this.cacheResponse);
            }
            return new CacheStrategy(this.request, null);
        }
        
        private final long computeFreshnessLifetime() {
            final Response cacheResponse = this.cacheResponse;
            e.c((Object)cacheResponse);
            final CacheControl cacheControl = cacheResponse.cacheControl();
            if (cacheControl.maxAgeSeconds() != -1) {
                return TimeUnit.SECONDS.toMillis(cacheControl.maxAgeSeconds());
            }
            final Date expires = this.expires;
            final Long n = null;
            Long value = null;
            long n2 = 0L;
            if (expires != null) {
                final Date servedDate = this.servedDate;
                if (servedDate != null) {
                    value = servedDate.getTime();
                }
                long n3;
                if (value == null) {
                    n3 = this.receivedResponseMillis;
                }
                else {
                    n3 = value;
                }
                final long n4 = expires.getTime() - n3;
                if (n4 > 0L) {
                    n2 = n4;
                }
                return n2;
            }
            long n5 = n2;
            if (this.lastModified != null) {
                n5 = n2;
                if (this.cacheResponse.request().url().query() == null) {
                    final Date servedDate2 = this.servedDate;
                    Long value2;
                    if (servedDate2 == null) {
                        value2 = n;
                    }
                    else {
                        value2 = servedDate2.getTime();
                    }
                    long n6;
                    if (value2 == null) {
                        n6 = this.sentRequestMillis;
                    }
                    else {
                        n6 = value2;
                    }
                    final Date lastModified = this.lastModified;
                    e.c((Object)lastModified);
                    final long n7 = n6 - lastModified.getTime();
                    n5 = n2;
                    if (n7 > 0L) {
                        n5 = n7 / 10;
                    }
                }
            }
            return n5;
        }
        
        private final boolean hasConditions(final Request request) {
            return request.header("If-Modified-Since") != null || request.header("If-None-Match") != null;
        }
        
        private final boolean isFreshnessLifetimeHeuristic() {
            final Response cacheResponse = this.cacheResponse;
            e.c((Object)cacheResponse);
            return cacheResponse.cacheControl().maxAgeSeconds() == -1 && this.expires == null;
        }
        
        public final CacheStrategy compute() {
            CacheStrategy computeCandidate;
            final CacheStrategy cacheStrategy = computeCandidate = this.computeCandidate();
            if (cacheStrategy.getNetworkRequest() != null) {
                computeCandidate = cacheStrategy;
                if (this.request.cacheControl().onlyIfCached()) {
                    computeCandidate = new CacheStrategy(null, null);
                }
            }
            return computeCandidate;
        }
        
        public final Request getRequest$okhttp() {
            return this.request;
        }
    }
}
