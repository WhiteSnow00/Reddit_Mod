// 
// Decompiled by Procyon v0.6.0
// 

package e8;

import com.bluelinelabs.conductor.b;
import com.bluelinelabs.conductor.c;

public final class k implements Runnable
{
    public final /* synthetic */ c.c f;
    
    public k(final b f) {
        this.f = (c.c)f;
    }
    
    @Override
    public final void run() {
        ((b)this.f).a();
    }
}
