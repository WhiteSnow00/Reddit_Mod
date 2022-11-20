// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import o2.t;

public final class e0 implements c1
{
    public final t a;
    
    public e0(final t a) {
        this.a = a;
    }
    
    @Override
    public final void J0() {
        this.a.a.c();
    }
    
    @Override
    public final void show() {
        final t a = this.a;
        if (a.b.get() != null) {
            a.a.d();
        }
    }
}
