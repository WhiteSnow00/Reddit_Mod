// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import e2.b0;
import android.os.Handler;
import android.view.ViewParent;
import android.view.View$OnAttachStateChangeListener;
import mg2.p;
import kotlinx.coroutines.CoroutineStart;
import kotlin.coroutines.CoroutineContext;
import zi2.c0;
import gg2.c;
import zi2.s0;
import android.view.View$MeasureSpec;
import kotlin.jvm.internal.Lambda;
import z0.d;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import androidx.compose.runtime.Recomposer$State;
import androidx.compose.runtime.Recomposer;
import ng2.e;
import android.util.AttributeSet;
import android.content.Context;
import cg2.j;
import mg2.a;
import z0.f;
import android.os.IBinder;
import z0.g;
import java.lang.ref.WeakReference;
import android.view.ViewGroup;

public abstract class AbstractComposeView extends ViewGroup
{
    public WeakReference<g> f;
    public IBinder g;
    public f h;
    public g i;
    public a<j> j;
    public boolean k;
    public boolean l;
    
    public AbstractComposeView(final Context context, final AttributeSet set) {
        e.f((Object)context, "context");
        this(context, set, 4, 0);
    }
    
    public AbstractComposeView(final Context context, final AttributeSet set, int a) {
        e.f((Object)context, "context");
        super(context, set, a);
        this.setClipChildren(false);
        this.setClipToPadding(false);
        a = ViewCompositionStrategy.a;
        this.j = ViewCompositionStrategy.DisposeOnDetachedFromWindowOrReleasedFromPool.b.a(this);
    }
    
    public AbstractComposeView(final Context context, AttributeSet set, final int n, final int n2) {
        if ((n & 0x2) != 0x0) {
            set = null;
        }
        this(context, set, 0);
    }
    
    private static void getDisposeViewCompositionStrategy$annotations() {
    }
    
    public static void getShowLayoutBounds$annotations() {
    }
    
    public static boolean h(final g g) {
        return !(g instanceof Recomposer) || ((Enum<Recomposer$State>)((Recomposer)g).q.getValue()).compareTo(Recomposer$State.ShuttingDown) > 0;
    }
    
    private final void setParentContext(final g i) {
        if (this.i != i) {
            if ((this.i = i) != null) {
                this.f = null;
            }
            final f h = this.h;
            if (h != null) {
                h.dispose();
                this.h = null;
                if (((View)this).isAttachedToWindow()) {
                    this.e();
                }
            }
        }
    }
    
    private final void setPreviousAttachedWindowToken(final IBinder g) {
        if (this.g != g) {
            this.g = g;
            this.f = null;
        }
    }
    
    public final void addView(final View view) {
        this.c();
        super.addView(view);
    }
    
    public final void addView(final View view, final int n) {
        this.c();
        super.addView(view, n);
    }
    
    public final void addView(final View view, final int n, final int n2) {
        this.c();
        super.addView(view, n, n2);
    }
    
    public final void addView(final View view, final int n, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.c();
        super.addView(view, n, viewGroup$LayoutParams);
    }
    
