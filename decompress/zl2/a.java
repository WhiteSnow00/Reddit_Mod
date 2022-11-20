// 
// Decompiled by Procyon v0.6.0
// 

package zl2;

public final class a extends fl2.a
{
    public int f;
    public byte[] g;
    
    public a(final int f, final byte[] array) {
        final int length = array.length;
        int n;
        if (f != 5) {
            if (f != 6) {
                throw new IllegalArgumentException(d.h("unknown security category: ", f));
            }
            n = 12352;
        }
        else {
            n = 5184;
        }
        if (length == n) {
            this.f = f;
            this.g = nm2.a.a(array);
            return;
        }
        throw new IllegalArgumentException("invalid key size for security category");
    }
}
