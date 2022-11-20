// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.viewinterop;

import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import mg2.p;
import kotlinx.coroutines.CoroutineStart;
import kotlin.coroutines.CoroutineContext;
import i1.f$a;
import dg.l0;
import android.view.ViewParent;
import android.graphics.Rect;
import android.view.ViewGroup$LayoutParams;
import android.graphics.Region$Op;
import android.graphics.Region;
import android.view.View$MeasureSpec;
import java.util.LinkedHashMap;
import c2.v;
import kotlin.jvm.internal.Ref$ObjectRef;
import androidx.compose.ui.draw.DrawModifierKt;
import u2.c;
import androidx.compose.ui.platform.x1;
import ng2.e;
import z0.g;
import android.content.Context;
import androidx.compose.ui.node.LayoutNode;
import a4.a0;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.lifecycle.q;
import u2.b;
import mg2.l;
import j1.d;
import cg2.j;
import mg2.a;
import android.view.View;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import a4.z;
import android.view.ViewGroup;

public abstract class AndroidViewHolder extends ViewGroup implements z
{
    public final NestedScrollDispatcher f;
    public View g;
    public a<j> h;
    public boolean i;
    public d j;
    public l<? super d, j> k;
    public b l;
    public l<? super b, j> m;
    public q n;
    public l5.d o;
    public final SnapshotStateObserver p;
    public final l<AndroidViewHolder, j> q;
    public final a<j> r;
    public l<? super Boolean, j> s;
    public final int[] t;
    public int u;
    public int v;
    public final a0 w;
    public final LayoutNode x;
    
    public AndroidViewHolder(final Context context, final g g, final NestedScrollDispatcher f) {
        e.f((Object)context, "context");
        e.f((Object)f, "dispatcher");
        super(context);
        this.f = f;
        if (g != null) {
            final LinkedHashMap a = x1.a;
            ((View)this).setTag(2131427619, (Object)g);
        }
        ((View)this).setSaveFromParentEnabled(false);
        this.h = (a<j>)AndroidViewHolder$update$1.INSTANCE;
        this.j = (d)d.a.f;
        this.l = (b)new c(1.0f, 1.0f);
        this.p = new SnapshotStateObserver((l)new AndroidViewHolder$snapshotObserver$1(this));
        this.q = (l<AndroidViewHolder, j>)new AndroidViewHolder$onCommitAffectingUpdate$1(this);
        this.r = (a<j>)new AndroidViewHolder$runUpdate$1(this);
        this.t = new int[2];
        this.u = Integer.MIN_VALUE;
        this.v = Integer.MIN_VALUE;
        this.w = new a0();
        final LayoutNode x = new LayoutNode(3, false);
        final d k2 = vl.a.K2(DrawModifierKt.a(androidx.compose.ui.input.pointer.a.a(this), (l)new AndroidViewHolder$layoutNode$1$coreModifier$1(x, this)), (l)new AndroidViewHolder$layoutNode$1$coreModifier$2(this, x));
        x.d(this.j.l0(k2));
        this.k = (l<? super d, j>)new AndroidViewHolder$layoutNode$1$1(x, k2);
        x.k(this.l);
        this.m = (l<? super b, j>)new AndroidViewHolder$layoutNode$1$2(x);
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        x.N = (l)new AndroidViewHolder$layoutNode$1$3(this, x, ref$ObjectRef);
        x.O = (l)new AndroidViewHolder$layoutNode$1$4(this, ref$ObjectRef);
        x.l((v)new AndroidViewHolder$layoutNode$1.AndroidViewHolder$layoutNode$1$5(this, x));
        this.x = x;
    }
    
    public static final int a(final AndroidViewHolder androidViewHolder, int n, final int n2, final int n3) {
        androidViewHolder.getClass();
        if (n3 < 0 && n != n2) {
            if (n3 == -2 && n2 != Integer.MAX_VALUE) {
                n = View$MeasureSpec.makeMeasureSpec(n2, Integer.MIN_VALUE);
            }
            else if (n3 == -1 && n2 != Integer.MAX_VALUE) {
                n = View$MeasureSpec.makeMeasureSpec(n2, 1073741824);
            }
            else {
                n = View$MeasureSpec.makeMeasureSpec(0, 0);
            }
        }
        else {
            n = View$MeasureSpec.makeMeasureSpec(zd.b.x(n3, n, n2), 1073741824);
        }
        return n;
    }
    
