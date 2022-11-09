// 
// Decompiled by Procyon v0.6.0
// 

package i60;

import androidx.viewpager.widget.c;
import ah2.f;

public final class i
{
    public final Long a;
    public final long b;
    public final long c;
    
    public i(final long b, final long c) {
        this.a = null;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof i)) {
            return false;
        }
        final i i = (i)o;
        return f.a((Object)this.a, (Object)i.a) && this.b == i.b && this.c == i.c;
    }
    
    @Override
    public final int hashCode() {
        final Long a = this.a;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        return Long.hashCode(this.c) + b.c(this.b, hashCode * 31, 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("KarmaStatisticsDataModel(id=");
        k.append(this.a);
        k.append(", timestamp=");
        k.append(this.b);
        k.append(", karma=");
        return androidx.viewpager.widget.c.k(k, this.c, ')');
    }
}
