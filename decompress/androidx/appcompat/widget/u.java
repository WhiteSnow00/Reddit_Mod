// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import l.f;
import android.view.View;

public final class u extends g0
{
    public final /* synthetic */ AppCompatSpinner$g o;
    public final /* synthetic */ AppCompatSpinner p;
    
    public u(final AppCompatSpinner p3, final View view, final AppCompatSpinner$g o) {
        this.p = p3;
        this.o = o;
        super(view);
    }
    
    @Override
    public final f b() {
        return (f)this.o;
    }
    
    @Override
    public final boolean c() {
        if (!this.p.getInternalPopup().a()) {
            final AppCompatSpinner p = this.p;
            p.k.e(AppCompatSpinner$c.b((View)p), AppCompatSpinner$c.a((View)p));
        }
        return true;
    }
}
