// 
// Decompiled by Procyon v0.6.0
// 

package lc2;

import gc2.b;
import com.sendbird.android.shadow.okio.ByteString;

public final class a
{
    public static final ByteString d;
    public static final ByteString e;
    public static final ByteString f;
    public static final ByteString g;
    public static final ByteString h;
    public static final ByteString i;
    public final ByteString a;
    public final ByteString b;
    public final int c;
    
    static {
        d = ByteString.encodeUtf8(":");
        e = ByteString.encodeUtf8(":status");
        f = ByteString.encodeUtf8(":method");
        g = ByteString.encodeUtf8(":path");
        h = ByteString.encodeUtf8(":scheme");
        i = ByteString.encodeUtf8(":authority");
    }
    
    public a(final ByteString a, final ByteString b) {
        this.a = a;
        this.b = b;
        this.c = b.size() + (a.size() + 32);
    }
    
    public a(final ByteString byteString, final String s) {
        this(byteString, ByteString.encodeUtf8(s));
    }
    
    public a(final String s, final String s2) {
        this(ByteString.encodeUtf8(s), ByteString.encodeUtf8(s2));
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = o instanceof a;
        boolean b3;
        final boolean b2 = b3 = false;
        if (b) {
            final a a = (a)o;
            b3 = b2;
            if (this.a.equals((Object)a.a)) {
                b3 = b2;
                if (this.b.equals((Object)a.b)) {
                    b3 = true;
                }
            }
        }
        return b3;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() + 527) * 31;
    }
    
    @Override
    public final String toString() {
        return gc2.b.l("%s: %s", this.a.utf8(), this.b.utf8());
    }
}
