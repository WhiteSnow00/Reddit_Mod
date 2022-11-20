// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.http2;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\u0001\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0015B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0016" }, d2 = { "Lokhttp3/internal/http2/ErrorCode;", "", "httpCode", "", "(Ljava/lang/String;II)V", "getHttpCode", "()I", "NO_ERROR", "PROTOCOL_ERROR", "INTERNAL_ERROR", "FLOW_CONTROL_ERROR", "SETTINGS_TIMEOUT", "STREAM_CLOSED", "FRAME_SIZE_ERROR", "REFUSED_STREAM", "CANCEL", "COMPRESSION_ERROR", "CONNECT_ERROR", "ENHANCE_YOUR_CALM", "INADEQUATE_SECURITY", "HTTP_1_1_REQUIRED", "Companion", "okhttp" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
public enum ErrorCode
{
    private static final ErrorCode[] $VALUES;
    
    CANCEL(8), 
    COMPRESSION_ERROR(9), 
    CONNECT_ERROR(10);
    
    public static final Companion Companion;
    
    ENHANCE_YOUR_CALM(11), 
    FLOW_CONTROL_ERROR(3), 
    FRAME_SIZE_ERROR(6), 
    HTTP_1_1_REQUIRED(13), 
    INADEQUATE_SECURITY(12), 
    INTERNAL_ERROR(2), 
    NO_ERROR(0), 
    PROTOCOL_ERROR(1), 
    REFUSED_STREAM(7), 
    SETTINGS_TIMEOUT(4), 
    STREAM_CLOSED(5);
    
    private final int httpCode;
    
    private static final ErrorCode[] $values() {
        return new ErrorCode[] { ErrorCode.NO_ERROR, ErrorCode.PROTOCOL_ERROR, ErrorCode.INTERNAL_ERROR, ErrorCode.FLOW_CONTROL_ERROR, ErrorCode.SETTINGS_TIMEOUT, ErrorCode.STREAM_CLOSED, ErrorCode.FRAME_SIZE_ERROR, ErrorCode.REFUSED_STREAM, ErrorCode.CANCEL, ErrorCode.COMPRESSION_ERROR, ErrorCode.CONNECT_ERROR, ErrorCode.ENHANCE_YOUR_CALM, ErrorCode.INADEQUATE_SECURITY, ErrorCode.HTTP_1_1_REQUIRED };
    }
    
    static {
        $VALUES = $values();
        Companion = new Companion(null);
    }
    
    private ErrorCode(final int httpCode) {
        this.httpCode = httpCode;
    }
    
    public final int getHttpCode() {
        return this.httpCode;
    }
    
    @Metadata(d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007" }, d2 = { "Lokhttp3/internal/http2/ErrorCode$Companion;", "", "()V", "fromHttp2", "Lokhttp3/internal/http2/ErrorCode;", "code", "", "okhttp" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        public Companion(final DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
        
        public final ErrorCode fromHttp2(final int n) {
            final ErrorCode[] values = ErrorCode.values();
            final int length = values.length;
            int i = 0;
            while (i < length) {
                final ErrorCode errorCode = values[i];
                ++i;
                if (errorCode.getHttpCode() == n) {
                    return errorCode;
                }
            }
            return null;
        }
    }
}
