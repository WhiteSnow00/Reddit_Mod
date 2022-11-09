// 
// Decompiled by Procyon v0.6.0
// 

package re;

import u5.w;
import android.os.RemoteException;
import yd.a;
import android.app.job.JobParameters;
import android.os.Bundle;

public final class c6 implements Runnable
{
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g = g;
    public final /* synthetic */ Object h = h;
    public final /* synthetic */ Object i = i;
    
    public c6(final l6 i, final q7 g, final Bundle h) {
        this.f = 0;
        this.i = i;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final void run() {
        switch (this.f) {
            default: {
                final r6 r6 = (r6)this.g;
                final c3 c3 = (c3)this.h;
                final JobParameters jobParameters = (JobParameters)this.i;
                r6.getClass();
                c3.s.a("AppMeasurementJobService processed last upload request.");
                ((q6)r6.a).c(jobParameters);
                return;
            }
            case 0: {
                final l6 l6 = (l6)this.i;
                final t2 i = l6.i;
                if (i == null) {
                    ((h4)((w)l6).f).f().k.a("Failed to send default event parameters to service");
                }
                else {
                    try {
                        a.S0((Object)this.g);
                        i.g1((Bundle)this.h, (q7)this.g);
                    }
                    catch (final RemoteException ex) {
                        ((h4)((w)this.i).f).f().k.b(ex, "Failed to send default event parameters to service");
                    }
                }
            }
        }
    }
}
