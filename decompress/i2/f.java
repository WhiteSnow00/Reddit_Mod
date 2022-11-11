// 
// Decompiled by Procyon v0.6.0
// 

package i2;

import sg2.e;
import androidx.compose.ui.text.platform.a;

public final class f
{
    public final g a;
    public final int b;
    public final int c;
    
    public f(final a a, final int b, final int c) {
        this.a = (g)a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof f)) {
            return false;
        }
        final f f = (f)o;
        return e.a((Object)this.a, (Object)f.a) && this.b == f.b && this.c == f.c;
    }
    
    @Override
    public final int hashCode() {
        return Integer.hashCode(this.c) + a.c(this.b, this.a.hashCode() * 31, 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("ParagraphIntrinsicInfo(intrinsics=");
        r.append(this.a);
        r.append(", startIndex=");
        r.append(this.b);
        r.append(", endIndex=");
        return d.l(r, this.c, ')');
    }
}
