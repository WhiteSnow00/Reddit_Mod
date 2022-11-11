// 
// Decompiled by Procyon v0.6.0
// 

package od;

import de.f;
import md.b;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import j0.d;

public final class t extends y1
{
    public final d<a<?>> k;
    public final e l;
    
    public t(final h h, final e l, final md.e e) {
        super(h, e);
        this.k = (d<a<?>>)new d();
        this.l = l;
        h.d0("ConnectionlessLifecycleHelper", this);
    }
    
    public final void f() {
        if (!this.k.isEmpty()) {
            this.l.a(this);
        }
    }
    
    public final void h() {
        super.g = true;
        if (!this.k.isEmpty()) {
            this.l.a(this);
        }
    }
    
    public final void i() {
        super.g = false;
        final e l = this.l;
        l.getClass();
        synchronized (e.w) {
            if (l.p == this) {
                l.p = null;
                l.q.clear();
            }
        }
    }
    
    @Override
    public final void j(final b b, final int n) {
        this.l.g(b, n);
    }
    
    @Override
    public final void k() {
        final f s = this.l.s;
        s.sendMessage(s.obtainMessage(3));
    }
}