    public final boolean gatherTransparentRegion(final Region region) {
        if (region == null) {
            return true;
        }
        ((View)this).getLocationInWindow(this.t);
        final int[] t = this.t;
        final int n = t[0];
        region.op(n, t[1], ((View)this).getWidth() + n, ((View)this).getHeight() + this.t[1], Region$Op.DIFFERENCE);
        return true;
    }
    
    public final b getDensity() {
        return this.l;
    }
    
    public final LayoutNode getLayoutNode() {
        return this.x;
    }
    
    public ViewGroup$LayoutParams getLayoutParams() {
        final View g = this.g;
        ViewGroup$LayoutParams layoutParams;
        if (g == null || (layoutParams = g.getLayoutParams()) == null) {
            layoutParams = new ViewGroup$LayoutParams(-1, -1);
        }
        return layoutParams;
    }
    
    public final q getLifecycleOwner() {
        return this.n;
    }
    
    public final d getModifier() {
        return this.j;
    }
    
    public int getNestedScrollAxes() {
        final a0 w = this.w;
        return w.b | w.a;
    }
    
    public final l<b, j> getOnDensityChanged$ui_release() {
        return (l<b, j>)this.m;
    }
    
    public final l<d, j> getOnModifierChanged$ui_release() {
        return (l<d, j>)this.k;
    }
    
