// 
// Decompiled by Procyon v0.6.0
// 

package zc;

import com.google.android.exoplayer2.upstream.cache.c;
import android.os.ConditionVariable;

public final class m extends Thread
{
    public final /* synthetic */ ConditionVariable f;
    public final /* synthetic */ c g;
    
    public m(final c g, final ConditionVariable f) {
        this.g = g;
        this.f = f;
        super("ExoPlayer:SimpleCacheInit");
    }
    
    @Override
    public final void run() {
        synchronized (this.g) {
            this.f.open();
            c.m(this.g);
            this.g.b.c();
        }
    }
}
