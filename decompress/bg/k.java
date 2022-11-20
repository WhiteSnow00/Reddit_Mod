// 
// Decompiled by Procyon v0.6.0
// 

package bg;

import uf.a;
import uf.c;
import android.graphics.RectF;

public final class k
{
    public final RectF a;
    public final RectF b;
    public final float c;
    public final float d;
    public final float e;
    
    public k(final RectF a, final RectF b, final float c, final float d, final float e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final a a(final c c, final c c2) {
        return new a(l.c(c.a(this.a), c2.a(this.b), this.c, this.d, this.e));
    }
}