    public final l<Boolean, j> getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return (l<Boolean, j>)this.s;
    }
    
    public final l5.d getSavedStateRegistryOwner() {
        return this.o;
    }
    
    public final a<j> getUpdate() {
        return this.h;
    }
    
    public final View getView() {
        return this.g;
    }
    
    public final void h(final int n, final View view) {
        e.f((Object)view, "target");
        final a0 w = this.w;
        if (n == 1) {
            w.b = 0;
        }
        else {
            w.a = 0;
        }
    }
    
    public final void i(final View view, final View view2, final int n, final int n2) {
        e.f((Object)view, "child");
        e.f((Object)view2, "target");
        this.w.a(n, n2);
    }
    
    public final ViewParent invalidateChildInParent(final int[] array, final Rect rect) {
        super.invalidateChildInParent(array, rect);
        this.x.C();
        return null;
    }
    
    public final boolean isNestedScrollingEnabled() {
        final View g = this.g;
        boolean b;
        if (g != null) {
            b = g.isNestedScrollingEnabled();
        }
        else {
            b = super.isNestedScrollingEnabled();
        }
        return b;
    }
    
    public final void j(final View view, int n, final int n2, final int n3, final int n4, final int n5) {
        e.f((Object)view, "target");
        if (!this.isNestedScrollingEnabled()) {
            return;
        }
        final NestedScrollDispatcher f = this.f;
        final float n6 = (float)n;
        final float n7 = -1;
        final long t = vl.a.T(n6 * n7, n2 * n7);
        final long t2 = vl.a.T(n3 * n7, n4 * n7);
        if (n5 == 0) {
            n = 1;
        }
        else {
            n = 2;
        }
        f.b(n, t, t2);
    }
    
    public final void l(final View view, int n, final int n2, final int[] array, final int n3) {
        e.f((Object)view, "target");
        if (!this.isNestedScrollingEnabled()) {
            return;
        }
        final NestedScrollDispatcher f = this.f;
        final float n4 = (float)n;
        final float n5 = -1;
        final long t = vl.a.T(n4 * n5, n2 * n5);
        if (n3 == 0) {
            n = 1;
        }
        else {
            n = 2;
        }
        final long d = f.d(n, t);
        array[0] = l0.X(n1.c.e(d));
        array[1] = l0.X(n1.c.f(d));
    }
    
    public final void n(final View view, int n, final int n2, final int n3, final int n4, final int n5, final int[] array) {
        e.f((Object)view, "target");
        if (!this.isNestedScrollingEnabled()) {
            return;
        }
        final NestedScrollDispatcher f = this.f;
        final float n6 = (float)n;
        final float n7 = -1;
        final long t = vl.a.T(n6 * n7, n2 * n7);
        final long t2 = vl.a.T(n3 * n7, n4 * n7);
        if (n5 == 0) {
            n = 1;
        }
        else {
            n = 2;
        }
        final long b = f.b(n, t, t2);
        array[0] = l0.X(n1.c.e(b));
        array[1] = l0.X(n1.c.f(b));
    }
    
    public final boolean o(final View view, final View view2, final int n, final int n2) {
        e.f((Object)view, "child");
        e.f((Object)view2, "target");
        boolean b = true;
        if ((n & 0x2) == 0x0) {
            b = ((n & 0x1) != 0x0 && b);
        }
        return b;
    }
    
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        final SnapshotStateObserver p = this.p;
        p.e = f$a.c(p.b);
    }
    
    public final void onDescendantInvalidated(final View view, final View view2) {
        e.f((Object)view, "child");
        e.f((Object)view2, "target");
        super.onDescendantInvalidated(view, view2);
        this.x.C();
    }
    
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        final i1.e e = this.p.e;
        if (e != null) {
            e.dispose();
        }
        this.p.a();
    }
    
    public final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        final View g = this.g;
        if (g != null) {
            g.layout(0, 0, n3 - n, n4 - n2);
        }
    }
    
    public final void onMeasure(final int u, final int v) {
        final View g = this.g;
        if (g != null) {
            g.measure(u, v);
        }
        final View g2 = this.g;
        int measuredHeight = 0;
        int measuredWidth;
        if (g2 != null) {
            measuredWidth = g2.getMeasuredWidth();
        }
        else {
            measuredWidth = 0;
        }
        final View g3 = this.g;
        if (g3 != null) {
            measuredHeight = g3.getMeasuredHeight();
        }
        ((View)this).setMeasuredDimension(measuredWidth, measuredHeight);
        this.u = u;
        this.v = v;
    }
    
    public final boolean onNestedFling(final View view, final float n, final float n2, final boolean b) {
        e.f((Object)view, "target");
        if (!this.isNestedScrollingEnabled()) {
            return false;
        }
        zi2.g.g(this.f.e(), null, null, (p)new AndroidViewHolder$onNestedFling$1(b, this, cg.d.R(n * -1.0f, n2 * -1.0f), (gg2.c)null), 3);
        return false;
    }
    
    public final boolean onNestedPreFling(final View view, final float n, final float n2) {
        e.f((Object)view, "target");
        if (!this.isNestedScrollingEnabled()) {
            return false;
        }
        zi2.g.g(this.f.e(), null, null, (p)new AndroidViewHolder$onNestedPreFling$1(this, cg.d.R(n * -1.0f, n2 * -1.0f), (gg2.c)null), 3);
        return false;
    }
    
    public final void onWindowVisibilityChanged(final int n) {
        super.onWindowVisibilityChanged(n);
    }
    
    public final void requestDisallowInterceptTouchEvent(final boolean b) {
        final l<? super Boolean, j> s = this.s;
        if (s != null) {
            s.invoke((Object)b);
        }
        super.requestDisallowInterceptTouchEvent(b);
    }
    
    public final void setDensity(final b l) {
        e.f((Object)l, "value");
        if (l != this.l) {
            this.l = l;
            final l<? super b, j> m = this.m;
            if (m != null) {
                m.invoke((Object)l);
            }
        }
    }
    
    public final void setLifecycleOwner(final q n) {
        if (n != this.n) {
            ((View)this).setTag(2131432184, (Object)(this.n = n));
        }
    }
    
    public final void setModifier(final d j) {
        e.f((Object)j, "value");
        if (j != this.j) {
            this.j = j;
            final l<? super d, j> k = this.k;
            if (k != null) {
                k.invoke((Object)j);
            }
        }
    }
    
    public final void setOnDensityChanged$ui_release(final l<? super b, j> m) {
        this.m = m;
    }
    
    public final void setOnModifierChanged$ui_release(final l<? super d, j> k) {
        this.k = k;
    }
    
    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(final l<? super Boolean, j> s) {
        this.s = s;
    }
    
    public final void setSavedStateRegistryOwner(final l5.d o) {
        if (o != this.o) {
            ViewTreeSavedStateRegistryOwner.b((View)this, this.o = o);
        }
    }
    
    public final void setUpdate(final a<j> h) {
        e.f((Object)h, "value");
        this.h = h;
        this.i = true;
        this.r.invoke();
    }
    
    public final void setView$ui_release(final View g) {
        if (g != this.g) {
            this.g = g;
            this.removeAllViewsInLayout();
            if (g != null) {
                this.addView(g);
                this.r.invoke();
            }
        }
    }
    
    public final boolean shouldDelayChildPressedState() {
        return true;
    }
}
