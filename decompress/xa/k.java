// 
// Decompiled by Procyon v0.6.0
// 

package xa;

public final class k
{
    public final int a;
    public final float b;
    
    public k() {
        this.a = 0;
        this.b = 0.0f;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && k.class == o.getClass()) {
            final k k = (k)o;
            if (this.a != k.a || Float.compare(k.b, this.b) != 0) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Float.floatToIntBits(this.b) + (527 + this.a) * 31;
    }
}
