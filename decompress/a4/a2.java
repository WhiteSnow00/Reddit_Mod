// 
// Decompiled by Procyon v0.6.0
// 

package a4;

import android.view.WindowInsets$Type;
import ak0.n;
import java.util.Objects;
import android.view.DisplayCutout;
import android.util.Log;
import java.lang.reflect.Field;
import z3.b;
import java.util.WeakHashMap;
import android.view.View;
import q3.f;
import android.view.WindowInsets;
import android.os.Build$VERSION;

public final class a2
{
    public static final a2 b;
    public final l a;
    
    static {
        if (Build$VERSION.SDK_INT >= 30) {
            b = a2.a2$k.q;
        }
        else {
            b = l.b;
        }
    }
    
    public a2() {
        this.a = new l(this);
    }
    
    public a2(final WindowInsets windowInsets) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 30) {
            this.a = (l)new a2.a2$k(this, windowInsets);
        }
        else if (sdk_INT >= 29) {
            this.a = (l)new a2.a2$j(this, windowInsets);
        }
        else if (sdk_INT >= 28) {
            this.a = (l)new i(this, windowInsets);
        }
        else {
            this.a = (l)new h(this, windowInsets);
        }
    }
    
    public static q3.f g(final q3.f f, final int n, final int n2, final int n3, final int n4) {
        final int max = Math.max(0, f.a - n);
        final int max2 = Math.max(0, f.b - n2);
        final int max3 = Math.max(0, f.c - n3);
        final int max4 = Math.max(0, f.d - n4);
        if (max == n && max2 == n2 && max3 == n3 && max4 == n4) {
            return f;
        }
        return f.b(max, max2, max3, max4);
    }
    
    public static a2 j(View rootView, final WindowInsets windowInsets) {
        windowInsets.getClass();
        final a2 a2 = new a2(windowInsets);
        if (rootView != null) {
            final WeakHashMap a3 = p0.a;
            if (p0.g.b(rootView)) {
                a2.a.r(p0.j.a(rootView));
                rootView = rootView.getRootView();
                a2.a.d(rootView);
            }
        }
        return a2;
    }
    
    public final q3.f a(final int n) {
        return this.a.f(n);
    }
    
    public final q3.f b(final int n) {
        return this.a.g(n);
    }
    
    @Deprecated
    public final int c() {
        return this.a.k().d;
    }
    
    @Deprecated
    public final int d() {
        return this.a.k().a;
    }
    
    @Deprecated
    public final int e() {
        return this.a.k().c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof a2 && z3.b.a(this.a, ((a2)o).a));
    }
    
    @Deprecated
    public final int f() {
        return this.a.k().b;
    }
    
    public final boolean h(final int n) {
        return this.a.p(n);
    }
    
    @Override
    public final int hashCode() {
        final l a = this.a;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        return hashCode;
    }
    
    public final WindowInsets i() {
        final l a = this.a;
        WindowInsets c;
        if (a instanceof a2$g) {
            c = ((a2$g)a).c;
        }
        else {
            c = null;
        }
        return c;
    }
    
    public static final class a
    {
        public static Field a;
        public static Field b;
        public static Field c;
        public static boolean d;
        
        static {
            try {
                (a2.a.a = View.class.getDeclaredField("mAttachInfo")).setAccessible(true);
                final Class<?> forName = Class.forName("android.view.View$AttachInfo");
                (a2.a.b = forName.getDeclaredField("mStableInsets")).setAccessible(true);
                (a2.a.c = forName.getDeclaredField("mContentInsets")).setAccessible(true);
                a2.a.d = true;
            }
            catch (final ReflectiveOperationException ex) {
                final StringBuilder k = a.k("Failed to get visible insets from AttachInfo ");
                k.append(ex.getMessage());
                Log.w("WindowInsetsCompat", k.toString(), (Throwable)ex);
            }
        }
    }
    
    public static final class b
    {
        public final f a;
        
        public b() {
            final int sdk_INT = Build$VERSION.SDK_INT;
            if (sdk_INT >= 30) {
                this.a = (f)new e();
            }
            else if (sdk_INT >= 29) {
                this.a = (f)new a2$d();
            }
            else {
                this.a = (f)new a2$c();
            }
        }
        
        public b(final a2 a2) {
            final int sdk_INT = Build$VERSION.SDK_INT;
            if (sdk_INT >= 30) {
                this.a = (f)new e(a2);
            }
            else if (sdk_INT >= 29) {
                this.a = (f)new a2$d(a2);
            }
            else {
                this.a = (f)new a2$c(a2);
            }
        }
        
        public final a2 a() {
            return this.a.b();
        }
    }
    
    public static final class e extends a2$d
    {
        public e() {
        }
        
        public e(final a2 a2) {
            super(a2);
        }
        
        public void c(final int n, final q3.f f) {
            b2.d(super.c, a2.n.a(n), f.d());
        }
    }
    
    public static class f
    {
        public final a2 a;
        public q3.f[] b;
        
        public f() {
            this(new a2());
        }
        
        public f(final a2 a) {
            this.a = a;
        }
        
        public final void a() {
            final q3.f[] b = this.b;
            if (b != null) {
                final q3.f f = b[m.a(1)];
                q3.f a;
                if ((a = this.b[m.a(2)]) == null) {
                    a = this.a.a(2);
                }
                q3.f a2;
                if ((a2 = f) == null) {
                    a2 = this.a.a(1);
                }
                this.g(q3.f.a(a2, a));
                final q3.f f2 = this.b[m.a(16)];
                if (f2 != null) {
                    this.f(f2);
                }
                final q3.f f3 = this.b[m.a(32)];
                if (f3 != null) {
                    this.d(f3);
                }
                final q3.f f4 = this.b[m.a(64)];
                if (f4 != null) {
                    this.h(f4);
                }
            }
        }
        
        public a2 b() {
            throw null;
        }
        
        public void c(final int n, final q3.f f) {
            if (this.b == null) {
                this.b = new q3.f[9];
            }
            for (int i = 1; i <= 256; i <<= 1) {
                if ((n & i) != 0x0) {
                    this.b[m.a(i)] = f;
                }
            }
        }
        
        public void d(final q3.f f) {
        }
        
        public void e(final q3.f f) {
            throw null;
        }
        
        public void f(final q3.f f) {
        }
        
        public void g(final q3.f f) {
            throw null;
        }
        
        public void h(final q3.f f) {
        }
    }
    
    public static class h extends a2$g
    {
        public q3.f m;
        
        public h(final a2 a2, final WindowInsets windowInsets) {
            super(a2, windowInsets);
            this.m = null;
        }
        
        public a2 b() {
            return a2.j(null, super.c.consumeStableInsets());
        }
        
        public a2 c() {
            return a2.j(null, super.c.consumeSystemWindowInsets());
        }
        
        public final q3.f i() {
            if (this.m == null) {
                this.m = q3.f.b(super.c.getStableInsetLeft(), super.c.getStableInsetTop(), super.c.getStableInsetRight(), super.c.getStableInsetBottom());
            }
            return this.m;
        }
        
        public boolean n() {
            return super.c.isConsumed();
        }
        
        public void s(final q3.f m) {
            this.m = m;
        }
    }
    
    public static class i extends h
    {
        public i(final a2 a2, final WindowInsets windowInsets) {
            super(a2, windowInsets);
        }
        
        public a2 a() {
            return a2.j(null, u0.b(super.c));
        }
        
        public d e() {
            final DisplayCutout d = t0.d(super.c);
            d d2;
            if (d == null) {
                d2 = null;
            }
            else {
                d2 = new d(d);
            }
            return d2;
        }
        
        public boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (!(o instanceof i)) {
                return false;
            }
            final i i = (i)o;
            if (!Objects.equals(super.c, i.c) || !Objects.equals(super.g, i.g)) {
                b = false;
            }
            return b;
        }
        
        public int hashCode() {
            return super.c.hashCode();
        }
    }
    
    public static class l
    {
        public static final a2 b;
        public final a2 a;
        
        static {
            b = new b().a().a.a().a.b().a.c();
        }
        
        public l(final a2 a) {
            this.a = a;
        }
        
        public a2 a() {
            return this.a;
        }
        
        public a2 b() {
            return this.a;
        }
        
        public a2 c() {
            return this.a;
        }
        
        public void d(final View view) {
        }
        
        public d e() {
            return null;
        }
        
        @Override
        public boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (!(o instanceof l)) {
                return false;
            }
            final l l = (l)o;
            if (this.o() != l.o() || this.n() != l.n() || !z3.b.a(this.k(), l.k()) || !z3.b.a(this.i(), l.i()) || !z3.b.a(this.e(), l.e())) {
                b = false;
            }
            return b;
        }
        
        public q3.f f(final int n) {
            return q3.f.e;
        }
        
        public q3.f g(final int n) {
            if ((n & 0x8) == 0x0) {
                return q3.f.e;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }
        
        public q3.f h() {
            return this.k();
        }
        
        @Override
        public int hashCode() {
            return z3.b.b(this.o(), this.n(), this.k(), this.i(), this.e());
        }
        
        public q3.f i() {
            return q3.f.e;
        }
        
        public q3.f j() {
            return this.k();
        }
        
        public q3.f k() {
            return q3.f.e;
        }
        
        public q3.f l() {
            return this.k();
        }
        
        public a2 m(final int n, final int n2, final int n3, final int n4) {
            return l.b;
        }
        
        public boolean n() {
            return false;
        }
        
        public boolean o() {
            return false;
        }
        
        public boolean p(final int n) {
            return true;
        }
        
        public void q(final q3.f[] array) {
        }
        
        public void r(final a2 a2) {
        }
        
        public void s(final q3.f f) {
        }
    }
    
    public static final class m
    {
        public static int a(final int n) {
            if (n == 1) {
                return 0;
            }
            if (n == 2) {
                return 1;
            }
            if (n == 4) {
                return 2;
            }
            if (n == 8) {
                return 3;
            }
            if (n == 16) {
                return 4;
            }
            if (n == 32) {
                return 5;
            }
            if (n == 64) {
                return 6;
            }
            if (n == 128) {
                return 7;
            }
            if (n == 256) {
                return 8;
            }
            throw new IllegalArgumentException(n.k("type needs to be >= FIRST and <= LAST, type=", n));
        }
    }
    
    public static final class n
    {
        public static int a(final int n) {
            int n2 = 0;
            int n3;
            for (int i = 1; i <= 256; i <<= 1, n2 = n3) {
                n3 = n2;
                if ((n & i) != 0x0) {
                    int n4;
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 4) {
                                if (i != 8) {
                                    if (i != 16) {
                                        if (i != 32) {
                                            if (i != 64) {
                                                if (i != 128) {
                                                    n3 = n2;
                                                    continue;
                                                }
                                                n4 = WindowInsets$Type.displayCutout();
                                            }
                                            else {
                                                n4 = WindowInsets$Type.tappableElement();
                                            }
                                        }
                                        else {
                                            n4 = WindowInsets$Type.mandatorySystemGestures();
                                        }
                                    }
                                    else {
                                        n4 = WindowInsets$Type.systemGestures();
                                    }
                                }
                                else {
                                    n4 = WindowInsets$Type.ime();
                                }
                            }
                            else {
                                n4 = WindowInsets$Type.captionBar();
                            }
                        }
                        else {
                            n4 = WindowInsets$Type.navigationBars();
                        }
                    }
                    else {
                        n4 = WindowInsets$Type.statusBars();
                    }
                    n3 = (n2 | n4);
                }
            }
            return n2;
        }
    }
}
