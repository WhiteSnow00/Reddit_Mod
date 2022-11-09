// 
// Decompiled by Procyon v0.6.0
// 

package h;

import android.view.Menu;
import a4.t1;
import android.view.animation.Interpolator;
import k.g;
import android.view.MenuInflater;
import androidx.appcompat.widget.c;
import android.view.MenuItem;
import java.lang.ref.WeakReference;
import androidx.appcompat.view.menu.MenuBuilder$a;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.Toolbar;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.BitmapDrawable;
import androidx.appcompat.view.menu.MenuBuilder;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.ContextThemeWrapper;
import android.util.TypedValue;
import a4.s1;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import a4.s1$a;
import a4.q1;
import androidx.appcompat.widget.r0;
import android.app.Dialog;
import a4.v1;
import java.util.WeakHashMap;
import a4.p0;
import a4.u1;
import android.app.Activity;
import k.h;
import java.util.ArrayList;
import k.b;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.c0;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import android.content.Context;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import androidx.appcompat.widget.ActionBarOverlayLayout$d;

public final class y extends a implements ActionBarOverlayLayout$d
{
    public static final AccelerateInterpolator A;
    public static final DecelerateInterpolator B;
    public Context a;
    public Context b;
    public ActionBarOverlayLayout c;
    public ActionBarContainer d;
    public c0 e;
    public ActionBarContextView f;
    public View g;
    public boolean h;
    public d i;
    public d j;
    public b.a k;
    public boolean l;
    public ArrayList<a$b> m;
    public boolean n;
    public int o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public h u;
    public boolean v;
    public boolean w;
    public final y$a x;
    public final y$b y;
    public final y$c z;
    
    static {
        A = new AccelerateInterpolator();
        B = new DecelerateInterpolator();
    }
    
    public y(final Activity activity, final boolean b) {
        new ArrayList();
        this.m = new ArrayList<a$b>();
        this.o = 0;
        this.p = true;
        this.t = true;
        this.x = new u1() {
            public final void j() {
                final y z = h.y.this;
                if (z.p) {
                    final View g = z.g;
                    if (g != null) {
                        g.setTranslationY(0.0f);
                        ((View)h.y.this.d).setTranslationY(0.0f);
                    }
                }
                h.y.this.d.setVisibility(8);
                h.y.this.d.setTransitioning(false);
                final y z2 = h.y.this;
                z2.u = null;
                final b.a k = z2.k;
                if (k != null) {
                    k.d(z2.j);
                    z2.j = null;
                    z2.k = null;
                }
                final ActionBarOverlayLayout c = h.y.this.c;
                if (c != null) {
                    final WeakHashMap a = p0.a;
                    p0.h.c((View)c);
                }
            }
        };
        this.y = new u1() {
            public final void j() {
                final y z = h.y.this;
                z.u = null;
                ((View)z.d).requestLayout();
            }
        };
        this.z = new v1() {};
        final View decorView = activity.getWindow().getDecorView();
        this.z(decorView);
        if (!b) {
            this.g = decorView.findViewById(16908290);
        }
    }
    
    public y(final Dialog dialog) {
        new ArrayList();
        this.m = new ArrayList<a$b>();
        this.o = 0;
        this.p = true;
        this.t = true;
        this.x = new u1() {
            public final void j() {
                final y z = h.y.this;
                if (z.p) {
                    final View g = z.g;
                    if (g != null) {
                        g.setTranslationY(0.0f);
                        ((View)h.y.this.d).setTranslationY(0.0f);
                    }
                }
                h.y.this.d.setVisibility(8);
                h.y.this.d.setTransitioning(false);
                final y z2 = h.y.this;
                z2.u = null;
                final b.a k = z2.k;
                if (k != null) {
                    k.d(z2.j);
                    z2.j = null;
                    z2.k = null;
                }
                final ActionBarOverlayLayout c = h.y.this.c;
                if (c != null) {
                    final WeakHashMap a = p0.a;
                    p0.h.c((View)c);
                }
            }
        };
        this.y = new u1() {
            public final void j() {
                final y z = h.y.this;
                z.u = null;
                ((View)z.d).requestLayout();
            }
        };
        this.z = new v1() {};
        this.z(dialog.getWindow().getDecorView());
    }
    
