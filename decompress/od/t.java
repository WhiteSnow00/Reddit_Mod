// 
// Decompiled by Procyon v0.6.0
// 

package od;

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
    
    @Override
    public final byte[] J() {
        synchronized (this) {
            byte[] r;
            if ((r = this.c.get()) == null) {
                r = this.R();
                this.c = new WeakReference<byte[]>(r);
            }
            return r;
        }
    }
    
    public abstract byte[] R();
}
