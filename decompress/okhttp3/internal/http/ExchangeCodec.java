// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.http;

import okhttp3.internal.connection.RealCall;
import okhttp3.Route;
import okhttp3.Headers;
import okhttp3.Response$Builder;
import fk2.g0;
import okhttp3.Response;
import java.io.IOException;
import fk2.e0;
import okhttp3.Request;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001d\u001cJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\n\u001a\u00020\bH&J\b\u0010\u000b\u001a\u00020\bH&J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH&J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H&J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0010H&J\b\u0010\u0016\u001a\u00020\u0015H&J\b\u0010\u0017\u001a\u00020\bH&R\u0014\u0010\u001b\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e" }, d2 = { "Lokhttp3/internal/http/ExchangeCodec;", "", "Lokhttp3/Request;", "request", "", "contentLength", "Lfk2/e0;", "createRequestBody", "Lcg2/j;", "writeRequestHeaders", "flushRequest", "finishRequest", "", "expectContinue", "Lokhttp3/Response$Builder;", "readResponseHeaders", "Lokhttp3/Response;", "response", "reportedContentLength", "Lfk2/g0;", "openResponseBodySource", "Lokhttp3/Headers;", "trailers", "cancel", "Lokhttp3/internal/http/ExchangeCodec$Carrier;", "getCarrier", "()Lokhttp3/internal/http/ExchangeCodec$Carrier;", "carrier", "Companion", "Carrier", "okhttp" }, k = 1, mv = { 1, 6, 0 })
public interface ExchangeCodec
{
    public static final Companion Companion = ExchangeCodec.Companion.$$INSTANCE;
    public static final int DISCARD_STREAM_TIMEOUT_MILLIS = 100;
    
    void cancel();
    
    e0 createRequestBody(final Request p0, final long p1) throws IOException;
    
    void finishRequest() throws IOException;
    
    void flushRequest() throws IOException;
    
    Carrier getCarrier();
    
    g0 openResponseBodySource(final Response p0) throws IOException;
    
    Response$Builder readResponseHeaders(final boolean p0) throws IOException;
    
    long reportedContentLength(final Response p0) throws IOException;
    
    Headers trailers() throws IOException;
    
    void writeRequestHeaders(final Request p0) throws IOException;
    
    @Metadata(bv = {}, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&J\b\u0010\b\u001a\u00020\u0006H&J\b\u0010\t\u001a\u00020\u0006H&R\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e" }, d2 = { "Lokhttp3/internal/http/ExchangeCodec$Carrier;", "", "Lokhttp3/internal/connection/RealCall;", "call", "Ljava/io/IOException;", "e", "Lcg2/j;", "trackFailure", "noNewExchanges", "cancel", "Lokhttp3/Route;", "getRoute", "()Lokhttp3/Route;", "route", "okhttp" }, k = 1, mv = { 1, 6, 0 })
    public interface Carrier
    {
        void cancel();
        
        Route getRoute();
        
        void noNewExchanges();
        
        void trackFailure(final RealCall p0, final IOException p1);
    }
    
    @Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005" }, d2 = { "Lokhttp3/internal/http/ExchangeCodec$Companion;", "", "()V", "DISCARD_STREAM_TIMEOUT_MILLIS", "", "okhttp" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
    public static final class Companion
    {
        public static final Companion $$INSTANCE;
        public static final int DISCARD_STREAM_TIMEOUT_MILLIS = 100;
        
        static {
            $$INSTANCE = new Companion();
        }
        
        private Companion() {
        }
    }
}
