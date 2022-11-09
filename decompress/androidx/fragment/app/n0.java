// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

import androidx.lifecycle.Lifecycle;
import java.util.WeakHashMap;
import a40.f;
import a4.p0;
import android.view.View;
import java.util.ArrayList;

public abstract class n0
{
    public ArrayList<a> a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public String i;
    public int j;
    public CharSequence k;
    public int l;
    public CharSequence m;
    public ArrayList<String> n;
    public ArrayList<String> o;
    public boolean p;
    
    public n0() {
        this.a = new ArrayList<a>();
        this.h = true;
        this.p = false;
    }
    
    public final void b(final a a) {
        this.a.add(a);
        a.d = this.b;
        a.e = this.c;
        a.f = this.d;
        a.g = this.e;
    }
    
    public final void c(final View view, final String s) {
        if (o0.a != null || o0.b != null) {
            final WeakHashMap a = p0.a;
            final String k = p0.i.k(view);
            if (k == null) {
                throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
            }
            if (this.n == null) {
                this.n = new ArrayList<String>();
                this.o = new ArrayList<String>();
            }
            else {
                if (this.o.contains(s)) {
                    throw new IllegalArgumentException(a40.f.n("A shared element with the target name '", s, "' has already been added to the transaction."));
                }
                if (this.n.contains(k)) {
                    throw new IllegalArgumentException(a40.f.n("A shared element with the source name '", k, "' has already been added to the transaction."));
                }
            }
            this.n.add(k);
            this.o.add(s);
        }
    }
    
    public final void d(final String i) {
        if (this.h) {
            this.g = true;
            this.i = i;
            return;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }
    
    public abstract void e(final int p0, final Fragment p1, final String p2, final int p3);
    
    public final void f(final int n, final Fragment fragment, final String s) {
        if (n != 0) {
            this.e(n, fragment, s, 2);
            return;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }
    
    public final void g(final int b, final int c) {
        this.b = b;
        this.c = c;
        this.d = 0;
        this.e = 0;
    }
    
    public abstract androidx.fragment.app.a h(final Fragment p0, final Lifecycle.State p1);
    
    public static final class a
    {
        public int a;
        public Fragment b;
        public boolean c;
        public int d;
        public int e;
        public int f;
        public int g;
        public Lifecycle.State h;
        public Lifecycle.State i;
        
        public a() {
        }
        
        public a(final int a, final Fragment b) {
            this.a = a;
            this.b = b;
            this.c = true;
            final Lifecycle.State resumed = Lifecycle.State.RESUMED;
            this.h = resumed;
            this.i = resumed;
        }
        
        public a(final Fragment b, final int a) {
            this.a = a;
            this.b = b;
            this.c = false;
            final Lifecycle.State resumed = Lifecycle.State.RESUMED;
            this.h = resumed;
            this.i = resumed;
        }
        
        public a(final Fragment b, final Lifecycle.State i) {
            this.a = 10;
            this.b = b;
            this.c = false;
            this.h = b.mMaxState;
            this.i = i;
        }
    }
}
