// 
// Decompiled by Procyon v0.6.0
// 

package re;

import u5.w;
import java.util.List;
import android.os.Bundle;

public final class c5 implements Runnable
{
    public final /* synthetic */ int f;
    public final /* synthetic */ long g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ h3 k;
    
    @Override
    public final void run() {
        switch (this.f) {
            default: {
                final x5 x5 = (x5)this.k;
                final Bundle bundle = (Bundle)this.h;
                final t5 t5 = (t5)this.i;
                final t5 t6 = (t5)this.j;
                final long g = this.g;
                bundle.remove("screen_name");
                bundle.remove("screen_class");
                x5.D(t5, t6, g, true, ((h4)((w)x5).f).y().D0("screen_view", bundle, null, false));
                return;
            }
            case 0: {
                ((n5)this.k).O(this.g, this.j, (String)this.h, (String)this.i);
            }
        }
    }
}
