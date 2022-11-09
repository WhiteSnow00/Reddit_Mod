// 
// Decompiled by Procyon v0.6.0
// 

package ke;

import com.google.android.gms.internal.measurement.zzmm;
import com.google.android.gms.internal.measurement.zzko;
import java.io.IOException;
import ie.e;

public class z5<MessageType extends c6<MessageType, BuilderType>, BuilderType extends z5<MessageType, BuilderType>> extends c5<MessageType, BuilderType>
{
    public final c6 f;
    public c6 g;
    public boolean h;
    
    public z5(final MessageType f) {
        this.f = f;
        this.g = (c6)f.q(4);
        this.h = false;
    }
    
    public final z5 g() {
        final z5 z5 = (z5)this.f.q(5);
        z5.h(this.k());
        return z5;
    }
    
    public final void h(final c6 c6) {
        if (this.h) {
            this.l();
            this.h = false;
        }
        final c6 g = this.g;
        h7.c.a(g.getClass()).d(g, c6);
    }
    
    public final void i(final byte[] array, final int n, final p5 p3) throws zzko {
        if (this.h) {
            this.l();
            this.h = false;
        }
        try {
            h7.c.a(this.g.getClass()).h(this.g, array, 0, n, new e(p3));
        }
        catch (final IOException ex) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", ex);
        }
        catch (final IndexOutOfBoundsException ex2) {
            throw zzko.zzf();
        }
        catch (final zzko zzko) {
            throw zzko;
        }
    }
    
    public final MessageType j() {
        final c6 k = this.k();
        final byte byteValue = (byte)k.q(1);
        if (byteValue != 1) {
            if (byteValue != 0) {
                final boolean f = h7.c.a(k.getClass()).f(k);
                k.q(2);
                if (f) {
                    return (MessageType)k;
                }
            }
            throw new zzmm((z6)k);
        }
        return (MessageType)k;
    }
    
    public final MessageType k() {
        if (this.h) {
            return (MessageType)this.g;
        }
        final c6 g = this.g;
        h7.c.a(g.getClass()).a(g);
        this.h = true;
        return (MessageType)this.g;
    }
    
    public final void l() {
        final c6 g = (c6)this.g.q(4);
        h7.c.a(g.getClass()).d(g, this.g);
        this.g = g;
    }
}
