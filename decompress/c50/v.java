// 
// Decompiled by Procyon v0.6.0
// 

package c50;

import ov.b;
import com.reddit.domain.model.streaming.StreamSubredditPromptState;
import i60.t;
import java.util.List;
import nf2.c0;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import nf2.a;
import com.reddit.domain.model.streaming.StateType;
import javax.inject.Inject;
import ah2.f;
import javax.inject.Provider;
import h60.s0;

public final class v implements o0
{
    public final s0 a;
    
    @Inject
    public v(final Provider<s0> provider) {
        f.f((Object)provider, "dao");
        this.a = (s0)provider.get();
    }
    
    @Override
    public final a c(final long n, final StateType stateType) {
        f.f((Object)stateType, "type");
        final a onAssembly = RxJavaPlugins.onAssembly((a)new xf2.f((Callable)new u(this, n, stateType)));
        f.e((Object)onAssembly, "fromCallable { subreddit\u2026s(timestamp, type.name) }");
        return onAssembly;
    }
    
    @Override
    public final c0<List<t>> d(final StateType stateType) {
        f.f((Object)stateType, "type");
        return this.a.e1(stateType.name());
    }
    
    @Override
    public final a e(final StreamSubredditPromptState streamSubredditPromptState) {
        final a onAssembly = RxJavaPlugins.onAssembly((a)new xf2.f((Callable)new b(2, (Object)this, (Object)streamSubredditPromptState)));
        f.e((Object)onAssembly, "fromCallable {\n      sub\u2026type.name),\n      )\n    }");
        return onAssembly;
    }
}
