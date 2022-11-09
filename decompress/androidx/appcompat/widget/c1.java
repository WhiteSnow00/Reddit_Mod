// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import androidx.appcompat.view.menu.i$a;
import a4.t1;
import a4.s1;
import a4.p0;
import eg.n0;
import android.view.ViewParent;
import android.util.Log;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import h.f;
import androidx.appcompat.view.menu.MenuBuilder;
import android.view.ViewGroup$LayoutParams;
import android.content.Context;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.text.TextUtils;
import android.util.AttributeSet;
import gn.a;
import android.view.Window$Callback;
import android.graphics.drawable.Drawable;
import android.view.View;

public final class c1 implements c0
{
    public Toolbar a;
    public int b;
    public r0 c;
    public View d;
    public Drawable e;
    public Drawable f;
    public Drawable g;
    public boolean h;
    public CharSequence i;
    public CharSequence j;
    public CharSequence k;
    public Window$Callback l;
    public boolean m;
    public c n;
    public int o;
    public Drawable p;
    
    public c1(final Toolbar a, final boolean b) {
        this.o = 0;
        this.a = a;
        this.i = a.getTitle();
        this.j = a.getSubtitle();
        this.h = (this.i != null);
        this.g = a.getNavigationIcon();
        final Context context = ((View)a).getContext();
        final int[] q = gn.a.Q;
        CharSequence string = null;
        final z0 m = z0.m(context, (AttributeSet)null, q, 2130968583);
        int b2 = 15;
        this.p = m.e(15);
        if (b) {
            final CharSequence k = m.k(27);
            if (!TextUtils.isEmpty(k)) {
                this.setTitle(k);
            }
            final CharSequence i = m.k(25);
            if (!TextUtils.isEmpty(i)) {
                this.j = i;
                if ((this.b & 0x8) != 0x0) {
                    this.a.setSubtitle(i);
                }
            }
            final Drawable e = m.e(20);
            if (e != null) {
                this.o(e);
            }
            final Drawable e2 = m.e(17);
            if (e2 != null) {
                this.setIcon(e2);
            }
            if (this.g == null) {
                final Drawable p2 = this.p;
                if (p2 != null) {
                    this.g = p2;
                    if ((this.b & 0x4) != 0x0) {
                        this.a.setNavigationIcon(p2);
                    }
                    else {
                        this.a.setNavigationIcon(null);
                    }
                }
            }
            this.i(m.h(10, 0));
            final int j = m.i(9, 0);
            if (j != 0) {
                final View inflate = LayoutInflater.from(((View)this.a).getContext()).inflate(j, (ViewGroup)this.a, false);
                final View d = this.d;
                if (d != null && (this.b & 0x10) != 0x0) {
                    this.a.removeView(d);
                }
                if ((this.d = inflate) != null && (this.b & 0x10) != 0x0) {
                    this.a.addView(inflate);
                }
                this.i(this.b | 0x10);
            }
            final int layoutDimension = m.b.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                final ViewGroup$LayoutParams layoutParams = ((View)this.a).getLayoutParams();
                layoutParams.height = layoutDimension;
                ((View)this.a).setLayoutParams(layoutParams);
            }
            final int c = m.c(7, -1);
            final int c2 = m.c(3, -1);
            if (c >= 0 || c2 >= 0) {
                final Toolbar a2 = this.a;
                final int max = Math.max(c, 0);
                final int max2 = Math.max(c2, 0);
                if (a2.y == null) {
                    a2.y = new q0();
                }
                a2.y.a(max, max2);
            }
            final int l = m.i(28, 0);
            if (l != 0) {
                final Toolbar a3 = this.a;
                final Context context2 = ((View)a3).getContext();
                a3.q = l;
                final AppCompatTextView g = a3.g;
                if (g != null) {
                    g.setTextAppearance(context2, l);
                }
            }
            final int i2 = m.i(26, 0);
            if (i2 != 0) {
                final Toolbar a4 = this.a;
                final Context context3 = ((View)a4).getContext();
                a4.r = i2;
                final AppCompatTextView h = a4.h;
                if (h != null) {
                    h.setTextAppearance(context3, i2);
                }
            }
            final int i3 = m.i(22, 0);
            if (i3 != 0) {
                this.a.setPopupTheme(i3);
            }
        }
        else {
            if (this.a.getNavigationIcon() != null) {
                this.p = this.a.getNavigationIcon();
            }
            else {
                b2 = 11;
            }
            this.b = b2;
        }
        m.n();
        if (2131951630 != this.o) {
            this.o = 2131951630;
            if (TextUtils.isEmpty(this.a.getNavigationContentDescription())) {
                final int o = this.o;
                if (o != 0) {
                    string = this.getContext().getString(o);
                }
                this.k = string;
                this.v();
            }
        }
        this.k = this.a.getNavigationContentDescription();
        this.a.setNavigationOnClickListener((View$OnClickListener)new b1(this));
    }
    
    @Override
    public final void a(final MenuBuilder menuBuilder, final f.d j) {
        if (this.n == null) {
            final c n = new c(((View)this.a).getContext());
            this.n = n;
            ((androidx.appcompat.view.menu.a)n).n = 2131427488;
        }
        final c n2 = this.n;
        ((androidx.appcompat.view.menu.a)n2).j = (i$a)j;
        final Toolbar a = this.a;
        if (menuBuilder != null || a.f != null) {
            a.e();
            final MenuBuilder f = a.f.f;
            if (f != menuBuilder) {
                if (f != null) {
                    f.removeMenuPresenter((i)a.Q);
                    f.removeMenuPresenter((i)a.R);
                }
                if (a.R == null) {
                    a.R = a.new f();
                }
                n2.w = true;
                if (menuBuilder != null) {
                    menuBuilder.addMenuPresenter((i)n2, a.o);
                    menuBuilder.addMenuPresenter((i)a.R, a.o);
                }
                else {
                    n2.f(a.o, (MenuBuilder)null);
                    a.R.f(a.o, null);
                    n2.k();
                    a.R.k();
                }
                a.f.setPopupTheme(a.p);
                a.f.setPresenter(n2);
                a.Q = n2;
                a.t();
            }
        }
    }
    
    @Override
    public final boolean b() {
        final Toolbar a = this.a;
        if (((View)a).getVisibility() == 0) {
            final ActionMenuView f = a.f;
            if (f != null && f.i) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final boolean c() {
        return this.a.s();
    }
    
    @Override
    public final void collapseActionView() {
        final Toolbar.f r = this.a.R;
        g g;
        if (r == null) {
            g = null;
        }
        else {
            g = r.g;
        }
        if (g != null) {
            g.collapseActionView();
        }
    }
    
    @Override
    public final boolean d() {
        final ActionMenuView f = this.a.f;
        boolean b = true;
        if (f != null) {
            final c j = f.j;
            if (j != null && j.m()) {
                return b;
            }
        }
        b = false;
        return b;
    }
    
    @Override
    public final boolean e() {
        final ActionMenuView f = this.a.f;
        boolean b = true;
        if (f != null) {
            final c j = f.j;
            if (j != null && j.h()) {
                return b;
            }
        }
        b = false;
        return b;
    }
    
    @Override
    public final void f() {
        this.m = true;
    }
    
    @Override
    public final boolean g() {
        final ActionMenuView f = this.a.f;
        boolean b = true;
        if (f != null) {
            final c j = f.j;
            if (j != null && (j.A != null || j.m())) {
                return b;
            }
        }
        b = false;
        return b;
    }
    
    @Override
    public final Context getContext() {
        return ((View)this.a).getContext();
    }
    
    @Override
    public final CharSequence getTitle() {
        return this.a.getTitle();
    }
    
    @Override
    public final boolean h() {
        final Toolbar.f r = this.a.R;
        return r != null && r.g != null;
    }
    
    @Override
    public final void i(final int b) {
        final int n = this.b ^ b;
        this.b = b;
        if (n != 0) {
            if ((n & 0x4) != 0x0) {
                if ((b & 0x4) != 0x0) {
                    this.v();
                }
                if ((this.b & 0x4) != 0x0) {
                    final Toolbar a = this.a;
                    Drawable navigationIcon = this.g;
                    if (navigationIcon == null) {
                        navigationIcon = this.p;
                    }
                    a.setNavigationIcon(navigationIcon);
                }
                else {
                    this.a.setNavigationIcon(null);
                }
            }
            if ((n & 0x3) != 0x0) {
                this.w();
            }
            if ((n & 0x8) != 0x0) {
                if ((b & 0x8) != 0x0) {
                    this.a.setTitle(this.i);
                    this.a.setSubtitle(this.j);
                }
                else {
                    this.a.setTitle(null);
                    this.a.setSubtitle(null);
                }
            }
            if ((n & 0x10) != 0x0) {
                final View d = this.d;
                if (d != null) {
                    if ((b & 0x10) != 0x0) {
                        this.a.addView(d);
                    }
                    else {
                        this.a.removeView(d);
                    }
                }
            }
        }
    }
    
    @Override
    public final void j() {
    }
    
    @Override
    public final void k() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }
    
    @Override
    public final void l(final boolean collapsible) {
        this.a.setCollapsible(collapsible);
    }
    
    @Override
    public final void m() {
        final ActionMenuView f = this.a.f;
        if (f != null) {
            final c j = f.j;
            if (j != null) {
                j.h();
                final c.a z = j.z;
                if (z != null && z.b()) {
                    ((l.f)z.j).dismiss();
                }
            }
        }
    }
    
    @Override
    public final void n() {
    }
    
    @Override
    public final void o(final Drawable f) {
        this.f = f;
        this.w();
    }
    
    @Override
    public final void p() {
        final r0 c = this.c;
        if (c != null) {
            final ViewParent parent = ((View)c).getParent();
            final Toolbar a = this.a;
            if (parent == a) {
                a.removeView((View)this.c);
            }
        }
        this.c = null;
    }
    
    @Override
    public final void q(final int visibility) {
        ((View)this.a).setVisibility(visibility);
    }
    
    @Override
    public final int r() {
        return this.b;
    }
    
    @Override
    public final void s() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }
    
    @Override
    public final void setIcon(final int n) {
        Drawable l;
        if (n != 0) {
            l = n0.L(this.getContext(), n);
        }
        else {
            l = null;
        }
        this.setIcon(l);
    }
    
    @Override
    public final void setIcon(final Drawable e) {
        this.e = e;
        this.w();
    }
    
    @Override
    public final void setTitle(final CharSequence charSequence) {
        this.h = true;
        this.i = charSequence;
        if ((this.b & 0x8) != 0x0) {
            this.a.setTitle(charSequence);
            if (this.h) {
                p0.m(((View)this.a).getRootView(), charSequence);
            }
        }
    }
    
    @Override
    public final void setWindowCallback(final Window$Callback l) {
        this.l = l;
    }
    
    @Override
    public final void setWindowTitle(final CharSequence charSequence) {
        if (!this.h) {
            this.i = charSequence;
            if ((this.b & 0x8) != 0x0) {
                this.a.setTitle(charSequence);
                if (this.h) {
                    p0.m(((View)this.a).getRootView(), charSequence);
                }
            }
        }
    }
    
    @Override
    public final s1 t(final int n, final long n2) {
        final s1 a = p0.a((View)this.a);
        float n3;
        if (n == 0) {
            n3 = 1.0f;
        }
        else {
            n3 = 0.0f;
        }
        a.a(n3);
        a.c(n2);
        a.e((t1)new c1$a(this, n));
        return a;
    }
    
    @Override
    public final void u(final int n) {
        Drawable l;
        if (n != 0) {
            l = n0.L(this.getContext(), n);
        }
        else {
            l = null;
        }
        this.o(l);
    }
    
    public final void v() {
        if ((this.b & 0x4) != 0x0) {
            if (TextUtils.isEmpty(this.k)) {
                this.a.setNavigationContentDescription(this.o);
            }
            else {
                this.a.setNavigationContentDescription(this.k);
            }
        }
    }
    
    public final void w() {
        final int b = this.b;
        Drawable logo;
        if ((b & 0x2) != 0x0) {
            if ((b & 0x1) != 0x0) {
                logo = this.f;
                if (logo == null) {
                    logo = this.e;
                }
            }
            else {
                logo = this.e;
            }
        }
        else {
            logo = null;
        }
        this.a.setLogo(logo);
    }
}
