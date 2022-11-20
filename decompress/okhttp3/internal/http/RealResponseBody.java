// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.http;

import okhttp3.MediaType;
import ng2.e;
import fk2.f;
import kotlin.Metadata;
import okhttp3.ResponseBody;

@Metadata(bv = {}, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\u000e" }, d2 = { "Lokhttp3/internal/http/RealResponseBody;", "Lokhttp3/ResponseBody;", "", "contentLength", "Lokhttp3/MediaType;", "contentType", "Lfk2/f;", "source", "", "contentTypeString", "Ljava/lang/String;", "J", "<init>", "(Ljava/lang/String;JLfk2/f;)V", "okhttp" }, k = 1, mv = { 1, 6, 0 })
public final class RealResponseBody extends ResponseBody
{
    private final long contentLength;
    private final String contentTypeString;
    private final f source;
    
    public RealResponseBody(final String contentTypeString, final long contentLength, final f source) {
        e.f((Object)source, "source");
        this.contentTypeString = contentTypeString;
        this.contentLength = contentLength;
        this.source = source;
    }
    
    public long contentLength() {
        return this.contentLength;
    }
    
    public MediaType contentType() {
        final String contentTypeString = this.contentTypeString;
        MediaType parse;
        if (contentTypeString == null) {
            parse = null;
        }
        else {
            parse = MediaType.Companion.parse(contentTypeString);
        }
        return parse;
    }
    
    public f source() {
        return this.source;
    }
}
