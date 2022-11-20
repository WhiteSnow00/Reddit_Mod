// 
// Decompiled by Procyon v0.6.0
// 

package je;

import android.os.Bundle;
import yd.a;
import yd.b;
import mg.d0;
import android.app.Activity;

public final class c1 extends r1
{
    public final int j;
    public final Object k;
    public final Object l;
    
    public c1(final w1 k, final Activity l) {
        this.j = 3;
        this.k = k;
        this.l = l;
        super(k.f, true);
    }
    
    public c1(final x1 k, final Object l, final int j) {
        this.j = j;
        this.k = k;
        this.l = l;
        super(k, true);
    }
    
    public final void a() {
        switch (this.j) {
            default: {
                final r0 f = ((w1)this.k).f.f;
                d0.y((Object)f);
                f.onActivityStopped((a)new b(this.l), super.g);
                return;
            }
            case 2: {
                final r0 f2 = ((x1)this.k).f;
                d0.y((Object)f2);
                f2.getCurrentScreenName((u0)this.l);
                return;
            }
            case 1: {
                final r0 f3 = ((x1)this.k).f;
                d0.y((Object)f3);
                f3.beginAdUnitExposure((String)this.l, super.g);
                return;
            }
            case 0: {
                final r0 f4 = ((x1)this.k).f;
                d0.y((Object)f4);
                f4.setConditionalUserProperty((Bundle)this.l, super.f);
            }
        }
    }
    
    public final void b() {
        switch (this.j) {
            default: {
                return;
            }
            case 2: {
                ((n0)this.l).b((Bundle)null);
            }
        }
    }
}
