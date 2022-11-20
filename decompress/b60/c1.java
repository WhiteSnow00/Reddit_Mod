// 
// Decompiled by Procyon v0.6.0
// 

package b60;

import cg2.j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.reddit.domain.model.AccountPreferences$AcceptPrivateMessagesPolicy;
import com.reddit.domain.model.AccountPreferencesPatch;
import ng2.e;
import com.reddit.domain.model.GeopopularRegionSelectFilter;
import com.reddit.data.repository.RedditPreferenceRepository;
import java.util.concurrent.Callable;

public final class c1 implements Callable
{
    public final RedditPreferenceRepository f;
    public final GeopopularRegionSelectFilter g;
    
    public c1(final RedditPreferenceRepository f, final GeopopularRegionSelectFilter g) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final Object call() {
        final RedditPreferenceRepository f = this.f;
        final GeopopularRegionSelectFilter g = this.g;
        e.f((Object)f, "this$0");
        e.f((Object)g, "$filter");
        f.a.a().setGeopopular(g.getFilter());
        f.g.patchPreferences(new AccountPreferencesPatch((Boolean)null, (Boolean)null, g.getFilter(), (String)null, (String)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Long)null, (AccountPreferences$AcceptPrivateMessagesPolicy)null, (Boolean)null, (Boolean)null, (Boolean)null, (String)null, (Boolean)null, 4194299, (DefaultConstructorMarker)null)).E();
        f.c.edit().putString("RedditRegionRepository:GeopopularRegionFilter", y10.e.a.a((Class)GeopopularRegionSelectFilter.class).toJson((Object)g)).apply();
        return j.a;
    }
}
