// 
// Decompiled by Procyon v0.6.0
// 

package ke;

public final class o5
{
    public final Object a;
    public final int b;
    
    public o5(final Object a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof o5)) {
            return false;
        }
        final o5 o2 = (o5)o;
        return this.a == o2.a && this.b == o2.b;
    }
    
    @Override
    public final int hashCode() {
        return System.identityHashCode(this.a) * 65535 + this.b;
    }
}
