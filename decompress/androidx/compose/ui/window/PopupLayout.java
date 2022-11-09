// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.window;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import android.view.ViewGroup;
import android.view.MotionEvent;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import z0.g;
import u2.i;
import android.view.View$MeasureSpec;
import android.view.KeyEvent$DispatcherState;
import android.view.KeyEvent;
import z0.r0;
import androidx.compose.runtime.ComposerImpl;
import android.view.ViewGroup$LayoutParams;
import z0.r;
import kotlin.NoWhenBranchMatchedException;
import c2.l;
import zg2.p;
import android.view.ViewParent;
import android.content.Context;
import android.view.ViewOutlineProvider;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import androidx.lifecycle.q0;
import android.util.AttributeSet;
import ah2.f;
import w2.c;
import android.os.Build$VERSION;
import java.util.UUID;
import androidx.compose.runtime.DerivedSnapshotState;
import u2.h;
import androidx.compose.ui.unit.LayoutDirection;
import w2.d;
import android.view.WindowManager$LayoutParams;
import android.view.WindowManager;
import w2.b;
import android.view.View;
import w2.e;
import pg2.j;
import zg2.a;
import z0.l0;
import android.graphics.Rect;
import androidx.compose.ui.platform.AbstractComposeView;

public final class PopupLayout extends AbstractComposeView
{
    public final Rect A;
    public final l0 B;
    public boolean C;
    public final int[] D;
    public zg2.a<j> m;
    public e n;
    public String o;
    public final View p;
    public final b q;
    public final WindowManager r;
    public final WindowManager$LayoutParams s;
    public d t;
    public LayoutDirection u;
    public final l0 v;
    public final l0 w;
    public h x;
    public final DerivedSnapshotState y;
    public final float z;
    
    public PopupLayout() {
        throw null;
    }
    
