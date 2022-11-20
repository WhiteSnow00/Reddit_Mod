// 
// Decompiled by Procyon v0.6.0
// 

package he;

import j0.i;
import mg.d0;
import java.util.ArrayList;
import java.lang.ref.WeakReference;
import java.util.List;
import android.util.Log;
import android.text.TextUtils;
import zg.d;
import c2.e;
import ai2.h;

public final class dc extends h
{
    public yb b;
    public zb c;
    public mc d;
    public final e e;
    public final d f;
    public final String g;
    public ec h;
    
    public dc(d f, final e e) {
        (this.f = f).b();
        final String a = f.c.a;
        this.g = a;
        this.e = e;
        this.d = null;
        this.b = null;
        this.c = null;
        f = (d)o9.a("firebear.secureToken");
        Label_0114: {
            if (TextUtils.isEmpty((CharSequence)f)) {
                f = (d)qc.a;
                synchronized (f) {
                    final pc pc = (pc)((i)f).getOrDefault((Object)a, (Object)null);
                    monitorexit(f);
                    if (pc == null) {
                        f = (d)"https://".concat("securetoken.googleapis.com/v1");
                        break Label_0114;
                    }
                    throw null;
                }
            }
            Log.e("LocalClient", "Found hermetic configuration for secureToken URL: ".concat(String.valueOf(f)));
        }
        if (this.d == null) {
            this.d = new mc((String)f, this.r0());
        }
        String s = o9.a("firebear.identityToolkit");
        if (TextUtils.isEmpty((CharSequence)s)) {
            s = qc.a(a);
        }
        else {
            Log.e("LocalClient", "Found hermetic configuration for identityToolkit URL: ".concat(String.valueOf(s)));
        }
        if (this.b == null) {
            this.b = new yb(s, this.r0());
        }
        f = (d)o9.a("firebear.identityToolkitV2");
        Label_0264: {
            if (TextUtils.isEmpty((CharSequence)f)) {
                f = (d)qc.a;
                synchronized (f) {
                    final pc pc2 = (pc)((i)f).getOrDefault((Object)a, (Object)null);
                    monitorexit(f);
                    if (pc2 == null) {
                        f = (d)"https://".concat("identitytoolkit.googleapis.com/v2");
                        break Label_0264;
                    }
                    throw null;
                }
            }
            Log.e("LocalClient", "Found hermetic configuration for identityToolkitV2 URL: ".concat(String.valueOf(f)));
        }
        if (this.c == null) {
            this.c = new zb((String)f, this.r0());
        }
        f = (d)qc.b;
        synchronized (f) {
            if (((i)f).containsKey((Object)a)) {
                ((List)((i)f).getOrDefault((Object)a, (Object)null)).add(new WeakReference(this));
            }
            else {
                final ArrayList<WeakReference> list = new ArrayList<WeakReference>();
                list.add(new WeakReference(this));
                ((i)f).put((Object)a, (Object)list);
            }
        }
    }
    
    @Override
    public final void j0(final sc sc, final gb gb) {
        final yb b = this.b;
        fa.c(b.a("/emailLinkSignin", this.g), (bc)sc, (jc)gb, (Class)tc.class, b.b);
    }
    
    @Override
    public final void k0(final r5 r5, final jc jc) {
        final mc d = this.d;
        fa.c(d.a("/token", this.g), (bc)r5, jc, (Class)bd.class, d.b);
    }
    
    @Override
    public final void l0(final f2 f2, final jc jc) {
        final yb b = this.b;
        fa.c(b.a("/getAccountInfo", this.g), (bc)f2, jc, (Class)uc.class, b.b);
    }
    
    @Override
    public final void m0(final kd kd, final s5 s5) {
        final yb b = this.b;
        fa.c(b.a("/setAccountInfo", this.g), (bc)kd, (jc)s5, (Class)ld.class, b.b);
    }
    
    @Override
    public final void n0(final od od, final jc jc) {
        d0.y((Object)od);
        final yb b = this.b;
        fa.c(b.a("/verifyAssertion", this.g), (bc)od, jc, (Class)qd.class, b.b);
    }
    
    @Override
    public final void o0(final com.google.android.gms.internal.firebase-auth-api.h h, final r5 r5) {
        final yb b = this.b;
        fa.c(b.a("/verifyCustomToken", this.g), (bc)h, (jc)r5, (Class)rd.class, b.b);
    }
    
    @Override
    public final void p0(final td td, final p5 p2) {
        final yb b = this.b;
        fa.c(b.a("/verifyPassword", this.g), (bc)td, (jc)p2, (Class)ud.class, b.b);
    }
    
    @Override
    public final void q0(final vd vd, final jc jc) {
        d0.y((Object)vd);
        final yb b = this.b;
        fa.c(b.a("/verifyPhoneNumber", this.g), (bc)vd, jc, (Class)wd.class, b.b);
    }
    
    public final ec r0() {
        if (this.h == null) {
            final d f = this.f;
            final String e = this.e.e();
            f.b();
            this.h = new ec(f.a, f, e);
        }
        return this.h;
    }
}