    public final void addView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.c();
        super.addView(view, viewGroup$LayoutParams);
    }
    
    public final boolean addViewInLayout(final View view, final int n, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.c();
        return super.addViewInLayout(view, n, viewGroup$LayoutParams);
    }
    
    public final boolean addViewInLayout(final View view, final int n, final ViewGroup$LayoutParams viewGroup$LayoutParams, final boolean b) {
        this.c();
        return super.addViewInLayout(view, n, viewGroup$LayoutParams, b);
    }
    
    public abstract void b(final d p0, final int p1);
    
    public final void c() {
        if (this.l) {
            return;
        }
        final StringBuilder t = a.t("Cannot add views to ");
        t.append(this.getClass().getSimpleName());
        t.append("; only Compose content is supported");
        throw new UnsupportedOperationException(t.toString());
    }
    
    public final void d() {
        final f h = this.h;
        if (h != null) {
            h.dispose();
        }
        this.h = null;
        ((View)this).requestLayout();
    }
    
    public final void e() {
        if (this.h == null) {
            try {
                this.l = true;
                this.h = a2.a(this, this.i(), xd.a.D((Lambda)new AbstractComposeView$ensureCompositionCreated$1(this), -656146368, true));
            }
            finally {
                this.l = false;
            }
        }
    }
    
    public void f(final int n, final int n2, final int n3, final int n4, final boolean b) {
        final View child = this.getChildAt(0);
        if (child != null) {
            child.layout(((View)this).getPaddingLeft(), ((View)this).getPaddingTop(), n3 - n - ((View)this).getPaddingRight(), n4 - n2 - ((View)this).getPaddingBottom());
        }
    }
    
    public void g(int measuredWidth, int paddingTop) {
        final View child = this.getChildAt(0);
        if (child == null) {
            super.onMeasure(measuredWidth, paddingTop);
            return;
        }
        child.measure(View$MeasureSpec.makeMeasureSpec(Math.max(0, View$MeasureSpec.getSize(measuredWidth) - ((View)this).getPaddingLeft() - ((View)this).getPaddingRight()), View$MeasureSpec.getMode(measuredWidth)), View$MeasureSpec.makeMeasureSpec(Math.max(0, View$MeasureSpec.getSize(paddingTop) - ((View)this).getPaddingTop() - ((View)this).getPaddingBottom()), View$MeasureSpec.getMode(paddingTop)));
        measuredWidth = child.getMeasuredWidth();
        final int paddingLeft = ((View)this).getPaddingLeft();
        final int paddingRight = ((View)this).getPaddingRight();
        final int measuredHeight = child.getMeasuredHeight();
        paddingTop = ((View)this).getPaddingTop();
        ((View)this).setMeasuredDimension(paddingRight + (paddingLeft + measuredWidth), ((View)this).getPaddingBottom() + (paddingTop + measuredHeight));
    }
    
    public final boolean getHasComposition() {
        return this.h != null;
    }
    
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }
    
    public final boolean getShowLayoutBounds() {
        return this.k;
    }
    
    public final g i() {
        Object i;
        if ((i = this.i) == null) {
            g b = x1.b((View)this);
            if (b == null) {
                ViewParent viewParent = ((View)this).getParent();
                g b2 = b;
                while (true) {
                    b = b2;
                    if (b2 != null) {
                        break;
                    }
                    b = b2;
                    if (!(viewParent instanceof View)) {
                        break;
                    }
                    b2 = x1.b((View)viewParent);
                    viewParent = viewParent.getParent();
                }
            }
            final g g = null;
            g g3;
            if (b != null) {
                g g2;
                if (h(b)) {
                    g2 = b;
                }
                else {
                    g2 = null;
                }
                g3 = b;
                if (g2 != null) {
                    this.f = new WeakReference<g>(g2);
                    g3 = b;
                }
            }
            else {
                g3 = null;
            }
            if ((i = g3) == null) {
                final WeakReference<g> f = this.f;
                g g4 = null;
                Label_0157: {
                    if (f != null) {
                        g4 = f.get();
                        if (g4 != null && h(g4)) {
                            break Label_0157;
                        }
                    }
                    g4 = null;
                }
                i = g4;
                if (g4 == null) {
                    if (!((View)this).isAttachedToWindow()) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Cannot locate windowRecomposer; View ");
                        sb.append(this);
                        sb.append(" is not attached to a window");
                        throw new IllegalStateException(sb.toString().toString());
                    }
                    ViewParent parent = ((View)this).getParent();
                    Object o = this;
                    while (parent instanceof View) {
                        final View view = (View)parent;
                        if (view.getId() == 16908290) {
                            break;
                        }
                        final ViewParent parent2 = view.getParent();
                        o = view;
                        parent = parent2;
                    }
                    final g b3 = x1.b((View)o);
                    Recomposer a;
                    if (b3 == null) {
                        a = u1.a.get().a((View)o);
                        ((View)o).setTag(2131427619, (Object)a);
                        final s0 f2 = s0.f;
                        final Handler handler = ((View)o).getHandler();
                        e.e((Object)handler, "rootView.handler");
                        final int a2 = aj2.g.a;
                        ((View)o).addOnAttachStateChangeListener((View$OnAttachStateChangeListener)new t1(zi2.g.g((c0)f2, (CoroutineContext)new kotlinx.coroutines.android.a(handler, "windowRecomposer cleanup", false).k, null, (p)new WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1(a, (View)o, (c)null), 2)));
                    }
                    else {
                        if (!(b3 instanceof Recomposer)) {
                            throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer".toString());
                        }
                        a = (Recomposer)b3;
                    }
                    g g5 = g;
                    if (h((g)a)) {
                        g5 = (g)a;
                    }
                    i = a;
                    if (g5 != null) {
                        this.f = new WeakReference<g>(g5);
                        i = a;
                    }
                }
            }
        }
        return (g)i;
    }
    
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.setPreviousAttachedWindowToken(((View)this).getWindowToken());
        if (this.getShouldCreateCompositionOnAttachedToWindow()) {
            this.e();
        }
    }
    
    public final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        this.f(n, n2, n3, n4, b);
    }
    
    public final void onMeasure(final int n, final int n2) {
        this.e();
        this.g(n, n2);
    }
    
    public final void onRtlPropertiesChanged(final int layoutDirection) {
        final View child = this.getChildAt(0);
        if (child != null) {
            child.setLayoutDirection(layoutDirection);
        }
    }
    
    public final void setParentCompositionContext(final g parentContext) {
        this.setParentContext(parentContext);
    }
    
    public final void setShowLayoutBounds(final boolean b) {
        this.k = b;
        final View child = this.getChildAt(0);
        if (child != null) {
            ((b0)child).setShowLayoutBounds(b);
        }
    }
    
    public final void setViewCompositionStrategy(final ViewCompositionStrategy viewCompositionStrategy) {
        e.f((Object)viewCompositionStrategy, "strategy");
        final a<j> j = this.j;
        if (j != null) {
            j.invoke();
        }
        this.j = viewCompositionStrategy.a(this);
    }
    
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
