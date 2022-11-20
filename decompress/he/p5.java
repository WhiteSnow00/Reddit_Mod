// 
// Decompiled by Procyon v0.6.0
// 

package he;

import hh.y;
import android.text.TextUtils;
import hh.b;
import zg.d;
import java.util.Iterator;
import android.util.SparseArray;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import hh.k;
import com.google.firebase.auth.FirebaseAuthMultiFactorException;
import ih.e;
import ih.q0;
import ih.g;
import hh.j;
import hh.p;
import java.util.ArrayList;
import px0.c;
import android.util.Pair;
import com.google.firebase.auth.FirebaseAuth;
import mg.d0;
import com.google.android.gms.common.api.Status;
import ih.i;
import we.h;

public final class p5 implements l5, jc
{
    public final Object f;
    public final Object g;
    
    public p5(final gc f, final h g) {
        this.f = f;
        this.g = g;
    }
    
    public p5(final q5 g, final r5 f) {
        this.g = g;
        this.f = f;
    }
    
    public p5(final byte[] array, final byte[] array2) {
        this.f = ha.a(array);
        this.g = ha.a(array2);
    }
    
    public final void a(final String s) {
        ((r5)this.f).d(i.a(s));
    }
    
    public final void b(final Object o, final Status status) {
        d0.z((Object)this.g, "completion source cannot be null");
        if (status == null) {
            ((h)this.g).b(o);
            return;
        }
        final gc gc = (gc)this.f;
        if (gc.l != null) {
            final h h = (h)this.g;
            final FirebaseAuth instance = FirebaseAuth.getInstance(gc.c);
            final gc gc2 = (gc)this.f;
            final eb l = gc2.l;
            Object d;
            if (!"reauthenticateWithCredential".equals(gc2.a()) && !"reauthenticateWithCredentialWithData".equals(((gc)this.f).a())) {
                d = null;
            }
            else {
                d = ((gc)this.f).d;
            }
            final SparseArray a = tb.a;
            instance.getClass();
            l.getClass();
            final Pair pair = (Pair)tb.a.get(17078);
            final String s = (String)pair.first;
            final String s2 = (String)pair.second;
            final ArrayList a2 = c.a3(l.g);
            final ArrayList<p> list = new ArrayList<p>();
            for (final j j : a2) {
                if (j instanceof p) {
                    list.add((p)j);
                }
            }
            final ArrayList a3 = c.a3(l.g);
            final String f = l.f;
            d0.v(f);
            final g g = new g();
            g.h = new ArrayList();
            for (final j i : a3) {
                if (i instanceof p) {
                    g.h.add(i);
                }
            }
            g.g = f;
            final d a4 = instance.a;
            a4.b();
            h.a((Exception)new FirebaseAuthMultiFactorException(s, s2, (k)new e((ArrayList)list, g, a4.b, l.h, (q0)d)));
            return;
        }
        final b k = gc.i;
        if (k != null) {
            final h h2 = (h)this.g;
            final String m = gc.j;
            final String k2 = gc.k;
            final SparseArray a5 = tb.a;
            final int g2 = status.g;
            Object a6;
            if (g2 != 17012 && g2 != 17007 && g2 != 17025) {
                a6 = tb.a(status);
            }
            else {
                final Pair pair2 = (Pair)tb.a.get(g2);
                String s3;
                if (pair2 != null) {
                    s3 = (String)pair2.second;
                }
                else {
                    s3 = "An internal error has occurred.";
                }
                a6 = new FirebaseAuthUserCollisionException(tb.b(g2), tb.c(status, s3));
                ((FirebaseAuthUserCollisionException)a6).zza(k);
                ((FirebaseAuthUserCollisionException)a6).zzb(m);
                ((FirebaseAuthUserCollisionException)a6).zzc(k2);
            }
            h2.a((Exception)a6);
            return;
        }
        ((h)this.g).a((Exception)tb.a(status));
    }
    
    public final void c(final cc cc) {
        final ud ud = (ud)cc;
        if (TextUtils.isEmpty((CharSequence)ud.j) ^ true) {
            ((r5)this.f).b(new eb(ud.j, ud.i, null));
            return;
        }
        q5.g((q5)this.g, (r5)this.f, (jc)this, new bd(ud.g, ud.f, ud.h, "Bearer"), Boolean.FALSE, (String)null);
    }
    
    public final ha r() {
        return (ha)this.g;
    }
    
    public final ha zza() {
        return (ha)this.f;
    }
}
