// 
// Decompiled by Procyon v0.6.0
// 

package c80;

import y90.e0;
import ne0.c;
import w90.kl;
import r20.b;
import kz0.k;
import w90.nk;
import ah2.f;
import w90.cu;
import zg2.a;
import javax.inject.Inject;
import w90.oh;
import pg2.j;
import com.reddit.debug.logging.DataLoggingActivity;
import w90.yt;

public final class e implements yt<DataLoggingActivity, j>
{
    public final d a;
    
    @Inject
    public e(final oh a) {
        this.a = (d)a;
    }
    
    public final cu inject(final Object o, final a a) {
        final DataLoggingActivity dataLoggingActivity = (DataLoggingActivity)o;
        f.f((Object)dataLoggingActivity, "target");
        f.f((Object)a, "factory");
        final oh oh = (oh)this.a;
        oh.getClass();
        final kl a2 = oh.a;
        final nk nk = new nk(a2);
        final c f3 = ((e0)a2.a).f3();
        k.N((Object)f3);
        dataLoggingActivity.g = f3;
        ((e0)a2.a).o1();
        dataLoggingActivity.h = (r20.c)r20.e.a;
        ((e0)a2.a).K5();
        dataLoggingActivity.i = (r20.a)b.a;
        final s40.d b4 = ((e0)a2.a).B4();
        k.N((Object)b4);
        dataLoggingActivity.j = b4;
        return new cu((Object)nk);
    }
}