    public final void A(final int n, final int n2) {
        final int r = this.e.r();
        if ((n2 & 0x4) != 0x0) {
            this.h = true;
        }
        this.e.i((n & n2) | (~n2 & r));
    }
    
    public final void B(final boolean n) {
        if (!(this.n = n)) {
            this.e.p();
            this.d.setTabContainer((r0)null);
        }
        else {
            this.d.setTabContainer((r0)null);
            this.e.p();
        }
        this.e.j();
        final c0 e = this.e;
        final boolean n2 = this.n;
        e.l(false);
        final ActionBarOverlayLayout c = this.c;
        final boolean n3 = this.n;
        c.setHasNonEmbeddedTabs(false);
    }
    
    public final void C(final boolean b) {
        final boolean q = this.q;
        final boolean r = this.r;
        final boolean b2 = this.s || (!q && !r);
        final ValueAnimator$AnimatorUpdateListener valueAnimator$AnimatorUpdateListener = null;
        Object o = null;
        if (b2) {
            if (!this.t) {
                this.t = true;
                final h u = this.u;
                if (u != null) {
                    u.a();
                }
                this.d.setVisibility(0);
                if (this.o == 0 && (this.v || b)) {
                    ((View)this.d).setTranslationY(0.0f);
                    float n2;
                    final float n = n2 = (float)(-((View)this.d).getHeight());
                    if (b) {
                        final int[] array2;
                        final int[] array = array2 = new int[2];
                        array2[1] = (array2[0] = 0);
                        ((View)this.d).getLocationInWindow(array);
                        n2 = n - array[1];
                    }
                    ((View)this.d).setTranslationY(n2);
                    final h u2 = new h();
                    final s1 a = p0.a((View)this.d);
                    a.h(0.0f);
                    final v1 z = (v1)this.z;
                    final View view = (View)a.a.get();
                    if (view != null) {
                        if (z != null) {
                            o = new q1(z, view);
                        }
                        s1$a.a(view.animate(), (ValueAnimator$AnimatorUpdateListener)o);
                    }
                    if (!u2.e) {
                        u2.a.add(a);
                    }
                    if (this.p) {
                        final View g = this.g;
                        if (g != null) {
                            g.setTranslationY(n2);
                            final s1 a2 = p0.a(this.g);
                            a2.h(0.0f);
                            if (!u2.e) {
                                u2.a.add(a2);
                            }
                        }
                    }
                    final DecelerateInterpolator b3 = h.y.B;
                    final boolean e = u2.e;
                    if (!e) {
                        u2.c = (Interpolator)b3;
                    }
                    if (!e) {
                        u2.b = 250L;
                    }
                    final u1 y = this.y;
                    if (!e) {
                        u2.d = (t1)y;
                    }
                    (this.u = u2).b();
                }
                else {
                    ((View)this.d).setAlpha(1.0f);
                    ((View)this.d).setTranslationY(0.0f);
                    if (this.p) {
                        final View g2 = this.g;
                        if (g2 != null) {
                            g2.setTranslationY(0.0f);
                        }
                    }
                    this.y.j();
                }
                final ActionBarOverlayLayout c = this.c;
                if (c != null) {
                    final WeakHashMap a3 = p0.a;
                    p0.h.c((View)c);
                }
            }
        }
        else if (this.t) {
            this.t = false;
            final h u3 = this.u;
            if (u3 != null) {
                u3.a();
            }
            if (this.o == 0 && (this.v || b)) {
                ((View)this.d).setAlpha(1.0f);
                this.d.setTransitioning(true);
                final h u4 = new h();
                float n4;
                final float n3 = n4 = (float)(-((View)this.d).getHeight());
                if (b) {
                    final int[] array4;
                    final int[] array3 = array4 = new int[2];
                    array4[1] = (array4[0] = 0);
                    ((View)this.d).getLocationInWindow(array3);
                    n4 = n3 - array3[1];
                }
                final s1 a4 = p0.a((View)this.d);
                a4.h(n4);
                final v1 z2 = (v1)this.z;
                final View view2 = (View)a4.a.get();
                if (view2 != null) {
                    Object o2 = valueAnimator$AnimatorUpdateListener;
                    if (z2 != null) {
                        o2 = new q1(z2, view2);
                    }
                    s1$a.a(view2.animate(), (ValueAnimator$AnimatorUpdateListener)o2);
                }
                if (!u4.e) {
                    u4.a.add(a4);
                }
                if (this.p) {
                    final View g3 = this.g;
                    if (g3 != null) {
                        final s1 a5 = p0.a(g3);
                        a5.h(n4);
                        if (!u4.e) {
                            u4.a.add(a5);
                        }
                    }
                }
                final AccelerateInterpolator a6 = h.y.A;
                final boolean e2 = u4.e;
                if (!e2) {
                    u4.c = (Interpolator)a6;
                }
                if (!e2) {
                    u4.b = 250L;
                }
                final u1 x = this.x;
                if (!e2) {
                    u4.d = (t1)x;
                }
                (this.u = u4).b();
            }
            else {
                this.x.j();
            }
        }
    }
    
