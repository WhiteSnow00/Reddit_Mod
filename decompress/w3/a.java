// 
// Decompiled by Procyon v0.6.0
// 

package w3;

import p3.f;
import q3.i$a;
import android.graphics.Typeface;

public final class a implements Runnable
{
    public final px1.a f;
    public final Typeface g;
    
    public a(final px1.a f, final Typeface g) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void run() {
        final px1.a f = this.f;
        final Typeface g = this.g;
        final f.e g2 = ((i$a)f).G;
        if (g2 != null) {
            g2.d(g);
        }
    }
}
