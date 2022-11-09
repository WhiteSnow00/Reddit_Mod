// 
// Decompiled by Procyon v0.6.0
// 

package re;

import u5.w;
import j0.i;
import j0.b;

public final class a implements Runnable
{
    public final /* synthetic */ String f;
    public final /* synthetic */ long g;
    public final /* synthetic */ j1 h;
    
    public a(final j1 h, final String f, final long g) {
        this.h = h;
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void run() {
        final j1 h = this.h;
        final String f = this.f;
        final long g = this.g;
        h.y();
        yd.a.P0(f);
        if (((i)h.h).isEmpty()) {
            h.i = g;
        }
        final Integer n = (Integer)((i)h.h).getOrDefault((Object)f, (Object)null);
        if (n != null) {
            ((i)h.h).put((Object)f, (Object)(n + 1));
        }
        else {
            final b h2 = h.h;
            if (((i)h2).h >= 100) {
                ((h4)((w)h).f).f().n.a("Too many ads visible");
            }
            else {
                ((i)h2).put((Object)f, (Object)1);
                ((i)h.g).put((Object)f, (Object)g);
            }
        }
    }
}