    public final boolean b() {
        final c0 e = this.e;
        if (e != null && e.h()) {
            this.e.collapseActionView();
            return true;
        }
        return false;
    }
    
    public final void c(final boolean l) {
        if (l == this.l) {
            return;
        }
        this.l = l;
        for (int size = this.m.size(), i = 0; i < size; ++i) {
            this.m.get(i).a();
        }
    }
    
    public final int d() {
        return this.e.r();
    }
    
    public final Context e() {
        if (this.b == null) {
            final TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(2130968588, typedValue, true);
            final int resourceId = typedValue.resourceId;
            if (resourceId != 0) {
                this.b = (Context)new ContextThemeWrapper(this.a, resourceId);
            }
            else {
                this.b = this.a;
            }
        }
        return this.b;
    }
    
    public final void f() {
        if (!this.q) {
            this.q = true;
            this.C(false);
        }
    }
    
    public final void h() {
        this.B(this.a.getResources().getBoolean(2131034112));
    }
    
    public final boolean j(final int n, final KeyEvent keyEvent) {
        final d i = this.i;
        if (i == null) {
            return false;
        }
        final MenuBuilder j = i.i;
        if (j != null) {
            int deviceId;
            if (keyEvent != null) {
                deviceId = keyEvent.getDeviceId();
            }
            else {
                deviceId = -1;
            }
            final int keyboardType = KeyCharacterMap.load(deviceId).getKeyboardType();
            boolean qwertyMode = true;
            if (keyboardType == 1) {
                qwertyMode = false;
            }
            ((Menu)j).setQwertyMode(qwertyMode);
            return ((Menu)j).performShortcut(n, keyEvent, 0);
        }
        return false;
    }
    
    public final void m(final boolean b) {
        if (!this.h) {
            this.n(b);
        }
    }
    
    public final void n(final boolean b) {
        int n;
        if (b) {
            n = 4;
        }
        else {
            n = 0;
        }
        this.A(n, 4);
    }
    
    public final void o() {
        this.A(2, 2);
    }
    
    public final void p() {
        this.A(0, 8);
    }
    
    public final void q(final boolean b) {
        this.e.n();
    }
    
    public final void r(final BitmapDrawable icon) {
        this.e.setIcon((Drawable)icon);
    }
    
    public final void s() {
        this.e.o(null);
    }
    
