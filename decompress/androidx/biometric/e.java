// 
// Decompiled by Procyon v0.6.0
// 

package androidx.biometric;

import android.app.Activity;
import androidx.fragment.app.n;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.hardware.biometrics.BiometricPrompt$CryptoObject;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$Builder;
import javax.crypto.Mac;
import java.security.Signature;
import javax.crypto.Cipher;
import android.hardware.fingerprint.FingerprintManager;
import android.content.DialogInterface$OnClickListener;
import java.util.concurrent.Executor;
import android.text.TextUtils;
import s3.b;
import android.app.KeyguardManager;
import androidx.lifecycle.y;
import androidx.lifecycle.q;
import androidx.lifecycle.x;
import androidx.lifecycle.q0;
import androidx.lifecycle.n0;
import android.os.Bundle;
import android.content.Intent;
import v3.d;
import android.os.CancellationSignal;
import android.util.Log;
import android.content.Context;
import androidx.fragment.app.d0;
import android.os.Build$VERSION;
import android.os.Build;
import androidx.fragment.app.a;
import android.os.Looper;
import android.os.Handler;
import androidx.fragment.app.Fragment;

public class e extends Fragment
{
    public Handler f;
    public r g;
    
    public e() {
        this.f = new Handler(Looper.getMainLooper());
    }
    
    public final void dismiss() {
        final r g = this.g;
        boolean a = false;
        g.m = false;
        this.o0();
        if (!this.g.o && this.isAdded()) {
            final d0 parentFragmentManager = this.getParentFragmentManager();
            parentFragmentManager.getClass();
            final a a2 = new a(parentFragmentManager);
            a2.o(this);
            a2.k();
        }
        final Context context = this.getContext();
        if (context != null) {
            final String model = Build.MODEL;
            if (Build$VERSION.SDK_INT == 29) {
                a = u.a(context, 2130903063, model);
            }
            if (a) {
                final r g2 = this.g;
                g2.p = true;
                this.f.postDelayed((Runnable)new e.e$h(g2), 600L);
            }
        }
    }
    
    public final void n0(final int l) {
        if (l != 3 && this.g.q) {
            return;
        }
        if (this.q0() && (this.g.l = l) == 1) {
            this.t0(10, gn.a.X0(10, this.getContext()));
        }
        final r g = this.g;
        if (g.i == null) {
            g.i = new s();
        }
        final s i = g.i;
        final CancellationSignal b = i.b;
        if (b != null) {
            try {
                s$b.a(b);
            }
            catch (final NullPointerException ex) {
                Log.e("CancelSignalProvider", "Got NPE while canceling biometric authentication.", (Throwable)ex);
            }
            i.b = null;
        }
        final d c = i.c;
        if (c != null) {
            try {
                c.a();
            }
            catch (final NullPointerException ex2) {
                Log.e("CancelSignalProvider", "Got NPE while canceling fingerprint authentication.", (Throwable)ex2);
            }
            i.c = null;
        }
    }
    
    public final void o0() {
        this.g.m = false;
        if (this.isAdded()) {
            final d0 parentFragmentManager = this.getParentFragmentManager();
            final v v = (v)parentFragmentManager.E("androidx.biometric.FingerprintDialogFragment");
            if (v != null) {
                if (((Fragment)v).isAdded()) {
                    ((n)v).dismissAllowingStateLoss();
                }
                else {
                    final a a = new a(parentFragmentManager);
                    a.o((Fragment)v);
                    a.k();
                }
            }
        }
    }
    
    public final void onActivityResult(final int n, final int n2, final Intent intent) {
        super.onActivityResult(n, n2, intent);
        if (n == 1) {
            this.g.o = false;
            if (n2 == -1) {
                this.x0(new BiometricPrompt$b((BiometricPrompt$c)null, 1));
            }
            else {
                this.s0(10, this.getString(2131953758));
            }
        }
    }
    
