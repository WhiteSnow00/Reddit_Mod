// 
// Decompiled by Procyon v0.6.0
// 

package wa;

public final class g0
{
    public static final g0 b;
    public final boolean a;
    
    static {
        b = new g0(false);
    }
    
    public g0(final boolean a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && g0.class == o.getClass()) {
            if (this.a != ((g0)o).a) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (this.a ^ true) ? 1 : 0;
    }
}