    public final void t(final boolean v) {
        if (!(this.v = v)) {
            final h u = this.u;
            if (u != null) {
                u.a();
            }
        }
    }
    
    public final void u(final String title) {
        this.e.setTitle(title);
    }
    
    public final void v(final CharSequence windowTitle) {
        this.e.setWindowTitle(windowTitle);
    }
    
    public final void w() {
        if (this.q) {
            this.C(this.q = false);
        }
    }
    
    public final b x(final f.e e) {
        final d i = this.i;
        if (i != null) {
            i.c();
        }
        this.c.setHideOnContentScrollEnabled(false);
        this.f.h();
        final d j = new d(((View)this.f).getContext(), e);
        j.i.stopDispatchingItemsChanged();
        try {
            final boolean b = j.j.b(j, j.i);
            j.i.startDispatchingItemsChanged();
            if (b) {
                (this.i = j).i();
                this.f.f(j);
                this.y(true);
                return j;
            }
            return null;
        }
        finally {
            j.i.startDispatchingItemsChanged();
        }
    }
    
    public final void y(final boolean b) {
        if (b) {
            if (!this.s) {
                this.s = true;
                final ActionBarOverlayLayout c = this.c;
                if (c != null) {
                    c.setShowingForActionMode(true);
                }
                this.C(false);
            }
        }
        else if (this.s) {
            this.s = false;
            final ActionBarOverlayLayout c2 = this.c;
            if (c2 != null) {
                c2.setShowingForActionMode(false);
            }
            this.C(false);
        }
        final ActionBarContainer d = this.d;
        final WeakHashMap a = p0.a;
        if (p0.g.c((View)d)) {
            s1 s1;
            s1 s2;
            if (b) {
                s1 = this.e.t(4, 100L);
                s2 = this.f.e(0, 200L);
            }
            else {
                s2 = this.e.t(0, 200L);
                s1 = this.f.e(8, 100L);
            }
            final h h = new h();
            h.a.add(s1);
            final View view = (View)s1.a.get();
            long duration;
            if (view != null) {
                duration = view.animate().getDuration();
            }
            else {
                duration = 0L;
            }
            s2.f(duration);
            h.a.add(s2);
            h.b();
        }
        else if (b) {
            this.e.q(4);
            this.f.setVisibility(0);
        }
        else {
            this.e.q(0);
            this.f.setVisibility(8);
        }
    }
    
