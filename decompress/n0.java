// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import androidx.appcompat.view.menu.h;
import l.f;
import android.view.View;

public final class n0 extends g0
{
    public final /* synthetic */ o0 o;
    
    public n0(final o0 o, final View view) {
        this.o = o;
        super(view);
    }
    
    @Override
    public final f b() {
        return (f)this.o.d.a();
    }
    
    @Override
    public final boolean c() {
        this.o.b();
        return true;
    }
    
    @Override
    public final boolean d() {
        final h d = this.o.d;
        if (d.b()) {
            ((f)d.j).dismiss();
        }
        return true;
    }
}
