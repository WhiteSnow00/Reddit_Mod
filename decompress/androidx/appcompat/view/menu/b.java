// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.view.menu;

import android.widget.AdapterView;
import android.view.MenuItem;
import android.widget.AdapterView$OnItemClickListener;
import androidx.appcompat.widget.j0;
import java.lang.reflect.Method;
import android.widget.TextView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.graphics.Rect;
import androidx.appcompat.widget.k0$b;
import android.util.Log;
import android.os.Build$VERSION;
import android.view.LayoutInflater;
import android.view.KeyEvent;
import android.view.Gravity;
import android.widget.ListAdapter;
import java.util.Iterator;
import android.widget.HeaderViewListAdapter;
import androidx.appcompat.widget.e0;
import android.os.Parcelable;
import android.view.View$OnAttachStateChangeListener;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.transition.Transition;
import android.widget.PopupWindow;
import androidx.appcompat.widget.k0;
import android.content.res.Resources;
import java.util.WeakHashMap;
import a4.l0$e;
import a4.l0;
import android.view.View;
import java.util.ArrayList;
import android.os.Handler;
import android.content.Context;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow$OnDismissListener;
import android.view.View$OnKeyListener;
import l.d;

public final class b extends d implements View$OnKeyListener, PopupWindow$OnDismissListener
{
    public boolean A;
    public boolean B;
    public i$a C;
    public ViewTreeObserver D;
    public PopupWindow$OnDismissListener E;
    public boolean F;
    public final Context g;
    public final int h;
    public final int i;
    public final int j;
    public final boolean k;
    public final Handler l;
    public final ArrayList m;
    public final ArrayList n;
    public final b$a o;
    public final b$b p;
    public final b$c q;
    public int r;
    public int s;
    public View t;
    public View u;
    public int v;
    public boolean w;
    public boolean x;
    public int y;
    public int z;
    
