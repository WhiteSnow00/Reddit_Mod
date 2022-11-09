// 
// Decompiled by Procyon v0.6.0
// 

package z0;

public final class s0 implements a1<Object>
{
    public static final s0 a;
    
    static {
        a = new s0();
    }
    
    public final boolean a(final Object o, final Object o2) {
        return o == o2;
    }
    
    @Override
    public final String toString() {
        return "ReferentialEqualityPolicy";
    }
}
