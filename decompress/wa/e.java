// 
// Decompiled by Procyon v0.6.0
// 

package wa;

import com.google.android.exoplayer2.source.i$a;
import sg.j;

public final class e implements j
{
    public final int f;
    public final Object g;
    
    public e(final Object g, final int f) {
        this.f = f;
        this.g = g;
    }
    
    public final Object get() {
        switch (this.f) {
            default: {
                final Class clazz = (Class)this.g;
                try {
                    return clazz.getConstructor((Class[])new Class[0]).newInstance(new Object[0]);
                }
                catch (final Exception ex) {
                    throw new IllegalStateException(ex);
                }
                break;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
