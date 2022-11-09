// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import af2.c;
import ca0.o0;
import com.reddit.events.postsets.PostSetAnalytics;
import javax.inject.Provider;
import ft1.b;
import com.reddit.screen.BaseScreen;
import pg2.j;
import zg2.a;

public final class i8
{
    public final a<j> a;
    public final BaseScreen b;
    public final b c;
    public final a1 d;
    public Provider<PostSetAnalytics> e;
    
    public i8(final a1 d, final BaseScreen b, final a a, final b c) {
        this.d = d;
        this.a = (a<j>)a;
        this.b = b;
        this.c = c;
        this.e = (Provider<PostSetAnalytics>)af2.c.b((Provider)o0.c((Provider)d.h));
    }
}
