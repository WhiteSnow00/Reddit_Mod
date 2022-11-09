// 
// Decompiled by Procyon v0.6.0
// 

package ja;

import com.google.android.datatransport.cct.internal.QosTier;
import java.util.List;
import com.google.android.datatransport.cct.internal.ClientInfo;

public final class e extends i
{
    public final long a;
    public final long b;
    public final ClientInfo c;
    public final Integer d;
    public final String e;
    public final List<h> f;
    public final QosTier g;
    
    public e() {
        throw null;
    }
    
    public e(final long a, final long b, final ClientInfo c, final Integer d, final String e, final List f, final QosTier g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final ClientInfo a() {
        return this.c;
    }
    
    @Override
    public final List<h> b() {
        return this.f;
    }
    
    @Override
    public final Integer c() {
        return this.d;
    }
    
    @Override
    public final String d() {
        return this.e;
    }
    
    @Override
    public final QosTier e() {
        return this.g;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof i) {
            final i i = (i)o;
            if (this.a == i.f() && this.b == i.g()) {
                final ClientInfo c = this.c;
                if (c == null) {
                    if (i.a() != null) {
                        return false;
                    }
                }
                else if (!c.equals(i.a())) {
                    return false;
                }
                final Integer d = this.d;
                if (d == null) {
                    if (i.c() != null) {
                        return false;
                    }
                }
                else if (!d.equals(i.c())) {
                    return false;
                }
                final String e = this.e;
                if (e == null) {
                    if (i.d() != null) {
                        return false;
                    }
                }
                else if (!e.equals(i.d())) {
                    return false;
                }
                final List<h> f = this.f;
                if (f == null) {
                    if (i.b() != null) {
                        return false;
                    }
                }
                else if (!f.equals(i.b())) {
                    return false;
                }
                final QosTier g = this.g;
                if (g == null) {
                    if (i.e() == null) {
                        return b;
                    }
                }
                else if (g.equals(i.e())) {
                    return b;
                }
            }
            b = false;
            return b;
        }
        return false;
    }
    
    @Override
    public final long f() {
        return this.a;
    }
    
    @Override
    public final long g() {
        return this.b;
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        final int n = (int)(a ^ a >>> 32);
        final long b = this.b;
        final int n2 = (int)(b >>> 32 ^ b);
        final ClientInfo c = this.c;
        int hashCode = 0;
        int hashCode2;
        if (c == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = c.hashCode();
        }
        final Integer d = this.d;
        int hashCode3;
        if (d == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = d.hashCode();
        }
        final String e = this.e;
        int hashCode4;
        if (e == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = e.hashCode();
        }
        final List<h> f = this.f;
        int hashCode5;
        if (f == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = f.hashCode();
        }
        final QosTier g = this.g;
        if (g != null) {
            hashCode = g.hashCode();
        }
        return ((((((n ^ 0xF4243) * 1000003 ^ n2) * 1000003 ^ hashCode2) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ hashCode5) * 1000003 ^ hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("LogRequest{requestTimeMs=");
        k.append(this.a);
        k.append(", requestUptimeMs=");
        k.append(this.b);
        k.append(", clientInfo=");
        k.append(this.c);
        k.append(", logSource=");
        k.append(this.d);
        k.append(", logSourceName=");
        k.append(this.e);
        k.append(", logEvents=");
        k.append(this.f);
        k.append(", qosTier=");
        k.append(this.g);
        k.append("}");
        return k.toString();
    }
    
    public static final class a extends i.a
    {
        public Long a;
        public Long b;
        public ClientInfo c;
        public Integer d;
        public String e;
        public List<h> f;
        public QosTier g;
    }
}
