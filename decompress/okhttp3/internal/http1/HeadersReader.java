// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.http1;

import okhttp3.Headers$Builder;
import okhttp3.Headers;
import ng2.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import fk2.f;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011" }, d2 = { "Lokhttp3/internal/http1/HeadersReader;", "", "", "readLine", "Lokhttp3/Headers;", "readHeaders", "", "headerLimit", "J", "Lfk2/f;", "source", "Lfk2/f;", "getSource", "()Lfk2/f;", "<init>", "(Lfk2/f;)V", "Companion", "okhttp" }, k = 1, mv = { 1, 6, 0 })
public final class HeadersReader
{
    public static final Companion Companion;
    private static final int HEADER_LIMIT = 262144;
    private long headerLimit;
    private final f source;
    
    static {
        Companion = new Companion(null);
    }
    
    public HeadersReader(final f source) {
        e.f((Object)source, "source");
        this.source = source;
        this.headerLimit = 262144L;
    }
    
    public final f getSource() {
        return this.source;
    }
    
    public final Headers readHeaders() {
        final Headers$Builder headers$Builder = new Headers$Builder();
        while (true) {
            final String line = this.readLine();
            if (line.length() == 0) {
                break;
            }
            headers$Builder.addLenient$okhttp(line);
        }
        return headers$Builder.build();
    }
    
    public final String readLine() {
        final String z0 = this.source.Z0(this.headerLimit);
        this.headerLimit -= z0.length();
        return z0;
    }
    
    @Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005" }, d2 = { "Lokhttp3/internal/http1/HeadersReader$Companion;", "", "()V", "HEADER_LIMIT", "", "okhttp" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        public Companion(final DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