    public final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        if (this.getActivity() != null) {
            final r g = (r)new n0((q0)this.getActivity()).a((Class)r.class);
            this.g = g;
            if (g.r == null) {
                g.r = new x<BiometricPrompt$b>();
            }
            g.r.e((q)this, (androidx.lifecycle.y<? super Object>)new g(this));
            final r g2 = this.g;
            if (g2.s == null) {
                g2.s = new x<androidx.biometric.d>();
            }
            g2.s.e((q)this, (androidx.lifecycle.y<? super Object>)new h(this));
            final r g3 = this.g;
            if (g3.t == null) {
                g3.t = new x<CharSequence>();
            }
            g3.t.e((q)this, (androidx.lifecycle.y<? super Object>)new i(this));
            final r g4 = this.g;
            if (g4.u == null) {
                g4.u = new x<Boolean>();
            }
            g4.u.e((q)this, (androidx.lifecycle.y<? super Object>)new j(this));
            final r g5 = this.g;
            if (g5.v == null) {
                g5.v = new x<Boolean>();
            }
            g5.v.e((q)this, (androidx.lifecycle.y<? super Object>)new k(this));
            final r g6 = this.g;
            if (g6.x == null) {
                g6.x = new x<Boolean>();
            }
            g6.x.e((q)this, (androidx.lifecycle.y<? super Object>)new l(this));
        }
    }
    
    public final void onStart() {
        super.onStart();
        if (Build$VERSION.SDK_INT == 29 && c.a(this.g.c())) {
            final r g = this.g;
            g.q = true;
            this.f.postDelayed((Runnable)new e.e$i(g), 250L);
        }
    }
    
    public final void onStop() {
        super.onStop();
        if (Build$VERSION.SDK_INT < 29 && !this.g.o) {
            final androidx.fragment.app.r activity = this.getActivity();
            if (activity == null || !((Activity)activity).isChangingConfigurations()) {
                this.n0(0);
            }
        }
    }
    
    public final boolean p0() {
        return Build$VERSION.SDK_INT <= 28 && c.a(this.g.c());
    }
    
    public final boolean q0() {
        final int sdk_INT = Build$VERSION.SDK_INT;
        boolean b = false;
        if (sdk_INT >= 28) {
            final androidx.fragment.app.r activity = this.getActivity();
            boolean b4 = false;
            Label_0145: {
                if (activity != null && this.g.g != null) {
                    final String manufacturer = Build.MANUFACTURER;
                    final String model = Build.MODEL;
                    boolean b3 = false;
                    Label_0134: {
                        if (sdk_INT == 28) {
                            boolean b2 = false;
                            Label_0108: {
                                if (manufacturer != null) {
                                    final String[] stringArray = ((Context)activity).getResources().getStringArray(2130903058);
                                    for (int length = stringArray.length, i = 0; i < length; ++i) {
                                        if (manufacturer.equalsIgnoreCase(stringArray[i])) {
                                            b2 = true;
                                            break Label_0108;
                                        }
                                    }
                                }
                                b2 = false;
                            }
                            if (b2 || u.b((Context)activity, 2130903057, model)) {
                                b3 = true;
                                break Label_0134;
                            }
                        }
                        b3 = false;
                    }
                    if (b3) {
                        b4 = true;
                        break Label_0145;
                    }
                }
                b4 = false;
            }
            if (!b4) {
                boolean b5 = false;
                Label_0205: {
                    if (Build$VERSION.SDK_INT == 28) {
                        final Context context = this.getContext();
                        if (context == null || context.getPackageManager() == null || !z.a(context.getPackageManager())) {
                            b5 = true;
                            break Label_0205;
                        }
                    }
                    b5 = false;
                }
                if (!b5) {
                    return b;
                }
            }
        }
        b = true;
        return b;
    }
    
    public final void r0() {
        final androidx.fragment.app.r activity = this.getActivity();
        if (activity == null) {
            Log.e("BiometricFragment", "Failed to check device credential. Client FragmentActivity not found.");
            return;
        }
        final KeyguardManager a = androidx.biometric.y.a((Context)activity);
        if (a == null) {
            this.s0(12, this.getString(2131953756));
            return;
        }
        final r g = this.g;
        final BiometricPrompt$d f = g.f;
        CharSequence a2;
        if (f != null) {
            a2 = f.a;
        }
        else {
            a2 = null;
        }
        g.getClass();
        this.g.getClass();
        final Intent a3 = e.e$b.a(a, a2, (CharSequence)null);
        if (a3 == null) {
            this.s0(14, this.getString(2131953755));
            return;
        }
        this.g.o = true;
        if (this.q0()) {
            this.o0();
        }
        a3.setFlags(134742016);
        this.startActivityForResult(a3, 1);
    }
    
    public final void s0(final int n, final CharSequence charSequence) {
        this.t0(n, charSequence);
        this.dismiss();
    }
    
    public final void t0(final int n, final CharSequence charSequence) {
        final r g = this.g;
        if (g.o) {
            Log.v("BiometricFragment", "Error not sent to client. User is confirming their device credential.");
            return;
        }
        if (!g.n) {
            Log.w("BiometricFragment", "Error not sent to client. Client is not awaiting a result.");
            return;
        }
        g.n = false;
        Object d = g.d;
        if (d == null) {
            d = new r$b();
        }
        ((Executor)d).execute((Runnable)new e$a(this, n, charSequence));
    }
    
    public final void x0(final BiometricPrompt$b biometricPrompt$b) {
        final r g = this.g;
        if (!g.n) {
            Log.w("BiometricFragment", "Success not sent to client. Client is not awaiting a result.");
        }
        else {
            g.n = false;
            Object d = g.d;
            if (d == null) {
                d = new r$b();
            }
            ((Executor)d).execute((Runnable)new o(this, biometricPrompt$b));
        }
        this.dismiss();
    }
    
    public final void y0(CharSequence string) {
        if (string == null) {
            string = this.getString(2131953048);
        }
        this.g.g(2);
        this.g.f(string);
    }
    
    public final void z0() {
        if (!this.g.m) {
            if (this.getContext() == null) {
                Log.w("BiometricFragment", "Not showing biometric prompt. Context is null.");
                return;
            }
            final r g = this.g;
            g.m = true;
            g.n = true;
            final boolean q0 = this.q0();
            CharSequence a = null;
            final b.c c = null;
            if (q0) {
                final Context applicationContext = this.requireContext().getApplicationContext();
                final b b = new b(applicationContext);
                final FingerprintManager c2 = s3.b.a.c(applicationContext);
                int n;
                if (c2 == null || !s3.b.a.e(c2)) {
                    n = 12;
                }
                else {
                    final FingerprintManager c3 = s3.b.a.c(applicationContext);
                    if (c3 == null || !s3.b.a.d(c3)) {
                        n = 11;
                    }
                    else {
                        n = 0;
                    }
                }
                if (n != 0) {
                    this.s0(n, gn.a.X0(n, applicationContext));
                }
                else if (this.isAdded()) {
                    this.g.w = true;
                    final String model = Build.MODEL;
                    final int sdk_INT = Build$VERSION.SDK_INT;
                    if (sdk_INT != 28 || !u.b(applicationContext, 2130903070, model)) {
                        this.f.postDelayed((Runnable)new m(this), 500L);
                        ((n)new v()).show(this.getParentFragmentManager(), "androidx.biometric.FingerprintDialogFragment");
                    }
                    final r g2 = this.g;
                    g2.l = 0;
                    final BiometricPrompt$c g3 = g2.g;
                    b.c c4;
                    if (g3 == null) {
                        c4 = c;
                    }
                    else {
                        final Cipher b2 = g3.b;
                        if (b2 != null) {
                            c4 = new b.c(b2);
                        }
                        else {
                            final Signature a2 = g3.a;
                            if (a2 != null) {
                                c4 = new b.c(a2);
                            }
                            else {
                                final Mac c5 = g3.c;
                                if (c5 != null) {
                                    c4 = new b.c(c5);
                                }
                                else {
                                    c4 = c;
                                    if (sdk_INT >= 30) {
                                        c4 = c;
                                        if (g3.d != null) {
                                            Log.e("CryptoObjectUtils", "Identity credential is not supported by FingerprintManager.");
                                            c4 = c;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    final r g4 = this.g;
                    if (g4.i == null) {
                        g4.i = new s();
                    }
                    final s i = g4.i;
                    if (i.c == null) {
                        i.a.getClass();
                        i.c = new d();
                    }
                    final d c6 = i.c;
                    final r g5 = this.g;
                    if (g5.h == null) {
                        g5.h = new androidx.biometric.b(new r.a(g5));
                    }
                    final androidx.biometric.b h = g5.h;
                    if (h.b == null) {
                        h.b = new androidx.biometric.a(h);
                    }
                    final androidx.biometric.a b3 = h.b;
                    try {
                        b.a(c4, c6, b3);
                    }
                    catch (final NullPointerException ex) {
                        Log.e("BiometricFragment", "Got NPE while authenticating with fingerprint.", (Throwable)ex);
                        this.s0(1, gn.a.X0(1, applicationContext));
                    }
                }
            }
            else {
                final BiometricPrompt$Builder d = e.e$c.d(this.requireContext().getApplicationContext());
                final r g6 = this.g;
                final BiometricPrompt$d f = g6.f;
                if (f != null) {
                    a = f.a;
                }
                g6.getClass();
                this.g.getClass();
                if (a != null) {
                    e.e$c.f(d, a);
                }
                final CharSequence d2 = this.g.d();
                if (!TextUtils.isEmpty(d2)) {
                    Object d3 = this.g.d;
                    if (d3 == null) {
                        d3 = new r$b();
                    }
                    final r g7 = this.g;
                    if (g7.j == null) {
                        g7.j = new r$c(g7);
                    }
                    e.e$c.e(d, d2, (Executor)d3, (DialogInterface$OnClickListener)g7.j);
                }
                final int sdk_INT2 = Build$VERSION.SDK_INT;
                if (sdk_INT2 >= 29) {
                    final BiometricPrompt$d f2 = this.g.f;
                    e.e$d.a(d, true);
                }
                final int c7 = this.g.c();
                if (sdk_INT2 >= 30) {
                    e.e$e.a(d, c7);
                }
                else if (sdk_INT2 >= 29) {
                    e.e$d.b(d, androidx.biometric.c.a(c7));
                }
                final BiometricPrompt c8 = e.e$c.c(d);
                final Context context = this.getContext();
                final BiometricPrompt$CryptoObject b4 = t.b(this.g.g);
                final r g8 = this.g;
                if (g8.i == null) {
                    g8.i = new s();
                }
                final s j = g8.i;
                if (j.b == null) {
                    j.a.getClass();
                    j.b = s$b.b();
                }
                final CancellationSignal b5 = j.b;
                final e.e$f e$f = new e.e$f();
                final r g9 = this.g;
                if (g9.h == null) {
                    g9.h = new androidx.biometric.b(new r.a(g9));
                }
                final androidx.biometric.b h2 = g9.h;
                if (h2.a == null) {
                    h2.a = b$a.a(h2.c);
                }
                final BiometricPrompt$AuthenticationCallback a3 = h2.a;
                Label_0940: {
                    if (b4 != null) {
                        break Label_0940;
                    }
                    try {
                        e.e$c.b(c8, b5, (Executor)e$f, a3);
                        return;
                        e.e$c.a(c8, b4, b5, (Executor)e$f, a3);
                    }
                    catch (final NullPointerException ex2) {
                        Log.e("BiometricFragment", "Got NPE while authenticating with biometric prompt.", (Throwable)ex2);
                        String string;
                        if (context != null) {
                            string = context.getString(2131953048);
                        }
                        else {
                            string = "";
                        }
                        this.s0(1, string);
                    }
                }
            }
        }
    }
}
