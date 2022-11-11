// 
// Decompiled by Procyon v0.6.0
// 

package r8;

public final class h implements a<int[]>
{
    public final int a(final Object o) {
        return ((int[])o).length;
    }
    
    public final int b() {
        return 4;
    }
    
    public final String getTag() {
        return "IntegerArrayPool";
    }
    
    public final Object newArray(final int n) {
        return new int[n];
    }
}
