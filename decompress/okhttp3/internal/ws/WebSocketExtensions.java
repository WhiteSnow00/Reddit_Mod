// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.ws;

import java.io.IOException;
import cj2.i;
import kotlin.text.b;
import okhttp3.internal._UtilCommonKt;
import cj2.j;
import okhttp3.Headers;
import al0.g7;
import sg2.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cBE\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003JN\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003H\u00c6\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00d6\u0001J\u000e\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d" }, d2 = { "Lokhttp3/internal/ws/WebSocketExtensions;", "", "perMessageDeflate", "", "clientMaxWindowBits", "", "clientNoContextTakeover", "serverMaxWindowBits", "serverNoContextTakeover", "unknownValues", "(ZLjava/lang/Integer;ZLjava/lang/Integer;ZZ)V", "Ljava/lang/Integer;", "component1", "component2", "()Ljava/lang/Integer;", "component3", "component4", "component5", "component6", "copy", "(ZLjava/lang/Integer;ZLjava/lang/Integer;ZZ)Lokhttp3/internal/ws/WebSocketExtensions;", "equals", "other", "hashCode", "noContextTakeover", "clientOriginated", "toString", "", "Companion", "okhttp" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
public final class WebSocketExtensions
{
    public static final Companion Companion;
    private static final String HEADER_WEB_SOCKET_EXTENSION = "Sec-WebSocket-Extensions";
    public final Integer clientMaxWindowBits;
    public final boolean clientNoContextTakeover;
    public final boolean perMessageDeflate;
    public final Integer serverMaxWindowBits;
    public final boolean serverNoContextTakeover;
    public final boolean unknownValues;
    
    static {
        Companion = new Companion(null);
    }
    
    public WebSocketExtensions() {
        this(false, null, false, null, false, false, 63, null);
    }
    
    public WebSocketExtensions(final boolean perMessageDeflate, final Integer clientMaxWindowBits, final boolean clientNoContextTakeover, final Integer serverMaxWindowBits, final boolean serverNoContextTakeover, final boolean unknownValues) {
        this.perMessageDeflate = perMessageDeflate;
        this.clientMaxWindowBits = clientMaxWindowBits;
        this.clientNoContextTakeover = clientNoContextTakeover;
        this.serverMaxWindowBits = serverMaxWindowBits;
        this.serverNoContextTakeover = serverNoContextTakeover;
        this.unknownValues = unknownValues;
    }
    
    public final boolean component1() {
        return this.perMessageDeflate;
    }
    
    public final Integer component2() {
        return this.clientMaxWindowBits;
    }
    
    public final boolean component3() {
        return this.clientNoContextTakeover;
    }
    
    public final Integer component4() {
        return this.serverMaxWindowBits;
    }
    
    public final boolean component5() {
        return this.serverNoContextTakeover;
    }
    
    public final boolean component6() {
        return this.unknownValues;
    }
    