    public b(final Context g, final View t, int n, final int j, final boolean k) {
        this.m = new ArrayList();
        this.n = new ArrayList();
        this.o = new b$a(this);
        this.p = new b$b(this);
        this.q = new b$c(this);
        final int n2 = 0;
        this.r = 0;
        this.s = 0;
        this.g = g;
        this.t = t;
        this.i = n;
        this.j = j;
        this.k = k;
        this.A = false;
        final WeakHashMap a = l0.a;
        if (l0$e.d(t) == 1) {
            n = n2;
        }
        else {
            n = 1;
        }
        this.v = n;
        final Resources resources = g.getResources();
        this.h = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165208));
        this.l = new Handler();
    }
    
    public final boolean a() {
        final int size = this.n.size();
        boolean b = false;
        if (size > 0) {
            b = b;
            if (this.n.get(0).a.a()) {
                b = true;
            }
        }
        return b;
    }
    
    public final void b(final MenuBuilder menuBuilder, final boolean b) {
        final int size = this.n.size();
        int i = 0;
        while (true) {
            while (i < size) {
                if (menuBuilder == ((b.b$d)this.n.get(i)).b) {
                    if (i < 0) {
                        return;
                    }
                    final int n = i + 1;
                    if (n < this.n.size()) {
                        ((b.b$d)this.n.get(n)).b.close(false);
                    }
                    final b.b$d b$d = this.n.remove(i);
                    b$d.b.removeMenuPresenter((i)this);
                    if (this.F) {
                        k0.a.b((PopupWindow)b$d.a.D, null);
                        ((PopupWindow)b$d.a.D).setAnimationStyle(0);
                    }
                    b$d.a.dismiss();
                    final int size2 = this.n.size();
                    if (size2 > 0) {
                        this.v = ((b.b$d)this.n.get(size2 - 1)).c;
                    }
                    else {
                        final View t = this.t;
                        final WeakHashMap a = l0.a;
                        this.v = ((l0$e.d(t) != 1) ? 1 : 0);
                    }
                    if (size2 == 0) {
                        this.dismiss();
                        final i$a c = this.C;
                        if (c != null) {
                            c.b(menuBuilder, true);
                        }
                        final ViewTreeObserver d = this.D;
                        if (d != null) {
                            if (d.isAlive()) {
                                this.D.removeGlobalOnLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this.o);
                            }
                            this.D = null;
                        }
                        this.u.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this.p);
                        this.E.onDismiss();
                    }
                    else if (b) {
                        this.n.get(0).b.close(false);
                    }
                    return;
                }
                else {
                    ++i;
                }
            }
            i = -1;
            continue;
        }
    }
    
    public final Parcelable c() {
        return null;
    }
    
    public final void dismiss() {
        int size = this.n.size();
        if (size > 0) {
            final b.b$d[] array = this.n.toArray(new b.b$d[size]);
            while (true) {
                final int n = size - 1;
                if (n < 0) {
                    break;
                }
                final b.b$d b$d = array[n];
                size = n;
                if (!b$d.a.a()) {
                    continue;
                }
                b$d.a.dismiss();
                size = n;
            }
        }
    }
    
    public final boolean e() {
        return false;
    }
    
    public final void g(final i$a c) {
        this.C = c;
    }
    
    public final e0 h() {
        e0 h;
        if (this.n.isEmpty()) {
            h = null;
        }
        else {
            final ArrayList n = this.n;
            h = ((b.b$d)n.get(n.size() - 1)).a.h;
        }
        return h;
    }
    
    public final void j(final Parcelable parcelable) {
    }
    
    public final void k() {
        final Iterator iterator = this.n.iterator();
        while (iterator.hasNext()) {
            final ListAdapter adapter = ((b.b$d)iterator.next()).a.h.getAdapter();
            e e;
            if (adapter instanceof HeaderViewListAdapter) {
                e = (e)((HeaderViewListAdapter)adapter).getWrappedAdapter();
            }
            else {
                e = (e)adapter;
            }
            e.notifyDataSetChanged();
        }
    }
    
    public final boolean l(final l l) {
        for (final b.b$d b$d : this.n) {
            if (l == b$d.b) {
                ((View)b$d.a.h).requestFocus();
                return true;
            }
        }
        if (l.hasVisibleItems()) {
            this.m(l);
            final i$a c = this.C;
            if (c != null) {
                c.c((MenuBuilder)l);
            }
            return true;
        }
        return false;
    }
    
    @Override
    public final void m(final MenuBuilder menuBuilder) {
        menuBuilder.addMenuPresenter((i)this, this.g);
        if (this.a()) {
            this.w(menuBuilder);
        }
        else {
            this.m.add(menuBuilder);
        }
    }
    
    @Override
    public final void o(final View t) {
        if (this.t != t) {
            this.t = t;
            final int r = this.r;
            final WeakHashMap a = l0.a;
            this.s = Gravity.getAbsoluteGravity(r, l0$e.d(t));
        }
    }
    
    public final void onDismiss() {
        while (true) {
            for (int size = this.n.size(), i = 0; i < size; ++i) {
                final b.b$d b$d = this.n.get(i);
                if (!b$d.a.a()) {
                    if (b$d != null) {
                        b$d.b.close(false);
                    }
                    return;
                }
            }
            final b.b$d b$d = null;
            continue;
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
    public final void p(final boolean a) {
        this.A = a;
    }
    
    @Override
    public final void q(final int r) {
        if (this.r != r) {
            this.r = r;
            final View t = this.t;
            final WeakHashMap a = l0.a;
            this.s = Gravity.getAbsoluteGravity(r, l0$e.d(t));
        }
    }
    
    @Override
    public final void r(final int y) {
        this.w = true;
        this.y = y;
    }
    
    @Override
    public final void s(final PopupWindow$OnDismissListener e) {
        this.E = e;
    }
    
    public final void show() {
        if (this.a()) {
            return;
        }
        final Iterator iterator = this.m.iterator();
        while (iterator.hasNext()) {
            this.w((MenuBuilder)iterator.next());
        }
        this.m.clear();
        final View t = this.t;
        if ((this.u = t) != null) {
            final boolean b = this.D == null;
            final ViewTreeObserver viewTreeObserver = t.getViewTreeObserver();
            this.D = viewTreeObserver;
            if (b) {
                viewTreeObserver.addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this.o);
            }
            this.u.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)this.p);
        }
    }
    
    @Override
    public final void t(final boolean b) {
        this.B = b;
    }
    
    @Override
    public final void u(final int z) {
        this.x = true;
        this.z = z;
    }
    
    public final void w(final MenuBuilder menuBuilder) {
        final LayoutInflater from = LayoutInflater.from(this.g);
        final e e = new e(menuBuilder, from, this.k, 2131623997);
        if (!this.a() && this.A) {
            e.h = true;
        }
        else if (this.a()) {
            e.h = d.v(menuBuilder);
        }
        int n = d.n(e, this.g, this.h);
        final k0 k0 = new k0(this.g, this.i, this.j);
        k0.G = (j0)this.q;
        k0.u = (AdapterView$OnItemClickListener)this;
        ((PopupWindow)k0.D).setOnDismissListener((PopupWindow$OnDismissListener)this);
        k0.t = this.t;
        k0.q = this.s;
        k0.C = true;
        ((PopupWindow)k0.D).setFocusable(true);
        ((PopupWindow)k0.D).setInputMethodMode(2);
        k0.n((ListAdapter)e);
        k0.q(n);
        k0.q = this.s;
        b.b$d b$d2 = null;
        View t = null;
        Label_0466: {
            Label_0463: {
                if (this.n.size() > 0) {
                    final ArrayList n2 = this.n;
                    final b.b$d b$d = n2.get(n2.size() - 1);
                    final MenuBuilder b = b$d.b;
                    final int size = b.size();
                    int i = 0;
                    while (true) {
                        while (i < size) {
                            final Object item = b.getItem(i);
                            if (((MenuItem)item).hasSubMenu() && menuBuilder == ((MenuItem)item).getSubMenu()) {
                                if (item == null) {
                                    b$d2 = b$d;
                                    break Label_0463;
                                }
                                final e0 h = b$d.a.h;
                                final ListAdapter adapter = h.getAdapter();
                                int headersCount;
                                e e2;
                                if (adapter instanceof HeaderViewListAdapter) {
                                    final HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter)adapter;
                                    headersCount = headerViewListAdapter.getHeadersCount();
                                    e2 = (e)headerViewListAdapter.getWrappedAdapter();
                                }
                                else {
                                    e2 = (e)adapter;
                                    headersCount = 0;
                                }
                                final int count = e2.getCount();
                                int j = 0;
                                while (true) {
                                    while (j < count) {
                                        if (item == e2.c(j)) {
                                            if (j == -1) {
                                                b$d2 = b$d;
                                                break Label_0463;
                                            }
                                            final int n3 = j + headersCount - ((AdapterView)h).getFirstVisiblePosition();
                                            b$d2 = b$d;
                                            if (n3 < 0) {
                                                break Label_0463;
                                            }
                                            if (n3 >= ((ViewGroup)h).getChildCount()) {
                                                b$d2 = b$d;
                                                break Label_0463;
                                            }
                                            final View child = ((ViewGroup)h).getChildAt(n3);
                                            b$d2 = b$d;
                                            t = child;
                                            break Label_0466;
                                        }
                                        else {
                                            ++j;
                                        }
                                    }
                                    j = -1;
                                    continue;
                                }
                            }
                            else {
                                ++i;
                            }
                        }
                        final Object item = null;
                        continue;
                    }
                }
                b$d2 = null;
            }
            t = null;
        }
        if (t != null) {
            if (Build$VERSION.SDK_INT <= 28) {
                final Method h2 = androidx.appcompat.widget.k0.H;
                if (h2 != null) {
                    try {
                        h2.invoke(k0.D, Boolean.FALSE);
                    }
                    catch (final Exception ex) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            }
            else {
                k0$b.a((PopupWindow)k0.D, false);
            }
            androidx.appcompat.widget.k0.a.a((PopupWindow)k0.D, null);
            final ArrayList n4 = this.n;
            final e0 h3 = n4.get(n4.size() - 1).a.h;
            final int[] array = new int[2];
            ((View)h3).getLocationOnScreen(array);
            final Rect rect = new Rect();
            this.u.getWindowVisibleDisplayFrame(rect);
            int v = 0;
            Label_0656: {
                Label_0654: {
                    if (this.v == 1) {
                        if (((View)h3).getWidth() + array[0] + n > rect.right) {
                            break Label_0654;
                        }
                    }
                    else if (array[0] - n >= 0) {
                        break Label_0654;
                    }
                    v = 1;
                    break Label_0656;
                }
                v = 0;
            }
            final boolean b2 = v == 1;
            this.v = v;
            int n5;
            int n6;
            if (Build$VERSION.SDK_INT >= 26) {
                k0.t = t;
                n5 = 0;
                n6 = 0;
            }
            else {
                final int[] array2 = new int[2];
                this.t.getLocationOnScreen(array2);
                final int[] array3 = new int[2];
                t.getLocationOnScreen(array3);
                if ((this.s & 0x7) == 0x5) {
                    array2[0] += this.t.getWidth();
                    array3[0] += t.getWidth();
                }
                n6 = array3[0] - array2[0];
                n5 = array3[1] - array2[1];
            }
            int l = 0;
            Label_0843: {
                if ((this.s & 0x5) == 0x5) {
                    if (b2) {
                        l = n6 + n;
                        break Label_0843;
                    }
                    n = t.getWidth();
                }
                else if (b2) {
                    l = n6 + t.getWidth();
                    break Label_0843;
                }
                l = n6 - n;
            }
            k0.k = l;
            k0.p = true;
            k0.o = true;
            k0.c(n5);
        }
        else {
            if (this.w) {
                k0.k = this.y;
            }
            if (this.x) {
                k0.c(this.z);
            }
            final Rect f = super.f;
            Rect b3;
            if (f != null) {
                b3 = new Rect(f);
            }
            else {
                b3 = null;
            }
            k0.B = b3;
        }
        this.n.add(new b.b$d(k0, menuBuilder, this.v));
        k0.show();
        final e0 h4 = k0.h;
        ((View)h4).setOnKeyListener((View$OnKeyListener)this);
        if (b$d2 == null && this.B && menuBuilder.getHeaderTitle() != null) {
            final FrameLayout frameLayout = (FrameLayout)from.inflate(2131624004, (ViewGroup)h4, false);
            final TextView textView = (TextView)((View)frameLayout).findViewById(16908310);
            ((View)frameLayout).setEnabled(false);
            textView.setText(menuBuilder.getHeaderTitle());
            h4.addHeaderView((View)frameLayout, (Object)null, false);
            k0.show();
        }
    }
}
