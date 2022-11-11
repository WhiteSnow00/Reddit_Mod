// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import ie.c1;
import android.content.Intent;
import lw0.b;
import android.content.Context;

public final class r6
{
    public final Context a;
    
    public r6(final Context a) {
        b.R((Object)a);
        this.a = a;
    }
    
    public final void a(final Intent intent) {
        if (intent == null) {
            this.c().k.a("onRebind called with null intent");
            return;
        }
        this.c().s.b((Object)intent.getAction(), "onRebind called. action");
    }
    
    public final void b(final Intent intent) {
        if (intent == null) {
            this.c().k.a("onUnbind called with null intent");
            return;
        }
        this.c().s.b((Object)intent.getAction(), "onUnbind called for intent. action");
    }
    
    public final d3 c() {
        return h4.s(this.a, (c1)null, (Long)null).h();
    }
}
