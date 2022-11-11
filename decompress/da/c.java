// 
// Decompiled by Procyon v0.6.0
// 

package da;

import sg2.e;
import com.google.accompanist.pager.PagerState;

public final class c implements b
{
    public final PagerState a;
    
    public c(final PagerState a) {
        e.f((Object)a, "state");
        this.a = a;
    }
    
    @Override
    public final int a() {
        return this.a.i();
    }
    
    @Override
    public final float b() {
        return this.a.f();
    }
}
