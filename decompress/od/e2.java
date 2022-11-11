// 
// Decompiled by Procyon v0.6.0
// 

package od;

import pe.u2;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import android.os.RemoteException;
import pe.q7;
import android.os.Bundle;
import lw0.b;
import pe.h4;
import pe.l6;
import pe.q6;
import android.app.job.JobParameters;
import pe.d3;
import pe.r6;

public final class e2 implements Runnable
{
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g = g;
    public final /* synthetic */ Object h = h;
    public final /* synthetic */ Object i = i;
    
    @Override
    public final void run() {
        switch (this.f) {
            default: {
                final r6 r6 = (r6)this.g;
                final d3 d3 = (d3)this.h;
                final JobParameters jobParameters = (JobParameters)this.i;
                r6.getClass();
                d3.s.a("AppMeasurementJobService processed last upload request.");
                ((q6)r6.a).c(jobParameters);
                return;
            }
            case 1: {
                final l6 l6 = (l6)this.i;
                final u2 i = l6.i;
                if (i == null) {
                    ((h4)l6.f).h().k.a("Failed to send default event parameters to service");
                }
                else {
                    try {
                        b.R((Object)this.g);
                        i.V((Bundle)this.h, (q7)this.g);
                    }
                    catch (final RemoteException ex) {
                        ((h4)((l6)this.i).f).h().k.b((Object)ex, "Failed to send default event parameters to service");
                    }
                }
                return;
            }
            case 0: {
                final f2 f2 = (f2)this.i;
                if (f2.g > 0) {
                    final LifecycleCallback lifecycleCallback = (LifecycleCallback)this.g;
                    final Bundle h = f2.h;
                    Bundle bundle;
                    if (h != null) {
                        bundle = h.getBundle((String)this.h);
                    }
                    else {
                        bundle = null;
                    }
                    lifecycleCallback.e(bundle);
                }
                if (((f2)this.i).g >= 2) {
                    ((LifecycleCallback)this.g).h();
                }
                if (((f2)this.i).g >= 3) {
                    ((LifecycleCallback)this.g).f();
                }
                if (((f2)this.i).g >= 4) {
                    ((LifecycleCallback)this.g).i();
                }
                if (((f2)this.i).g >= 5) {
                    this.g.getClass();
                }
            }
        }
    }
}
