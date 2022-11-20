// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.view.menu;

import android.widget.AdapterView$OnItemClickListener;
import android.widget.PopupWindow;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View$OnAttachStateChangeListener;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import java.util.WeakHashMap;
import android.view.Gravity;
import a4.l0$e;
import a4.l0;
import androidx.appcompat.widget.e0;
import android.os.Parcelable;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewTreeObserver;
import android.view.View;
import androidx.appcompat.widget.k0;
import android.content.Context;
import android.view.View$OnKeyListener;
import android.widget.PopupWindow$OnDismissListener;
import l.d;

public final class k extends d implements PopupWindow$OnDismissListener, View$OnKeyListener
{
    public final Context g;
    public final MenuBuilder h;
    public final e i;
    public final boolean j;
    public final int k;
    public final int l;
    public final int m;
    public final k0 n;
    public final k$a o;
    public final k$b p;
    public PopupWindow$OnDismissListener q;
    public View r;
    public View s;
    public i$a t;
    public ViewTreeObserver u;
    public boolean v;
    public boolean w;
    public int x;
    public int y;
    public boolean z;
    
    public k(final int l, final int m, final Context g, final View r, final MenuBuilder h, final boolean j) {
        this.o = new k$a(this);
        this.p = new k$b(this);
        this.y = 0;
        this.g = g;
        this.h = h;
        this.j = j;
        this.i = new e(h, LayoutInflater.from(g), j, 2131624005);
        this.l = l;
        this.m = m;
        final Resources resources = g.getResources();
        this.k = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165208));
        this.r = r;
        this.n = new k0(g, l, m);
        h.addMenuPresenter((i)this, g);
    }
    
    public final boolean a() {
        return !this.v && this.n.a();
    }
    
    public final void b(final MenuBuilder menuBuilder, final boolean b) {
        if (menuBuilder != this.h) {
            return;
        }
        this.dismiss();
        final i$a t = this.t;
        if (t != null) {
            t.b(menuBuilder, b);
        }
    }
    
    public final Parcelable c() {
        return null;
    }
    
    public final void dismiss() {
        if (this.a()) {
            this.n.dismiss();
        }
    }
    
    public final boolean e() {
        return false;
    }
    
    public final void g(final i$a t) {
        this.t = t;
    }
    
    public final e0 h() {
        return this.n.h;
    }
    
    public final void j(final Parcelable parcelable) {
    }
    
    public final void k() {
        this.w = false;
        final e i = this.i;
        if (i != null) {
            i.notifyDataSetChanged();
        }
    }
    
    public final boolean l(final l l) {
        if (l.hasVisibleItems()) {
            final h h = new h(this.l, this.m, this.g, this.s, (MenuBuilder)l, this.j);
            final i$a t = this.t;
            h.i = t;
            final d j = h.j;
            if (j != null) {
                ((i)j).g(t);
            }
            final boolean v = d.v(l);
            h.h = v;
            final d i = h.j;
            if (i != null) {
                i.p(v);
            }
            h.k = this.q;
            this.q = null;
            this.h.close(false);
            final k0 n = this.n;
            final int k = n.k;
            final int f = n.f();
            final int y = this.y;
            final View r = this.r;
            final WeakHashMap a = l0.a;
            int n2 = k;
            if ((Gravity.getAbsoluteGravity(y, l0$e.d(r)) & 0x7) == 0x5) {
                n2 = k + this.r.getWidth();
            }
            boolean b = false;
            Label_0238: {
                if (!h.b()) {
                    if (h.f == null) {
                        b = false;
                        break Label_0238;
                    }
                    h.d(n2, f, true, true);
                }
                b = true;
            }
            if (b) {
                final i$a t2 = this.t;
                if (t2 != null) {
                    t2.c((MenuBuilder)l);
                }
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final void m(final MenuBuilder menuBuilder) {
    }
    
    @Override
    public final void o(final View r) {
        this.r = r;
    }
    
    public final void onDismiss() {
        this.v = true;
        this.h.close();
        final ViewTreeObserver u = this.u;
        if (u != null) {
            if (!u.isAlive()) {
                this.u = this.s.getViewTreeObserver();
            }
            this.u.removeGlobalOnLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this.o);
            this.u = null;
        }
        this.s.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this.p);
        final PopupWindow$OnDismissListener q = this.q;
        if (q != null) {
            q.onDismiss();
        }
    }
    
    public final boolean onKey(final View view, final int n, final KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && n == 82) {
            this.dismiss();
            return true;
        }
        return false;
    }
    
    @Override
    public final void p(final boolean h) {
        this.i.h = h;
    }
    
    @Override
    public final void q(final int y) {
        this.y = y;
    }
    
    @Override
    public final void r(final int k) {
        this.n.k = k;
    }
    
    @Override
    public final void s(final PopupWindow$OnDismissListener q) {
        this.q = q;
    }
    
    public final void show() {
        final boolean a = this.a();
        final boolean b = true;
        int n = 0;
        Label_0388: {
            if (a) {
                n = (b ? 1 : 0);
            }
            else {
                if (!this.v) {
                    final View r = this.r;
                    if (r != null) {
                        this.s = r;
                        ((PopupWindow)this.n.D).setOnDismissListener((PopupWindow$OnDismissListener)this);
                        final k0 n2 = this.n;
                        n2.u = (AdapterView$OnItemClickListener)this;
                        n2.C = true;
                        ((PopupWindow)n2.D).setFocusable(true);
                        final View s = this.s;
                        final boolean b2 = this.u == null;
                        final ViewTreeObserver viewTreeObserver = s.getViewTreeObserver();
                        this.u = viewTreeObserver;
                        if (b2) {
                            viewTreeObserver.addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this.o);
                        }
                        s.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)this.p);
                        final k0 n3 = this.n;
                        n3.t = s;
                        n3.q = this.y;
                        if (!this.w) {
                            this.x = d.n(this.i, this.g, this.k);
                            this.w = true;
                        }
                        this.n.q(this.x);
                        ((PopupWindow)this.n.D).setInputMethodMode(2);
                        final k0 n4 = this.n;
                        final Rect f = super.f;
                        Rect b3;
                        if (f != null) {
                            n4.getClass();
                            b3 = new Rect(f);
                        }
                        else {
                            b3 = null;
                        }
                        n4.B = b3;
                        this.n.show();
                        final e0 h = this.n.h;
                        ((View)h).setOnKeyListener((View$OnKeyListener)this);
                        if (this.z && this.h.getHeaderTitle() != null) {
                            final FrameLayout frameLayout = (FrameLayout)LayoutInflater.from(this.g).inflate(2131624004, (ViewGroup)h, false);
                            final TextView textView = (TextView)((View)frameLayout).findViewById(16908310);
                            if (textView != null) {
                                textView.setText(this.h.getHeaderTitle());
                            }
                            ((View)frameLayout).setEnabled(false);
                            h.addHeaderView((View)frameLayout, (Object)null, false);
                        }
                        this.n.n((ListAdapter)this.i);
                        this.n.show();
                        n = (b ? 1 : 0);
                        break Label_0388;
                    }
                }
                n = 0;
            }
        }
        if (n != 0) {
            return;
        }
        throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
    }
    
    @Override
    public final void t(final boolean z) {
        this.z = z;
    }
    
    @Override
    public final void u(final int n) {
        this.n.c(n);
    }
}
