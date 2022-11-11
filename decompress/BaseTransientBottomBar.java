// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.snackbar;

import android.widget.TextView;
import android.animation.Animator;
import com.google.android.material.behavior.SwipeDismissBehavior$b;
import android.view.View$OnClickListener;
import a4.q0$h;
import android.graphics.drawable.Drawable;
import r3.a$b;
import android.graphics.drawable.GradientDrawable;
import of.j;
import qf.c;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View$OnTouchListener;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.widget.FrameLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import android.os.Build$VERSION;
import android.view.ViewParent;
import android.content.res.TypedArray;
import a4.g0;
import a4.q0$i;
import a4.q0$d;
import pd.r;
import android.view.LayoutInflater;
import android.util.Log;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import java.util.List;
import a4.t1;
import java.util.WeakHashMap;
import android.view.ViewGroup$LayoutParams;
import uf.d;
import android.view.ViewGroup$MarginLayoutParams;
import android.animation.Animator$AnimatorListener;
import uf.b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.TimeInterpolator;
import xe.a;
import android.animation.ValueAnimator;
import a4.q0$g;
import a4.q0;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout$c;
import androidx.coordinatorlayout.widget.CoordinatorLayout$f;
import android.os.Message;
import android.os.Handler$Callback;
import android.os.Looper;
import android.view.accessibility.AccessibilityManager;
import android.graphics.Rect;
import uf.h;
import android.content.Context;
import android.view.ViewGroup;
import android.os.Handler;

