// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import java.util.Map;
import nx0.g;
import cz0.c;
import se2.e;
import se2.h;
import mg0.x;
import com.reddit.domain.model.mod.SchedulePostModel;
import com.reddit.screen.BaseScreen;
import t31.b;
import hi0.a0;
import javax.inject.Provider;
import ae0.u;

public final class mq implements yt
{
    public final u a;
    public final dl b;
    public Provider<a0> c;
    public Provider<b> d;
    
    public mq(final dl b, final BaseScreen baseScreen, final SchedulePostModel schedulePostModel, final u a) {
        this.b = b;
        this.a = a;
        this.c = (Provider<a0>)h.a((Provider)x.a((Provider)b.F));
        this.d = (Provider<b>)se2.c.b((Provider)g.b((Provider)cz0.c.b((Provider)e.a((Object)baseScreen)), (Provider)b.S));
    }
    
    public final Map<Class<?>, tt<?, ?>> getSubFeatureInjectors() {
        return this.b.k();
    }
}
