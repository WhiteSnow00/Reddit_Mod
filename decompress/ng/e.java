// 
// Decompiled by Procyon v0.6.0
// 

package ng;

import android.content.Intent;
import android.app.PendingIntent;
import java.util.List;

public final class e extends c
{
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    public final List<String> f;
    public final List<String> g;
    public final PendingIntent h;
    public final List<Intent> i;
    
    public e(final int a, final int b, final int c, final long d, final long e, final List<String> f, final List<String> g, final PendingIntent h, final List<Intent> i) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public final long a() {
        return this.d;
    }
    
    public final int c() {
        return this.c;
    }
    
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof c) {
            final c c = (c)o;
            if (this.a == c.g() && this.b == c.h() && this.c == c.c() && this.d == c.a() && this.e == c.i()) {
                final List<String> f = this.f;
                if (f == null) {
                    if (c.k() != null) {
                        return false;
                    }
                }
                else if (!f.equals(c.k())) {
                    return false;
                }
                final List<String> g = this.g;
                if (g == null) {
                    if (c.j() != null) {
                        return false;
                    }
                }
                else if (!g.equals(c.j())) {
                    return false;
                }
                final PendingIntent h = this.h;
                if (h == null) {
                    if (c.f() != null) {
                        return false;
                    }
                }
                else if (!h.equals((Object)c.f())) {
                    return false;
                }
                final List<Intent> i = this.i;
                if (i == null) {
                    if (c.l() != null) {
                        return false;
                    }
                }
                else if (!i.equals(c.l())) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
    
    @Deprecated
    public final PendingIntent f() {
        return this.h;
    }
    
    public final int g() {
        return this.a;
    }
    
    public final int h() {
        return this.b;
    }
    
    public final int hashCode() {
        final int a = this.a;
        final int b = this.b;
        final int c = this.c;
        final long d = this.d;
        final long e = this.e;
        final int n = (int)(d >>> 32 ^ d);
        final int n2 = (int)(e >>> 32 ^ e);
        final List<String> f = this.f;
        int hashCode = 0;
        int hashCode2;
        if (f == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = f.hashCode();
        }
        final List<String> g = this.g;
        int hashCode3;
        if (g == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = g.hashCode();
        }
        final PendingIntent h = this.h;
        int hashCode4;
        if (h == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = h.hashCode();
        }
        final List<Intent> i = this.i;
        if (i != null) {
            hashCode = i.hashCode();
        }
        return ((((((((a ^ 0xF4243) * 1000003 ^ b) * 1000003 ^ c) * 1000003 ^ n) * 1000003 ^ n2) * 1000003 ^ hashCode2) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ hashCode;
    }
    
    public final long i() {
        return this.e;
    }
    
    public final List<String> j() {
        return this.g;
    }
    
    public final List<String> k() {
        return this.f;
    }
    
    public final List<Intent> l() {
        return this.i;
    }
    
    public final String toString() {
        final int a = this.a;
        final int b = this.b;
        final int c = this.c;
        final long d = this.d;
        final long e = this.e;
        final String value = String.valueOf(this.f);
        final String value2 = String.valueOf(this.g);
        final String value3 = String.valueOf(this.h);
        final String value4 = String.valueOf(this.i);
        final StringBuilder sb = new StringBuilder(value.length() + 251 + value2.length() + value3.length() + value4.length());
        sb.append("SplitInstallSessionState{sessionId=");
        sb.append(a);
        sb.append(", status=");
        sb.append(b);
        sb.append(", errorCode=");
        sb.append(c);
        sb.append(", bytesDownloaded=");
        sb.append(d);
        sb.append(", totalBytesToDownload=");
        sb.append(e);
        sb.append(", moduleNamesNullable=");
        d.B(sb, value, ", languagesNullable=", value2, ", resolutionIntent=");
        return a.j(sb, value3, ", splitFileIntents=", value4, "}");
    }
}
