// 
// Decompiled by Procyon v0.6.0
// 

package ld;

public final class b
{
    public int a;
    
    public b() {
        this.a = 1;
    }
    
    public final void a(final Object o) {
        final int a = this.a;
        int hashCode;
        if (o == null) {
            hashCode = 0;
        }
        else {
            hashCode = o.hashCode();
        }
        this.a = a * 31 + hashCode;
    }
}
