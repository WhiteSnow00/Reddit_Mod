// 
// Decompiled by Procyon v0.6.0
// 

package w3;

import q3.i$a;
import android.os.Handler;
import px1.a;

public final class c
{
    public final a a;
    public final Handler b;
    
    public c(final i$a a, final Handler b) {
        this.a = (a)a;
        this.b = b;
    }
    
    public final void a(final k.a a) {
        final int b = a.b;
        if (b == 0) {
            this.b.post((Runnable)new w3.a(this.a, a.a));
        }
        else {
            this.b.post((Runnable)new b(this.a, b));
        }
    }
}
