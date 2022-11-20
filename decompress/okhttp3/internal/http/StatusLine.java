// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.http;

import java.io.IOException;
import xi2.i;
import java.net.ProtocolException;
import xi2.j;
import okhttp3.Response;
import ng2.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Protocol;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\u0007H\u0016R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b" }, d2 = { "Lokhttp3/internal/http/StatusLine;", "", "protocol", "Lokhttp3/Protocol;", "code", "", "message", "", "(Lokhttp3/Protocol;ILjava/lang/String;)V", "toString", "Companion", "okhttp" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
public final class StatusLine
{
    public static final Companion Companion;
    public final int code;
    public final String message;
    public final Protocol protocol;
    
    static {
        Companion = new Companion(null);
    }
    
    public StatusLine(final Protocol protocol, final int code, final String message) {
        e.f((Object)protocol, "protocol");
        e.f((Object)message, "message");
        this.protocol = protocol;
        this.code = code;
        this.message = message;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        if (this.protocol == Protocol.HTTP_1_0) {
            sb.append("HTTP/1.0");
        }
        else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.code);
        sb.append(' ');
        sb.append(this.message);
        final String string = sb.toString();
        e.e((Object)string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
    
    @Metadata(d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t¨\u0006\n" }, d2 = { "Lokhttp3/internal/http/StatusLine$Companion;", "", "()V", "get", "Lokhttp3/internal/http/StatusLine;", "response", "Lokhttp3/Response;", "parse", "statusLine", "", "okhttp" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        public Companion(final DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
        
        public final StatusLine get(final Response response) {
            e.f((Object)response, "response");
            return new StatusLine(response.protocol(), response.code(), response.message());
        }
        
        public final StatusLine parse(String substring) throws IOException {
            e.f((Object)substring, "statusLine");
            final boolean i0 = j.I0(substring, "HTTP/1.", false);
            int n = 9;
            Protocol protocol;
            if (i0) {
                if (substring.length() < 9 || substring.charAt(8) != ' ') {
                    throw new ProtocolException(e.l((Object)substring, "Unexpected status line: "));
                }
                final int n2 = substring.charAt(7) - '0';
                if (n2 != 0) {
                    if (n2 != 1) {
                        throw new ProtocolException(e.l((Object)substring, "Unexpected status line: "));
                    }
                    protocol = Protocol.HTTP_1_1;
                }
                else {
                    protocol = Protocol.HTTP_1_0;
                }
            }
            else {
                if (!j.I0(substring, "ICY ", false)) {
                    throw new ProtocolException(e.l((Object)substring, "Unexpected status line: "));
                }
                protocol = Protocol.HTTP_1_0;
                n = 4;
            }
            final int length = substring.length();
            final int n3 = n + 3;
            if (length < n3) {
                throw new ProtocolException(e.l((Object)substring, "Unexpected status line: "));
            }
            final String substring2 = substring.substring(n, n3);
            e.e((Object)substring2, "this as java.lang.String\u2026ing(startIndex, endIndex)");
            final Integer u0 = i.u0(substring2);
            if (u0 != null) {
                final int intValue = u0;
                if (substring.length() > n3) {
                    if (substring.charAt(n3) != ' ') {
                        throw new ProtocolException(e.l((Object)substring, "Unexpected status line: "));
                    }
                    substring = substring.substring(n + 4);
                    e.e((Object)substring, "this as java.lang.String).substring(startIndex)");
                }
                else {
                    substring = "";
                }
                return new StatusLine(protocol, intValue, substring);
            }
            throw new ProtocolException(e.l((Object)substring, "Unexpected status line: "));
        }
    }
}
