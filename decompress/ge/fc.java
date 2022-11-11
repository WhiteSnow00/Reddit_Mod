// 
// Decompiled by Procyon v0.6.0
// 

package ge;

import com.google.android.gms.common.api.Status;
import ve.h;
import java.util.ArrayList;
import gh.b;
import hh.l;
import gh.f;
import yg.d;

public abstract class fc
{
    public final int a;
    public final ec b;
    public d c;
    public f d;
    public Object e;
    public l f;
    public ad g;
    public vc h;
    public b i;
    public String j;
    public String k;
    public db l;
    public boolean m;
    public Object n;
    public s5 o;
    
    public fc(final int a) {
        this.b = new ec(this);
        new ArrayList();
        this.a = a;
    }
    
    public abstract String a();
    
    public abstract void b();
    
    public abstract void c(final h p0, final rb p1);
    
    public final void d(final Object e) {
        if (e != null) {
            this.e = e;
            return;
        }
        throw new NullPointerException("external callback cannot be null");
    }
    
    public final void e(final d c) {
        if (c != null) {
            this.c = c;
            return;
        }
        throw new NullPointerException("firebaseApp cannot be null");
    }
    
    public final void f(final f d) {
        if (d != null) {
            this.d = d;
            return;
        }
        throw new NullPointerException("firebaseUser cannot be null");
    }
    
    public final void g(final Status status) {
        this.m = true;
        this.o.a((Object)null, status);
    }
    
    public final void h(final Object n) {
        this.m = true;
        this.n = n;
        this.o.a(n, (Status)null);
    }
}
