// 
// Decompiled by Procyon v0.6.0
// 

package fb2;

import sg2.e;
import android.view.View;
import com.reddit.vault.d;
import hg2.j;
import rg2.a;
import com.bluelinelabs.conductor.Controller;

public final class o extends e
{
    public final /* synthetic */ Controller f;
    public final /* synthetic */ a<j> g;
    
    public o(final d f, final a g) {
        this.f = (Controller)f;
        this.g = g;
    }
    
    @Override
    public final void i(final Controller controller, final View view) {
        sg2.e.f((Object)controller, "controller");
        sg2.e.f((Object)view, "view");
        this.f.jB((Controller.e)this);
        this.g.invoke();
    }
}