public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>>
{
    public static final Handler n;
    public static final int[] o;
    public static final String p = "BaseTransientBottomBar";
    public final ViewGroup a;
    public final Context b;
    public final g c;
    public final h d;
    public int e;
    public final BaseTransientBottomBar$b f;
    public Rect g;
    public int h;
    public int i;
    public int j;
    public int k;
    public final AccessibilityManager l;
    public BaseTransientBottomBar$c m;
    
    static {
        o = new int[] { 2130969799 };
        n = new Handler(Looper.getMainLooper(), (Handler$Callback)new Handler$Callback() {
            public final boolean handleMessage(final Message message) {
                final int what = message.what;
                if (what == 0) {
                    final BaseTransientBottomBar baseTransientBottomBar = (BaseTransientBottomBar)message.obj;
                    baseTransientBottomBar.c.setOnAttachStateChangeListener((e)new com.google.android.material.snackbar.e(baseTransientBottomBar));
                    if (((View)baseTransientBottomBar.c).getParent() == null) {
                        final ViewGroup$LayoutParams layoutParams = ((View)baseTransientBottomBar.c).getLayoutParams();
                        if (layoutParams instanceof CoordinatorLayout$f) {
                            final CoordinatorLayout$f coordinatorLayout$f = (CoordinatorLayout$f)layoutParams;
                            final BaseTransientBottomBar$Behavior baseTransientBottomBar$Behavior = new BaseTransientBottomBar$Behavior();
                            final d i = baseTransientBottomBar$Behavior.i;
                            i.getClass();
                            i.a = baseTransientBottomBar.m;
                            ((SwipeDismissBehavior)baseTransientBottomBar$Behavior).b = (SwipeDismissBehavior$b)new com.google.android.material.snackbar.g(baseTransientBottomBar);
                            coordinatorLayout$f.b((CoordinatorLayout$c)baseTransientBottomBar$Behavior);
                            coordinatorLayout$f.g = 80;
                        }
                        baseTransientBottomBar.e();
                        ((View)baseTransientBottomBar.c).setVisibility(4);
                        baseTransientBottomBar.a.addView((View)baseTransientBottomBar.c);
                    }
                    final g c = baseTransientBottomBar.c;
                    final WeakHashMap<View, t1> a = q0.a;
                    if (q0$g.c((View)c)) {
                        final List enabledAccessibilityServiceList = baseTransientBottomBar.l.getEnabledAccessibilityServiceList(1);
                        if (enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty()) {
                            ((View)baseTransientBottomBar.c).post((Runnable)new com.google.android.material.snackbar.h(baseTransientBottomBar));
                        }
                        else {
                            ((View)baseTransientBottomBar.c).setVisibility(0);
                            baseTransientBottomBar.d();
                        }
                    }
                    else {
                        baseTransientBottomBar.c.setOnLayoutChangeListener((f)new com.google.android.material.snackbar.f(baseTransientBottomBar));
                    }
                    return true;
                }
                if (what != 1) {
                    return false;
                }
                final BaseTransientBottomBar baseTransientBottomBar2 = (BaseTransientBottomBar)message.obj;
                final int arg1 = message.arg1;
                final List enabledAccessibilityServiceList2 = baseTransientBottomBar2.l.getEnabledAccessibilityServiceList(1);
                if (enabledAccessibilityServiceList2 != null && enabledAccessibilityServiceList2.isEmpty() && ((View)baseTransientBottomBar2.c).getVisibility() == 0) {
                    if (baseTransientBottomBar2.c.getAnimationMode() == 1) {
                        final ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[] { 1.0f, 0.0f });
                        ofFloat.setInterpolator((TimeInterpolator)xe.a.a);
                        ofFloat.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new com.google.android.material.snackbar.a(baseTransientBottomBar2));
                        ofFloat.setDuration(75L);
                        ((Animator)ofFloat).addListener((Animator$AnimatorListener)new b(baseTransientBottomBar2, arg1));
                        ofFloat.start();
                    }
                    else {
                        final ValueAnimator valueAnimator = new ValueAnimator();
                        final int height = ((View)baseTransientBottomBar2.c).getHeight();
                        final ViewGroup$LayoutParams layoutParams2 = ((View)baseTransientBottomBar2.c).getLayoutParams();
                        int n = height;
                        if (layoutParams2 instanceof ViewGroup$MarginLayoutParams) {
                            n = height + ((ViewGroup$MarginLayoutParams)layoutParams2).bottomMargin;
                        }
                        valueAnimator.setIntValues(new int[] { 0, n });
                        valueAnimator.setInterpolator((TimeInterpolator)xe.a.b);
                        valueAnimator.setDuration(250L);
                        ((Animator)valueAnimator).addListener((Animator$AnimatorListener)new uf.d(baseTransientBottomBar2, arg1));
                        valueAnimator.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new com.google.android.material.snackbar.d(baseTransientBottomBar2));
                        valueAnimator.start();
                    }
                }
                else {
                    baseTransientBottomBar2.c();
                }
                return true;
            }
        });
    }
    
    public BaseTransientBottomBar(final ViewGroup a, final SnackbarContentLayout snackbarContentLayout, final SnackbarContentLayout d) {
        this.f = new Runnable() {
            @Override
            public final void run() {
                final BaseTransientBottomBar f = BaseTransientBottomBar.this;
                if (f.c != null) {
                    final Context b = f.b;
                    if (b != null) {
                        final WindowManager windowManager = (WindowManager)b.getSystemService("window");
                        final DisplayMetrics displayMetrics = new DisplayMetrics();
                        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
                        final int heightPixels = displayMetrics.heightPixels;
                        final BaseTransientBottomBar f2 = BaseTransientBottomBar.this;
                        final int[] array = new int[2];
                        ((View)f2.c).getLocationOnScreen(array);
                        final int n = heightPixels - (((View)f2.c).getHeight() + array[1]) + (int)((View)BaseTransientBottomBar.this.c).getTranslationY();
                        final BaseTransientBottomBar f3 = BaseTransientBottomBar.this;
                        if (n >= f3.k) {
                            return;
                        }
                        final ViewGroup$LayoutParams layoutParams = ((View)f3.c).getLayoutParams();
                        if (!(layoutParams instanceof ViewGroup$MarginLayoutParams)) {
                            Log.w(BaseTransientBottomBar.p, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                            return;
                        }
                        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)layoutParams;
                        final int bottomMargin = viewGroup$MarginLayoutParams.bottomMargin;
                        final BaseTransientBottomBar f4 = BaseTransientBottomBar.this;
                        viewGroup$MarginLayoutParams.bottomMargin = f4.k - n + bottomMargin;
                        ((View)f4.c).requestLayout();
                    }
                }
            }
        };
        this.m = new BaseTransientBottomBar$c(this);
        if (snackbarContentLayout == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (d != null) {
            this.a = a;
            this.d = (h)d;
            final Context context = ((View)a).getContext();
            of.g.c(this.b = context, of.g.a, "Theme.AppCompat");
            final LayoutInflater from = LayoutInflater.from(context);
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(BaseTransientBottomBar.o);
            final int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            obtainStyledAttributes.recycle();
            int n;
            if (resourceId != -1) {
                n = 2131624905;
            }
            else {
                n = 2131624181;
            }
            final g c = (g)from.inflate(n, a, false);
            this.c = c;
            final float actionTextColorAlpha = c.getActionTextColorAlpha();
            if (actionTextColorAlpha != 1.0f) {
                ((TextView)snackbarContentLayout.g).setTextColor(r.Y(actionTextColorAlpha, r.t(2130968836, (View)snackbarContentLayout), ((TextView)snackbarContentLayout.g).getCurrentTextColor()));
            }
            ((ViewGroup)c).addView((View)snackbarContentLayout);
            final ViewGroup$LayoutParams layoutParams = ((View)c).getLayoutParams();
            if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
                final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)layoutParams;
                this.g = new Rect(viewGroup$MarginLayoutParams.leftMargin, viewGroup$MarginLayoutParams.topMargin, viewGroup$MarginLayoutParams.rightMargin, viewGroup$MarginLayoutParams.bottomMargin);
            }
            final WeakHashMap<View, t1> a2 = q0.a;
            q0$g.f((View)c, 1);
            q0$d.s((View)c, 1);
            ((View)c).setFitsSystemWindows(true);
            q0$i.u((View)c, (g0)new uf.e(this));
            q0.l((View)c, (a4.a)new uf.f(this));
            this.l = (AccessibilityManager)context.getSystemService("accessibility");
            return;
        }
        throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
    }
    
    public void a() {
        this.b(3);
    }
    
    public final void b(final int n) {
        final i b = com.google.android.material.snackbar.i.b();
        final BaseTransientBottomBar$c m = this.m;
        final Object a = b.a;
        monitorenter(a);
        while (true) {
            try {
                if (b.c(m)) {
                    b.a(b.c, n);
                }
                else {
                    final i.c d = b.d;
                    final int n2 = 1;
                    int n3;
                    if (d != null && (m != null && d.a.get() == m)) {
                        n3 = n2;
                    }
                    else {
                        n3 = 0;
                    }
                    if (n3 != 0) {
                        b.a(b.d, n);
                    }
                }
                monitorexit(a);
                return;
                monitorexit(a);
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final void c() {
        final i b = com.google.android.material.snackbar.i.b();
        final BaseTransientBottomBar$c m = this.m;
        final Object a = b.a;
        monitorenter(a);
    Block_8_Outer:
        while (true) {
            Label_0080: {
                try {
                    if (!b.c(m)) {
                        break Label_0085;
                    }
                    b.c = null;
                    final i.c d = b.d;
                    if (d == null || d == null) {
                        break Label_0085;
                    }
                    b.c = d;
                    b.d = null;
                    final i.b b2 = d.a.get();
                    if (b2 != null) {
                        b2.show();
                        break Label_0085;
                    }
                    break Label_0080;
                }
                finally {
                    monitorexit(a);
                    while (true) {
                        final ViewParent parent;
                        ((ViewGroup)parent).removeView((View)this.c);
                        return;
                        monitorexit(a);
                        parent = ((View)this.c).getParent();
                        iftrue(Label_0113:)(!(parent instanceof ViewGroup));
                        continue;
                    }
                    Label_0113: {
                        return;
                    }
                    b.c = null;
                    continue Block_8_Outer;
                }
            }
            break;
        }
    }
    
    public final void d() {
        final i b = com.google.android.material.snackbar.i.b();
        final BaseTransientBottomBar$c m = this.m;
        final Object a = b.a;
        monitorenter(a);
        while (true) {
            try {
                if (b.c(m)) {
                    b.d(b.c);
                }
                monitorexit(a);
                return;
                monitorexit(a);
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final void e() {
        final ViewGroup$LayoutParams layoutParams = ((View)this.c).getLayoutParams();
        if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
            final Rect g = this.g;
            if (g != null) {
                final int h = this.h;
                final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)layoutParams;
                viewGroup$MarginLayoutParams.bottomMargin = g.bottom + h;
                viewGroup$MarginLayoutParams.leftMargin = g.left + this.i;
                viewGroup$MarginLayoutParams.rightMargin = g.right + this.j;
                ((View)this.c).requestLayout();
                if (Build$VERSION.SDK_INT >= 29) {
                    final int k = this.k;
                    final int n = 1;
                    int n2 = 0;
                    Label_0147: {
                        if (k > 0) {
                            final ViewGroup$LayoutParams layoutParams2 = ((View)this.c).getLayoutParams();
                            if (layoutParams2 instanceof CoordinatorLayout$f && ((CoordinatorLayout$f)layoutParams2).a instanceof SwipeDismissBehavior) {
                                n2 = n;
                                break Label_0147;
                            }
                        }
                        n2 = 0;
                    }
                    if (n2 != 0) {
                        ((View)this.c).removeCallbacks((Runnable)this.f);
                        ((View)this.c).post((Runnable)this.f);
                    }
                }
                return;
            }
        }
        Log.w(BaseTransientBottomBar.p, "Unable to update margins because layout params are not MarginLayoutParams");
    }
    
    public static final class d
    {
        public BaseTransientBottomBar$c a;
        
        public d(final SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.getClass();
            swipeDismissBehavior.f = Math.min(Math.max(0.0f, 0.1f), 1.0f);
            swipeDismissBehavior.g = Math.min(Math.max(0.0f, 0.6f), 1.0f);
            swipeDismissBehavior.d = 0;
        }
    }
    
    public interface e
    {
    }
    
    public interface f
    {
    }
    
    public static class g extends FrameLayout
    {
        public static final BaseTransientBottomBar$g$a m;
        public f f;
        public e g;
        public int h;
        public final float i;
        public final float j;
        public ColorStateList k;
        public PorterDuff$Mode l;
        
        static {
            m = new View$OnTouchListener() {
                public final boolean onTouch(final View view, final MotionEvent motionEvent) {
                    return true;
                }
            };
        }
        
        public g(Context context, final AttributeSet set) {
            super(yf.a.a(context, set, 0, 0), set);
            context = ((View)this).getContext();
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, r.Q);
            if (obtainStyledAttributes.hasValue(6)) {
                final float n = (float)obtainStyledAttributes.getDimensionPixelSize(6, 0);
                final WeakHashMap<View, t1> a = q0.a;
                q0$i.s((View)this, n);
            }
            this.h = obtainStyledAttributes.getInt(2, 0);
            this.i = obtainStyledAttributes.getFloat(3, 1.0f);
            this.setBackgroundTintList(c.a(context, obtainStyledAttributes, 4));
            this.setBackgroundTintMode(j.c(obtainStyledAttributes.getInt(5, -1), PorterDuff$Mode.SRC_IN));
            this.j = obtainStyledAttributes.getFloat(1, 1.0f);
            obtainStyledAttributes.recycle();
            ((View)this).setOnTouchListener((View$OnTouchListener)g.m);
            ((View)this).setFocusable(true);
            if (((View)this).getBackground() == null) {
                final float dimension = ((View)this).getResources().getDimension(2131166290);
                final GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(dimension);
                gradientDrawable.setColor(r.Y(this.getBackgroundOverlayColorAlpha(), r.t(2130968836, (View)this), r.t(2130968828, (View)this)));
                final ColorStateList k = this.k;
                if (k != null) {
                    a$b.h((Drawable)gradientDrawable, k);
                }
                final WeakHashMap<View, t1> a2 = q0.a;
                q0$d.q((View)this, (Drawable)gradientDrawable);
            }
        }
        
        public float getActionTextColorAlpha() {
            return this.j;
        }
        
        public int getAnimationMode() {
            return this.h;
        }
        
        public float getBackgroundOverlayColorAlpha() {
            return this.i;
        }
        
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            final e g = this.g;
            if (g != null) {
                ((com.google.android.material.snackbar.e)g).a();
            }
            final WeakHashMap<View, t1> a = q0.a;
            q0$h.c((View)this);
        }
        
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            final e g = this.g;
            if (g != null) {
                final com.google.android.material.snackbar.e e = (com.google.android.material.snackbar.e)g;
                final BaseTransientBottomBar a = e.a;
                a.getClass();
                final i b = com.google.android.material.snackbar.i.b();
                final BaseTransientBottomBar$c m = a.m;
                final Object a2 = b.a;
                monitorenter(a2);
                Label_0097: {
                    try {
                        final boolean c = b.c(m);
                        final boolean b2 = false;
                        if (c) {
                            break Label_0097;
                        }
                        final i.c d = b.d;
                        if (d == null) {
                            break Label_0097;
                        }
                        if (m != null && d.a.get() == m) {
                            final boolean b3 = true;
                            break Label_0097;
                        }
                        break Label_0097;
                    }
                    finally {
                        monitorexit(a2);
                        boolean b2;
                        boolean b3;
                        boolean b4 = false;
                        Block_10_Outer:Label_0122_Outer:
                        while (true) {
                            iftrue(Label_0122:)(!b4);
                            break Label_0097;
                            b3 = false;
                            break Label_0097;
                            while (true) {
                            Block_9:
                                while (true) {
                                    BaseTransientBottomBar.n.post((Runnable)new uf.g(e));
                                    return;
                                    iftrue(Label_0111:)(!b3);
                                    break Block_9;
                                    monitorexit(a2);
                                    iftrue(Label_0151:)(!b2);
                                    continue Label_0122_Outer;
                                }
                                b4 = true;
                                continue Block_10_Outer;
                                b2 = true;
                                continue;
                            }
                            b4 = false;
                            continue Block_10_Outer;
                        }
                    }
                }
            }
            Label_0151:;
        }
        
        public final void onLayout(final boolean b, int n, final int n2, final int n3, final int n4) {
            super.onLayout(b, n, n2, n3, n4);
            final f f = this.f;
            if (f != null) {
                final com.google.android.material.snackbar.f f2 = (com.google.android.material.snackbar.f)f;
                f2.a.c.setOnLayoutChangeListener(null);
                final BaseTransientBottomBar a = f2.a;
                final AccessibilityManager l = a.l;
                n = 1;
                final List enabledAccessibilityServiceList = l.getEnabledAccessibilityServiceList(1);
                if (enabledAccessibilityServiceList == null || !enabledAccessibilityServiceList.isEmpty()) {
                    n = 0;
                }
                if (n != 0) {
                    ((View)a.c).post((Runnable)new com.google.android.material.snackbar.h(a));
                }
                else {
                    ((View)a.c).setVisibility(0);
                    a.d();
                }
            }
        }
        
        public void setAnimationMode(final int h) {
            this.h = h;
        }
        
        public void setBackground(final Drawable backgroundDrawable) {
            this.setBackgroundDrawable(backgroundDrawable);
        }
        
        public void setBackgroundDrawable(final Drawable drawable) {
            Drawable mutate = drawable;
            if (drawable != null) {
                mutate = drawable;
                if (this.k != null) {
                    mutate = drawable.mutate();
                    a$b.h(mutate, this.k);
                    a$b.i(mutate, this.l);
                }
            }
            super.setBackgroundDrawable(mutate);
        }
        
        public void setBackgroundTintList(final ColorStateList k) {
            this.k = k;
            if (((View)this).getBackground() != null) {
                final Drawable mutate = ((View)this).getBackground().mutate();
                a$b.h(mutate, k);
                a$b.i(mutate, this.l);
                if (mutate != ((View)this).getBackground()) {
                    super.setBackgroundDrawable(mutate);
                }
            }
        }
        
        public void setBackgroundTintMode(final PorterDuff$Mode l) {
            this.l = l;
            if (((View)this).getBackground() != null) {
                final Drawable mutate = ((View)this).getBackground().mutate();
                a$b.i(mutate, l);
                if (mutate != ((View)this).getBackground()) {
                    super.setBackgroundDrawable(mutate);
                }
            }
        }
        
        public void setOnAttachStateChangeListener(final e g) {
            this.g = g;
        }
        
        public void setOnClickListener(final View$OnClickListener onClickListener) {
            Object m;
            if (onClickListener != null) {
                m = null;
            }
            else {
                m = BaseTransientBottomBar.g.m;
            }
            ((View)this).setOnTouchListener((View$OnTouchListener)m);
            super.setOnClickListener(onClickListener);
        }
        
        public void setOnLayoutChangeListener(final f f) {
            this.f = f;
        }
    }
}