    public PopupLayout(final zg2.a m, final e n, final String o, final View p7, final u2.b b, final d t, final UUID uuid) {
        p2.e q;
        if (Build$VERSION.SDK_INT >= 29) {
            q = new c();
        }
        else {
            q = new p2.e();
        }
        f.f((Object)n, "properties");
        f.f((Object)o, "testTag");
        f.f((Object)p7, "composeView");
        f.f((Object)b, "density");
        f.f((Object)t, "initialPositionProvider");
        final Context context = p7.getContext();
        f.e((Object)context, "composeView.context");
        super(context, (AttributeSet)null, 6, 0);
        this.m = (zg2.a<j>)m;
        this.n = n;
        this.o = o;
        this.p = p7;
        this.q = (b)q;
        final Object systemService = p7.getContext().getSystemService("window");
        if (systemService != null) {
            this.r = (WindowManager)systemService;
            final WindowManager$LayoutParams s = new WindowManager$LayoutParams();
            s.gravity = 8388659;
            s.flags = ((s.flags & 0xFF7D7FE7) | 0x40000);
            s.type = 1002;
            s.token = p7.getApplicationWindowToken();
            s.width = -2;
            s.height = -2;
            s.format = -3;
            s.setTitle((CharSequence)p7.getContext().getResources().getString(2131953054));
            this.s = s;
            this.t = t;
            this.u = LayoutDirection.Ltr;
            this.v = a80.a.n0(null);
            this.w = a80.a.n0(null);
            this.y = a80.a.D((zg2.a)new PopupLayout$canCalculatePosition$2(this));
            this.z = 30;
            this.A = new Rect();
            ((View)this).setId(16908290);
            ((View)this).setTag(2131432177, (Object)at1.a.t0(p7));
            q0 q2 = (q0)p7.getTag(2131432180);
            q0 q3;
            if (q2 != null) {
                q3 = q2;
            }
            else {
                ViewParent viewParent = p7.getParent();
                while (true) {
                    q3 = q2;
                    if (q2 != null) {
                        break;
                    }
                    q3 = q2;
                    if (!(viewParent instanceof View)) {
                        break;
                    }
                    final View view = (View)viewParent;
                    q2 = (q0)view.getTag(2131432180);
                    viewParent = view.getParent();
                }
            }
            ((View)this).setTag(2131432180, (Object)q3);
            ViewTreeSavedStateRegistryOwner.b((View)this, ViewTreeSavedStateRegistryOwner.a(this.p));
            final StringBuilder sb = new StringBuilder();
            sb.append("Popup:");
            sb.append(uuid);
            ((View)this).setTag(2131428424, (Object)sb.toString());
            ((ViewGroup)this).setClipChildren(false);
            ((View)this).setElevation(b.M0(this.z));
            ((View)this).setOutlineProvider((ViewOutlineProvider)new w2.a());
            this.B = a80.a.n0(ComposableSingletons$AndroidPopup_androidKt.a);
            this.D = new int[2];
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
    }
    
    private final p<z0.d, Integer, j> getContent() {
        return (p<z0.d, Integer, j>)((SnapshotMutableStateImpl<p>)this.B).getValue();
    }
    
    private final int getDisplayHeight() {
        return at1.a.D1(((View)this).getContext().getResources().getConfiguration().screenHeightDp * ((View)this).getContext().getResources().getDisplayMetrics().density);
    }
    
    private final int getDisplayWidth() {
        return at1.a.D1(((View)this).getContext().getResources().getConfiguration().screenWidthDp * ((View)this).getContext().getResources().getDisplayMetrics().density);
    }
    
    private final l getParentLayoutCoordinates() {
        return ((SnapshotMutableStateImpl<l>)this.w).getValue();
    }
    
    private final void setClippingEnabled(final boolean b) {
        int flags;
        if (b) {
            flags = (this.s.flags & 0xFFFFFDFF);
        }
        else {
            flags = (this.s.flags | 0x200);
        }
        final WindowManager$LayoutParams s = this.s;
        s.flags = flags;
        this.q.a(this.r, (View)this, s);
    }
    
    private final void setContent(final p<? super z0.d, ? super Integer, j> value) {
        ((SnapshotMutableStateImpl<p<? super z0.d, ? super Integer, j>>)this.B).setValue(value);
    }
    
    private final void setIsFocusable(final boolean b) {
        int flags;
        if (!b) {
            flags = (this.s.flags | 0x8);
        }
        else {
            flags = (this.s.flags & 0xFFFFFFF7);
        }
        final WindowManager$LayoutParams s = this.s;
        s.flags = flags;
        this.q.a(this.r, (View)this, s);
    }
    
    private final void setParentLayoutCoordinates(final l value) {
        ((SnapshotMutableStateImpl<l>)this.w).setValue(value);
    }
    
    private final void setSecurePolicy(final SecureFlagPolicy secureFlagPolicy) {
        final View p = this.p;
        final r a = AndroidPopup_androidKt.a;
        f.f((Object)p, "<this>");
        final ViewGroup$LayoutParams layoutParams = p.getRootView().getLayoutParams();
        WindowManager$LayoutParams windowManager$LayoutParams;
        if (layoutParams instanceof WindowManager$LayoutParams) {
            windowManager$LayoutParams = (WindowManager$LayoutParams)layoutParams;
        }
        else {
            windowManager$LayoutParams = null;
        }
        int n = 1;
        int n2;
        if (windowManager$LayoutParams != null && (windowManager$LayoutParams.flags & 0x2000) != 0x0) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        f.f((Object)secureFlagPolicy, "<this>");
        final int n3 = w2.f.a[secureFlagPolicy.ordinal()];
        if (n3 != 1) {
            if (n3 != 2) {
                if (n3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                n = n2;
            }
        }
        else {
            n = 0;
        }
        int flags;
        if (n != 0) {
            flags = (this.s.flags | 0x2000);
        }
        else {
            flags = (this.s.flags & 0xFFFFDFFF);
        }
        final WindowManager$LayoutParams s = this.s;
        s.flags = flags;
        this.q.a(this.r, (View)this, s);
    }
    
    public final void b(final z0.d d, final int n) {
        final ComposerImpl r = d.r(-857613600);
        this.getContent().invoke((Object)r, (Object)0);
        final r0 u = r.U();
        if (u != null) {
            u.d = (p<? super z0.d, ? super Integer, j>)new PopupLayout$Content.PopupLayout$Content$4(this, n);
        }
    }
    
    public final boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        f.f((Object)keyEvent, "event");
        if (keyEvent.getKeyCode() == 4 && this.n.b) {
            if (((View)this).getKeyDispatcherState() == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                final KeyEvent$DispatcherState keyDispatcherState = ((View)this).getKeyDispatcherState();
                if (keyDispatcherState != null) {
                    keyDispatcherState.startTracking(keyEvent, (Object)this);
                }
                return true;
            }
            if (keyEvent.getAction() == 1) {
                final KeyEvent$DispatcherState keyDispatcherState2 = ((View)this).getKeyDispatcherState();
                if (keyDispatcherState2 != null && keyDispatcherState2.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                    final zg2.a<j> m = this.m;
                    if (m != null) {
                        m.invoke();
                    }
                    return true;
                }
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }
    
    public final void f(final int n, final int n2, final int n3, final int n4, final boolean b) {
        super.f(n, n2, n3, n4, b);
        final View child = ((ViewGroup)this).getChildAt(0);
        if (child == null) {
            return;
        }
        this.s.width = child.getMeasuredWidth();
        this.s.height = child.getMeasuredHeight();
        this.q.a(this.r, (View)this, this.s);
    }
    
    public final void g(final int n, final int n2) {
        if (this.n.g) {
            super.g(n, n2);
        }
        else {
            super.g(View$MeasureSpec.makeMeasureSpec(this.getDisplayWidth(), Integer.MIN_VALUE), View$MeasureSpec.makeMeasureSpec(this.getDisplayHeight(), Integer.MIN_VALUE));
        }
    }
    
    public final boolean getCanCalculatePosition() {
        return (boolean)this.y.getValue();
    }
    
    public final WindowManager$LayoutParams getParams$ui_release() {
        return this.s;
    }
    
    public final LayoutDirection getParentLayoutDirection() {
        return this.u;
    }
    
    public final i getPopupContentSize-bOM6tXw() {
        return ((SnapshotMutableStateImpl<i>)this.v).getValue();
    }
    
    public final d getPositionProvider() {
        return this.t;
    }
    
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.C;
    }
    
    public AbstractComposeView getSubCompositionView() {
        return this;
    }
    
    public final String getTestTag() {
        return this.o;
    }
    
    public final void k(final g parentCompositionContext, final ComposableLambdaImpl content) {
        f.f((Object)parentCompositionContext, "parent");
        this.setParentCompositionContext(parentCompositionContext);
        this.setContent((p<? super z0.d, ? super Integer, j>)content);
        this.C = true;
    }
    
    public final void l(final zg2.a<j> m, final e n, final String o, final LayoutDirection layoutDirection) {
        f.f((Object)n, "properties");
        f.f((Object)o, "testTag");
        f.f((Object)layoutDirection, "layoutDirection");
        this.m = m;
        this.n = n;
        this.o = o;
        this.setIsFocusable(n.a);
        this.setSecurePolicy(n.d);
        this.setClippingEnabled(n.f);
        final int n2 = a.a[layoutDirection.ordinal()];
        int layoutDirection2 = 1;
        if (n2 != 1) {
            if (n2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        else {
            layoutDirection2 = 0;
        }
        super.setLayoutDirection(layoutDirection2);
    }
    
    public final void m() {
        final l parentLayoutCoordinates = this.getParentLayoutCoordinates();
        if (parentLayoutCoordinates == null) {
            return;
        }
        final long a = parentLayoutCoordinates.a();
        final long t1 = gn.a.T1(parentLayoutCoordinates);
        final long h = at1.a.h(at1.a.D1(n1.c.c(t1)), at1.a.D1(n1.c.d(t1)));
        final int n = (int)(h >> 32);
        final h x = new h(n, u2.g.b(h), (int)(a >> 32) + n, i.b(a) + u2.g.b(h));
        if (!f.a((Object)x, (Object)this.x)) {
            this.x = x;
            this.o();
        }
    }
    
    public final void n(final l parentLayoutCoordinates) {
        this.setParentLayoutCoordinates(parentLayoutCoordinates);
        this.m();
    }
    
    public final void o() {
        final h x = this.x;
        if (x == null) {
            return;
        }
        final i popupContentSize-bOM6tXw = this.getPopupContentSize-bOM6tXw();
        if (popupContentSize-bOM6tXw != null) {
            final long a = popupContentSize-bOM6tXw.a;
            final Rect a2 = this.A;
            this.q.c(a2, this.p);
            final r a3 = AndroidPopup_androidKt.a;
            final long c = yl.a.c(a2.right - a2.left, a2.bottom - a2.top);
            final long a4 = this.t.a(x, c, this.u, a);
            final WindowManager$LayoutParams s = this.s;
            final int c2 = u2.g.c;
            s.x = (int)(a4 >> 32);
            s.y = u2.g.b(a4);
            if (this.n.e) {
                this.q.b((View)this, (int)(c >> 32), i.b(c));
            }
            this.q.a(this.r, (View)this, this.s);
        }
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        if (!this.n.c) {
            return super.onTouchEvent(motionEvent);
        }
        final boolean b = false;
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= ((View)this).getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= ((View)this).getHeight())) {
            final zg2.a<j> m = this.m;
            if (m != null) {
                m.invoke();
            }
            return true;
        }
        int n = b ? 1 : 0;
        if (motionEvent != null) {
            n = (b ? 1 : 0);
            if (motionEvent.getAction() == 4) {
                n = 1;
            }
        }
        if (n != 0) {
            final zg2.a<j> i = this.m;
            if (i != null) {
                i.invoke();
            }
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
    
    public void setLayoutDirection(final int n) {
    }
    
    public final void setParentLayoutDirection(final LayoutDirection u) {
        f.f((Object)u, "<set-?>");
        this.u = u;
    }
    
    public final void setPopupContentSize-fhxjrPA(final i value) {
        ((SnapshotMutableStateImpl<i>)this.v).setValue(value);
    }
    
    public final void setPositionProvider(final d t) {
        f.f((Object)t, "<set-?>");
        this.t = t;
    }
    
    public final void setTestTag(final String o) {
        f.f((Object)o, "<set-?>");
        this.o = o;
    }
}
