// 
// Decompiled by Procyon v0.6.0
// 

package z0;

import a1.a;
import pg2.j;
import zg2.p;

public final class r0 implements q0
{
    public int a;
    public i b;
    public b c;
    public p<? super d, ? super Integer, j> d;
    public int e;
    public a f;
    public a1.b g;
    
    public r0(final i b) {
        this.b = b;
    }
    
    @Override
    public final void invalidate() {
        final i b = this.b;
        if (b != null) {
            b.m(this, null);
        }
    }
}
