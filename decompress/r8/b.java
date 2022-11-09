// 
// Decompiled by Procyon v0.6.0
// 

package r8;

import com.bumptech.glide.load.engine.a$a;
import com.bumptech.glide.load.engine.a;

public final class b implements Runnable
{
    public final /* synthetic */ a f;
    
    public b(final a f) {
        this.f = f;
    }
    
    @Override
    public final void run() {
        final a f = this.f;
        f.getClass();
    Label_0010_Outer:
        while (true) {
            while (true) {
                try {
                    while (true) {
                        f.b((a$a)f.c.remove());
                    }
                }
                catch (final InterruptedException ex) {
                    Thread.currentThread().interrupt();
                    continue Label_0010_Outer;
                }
                continue;
            }
        }
    }
}