    public final WebSocketExtensions copy(final boolean b, final Integer n, final boolean b2, final Integer n2, final boolean b3, final boolean b4) {
        return new WebSocketExtensions(b, n, b2, n2, b3, b4);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WebSocketExtensions)) {
            return false;
        }
        final WebSocketExtensions webSocketExtensions = (WebSocketExtensions)o;
        return this.perMessageDeflate == webSocketExtensions.perMessageDeflate && e.a((Object)this.clientMaxWindowBits, (Object)webSocketExtensions.clientMaxWindowBits) && this.clientNoContextTakeover == webSocketExtensions.clientNoContextTakeover && e.a((Object)this.serverMaxWindowBits, (Object)webSocketExtensions.serverMaxWindowBits) && this.serverNoContextTakeover == webSocketExtensions.serverNoContextTakeover && this.unknownValues == webSocketExtensions.unknownValues;
    }
    
    @Override
    public int hashCode() {
        final int perMessageDeflate = this.perMessageDeflate ? 1 : 0;
        int n = 1;
        int n2 = perMessageDeflate;
        if (perMessageDeflate != 0) {
            n2 = 1;
        }
        final Integer clientMaxWindowBits = this.clientMaxWindowBits;
        int hashCode = 0;
        int hashCode2;
        if (clientMaxWindowBits == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = clientMaxWindowBits.hashCode();
        }
        int clientNoContextTakeover;
        if ((clientNoContextTakeover = (this.clientNoContextTakeover ? 1 : 0)) != 0) {
            clientNoContextTakeover = 1;
        }
        final Integer serverMaxWindowBits = this.serverMaxWindowBits;
        if (serverMaxWindowBits != null) {
            hashCode = serverMaxWindowBits.hashCode();
        }
        int serverNoContextTakeover;
        if ((serverNoContextTakeover = (this.serverNoContextTakeover ? 1 : 0)) != 0) {
            serverNoContextTakeover = 1;
        }
        final int unknownValues = this.unknownValues ? 1 : 0;
        if (unknownValues == 0) {
            n = unknownValues;
        }
        return ((((n2 * 31 + hashCode2) * 31 + clientNoContextTakeover) * 31 + hashCode) * 31 + serverNoContextTakeover) * 31 + n;
    }
    
    public final boolean noContextTakeover(final boolean b) {
        boolean b2;
        if (b) {
            b2 = this.clientNoContextTakeover;
        }
        else {
            b2 = this.serverNoContextTakeover;
        }
        return b2;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("WebSocketExtensions(perMessageDeflate=");
        r.append(this.perMessageDeflate);
        r.append(", clientMaxWindowBits=");
        r.append(this.clientMaxWindowBits);
        r.append(", clientNoContextTakeover=");
        r.append(this.clientNoContextTakeover);
        r.append(", serverMaxWindowBits=");
        r.append(this.serverMaxWindowBits);
        r.append(", serverNoContextTakeover=");
        r.append(this.serverNoContextTakeover);
        r.append(", unknownValues=");
        return g7.m(r, this.unknownValues, ')');
    }
    
    @Metadata(d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t" }, d2 = { "Lokhttp3/internal/ws/WebSocketExtensions$Companion;", "", "()V", "HEADER_WEB_SOCKET_EXTENSION", "", "parse", "Lokhttp3/internal/ws/WebSocketExtensions;", "responseHeaders", "Lokhttp3/Headers;", "okhttp" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        public final WebSocketExtensions parse(final Headers headers) throws IOException {
            e.f((Object)headers, "responseHeaders");
            final int size = headers.size();
            Headers headers2 = headers;
            int i = 0;
            int n = 0;
            Integer a0 = null;
            boolean b = false;
            Integer a2 = null;
            boolean b2 = false;
            int n2 = 0;
            while (i < size) {
                final String name = headers2.name(i);
                int n3 = 1;
                if (j.F0(name, "Sec-WebSocket-Extensions", true)) {
                    final String value = headers2.value(i);
                    int j = 0;
                    while (j < value.length()) {
                        final int delimiterOffset$default = _UtilCommonKt.delimiterOffset$default(value, ',', j, 0, 4, (Object)null);
                        final int delimiterOffset = _UtilCommonKt.delimiterOffset(value, ';', j, delimiterOffset$default);
                        final String trimSubstring = _UtilCommonKt.trimSubstring(value, j, delimiterOffset);
                        j = delimiterOffset + n3;
                        if (cj2.j.F0(trimSubstring, "permessage-deflate", (boolean)(n3 != 0))) {
                            if (n != 0) {
                                n2 = n3;
                            }
                            n = n3;
                            int n4 = n2;
                            while (j < delimiterOffset$default) {
                                final int delimiterOffset2 = _UtilCommonKt.delimiterOffset(value, ';', j, delimiterOffset$default);
                                final int delimiterOffset3 = _UtilCommonKt.delimiterOffset(value, '=', j, delimiterOffset2);
                                final String trimSubstring2 = _UtilCommonKt.trimSubstring(value, j, delimiterOffset3);
                                String substring;
                                if (delimiterOffset3 < delimiterOffset2) {
                                    final String trimSubstring3 = _UtilCommonKt.trimSubstring(value, delimiterOffset3 + 1, delimiterOffset2);
                                    e.f((Object)trimSubstring3, "<this>");
                                    final int length = trimSubstring3.length();
                                    final int length2 = "\"".length();
                                    substring = trimSubstring3;
                                    if (length >= "\"".length() + length2) {
                                        substring = trimSubstring3;
                                        if (kotlin.text.b.p1((CharSequence)trimSubstring3, (CharSequence)"\"")) {
                                            substring = trimSubstring3;
                                            if (kotlin.text.b.S0((CharSequence)trimSubstring3, "\"")) {
                                                substring = trimSubstring3.substring("\"".length(), trimSubstring3.length() - "\"".length());
                                                e.e((Object)substring, "this as java.lang.String\u2026ing(startIndex, endIndex)");
                                            }
                                        }
                                    }
                                }
                                else {
                                    substring = null;
                                }
                                Label_0504: {
                                    Integer n6 = null;
                                    Label_0463: {
                                        Label_0457: {
                                            Integer n5;
                                            if (cj2.j.F0(trimSubstring2, "client_max_window_bits", true)) {
                                                if (a0 != null) {
                                                    n4 = 1;
                                                }
                                                if (substring == null) {
                                                    a0 = null;
                                                }
                                                else {
                                                    a0 = cj2.i.A0(substring);
                                                }
                                                n5 = a0;
                                                n6 = a2;
                                                if (a0 == null) {
                                                    break Label_0457;
                                                }
                                            }
                                            else {
                                                if (cj2.j.F0(trimSubstring2, "client_no_context_takeover", true)) {
                                                    if (b) {
                                                        n4 = 1;
                                                    }
                                                    if (substring != null) {
                                                        n4 = 1;
                                                    }
                                                    b = true;
                                                    break Label_0504;
                                                }
                                                if (cj2.j.F0(trimSubstring2, "server_max_window_bits", true)) {
                                                    if (a2 != null) {
                                                        n4 = 1;
                                                    }
                                                    if (substring == null) {
                                                        a2 = null;
                                                    }
                                                    else {
                                                        a2 = cj2.i.A0(substring);
                                                    }
                                                    n5 = a0;
                                                    n6 = a2;
                                                    if (a2 == null) {
                                                        break Label_0457;
                                                    }
                                                }
                                                else {
                                                    if (cj2.j.F0(trimSubstring2, "server_no_context_takeover", true)) {
                                                        if (b2) {
                                                            n4 = 1;
                                                        }
                                                        if (substring != null) {
                                                            n4 = 1;
                                                        }
                                                        b2 = true;
                                                        break Label_0504;
                                                    }
                                                    n4 = 1;
                                                    break Label_0504;
                                                }
                                            }
                                            a0 = n5;
                                            break Label_0463;
                                        }
                                        n4 = 1;
                                        n6 = a2;
                                    }
                                    a2 = n6;
                                }
                                j = delimiterOffset2 + 1;
                                n = 1;
                            }
                            final int n7 = n;
                            n2 = n4;
                            n3 = n7;
                        }
                        else {
                            final int n8 = n3;
                            n2 = n3;
                            n3 = n8;
                        }
                    }
                    headers2 = headers;
                }
                ++i;
            }
            return new WebSocketExtensions((boolean)(n != 0), a0, b, a2, b2, (boolean)(n2 != 0));
        }
    }
}
