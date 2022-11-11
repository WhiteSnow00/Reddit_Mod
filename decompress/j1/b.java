// 
// Decompiled by Procyon v0.6.0
// 

package j1;

import u2.i;
import sg2.e;
import androidx.compose.ui.unit.LayoutDirection;

public final class b implements j1.a
{
    public final float a;
    public final float b;
    
    public b(final float a, final float b) {
        this.a = a;
        this.b = b;
    }
    
    public final long a(final long n, final long n2, final LayoutDirection layoutDirection) {
        e.f((Object)layoutDirection, "layoutDirection");
        final float n3 = ((int)(n2 >> 32) - (int)(n >> 32)) / 2.0f;
        final float n4 = (i.b(n2) - i.b(n)) / 2.0f;
        float a;
        if (layoutDirection == LayoutDirection.Ltr) {
            a = this.a;
        }
        else {
            a = -1 * this.a;
        }
        final float n5 = 1;
        return a92.b.j(lw0.b.k2((a + n5) * n3), lw0.b.k2((n5 + this.b) * n4));
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof b)) {
            return false;
        }
        final b b = (b)o;
        return e.a((Object)this.a, (Object)b.a) && e.a((Object)this.b, (Object)b.b);
    }
    
    @Override
    public final int hashCode() {
        return Float.hashCode(this.b) + Float.hashCode(this.a) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("BiasAlignment(horizontalBias=");
        r.append(this.a);
        r.append(", verticalBias=");
        return b.h(r, this.b, ')');
    }
    
    public static final class a implements a$b
    {
        public final float a;
        
        public a(final float a) {
            this.a = a;
        }
        
        public final int a(final int n, final int n2, final LayoutDirection layoutDirection) {
            e.f((Object)layoutDirection, "layoutDirection");
            final float n3 = (n2 - n) / 2.0f;
            float a;
            if (layoutDirection == LayoutDirection.Ltr) {
                a = this.a;
            }
            else {
                a = -1 * this.a;
            }
            return lw0.b.k2((1 + a) * n3);
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof a && e.a((Object)this.a, (Object)((a)o).a));
        }
        
        @Override
        public final int hashCode() {
            return Float.hashCode(this.a);
        }
        
        @Override
        public final String toString() {
            return b.h(a.r("Horizontal(bias="), this.a, ')');
        }
    }
    
    public static final class b implements a$c
    {
        public final float a;
        
        public b(final float a) {
            this.a = a;
        }
        
        public final int a(final int n, final int n2) {
            return lw0.b.k2((1 + this.a) * ((n2 - n) / 2.0f));
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof b && e.a((Object)this.a, (Object)((b)o).a));
        }
        
        @Override
        public final int hashCode() {
            return Float.hashCode(this.a);
        }
        
        @Override
        public final String toString() {
            return b.h(a.r("Vertical(bias="), this.a, ')');
        }
    }
}
