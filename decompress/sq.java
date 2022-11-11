// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import java.util.Map;
import d00.c;
import af2.e;
import af2.h;
import com.reddit.domain.model.mod.SchedulePostModel;
import com.reddit.screen.BaseScreen;
import c41.b;
import ri0.a0;
import javax.inject.Provider;
import je0.u;

public final class sq implements du
{
    public final u a;
    public final kl b;
    public Provider<a0> c;
    public Provider<b> d;
    
    public sq(final kl b, final BaseScreen baseScreen, final SchedulePostModel schedulePostModel, final u a) {
        this.b = b;
        this.a = a;
        this.c = (Provider<a0>)h.a((Provider)qb0.b.c((Provider)b.F));
        this.d = (Provider<b>)af2.c.b((Provider)d00.c.d((Provider)iv0.b.b((Provider)e.a((Object)baseScreen)), (Provider)b.P));
    }
    
    public final Map<Class<?>, yt<?, ?>> getSubFeatureInjectors() {
        return this.b.k();
    }
}
