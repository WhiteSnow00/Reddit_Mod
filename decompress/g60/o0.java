// 
// Decompiled by Procyon v0.6.0
// 

package g60;

import com.reddit.data.repository.RedditKarmaRepository;
import c50.h0;
import d60.b0;
import r20.a;
import c50.i0;
import d60.v;
import javax.inject.Provider;
import af2.d;

public final class o0 implements d
{
    public final /* synthetic */ int a;
    public final Provider b;
    public final Provider c;
    public final Provider d;
    
    public final Object get() {
        switch (this.a) {
            default: {
                return new m1((v)this.b.get(), (i0)this.c.get(), (a)this.d.get());
            }
            case 0: {
                return new RedditKarmaRepository((a)this.b.get(), (b0)this.c.get(), (h0)this.d.get());
            }
        }
    }
}
