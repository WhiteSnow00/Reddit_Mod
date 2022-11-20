// 
// Decompiled by Procyon v0.6.0
// 

package qc2;

import java.io.IOException;
import fc2.a0;

public final class a implements Runnable
{
    public final c f;
    
    public a(final c f) {
        this.f = f;
    }
    
    @Override
    public final void run() {
        try {
            while (this.f.g()) {}
        }
        catch (final IOException ex) {
            this.f.c((Exception)ex, (a0)null);
        }
    }
}
