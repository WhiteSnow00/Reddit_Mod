// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import tl1.q;
import ah2.f;
import af2.e;
import ew1.d$a;
import af2.c;
import com.reddit.screen.settings.preferences.PreferencesFragment;
import tl1.b;
import com.reddit.domain.media.usecase.VideoLogsUseCase;
import com.reddit.search.ui.debug.SearchImpressionIdDebugToaster;
import zi0.a;
import javax.inject.Provider;

public final class ip
{
    public Provider<a> a;
    public Provider<SearchImpressionIdDebugToaster> b;
    public Provider<VideoLogsUseCase> c;
    public Provider<b> d;
    public Provider<tl1.a> e;
    
    public ip(final kl kl, final PreferencesFragment preferencesFragment) {
        this.a = (Provider<a>)af2.c.b((Provider)new xb0.b((Provider)kl.F, 16));
        final kl.q c = kl.c;
        this.b = (Provider<SearchImpressionIdDebugToaster>)af2.c.b((Provider)new nx.c((Provider)c, (Provider)kl.V0, (Provider)d$a.a, (Provider)new sa1.b((Object)c, 7), 11));
        this.c = (Provider<VideoLogsUseCase>)af2.c.b((Provider)new qb0.b((Provider)kl.e, 2));
        final Provider b = af2.c.b((Provider)af2.e.a((Object)preferencesFragment));
        this.d = (Provider<b>)b;
        final kl.a9 g1 = kl.g1;
        final Provider<VideoLogsUseCase> c2 = this.c;
        final kl.g6 r5 = kl.R5;
        f.f((Object)g1, "userLocationUseCase");
        f.f((Object)c2, "videoLogsUseCase");
        f.f((Object)r5, "preferencesFeatures");
        this.e = (Provider<tl1.a>)af2.c.b((Provider)new q(g1, (Provider)c2, b, r5));
    }
}
