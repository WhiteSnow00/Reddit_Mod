// 
// Decompiled by Procyon v0.6.0
// 

package k;

import java.util.Iterator;
import a4.t1;
import android.view.animation.Interpolator;
import a4.s1;
import java.util.ArrayList;

public final class h
{
    public final ArrayList<s1> a;
    public long b;
    public Interpolator c;
    public t1 d;
    public boolean e;
    public final h$a f;
    
    public h() {
        this.b = -1L;
        this.f = new h$a(this);
        this.a = new ArrayList<s1>();
    }
    
    public final void a() {
        if (!this.e) {
            return;
        }
        final Iterator<s1> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            iterator.next().b();
        }
        this.e = false;
    }
    
    public final void b() {
        if (this.e) {
            return;
        }
        for (final s1 s1 : this.a) {
            final long b = this.b;
            if (b >= 0L) {
                s1.c(b);
            }
            final Interpolator c = this.c;
            if (c != null) {
                s1.d(c);
            }
            if (this.d != null) {
                s1.e((t1)this.f);
            }
            s1.g();
        }
        this.e = true;
    }
}
