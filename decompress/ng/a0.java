// 
// Decompiled by Procyon v0.6.0
// 

package ng;

import java.util.Locale;
import java.util.List;
import java.util.Set;
import qg.n;
import android.content.IntentSender$SendIntentException;
import androidx.fragment.app.r;
import java.io.File;
import ig.k0;

public final class a0 implements a
{
    public final k0<f> a;
    public final k0<pg.a> b;
    public final k0<File> c;
    
    public a0(final k0<f> a, final k0<pg.a> b, final k0<File> c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final boolean a(final c c, final r r) throws IntentSender$SendIntentException {
        return this.j().a(c, r);
    }
    
    public final n b(final b b) {
        return this.j().b(b);
    }
    
    public final Set<String> c() {
        return this.j().c();
    }
    
    public final n d(final List<Locale> list) {
        return this.j().d((List)list);
    }
    
    public final n e(final int n) {
        return this.j().e(n);
    }
    
    public final n f() {
        return this.j().f();
    }
    
    public final void g(final hc0.b b) {
        this.j().g(b);
    }
    
    public final Set<String> h() {
        return this.j().h();
    }
    
    public final void i(final d d) {
        this.j().i(d);
    }
    
    public final a j() {
        a a;
        if (this.c.zza() == null) {
            a = (a)this.a.zza();
        }
        else {
            a = (a)this.b.zza();
        }
        return a;
    }
}
