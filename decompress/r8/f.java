// 
// Decompiled by Procyon v0.6.0
// 

package r8;

public final class f implements a<byte[]>
{
    public final int a(final Object o) {
        return ((byte[])o).length;
    }
    
    public final int b() {
        return 1;
    }
    
    public final String getTag() {
        return "ByteArrayPool";
    }
    
    public final Object newArray(final int n) {
        return new byte[n];
    }
}
