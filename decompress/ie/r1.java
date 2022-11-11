// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import android.os.BaseBundle;
import xd.a;
import lw0.b;
import android.app.Activity;
import android.os.Bundle;

public final class r1 extends u1
{
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    
    public r1(final y1 m, final Bundle k, final Activity l) {
        this.j = 1;
        this.m = m;
        this.k = k;
        this.l = l;
        super(m.f, true);
    }
    
    public r1(final z1 m, final String k, final p0 l) {
        this.j = 0;
        this.m = m;
        this.k = k;
        this.l = l;
        super(m, true);
    }
    
    public final void a() {
        switch (this.j) {
            default: {
                Bundle bundle2;
                if (this.k != null) {
                    final Bundle bundle = bundle2 = new Bundle();
                    if (((BaseBundle)this.k).containsKey("com.google.app_measurement.screen_service")) {
                        final Object value = ((BaseBundle)this.k).get("com.google.app_measurement.screen_service");
                        bundle2 = bundle;
                        if (value instanceof Bundle) {
                            bundle.putBundle("com.google.app_measurement.screen_service", (Bundle)value);
                            bundle2 = bundle;
                        }
                    }
                }
                else {
                    bundle2 = null;
                }
                final t0 f = ((y1)this.m).f.f;
                b.R((Object)f);
                f.onActivityCreated((a)new xd.b((Object)this.l), bundle2, super.g);
                return;
            }
            case 0: {
                final t0 f2 = ((z1)this.m).f;
                b.R((Object)f2);
                f2.getMaxUserProperties((String)this.k, (w0)this.l);
            }
        }
    }
    
    public final void b() {
        switch (this.j) {
            default: {
                return;
            }
            case 0: {
                ((p0)this.l).c((Bundle)null);
            }
        }
    }
}
