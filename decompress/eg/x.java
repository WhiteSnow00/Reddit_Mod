// 
// Decompiled by Procyon v0.6.0
// 

package eg;

import androidx.viewpager.widget.c;
import a40.f;
import com.google.android.play.core.assetpacks.AssetPackState;

public final class x extends AssetPackState
{
    public final String a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    public final int f;
    public final int g;
    public final String h;
    public final String i;
    
    public x(final String a, final int b, final int c, final long d, final long e, final int f, final int g, final String h, final String i) {
        if (a == null) {
            throw new NullPointerException("Null name");
        }
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        if (h == null) {
            throw new NullPointerException("Null availableVersionTag");
        }
        this.h = h;
        if (i != null) {
            this.i = i;
            return;
        }
        throw new NullPointerException("Null installedVersionTag");
    }
    
    @Override
    public final long a() {
        return this.d;
    }
    
    @Override
    public final int b() {
        return this.c;
    }
    
    @Override
    public final String c() {
        return this.a;
    }
    
    @Override
    public final int d() {
        return this.b;
    }
    
    @Override
    public final long e() {
        return this.e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof AssetPackState) {
            final AssetPackState assetPackState = (AssetPackState)o;
            if (this.a.equals(assetPackState.c()) && this.b == assetPackState.d() && this.c == assetPackState.b() && this.d == assetPackState.a() && this.e == assetPackState.e() && this.f == assetPackState.f() && this.g == assetPackState.g() && this.h.equals(assetPackState.j()) && this.i.equals(assetPackState.k())) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int f() {
        return this.f;
    }
    
    @Override
    public final int g() {
        return this.g;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int b = this.b;
        final int c = this.c;
        final long d = this.d;
        final long e = this.e;
        return ((((((((hashCode ^ 0xF4243) * 1000003 ^ b) * 1000003 ^ c) * 1000003 ^ (int)(d >>> 32 ^ d)) * 1000003 ^ (int)(e >>> 32 ^ e)) * 1000003 ^ this.f) * 1000003 ^ this.g) * 1000003 ^ this.h.hashCode()) * 1000003 ^ this.i.hashCode();
    }
    
    @Override
    public final String j() {
        return this.h;
    }
    
    @Override
    public final String k() {
        return this.i;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final int b = this.b;
        final int c = this.c;
        final long d = this.d;
        final long e = this.e;
        final int f = this.f;
        final int g = this.g;
        final String h = this.h;
        final String i = this.i;
        final StringBuilder sb = new StringBuilder(a40.f.f(a.length(), 261, h.length(), i.length()));
        sb.append("AssetPackState{name=");
        sb.append(a);
        sb.append(", status=");
        sb.append(b);
        sb.append(", errorCode=");
        sb.append(c);
        sb.append(", bytesDownloaded=");
        sb.append(d);
        sb.append(", totalBytesToDownload=");
        sb.append(e);
        sb.append(", transferProgressPercentage=");
        androidx.viewpager.widget.c.s(sb, f, ", updateAvailability=", g, ", availableVersionTag=");
        return a.j(sb, h, ", installedVersionTag=", i, "}");
    }
}
