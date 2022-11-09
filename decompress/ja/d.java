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
    
    @Override
    public final Integer a() {
        return this.b;
    }
    
    @Override
    public final long b() {
        return this.a;
    }
    
    @Override
    public final long c() {
        return this.c;
    }
    
    @Override
    public final NetworkConnectionInfo d() {
        return this.g;
    }
    
    @Override
    public final byte[] e() {
        return this.d;
    }
    
    @Override
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
    
    @Override
    public final String f() {
        return this.e;
    }
    
    @Override
    public final long g() {
        return this.f;
    }
    
    @Override
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
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("LogEvent{eventTimeMs=");
        k.append(this.a);
        k.append(", eventCode=");
        k.append(this.b);
        k.append(", eventUptimeMs=");
        k.append(this.c);
        k.append(", sourceExtension=");
        k.append(Arrays.toString(this.d));
        k.append(", sourceExtensionJsonProto3=");
        k.append(this.e);
        k.append(", timezoneOffsetSeconds=");
        k.append(this.f);
        k.append(", networkConnectionInfo=");
        k.append(this.g);
        k.append("}");
        return k.toString();
    }
    
    public static final class a extends h.a
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
