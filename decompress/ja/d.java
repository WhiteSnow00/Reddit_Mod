// 
// Decompiled by Procyon v0.6.0
// 

package ja;

import java.util.Arrays;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;

public final class d extends h
{
    public final long a;
    public final Integer b;
    public final long c;
    public final byte[] d;
    public final String e;
    public final long f;
    public final NetworkConnectionInfo g;
    
    public d(final long a, final Integer b, final long c, final byte[] d, final String e, final long f, final NetworkConnectionInfo g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public final Integer a() {
        return this.b;
    }
    
    public final long b() {
        return this.a;
    }
    
    public final long c() {
        return this.c;
    }
    
    public final NetworkConnectionInfo d() {
        return this.g;
    }
    
    public final byte[] e() {
        return this.d;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof h) {
            final h h = (h)o;
            if (this.a == h.b()) {
                final Integer b2 = this.b;
                if (b2 == null) {
                    if (h.a() != null) {
                        return false;
                    }
                }
                else if (!b2.equals(h.a())) {
                    return false;
                }
                if (this.c == h.c()) {
                    final byte[] d = this.d;
                    byte[] array;
                    if (h instanceof d) {
                        array = ((d)h).d;
                    }
                    else {
                        array = h.e();
                    }
                    if (Arrays.equals(d, array)) {
                        final String e = this.e;
                        if (e == null) {
                            if (h.f() != null) {
                                return false;
                            }
                        }
                        else if (!e.equals(h.f())) {
                            return false;
                        }
                        if (this.f == h.g()) {
                            final NetworkConnectionInfo g = this.g;
                            if (g == null) {
                                if (h.d() == null) {
                                    return b;
                                }
                            }
                            else if (g.equals(h.d())) {
                                return b;
                            }
                        }
                    }
                }
            }
            b = false;
            return b;
        }
        return false;
    }
    
    public final String f() {
        return this.e;
    }
    
    public final long g() {
        return this.f;
    }
    
    public final int hashCode() {
        final long a = this.a;
        final int n = (int)(a ^ a >>> 32);
        final Integer b = this.b;
        int hashCode = 0;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        final long c = this.c;
        final int n2 = (int)(c ^ c >>> 32);
        final int hashCode3 = Arrays.hashCode(this.d);
        final String e = this.e;
        int hashCode4;
        if (e == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = e.hashCode();
        }
        final long f = this.f;
        final int n3 = (int)(f >>> 32 ^ f);
        final NetworkConnectionInfo g = this.g;
        if (g != null) {
            hashCode = g.hashCode();
        }
        return ((((((n ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ n2) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ n3) * 1000003 ^ hashCode;
    }
    
    public final String toString() {
        final StringBuilder t = a.t("LogEvent{eventTimeMs=");
        t.append(this.a);
        t.append(", eventCode=");
        t.append(this.b);
        t.append(", eventUptimeMs=");
        t.append(this.c);
        t.append(", sourceExtension=");
        t.append(Arrays.toString(this.d));
        t.append(", sourceExtensionJsonProto3=");
        t.append(this.e);
        t.append(", timezoneOffsetSeconds=");
        t.append(this.f);
        t.append(", networkConnectionInfo=");
        t.append(this.g);
        t.append("}");
        return t.toString();
    }
    
    public static final class a extends h$a
    {
        public Long a;
        public Integer b;
        public Long c;
        public byte[] d;
        public String e;
        public Long f;
        public NetworkConnectionInfo g;
    }
}
