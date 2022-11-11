// 
// Decompiled by Procyon v0.6.0
// 

package pa;

import ta.c;
import ta.a;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import ra.d;
import android.content.Context;
import javax.inject.Provider;
import qa.o;
import ma.b;

public final class g implements b<o>
{
    public final Provider<Context> a;
    public final Provider<d> b;
    public final Provider<SchedulerConfig> c;
    public final Provider<a> d;
    
    public g(final Provider a, final Provider b, final f c) {
        final c a2 = ta.c.a.a;
        this.a = (Provider<Context>)a;
        this.b = (Provider<d>)b;
        this.c = (Provider<SchedulerConfig>)c;
        this.d = (Provider<a>)a2;
    }
    
    public final Object get() {
        final Context context = (Context)this.a.get();
        final d d = (d)this.b.get();
        final SchedulerConfig schedulerConfig = (SchedulerConfig)this.c.get();
        final a a = (a)this.d.get();
        return new qa.b(context, d, schedulerConfig);
    }
}
