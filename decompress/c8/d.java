// 
// Decompiled by Procyon v0.6.0
// 

package c8;

import com.bluelinelabs.conductor.Router;

public final class d implements Runnable
{
    public final Router f;
    
    public d(final Router f) {
        this.f = f;
    }
    
    @Override
    public final void run() {
        this.f.A();
    }
}
