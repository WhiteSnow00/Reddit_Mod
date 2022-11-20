// 
// Decompiled by Procyon v0.6.0
// 

package c8;

import com.bluelinelabs.conductor.Router;

public final class c implements Runnable
{
    public final Router f;
    
    public c(final Router f) {
        this.f = f;
    }
    
    @Override
    public final void run() {
        final Router f = this.f;
        f.f = true;
        f.A();
    }
}
