// 
// Decompiled by Procyon v0.6.0
// 

package he;

import java.util.Arrays;
import androidx.compose.ui.platform.k0;
import mg.d0;
import java.security.GeneralSecurityException;
import java.nio.charset.StandardCharsets;
import javax.crypto.Mac;
import java.util.Iterator;
import com.google.android.gms.internal.firebase-auth-api.h;
import android.os.RemoteException;
import td.a;
import ih.i;
import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import android.text.TextUtils;
import hh.y;

public final class q5 implements k5, o1, jc
{
    public final Object f;
    
    public q5(final dc f) {
        this.f = f;
    }
    
    public q5(final r5 f) {
        this.f = f;
    }
    
    public q5(final Object f) {
        this.f = f;
    }
    
    public static /* bridge */ void g(final q5 q5, final r5 r5, final jc jc, final bd bd, final Boolean b, final String s) {
        q5.f(bd, null, s, b, null, r5, jc);
    }
    
    public static void h(final q5 q5, final qd qd, final r5 r5, final jc jc) {
        if (qd.f || !TextUtils.isEmpty((CharSequence)qd.q)) {
            final y b = qd.b();
            final String j = qd.j;
            final String s = qd.s;
            Status a;
            if (qd.f) {
                a = new Status(17012, (PendingIntent)null, (String)null);
            }
            else {
                a = i.a(qd.q);
            }
            final cb cb = new cb(a, b, j, s);
            r5.getClass();
            try {
                ((rb)r5.f).c(cb);
            }
            catch (final RemoteException ex) {
                ((a)r5.g).b((Exception)ex, "RemoteException when sending failure result with credential", new Object[0]);
            }
            return;
        }
        q5.f(new bd(qd.h, qd.g, qd.i, "Bearer"), qd.l, qd.k, qd.m, qd.b(), r5, jc);
    }
    
    public final void a(final String s) {
        ((r5)this.f).d(i.a(s));
    }
    
    public final Iterator b(final h h, final CharSequence charSequence) {
        return (Iterator)new jd(h, charSequence);
    }
    
    public final void c(cc cc) {
        final bd bd = (bd)cc;
        cc = (cc)this.f;
        cc.getClass();
        try {
            ((rb)((r5)cc).f).e(bd);
        }
        catch (final RemoteException ex) {
            ((a)((r5)cc).g).b((Exception)ex, "RemoteException when sending token result.", new Object[0]);
        }
    }
    
    public final byte[] d(byte[] j, final l5 l5) throws GeneralSecurityException {
        final byte[] a = l5.zza().a;
        final int length = a.length;
        final byte[] array = new byte[length];
        System.arraycopy(a, 0, array, 0, length);
        final byte[] e = fa.e(array, j);
        final byte[] a2 = l5.r().a;
        final int length2 = a2.length;
        final byte[] array2 = new byte[length2];
        System.arraycopy(a2, 0, array2, 0, length2);
        j = g2.j(new byte[][] { j, array2 });
        final byte[] i = g2.j(new byte[][] { n5.m, n5.b });
        final f5 f5 = (f5)this.f;
        final int macLength = Mac.getInstance((String)f5.a).getMacLength();
        return f5.b(f5.c(g2.j(new byte[][] { n5.o, i, "eae_prk".getBytes(StandardCharsets.UTF_8), e }), (byte[])null), macLength, n5.c("shared_secret", j, i, macLength));
    }
    
    public final void e(final String s, final jc jc) {
        d0.v(s);
        final bd g = bd.g(s);
        if (g.u()) {
            jc.c((cc)g);
            return;
        }
        ((ai2.h)this.f).k0(new r5(g.f), (jc)new k0(jc));
    }
    
    public final void f(final bd bd, final String s, final String s2, final Boolean b, final y y, final r5 r5, final jc jc) {
        d0.y((Object)jc);
        d0.y((Object)r5);
        ((ai2.h)this.f).l0(new f2(bd.g), (jc)new ib(r5, jc, bd, y, b, s2, s));
    }
    
    public final byte[] r() throws GeneralSecurityException {
        if (Arrays.equals(((f5)this.f).a(), n5.f)) {
            return n5.b;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }
}
