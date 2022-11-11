// 
// Decompiled by Procyon v0.6.0
// 

package md;

import java.lang.ref.WeakReference;

public abstract class t extends r
{
    public static final WeakReference<byte[]> d;
    public WeakReference<byte[]> c;
    
    static {
        d = new WeakReference<byte[]>(null);
    }
    
    public t(final byte[] array) {
        super(array);
        this.c = t.d;
    }
    
    public final byte[] N() {
        synchronized (this) {
            byte[] x;
            if ((x = this.c.get()) == null) {
                x = this.X();
                this.c = new WeakReference<byte[]>(x);
            }
            return x;
        }
    }
    
    public abstract byte[] X();
}
