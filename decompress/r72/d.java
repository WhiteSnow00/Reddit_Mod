// 
// Decompiled by Procyon v0.6.0
// 

package r72;

import s72.a$a;
import javax.inject.Inject;
import ng2.e;
import com.reddit.presentation.CoroutinesPresenter;

public final class d extends CoroutinesPresenter implements b
{
    public final c j;
    public final a k;
    public final mg2.a<s72.b> l;
    public final v72.b m;
    
    @Inject
    public d(final c j, final a k, final mg2.a<? extends s72.b> l, final v72.b m) {
        e.f((Object)j, "view");
        e.f((Object)k, "params");
        e.f((Object)l, "getDialogScreenActions");
        e.f((Object)m, "navigator");
        this.j = j;
        this.k = k;
        this.l = (mg2.a<s72.b>)l;
        this.m = m;
    }
    
    public final void A() {
        super.A();
        this.j.So(this.k.f);
    }
    
    public final void Rj() {
        ((s72.b)this.l.invoke()).bb(new a$a(this.k.f.j));
        this.m.a();
    }
    
    public final void y5() {
        this.m.a();
    }
}
