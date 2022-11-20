// 
// Decompiled by Procyon v0.6.0
// 

package he;

import com.google.android.gms.internal.firebase_auth_api.u0;
import com.google.android.gms.internal.firebase_auth_api.v0;
import com.google.android.gms.internal.firebase_auth_api.zzaau;
import com.google.android.gms.internal.firebase_auth_api.zzacf;
import com.google.android.gms.internal.firebase-auth-api.e;
import java.security.KeyStoreException;
import java.security.ProviderException;
import java.security.spec.AlgorithmParameterSpec;
import android.security.keystore.KeyGenParameterSpec$Builder;
import javax.crypto.KeyGenerator;
import java.io.FileNotFoundException;
import com.google.android.gms.internal.firebase_auth_api.t0;
import java.security.GeneralSecurityException;
import android.util.Log;
import java.io.IOException;
import android.content.Context;
import java.util.List;
import android.os.RemoteException;
import td.a;
import java.util.Collection;
import java.util.ArrayList;
import android.util.Base64;
import android.text.TextUtils;
import mg.d0;
import com.google.android.gms.internal.firebase-auth-api.q0;

public final class s5 implements jc
{
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public jc k;
    
    public s5() {
        this.k = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
    }
    
    public s5(final q5 k, final r5 h, final jc j, final wc g, final bd i, final kd f) {
        this.k = (jc)k;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    public final void a(final String s) {
        ((jc)this.j).a(s);
    }
    
    @Deprecated
    public final void b(final q0 q0) {
        final String v = ((com.google.android.gms.internal.firebase_auth_api.q0)q0).v();
        final byte[] zzt = ((zzaau)((com.google.android.gms.internal.firebase_auth_api.q0)q0).u()).zzt();
        int y = ((com.google.android.gms.internal.firebase_auth_api.q0)q0).y();
        final int c = t5.c;
        y -= 2;
        int n = 4;
        if (y != 1) {
            if (y != 2) {
                if (y != 3) {
                    if (y != 4) {
                        throw new IllegalArgumentException("Unknown output prefix type");
                    }
                }
                else {
                    n = 3;
                }
            }
            else {
                n = 2;
            }
        }
        else {
            n = 1;
        }
        this.i = s2.a(v, zzt, n);
    }
    
    public final void c(final cc cc) {
        final ld ld = (ld)cc;
        final kd kd = (kd)this.f;
        kd.getClass();
        d0.v("EMAIL");
        final boolean contains = kd.i.g.contains("EMAIL");
        final List list = null;
        if (contains) {
            ((wc)this.g).g = null;
        }
        else {
            final String g = ((kd)this.f).g;
            if (g != null) {
                ((wc)this.g).g = g;
            }
        }
        final kd kd2 = (kd)this.f;
        kd2.getClass();
        d0.v("DISPLAY_NAME");
        if (kd2.i.g.contains("DISPLAY_NAME")) {
            ((wc)this.g).i = null;
        }
        else {
            this.f.getClass();
        }
        final kd kd3 = (kd)this.f;
        kd3.getClass();
        d0.v("PHOTO_URL");
        if (kd3.i.g.contains("PHOTO_URL")) {
            ((wc)this.g).j = null;
        }
        else {
            this.f.getClass();
        }
        if (!TextUtils.isEmpty((CharSequence)((kd)this.f).h)) {
            final wc wc = (wc)this.g;
            final byte[] bytes = "redacted".getBytes();
            String encodeToString;
            if (bytes == null) {
                encodeToString = null;
            }
            else {
                encodeToString = Base64.encodeToString(bytes, 0);
            }
            wc.getClass();
            d0.v(encodeToString);
            wc.l = encodeToString;
        }
        final hd f = ld.f;
        List f2 = list;
        if (f != null) {
            f2 = f.f;
        }
        List list2;
        if ((list2 = f2) == null) {
            list2 = new ArrayList();
        }
        final wc wc2 = (wc)this.g;
        wc2.getClass();
        final hd k = new hd();
        wc2.k = k;
        k.f.addAll(list2);
        final r5 r5 = (r5)this.h;
        final bd bd = (bd)this.i;
        d0.y((Object)bd);
        final String g2 = ld.g;
        final String h = ld.h;
        bd bd2 = bd;
        if (!TextUtils.isEmpty((CharSequence)g2)) {
            bd2 = bd;
            if (!TextUtils.isEmpty((CharSequence)h)) {
                bd2 = new bd(h, g2, ld.i, bd.i);
            }
        }
        final wc wc3 = (wc)this.g;
        r5.getClass();
        try {
            ((rb)r5.f).f(bd2, wc3);
        }
        catch (final RemoteException ex) {
            ((a)r5.g).b((Exception)ex, "RemoteException when sending get token and account info user response", new Object[0]);
        }
    }
    
    public final void d(final Context context, final String s) throws IOException {
        if (context != null) {
            this.k = (jc)new w5(context, s);
            this.f = new x5(context, s);
            return;
        }
        throw new IllegalArgumentException("need an Android context");
    }
    
    public final t5 e() throws GeneralSecurityException, IOException {
        synchronized (this) {
            if (this.g != null) {
                this.h = this.f();
            }
            v2 g;
            try {
                g = this.g();
            }
            catch (final FileNotFoundException ex) {
                final int c = t5.c;
                if (Log.isLoggable("t5", 4)) {
                    final int c2 = t5.c;
                    Log.i("t5", String.format("keyset not found, will generate a new one. %s", ex.getMessage()));
                }
                if (this.i == null) {
                    throw new GeneralSecurityException("cannot read or generate keyset");
                }
                g = new v2(t0.t());
                g.b((s2)this.i);
                g.c(((u0)((v0)i3.a(g.a().a)).s()).r());
                if (this.h != null) {
                    g.a().c((w2)this.f, (e2)this.h);
                }
                else {
                    ((w2)this.f).a(g.a().a);
                }
            }
            this.j = g;
            return new t5(this);
        }
    }
    
    public final u5 f() throws GeneralSecurityException {
        Object a = new v5();
        final boolean b = ((v5)a).b((String)this.g);
        Label_0181: {
            if (!b) {
                try {
                    final String s = (String)this.g;
                    if (!new v5().b(s)) {
                        final String a2 = ea.a(s);
                        final KeyGenerator instance = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                        instance.init((AlgorithmParameterSpec)new KeyGenParameterSpec$Builder(a2, 3).setKeySize(256).setBlockModes(new String[] { "GCM" }).setEncryptionPaddings(new String[] { "NoPadding" }).build());
                        instance.generateKey();
                        break Label_0181;
                    }
                    a = new IllegalArgumentException(String.format("cannot generate a new key %s because it already exists; please delete it with deleteKey() and try again", s));
                    throw a;
                }
                catch (final ProviderException a) {}
                catch (final GeneralSecurityException ex) {}
                final int c = t5.c;
                Log.w("t5", "cannot use Android Keystore, it'll be disabled", (Throwable)a);
                return null;
            }
            try {
                a = ((v5)a).a((String)this.g);
                return (u5)a;
            }
            catch (final ProviderException a) {}
            catch (final GeneralSecurityException ex2) {}
        }
        if (!b) {
            final int c2 = t5.c;
            Log.w("t5", "cannot use Android Keystore, it'll be disabled", (Throwable)a);
            return null;
        }
        throw new KeyStoreException(String.format("the master key %s exists but is unusable", this.g), (Throwable)a);
    }
    
    public final v2 g() throws GeneralSecurityException, IOException {
        Object a = this.h;
        if (a != null) {
            try {
                a = u2.e((w5)this.k, (e2)a).a;
                final z z = (z)((t0)a).h(5);
                z.b((e)a);
                a = new v2((x8)z);
                return (v2)a;
            }
            catch (final GeneralSecurityException a) {}
            catch (final zzacf zzacf) {}
            final int c = t5.c;
            Log.w("t5", "cannot decrypt keyset: ", (Throwable)a);
        }
        final com.google.android.gms.internal.firebase-auth-api.t0 w = t0.w(((w5)this.k).b(), r.a());
        if (((t0)w).r() > 0) {
            new u2(w);
            final z z2 = (z)((t0)w).h(5);
            z2.b((e)w);
            return new v2((x8)z2);
        }
        throw new GeneralSecurityException("empty keyset");
    }
}
