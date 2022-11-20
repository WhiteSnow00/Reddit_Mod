// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.http2;

import ng2.e;
import okio.ByteString$a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.ByteString;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0006\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0006\u0012\u0006\u0010\u0004\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000b\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0006H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00062\b\b\u0002\u0010\u0004\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\nH\u00d6\u0001J\b\u0010\u0012\u001a\u00020\u0003H\u0016R\u0010\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014" }, d2 = { "Lokhttp3/internal/http2/Header;", "", "name", "", "value", "(Ljava/lang/String;Ljava/lang/String;)V", "Lokio/ByteString;", "(Lokio/ByteString;Ljava/lang/String;)V", "(Lokio/ByteString;Lokio/ByteString;)V", "hpackSize", "", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "okhttp" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
public final class Header
{
    public static final Companion Companion;
    public static final ByteString PSEUDO_PREFIX;
    public static final ByteString RESPONSE_STATUS;
    public static final String RESPONSE_STATUS_UTF8 = ":status";
    public static final ByteString TARGET_AUTHORITY;
    public static final String TARGET_AUTHORITY_UTF8 = ":authority";
    public static final ByteString TARGET_METHOD;
    public static final String TARGET_METHOD_UTF8 = ":method";
    public static final ByteString TARGET_PATH;
    public static final String TARGET_PATH_UTF8 = ":path";
    public static final ByteString TARGET_SCHEME;
    public static final String TARGET_SCHEME_UTF8 = ":scheme";
    public final int hpackSize;
    public final ByteString name;
    public final ByteString value;
    
    static {
        Companion = new Companion(null);
        ByteString.Companion.getClass();
        PSEUDO_PREFIX = ByteString$a.c(":");
        RESPONSE_STATUS = ByteString$a.c(":status");
        TARGET_METHOD = ByteString$a.c(":method");
        TARGET_PATH = ByteString$a.c(":path");
        TARGET_SCHEME = ByteString$a.c(":scheme");
        TARGET_AUTHORITY = ByteString$a.c(":authority");
    }
    
    public Header(final String s, final String s2) {
        e.f((Object)s, "name");
        e.f((Object)s2, "value");
        ByteString.Companion.getClass();
        this(ByteString$a.c(s), ByteString$a.c(s2));
    }
    
    public Header(final ByteString byteString, final String s) {
        e.f((Object)byteString, "name");
        e.f((Object)s, "value");
        ByteString.Companion.getClass();
        this(byteString, ByteString$a.c(s));
    }
    
    public Header(final ByteString name, final ByteString value) {
        e.f((Object)name, "name");
        e.f((Object)value, "value");
        this.name = name;
        this.value = value;
        this.hpackSize = value.size() + (name.size() + 32);
    }
    
    public static Header copy$default(final Header header, ByteString name, ByteString value, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            name = header.name;
        }
        if ((n & 0x2) != 0x0) {
            value = header.value;
        }
        return header.copy(name, value);
    }
    
    public final ByteString component1() {
        return this.name;
    }
    
    public final ByteString component2() {
        return this.value;
    }
    
    public final Header copy(final ByteString byteString, final ByteString byteString2) {
        e.f((Object)byteString, "name");
        e.f((Object)byteString2, "value");
        return new Header(byteString, byteString2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Header)) {
            return false;
        }
        final Header header = (Header)o;
        return e.a((Object)this.name, (Object)header.name) && e.a((Object)this.value, (Object)header.value);
    }
    
    @Override
    public int hashCode() {
        return this.value.hashCode() + this.name.hashCode() * 31;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.name.utf8());
        sb.append(": ");
        sb.append(this.value.utf8());
        return sb.toString();
    }
    
    @Metadata(d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010" }, d2 = { "Lokhttp3/internal/http2/Header$Companion;", "", "()V", "PSEUDO_PREFIX", "Lokio/ByteString;", "RESPONSE_STATUS", "RESPONSE_STATUS_UTF8", "", "TARGET_AUTHORITY", "TARGET_AUTHORITY_UTF8", "TARGET_METHOD", "TARGET_METHOD_UTF8", "TARGET_PATH", "TARGET_PATH_UTF8", "TARGET_SCHEME", "TARGET_SCHEME_UTF8", "okhttp" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        public Companion(final DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
