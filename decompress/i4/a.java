// 
// Decompiled by Procyon v0.6.0
// 

package i4;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import a4.l0$e;
import j0.j;
import b4.d;
import b4.b;
import java.util.ArrayList;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityRecord;
import b4.f;
import android.view.accessibility.AccessibilityEvent;
import java.util.WeakHashMap;
import a4.l0$d;
import a4.l0;
import b4.c;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.graphics.Rect;

public abstract class a extends a4.a
{
    public static final Rect l;
    public static final a$a m;
    public static final a$b n;
    public final Rect b;
    public final Rect c;
    public final Rect d;
    public final int[] e;
    public final AccessibilityManager f;
    public final View g;
    public c h;
    public int i;
    public int j;
    public int k;
    
    static {
        l = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        m = new b$a<b4.c>() {};
        n = new a$b();
    }
    
    public a(final View g) {
        this.b = new Rect();
        this.c = new Rect();
        this.d = new Rect();
        this.e = new int[2];
        this.i = Integer.MIN_VALUE;
        this.j = Integer.MIN_VALUE;
        this.k = Integer.MIN_VALUE;
        if (g != null) {
            this.g = g;
            this.f = (AccessibilityManager)g.getContext().getSystemService("accessibility");
            g.setFocusable(true);
            final WeakHashMap a = l0.a;
            if (l0$d.c(g) == 0) {
                l0$d.s(g, 1);
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }
    
    public final boolean a(final int n) {
        if (this.j != n) {
            return false;
        }
        this.j = Integer.MIN_VALUE;
        this.n(n, false);
        this.p(n, 8);
        return true;
    }
    
    public final AccessibilityEvent b(final int n, final int n2) {
        if (n == -1) {
            final AccessibilityEvent obtain = AccessibilityEvent.obtain(n2);
            this.g.onInitializeAccessibilityEvent(obtain);
            return obtain;
        }
        final AccessibilityEvent obtain2 = AccessibilityEvent.obtain(n2);
        final b4.c i = this.i(n);
        ((AccessibilityRecord)obtain2).getText().add(i.j());
        ((AccessibilityRecord)obtain2).setContentDescription(i.f());
        ((AccessibilityRecord)obtain2).setScrollable(i.a.isScrollable());
        ((AccessibilityRecord)obtain2).setPassword(i.a.isPassword());
        ((AccessibilityRecord)obtain2).setEnabled(i.a.isEnabled());
        ((AccessibilityRecord)obtain2).setChecked(i.a.isChecked());
        this.k(obtain2, n);
        if (((AccessibilityRecord)obtain2).getText().isEmpty() && ((AccessibilityRecord)obtain2).getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        ((AccessibilityRecord)obtain2).setClassName(i.a.getClassName());
        b4.f.a((AccessibilityRecord)obtain2, this.g, n);
        obtain2.setPackageName((CharSequence)this.g.getContext().getPackageName());
        return obtain2;
    }
    
    public final b4.c c(int i) {
        final b4.c k = b4.c.k();
        k.a.setEnabled(true);
        k.a.setFocusable(true);
        k.p((CharSequence)"android.view.View");
        final Rect l = a.l;
        k.o(l);
        k.a.setBoundsInScreen(l);
        final View g = this.g;
        k.b = -1;
        k.a.setParent(g);
        this.m(i, k);
        if (k.j() == null && k.f() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        k.e(this.c);
        if (this.c.equals((Object)l)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        final int actions = k.a.getActions();
        if ((actions & 0x40) != 0x0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 0x80) == 0x0) {
            k.a.setPackageName((CharSequence)this.g.getContext().getPackageName());
            final View g2 = this.g;
            k.c = i;
            k.a.setSource(g2, i);
            final int j = this.i;
            final int n = 0;
            if (j == i) {
                k.a.setAccessibilityFocused(true);
                k.a(128);
            }
            else {
                k.a.setAccessibilityFocused(false);
                k.a(64);
            }
            final boolean focused = this.j == i;
            if (focused) {
                k.a(2);
            }
            else if (k.a.isFocusable()) {
                k.a(1);
            }
            k.a.setFocused(focused);
            this.g.getLocationOnScreen(this.e);
            k.a.getBoundsInScreen(this.b);
            if (this.b.equals((Object)l)) {
                k.e(this.b);
                if (k.b != -1) {
                    b4.c m;
                    View g3;
                    Rect b;
                    Rect c;
                    for (m = b4.c.k(), i = k.b; i != -1; i = m.b) {
                        g3 = this.g;
                        m.b = -1;
                        m.a.setParent(g3, -1);
                        m.o(a.l);
                        this.m(i, m);
                        m.e(this.c);
                        b = this.b;
                        c = this.c;
                        b.offset(c.left, c.top);
                    }
                    m.l();
                }
                this.b.offset(this.e[0] - this.g.getScrollX(), this.e[1] - this.g.getScrollY());
            }
            if (this.g.getLocalVisibleRect(this.d)) {
                this.d.offset(this.e[0] - this.g.getScrollX(), this.e[1] - this.g.getScrollY());
                if (this.b.intersect(this.d)) {
                    k.a.setBoundsInScreen(this.b);
                    final Rect b2 = this.b;
                    i = n;
                    Label_0690: {
                        if (b2 != null) {
                            if (b2.isEmpty()) {
                                i = n;
                            }
                            else if (this.g.getWindowVisibility() != 0) {
                                i = n;
                            }
                            else {
                                ViewParent viewParent;
                                View view;
                                for (viewParent = this.g.getParent(); viewParent instanceof View; viewParent = view.getParent()) {
                                    view = (View)viewParent;
                                    i = n;
                                    if (view.getAlpha() <= 0.0f) {
                                        break Label_0690;
                                    }
                                    if (view.getVisibility() != 0) {
                                        i = n;
                                        break Label_0690;
                                    }
                                }
                                i = n;
                                if (viewParent != null) {
                                    i = 1;
                                }
                            }
                        }
                    }
                    if (i != 0) {
                        k.a.setVisibleToUser(true);
                    }
                }
            }
            return k;
        }
        throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
    }
    
    public final boolean d(final MotionEvent motionEvent) {
        final boolean enabled = this.f.isEnabled();
        boolean b2;
        final boolean b = b2 = false;
        if (enabled) {
            if (!this.f.isTouchExplorationEnabled()) {
                b2 = b;
            }
            else {
                final int action = motionEvent.getAction();
                if (action != 7 && action != 9) {
                    if (action != 10) {
                        return false;
                    }
                    if (this.k != Integer.MIN_VALUE) {
                        this.q(Integer.MIN_VALUE);
                        return true;
                    }
                    return false;
                }
                else {
                    final int e = this.e(motionEvent.getX(), motionEvent.getY());
                    this.q(e);
                    b2 = b;
                    if (e != Integer.MIN_VALUE) {
                        b2 = true;
                    }
                }
            }
        }
        return b2;
    }
    
    public abstract int e(final float p0, final float p1);
    
    public abstract void f(final ArrayList p0);
    
    public final void g() {
        if (this.f.isEnabled()) {
            final ViewParent parent = this.g.getParent();
            if (parent != null) {
                final AccessibilityEvent b = this.b(-1, 2048);
                b4.b.b(b, 1);
                parent.requestSendAccessibilityEvent(this.g, b);
            }
        }
    }
    
    public final d getAccessibilityNodeProvider(final View view) {
        if (this.h == null) {
            this.h = new c();
        }
        return this.h;
    }
    
    public final boolean h(int n, final Rect rect) {
        final ArrayList list = new ArrayList();
        this.f(list);
        final j j = new j();
        final int n2 = 0;
        for (int i = 0; i < list.size(); ++i) {
            j.g(i, (Object)this.c(i));
        }
        final int k = this.j;
        b4.c c;
        if (k == Integer.MIN_VALUE) {
            c = null;
        }
        else {
            c = (b4.c)j.f(k, (Integer)null);
        }
        final int n3 = -1;
        b4.c c3;
        if (n != 1 && n != 2) {
            if (n != 17 && n != 33 && n != 66 && n != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            final Rect rect2 = new Rect();
            final int l = this.j;
            if (l != Integer.MIN_VALUE) {
                this.i(l).e(rect2);
            }
            else if (rect != null) {
                rect2.set(rect);
            }
            else {
                final View g = this.g;
                final int width = g.getWidth();
                final int height = g.getHeight();
                if (n != 17) {
                    if (n != 33) {
                        if (n != 66) {
                            if (n != 130) {
                                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            }
                            rect2.set(0, -1, width, -1);
                        }
                        else {
                            rect2.set(-1, 0, -1, height);
                        }
                    }
                    else {
                        rect2.set(0, height, width, height);
                    }
                }
                else {
                    rect2.set(width, 0, width, height);
                }
            }
            final a$b n4 = a.n;
            final b$a<b4.c> m = (b$a<b4.c>)a.m;
            final Rect rect3 = new Rect(rect2);
            if (n != 17) {
                if (n != 33) {
                    if (n != 66) {
                        if (n != 130) {
                            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        }
                        rect3.offset(0, -(rect2.height() + 1));
                    }
                    else {
                        rect3.offset(-(rect2.width() + 1), 0);
                    }
                }
                else {
                    rect3.offset(0, rect2.height() + 1);
                }
            }
            else {
                rect3.offset(rect2.width() + 1, 0);
            }
            n4.getClass();
            final int h = j.h();
            final Rect rect4 = new Rect();
            int n5 = 0;
            b4.c c2 = null;
            while (true) {
                c3 = c2;
                if (n5 >= h) {
                    break;
                }
                final b4.c c4 = (b4.c)j.i(n5);
                if (c4 != c) {
                    m.getClass();
                    c4.e(rect4);
                    boolean b = false;
                    Label_0610: {
                        Label_0607: {
                            if (i4.b.c(n, rect2, rect4)) {
                                if (i4.b.c(n, rect2, rect3)) {
                                    if (!i4.b.a(n, rect2, rect4, rect3)) {
                                        if (i4.b.a(n, rect2, rect3, rect4)) {
                                            break Label_0607;
                                        }
                                        final int d = i4.b.d(n, rect2, rect4);
                                        final int e = i4.b.e(n, rect2, rect4);
                                        final int d2 = i4.b.d(n, rect2, rect3);
                                        final int e2 = i4.b.e(n, rect2, rect3);
                                        if (e * e + d * 13 * d >= e2 * e2 + d2 * 13 * d2) {
                                            break Label_0607;
                                        }
                                    }
                                }
                                b = true;
                                break Label_0610;
                            }
                        }
                        b = false;
                    }
                    if (b) {
                        rect3.set(rect4);
                        c2 = c4;
                    }
                }
                ++n5;
            }
        }
        else {
            final View g2 = this.g;
            final WeakHashMap a = l0.a;
            final boolean b2 = l0$e.d(g2) == 1;
            final a$b n6 = i4.a.n;
            final b$a<b4.c> m2 = (b$a<b4.c>)i4.a.m;
            n6.getClass();
            final int h2 = j.h();
            final ArrayList list2 = new ArrayList(h2);
            for (int n7 = 0; n7 < h2; ++n7) {
                list2.add((Object)j.i(n7));
            }
            Collections.sort((List<Object>)list2, (Comparator<? super Object>)new b$b(b2, m2));
            Object o = null;
            Label_0843: {
                if (n != 1) {
                    if (n != 2) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                    }
                    final int size = list2.size();
                    if (c == null) {
                        n = -1;
                    }
                    else {
                        n = list2.lastIndexOf(c);
                    }
                    if (++n < size) {
                        o = list2.get(n);
                        break Label_0843;
                    }
                }
                else {
                    n = list2.size();
                    if (c != null) {
                        n = list2.indexOf(c);
                    }
                    if (--n >= 0) {
                        o = list2.get(n);
                        break Label_0843;
                    }
                }
                o = null;
            }
            c3 = (b4.c)o;
        }
        if (c3 == null) {
            n = Integer.MIN_VALUE;
        }
        else {
            n = n2;
            if (j.f) {
                j.e();
                n = n2;
            }
            int n8;
            while (true) {
                n8 = n3;
                if (n >= j.i) {
                    break;
                }
                if (j.h[n] == c3) {
                    n8 = n;
                    break;
                }
                ++n;
            }
            if (j.f) {
                j.e();
            }
            n = j.g[n8];
        }
        return this.o(n);
    }
    
    public final b4.c i(int i) {
        if (i != -1) {
            return this.c(i);
        }
        final AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.g);
        final b4.c c = new b4.c(obtain);
        final View g = this.g;
        final WeakHashMap a = l0.a;
        g.onInitializeAccessibilityNodeInfo(obtain);
        final ArrayList list = new ArrayList();
        this.f(list);
        if (obtain.getChildCount() > 0 && list.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        for (i = 0; i < list.size(); ++i) {
            c.a.addChild(this.g, (int)list.get(i));
        }
        return c;
    }
    
    public abstract boolean j(final int p0, final int p1);
    
    public void k(final AccessibilityEvent accessibilityEvent, final int n) {
    }
    
    public void l(final b4.c c) {
    }
    
    public abstract void m(final int p0, final b4.c p1);
    
    public void n(final int n, final boolean b) {
    }
    
    public final boolean o(final int j) {
        if (!this.g.isFocused() && !this.g.requestFocus()) {
            return false;
        }
        final int i = this.j;
        if (i == j) {
            return false;
        }
        if (i != Integer.MIN_VALUE) {
            this.a(i);
        }
        this.n(this.j = j, true);
        this.p(j, 8);
        return true;
    }
    
    public final void onInitializeAccessibilityEvent(final View view, final AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }
    
    public final void onInitializeAccessibilityNodeInfo(final View view, final b4.c c) {
        super.onInitializeAccessibilityNodeInfo(view, c);
        this.l(c);
    }
    
    public final void p(final int n, final int n2) {
        if (n != Integer.MIN_VALUE) {
            if (this.f.isEnabled()) {
                final ViewParent parent = this.g.getParent();
                if (parent == null) {
                    return;
                }
                parent.requestSendAccessibilityEvent(this.g, this.b(n, n2));
            }
        }
    }
    
    public final void q(final int k) {
        final int i = this.k;
        if (i == k) {
            return;
        }
        this.p(this.k = k, 128);
        this.p(i, 256);
    }
    
    public final class c extends d
    {
        public final a b;
        
        public c(final a b) {
            this.b = b;
        }
        
        public final b4.c a(final int n) {
            return new b4.c(AccessibilityNodeInfo.obtain(this.b.i(n).a));
        }
        
        public final b4.c b(int n) {
            if (n == 2) {
                n = this.b.i;
            }
            else {
                n = this.b.j;
            }
            if (n == Integer.MIN_VALUE) {
                return null;
            }
            return this.a(n);
        }
        
        public final boolean c(final int i, int j, final Bundle bundle) {
            final a b = this.b;
            boolean b2;
            if (i != -1) {
                b2 = true;
                if (j != 1) {
                    if (j != 2) {
                        if (j != 64) {
                            if (j != 128) {
                                b2 = b.j(i, j);
                                return b2;
                            }
                            if (b.i == i) {
                                b.i = Integer.MIN_VALUE;
                                b.g.invalidate();
                                b.p(i, 65536);
                                return b2;
                            }
                        }
                        else if (b.f.isEnabled()) {
                            if (b.f.isTouchExplorationEnabled()) {
                                j = b.i;
                                if (j != i) {
                                    if (j != Integer.MIN_VALUE) {
                                        b.i = Integer.MIN_VALUE;
                                        b.g.invalidate();
                                        b.p(j, 65536);
                                    }
                                    b.i = i;
                                    b.g.invalidate();
                                    b.p(i, 32768);
                                    return b2;
                                }
                            }
                        }
                        b2 = false;
                    }
                    else {
                        b2 = b.a(i);
                    }
                }
                else {
                    b2 = b.o(i);
                }
            }
            else {
                final View g = b.g;
                final WeakHashMap a = l0.a;
                b2 = l0$d.j(g, j, bundle);
            }
            return b2;
        }
    }
}
