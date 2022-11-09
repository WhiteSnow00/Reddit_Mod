// 
// Decompiled by Procyon v0.6.0
// 

package u2;

import ah2.f;

public final class c implements b
{
    public final float f;
    public final float g;
    
    public c(final float f, final float g) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof c)) {
            return false;
        }
        final c c = (c)o;
        return ah2.f.a((Object)this.f, (Object)c.f) && ah2.f.a((Object)this.g, (Object)c.g);
    }
    
    @Override
    public final float getDensity() {
        return this.f;
    }
    
    @Override
    public final float getFontScale() {
        return this.g;
    }
    
    @Override
    public final int hashCode() {
        return Float.hashCode(this.g) + Float.hashCode(this.f) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("DensityImpl(density=");
        k.append(this.f);
        k.append(", fontScale=");
        return androidx.viewpager.widget.c.j(k, this.g, ')');
    }
}
