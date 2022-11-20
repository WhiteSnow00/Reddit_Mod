// 
// Decompiled by Procyon v0.6.0
// 

package b60;

import cg2.j;
import ng2.e;
import com.reddit.data.repository.RedditPreferenceRepository;
import java.util.concurrent.Callable;

public final class d1 implements Callable
{
    public final RedditPreferenceRepository f;
    public final String g;
    public final int h;
    
    public d1(final RedditPreferenceRepository f, final String g, final int h) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final Object call() {
        final RedditPreferenceRepository f = this.f;
        final String g = this.g;
        final int h = this.h;
        e.f((Object)f, "this$0");
        e.f((Object)g, "$key");
        f.c.edit().putInt(g, h).apply();
        return j.a;
    }
}
