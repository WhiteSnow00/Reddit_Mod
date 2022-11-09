// 
// Decompiled by Procyon v0.6.0
// 

package f8;

import u5.q;
import android.view.View;
import android.view.ViewGroup;

public final class m implements n$a
{
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ u5.m b;
    public final /* synthetic */ View c;
    public final /* synthetic */ View d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Runnable f;
    public final /* synthetic */ n g;
    
    public m(final n g, final ViewGroup a, final u5.m b, final View c, final View d, final boolean e, final k f) {
        this.g = g;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = (Runnable)f;
    }
    
    public final void onPrepared() {
        if (!this.g.i) {
            q.a(this.a, this.b);
            this.g.n(this.a, this.c, this.d, this.b, this.e);
            ((View)this.a).post(this.f);
        }
    }
}
