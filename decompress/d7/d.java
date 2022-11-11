// 
// Decompiled by Procyon v0.6.0
// 

package d7;

public final class d
{
    public float a;
    public float b;
    
    public d() {
        this(1.0f, 1.0f);
    }
    
    public d(final float a, final float b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("x");
        sb.append(this.b);
        return sb.toString();
    }
}