    public final void z(final View view) {
        final ActionBarOverlayLayout c = (ActionBarOverlayLayout)view.findViewById(2131428653);
        this.c = c;
        if (c != null) {
            c.setActionBarVisibilityCallback((ActionBarOverlayLayout$d)this);
        }
        final View viewById = view.findViewById(2131427431);
        c0 wrapper;
        if (viewById instanceof c0) {
            wrapper = (c0)viewById;
        }
        else {
            if (!(viewById instanceof Toolbar)) {
                final StringBuilder k = a.k("Can't make a decor toolbar out of ");
                String simpleName;
                if (viewById != null) {
                    simpleName = ((Toolbar)viewById).getClass().getSimpleName();
                }
                else {
                    simpleName = "null";
                }
                k.append(simpleName);
                throw new IllegalStateException(k.toString());
            }
            wrapper = ((Toolbar)viewById).getWrapper();
        }
        this.e = wrapper;
        this.f = (ActionBarContextView)view.findViewById(2131427452);
        final ActionBarContainer d = (ActionBarContainer)view.findViewById(2131427433);
        this.d = d;
        final c0 e = this.e;
        if (e != null && this.f != null && d != null) {
            this.a = e.getContext();
            final boolean b = (this.e.r() & 0x4) != 0x0;
            if (b) {
                this.h = true;
            }
            final Context a = this.a;
            final k.a a2 = new k.a(a);
            this.q(a.getApplicationInfo().targetSdkVersion < 14 || b);
            this.B(a2.a.getResources().getBoolean(2131034112));
            final TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes((AttributeSet)null, gn.a.Q, 2130968583, 0);
            if (obtainStyledAttributes.getBoolean(14, false)) {
                final ActionBarOverlayLayout c2 = this.c;
                if (!c2.m) {
                    throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                }
                c2.setHideOnContentScrollEnabled(this.w = true);
            }
            final int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
            if (dimensionPixelSize != 0) {
                final float n = (float)dimensionPixelSize;
                final ActionBarContainer d2 = this.d;
                final WeakHashMap a3 = p0.a;
                p0.i.s((View)d2, n);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(y.class.getSimpleName());
        sb.append(" can only be used with a compatible window decor layout");
        throw new IllegalStateException(sb.toString());
    }
    
    public final class d extends b implements MenuBuilder$a
    {
        public final Context h;
        public final MenuBuilder i;
        public a j;
        public WeakReference<View> k;
        
        public d(final Context h, final f.e j) {
            this.h = h;
            this.j = j;
            (this.i = new MenuBuilder(h).setDefaultShowAsAction(1)).setCallback((MenuBuilder.MenuBuilder$a)this);
        }
        
        public final boolean a(final MenuBuilder menuBuilder, final MenuItem menuItem) {
            final a j = this.j;
            return j != null && j.c(this, menuItem);
        }
        
        public final void b(final MenuBuilder menuBuilder) {
            if (this.j == null) {
                return;
            }
            this.i();
            final c i = h.y.this.f.i;
            if (i != null) {
                i.n();
            }
        }
        
        @Override
        public final void c() {
            final y l = h.y.this;
            if (l.i != this) {
                return;
            }
            final boolean q = l.q;
            final boolean r = l.r;
            boolean b = true;
            if (q || r) {
                b = false;
            }
            if (!b) {
                l.j = this;
                l.k = this.j;
            }
            else {
                this.j.d(this);
            }
            this.j = null;
            h.y.this.y(false);
            final ActionBarContextView f = h.y.this.f;
            if (f.p == null) {
                f.h();
            }
            final y i = h.y.this;
            i.c.setHideOnContentScrollEnabled(i.w);
            h.y.this.i = null;
        }
        
        @Override
        public final View d() {
            final WeakReference<View> k = this.k;
            View view;
            if (k != null) {
                view = k.get();
            }
            else {
                view = null;
            }
            return view;
        }
        
        @Override
        public final MenuBuilder e() {
            return this.i;
        }
        
        @Override
        public final MenuInflater f() {
            return new g(this.h);
        }
        
        @Override
        public final CharSequence g() {
            return h.y.this.f.getSubtitle();
        }
        
        @Override
        public final CharSequence h() {
            return h.y.this.f.getTitle();
        }
        
        @Override
        public final void i() {
            if (h.y.this.i != this) {
                return;
            }
            this.i.stopDispatchingItemsChanged();
            try {
                this.j.a(this, this.i);
            }
            finally {
                this.i.startDispatchingItemsChanged();
            }
        }
        
        @Override
        public final boolean j() {
            return h.y.this.f.x;
        }
        
        @Override
        public final void k(final View customView) {
            h.y.this.f.setCustomView(customView);
            this.k = new WeakReference<View>(customView);
        }
        
        @Override
        public final void l(final int n) {
            this.m(h.y.this.a.getResources().getString(n));
        }
        
        @Override
        public final void m(final CharSequence subtitle) {
            h.y.this.f.setSubtitle(subtitle);
        }
        
        @Override
        public final void n(final int n) {
            this.o(h.y.this.a.getResources().getString(n));
        }
        
        @Override
        public final void o(final CharSequence title) {
            h.y.this.f.setTitle(title);
        }
        
        @Override
        public final void p(final boolean b) {
            super.g = b;
            h.y.this.f.setTitleOptional(b);
        }
    }
}
