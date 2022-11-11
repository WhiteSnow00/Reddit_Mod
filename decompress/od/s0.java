// 
// Decompiled by Procyon v0.6.0
// 

package od;

import de.f;

public final class s0 implements a
{
    public final /* synthetic */ e a;
    
    public s0(final e a) {
        this.a = a;
    }
    
    @Override
    public final void a(final boolean b) {
        final f s = this.a.s;
        s.sendMessage(s.obtainMessage(1, (Object)b));
    }
}
