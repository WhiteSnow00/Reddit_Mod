// 
// Decompiled by Procyon v0.6.0
// 

package androidx.biometric;

import java.lang.ref.WeakReference;
import android.os.Looper;
import java.util.concurrent.Executor;
import androidx.lifecycle.x;
import androidx.lifecycle.l0;

public final class r extends l0
{
    public x<CharSequence> A;
    public Executor d;
    public BiometricPrompt$a e;
    public BiometricPrompt$d f;
    public BiometricPrompt$c g;
    public b h;
    public s i;
    public r.r$c j;
    public CharSequence k;
    public int l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public x<BiometricPrompt$b> r;
    public x<d> s;
    public x<CharSequence> t;
    public x<Boolean> u;
    public x<Boolean> v;
    public boolean w;
    public x<Boolean> x;
    public int y;
    public x<Integer> z;
    
    public r() {
        this.l = 0;
        this.w = true;
        this.y = 0;
    }
    
    public static <T> void i(final x<T> x, final T t) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            x.k(t);
        }
        else {
            x.i(t);
        }
    }
    
    public final int c() {
        final BiometricPrompt$d f = this.f;
        int n2;
        if (f != null) {
            int n;
            if (this.g != null) {
                n = 15;
            }
            else {
                n = 255;
            }
            n2 = n;
            if (f.b) {
                n2 = (n | 0x8000);
            }
        }
        else {
            n2 = 0;
        }
        return n2;
    }
    
    public final CharSequence d() {
        final CharSequence k = this.k;
        if (k != null) {
            return k;
        }
        final BiometricPrompt$d f = this.f;
        if (f != null) {
            f.getClass();
            return "";
        }
        return null;
    }
    
    public final void e(final d d) {
        if (this.s == null) {
            this.s = new x<d>();
        }
        i(this.s, d);
    }
    
    public final void f(final CharSequence charSequence) {
        if (this.A == null) {
            this.A = new x<CharSequence>();
        }
        i(this.A, charSequence);
    }
    
    public final void g(final int n) {
        if (this.z == null) {
            this.z = new x<Integer>();
        }
        i(this.z, n);
    }
    
    public final void h(final boolean b) {
        if (this.v == null) {
            this.v = new x<Boolean>();
        }
        i(this.v, b);
    }
    
    public static final class a extends b$c
    {
        public final WeakReference<r> a;
        
        public a(final r r) {
            this.a = new WeakReference<r>(r);
        }
        
        public final void a(final int n, final CharSequence charSequence) {
            if (this.a.get() != null && !this.a.get().o && this.a.get().n) {
                this.a.get().e(new d(n, charSequence));
            }
        }
        
        public final void b() {
            if (this.a.get() != null && this.a.get().n) {
                final r r = this.a.get();
                if (r.u == null) {
                    r.u = new x<Boolean>();
                }
                androidx.biometric.r.i(r.u, Boolean.TRUE);
            }
        }
        
        public final void c(final BiometricPrompt$b biometricPrompt$b) {
            if (this.a.get() != null && this.a.get().n) {
                final int b = biometricPrompt$b.b;
                final int n = -1;
                BiometricPrompt$b biometricPrompt$b2 = biometricPrompt$b;
                if (b == -1) {
                    final BiometricPrompt$c a = biometricPrompt$b.a;
                    final int c = this.a.get().c();
                    final boolean b2 = (c & 0x7FFF) != 0x0;
                    int n2 = n;
                    if (b2) {
                        n2 = n;
                        if (!androidx.biometric.c.a(c)) {
                            n2 = 2;
                        }
                    }
                    biometricPrompt$b2 = new BiometricPrompt$b(a, n2);
                }
                final r r = this.a.get();
                if (r.r == null) {
                    r.r = new x<BiometricPrompt$b>();
                }
                androidx.biometric.r.i(r.r, biometricPrompt$b2);
            }
        }
    }
}
