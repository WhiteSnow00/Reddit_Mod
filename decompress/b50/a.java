// 
// Decompiled by Procyon v0.6.0
// 

package b50;

import java.io.Serializable;
import tg2.c;
import javax.inject.Inject;
import ah2.f;
import db0.o;

public final class a implements fc0.a
{
    public final com.reddit.data.liveaudio.remote.gql.a a;
    public final o b;
    
    @Inject
    public a(final com.reddit.data.liveaudio.remote.gql.a a, final o b) {
        f.f((Object)a, "liveAudioDataSource");
        f.f((Object)b, "liveAudioFeatures");
        this.a = a;
        this.b = b;
    }
    
    public final Serializable a(final c c) {
        if (this.b.f1()) {
            return this.a.b(c);
        }
        return this.a.a(c);
    }
}
