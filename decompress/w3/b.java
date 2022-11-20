// 
// Decompiled by Procyon v0.6.0
// 

package w3;

import p3.f;
import q3.i$a;
import px1.a;

public final class b implements Runnable
{
    public final a f;
    public final int g;
    
    public b(final a f, final int g) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void run() {
        final a f = this.f;
        final int g = this.g;
        final f.e g2 = ((i$a)f).G;
        if (g2 != null) {
            g2.c(g);
        }
    }
}
