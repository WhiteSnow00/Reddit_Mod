// 
// Decompiled by Procyon v0.6.0
// 

package androidx.recyclerview.widget;

import java.lang.reflect.AccessibleObject;
import android.view.View$AccessibilityDelegate;
import java.lang.reflect.Field;
import X.Uab;
import X.NQO;
import X.Uac;
import X.2ex;
import android.util.Log;
import kotlin.jvm.internal.n;
import com.bytedance.ies.abmock.SettingsManager;
import X.2Qs;
import android.graphics.Matrix;
import X.07e;
import android.view.ViewGroup$MarginLayoutParams;
import X.16l;
import X.16k;
import X.0Ej;
import X.2Ng;
import java.util.Collections;
import java.lang.ref.WeakReference;
import android.os.Parcel;
import android.os.Parcelable$ClassLoaderCreator;
import android.os.Parcelable$Creator;
import androidx.customview.view.AbsSavedState;
import android.os.SystemClock;
import android.animation.LayoutTransition;
import X.07U;
import X.07k;
import android.view.View$MeasureSpec;
import android.view.Display;
import android.view.FocusFinder;
import android.graphics.Canvas;
import android.os.Parcelable;
import android.util.SparseArray;
import android.os.Trace;
import android.widget.OverScroller;
import android.view.accessibility.AccessibilityEvent;
import android.view.ViewParent;
import X.080;
import android.view.MotionEvent;
import X.6G9;
import X.6Nw;
import X.2Lq;
import android.os.Handler;
import android.os.Looper;
import android.content.ClipboardManager;
import X.2JT;
import java.lang.reflect.Constructor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.content.res.TypedArray;
import android.view.View$OnAttachStateChangeListener;
import X.0Qw;
import java.lang.reflect.InvocationTargetException;
import X.17A;
import android.graphics.drawable.StateListDrawable;
import androidx.core.g.t;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import X.08G;
import android.view.ViewConfiguration;
import X.1gh;
import android.util.AttributeSet;
import android.content.Context;
import android.os.Build$VERSION;
import com.bytedance.covode.number.Covode;
import X.082;
import android.view.VelocityTracker;
import android.widget.EdgeEffect;
import android.view.accessibility.AccessibilityManager;
import X.17N;
import X.0FS;
import java.util.ArrayList;
import java.util.List;
import android.graphics.RectF;
import android.graphics.Rect;
import X.0Em;
import X.0Ey;
import X.16p;
import android.view.animation.Interpolator;
import X.088;
import X.1fm;
import X.14c;
import android.view.ViewGroup;

public class RecyclerView extends ViewGroup implements 14c, 1fm, 088
{
    public static final boolean LIZ;
    public static final boolean LIZIZ;
    public static final boolean LIZJ;
    public static final boolean LIZLLL;
    public static final Interpolator LJJIZ;
    public static final int[] LJJJ;
    public static final boolean LJJJI;
    public static final boolean LJJJIL;
    public static final Class<?>[] LJJJJ;
    public final o LJ;
    public SavedState LJFF;
    public 16p LJI;
    public 0Ey LJII;
    public final 0Em LJIIIIZZ;
    public boolean LJIIIZ;
    public final Runnable LJIIJ;
    public final Rect LJIIJJI;
    public final RectF LJIIL;
    public a LJIILIIL;
    public i LJIILJJIL;
    public p LJIILL;
    public final List<p> LJIILLIIL;
    public final ArrayList<RecyclerView.h> LJIIZILJ;
    public boolean LJIJ;
    public boolean LJIJI;
    public boolean LJIJJ;
    public boolean LJIJJLI;
    public boolean LJIL;
    public boolean LJJ;
    public boolean LJJI;
    public List<k> LJJIFFI;
    public boolean LJJII;
    public boolean LJJIII;
    public f LJJIIJ;
    public final v LJJIIJZLJL;
    public 0FS LJJIIZ;
    public 0FS.a LJJIIZI;
    public final t LJJIJ;
    public boolean LJJIJIIJI;
    public boolean LJJIJIIJIL;
    public boolean LJJIJIL;
    public 17N LJJIJL;
    public final int[] LJJIJLIJ;
    public final List<ViewHolder> LJJIL;
    public final RecyclerView.q LJJJJI;
    public final Rect LJJJJIZL;
    public final ArrayList<RecyclerView.m> LJJJJJ;
    public RecyclerView.m LJJJJJL;
    public int LJJJJL;
    public boolean LJJJJLI;
    public int LJJJJLL;
    public final AccessibilityManager LJJJJZ;
    public int LJJJJZI;
    public int LJJJLIIL;
    public RecyclerView.e LJJJLL;
    public EdgeEffect LJJJLZIJ;
    public EdgeEffect LJJJZ;
    public EdgeEffect LJJL;
    public EdgeEffect LJJLI;
    public int LJJLIIIIJ;
    public int LJJLIIIJ;
    public VelocityTracker LJJLIIIJILLIZJL;
    public int LJJLIIIJJI;
    public int LJJLIIIJJIZ;
    public int LJJLIIIJL;
    public int LJJLIIIJLJLI;
    public int LJJLIIIJLLLLLLLZ;
    public RecyclerView.l LJJLIIJ;
    public final int LJJLIL;
    public final int LJJLJ;
    public float LJJLJLI;
    public float LJJLL;
    public boolean LJJZ;
    public RecyclerView.n LJJZZI;
    public List<RecyclerView.n> LJJZZIII;
    public RecyclerView.b LJL;
    public RecyclerView.d LJLI;
    public final int[] LJLIIIL;
    public 082 LJLIIL;
    public final int[] LJLIL;
    public final int[] LJLILLLLZI;
    public Runnable LJLJI;
    public boolean LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public final 0Em.b LJLJL;
    
    static {
        Covode.recordClassIndex(1507);
        LJJJ = new int[] { 16843830 };
        LIZ = (Build$VERSION.SDK_INT == 18 || Build$VERSION.SDK_INT == 19 || Build$VERSION.SDK_INT == 20);
        LIZIZ = (Build$VERSION.SDK_INT >= 23);
        LIZJ = true;
        LIZLLL = true;
        LJJJI = false;
        LJJJIL = false;
        LJJJJ = new Class[] { Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE };
        LJJIZ = (Interpolator)new Interpolator() {
            static {
                Covode.recordClassIndex(1510);
            }
            
            public final float getInterpolation(float n) {
                --n;
                return n * n * n * n * n + 1.0f;
            }
        };
    }
    
    public RecyclerView(final Context context) {
        this(context, null);
    }
    
    public RecyclerView(final Context context, final AttributeSet set) {
        this(context, set, 2130970819);
    }
    
    public RecyclerView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.LJJJJI = new RecyclerView.q(this);
        this.LJ = new o();
        this.LJIIIIZZ = new 0Em();
        this.LJIIJ = new Runnable() {
            static {
                Covode.recordClassIndex(1508);
            }
            
            @Override
            public final void run() {
                if (RecyclerView.this.LJIJJLI && !RecyclerView.this.isLayoutRequested()) {
                    if (!RecyclerView.this.LJIJ) {
                        RecyclerView.this.requestLayout();
                        return;
                    }
                    if (RecyclerView.this.LJJ) {
                        RecyclerView.this.LJIL = true;
                        return;
                    }
                    RecyclerView.this.LJ();
                }
            }
        };
        this.LJIIJJI = new Rect();
        this.LJJJJIZL = new Rect();
        this.LJIIL = new RectF();
        this.LJIILLIIL = new ArrayList<p>();
        this.LJIIZILJ = new ArrayList<RecyclerView.h>();
        this.LJJJJJ = new ArrayList<RecyclerView.m>();
        this.LJJJJL = 0;
        this.LJJII = false;
        this.LJJIII = false;
        this.LJJJJZI = 0;
        this.LJJJLIIL = 0;
        this.LJJJLL = new RecyclerView.e();
        this.LJJIIJ = (f)new 1gh();
        this.LJJLIIIIJ = 0;
        this.LJJLIIIJ = -1;
        this.LJJLJLI = Float.MIN_VALUE;
        this.LJJLL = Float.MIN_VALUE;
        this.LJJZ = true;
        this.LJJIIJZLJL = new v();
        0FS.a ljjiizi;
        if (RecyclerView.LIZLLL) {
            ljjiizi = new 0FS.a();
        }
        else {
            ljjiizi = null;
        }
        this.LJJIIZI = ljjiizi;
        this.LJJIJ = new t();
        this.LJJIJIIJI = false;
        this.LJJIJIIJIL = false;
        this.LJL = (RecyclerView.b)new RecyclerView.g(this);
        this.LJJIJIL = false;
        this.LJLIIIL = new int[2];
        this.LJLIL = new int[2];
        this.LJLILLLLZI = new int[2];
        this.LJJIJLIJ = new int[2];
        this.LJJIL = new ArrayList<ViewHolder>();
        this.LJLJI = new Runnable() {
            static {
                Covode.recordClassIndex(1509);
            }
            
            @Override
            public final void run() {
                if (RecyclerView.this.LJJIIJ != null) {
                    RecyclerView.this.LJJIIJ.LIZ();
                }
                RecyclerView.this.LJJIJIL = false;
            }
        };
        this.LJLJJL = 0;
        this.LJLJJLL = 0;
        this.LJLJL = new 0Em.b() {
            static {
                Covode.recordClassIndex(1511);
            }
            
            @Override
            public final void LIZ(final ViewHolder viewHolder) {
                RecyclerView.this.LJIILJJIL.LIZ(viewHolder.itemView, RecyclerView.this.LJ);
            }
            
            @Override
            public final void LIZ(final ViewHolder viewHolder, final f.c c, final f.c c2) {
                RecyclerView.this.LJ.LIZIZ(viewHolder);
                final RecyclerView liz = RecyclerView.this;
                liz.LIZ(viewHolder);
                viewHolder.setIsRecyclable(false);
                if (liz.LJJIIJ.LIZ(viewHolder, c, c2)) {
                    liz.LJIIJ();
                }
            }
            
            @Override
            public final void LIZIZ(final ViewHolder viewHolder, final f.c c, final f.c c2) {
                final RecyclerView liz = RecyclerView.this;
                viewHolder.setIsRecyclable(false);
                if (liz.LJJIIJ.LIZIZ(viewHolder, c, c2)) {
                    liz.LJIIJ();
                }
            }
            
            @Override
            public final void LIZJ(final ViewHolder viewHolder, final f.c c, final f.c c2) {
                viewHolder.setIsRecyclable(false);
                if (RecyclerView.this.LJJII) {
                    if (RecyclerView.this.LJJIIJ.LIZ(viewHolder, viewHolder, c, c2)) {
                        RecyclerView.this.LJIIJ();
                    }
                }
                else if (RecyclerView.this.LJJIIJ.LIZJ(viewHolder, c, c2)) {
                    RecyclerView.this.LJIIJ();
                }
            }
        };
        this.setScrollContainer(true);
        this.setFocusableInTouchMode(true);
        final ViewConfiguration value = ViewConfiguration.get(context);
        this.LJJLIIIJLLLLLLLZ = value.getScaledTouchSlop();
        float ljjljli;
        if (Build$VERSION.SDK_INT >= 26) {
            ljjljli = value.getScaledHorizontalScrollFactor();
        }
        else {
            ljjljli = 08G.LIZ(value, context);
        }
        this.LJJLJLI = ljjljli;
        float ljjll;
        if (Build$VERSION.SDK_INT >= 26) {
            ljjll = value.getScaledVerticalScrollFactor();
        }
        else {
            ljjll = 08G.LIZ(value, context);
        }
        this.LJJLL = ljjll;
        this.LJJLIL = value.getScaledMinimumFlingVelocity();
        this.LJJLJ = value.getScaledMaximumFlingVelocity();
        this.setWillNotDraw(this.getOverScrollMode() == 2);
        this.LJJIIJ.LJII = this.LJL;
        this.LJI = new 16p((16p.a)new 16p.a() {
            static {
                Covode.recordClassIndex(1513);
            }
            
            private void LIZJ(final 16p.b b) {
                final int liz = b.LIZ;
                if (liz == 1) {
                    RecyclerView.this.LJIILJJIL.LIZ(RecyclerView.this, b.LIZIZ, b.LIZLLL);
                    return;
                }
                if (liz == 2) {
                    RecyclerView.this.LJIILJJIL.LIZIZ(RecyclerView.this, b.LIZIZ, b.LIZLLL);
                    return;
                }
                if (liz != 4) {
                    if (liz == 8) {
                        RecyclerView.this.LJIILJJIL.LIZ(RecyclerView.this, b.LIZIZ, b.LIZLLL, 1);
                    }
                    return;
                }
                RecyclerView.this.LJIILJJIL.LIZ(RecyclerView.this, b.LIZIZ, b.LIZLLL, b.LIZJ);
            }
            
            @Override
            public final ViewHolder LIZ(final int n) {
                final ViewHolder liz = RecyclerView.this.LIZ(n, true);
                if (liz == null) {
                    return null;
                }
                if (RecyclerView.this.LJII.LIZLLL(liz.itemView)) {
                    return null;
                }
                return liz;
            }
            
            @Override
            public final void LIZ(final int n, final int n2) {
                RecyclerView.this.LIZIZ(n, n2, true);
                RecyclerView.this.LJJIJIIJI = true;
                final t ljjij = RecyclerView.this.LJJIJ;
                ljjij.LIZJ += n2;
            }
            
            @Override
            public final void LIZ(final int n, int i, final Object o) {
                final RecyclerView liz = RecyclerView.this;
                final int liziz = liz.LJII.LIZIZ();
                final int n2 = i + n;
                View lizj;
                ViewHolder lizj2;
                for (i = 0; i < liziz; ++i) {
                    lizj = liz.LJII.LIZJ(i);
                    lizj2 = RecyclerView.LIZJ(lizj);
                    if (lizj2 != null && !lizj2.shouldIgnore() && lizj2.mPosition >= n && lizj2.mPosition < n2) {
                        lizj2.addFlags(2);
                        lizj2.addChangePayload(o);
                        ((j)lizj.getLayoutParams()).LJ = true;
                    }
                }
                final o lj = liz.LJ;
                ViewHolder viewHolder;
                int mPosition;
                for (i = lj.LIZJ.size() - 1; i >= 0; --i) {
                    viewHolder = lj.LIZJ.get(i);
                    if (viewHolder != null) {
                        mPosition = viewHolder.mPosition;
                        if (mPosition >= n && mPosition < n2) {
                            viewHolder.addFlags(2);
                            lj.LIZLLL(i);
                        }
                    }
                }
                RecyclerView.this.LJJIJIIJIL = true;
            }
            
            @Override
            public final void LIZ(final 16p.b b) {
                this.LIZJ(b);
            }
            
            @Override
            public final void LIZIZ(final int n, final int n2) {
                RecyclerView.this.LIZIZ(n, n2, false);
                RecyclerView.this.LJJIJIIJI = true;
            }
            
            @Override
            public final void LIZIZ(final 16p.b b) {
                this.LIZJ(b);
            }
            
            @Override
            public final void LIZJ(final int n, final int n2) {
                final RecyclerView liz = RecyclerView.this;
                for (int liziz = liz.LJII.LIZIZ(), i = 0; i < liziz; ++i) {
                    final ViewHolder lizj = RecyclerView.LIZJ(liz.LJII.LIZJ(i));
                    if (lizj != null && !lizj.shouldIgnore() && lizj.mPosition >= n) {
                        lizj.offsetPosition(n2, false);
                        liz.LJJIJ.LJFF = true;
                    }
                }
                final o lj = liz.LJ;
                for (int size = lj.LIZJ.size(), j = 0; j < size; ++j) {
                    final ViewHolder viewHolder = lj.LIZJ.get(j);
                    if (viewHolder != null && viewHolder.mPosition >= n) {
                        viewHolder.offsetPosition(n2, false);
                    }
                }
                liz.requestLayout();
                RecyclerView.this.LJJIJIIJI = true;
            }
            
            @Override
            public final void LIZLLL(final int n, final int n2) {
                final RecyclerView liz = RecyclerView.this;
                final int liziz = liz.LJII.LIZIZ();
                final int n3 = -1;
                int n4;
                int n5;
                int n6;
                if (n < n2) {
                    n4 = n;
                    n5 = n2;
                    n6 = -1;
                }
                else {
                    n5 = n;
                    n4 = n2;
                    n6 = 1;
                }
                for (int i = 0; i < liziz; ++i) {
                    final ViewHolder lizj = RecyclerView.LIZJ(liz.LJII.LIZJ(i));
                    if (lizj != null && lizj.mPosition >= n4 && lizj.mPosition <= n5) {
                        if (lizj.mPosition == n) {
                            lizj.offsetPosition(n2 - n, false);
                        }
                        else {
                            lizj.offsetPosition(n6, false);
                        }
                        liz.LJJIJ.LJFF = true;
                    }
                }
                final o lj = liz.LJ;
                int n7;
                int n8;
                int n9;
                if (n < n2) {
                    n7 = n;
                    n8 = n2;
                    n9 = n3;
                }
                else {
                    n8 = n;
                    n7 = n2;
                    n9 = 1;
                }
                for (int size = lj.LIZJ.size(), j = 0; j < size; ++j) {
                    final ViewHolder viewHolder = lj.LIZJ.get(j);
                    if (viewHolder != null && viewHolder.mPosition >= n7 && viewHolder.mPosition <= n8) {
                        if (viewHolder.mPosition == n) {
                            viewHolder.offsetPosition(n2 - n, false);
                        }
                        else {
                            viewHolder.offsetPosition(n9, false);
                        }
                    }
                }
                liz.requestLayout();
                RecyclerView.this.LJJIJIIJI = true;
            }
        });
        this.LJII = new 0Ey((0Ey.b)new 0Ey.b() {
            static {
                Covode.recordClassIndex(1512);
            }
            
            @Override
            public final int LIZ() {
                return RecyclerView.this.getChildCount();
            }
            
            @Override
            public final int LIZ(final View view) {
                return RecyclerView.this.indexOfChild(view);
            }
            
            @Override
            public final void LIZ(final int n) {
                final View child = RecyclerView.this.getChildAt(n);
                if (child != null) {
                    RecyclerView.this.LJII(child);
                    child.clearAnimation();
                }
                RecyclerView.this.removeViewAt(n);
            }
            
            @Override
            public final void LIZ(final View view, int i) {
                RecyclerView.this.addView(view, i);
                final RecyclerView liz = RecyclerView.this;
                final ViewHolder lizj = RecyclerView.LIZJ(view);
                if (liz.LJIILIIL != null && lizj != null) {
                    ((RecyclerView.a<ViewHolder>)liz.LJIILIIL).onViewAttachedToWindow(lizj);
                }
                if (liz.LJJIFFI != null) {
                    for (i = liz.LJJIFFI.size() - 1; i >= 0; --i) {
                        ((k)liz.LJJIFFI.get(i)).LIZ(view);
                    }
                }
            }
            
            @Override
            public final void LIZ(final View view, final int n, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
                final ViewHolder lizj = RecyclerView.LIZJ(view);
                if (lizj != null) {
                    if (!lizj.isTmpDetached() && !lizj.shouldIgnore()) {
                        final StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                        sb.append(lizj);
                        sb.append(RecyclerView.this.LIZ());
                        throw new IllegalArgumentException(sb.toString());
                    }
                    lizj.clearTmpDetachFlag();
                }
                RecyclerView.LIZ(RecyclerView.this, view, n, viewGroup$LayoutParams);
            }
            
            @Override
            public final View LIZIZ(final int n) {
                return RecyclerView.this.getChildAt(n);
            }
            
            @Override
            public final ViewHolder LIZIZ(final View view) {
                return RecyclerView.LIZJ(view);
            }
            
            @Override
            public final void LIZIZ() {
                for (int childCount = RecyclerView.this.getChildCount(), i = 0; i < childCount; ++i) {
                    final View liziz = this.LIZIZ(i);
                    RecyclerView.this.LJII(liziz);
                    liziz.clearAnimation();
                }
                RecyclerView.this.removeAllViews();
            }
            
            @Override
            public final void LIZJ(final int n) {
                final View liziz = this.LIZIZ(n);
                if (liziz != null) {
                    final ViewHolder lizj = RecyclerView.LIZJ(liziz);
                    if (lizj != null) {
                        if (lizj.isTmpDetached() && !lizj.shouldIgnore()) {
                            final StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                            sb.append(lizj);
                            sb.append(RecyclerView.this.LIZ());
                            throw new IllegalArgumentException(sb.toString());
                        }
                        lizj.addFlags(256);
                    }
                }
                RecyclerView.LIZ(RecyclerView.this, n);
            }
            
            @Override
            public final void LIZJ(final View view) {
                final ViewHolder lizj = RecyclerView.LIZJ(view);
                if (lizj != null) {
                    lizj.onEnteredHiddenState(RecyclerView.this);
                }
            }
            
            @Override
            public final void LIZLLL(final View view) {
                final ViewHolder lizj = RecyclerView.LIZJ(view);
                if (lizj != null) {
                    lizj.onLeftHiddenState(RecyclerView.this);
                }
            }
        });
        int importantForAutofill;
        if (Build$VERSION.SDK_INT >= 26) {
            importantForAutofill = ((View)this).getImportantForAutofill();
        }
        else {
            importantForAutofill = 0;
        }
        if (importantForAutofill == 0 && Build$VERSION.SDK_INT >= 26) {
            ((View)this).setImportantForAutofill(8);
        }
        if (((View)this).getImportantForAccessibility() == 0) {
            ((View)this).setImportantForAccessibility(1);
        }
        this.LJJJJZ = (AccessibilityManager)LIZ(this.getContext(), "accessibility");
        this.setAccessibilityDelegateCompat(new 17N(this));
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, new int[] { 16842948, 16842987, 16842993, 2130969557, 2130969558, 2130969559, 2130969560, 2130969561, 2130969781, 2130970828, 2130971008, 2130971085 }, n, 0);
        androidx.core.g.t.LIZ((View)this, context, new int[] { 16842948, 16842987, 16842993, 2130969557, 2130969558, 2130969559, 2130969560, 2130969561, 2130969781, 2130970828, 2130971008, 2130971085 }, set, obtainStyledAttributes, n);
        final String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            this.setDescendantFocusability(262144);
        }
        this.LJIIIZ = obtainStyledAttributes.getBoolean(1, true);
        final boolean boolean1 = obtainStyledAttributes.getBoolean(3, false);
        this.LJIJJ = boolean1;
        if (boolean1) {
            final StateListDrawable stateListDrawable = (StateListDrawable)obtainStyledAttributes.getDrawable(6);
            final Drawable drawable = obtainStyledAttributes.getDrawable(7);
            final StateListDrawable stateListDrawable2 = (StateListDrawable)obtainStyledAttributes.getDrawable(4);
            final Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                final StringBuilder sb = new StringBuilder("Trying to set fast scroller without both required drawables.");
                sb.append(this.LIZ());
                throw new IllegalArgumentException(sb.toString());
            }
            final Resources resources = this.getContext().getResources();
            new 17A(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(2131165625), resources.getDimensionPixelSize(2131165627), resources.getDimensionPixelOffset(2131165626));
        }
        obtainStyledAttributes.recycle();
        if (string != null) {
            String s = string.trim();
            if (!s.isEmpty()) {
                if (s.charAt(0) == '.') {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append(context.getPackageName());
                    sb2.append(s);
                    s = sb2.toString();
                }
                else if (!s.contains(".")) {
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append(RecyclerView.class.getPackage().getName());
                    sb3.append('.');
                    sb3.append(s);
                    s = sb3.toString();
                }
                try {
                    ClassLoader classLoader;
                    if (this.isInEditMode()) {
                        classLoader = this.getClass().getClassLoader();
                    }
                    else {
                        classLoader = context.getClassLoader();
                    }
                    final Class<? extends i> subclass = Class.forName(s, false, classLoader).asSubclass(i.class);
                    try {
                        final Constructor<? extends i> constructor = subclass.getConstructor(RecyclerView.LJJJJ);
                        final Object o = { context, set, n, 0 };
                    }
                    catch (final NoSuchMethodException o) {
                        try {
                            final Constructor<? extends i> constructor = subclass.getConstructor((Class<?>[])new Class[0]);
                            o = null;
                            constructor.setAccessible(true);
                            this.setLayoutManager((i)constructor.newInstance((Object[])o));
                        }
                        catch (final NoSuchMethodException ex) {
                            ex.initCause((Throwable)o);
                            final StringBuilder sb4 = new StringBuilder();
                            sb4.append(set.getPositionDescription());
                            sb4.append(": Error creating LayoutManager ");
                            sb4.append(s);
                            throw new IllegalStateException(sb4.toString(), ex);
                        }
                    }
                }
                catch (final ClassCastException ex2) {
                    final StringBuilder sb5 = new StringBuilder();
                    sb5.append(set.getPositionDescription());
                    sb5.append(": Class is not a LayoutManager ");
                    sb5.append(s);
                    throw new IllegalStateException(sb5.toString(), ex2);
                }
                catch (final IllegalAccessException ex3) {
                    final StringBuilder sb6 = new StringBuilder();
                    sb6.append(set.getPositionDescription());
                    sb6.append(": Cannot access non-public constructor ");
                    sb6.append(s);
                    throw new IllegalStateException(sb6.toString(), ex3);
                }
                catch (final InstantiationException ex4) {
                    final StringBuilder sb7 = new StringBuilder();
                    sb7.append(set.getPositionDescription());
                    sb7.append(": Could not instantiate the LayoutManager: ");
                    sb7.append(s);
                    throw new IllegalStateException(sb7.toString(), ex4);
                }
                catch (final InvocationTargetException ex5) {
                    final StringBuilder sb8 = new StringBuilder();
                    sb8.append(set.getPositionDescription());
                    sb8.append(": Could not instantiate the LayoutManager: ");
                    sb8.append(s);
                    throw new IllegalStateException(sb8.toString(), ex5);
                }
                catch (final ClassNotFoundException ex6) {
                    final StringBuilder sb9 = new StringBuilder();
                    sb9.append(set.getPositionDescription());
                    sb9.append(": Unable to find LayoutManager ");
                    sb9.append(s);
                    throw new IllegalStateException(sb9.toString(), ex6);
                }
            }
        }
        final int[] ljjj = RecyclerView.LJJJ;
        final TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(set, ljjj, n, 0);
        androidx.core.g.t.LIZ((View)this, context, ljjj, set, obtainStyledAttributes2, n);
        final boolean boolean2 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        this.setNestedScrollingEnabled(boolean2);
        this.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)new 0Qw());
    }
    
    public static Object LIZ(Context context, String declaredField) {
        Label_0166: {
            if (Build$VERSION.SDK_INT <= 27 && "clipboard".equals(declaredField)) {
                if (!2JT.LIZ) {
                    break Label_0166;
                }
                synchronized (ClipboardManager.class) {
                    final Object systemService = context.getSystemService((String)declaredField);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            declaredField = (Exception)ClipboardManager.class.getDeclaredField("mHandler");
                            ((AccessibleObject)declaredField).setAccessible(true);
                            ((Field)declaredField).set(systemService, new 2Lq((Handler)((Field)declaredField).get(systemService)));
                        }
                        catch (final Exception declaredField) {
                            6Nw.LIZ((Throwable)declaredField, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    2JT.LIZ = false;
                    return context;
                }
            }
            Label_0157: {
                if (2JT.LIZIZ || !"connectivity".equals(declaredField)) {
                    break Label_0157;
                }
                try {
                    new 6G9().LIZ();
                    2JT.LIZIZ = true;
                    context = (Context)context.getSystemService((String)declaredField);
                    return context;
                    context = (Context)context.getSystemService((String)declaredField);
                    return context;
                    context = (Context)context.getSystemService((String)declaredField);
                    return context;
                }
                finally {
                    return context.getSystemService((String)declaredField);
                }
            }
        }
    }
    
    private void LIZ(final float n, final float n2, final float n3, final float n4) {
        boolean b = false;
        Label_0037: {
            if (n2 < 0.0f) {
                this.LJIILLIIL();
                this.LJJJLZIJ.onPull(-n2 / this.getWidth(), 1.0f - n3 / this.getHeight());
            }
            else {
                if (n2 <= 0.0f) {
                    b = false;
                    break Label_0037;
                }
                this.LJIIZILJ();
                this.LJJL.onPull(n2 / this.getWidth(), n3 / this.getHeight());
            }
            b = true;
        }
        if (n4 < 0.0f) {
            this.LJIJ();
            this.LJJJZ.onPull(-n4 / this.getHeight(), n / this.getWidth());
        }
        else if (n4 > 0.0f) {
            this.LJIJI();
            this.LJJLI.onPull(n4 / this.getHeight(), 1.0f - n / this.getWidth());
        }
        else if (!b && n2 == 0.0f) {
            if (n4 == 0.0f) {
                return;
            }
        }
        ((View)this).postInvalidateOnAnimation();
    }
    
    private void LIZ(final long n, final ViewHolder viewHolder) {
        final int liz = this.LJII.LIZ();
        int i = 0;
        while (i < liz) {
            final ViewHolder lizj = LIZJ(this.LJII.LIZIZ(i));
            if (lizj != viewHolder && this.LJ(lizj) == n) {
                final a ljiiliil = this.LJIILIIL;
                if (ljiiliil != null && ljiiliil.mHasStableIds) {
                    final StringBuilder sb = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                    sb.append(lizj);
                    sb.append(" \n View Holder 2:");
                    sb.append(viewHolder);
                    sb.append(this.LIZ());
                    throw new IllegalStateException(sb.toString());
                }
                final StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                sb2.append(lizj);
                sb2.append(" \n View Holder 2:");
                sb2.append(viewHolder);
                sb2.append(this.LIZ());
                throw new IllegalStateException(sb2.toString());
            }
            else {
                ++i;
            }
        }
    }
    
    private void LIZ(final a ljiiliil, final boolean b, final boolean b2) {
        final a ljiiliil2 = this.LJIILIIL;
        if (ljiiliil2 != null) {
            ((a)ljiiliil2).unregisterAdapterDataObserver((c)this.LJJJJI);
            ((a)this.LJIILIIL).onDetachedFromRecyclerView(this);
        }
        if (!b || b2) {
            this.LIZIZ();
        }
        this.LJI.LIZ();
        final a ljiiliil3 = this.LJIILIIL;
        if ((this.LJIILIIL = ljiiliil) != null) {
            ((a)ljiiliil).registerAdapterDataObserver((c)this.LJJJJI);
            ((a)ljiiliil).onAttachedToRecyclerView(this);
        }
        final i ljiiljjil = this.LJIILJJIL;
        if (ljiiljjil != null) {
            ljiiljjil.LIZ(ljiiliil3, this.LJIILIIL);
        }
        this.LJ.LIZ(ljiiliil3, this.LJIILIIL, b);
        this.LJJIJ.LJFF = true;
    }
    
    public static void LIZ(final View view, final Rect rect) {
        final j j = (j)view.getLayoutParams();
        final Rect lizlll = j.LIZLLL;
        rect.set(view.getLeft() - lizlll.left - j.leftMargin, view.getTop() - lizlll.top - j.topMargin, view.getRight() + lizlll.right + j.rightMargin, view.getBottom() + lizlll.bottom + j.bottomMargin);
    }
    
    private void LIZ(final View view, final View view2) {
        View view3;
        if (view2 != null) {
            view3 = view2;
        }
        else {
            view3 = view;
        }
        this.LJIIJJI.set(0, 0, view3.getWidth(), view3.getHeight());
        final ViewGroup$LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof j) {
            final j j = (j)layoutParams;
            if (!j.LJ) {
                final Rect lizlll = j.LIZLLL;
                final Rect ljiijji = this.LJIIJJI;
                ljiijji.left -= lizlll.left;
                final Rect ljiijji2 = this.LJIIJJI;
                ljiijji2.right += lizlll.right;
                final Rect ljiijji3 = this.LJIIJJI;
                ljiijji3.top -= lizlll.top;
                final Rect ljiijji4 = this.LJIIJJI;
                ljiijji4.bottom += lizlll.bottom;
            }
        }
        if (view2 != null) {
            this.offsetDescendantRectToMyCoords(view2, this.LJIIJJI);
            this.offsetRectIntoDescendantCoords(view, this.LJIIJJI);
        }
        ((i)this.LJIILJJIL).LIZ(this, view, this.LJIIJJI, this.LJIJJLI ^ true, view2 == null);
    }
    
    private void LIZ(final ViewHolder mShadowingHolder, final ViewHolder mShadowedHolder, final RecyclerView.c c, final RecyclerView.c c2, final boolean b, final boolean b2) {
        mShadowingHolder.setIsRecyclable(false);
        if (b) {
            this.LIZ(mShadowingHolder);
        }
        if (mShadowingHolder != mShadowedHolder) {
            if (b2) {
                this.LIZ(mShadowedHolder);
            }
            mShadowingHolder.mShadowedHolder = mShadowedHolder;
            this.LIZ(mShadowingHolder);
            ((o)this.LJ).LIZIZ(mShadowingHolder);
            mShadowedHolder.setIsRecyclable(false);
            mShadowedHolder.mShadowingHolder = mShadowingHolder;
        }
        if (((f)this.LJJIIJ).LIZ(mShadowingHolder, mShadowedHolder, c, c2)) {
            this.LJIIJ();
        }
    }
    
    public static /* synthetic */ void LIZ(final RecyclerView recyclerView, final int n) {
        recyclerView.detachViewFromParent(n);
    }
    
    public static /* synthetic */ void LIZ(final RecyclerView recyclerView, final int n, final int n2) {
        recyclerView.setMeasuredDimension(n, n2);
    }
    
    public static /* synthetic */ void LIZ(final RecyclerView recyclerView, final View view, final int n, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        recyclerView.attachViewToParent(view, n, viewGroup$LayoutParams);
    }
    
    private void LIZ(final int[] array) {
        final int liz = this.LJII.LIZ();
        if (liz == 0) {
            array[1] = (array[0] = -1);
            return;
        }
        int n = Integer.MAX_VALUE;
        int n2 = Integer.MIN_VALUE;
        int n3;
        int n4;
        for (int i = 0; i < liz; ++i, n2 = n3, n = n4) {
            final ViewHolder lizj = LIZJ(this.LJII.LIZIZ(i));
            n3 = n2;
            n4 = n;
            if (!lizj.shouldIgnore()) {
                final int layoutPosition = lizj.getLayoutPosition();
                int n5;
                if (layoutPosition < (n5 = n)) {
                    n5 = layoutPosition;
                }
                n3 = n2;
                n4 = n5;
                if (layoutPosition > n2) {
                    n3 = layoutPosition;
                    n4 = n5;
                }
            }
        }
        array[0] = n;
        array[1] = n2;
    }
    
    private boolean LIZ(final int n, final int n2, final MotionEvent motionEvent, int n3) {
        this.LJ();
        int n4;
        int n5;
        int n6;
        int n7;
        if (this.LJIILIIL != null) {
            final int[] ljjijlij = this.LJJIJLIJ;
            ljjijlij[1] = (ljjijlij[0] = 0);
            this.LIZ(n, n2, ljjijlij);
            final int[] ljjijlij2 = this.LJJIJLIJ;
            n4 = ljjijlij2[0];
            n5 = ljjijlij2[1];
            n6 = n - n4;
            n7 = n2 - n5;
        }
        else {
            n5 = 0;
            n4 = 0;
            n6 = 0;
            n7 = 0;
        }
        if (!this.LJIIZILJ.isEmpty()) {
            this.invalidate();
        }
        final int[] ljjijlij3 = this.LJJIJLIJ;
        ljjijlij3[1] = (ljjijlij3[0] = 0);
        this.LIZ(n4, n5, n6, n7, this.LJLIL, n3, ljjijlij3);
        final int[] ljjijlij4 = this.LJJIJLIJ;
        final int n8 = ljjijlij4[0];
        final int n9 = ljjijlij4[1];
        if (ljjijlij4[0] != 0 || ljjijlij4[1] != 0) {
            n3 = 1;
        }
        else {
            n3 = 0;
        }
        final int ljjliiijl = this.LJJLIIIJL;
        final int[] ljlil = this.LJLIL;
        this.LJJLIIIJL = ljjliiijl - ljlil[0];
        this.LJJLIIIJLJLI -= ljlil[1];
        final int[] ljlillllzi = this.LJLILLLLZI;
        ljlillllzi[0] += ljlil[0];
        ljlillllzi[1] += ljlil[1];
        if (this.getOverScrollMode() != 2) {
            if (motionEvent != null && !080.LIZ(motionEvent)) {
                this.LIZ(motionEvent.getX(), (float)(n6 - n8), motionEvent.getY(), (float)(n7 - n9));
            }
            this.LIZJ(n, n2);
        }
        if (n4 != 0 || n5 != 0) {
            this.LJFF(n4, n5);
        }
        if (!this.awakenScrollBars()) {
            this.invalidate();
        }
        return n3 != 0 || n4 != 0 || n5 != 0;
    }
    
    private boolean LIZ(final MotionEvent motionEvent) {
        final int action = motionEvent.getAction();
        for (int size = this.LJJJJJ.size(), i = 0; i < size; ++i) {
            final RecyclerView.m ljjjjjl = this.LJJJJJ.get(i);
            if (ljjjjjl.LIZ(this, motionEvent) && action != 3) {
                this.LJJJJJL = ljjjjjl;
                return true;
            }
        }
        return false;
    }
    
    private void LIZIZ(final MotionEvent motionEvent) {
        final int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.LJJLIIIJ) {
            int n;
            if (actionIndex == 0) {
                n = 1;
            }
            else {
                n = 0;
            }
            this.LJJLIIIJ = motionEvent.getPointerId(n);
            final int n2 = (int)(motionEvent.getX(n) + 0.5f);
            this.LJJLIIIJL = n2;
            this.LJJLIIIJJI = n2;
            final int n3 = (int)(motionEvent.getY(n) + 0.5f);
            this.LJJLIIIJLJLI = n3;
            this.LJJLIIIJJIZ = n3;
        }
    }
    
    public static ViewHolder LIZJ(final View view) {
        if (view == null) {
            return null;
        }
        return ((j)view.getLayoutParams()).LIZJ;
    }
    
    public static void LIZJ(final ViewHolder viewHolder) {
        if (viewHolder.mNestedRecyclerView != null) {
            ViewParent parent;
            for (View view = viewHolder.mNestedRecyclerView.get(); view != null; view = (View)parent) {
                if (view == viewHolder.itemView) {
                    return;
                }
                parent = view.getParent();
                if (!(parent instanceof View)) {
                    break;
                }
            }
            viewHolder.mNestedRecyclerView = null;
        }
    }
    
    private long LJ(final ViewHolder viewHolder) {
        if (this.LJIILIIL.mHasStableIds) {
            return viewHolder.getItemId();
        }
        return viewHolder.mPosition;
    }
    
    public static RecyclerView LJI(final View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView)view;
        }
        final ViewGroup viewGroup = (ViewGroup)view;
        for (int childCount = viewGroup.getChildCount(), i = 0; i < childCount; ++i) {
            final RecyclerView lji = LJI(viewGroup.getChildAt(i));
            if (lji != null) {
                return lji;
            }
        }
        return null;
    }
    
    private boolean LJI(final int n, final int n2) {
        this.LIZ(this.LJLIIIL);
        final int[] ljliiil = this.LJLIIIL;
        return ljliiil[0] != n || ljliiil[1] != n2;
    }
    
    private boolean LJII(final int n, final int n2) {
        return this.getScrollingChildHelper().LIZ(n, n2);
    }
    
    private void LJIILJJIL() {
        this.LJJIIJZLJL.LIZIZ();
        final i ljiiljjil = this.LJIILJJIL;
        if (ljiiljjil != null) {
            ((i)ljiiljjil).LJJIIZ();
        }
    }
    
    private void LJIILL() {
        final EdgeEffect ljjjlzij = this.LJJJLZIJ;
        int finished;
        if (ljjjlzij != null) {
            ljjjlzij.onRelease();
            finished = (this.LJJJLZIJ.isFinished() ? 1 : 0);
        }
        else {
            finished = 0;
        }
        final EdgeEffect ljjjz = this.LJJJZ;
        int n = finished;
        if (ljjjz != null) {
            ljjjz.onRelease();
            n = (finished | (this.LJJJZ.isFinished() ? 1 : 0));
        }
        final EdgeEffect ljjl = this.LJJL;
        int n2 = n;
        if (ljjl != null) {
            ljjl.onRelease();
            n2 = (n | (this.LJJL.isFinished() ? 1 : 0));
        }
        final EdgeEffect ljjli = this.LJJLI;
        int n3 = n2;
        if (ljjli != null) {
            ljjli.onRelease();
            n3 = (n2 | (this.LJJLI.isFinished() ? 1 : 0));
        }
        if (n3 != 0) {
            ((View)this).postInvalidateOnAnimation();
        }
    }
    
    private void LJIILLIIL() {
        if (this.LJJJLZIJ != null) {
            return;
        }
        final EdgeEffect liz = this.LJJJLL.LIZ(this);
        this.LJJJLZIJ = liz;
        if (this.LJIIIZ) {
            liz.setSize(this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom(), this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight());
            return;
        }
        liz.setSize(this.getMeasuredHeight(), this.getMeasuredWidth());
    }
    
    private void LJIIZILJ() {
        if (this.LJJL != null) {
            return;
        }
        final EdgeEffect liz = this.LJJJLL.LIZ(this);
        this.LJJL = liz;
        if (this.LJIIIZ) {
            liz.setSize(this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom(), this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight());
            return;
        }
        liz.setSize(this.getMeasuredHeight(), this.getMeasuredWidth());
    }
    
    private void LJIJ() {
        if (this.LJJJZ != null) {
            return;
        }
        final EdgeEffect liz = this.LJJJLL.LIZ(this);
        this.LJJJZ = liz;
        if (this.LJIIIZ) {
            liz.setSize(this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight(), this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom());
            return;
        }
        liz.setSize(this.getMeasuredWidth(), this.getMeasuredHeight());
    }
    
    private void LJIJI() {
        if (this.LJJLI != null) {
            return;
        }
        final EdgeEffect liz = this.LJJJLL.LIZ(this);
        this.LJJLI = liz;
        if (this.LJIIIZ) {
            liz.setSize(this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight(), this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom());
            return;
        }
        liz.setSize(this.getMeasuredWidth(), this.getMeasuredHeight());
    }
    
    private void LJIJJ() {
        this.LJJLI = null;
        this.LJJJZ = null;
        this.LJJL = null;
        this.LJJJLZIJ = null;
    }
    
    private void LJIJJLI() {
        final VelocityTracker ljjliiijillizjl = this.LJJLIIIJILLIZJL;
        if (ljjliiijillizjl != null) {
            ljjliiijillizjl.clear();
        }
        this.LIZ(0);
        this.LJIILL();
    }
    
    private void LJIL() {
        this.LJIJJLI();
        this.setScrollState(0);
    }
    
    private void LJJ() {
        final int ljjjjll = this.LJJJJLL;
        this.LJJJJLL = 0;
        if (ljjjjll != 0 && this.LJIIIIZZ()) {
            final AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            obtain.setContentChangeTypes(ljjjjll);
            this.sendAccessibilityEventUnchecked(obtain);
        }
    }
    
    private boolean LJJI() {
        return this.LJJIIJ != null && ((i)this.LJIILJJIL).al_();
    }
    
    private void LJJIFFI() {
        if (this.LJJII) {
            this.LJI.LIZ();
            if (this.LJJIII) {
                ((i)this.LJIILJJIL).am_();
            }
        }
        if (this.LJJI()) {
            this.LJI.LIZIZ();
        }
        else {
            this.LJI.LJ();
        }
        final boolean ljjijiiji = this.LJJIJIIJI;
        final boolean b = false;
        boolean b2;
        if (ljjijiiji || this.LJJIJIIJIL) {
            b2 = true;
        }
        else {
            b2 = false;
        }
        this.LJJIJ.LJIIIZ = (this.LJIJJLI && this.LJJIIJ != null && (this.LJJII || b2 || this.LJIILJJIL.LJJII) && (!this.LJJII || this.LJIILIIL.mHasStableIds));
        final t ljjij = this.LJJIJ;
        boolean ljiij = b;
        if (ljjij.LJIIIZ) {
            ljiij = b;
            if (b2) {
                ljiij = b;
                if (!this.LJJII) {
                    ljiij = b;
                    if (this.LJJI()) {
                        ljiij = true;
                    }
                }
            }
        }
        ljjij.LJIIJ = ljiij;
    }
    
    private void LJJII() {
        if (this.LJIILIIL == null) {
            return;
        }
        if (this.LJIILJJIL == null) {
            return;
        }
        this.LJJIJ.LJIIIIZZ = false;
        boolean b;
        if (this.LJLJJI && (this.LJLJJL != this.getWidth() || this.LJLJJLL != this.getHeight())) {
            b = true;
        }
        else {
            b = false;
        }
        this.LJLJJL = 0;
        this.LJLJJLL = 0;
        this.LJLJJI = false;
        if (this.LJJIJ.LIZLLL == 1) {
            this.LJJIIZI();
            ((i)this.LJIILJJIL).LIZLLL(this);
            this.LJJIJ();
        }
        else if (this.LJI.LJFF() || b || this.LJIILJJIL.LJJIJIL != this.getWidth() || this.LJIILJJIL.LJJIJL != this.getHeight()) {
            ((i)this.LJIILJJIL).LIZLLL(this);
            this.LJJIJ();
        }
        else {
            ((i)this.LJIILJJIL).LIZLLL(this);
        }
        this.LJJIJIIJI();
    }
    
    private void LJJIII() {
        if (this.LJJZ && this.hasFocus() && this.LJIILIIL != null) {
            final View focusedChild = this.getFocusedChild();
            if (focusedChild != null) {
                final View liziz = this.LIZIZ(focusedChild);
                if (liziz != null) {
                    final ViewHolder liz = this.LIZ(liziz);
                    if (liz != null) {
                        final t ljjij = this.LJJIJ;
                        long itemId;
                        if (this.LJIILIIL.mHasStableIds) {
                            itemId = liz.getItemId();
                        }
                        else {
                            itemId = -1L;
                        }
                        ljjij.LJIIL = itemId;
                        final t ljjij2 = this.LJJIJ;
                        int ljiijji;
                        if (this.LJJII) {
                            ljiijji = -1;
                        }
                        else if (liz.isRemoved()) {
                            ljiijji = liz.mOldPosition;
                        }
                        else {
                            ljiijji = liz.getAbsoluteAdapterPosition();
                        }
                        ljjij2.LJIIJJI = ljiijji;
                        final t ljjij3 = this.LJJIJ;
                        View view = liz.itemView;
                        int ljiiliil = view.getId();
                        while (!view.isFocused() && view instanceof ViewGroup && view.hasFocus()) {
                            final View view2 = view = ((ViewGroup)view).getFocusedChild();
                            if (view2.getId() != -1) {
                                ljiiliil = view2.getId();
                                view = view2;
                            }
                        }
                        ljjij3.LJIILIIL = ljiiliil;
                        return;
                    }
                }
            }
        }
        this.LJJIIJ();
    }
    
    private void LJJIIJ() {
        this.LJJIJ.LJIIL = -1L;
        this.LJJIJ.LJIIJJI = -1;
        this.LJJIJ.LJIILIIL = -1;
    }
    
    private void LJJIIJZLJL() {
        if (this.LJJZ && this.LJIILIIL != null && this.hasFocus() && this.getDescendantFocusability() != 393216 && (this.getDescendantFocusability() != 131072 || !this.isFocused())) {
            if (!this.isFocused()) {
                final View focusedChild = this.getFocusedChild();
                if (RecyclerView.LJJJIL && (focusedChild.getParent() == null || !focusedChild.hasFocus())) {
                    if (this.LJII.LIZ() == 0) {
                        this.requestFocus();
                        return;
                    }
                }
                else if (!this.LJII.LIZLLL(focusedChild)) {
                    return;
                }
            }
            final long ljiil = this.LJJIJ.LJIIL;
            final int n = 0;
            ViewHolder viewHolder = null;
            View view = null;
            Label_0247: {
                Label_0167: {
                    if (ljiil != -1L && this.LJIILIIL.mHasStableIds) {
                        final long ljiil2 = this.LJJIJ.LJIIL;
                        final a ljiiliil = this.LJIILIIL;
                        if (ljiiliil != null && ljiiliil.mHasStableIds) {
                            while (true) {
                                ViewHolder viewHolder2;
                                for (int liziz = this.LJII.LIZIZ(), i = 0; i < liziz; ++i, viewHolder = viewHolder2) {
                                    final ViewHolder lizj = LIZJ(this.LJII.LIZJ(i));
                                    viewHolder2 = viewHolder;
                                    if (lizj != null) {
                                        viewHolder2 = viewHolder;
                                        if (!lizj.isRemoved()) {
                                            viewHolder2 = viewHolder;
                                            if (lizj.getItemId() == ljiil2) {
                                                if (this.LJII.LIZLLL(lizj.itemView)) {
                                                    viewHolder2 = lizj;
                                                }
                                                else {
                                                    viewHolder = lizj;
                                                    if (this.LJII.LIZLLL(viewHolder.itemView)) {
                                                        break Label_0167;
                                                    }
                                                    if (!viewHolder.itemView.hasFocusable()) {
                                                        break Label_0167;
                                                    }
                                                    view = viewHolder.itemView;
                                                    break Label_0247;
                                                }
                                            }
                                        }
                                    }
                                }
                                if (viewHolder != null) {
                                    continue;
                                }
                                break;
                            }
                        }
                    }
                }
                if (this.LJII.LIZ() > 0) {
                    int ljiijji = n;
                    if (this.LJJIJ.LJIIJJI != -1) {
                        ljiijji = this.LJJIJ.LJIIJJI;
                    }
                    final int liz = ((t)this.LJJIJ).LIZ();
                    for (int j = ljiijji; j < liz; ++j) {
                        final ViewHolder lji = this.LJI(j);
                        if (lji == null) {
                            break;
                        }
                        if (lji.itemView.hasFocusable()) {
                            view = lji.itemView;
                            break Label_0247;
                        }
                    }
                    for (int k = Math.min(liz, ljiijji) - 1; k >= 0; --k) {
                        final ViewHolder lji2 = this.LJI(k);
                        if (lji2 == null) {
                            break;
                        }
                        if (lji2.itemView.hasFocusable()) {
                            view = lji2.itemView;
                            break Label_0247;
                        }
                    }
                    return;
                }
                return;
            }
            if (view != null) {
                View view2 = view;
                if (this.LJJIJ.LJIILIIL != -1L) {
                    final View viewById = view.findViewById(this.LJJIJ.LJIILIIL);
                    view2 = view;
                    if (viewById != null) {
                        view2 = view;
                        if (viewById.isFocusable()) {
                            view2 = viewById;
                        }
                    }
                }
                view2.requestFocus();
            }
        }
    }
    
    private void LJJIIZ() {
        if (this.getScrollState() == 2) {
            final OverScroller lizj = this.LJJIIJZLJL.LIZJ;
            lizj.getFinalX();
            lizj.getCurrX();
            lizj.getFinalY();
            lizj.getCurrY();
        }
    }
    
    private void LJJIIZI() {
        ((t)this.LJJIJ).LIZ(1);
        this.LJJIIZ();
        this.LJJIJ.LJIIIIZZ = false;
        this.LJFF();
        this.LJIIIIZZ.LIZ();
        this.LJII();
        this.LJJIFFI();
        this.LJJIII();
        final t ljjij = this.LJJIJ;
        ljjij.LJII = (ljjij.LJIIIZ && this.LJJIJIIJIL);
        this.LJJIJIIJIL = false;
        this.LJJIJIIJI = false;
        final t ljjij2 = this.LJJIJ;
        ljjij2.LJI = ljjij2.LJIIJ;
        this.LJJIJ.LJ = ((a)this.LJIILIIL).getItemCount();
        this.LIZ(this.LJLIIIL);
        if (this.LJJIJ.LJIIIZ) {
            for (int liz = this.LJII.LIZ(), i = 0; i < liz; ++i) {
                final ViewHolder lizj = LIZJ(this.LJII.LIZIZ(i));
                if (!lizj.shouldIgnore() && (!lizj.isInvalid() || this.LJIILIIL.mHasStableIds)) {
                    final f ljjiij = this.LJJIIJ;
                    f.LJFF(lizj);
                    lizj.getUnmodifiedPayloads();
                    this.LJIIIIZZ.LIZ(lizj, ((f)ljjiij).LIZLLL(lizj));
                    if (this.LJJIJ.LJII && lizj.isUpdated() && !lizj.isRemoved() && !lizj.shouldIgnore() && !lizj.isInvalid()) {
                        this.LJIIIIZZ.LIZ(this.LJ(lizj), lizj);
                    }
                }
            }
        }
        if (this.LJJIJ.LJIIJ) {
            this.LJJIJIL();
            final boolean ljff = this.LJJIJ.LJFF;
            this.LJJIJ.LJFF = false;
            this.LJIILJJIL.LIZJ(this.LJ, this.LJJIJ);
            this.LJJIJ.LJFF = ljff;
            for (int j = 0; j < this.LJII.LIZ(); ++j) {
                final ViewHolder lizj2 = LIZJ(this.LJII.LIZIZ(j));
                if (!lizj2.shouldIgnore() && !this.LJIIIIZZ.LIZIZ(lizj2)) {
                    f.LJFF(lizj2);
                    final boolean hasAnyOfTheFlags = lizj2.hasAnyOfTheFlags(8192);
                    final f ljjiij2 = this.LJJIIJ;
                    lizj2.getUnmodifiedPayloads();
                    final f.c lizlll = ((f)ljjiij2).LIZLLL(lizj2);
                    if (hasAnyOfTheFlags) {
                        this.LIZ(lizj2, lizlll);
                    }
                    else {
                        this.LJIIIIZZ.LIZIZ(lizj2, lizlll);
                    }
                }
            }
            this.LJJIJL();
        }
        else {
            this.LJJIJL();
        }
        this.LIZIZ(true);
        this.LIZ(false);
        this.LJJIJ.LIZLLL = 2;
    }
    
    private void LJJIJ() {
        this.LJFF();
        this.LJII();
        ((t)this.LJJIJ).LIZ(6);
        this.LJI.LJ();
        this.LJJIJ.LJ = ((a)this.LJIILIIL).getItemCount();
        this.LJJIJ.LIZJ = 0;
        if (this.LJFF != null && ((a)this.LJIILIIL).canRestoreState()) {
            if (this.LJFF.LIZ != null) {
                ((i)this.LJIILJJIL).LIZ(this.LJFF.LIZ);
            }
            this.LJFF = null;
        }
        this.LJJIJ.LJI = false;
        this.LJIILJJIL.LIZJ(this.LJ, this.LJJIJ);
        this.LJJIJ.LJFF = false;
        final t ljjij = this.LJJIJ;
        ljjij.LJIIIZ = (ljjij.LJIIIZ && this.LJJIIJ != null);
        this.LJJIJ.LIZLLL = 4;
        this.LIZIZ(true);
        this.LIZ(false);
    }
    
    private void LJJIJIIJI() {
        ((t)this.LJJIJ).LIZ(4);
        this.LJFF();
        this.LJII();
        this.LJJIJ.LIZLLL = 1;
        if (this.LJJIJ.LJIIIZ) {
            for (int i = this.LJII.LIZ() - 1; i >= 0; --i) {
                final ViewHolder lizj = LIZJ(this.LJII.LIZIZ(i));
                if (!lizj.shouldIgnore()) {
                    final long lj = this.LJ(lizj);
                    final f.c lj2 = ((f)this.LJJIIJ).LJ(lizj);
                    final ViewHolder liz = this.LJIIIIZZ.LIZ(lj);
                    if (liz != null && !liz.shouldIgnore()) {
                        final boolean liz2 = this.LJIIIIZZ.LIZ(liz);
                        final boolean liz3 = this.LJIIIIZZ.LIZ(lizj);
                        if (!liz2 || liz != lizj) {
                            final RecyclerView.c liz4 = this.LJIIIIZZ.LIZ(liz, 4);
                            this.LJIIIIZZ.LIZJ(lizj, lj2);
                            final RecyclerView.c liz5 = this.LJIIIIZZ.LIZ(lizj, 8);
                            if (liz4 == null) {
                                this.LIZ(lj, lizj);
                                continue;
                            }
                            this.LIZ(liz, lizj, liz4, liz5, liz2, liz3);
                            continue;
                        }
                    }
                    this.LJIIIIZZ.LIZJ(lizj, lj2);
                }
            }
            this.LJIIIIZZ.LIZ(this.LJLJL);
        }
        this.LJIILJJIL.LIZIZ(this.LJ);
        final t ljjij = this.LJJIJ;
        ljjij.LIZIZ = ljjij.LJ;
        this.LJJII = false;
        this.LJJIII = false;
        this.LJJIJ.LJIIIZ = false;
        this.LJJIJ.LJIIJ = false;
        this.LJIILJJIL.LJJII = false;
        if (this.LJ.LIZIZ != null) {
            this.LJ.LIZIZ.clear();
        }
        if (this.LJIILJJIL.LJJIJ) {
            this.LJIILJJIL.LJJIIZI = 0;
            this.LJIILJJIL.LJJIJ = false;
            ((o)this.LJ).LIZIZ();
        }
        this.LJIILJJIL.LIZ(this.LJJIJ);
        this.LIZIZ(true);
        this.LIZ(false);
        this.LJIIIIZZ.LIZ();
        final int[] ljliiil = this.LJLIIIL;
        if (this.LJI(ljliiil[0], ljliiil[1])) {
            this.LJFF(0, 0);
        }
        this.LJJIIJZLJL();
        this.LJJIIJ();
    }
    
    private void LJJIJIIJIL() {
        for (int liziz = this.LJII.LIZIZ(), i = 0; i < liziz; ++i) {
            ((j)this.LJII.LIZJ(i).getLayoutParams()).LJ = true;
        }
        ((o)this.LJ).LJFF();
    }
    
    private void LJJIJIL() {
        for (int liziz = this.LJII.LIZIZ(), i = 0; i < liziz; ++i) {
            final ViewHolder lizj = LIZJ(this.LJII.LIZJ(i));
            if (!lizj.shouldIgnore()) {
                lizj.saveOldPosition();
            }
        }
    }
    
    private void LJJIJL() {
        for (int liziz = this.LJII.LIZIZ(), i = 0; i < liziz; ++i) {
            final ViewHolder lizj = LIZJ(this.LJII.LIZJ(i));
            if (!lizj.shouldIgnore()) {
                lizj.clearOldPosition();
            }
        }
        ((o)this.LJ).LJ();
    }
    
    private void LJJIJLIJ() {
        for (int liziz = this.LJII.LIZIZ(), i = 0; i < liziz; ++i) {
            final ViewHolder lizj = LIZJ(this.LJII.LIZJ(i));
            if (lizj != null && !lizj.shouldIgnore()) {
                lizj.addFlags(6);
            }
        }
        this.LJJIJIIJIL();
        ((o)this.LJ).LIZLLL();
    }
    
    private void LJJIL() {
        for (int i = this.LJJIL.size() - 1; i >= 0; --i) {
            final ViewHolder viewHolder = this.LJJIL.get(i);
            if (viewHolder.itemView.getParent() == this && !viewHolder.shouldIgnore()) {
                final int mPendingAccessibilityState = viewHolder.mPendingAccessibilityState;
                if (mPendingAccessibilityState != -1) {
                    viewHolder.itemView.setImportantForAccessibility(mPendingAccessibilityState);
                    viewHolder.mPendingAccessibilityState = -1;
                }
            }
        }
        this.LJJIL.clear();
    }
    
    private 082 getScrollingChildHelper() {
        if (this.LJLIIL == null) {
            this.LJLIIL = new 082((View)this);
        }
        return this.LJLIIL;
    }
    
    public final View LIZ(final float n, final float n2) {
        for (int i = this.LJII.LIZ() - 1; i >= 0; --i) {
            final View liziz = this.LJII.LIZIZ(i);
            final float translationX = liziz.getTranslationX();
            final float translationY = liziz.getTranslationY();
            if (n >= liziz.getLeft() + translationX && n <= liziz.getRight() + translationX && n2 >= liziz.getTop() + translationY && n2 <= liziz.getBottom() + translationY) {
                return liziz;
            }
        }
        return null;
    }
    
    public final ViewHolder LIZ(final int n, final boolean b) {
        final int liziz = this.LJII.LIZIZ();
        ViewHolder viewHolder = null;
        ViewHolder viewHolder2;
        for (int i = 0; i < liziz; ++i, viewHolder = viewHolder2) {
            final ViewHolder lizj = LIZJ(this.LJII.LIZJ(i));
            viewHolder2 = viewHolder;
            if (lizj != null) {
                viewHolder2 = viewHolder;
                if (!lizj.isRemoved()) {
                    if (b) {
                        if (lizj.mPosition != n) {
                            viewHolder2 = viewHolder;
                            continue;
                        }
                    }
                    else {
                        viewHolder2 = viewHolder;
                        if (lizj.getLayoutPosition() != n) {
                            continue;
                        }
                    }
                    if (!this.LJII.LIZLLL(lizj.itemView)) {
                        return lizj;
                    }
                    viewHolder2 = lizj;
                }
            }
        }
        return viewHolder;
    }
    
    public final ViewHolder LIZ(final View view) {
        final ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return LIZJ(view);
        }
        final StringBuilder sb = new StringBuilder("View ");
        sb.append(view);
        sb.append(" is not a direct child of ");
        sb.append(this);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final String LIZ() {
        final StringBuilder sb = new StringBuilder(" ");
        sb.append(super.toString());
        sb.append(", adapter:");
        sb.append(this.LJIILIIL);
        sb.append(", layout:");
        sb.append(this.LJIILJJIL);
        sb.append(", context:");
        sb.append(this.getContext());
        return sb.toString();
    }
    
    public final void LIZ(final int n) {
        this.getScrollingChildHelper().LIZIZ(n);
    }
    
    public final void LIZ(final int n, final int n2) {
        this.LIZ(n, n2, false);
    }
    
    public final void LIZ(final int n, final int n2, final int n3, final int n4, final int[] array, final int n5, final int[] array2) {
        this.getScrollingChildHelper().LIZ(n, n2, n3, n4, array, n5, array2);
    }
    
    public final void LIZ(int n, int n2, final boolean b) {
        final i ljiiljjil = this.LJIILJJIL;
        if (ljiiljjil == null) {
            return;
        }
        if (this.LJJ) {
            return;
        }
        final boolean ljff = ((i)ljiiljjil).LJFF();
        final int n3 = 0;
        int n4 = n;
        if (!ljff) {
            n4 = 0;
        }
        if (!((i)this.LJIILJJIL).LJI()) {
            n2 = 0;
        }
        if (n4 != 0 || n2 != 0) {
            if (b) {
                n = n3;
                if (n4 != 0) {
                    n = 1;
                }
                int n5 = n;
                if (n2 != 0) {
                    n5 = (n | 0x2);
                }
                this.LJII(n5, 1);
            }
            this.LJJIIJZLJL.LIZ(n4, n2, Integer.MIN_VALUE, null);
        }
    }
    
    public final void LIZ(int liz, int liziz, final int[] array) {
        this.LJFF();
        this.LJII();
        Trace.beginSection("RV Scroll");
        this.LJJIIZ();
        if (liz != 0) {
            liz = this.LJIILJJIL.LIZ(liz, this.LJ, this.LJJIJ);
        }
        else {
            liz = 0;
        }
        if (liziz != 0) {
            liziz = this.LJIILJJIL.LIZIZ(liziz, this.LJ, this.LJJIJ);
        }
        else {
            liziz = 0;
        }
        Trace.endSection();
        for (int liz2 = this.LJII.LIZ(), i = 0; i < liz2; ++i) {
            final View liziz2 = this.LJII.LIZIZ(i);
            final ViewHolder liz3 = this.LIZ(liziz2);
            if (liz3 != null && liz3.mShadowingHolder != null) {
                final View itemView = liz3.mShadowingHolder.itemView;
                final int left = liziz2.getLeft();
                final int top = liziz2.getTop();
                if (left != itemView.getLeft() || top != itemView.getTop()) {
                    itemView.layout(left, top, itemView.getWidth() + left, itemView.getHeight() + top);
                }
            }
        }
        this.LIZIZ(true);
        this.LIZ(false);
        if (array != null) {
            array[0] = liz;
            array[1] = liziz;
        }
    }
    
    public void LIZ(final a a, final boolean b) {
        this.setLayoutFrozen(false);
        this.LIZ(a, true, b);
        this.LIZJ(true);
        this.requestLayout();
    }
    
    public final void LIZ(final RecyclerView.h h) {
        final i ljiiljjil = this.LJIILJJIL;
        if (ljiiljjil != null) {
            ((i)ljiiljjil).LIZ("Cannot add item decoration during a scroll  or layout");
        }
        if (this.LJIIZILJ.isEmpty()) {
            this.setWillNotDraw(false);
        }
        this.LJIIZILJ.add(h);
        this.LJJIJIIJIL();
        this.requestLayout();
    }
    
    public final void LIZ(final k k) {
        if (this.LJJIFFI == null) {
            this.LJJIFFI = new ArrayList<k>();
        }
        this.LJJIFFI.add(k);
    }
    
    public final void LIZ(final RecyclerView.m m) {
        this.LJJJJJ.add(m);
    }
    
    public final void LIZ(final RecyclerView.n n) {
        if (this.LJJZZIII == null) {
            this.LJJZZIII = new ArrayList<RecyclerView.n>();
        }
        this.LJJZZIII.add(n);
    }
    
    public final void LIZ(final ViewHolder viewHolder) {
        final View itemView = viewHolder.itemView;
        final boolean b = itemView.getParent() == this;
        ((o)this.LJ).LIZIZ(this.LIZ(itemView));
        if (viewHolder.isTmpDetached()) {
            this.LJII.LIZ(itemView, -1, itemView.getLayoutParams(), true);
            return;
        }
        if (!b) {
            this.LJII.LIZ(itemView, -1, true);
            return;
        }
        final 0Ey ljii = this.LJII;
        final int liz = ljii.LIZ.LIZ(itemView);
        if (liz >= 0) {
            ljii.LIZIZ.LIZ(liz);
            ljii.LIZ(itemView);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide ".concat(String.valueOf(itemView)));
    }
    
    public final void LIZ(final ViewHolder viewHolder, final RecyclerView.c c) {
        viewHolder.setFlags(0, 8192);
        if (this.LJJIJ.LJII && viewHolder.isUpdated() && !viewHolder.isRemoved() && !viewHolder.shouldIgnore()) {
            this.LJIIIIZZ.LIZ(this.LJ(viewHolder), viewHolder);
        }
        this.LJIIIIZZ.LIZ(viewHolder, c);
    }
    
    public final void LIZ(final String s) {
        if (!this.LJIIIZ()) {
            return;
        }
        if (s == null) {
            final StringBuilder sb = new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling");
            sb.append(this.LIZ());
            throw new IllegalStateException(sb.toString());
        }
        throw new IllegalStateException(s);
    }
    
    public final void LIZ(final boolean b) {
        if (this.LJJJJL <= 0) {
            this.LJJJJL = 1;
        }
        if (!b && !this.LJJ) {
            this.LJIL = false;
        }
        if (this.LJJJJL == 1) {
            if (b && this.LJIL && !this.LJJ && this.LJIILJJIL != null && this.LJIILIIL != null) {
                this.LJJII();
            }
            if (!this.LJJ) {
                this.LJIL = false;
            }
        }
        --this.LJJJJL;
    }
    
    public boolean LIZ(final int n, final int n2, final int[] array, final int[] array2, final int n3) {
        return this.getScrollingChildHelper().LIZ(n, n2, array, array2, n3);
    }
    
    public final boolean LIZ(final ViewHolder viewHolder, final int n) {
        if (this.LJIIIZ()) {
            viewHolder.mPendingAccessibilityState = n;
            this.LJJIL.add(viewHolder);
            return false;
        }
        viewHolder.itemView.setImportantForAccessibility(n);
        return true;
    }
    
    public final View LIZIZ(View view) {
        ViewParent viewParent;
        for (viewParent = view.getParent(); viewParent != null && viewParent != this && viewParent instanceof View; viewParent = view.getParent()) {
            view = (View)viewParent;
        }
        if (viewParent == this) {
            return view;
        }
        return null;
    }
    
    public final void LIZIZ() {
        final f ljjiij = this.LJJIIJ;
        if (ljjiij != null) {
            ((f)ljjiij).LIZLLL();
        }
        final i ljiiljjil = this.LJIILJJIL;
        if (ljiiljjil != null) {
            ljiiljjil.LIZJ(this.LJ);
            this.LJIILJJIL.LIZIZ(this.LJ);
        }
        ((o)this.LJ).LIZ();
    }
    
    public final void LIZIZ(final int n) {
        final int itemDecorationCount = this.getItemDecorationCount();
        if (n < 0 || n >= itemDecorationCount) {
            final StringBuilder sb = new StringBuilder();
            sb.append(n);
            sb.append(" is an invalid index for size ");
            sb.append(itemDecorationCount);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        final int itemDecorationCount2 = this.getItemDecorationCount();
        if (n < itemDecorationCount2) {
            this.LIZJ(this.LJIIZILJ.get(n));
            return;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(n);
        sb2.append(" is an invalid index for size ");
        sb2.append(itemDecorationCount2);
        throw new IndexOutOfBoundsException(sb2.toString());
    }
    
    public final void LIZIZ(final int n, final int n2, final boolean b) {
        final int n3 = n + n2;
        for (int liziz = this.LJII.LIZIZ(), i = 0; i < liziz; ++i) {
            final ViewHolder lizj = LIZJ(this.LJII.LIZJ(i));
            if (lizj != null && !lizj.shouldIgnore()) {
                if (lizj.mPosition >= n3) {
                    lizj.offsetPosition(-n2, b);
                    this.LJJIJ.LJFF = true;
                }
                else if (lizj.mPosition >= n) {
                    lizj.flagRemovedAndOffsetPosition(n - 1, -n2, b);
                    this.LJJIJ.LJFF = true;
                }
            }
        }
        final o lj = this.LJ;
        for (int j = lj.LIZJ.size() - 1; j >= 0; --j) {
            final ViewHolder viewHolder = lj.LIZJ.get(j);
            if (viewHolder != null) {
                if (viewHolder.mPosition >= n3) {
                    viewHolder.offsetPosition(-n2, b);
                }
                else if (viewHolder.mPosition >= n) {
                    viewHolder.addFlags(8);
                    ((o)lj).LIZLLL(j);
                }
            }
        }
        this.requestLayout();
    }
    
    public final void LIZIZ(final RecyclerView.h h) {
        this.LIZ(h);
    }
    
    public final void LIZIZ(final k k) {
        final List<k> ljjiffi = this.LJJIFFI;
        if (ljjiffi == null) {
            return;
        }
        ljjiffi.remove(k);
    }
    
    public final void LIZIZ(final RecyclerView.m m) {
        this.LJJJJJ.remove(m);
        if (this.LJJJJJL == m) {
            this.LJJJJJL = null;
        }
    }
    
    public final void LIZIZ(final RecyclerView.n n) {
        final List<RecyclerView.n> ljjzziii = this.LJJZZIII;
        if (ljjzziii != null) {
            ljjzziii.remove(n);
        }
    }
    
    public final void LIZIZ(final boolean b) {
        final int ljjjjzi = this.LJJJJZI - 1;
        this.LJJJJZI = ljjjjzi;
        if (ljjjjzi <= 0) {
            this.LJJJJZI = 0;
            if (b) {
                this.LJJ();
                this.LJJIL();
            }
        }
    }
    
    public boolean LIZIZ(int max, int max2) {
        final int n = max2;
        final i ljiiljjil = this.LJIILJJIL;
        if (ljiiljjil == null) {
            return false;
        }
        if (this.LJJ) {
            return false;
        }
        final int ljff = ((i)ljiiljjil).LJFF() ? 1 : 0;
        final boolean lji = ((i)this.LJIILJJIL).LJI();
        Label_0060: {
            if (ljff != 0) {
                max2 = max;
                if (Math.abs(max) >= this.LJJLIL) {
                    break Label_0060;
                }
            }
            max2 = 0;
        }
        Label_0080: {
            if (lji) {
                max = n;
                if (Math.abs(n) >= this.LJJLIL) {
                    break Label_0080;
                }
            }
            max = 0;
        }
        if (max2 == 0 && max == 0) {
            return false;
        }
        final float n2 = (float)max2;
        final float n3 = (float)max;
        if (!this.dispatchNestedPreFling(n2, n3)) {
            final boolean b = ljff != 0 || lji;
            this.dispatchNestedFling(n2, n3, b);
            final RecyclerView.l ljjliij = this.LJJLIIJ;
            if (ljjliij != null && ljjliij.LIZ(max2, max)) {
                return true;
            }
            if (b) {
                int n4 = ljff;
                if (lji) {
                    n4 = (ljff | 0x2);
                }
                this.LJII(n4, 1);
                final int ljjlj = this.LJJLJ;
                max2 = Math.max(-ljjlj, Math.min(max2, ljjlj));
                final int ljjlj2 = this.LJJLJ;
                max = Math.max(-ljjlj2, Math.min(max, ljjlj2));
                final v ljjiijzljl = this.LJJIIJZLJL;
                ljjiijzljl.LJ.setScrollState(2);
                ljjiijzljl.LIZIZ = 0;
                ljjiijzljl.LIZ = 0;
                final Interpolator lizlll = ljjiijzljl.LIZLLL;
                final Interpolator ljjiz = RecyclerView.LJJIZ;
                if (lizlll != ljjiz) {
                    ljjiijzljl.LIZLLL = ljjiz;
                    ljjiijzljl.LIZJ = new OverScroller(ljjiijzljl.LJ.getContext(), ljjiz);
                }
                ljjiijzljl.LIZJ.fling(0, 0, max2, max, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                ljjiijzljl.LIZ();
                return true;
            }
        }
        return false;
    }
    
    public final boolean LIZIZ(final ViewHolder viewHolder) {
        final f ljjiij = this.LJJIIJ;
        return ljjiij == null || ((f)ljjiij).LIZ(viewHolder, viewHolder.getUnmodifiedPayloads());
    }
    
    public final void LIZJ() {
        final List<k> ljjiffi = this.LJJIFFI;
        if (ljjiffi != null) {
            ljjiffi.clear();
        }
    }
    
    public final void LIZJ(final int n) {
        if (this.LJJ) {
            return;
        }
        this.LJI();
        final i ljiiljjil = this.LJIILJJIL;
        if (ljiiljjil == null) {
            return;
        }
        ((i)ljiiljjil).LJ(n);
        this.awakenScrollBars();
    }
    
    public final void LIZJ(final int n, final int n2) {
        final EdgeEffect ljjjlzij = this.LJJJLZIJ;
        int finished;
        if (ljjjlzij != null && !ljjjlzij.isFinished() && n > 0) {
            this.LJJJLZIJ.onRelease();
            finished = (this.LJJJLZIJ.isFinished() ? 1 : 0);
        }
        else {
            finished = 0;
        }
        final EdgeEffect ljjl = this.LJJL;
        int n3 = finished;
        if (ljjl != null) {
            n3 = finished;
            if (!ljjl.isFinished()) {
                n3 = finished;
                if (n < 0) {
                    this.LJJL.onRelease();
                    n3 = (finished | (this.LJJL.isFinished() ? 1 : 0));
                }
            }
        }
        final EdgeEffect ljjjz = this.LJJJZ;
        int n4 = n3;
        if (ljjjz != null) {
            n4 = n3;
            if (!ljjjz.isFinished()) {
                n4 = n3;
                if (n2 > 0) {
                    this.LJJJZ.onRelease();
                    n4 = (n3 | (this.LJJJZ.isFinished() ? 1 : 0));
                }
            }
        }
        final EdgeEffect ljjli = this.LJJLI;
        int n5 = n4;
        if (ljjli != null) {
            n5 = n4;
            if (!ljjli.isFinished()) {
                n5 = n4;
                if (n2 < 0) {
                    this.LJJLI.onRelease();
                    n5 = (n4 | (this.LJJLI.isFinished() ? 1 : 0));
                }
            }
        }
        if (n5 != 0) {
            ((View)this).postInvalidateOnAnimation();
        }
    }
    
    public final void LIZJ(final RecyclerView.h h) {
        final i ljiiljjil = this.LJIILJJIL;
        if (ljiiljjil != null) {
            ((i)ljiiljjil).LIZ("Cannot remove item decoration during a scroll  or layout");
        }
        this.LJIIZILJ.remove(h);
        if (this.LJIIZILJ.isEmpty()) {
            this.setWillNotDraw(this.getOverScrollMode() == 2);
        }
        this.LJJIJIIJIL();
        this.requestLayout();
    }
    
    public final void LIZJ(final boolean b) {
        this.LJJIII |= b;
        this.LJJII = true;
        this.LJJIJLIJ();
    }
    
    public final int LIZLLL(final View view) {
        final ViewHolder lizj = LIZJ(view);
        if (lizj != null) {
            return lizj.getAbsoluteAdapterPosition();
        }
        return -1;
    }
    
    public final int LIZLLL(final ViewHolder viewHolder) {
        if (viewHolder.hasAnyOfTheFlags(524) || !viewHolder.isBound()) {
            return -1;
        }
        return this.LJI.LIZJ(viewHolder.mPosition);
    }
    
    public final void LIZLLL() {
        final List<RecyclerView.n> ljjzziii = this.LJJZZIII;
        if (ljjzziii != null) {
            ljjzziii.clear();
        }
    }
    
    public final void LIZLLL(final int n) {
        if (this.LJIILJJIL == null) {
            return;
        }
        this.setScrollState(2);
        ((i)this.LJIILJJIL).LJ(n);
        this.awakenScrollBars();
    }
    
    public final void LIZLLL(final int n, final int n2) {
        if (n < 0) {
            this.LJIILLIIL();
            if (this.LJJJLZIJ.isFinished()) {
                this.LJJJLZIJ.onAbsorb(-n);
            }
        }
        else if (n > 0) {
            this.LJIIZILJ();
            if (this.LJJL.isFinished()) {
                this.LJJL.onAbsorb(n);
            }
        }
        if (n2 < 0) {
            this.LJIJ();
            if (this.LJJJZ.isFinished()) {
                this.LJJJZ.onAbsorb(-n2);
            }
        }
        else if (n2 > 0) {
            this.LJIJI();
            if (this.LJJLI.isFinished()) {
                this.LJJLI.onAbsorb(n2);
            }
        }
        if (n != 0 || n2 != 0) {
            ((View)this).postInvalidateOnAnimation();
        }
    }
    
    public final int LJ(final View view) {
        final ViewHolder lizj = LIZJ(view);
        if (lizj != null) {
            return lizj.getLayoutPosition();
        }
        return -1;
    }
    
    public final void LJ() {
        if (!this.LJIJJLI || this.LJJII) {
            Trace.beginSection("RV FullInvalidate");
            this.LJJII();
            Trace.endSection();
            return;
        }
        if (!this.LJI.LIZLLL()) {
            return;
        }
        if (this.LJI.LIZ(4) && !this.LJI.LIZ(11)) {
            Trace.beginSection("RV PartialInvalidate");
            this.LJFF();
            this.LJII();
            this.LJI.LIZIZ();
            Label_0139: {
                if (!this.LJIL) {
                    for (int liz = this.LJII.LIZ(), i = 0; i < liz; ++i) {
                        final ViewHolder lizj = LIZJ(this.LJII.LIZIZ(i));
                        if (lizj != null && !lizj.shouldIgnore() && lizj.isUpdated()) {
                            this.LJJII();
                            break Label_0139;
                        }
                    }
                    this.LJI.LIZJ();
                }
            }
            this.LIZ(true);
            this.LIZIZ(true);
            Trace.endSection();
            return;
        }
        if (this.LJI.LIZLLL()) {
            Trace.beginSection("RV FullInvalidate");
            this.LJJII();
            Trace.endSection();
        }
    }
    
    public void LJ(final int n) {
        if (this.LJJ) {
            return;
        }
        final i ljiiljjil = this.LJIILJJIL;
        if (ljiiljjil == null) {
            return;
        }
        ljiiljjil.LIZ(this, this.LJJIJ, n);
    }
    
    public final void LJ(final int n, final int n2) {
        this.setMeasuredDimension(i.LIZ(n, this.getPaddingLeft() + this.getPaddingRight(), ((View)this).getMinimumWidth()), i.LIZ(n2, this.getPaddingTop() + this.getPaddingBottom(), ((View)this).getMinimumHeight()));
    }
    
    public final Rect LJFF(final View view) {
        final j j = (j)view.getLayoutParams();
        if (!j.LJ) {
            return j.LIZLLL;
        }
        if (this.LJJIJ.LJI && (j.LIZJ.isUpdated() || j.LIZJ.isInvalid())) {
            return j.LIZLLL;
        }
        final Rect lizlll = j.LIZLLL;
        lizlll.set(0, 0, 0, 0);
        for (int size = this.LJIIZILJ.size(), i = 0; i < size; ++i) {
            this.LJIIJJI.set(0, 0, 0, 0);
            this.LJIIZILJ.get(i).LIZ(this.LJIIJJI, view, this, this.LJJIJ);
            lizlll.left += this.LJIIJJI.left;
            lizlll.top += this.LJIIJJI.top;
            lizlll.right += this.LJIIJJI.right;
            lizlll.bottom += this.LJIIJJI.bottom;
        }
        j.LJ = false;
        return lizlll;
    }
    
    public final ViewHolder LJFF(final int n) {
        return this.LIZ(n, false);
    }
    
    public final void LJFF() {
        final int ljjjjl = this.LJJJJL + 1;
        this.LJJJJL = ljjjjl;
        if (ljjjjl == 1 && !this.LJJ) {
            this.LJIL = false;
        }
    }
    
    public final void LJFF(final int n, final int n2) {
        ++this.LJJJLIIL;
        final int scrollX = this.getScrollX();
        final int scrollY = this.getScrollY();
        this.onScrollChanged(scrollX, scrollY, scrollX - n, scrollY - n2);
        final RecyclerView.n ljjzzi = this.LJJZZI;
        if (ljjzzi != null) {
            ljjzzi.LIZ(this, n, n2);
        }
        final List<RecyclerView.n> ljjzziii = this.LJJZZIII;
        if (ljjzziii != null) {
            for (int i = ljjzziii.size() - 1; i >= 0; --i) {
                this.LJJZZIII.get(i).LIZ(this, n, n2);
            }
        }
        --this.LJJJLIIL;
    }
    
    public final ViewHolder LJI(final int n) {
        final boolean ljjii = this.LJJII;
        ViewHolder viewHolder = null;
        if (ljjii) {
            return null;
        }
        ViewHolder viewHolder2;
        for (int liziz = this.LJII.LIZIZ(), i = 0; i < liziz; ++i, viewHolder = viewHolder2) {
            final ViewHolder lizj = LIZJ(this.LJII.LIZJ(i));
            viewHolder2 = viewHolder;
            if (lizj != null) {
                viewHolder2 = viewHolder;
                if (!lizj.isRemoved()) {
                    viewHolder2 = viewHolder;
                    if (this.LIZLLL(lizj) == n) {
                        if (!this.LJII.LIZLLL(lizj.itemView)) {
                            return lizj;
                        }
                        viewHolder2 = lizj;
                    }
                }
            }
        }
        return viewHolder;
    }
    
    public final void LJI() {
        this.setScrollState(0);
        this.LJIILJJIL();
    }
    
    public final void LJII() {
        ++this.LJJJJZI;
    }
    
    public final void LJII(final View view) {
        final ViewHolder lizj = LIZJ(view);
        final a ljiiliil = this.LJIILIIL;
        if (ljiiliil != null && lizj != null) {
            ((a<ViewHolder>)ljiiliil).onViewDetachedFromWindow(lizj);
        }
        final List<k> ljjiffi = this.LJJIFFI;
        if (ljjiffi != null) {
            for (int i = ljjiffi.size() - 1; i >= 0; --i) {
                ((k)this.LJJIFFI.get(i)).LIZIZ(view);
            }
        }
    }
    
    public final boolean LJIIIIZZ() {
        final AccessibilityManager ljjjjz = this.LJJJJZ;
        return ljjjjz != null && ljjjjz.isEnabled();
    }
    
    public final boolean LJIIIZ() {
        return this.LJJJJZI > 0;
    }
    
    public final void LJIIJ() {
        if (!this.LJJIJIL && this.LJIJ) {
            ((View)this).postOnAnimation(this.LJLJI);
            this.LJJIJIL = true;
        }
    }
    
    public final boolean LJIIJJI() {
        final f ljjiij = this.LJJIIJ;
        return ljjiij != null && ((f)ljjiij).LIZIZ();
    }
    
    public final void LJIIL() {
        if (this.LJIIZILJ.size() == 0) {
            return;
        }
        final i ljiiljjil = this.LJIILJJIL;
        if (ljiiljjil != null) {
            ((i)ljiiljjil).LIZ("Cannot invalidate item decorations during a scroll or layout");
        }
        this.LJJIJIIJIL();
        this.requestLayout();
    }
    
    public final boolean LJIILIIL() {
        return !this.LJIJJLI || this.LJJII || this.LJI.LIZLLL();
    }
    
    public void addFocusables(final ArrayList<View> list, final int n, final int n2) {
        super.addFocusables((ArrayList)list, n, n2);
    }
    
    public boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof j && this.LJIILJJIL.LIZ((j)viewGroup$LayoutParams);
    }
    
    public int computeHorizontalScrollExtent() {
        final i ljiiljjil = this.LJIILJJIL;
        if (ljiiljjil == null) {
            return 0;
        }
        if (((i)ljiiljjil).LJFF()) {
            return this.LJIILJJIL.LJFF(this.LJJIJ);
        }
        return 0;
    }
    
    public int computeHorizontalScrollOffset() {
        final i ljiiljjil = this.LJIILJJIL;
        if (ljiiljjil == null) {
            return 0;
        }
        if (((i)ljiiljjil).LJFF()) {
            return this.LJIILJJIL.LIZLLL(this.LJJIJ);
        }
        return 0;
    }
    
    public int computeHorizontalScrollRange() {
        final i ljiiljjil = this.LJIILJJIL;
        if (ljiiljjil == null) {
            return 0;
        }
        if (((i)ljiiljjil).LJFF()) {
            return this.LJIILJJIL.LIZIZ(this.LJJIJ);
        }
        return 0;
    }
    
    public int computeVerticalScrollExtent() {
        final i ljiiljjil = this.LJIILJJIL;
        if (ljiiljjil == null) {
            return 0;
        }
        if (((i)ljiiljjil).LJI()) {
            return this.LJIILJJIL.LJI(this.LJJIJ);
        }
        return 0;
    }
    
    public int computeVerticalScrollOffset() {
        final i ljiiljjil = this.LJIILJJIL;
        if (ljiiljjil == null) {
            return 0;
        }
        if (((i)ljiiljjil).LJI()) {
            return this.LJIILJJIL.LJ(this.LJJIJ);
        }
        return 0;
    }
    
    public int computeVerticalScrollRange() {
        final i ljiiljjil = this.LJIILJJIL;
        if (ljiiljjil == null) {
            return 0;
        }
        if (((i)ljiiljjil).LJI()) {
            return this.LJIILJJIL.LIZJ(this.LJJIJ);
        }
        return 0;
    }
    
    public boolean dispatchNestedFling(final float n, final float n2, final boolean b) {
        return this.getScrollingChildHelper().LIZ(n, n2, b);
    }
    
    public boolean dispatchNestedPreFling(final float n, final float n2) {
        return this.getScrollingChildHelper().LIZ(n, n2);
    }
    
    public boolean dispatchNestedPreScroll(final int n, final int n2, final int[] array, final int[] array2) {
        return this.getScrollingChildHelper().LIZ(n, n2, array, array2);
    }
    
    public boolean dispatchNestedScroll(final int n, final int n2, final int n3, final int n4, final int[] array) {
        return this.getScrollingChildHelper().LIZ(n, n2, n3, n4, array);
    }
    
    public boolean dispatchPopulateAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        this.onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }
    
    public void dispatchRestoreInstanceState(final SparseArray<Parcelable> sparseArray) {
        this.dispatchThawSelfOnly((SparseArray)sparseArray);
    }
    
    public void dispatchSaveInstanceState(final SparseArray<Parcelable> sparseArray) {
        this.dispatchFreezeSelfOnly((SparseArray)sparseArray);
    }
    
    public void draw(final Canvas canvas) {
        super.draw(canvas);
        final int size = this.LJIIZILJ.size();
        final boolean b = false;
        for (int i = 0; i < size; ++i) {
            this.LJIIZILJ.get(i).LIZIZ(canvas, this, this.LJJIJ);
        }
        final EdgeEffect ljjjlzij = this.LJJJLZIJ;
        boolean b2;
        if (ljjjlzij != null && !ljjjlzij.isFinished()) {
            final int save = canvas.save();
            int paddingBottom;
            if (this.LJIIIZ) {
                paddingBottom = this.getPaddingBottom();
            }
            else {
                paddingBottom = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((float)(-this.getHeight() + paddingBottom), 0.0f);
            final EdgeEffect ljjjlzij2 = this.LJJJLZIJ;
            if (ljjjlzij2 != null && ljjjlzij2.draw(canvas)) {
                b2 = true;
            }
            else {
                b2 = false;
            }
            canvas.restoreToCount(save);
        }
        else {
            b2 = false;
        }
        final EdgeEffect ljjjz = this.LJJJZ;
        boolean b3 = b2;
        if (ljjjz != null) {
            b3 = b2;
            if (!ljjjz.isFinished()) {
                final int save2 = canvas.save();
                if (this.LJIIIZ) {
                    canvas.translate((float)this.getPaddingLeft(), (float)this.getPaddingTop());
                }
                final EdgeEffect ljjjz2 = this.LJJJZ;
                boolean b4;
                if (ljjjz2 != null && ljjjz2.draw(canvas)) {
                    b4 = true;
                }
                else {
                    b4 = false;
                }
                b3 = (b2 | b4);
                canvas.restoreToCount(save2);
            }
        }
        final EdgeEffect ljjl = this.LJJL;
        boolean b5 = b3;
        if (ljjl != null) {
            b5 = b3;
            if (!ljjl.isFinished()) {
                final int save3 = canvas.save();
                final int width = this.getWidth();
                int paddingTop;
                if (this.LJIIIZ) {
                    paddingTop = this.getPaddingTop();
                }
                else {
                    paddingTop = 0;
                }
                canvas.rotate(90.0f);
                canvas.translate((float)paddingTop, (float)(-width));
                final EdgeEffect ljjl2 = this.LJJL;
                boolean b6;
                if (ljjl2 != null && ljjl2.draw(canvas)) {
                    b6 = true;
                }
                else {
                    b6 = false;
                }
                b5 = (b3 | b6);
                canvas.restoreToCount(save3);
            }
        }
        final EdgeEffect ljjli = this.LJJLI;
        boolean b7 = b5;
        if (ljjli != null) {
            b7 = b5;
            if (!ljjli.isFinished()) {
                final int save4 = canvas.save();
                canvas.rotate(180.0f);
                if (this.LJIIIZ) {
                    canvas.translate((float)(-this.getWidth() + this.getPaddingRight()), (float)(-this.getHeight() + this.getPaddingBottom()));
                }
                else {
                    canvas.translate((float)(-this.getWidth()), (float)(-this.getHeight()));
                }
                final EdgeEffect ljjli2 = this.LJJLI;
                boolean b8 = b;
                if (ljjli2 != null) {
                    b8 = b;
                    if (ljjli2.draw(canvas)) {
                        b8 = true;
                    }
                }
                b7 = (b5 | b8);
                canvas.restoreToCount(save4);
            }
        }
        if (b7 || (this.LJJIIJ != null && this.LJIIZILJ.size() > 0 && ((f)this.LJJIIJ).LIZIZ())) {
            ((View)this).postInvalidateOnAnimation();
        }
    }
    
    public boolean drawChild(final Canvas canvas, final View view, final long n) {
        return super.drawChild(canvas, view, n);
    }
    
    public View focusSearch(final View view, int layoutDirection) {
        boolean b;
        if (this.LJIILIIL != null && this.LJIILJJIL != null && !this.LJIIIZ() && !this.LJJ) {
            b = true;
        }
        else {
            b = false;
        }
        final FocusFinder instance = FocusFinder.getInstance();
        int n3 = 0;
        View view2;
        if (b && (layoutDirection == 2 || layoutDirection == 1)) {
            Label_0342: {
                Label_0180: {
                    if (((i)this.LJIILJJIL).LJI()) {
                        int n;
                        if (layoutDirection == 2) {
                            n = 130;
                        }
                        else {
                            n = 33;
                        }
                        int n2;
                        if (instance.findNextFocus((ViewGroup)this, view, n) == null) {
                            n2 = 1;
                        }
                        else {
                            n2 = 0;
                        }
                        if (RecyclerView.LJJJI) {
                            layoutDirection = n;
                        }
                        n3 = layoutDirection;
                        if (n2 != 0) {
                            break Label_0180;
                        }
                    }
                    n3 = layoutDirection;
                    if (!((i)this.LJIILJJIL).LJFF()) {
                        break Label_0342;
                    }
                    boolean b2;
                    if (((View)this.LJIILJJIL.LJIL).getLayoutDirection() == 1) {
                        b2 = true;
                    }
                    else {
                        b2 = false;
                    }
                    boolean b3;
                    if (layoutDirection == 2) {
                        b3 = true;
                    }
                    else {
                        b3 = false;
                    }
                    int n4;
                    if (b2 ^ b3) {
                        n4 = 66;
                    }
                    else {
                        n4 = 17;
                    }
                    int n5;
                    if (instance.findNextFocus((ViewGroup)this, view, n4) == null) {
                        n5 = 1;
                    }
                    else {
                        n5 = 0;
                    }
                    if (RecyclerView.LJJJI) {
                        layoutDirection = n4;
                    }
                    n3 = layoutDirection;
                    if (n5 == 0) {
                        break Label_0342;
                    }
                    n3 = layoutDirection;
                }
                this.LJ();
                if (this.LIZIZ(view) == null) {
                    return null;
                }
                this.LJFF();
                this.LJIILJJIL.LIZ(view, n3, this.LJ, this.LJJIJ);
                this.LIZ(false);
            }
            view2 = instance.findNextFocus((ViewGroup)this, view, n3);
        }
        else {
            final View view3 = view2 = instance.findNextFocus((ViewGroup)this, view, layoutDirection);
            n3 = layoutDirection;
            if (view3 == null) {
                final int n6 = layoutDirection;
                if (!b) {
                    return super.focusSearch(view, n6);
                }
                this.LJ();
                if (this.LIZIZ(view) == null) {
                    return null;
                }
                this.LJFF();
                view2 = this.LJIILJJIL.LIZ(view, layoutDirection, this.LJ, this.LJJIJ);
                this.LIZ(false);
                n3 = layoutDirection;
            }
        }
        int n6 = n3;
        if (view2 != null) {
            if (!view2.hasFocusable()) {
                if (this.getFocusedChild() == null) {
                    return super.focusSearch(view, n3);
                }
                this.LIZ(view2, (View)null);
                return view;
            }
            else {
                n6 = n3;
                if (view2 != this) {
                    if (view2 == view) {
                        n6 = n3;
                    }
                    else {
                        if (this.LIZIZ(view2) != null) {
                            if (view != null) {
                                if (this.LIZIZ(view) != null) {
                                    this.LJIIJJI.set(0, 0, view.getWidth(), view.getHeight());
                                    this.LJJJJIZL.set(0, 0, view2.getWidth(), view2.getHeight());
                                    this.offsetDescendantRectToMyCoords(view, this.LJIIJJI);
                                    this.offsetDescendantRectToMyCoords(view2, this.LJJJJIZL);
                                    layoutDirection = ((View)this.LJIILJJIL.LJIL).getLayoutDirection();
                                    int n7 = -1;
                                    int n8;
                                    if (layoutDirection == 1) {
                                        n8 = -1;
                                    }
                                    else {
                                        n8 = 1;
                                    }
                                    if ((this.LJIIJJI.left < this.LJJJJIZL.left || this.LJIIJJI.right <= this.LJJJJIZL.left) && this.LJIIJJI.right < this.LJJJJIZL.right) {
                                        layoutDirection = 1;
                                    }
                                    else if ((this.LJIIJJI.right > this.LJJJJIZL.right || this.LJIIJJI.left >= this.LJJJJIZL.right) && this.LJIIJJI.left > this.LJJJJIZL.left) {
                                        layoutDirection = -1;
                                    }
                                    else {
                                        layoutDirection = 0;
                                    }
                                    if ((this.LJIIJJI.top < this.LJJJJIZL.top || this.LJIIJJI.bottom <= this.LJJJJIZL.top) && this.LJIIJJI.bottom < this.LJJJJIZL.bottom) {
                                        n7 = 1;
                                    }
                                    else if ((this.LJIIJJI.bottom <= this.LJJJJIZL.bottom && this.LJIIJJI.top < this.LJJJJIZL.bottom) || this.LJIIJJI.top <= this.LJJJJIZL.top) {
                                        n7 = 0;
                                    }
                                    if (n3 != 1) {
                                        if (n3 != 2) {
                                            if (n3 != 17) {
                                                if (n3 != 33) {
                                                    if (n3 != 66) {
                                                        if (n3 != 130) {
                                                            final StringBuilder sb = new StringBuilder("Invalid direction: ");
                                                            sb.append(n3);
                                                            sb.append(this.LIZ());
                                                            throw new IllegalArgumentException(sb.toString());
                                                        }
                                                        n6 = n3;
                                                        if (n7 <= 0) {
                                                            return super.focusSearch(view, n6);
                                                        }
                                                    }
                                                    else {
                                                        n6 = n3;
                                                        if (layoutDirection <= 0) {
                                                            return super.focusSearch(view, n6);
                                                        }
                                                    }
                                                }
                                                else {
                                                    n6 = n3;
                                                    if (n7 >= 0) {
                                                        return super.focusSearch(view, n6);
                                                    }
                                                }
                                            }
                                            else {
                                                n6 = n3;
                                                if (layoutDirection >= 0) {
                                                    return super.focusSearch(view, n6);
                                                }
                                            }
                                        }
                                        else if (n7 <= 0) {
                                            n6 = n3;
                                            if (n7 != 0) {
                                                return super.focusSearch(view, n6);
                                            }
                                            n6 = n3;
                                            if (layoutDirection * n8 <= 0) {
                                                return super.focusSearch(view, n6);
                                            }
                                        }
                                    }
                                    else if (n7 >= 0) {
                                        n6 = n3;
                                        if (n7 != 0) {
                                            return super.focusSearch(view, n6);
                                        }
                                        n6 = n3;
                                        if (layoutDirection * n8 >= 0) {
                                            return super.focusSearch(view, n6);
                                        }
                                    }
                                }
                            }
                            return view2;
                        }
                        n6 = n3;
                    }
                }
            }
        }
        return super.focusSearch(view, n6);
    }
    
    public ViewGroup$LayoutParams generateDefaultLayoutParams() {
        final i ljiiljjil = this.LJIILJJIL;
        if (ljiiljjil != null) {
            return (ViewGroup$LayoutParams)ljiiljjil.LIZIZ();
        }
        final StringBuilder sb = new StringBuilder("RecyclerView has no LayoutManager");
        sb.append(this.LIZ());
        throw new IllegalStateException(sb.toString());
    }
    
    public ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        final i ljiiljjil = this.LJIILJJIL;
        if (ljiiljjil != null) {
            return (ViewGroup$LayoutParams)ljiiljjil.LIZ(this.getContext(), set);
        }
        final StringBuilder sb = new StringBuilder("RecyclerView has no LayoutManager");
        sb.append(this.LIZ());
        throw new IllegalStateException(sb.toString());
    }
    
    public ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        final i ljiiljjil = this.LJIILJJIL;
        if (ljiiljjil != null) {
            return (ViewGroup$LayoutParams)ljiiljjil.LIZ(viewGroup$LayoutParams);
        }
        final StringBuilder sb = new StringBuilder("RecyclerView has no LayoutManager");
        sb.append(this.LIZ());
        throw new IllegalStateException(sb.toString());
    }
    
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }
    
    public a getAdapter() {
        return this.LJIILIIL;
    }
    
    public int getBaseline() {
        if (this.LJIILJJIL != null) {
            return -1;
        }
        return super.getBaseline();
    }
    
    public int getChildDrawingOrder(final int n, final int n2) {
        final RecyclerView.d ljli = this.LJLI;
        if (ljli == null) {
            return super.getChildDrawingOrder(n, n2);
        }
        return ljli.LIZ();
    }
    
    public boolean getClipToPadding() {
        return this.LJIIIZ;
    }
    
    public 17N getCompatAccessibilityDelegate() {
        return this.LJJIJL;
    }
    
    public RecyclerView.e getEdgeEffectFactory() {
        return this.LJJJLL;
    }
    
    public f getItemAnimator() {
        return this.LJJIIJ;
    }
    
    public int getItemDecorationCount() {
        return this.LJIIZILJ.size();
    }
    
    public i getLayoutManager() {
        return this.LJIILJJIL;
    }
    
    public int getMaxFlingVelocity() {
        return this.LJJLJ;
    }
    
    public int getMinFlingVelocity() {
        return this.LJJLIL;
    }
    
    public long getNanoTime() {
        if (RecyclerView.LIZLLL) {
            return System.nanoTime();
        }
        return 0L;
    }
    
    public RecyclerView.l getOnFlingListener() {
        return this.LJJLIIJ;
    }
    
    public boolean getPreserveFocusAfterLayout() {
        return this.LJJZ;
    }
    
    public RecycledViewPool getRecycledViewPool() {
        return ((o)this.LJ).LIZJ();
    }
    
    public int getScrollState() {
        return this.LJJLIIIIJ;
    }
    
    public boolean hasNestedScrollingParent() {
        return this.getScrollingChildHelper().LIZ(0);
    }
    
    public boolean isAttachedToWindow() {
        return this.LJIJ;
    }
    
    public final boolean isLayoutSuppressed() {
        return this.LJJ;
    }
    
    public boolean isNestedScrollingEnabled() {
        return this.getScrollingChildHelper().LIZ;
    }
    
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LJJJJZI = 0;
        boolean ljijjli = true;
        this.LJIJ = true;
        if (!this.LJIJJLI || this.isLayoutRequested()) {
            ljijjli = false;
        }
        this.LJIJJLI = ljijjli;
        final i ljiiljjil = this.LJIILJJIL;
        if (ljiiljjil != null) {
            ((i)ljiiljjil).LIZIZ(this);
        }
        this.LJJIJIL = false;
        if (RecyclerView.LIZLLL) {
            if ((this.LJJIIZ = 0FS.LIZ.get()) == null) {
                this.LJJIIZ = new 0FS();
                final Display display = ((View)this).getDisplay();
                float n2;
                final float n = n2 = 60.0f;
                if (!this.isInEditMode()) {
                    n2 = n;
                    if (display != null) {
                        final float refreshRate = display.getRefreshRate();
                        n2 = n;
                        if (refreshRate >= 30.0f) {
                            n2 = refreshRate;
                        }
                    }
                }
                this.LJJIIZ.LIZLLL = (long)(1.0E9f / n2);
                0FS.LIZ.set(this.LJJIIZ);
            }
            this.LJJIIZ.LIZIZ.add(this);
        }
    }
    
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        final f ljjiij = this.LJJIIJ;
        if (ljjiij != null) {
            ((f)ljjiij).LIZLLL();
        }
        this.LJI();
        this.LJIJ = false;
        final i ljiiljjil = this.LJIILJJIL;
        if (ljiiljjil != null) {
            ljiiljjil.LIZIZ(this, this.LJ);
        }
        this.LJJIL.clear();
        this.removeCallbacks(this.LJLJI);
        while (0Em.a.LIZLLL.LIZ() != null) {}
        if (RecyclerView.LIZLLL) {
            final 0FS ljjiiz = this.LJJIIZ;
            if (ljjiiz != null) {
                ljjiiz.LIZIZ.remove(this);
                this.LJJIIZ = null;
            }
        }
    }
    
    public void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        for (int size = this.LJIIZILJ.size(), i = 0; i < size; ++i) {
            this.LJIIZILJ.get(i).LIZ(canvas, this, this.LJJIJ);
        }
    }
    
    public boolean onGenericMotionEvent(final MotionEvent motionEvent) {
        if (this.LJIILJJIL == null) {
            return false;
        }
        if (this.LJJ) {
            return false;
        }
        if (motionEvent.getAction() == 8) {
            while (true) {
                float n2 = 0.0f;
                Label_0390: {
                    float n4 = 0.0f;
                    float n5 = 0.0f;
                    Label_0099: {
                        float n = 0.0f;
                        float n3 = 0.0f;
                        Label_0086: {
                            if ((motionEvent.getSource() & 0x2) != 0x0) {
                                if (((i)this.LJIILJJIL).LJI()) {
                                    n = -motionEvent.getAxisValue(9);
                                }
                                else {
                                    n = 0.0f;
                                }
                                n2 = n;
                                if (!((i)this.LJIILJJIL).LJFF()) {
                                    break Label_0390;
                                }
                                n3 = motionEvent.getAxisValue(10);
                            }
                            else {
                                if ((motionEvent.getSource() & 0x400000) == 0x0) {
                                    return false;
                                }
                                n3 = motionEvent.getAxisValue(26);
                                if (((i)this.LJIILJJIL).LJI()) {
                                    n2 = -n3;
                                    break Label_0390;
                                }
                                if (((i)this.LJIILJJIL).LJFF()) {
                                    n = 0.0f;
                                    break Label_0086;
                                }
                                return false;
                            }
                            n4 = n3;
                            n5 = n;
                            if (n != 0.0f) {
                                break Label_0099;
                            }
                        }
                        if (n3 == 0.0f) {
                            return false;
                        }
                        n5 = n;
                        n4 = n3;
                    }
                    final int n6 = (int)(n4 * this.LJJLJLI);
                    final int n7 = (int)(n5 * this.LJJLL);
                    final i ljiiljjil = this.LJIILJJIL;
                    if (ljiiljjil != null && !this.LJJ) {
                        final int[] ljjijlij = this.LJJIJLIJ;
                        ljjijlij[1] = (ljjijlij[0] = 0);
                        final int ljff = ((i)ljiiljjil).LJFF() ? 1 : 0;
                        final boolean lji = ((i)this.LJIILJJIL).LJI();
                        int n8;
                        if (lji) {
                            n8 = (ljff | 0x2);
                        }
                        else {
                            n8 = ljff;
                        }
                        this.LJII(n8, 1);
                        int n9;
                        if (ljff != 0) {
                            n9 = n6;
                        }
                        else {
                            n9 = 0;
                        }
                        int n10;
                        if (lji) {
                            n10 = n7;
                        }
                        else {
                            n10 = 0;
                        }
                        int n11 = n7;
                        int n12 = n6;
                        if (this.LIZ(n9, n10, this.LJJIJLIJ, this.LJLIL, 1)) {
                            final int[] ljjijlij2 = this.LJJIJLIJ;
                            n12 = n6 - ljjijlij2[0];
                            n11 = n7 - ljjijlij2[1];
                        }
                        int n13;
                        if (ljff != 0) {
                            n13 = n12;
                        }
                        else {
                            n13 = 0;
                        }
                        int n14;
                        if (lji) {
                            n14 = n11;
                        }
                        else {
                            n14 = 0;
                        }
                        this.LIZ(n13, n14, motionEvent, 1);
                        final 0FS ljjiiz = this.LJJIIZ;
                        if (ljjiiz != null && (n12 != 0 || n11 != 0)) {
                            ljjiiz.LIZ(this, n12, n11);
                        }
                        this.LIZ(1);
                        return false;
                    }
                    return false;
                }
                float n3 = 0.0f;
                float n = n2;
                continue;
            }
        }
        return false;
    }
    
    public boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        if (this.LJJ) {
            return false;
        }
        this.LJJJJJL = null;
        if (this.LIZ(motionEvent)) {
            this.LJIL();
            return true;
        }
        final i ljiiljjil = this.LJIILJJIL;
        if (ljiiljjil == null) {
            return false;
        }
        final int ljff = ((i)ljiiljjil).LJFF() ? 1 : 0;
        final boolean lji = ((i)this.LJIILJJIL).LJI();
        if (this.LJJLIIIJILLIZJL == null) {
            this.LJJLIIIJILLIZJL = VelocityTracker.obtain();
        }
        this.LJJLIIIJILLIZJL.addMovement(motionEvent);
        final int actionMasked = motionEvent.getActionMasked();
        final int actionIndex = motionEvent.getActionIndex();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                this.LIZIZ(motionEvent);
                            }
                        }
                        else {
                            this.LJJLIIIJ = motionEvent.getPointerId(actionIndex);
                            final int n = (int)(motionEvent.getX(actionIndex) + 0.5f);
                            this.LJJLIIIJL = n;
                            this.LJJLIIIJJI = n;
                            final int n2 = (int)(motionEvent.getY(actionIndex) + 0.5f);
                            this.LJJLIIIJLJLI = n2;
                            this.LJJLIIIJJIZ = n2;
                        }
                    }
                    else {
                        this.LJIL();
                    }
                }
                else {
                    final int pointerIndex = motionEvent.findPointerIndex(this.LJJLIIIJ);
                    if (pointerIndex < 0) {
                        return false;
                    }
                    final int ljjliiijl = (int)(motionEvent.getX(pointerIndex) + 0.5f);
                    final int ljjliiijljli = (int)(motionEvent.getY(pointerIndex) + 0.5f);
                    if (this.LJJLIIIIJ != 1) {
                        final int ljjliiijji = this.LJJLIIIJJI;
                        final int ljjliiijjiz = this.LJJLIIIJJIZ;
                        int n3;
                        if (ljff != 0 && Math.abs(ljjliiijl - ljjliiijji) > this.LJJLIIIJLLLLLLLZ) {
                            this.LJJLIIIJL = ljjliiijl;
                            n3 = 1;
                        }
                        else {
                            n3 = 0;
                        }
                        if (lji && Math.abs(ljjliiijljli - ljjliiijjiz) > this.LJJLIIIJLLLLLLLZ) {
                            this.LJJLIIIJLJLI = ljjliiijljli;
                        }
                        else if (n3 == 0) {
                            return this.LJJLIIIIJ == 1;
                        }
                        this.setScrollState(1);
                    }
                }
            }
            else {
                this.LJJLIIIJILLIZJL.clear();
                this.LIZ(0);
            }
        }
        else {
            if (this.LJJJJLI) {
                this.LJJJJLI = false;
            }
            this.LJJLIIIJ = motionEvent.getPointerId(0);
            final int n4 = (int)(motionEvent.getX() + 0.5f);
            this.LJJLIIIJL = n4;
            this.LJJLIIIJJI = n4;
            final int n5 = (int)(motionEvent.getY() + 0.5f);
            this.LJJLIIIJLJLI = n5;
            this.LJJLIIIJJIZ = n5;
            if (this.LJJLIIIIJ == 2) {
                this.getParent().requestDisallowInterceptTouchEvent(true);
                this.setScrollState(1);
                this.LIZ(1);
            }
            final int[] ljlillllzi = this.LJLILLLLZI;
            ljlillllzi[ljlillllzi[1] = 0] = 0;
            int n6 = ljff;
            if (lji) {
                n6 = (ljff | 0x2);
            }
            this.LJII(n6, 0);
        }
        return this.LJJLIIIIJ == 1;
    }
    
    public void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        Trace.beginSection("RV OnLayout");
        this.LJJII();
        Trace.endSection();
        this.LJIJJLI = true;
    }
    
    public void onMeasure(final int n, final int n2) {
        final i ljiiljjil = this.LJIILJJIL;
        if (ljiiljjil == null) {
            this.LJ(n, n2);
            return;
        }
        final boolean ak_ = ((i)ljiiljjil).ak_();
        final boolean b = false;
        if (ak_) {
            final int mode = View$MeasureSpec.getMode(n);
            final int mode2 = View$MeasureSpec.getMode(n2);
            this.LJIILJJIL.LIZ(this.LJ, this.LJJIJ, n, n2);
            boolean ljljji = b;
            if (mode == 1073741824) {
                ljljji = b;
                if (mode2 == 1073741824) {
                    ljljji = true;
                }
            }
            if (!(this.LJLJJI = ljljji) && this.LJIILIIL != null) {
                if (this.LJJIJ.LIZLLL == 1) {
                    this.LJJIIZI();
                }
                ((i)this.LJIILJJIL).a_(n, n2);
                this.LJJIJ.LJIIIIZZ = true;
                this.LJJIJ();
                ((i)this.LJIILJJIL).LIZJ(n, n2);
                if (((i)this.LJIILJJIL).an_()) {
                    ((i)this.LJIILJJIL).a_(View$MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 1073741824), View$MeasureSpec.makeMeasureSpec(this.getMeasuredHeight(), 1073741824));
                    this.LJJIJ.LJIIIIZZ = true;
                    this.LJJIJ();
                    ((i)this.LJIILJJIL).LIZJ(n, n2);
                }
                this.LJLJJL = this.getMeasuredWidth();
                this.LJLJJLL = this.getMeasuredHeight();
            }
            return;
        }
        if (this.LJIJI) {
            this.LJIILJJIL.LIZ(this.LJ, this.LJJIJ, n, n2);
            return;
        }
        if (this.LJJI) {
            this.LJFF();
            this.LJII();
            this.LJJIFFI();
            this.LIZIZ(true);
            if (this.LJJIJ.LJIIJ) {
                this.LJJIJ.LJI = true;
            }
            else {
                this.LJI.LJ();
                this.LJJIJ.LJI = false;
            }
            this.LIZ(this.LJJI = false);
        }
        else if (this.LJJIJ.LJIIJ) {
            this.setMeasuredDimension(this.getMeasuredWidth(), this.getMeasuredHeight());
            return;
        }
        final a ljiiliil = this.LJIILIIL;
        if (ljiiliil != null) {
            this.LJJIJ.LJ = ((a)ljiiliil).getItemCount();
        }
        else {
            this.LJJIJ.LJ = 0;
        }
        this.LJFF();
        this.LJIILJJIL.LIZ(this.LJ, this.LJJIJ, n, n2);
        this.LIZ(false);
        this.LJJIJ.LJI = false;
    }
    
    public boolean onRequestFocusInDescendants(final int n, final Rect rect) {
        return !this.LJIIIZ() && super.onRequestFocusInDescendants(n, rect);
    }
    
    public void onRestoreInstanceState(final Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final SavedState ljff = (SavedState)parcelable;
        this.LJFF = ljff;
        super.onRestoreInstanceState(ljff.LIZLLL);
        this.requestLayout();
    }
    
    public Parcelable onSaveInstanceState() {
        final SavedState savedState = new SavedState(super.onSaveInstanceState());
        final SavedState ljff = this.LJFF;
        if (ljff != null) {
            savedState.LIZ = ljff.LIZ;
        }
        else {
            final i ljiiljjil = this.LJIILJJIL;
            if (ljiiljjil != null) {
                savedState.LIZ = ((i)ljiiljjil).LJ();
            }
            else {
                savedState.LIZ = null;
            }
        }
        return (Parcelable)savedState;
    }
    
    public void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        if (n != n3 || n2 != n4) {
            this.LJIJJ();
        }
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        if (this.LJJ || this.LJJJJLI) {
            return false;
        }
        final RecyclerView.m ljjjjjl = this.LJJJJJL;
        if (ljjjjjl == null) {
            if (motionEvent.getAction() == 0 || !this.LIZ(motionEvent)) {
                final i ljiiljjil = this.LJIILJJIL;
                if (ljiiljjil == null) {
                    return false;
                }
                final int ljff = ((i)ljiiljjil).LJFF() ? 1 : 0;
                final boolean lji = ((i)this.LJIILJJIL).LJI();
                if (this.LJJLIIIJILLIZJL == null) {
                    this.LJJLIIIJILLIZJL = VelocityTracker.obtain();
                }
                final int actionMasked = motionEvent.getActionMasked();
                final int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    final int[] ljlillllzi = this.LJLILLLLZI;
                    ljlillllzi[ljlillllzi[1] = 0] = 0;
                }
                final MotionEvent obtain = MotionEvent.obtain(motionEvent);
                final int[] ljlillllzi2 = this.LJLILLLLZI;
                obtain.offsetLocation((float)ljlillllzi2[0], (float)ljlillllzi2[1]);
                Label_0181: {
                    if (actionMasked != 0) {
                        if (actionMasked == 1) {
                            this.LJJLIIIJILLIZJL.addMovement(obtain);
                            this.LJJLIIIJILLIZJL.computeCurrentVelocity(1000, (float)this.LJJLJ);
                            float n;
                            if (ljff != 0) {
                                n = -this.LJJLIIIJILLIZJL.getXVelocity(this.LJJLIIIJ);
                            }
                            else {
                                n = 0.0f;
                            }
                            float n2;
                            if (lji) {
                                n2 = -this.LJJLIIIJILLIZJL.getYVelocity(this.LJJLIIIJ);
                            }
                            else {
                                n2 = 0.0f;
                            }
                            if ((n == 0.0f && n2 == 0.0f) || !this.LIZIZ((int)n, (int)n2)) {
                                this.setScrollState(0);
                            }
                            this.LJIJJLI();
                            break Label_0181;
                        }
                        if (actionMasked != 2) {
                            if (actionMasked != 3) {
                                if (actionMasked != 5) {
                                    if (actionMasked == 6) {
                                        this.LIZIZ(motionEvent);
                                    }
                                }
                                else {
                                    this.LJJLIIIJ = motionEvent.getPointerId(actionIndex);
                                    final int n3 = (int)(motionEvent.getX(actionIndex) + 0.5f);
                                    this.LJJLIIIJL = n3;
                                    this.LJJLIIIJJI = n3;
                                    final int n4 = (int)(motionEvent.getY(actionIndex) + 0.5f);
                                    this.LJJLIIIJLJLI = n4;
                                    this.LJJLIIIJJIZ = n4;
                                }
                            }
                            else {
                                this.LJIL();
                            }
                        }
                        else {
                            final int pointerIndex = motionEvent.findPointerIndex(this.LJJLIIIJ);
                            if (pointerIndex < 0) {
                                return false;
                            }
                            final int n5 = (int)(motionEvent.getX(pointerIndex) + 0.5f);
                            final int n6 = (int)(motionEvent.getY(pointerIndex) + 0.5f);
                            final int n7 = this.LJJLIIIJL - n5;
                            int n9;
                            final int n8 = n9 = this.LJJLIIIJLJLI - n6;
                            int n10 = n7;
                            Label_0429: {
                                if (this.LJJLIIIIJ != 1) {
                                    int n11 = n7;
                                    while (true) {
                                        Label_0747: {
                                            if (ljff == 0) {
                                                break Label_0747;
                                            }
                                            int n12;
                                            if (n7 > 0) {
                                                n12 = Math.max(0, n7 - this.LJJLIIIJLLLLLLLZ);
                                            }
                                            else {
                                                n12 = Math.min(0, n7 + this.LJJLIIIJLLLLLLLZ);
                                            }
                                            n11 = n12;
                                            if (n12 == 0) {
                                                break Label_0747;
                                            }
                                            final int n13 = 1;
                                            n11 = n12;
                                            int n14 = n8;
                                            while (true) {
                                                Label_0711: {
                                                    if (!lji) {
                                                        break Label_0711;
                                                    }
                                                    if (n8 > 0) {
                                                        n9 = Math.max(0, n8 - this.LJJLIIIJLLLLLLLZ);
                                                    }
                                                    else {
                                                        n9 = Math.min(0, n8 + this.LJJLIIIJLLLLLLLZ);
                                                    }
                                                    n14 = n9;
                                                    if (n9 == 0) {
                                                        break Label_0711;
                                                    }
                                                    this.setScrollState(1);
                                                    n10 = n11;
                                                    break Label_0429;
                                                }
                                                n9 = n14;
                                                n10 = n11;
                                                if (n13 != 0) {
                                                    n9 = n14;
                                                    continue;
                                                }
                                                break;
                                            }
                                            break Label_0429;
                                        }
                                        final int n13 = 0;
                                        continue;
                                    }
                                }
                            }
                            if (this.LJJLIIIIJ == 1) {
                                final int[] ljjijlij = this.LJJIJLIJ;
                                ljjijlij[1] = (ljjijlij[0] = 0);
                                int n15;
                                if (ljff != 0) {
                                    n15 = n10;
                                }
                                else {
                                    n15 = 0;
                                }
                                int n16;
                                if (lji) {
                                    n16 = n9;
                                }
                                else {
                                    n16 = 0;
                                }
                                int n17 = n9;
                                int n18 = n10;
                                if (this.LIZ(n15, n16, ljjijlij, this.LJLIL, 0)) {
                                    final int[] ljjijlij2 = this.LJJIJLIJ;
                                    n18 = n10 - ljjijlij2[0];
                                    n17 = n9 - ljjijlij2[1];
                                    final int[] ljlillllzi3 = this.LJLILLLLZI;
                                    final int n19 = ljlillllzi3[0];
                                    final int[] ljlil = this.LJLIL;
                                    ljlillllzi3[0] = n19 + ljlil[0];
                                    ljlillllzi3[1] += ljlil[1];
                                    this.getParent().requestDisallowInterceptTouchEvent(true);
                                }
                                final int[] ljlil2 = this.LJLIL;
                                this.LJJLIIIJL = n5 - ljlil2[0];
                                this.LJJLIIIJLJLI = n6 - ljlil2[1];
                                int n20;
                                if (ljff != 0) {
                                    n20 = n18;
                                }
                                else {
                                    n20 = 0;
                                }
                                int n21;
                                if (lji) {
                                    n21 = n17;
                                }
                                else {
                                    n21 = 0;
                                }
                                if (this.LIZ(n20, n21, motionEvent, 0)) {
                                    this.getParent().requestDisallowInterceptTouchEvent(true);
                                }
                                final 0FS ljjiiz = this.LJJIIZ;
                                if (ljjiiz != null && (n18 != 0 || n17 != 0)) {
                                    ljjiiz.LIZ(this, n18, n17);
                                }
                            }
                        }
                    }
                    else {
                        this.LJJLIIIJ = motionEvent.getPointerId(0);
                        final int n22 = (int)(motionEvent.getX() + 0.5f);
                        this.LJJLIIIJL = n22;
                        this.LJJLIIIJJI = n22;
                        final int n23 = (int)(motionEvent.getY() + 0.5f);
                        this.LJJLIIIJLJLI = n23;
                        this.LJJLIIIJJIZ = n23;
                        int n24 = ljff;
                        if (lji) {
                            n24 = (ljff | 0x2);
                        }
                        this.LJII(n24, 0);
                    }
                    this.LJJLIIIJILLIZJL.addMovement(obtain);
                }
                obtain.recycle();
                return true;
            }
        }
        else {
            ljjjjjl.LIZIZ(this, motionEvent);
            final int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.LJJJJJL = null;
            }
        }
        this.LJIL();
        return true;
    }
    
    public void removeDetachedView(final View view, final boolean b) {
        final ViewHolder lizj = LIZJ(view);
        if (lizj != null) {
            if (lizj.isTmpDetached()) {
                lizj.clearTmpDetachFlag();
            }
            else if (!lizj.shouldIgnore()) {
                final StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(lizj);
                sb.append(this.LIZ());
                throw new IllegalArgumentException(sb.toString());
            }
        }
        view.clearAnimation();
        this.LJII(view);
        super.removeDetachedView(view, b);
    }
    
    public void requestChildFocus(final View view, final View view2) {
        if (!((i)this.LJIILJJIL).LJIILLIIL() && !this.LJIIIZ() && view2 != null) {
            this.LIZ(view, view2);
        }
        super.requestChildFocus(view, view2);
    }
    
    public boolean requestChildRectangleOnScreen(final View view, final Rect rect, final boolean b) {
        return ((i)this.LJIILJJIL).LIZ(this, view, rect, b, false);
    }
    
    public void requestDisallowInterceptTouchEvent(final boolean b) {
        for (int size = this.LJJJJJ.size(), i = 0; i < size; ++i) {
            this.LJJJJJ.get(i).LIZ(b);
        }
        super.requestDisallowInterceptTouchEvent(b);
    }
    
    public void requestLayout() {
        if (this.LJJJJL == 0 && !this.LJJ) {
            super.requestLayout();
            return;
        }
        this.LJIL = true;
    }
    
    public void scrollBy(int n, int n2) {
        final i ljiiljjil = this.LJIILJJIL;
        if (ljiiljjil == null) {
            return;
        }
        if (this.LJJ) {
            return;
        }
        final boolean ljff = ((i)ljiiljjil).LJFF();
        final boolean lji = ((i)this.LJIILJJIL).LJI();
        if (ljff || lji) {
            if (!ljff) {
                n = 0;
            }
            if (!lji) {
                n2 = 0;
            }
            this.LIZ(n, n2, null, 0);
        }
    }
    
    public void scrollTo(final int n, final int n2) {
    }
    
    public void sendAccessibilityEventUnchecked(final AccessibilityEvent accessibilityEvent) {
        final boolean ljiiiz = this.LJIIIZ();
        final int n = 0;
        if (ljiiiz) {
            int contentChangeTypes = n;
            if (accessibilityEvent != null) {
                contentChangeTypes = accessibilityEvent.getContentChangeTypes();
                if (contentChangeTypes == 0) {
                    contentChangeTypes = n;
                }
            }
            this.LJJJJLL |= contentChangeTypes;
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }
    
    public void setAccessibilityDelegateCompat(final 17N ljjijl) {
        androidx.core.g.t.LIZ((View)this, this.LJJIJL = ljjijl);
    }
    
    public void setAdapter(final a a) {
        this.setLayoutFrozen(false);
        this.LIZ(a, false, true);
        this.LIZJ(false);
        this.requestLayout();
    }
    
    public void setChildDrawingOrderCallback(final RecyclerView.d ljli) {
        if (ljli == this.LJLI) {
            return;
        }
        this.LJLI = ljli;
        this.setChildrenDrawingOrderEnabled(ljli != null);
    }
    
    public void setClipToPadding(final boolean ljiiiz) {
        if (ljiiiz != this.LJIIIZ) {
            this.LJIJJ();
        }
        super.setClipToPadding(this.LJIIIZ = ljiiiz);
        if (this.LJIJJLI) {
            this.requestLayout();
        }
    }
    
    public void setEdgeEffectFactory(final RecyclerView.e ljjjll) {
        07U.LIZ(ljjjll);
        this.LJJJLL = ljjjll;
        this.LJIJJ();
    }
    
    public void setHasFixedSize(final boolean ljiji) {
        this.LJIJI = ljiji;
    }
    
    public void setItemAnimator(final f ljjiij) {
        final f ljjiij2 = this.LJJIIJ;
        if (ljjiij2 != null) {
            ((f)ljjiij2).LIZLLL();
            this.LJJIIJ.LJII = null;
        }
        if ((this.LJJIIJ = ljjiij) != null) {
            ljjiij.LJII = this.LJL;
        }
    }
    
    public void setItemViewCacheSize(final int lj) {
        final o lj2 = this.LJ;
        lj2.LJ = lj;
        ((o)lj2).LIZIZ();
    }
    
    public void setLayoutFrozen(final boolean b) {
        this.suppressLayout(b);
    }
    
    public void setLayoutManager(final i ljiiljjil) {
        if (ljiiljjil == this.LJIILJJIL) {
            return;
        }
        this.LJI();
        if (this.LJIILJJIL != null) {
            final f ljjiij = this.LJJIIJ;
            if (ljjiij != null) {
                ((f)ljjiij).LIZLLL();
            }
            this.LJIILJJIL.LIZJ(this.LJ);
            this.LJIILJJIL.LIZIZ(this.LJ);
            ((o)this.LJ).LIZ();
            if (this.LJIJ) {
                this.LJIILJJIL.LIZIZ(this, this.LJ);
            }
            ((i)this.LJIILJJIL).LIZ((RecyclerView)null);
            this.LJIILJJIL = null;
        }
        else {
            ((o)this.LJ).LIZ();
        }
        final 0Ey ljii = this.LJII;
        0Ey.a a = ljii.LIZIZ;
        while (true) {
            a.LIZ = 0L;
            if (a.LIZIZ == null) {
                break;
            }
            a = a.LIZIZ;
        }
        for (int i = ljii.LIZJ.size() - 1; i >= 0; --i) {
            ljii.LIZ.LIZLLL(ljii.LIZJ.get(i));
            ljii.LIZJ.remove(i);
        }
        ljii.LIZ.LIZIZ();
        if ((this.LJIILJJIL = ljiiljjil) != null) {
            if (ljiiljjil.LJIL != null) {
                final StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(ljiiljjil);
                sb.append(" is already attached to a RecyclerView:");
                sb.append(ljiiljjil.LJIL.LIZ());
                throw new IllegalArgumentException(sb.toString());
            }
            ((i)this.LJIILJJIL).LIZ(this);
            if (this.LJIJ) {
                ((i)this.LJIILJJIL).LIZIZ(this);
            }
        }
        ((o)this.LJ).LIZIZ();
        this.requestLayout();
    }
    
    public void setLayoutTransition(final LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition((LayoutTransition)null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }
    
    public void setNestedScrollingEnabled(final boolean b) {
        this.getScrollingChildHelper().LIZ(b);
    }
    
    public void setOnFlingListener(final RecyclerView.l ljjliij) {
        this.LJJLIIJ = ljjliij;
    }
    
    public void setOnScrollListener(final RecyclerView.n ljjzzi) {
        this.LJJZZI = ljjzzi;
    }
    
    public void setPreserveFocusAfterLayout(final boolean ljjz) {
        this.LJJZ = ljjz;
    }
    
    public void setRecycledViewPool(final RecycledViewPool lji) {
        final o lj = this.LJ;
        if (lj.LJI != null) {
            lj.LJI.detach();
        }
        lj.LJI = lji;
        if (lj.LJI != null && lj.LJIIIIZZ.getAdapter() != null) {
            lj.LJI.attach();
        }
    }
    
    public void setRecyclerListener(final p ljiill) {
        this.LJIILL = ljiill;
    }
    
    public void setScrollState(final int ljjliiiij) {
        if (ljjliiiij == this.LJJLIIIIJ) {
            return;
        }
        if ((this.LJJLIIIIJ = ljjliiiij) != 2) {
            this.LJIILJJIL();
        }
        final i ljiiljjil = this.LJIILJJIL;
        if (ljiiljjil != null) {
            ((i)ljiiljjil).LJIIIZ(ljjliiiij);
        }
        final RecyclerView.n ljjzzi = this.LJJZZI;
        if (ljjzzi != null) {
            ljjzzi.LIZ(this, ljjliiiij);
        }
        final List<RecyclerView.n> ljjzziii = this.LJJZZIII;
        if (ljjzziii != null) {
            for (int i = ljjzziii.size() - 1; i >= 0; --i) {
                this.LJJZZIII.get(i).LIZ(this, ljjliiiij);
            }
        }
    }
    
    public void setScrollingTouchSlop(final int n) {
        final ViewConfiguration value = ViewConfiguration.get(this.getContext());
        if (n != 1) {
            this.LJJLIIIJLLLLLLLZ = value.getScaledTouchSlop();
            return;
        }
        this.LJJLIIIJLLLLLLLZ = value.getScaledPagingTouchSlop();
    }
    
    public void setViewCacheExtension(final u ljii) {
        this.LJ.LJII = ljii;
    }
    
    public boolean startNestedScroll(final int n) {
        return this.getScrollingChildHelper().LIZ(n, 0);
    }
    
    public void stopNestedScroll() {
        this.getScrollingChildHelper().LIZIZ(0);
    }
    
    public final void suppressLayout(final boolean b) {
        if (b != this.LJJ) {
            this.LIZ("Do not suppressLayout in layout or scroll");
            if (!b) {
                this.LJJ = false;
                if (this.LJIL && this.LJIILJJIL != null && this.LJIILIIL != null) {
                    this.requestLayout();
                }
                this.LJIL = false;
                return;
            }
            final long uptimeMillis = SystemClock.uptimeMillis();
            this.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.LJJ = true;
            this.LJJJJLI = true;
            this.LJI();
        }
    }
    
    public static class RecycledViewPool
    {
        public int mAttachCount;
        public SparseArray<ScrapData> mScrap;
        
        static {
            Covode.recordClassIndex(1515);
        }
        
        public RecycledViewPool() {
            this.mScrap = (SparseArray<ScrapData>)new SparseArray();
            this.mAttachCount = 0;
        }
        
        private ScrapData getScrapDataForType(final int n) {
            ScrapData scrapData;
            if ((scrapData = (ScrapData)this.mScrap.get(n)) == null) {
                scrapData = new ScrapData();
                this.mScrap.put(n, (Object)scrapData);
            }
            return scrapData;
        }
        
        public void attach() {
            ++this.mAttachCount;
        }
        
        public void clear() {
            for (int i = 0; i < this.mScrap.size(); ++i) {
                ((ScrapData)this.mScrap.valueAt(i)).mScrapHeap.clear();
            }
        }
        
        public void detach() {
            --this.mAttachCount;
        }
        
        public void factorInBindTime(final int n, final long n2) {
            final ScrapData scrapDataForType = this.getScrapDataForType(n);
            scrapDataForType.mBindRunningAverageNs = this.runningAverage(scrapDataForType.mBindRunningAverageNs, n2);
        }
        
        public void factorInCreateTime(final int n, final long n2) {
            final ScrapData scrapDataForType = this.getScrapDataForType(n);
            scrapDataForType.mCreateRunningAverageNs = this.runningAverage(scrapDataForType.mCreateRunningAverageNs, n2);
        }
        
        public ViewHolder getRecycledView(int i) {
            final ScrapData scrapData = (ScrapData)this.mScrap.get(i);
            if (scrapData != null && !scrapData.mScrapHeap.isEmpty()) {
                final ArrayList<ViewHolder> mScrapHeap = scrapData.mScrapHeap;
                for (i = mScrapHeap.size() - 1; i >= 0; --i) {
                    if (!((ViewHolder)mScrapHeap.get(i)).isAttachedToTransitionOverlay()) {
                        return (ViewHolder)mScrapHeap.remove(i);
                    }
                }
            }
            return null;
        }
        
        public int getRecycledViewCount(final int n) {
            return this.getScrapDataForType(n).mScrapHeap.size();
        }
        
        public void onAdapterChanged(final a a, final a a2, final boolean b) {
            if (a != null) {
                this.detach();
            }
            if (!b && this.mAttachCount == 0) {
                this.clear();
            }
            if (a2 != null) {
                this.attach();
            }
        }
        
        public void putRecycledView(final ViewHolder viewHolder) {
            final int itemViewType = viewHolder.getItemViewType();
            final ArrayList<ViewHolder> mScrapHeap = this.getScrapDataForType(itemViewType).mScrapHeap;
            if (((ScrapData)this.mScrap.get(itemViewType)).mMaxScrap <= mScrapHeap.size()) {
                return;
            }
            viewHolder.resetInternal();
            mScrapHeap.add(viewHolder);
        }
        
        public long runningAverage(final long n, final long n2) {
            if (n == 0L) {
                return n2;
            }
            return n / 4L * 3L + n2 / 4L;
        }
        
        public void setMaxRecycledViews(final int n, final int mMaxScrap) {
            final ScrapData scrapDataForType = this.getScrapDataForType(n);
            scrapDataForType.mMaxScrap = mMaxScrap;
            final ArrayList<ViewHolder> mScrapHeap = scrapDataForType.mScrapHeap;
            while (mScrapHeap.size() > mMaxScrap) {
                mScrapHeap.remove(mScrapHeap.size() - 1);
            }
        }
        
        public int size() {
            int i = 0;
            int n = 0;
            while (i < this.mScrap.size()) {
                final ArrayList<ViewHolder> mScrapHeap = ((ScrapData)this.mScrap.valueAt(i)).mScrapHeap;
                int n2 = n;
                if (mScrapHeap != null) {
                    n2 = n + mScrapHeap.size();
                }
                ++i;
                n = n2;
            }
            return n;
        }
        
        public boolean willBindInTime(final int n, final long n2, final long n3) {
            final long mBindRunningAverageNs = this.getScrapDataForType(n).mBindRunningAverageNs;
            return mBindRunningAverageNs == 0L || n2 + mBindRunningAverageNs < n3;
        }
        
        public boolean willCreateInTime(final int n, final long n2, final long n3) {
            final long mCreateRunningAverageNs = this.getScrapDataForType(n).mCreateRunningAverageNs;
            return mCreateRunningAverageNs == 0L || n2 + mCreateRunningAverageNs < n3;
        }
        
        public static class ScrapData
        {
            public long mBindRunningAverageNs;
            public long mCreateRunningAverageNs;
            public int mMaxScrap;
            public final ArrayList<ViewHolder> mScrapHeap;
            
            static {
                Covode.recordClassIndex(1516);
            }
            
            public ScrapData() {
                this.mScrapHeap = new ArrayList<ViewHolder>();
                this.mMaxScrap = 5;
                this.mCreateRunningAverageNs = 0L;
                this.mBindRunningAverageNs = 0L;
            }
        }
    }
    
    public static class SavedState extends AbsSavedState
    {
        public static final Parcelable$Creator<SavedState> CREATOR;
        public Parcelable LIZ;
        
        static {
            Covode.recordClassIndex(1517);
            CREATOR = (Parcelable$Creator)new Parcelable$ClassLoaderCreator<SavedState>() {
                static {
                    Covode.recordClassIndex(1518);
                }
            };
        }
        
        public SavedState(final Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                classLoader = i.class.getClassLoader();
            }
            this.LIZ = parcel.readParcelable(classLoader);
        }
        
        public SavedState(final Parcelable parcelable) {
            super(parcelable);
        }
        
        @Override
        public void writeToParcel(final Parcel parcel, final int n) {
            super.writeToParcel(parcel, n);
            parcel.writeParcelable(this.LIZ, 0);
        }
    }
    
    public abstract static class ViewHolder
    {
        public static final List<Object> FULLUPDATE_PAYLOADS;
        public final View itemView;
        public a<? extends ViewHolder> mBindingAdapter;
        public int mFlags;
        public boolean mInChangeScrap;
        public int mIsRecyclableCount;
        public long mItemId;
        public int mItemViewType;
        public WeakReference<RecyclerView> mNestedRecyclerView;
        public int mOldPosition;
        public RecyclerView mOwnerRecyclerView;
        public List<Object> mPayloads;
        public int mPendingAccessibilityState;
        public int mPosition;
        public int mPreLayoutPosition;
        public o mScrapContainer;
        public ViewHolder mShadowedHolder;
        public ViewHolder mShadowingHolder;
        public List<Object> mUnmodifiedPayloads;
        public int mWasImportantForAccessibilityBeforeHidden;
        
        static {
            Covode.recordClassIndex(1519);
            FULLUPDATE_PAYLOADS = Collections.emptyList();
        }
        
        public ViewHolder(final View itemView) {
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mItemViewType = -1;
            this.mPreLayoutPosition = -1;
            this.mPendingAccessibilityState = -1;
            if (itemView != null) {
                this.itemView = itemView;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }
        
        public static String INVOKEVIRTUAL_androidx_recyclerview_widget_RecyclerView$ViewHolder_com_ss_android_ugc_aweme_lancet_RecyclerViewLancet_getSimpleName(final Class clazz) {
            if (2Ng.LIZ) {
                return clazz.getName();
            }
            return clazz.getSimpleName();
        }
        
        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                final ArrayList mPayloads = new ArrayList();
                this.mPayloads = mPayloads;
                this.mUnmodifiedPayloads = Collections.unmodifiableList((List<?>)mPayloads);
            }
        }
        
        public void addChangePayload(final Object o) {
            if (o == null) {
                this.addFlags(1024);
                return;
            }
            if ((0x400 & this.mFlags) == 0x0) {
                this.createPayloadsIfNeeded();
                this.mPayloads.add(o);
            }
        }
        
        public void addFlags(final int n) {
            this.mFlags |= n;
        }
        
        public void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }
        
        public void clearPayload() {
            final List<Object> mPayloads = this.mPayloads;
            if (mPayloads != null) {
                mPayloads.clear();
            }
            this.mFlags &= 0xFFFFFBFF;
        }
        
        public void clearReturnedFromScrapFlag() {
            this.mFlags &= 0xFFFFFFDF;
        }
        
        public void clearTmpDetachFlag() {
            this.mFlags &= 0xFFFFFEFF;
        }
        
        public boolean doesTransientStatePreventRecycling() {
            return (this.mFlags & 0x10) == 0x0 && this.itemView.hasTransientState();
        }
        
        public void flagRemovedAndOffsetPosition(final int mPosition, final int n, final boolean b) {
            this.addFlags(8);
            this.offsetPosition(n, b);
            this.mPosition = mPosition;
        }
        
        public final int getAbsoluteAdapterPosition() {
            final RecyclerView mOwnerRecyclerView = this.mOwnerRecyclerView;
            if (mOwnerRecyclerView == null) {
                return -1;
            }
            return mOwnerRecyclerView.LIZLLL(this);
        }
        
        public final int getAdapterPosition() {
            return this.getBindingAdapterPosition();
        }
        
        public final a<? extends ViewHolder> getBindingAdapter() {
            return this.mBindingAdapter;
        }
        
        public final int getBindingAdapterPosition() {
            if (this.mBindingAdapter == null) {
                return -1;
            }
            final RecyclerView mOwnerRecyclerView = this.mOwnerRecyclerView;
            if (mOwnerRecyclerView == null) {
                return -1;
            }
            final a adapter = mOwnerRecyclerView.getAdapter();
            if (adapter == null) {
                return -1;
            }
            final int lizlll = this.mOwnerRecyclerView.LIZLLL(this);
            if (lizlll == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn((a)this.mBindingAdapter, this, lizlll);
        }
        
        public final long getItemId() {
            return this.mItemId;
        }
        
        public final int getItemViewType() {
            return this.mItemViewType;
        }
        
        public final int getLayoutPosition() {
            int n;
            if ((n = this.mPreLayoutPosition) == -1) {
                n = this.mPosition;
            }
            return n;
        }
        
        public final int getOldPosition() {
            return this.mOldPosition;
        }
        
        public final int getPosition() {
            int n;
            if ((n = this.mPreLayoutPosition) == -1) {
                n = this.mPosition;
            }
            return n;
        }
        
        public List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & 0x400) != 0x0) {
                return ViewHolder.FULLUPDATE_PAYLOADS;
            }
            final List<Object> mPayloads = this.mPayloads;
            if (mPayloads == null || mPayloads.size() == 0) {
                return ViewHolder.FULLUPDATE_PAYLOADS;
            }
            return this.mUnmodifiedPayloads;
        }
        
        public boolean hasAnyOfTheFlags(final int n) {
            return (n & this.mFlags) != 0x0;
        }
        
        public boolean isAdapterPositionUnknown() {
            return (this.mFlags & 0x200) != 0x0 || this.isInvalid();
        }
        
        public boolean isAttachedToTransitionOverlay() {
            return this.itemView.getParent() != null && this.itemView.getParent() != this.mOwnerRecyclerView;
        }
        
        public boolean isBound() {
            return (this.mFlags & 0x1) != 0x0;
        }
        
        public boolean isInvalid() {
            return (this.mFlags & 0x4) != 0x0;
        }
        
        public final boolean isRecyclable() {
            return (this.mFlags & 0x10) == 0x0 && !this.itemView.hasTransientState();
        }
        
        public boolean isRemoved() {
            return (this.mFlags & 0x8) != 0x0;
        }
        
        public boolean isScrap() {
            return this.mScrapContainer != null;
        }
        
        public boolean isTmpDetached() {
            return (this.mFlags & 0x100) != 0x0;
        }
        
        public boolean isUpdated() {
            return (this.mFlags & 0x2) != 0x0;
        }
        
        public boolean needsUpdate() {
            return (this.mFlags & 0x2) != 0x0;
        }
        
        public void offsetPosition(final int n, final boolean b) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (b) {
                this.mPreLayoutPosition += n;
            }
            this.mPosition += n;
            if (this.itemView.getLayoutParams() != null) {
                ((j)this.itemView.getLayoutParams()).LJ = true;
            }
        }
        
        public void onEnteredHiddenState(final RecyclerView recyclerView) {
            final int mPendingAccessibilityState = this.mPendingAccessibilityState;
            if (mPendingAccessibilityState != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = mPendingAccessibilityState;
            }
            else {
                this.mWasImportantForAccessibilityBeforeHidden = this.itemView.getImportantForAccessibility();
            }
            recyclerView.LIZ(this, 4);
        }
        
        public void onLeftHiddenState(final RecyclerView recyclerView) {
            recyclerView.LIZ(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }
        
        public void resetInternal() {
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            this.clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.LIZJ(this);
        }
        
        public void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }
        
        public void setFlags(final int n, final int n2) {
            this.mFlags = ((n & n2) | (this.mFlags & ~n2));
        }
        
        public final void setIsRecyclable(final boolean b) {
            int mIsRecyclableCount = this.mIsRecyclableCount;
            if (b) {
                --mIsRecyclableCount;
            }
            else {
                ++mIsRecyclableCount;
            }
            this.mIsRecyclableCount = mIsRecyclableCount;
            if (mIsRecyclableCount < 0) {
                this.mIsRecyclableCount = 0;
                return;
            }
            if (!b) {
                if (mIsRecyclableCount == 1) {
                    this.mFlags |= 0x10;
                }
            }
            else if (mIsRecyclableCount == 0) {
                this.mFlags &= 0xFFFFFFEF;
            }
        }
        
        public void setScrapContainer(final o mScrapContainer, final boolean mInChangeScrap) {
            this.mScrapContainer = mScrapContainer;
            this.mInChangeScrap = mInChangeScrap;
        }
        
        public boolean shouldBeKeptAsChild() {
            return (this.mFlags & 0x10) != 0x0;
        }
        
        public boolean shouldIgnore() {
            return (this.mFlags & 0x80) != 0x0;
        }
        
        public void stopIgnoring() {
            this.mFlags &= 0xFFFFFF7F;
        }
        
        @Override
        public String toString() {
            String invokevirtual_androidx_recyclerview_widget_RecyclerView$ViewHolder_com_ss_android_ugc_aweme_lancet_RecyclerViewLancet_getSimpleName;
            if (this.getClass().isAnonymousClass()) {
                invokevirtual_androidx_recyclerview_widget_RecyclerView$ViewHolder_com_ss_android_ugc_aweme_lancet_RecyclerViewLancet_getSimpleName = "ViewHolder";
            }
            else {
                invokevirtual_androidx_recyclerview_widget_RecyclerView$ViewHolder_com_ss_android_ugc_aweme_lancet_RecyclerViewLancet_getSimpleName = INVOKEVIRTUAL_androidx_recyclerview_widget_RecyclerView$ViewHolder_com_ss_android_ugc_aweme_lancet_RecyclerViewLancet_getSimpleName(this.getClass());
            }
            final StringBuilder sb = new StringBuilder();
            sb.append(invokevirtual_androidx_recyclerview_widget_RecyclerView$ViewHolder_com_ss_android_ugc_aweme_lancet_RecyclerViewLancet_getSimpleName);
            sb.append("{");
            sb.append(Integer.toHexString(this.hashCode()));
            sb.append(" position=");
            sb.append(this.mPosition);
            sb.append(" id=");
            sb.append(this.mItemId);
            sb.append(", oldPos=");
            sb.append(this.mOldPosition);
            sb.append(", pLpos:");
            sb.append(this.mPreLayoutPosition);
            final StringBuilder sb2 = new StringBuilder(sb.toString());
            if (this.isScrap()) {
                sb2.append(" scrap ");
                String s;
                if (this.mInChangeScrap) {
                    s = "[changeScrap]";
                }
                else {
                    s = "[attachedScrap]";
                }
                sb2.append(s);
            }
            if (this.isInvalid()) {
                sb2.append(" invalid");
            }
            if (!this.isBound()) {
                sb2.append(" unbound");
            }
            if (this.needsUpdate()) {
                sb2.append(" update");
            }
            if (this.isRemoved()) {
                sb2.append(" removed");
            }
            if (this.shouldIgnore()) {
                sb2.append(" ignored");
            }
            if (this.isTmpDetached()) {
                sb2.append(" tmpDetached");
            }
            if (!this.isRecyclable()) {
                final StringBuilder sb3 = new StringBuilder(" not recyclable(");
                sb3.append(this.mIsRecyclableCount);
                sb3.append(")");
                sb2.append(sb3.toString());
            }
            if (this.isAdapterPositionUnknown()) {
                sb2.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }
        
        public void unScrap() {
            this.mScrapContainer.LIZIZ(this);
        }
        
        public boolean wasReturnedFromScrap() {
            return (this.mFlags & 0x20) != 0x0;
        }
    }
    
    public abstract static class f
    {
        public ArrayList<f.a> LIZ;
        public f.b LJII;
        public long LJIIIIZZ;
        public long LJIIIZ;
        public long LJIIJ;
        public long LJIIJJI;
        
        static {
            Covode.recordClassIndex(1526);
        }
        
        public f() {
            ((f)this).LIZ = new ArrayList<f.a>();
            ((f)this).LJIIIIZZ = 120L;
            ((f)this).LJIIIZ = 120L;
            ((f)this).LJIIJ = 250L;
            ((f)this).LJIIJJI = 250L;
        }
        
        public static int LJFF(final ViewHolder viewHolder) {
            final int n = viewHolder.mFlags & 0xE;
            if (viewHolder.isInvalid()) {
                return 4;
            }
            int n2 = n;
            if ((n & 0x4) == 0x0) {
                final int oldPosition = viewHolder.getOldPosition();
                final int absoluteAdapterPosition = viewHolder.getAbsoluteAdapterPosition();
                n2 = n;
                if (oldPosition != -1) {
                    n2 = n;
                    if (absoluteAdapterPosition != -1) {
                        n2 = n;
                        if (oldPosition != absoluteAdapterPosition) {
                            n2 = (n | 0x800);
                        }
                    }
                }
            }
            return n2;
        }
        
        public abstract void LIZ();
        
        public final boolean LIZ(final f.a a) {
            final boolean liziz = this.LIZIZ();
            if (a != null) {
                if (!liziz) {
                    a.LIZ();
                }
                else {
                    ((f)this).LIZ.add(a);
                }
            }
            return liziz;
        }
        
        public abstract boolean LIZ(final ViewHolder p0, final c p1, final c p2);
        
        public abstract boolean LIZ(final ViewHolder p0, final ViewHolder p1, final c p2, final c p3);
        
        public boolean LIZ(final ViewHolder viewHolder, final List<Object> list) {
            return this.LJII(viewHolder);
        }
        
        public abstract boolean LIZIZ();
        
        public abstract boolean LIZIZ(final ViewHolder p0, final c p1, final c p2);
        
        public abstract void LIZJ(final ViewHolder p0);
        
        public abstract boolean LIZJ(final ViewHolder p0, final c p1, final c p2);
        
        public final c LIZLLL(final ViewHolder viewHolder) {
            final c c = new c();
            c.LIZ(viewHolder);
            return (c)c;
        }
        
        public abstract void LIZLLL();
        
        public final c LJ(final ViewHolder viewHolder) {
            final c c = new c();
            c.LIZ(viewHolder);
            return (c)c;
        }
        
        public final void LJ() {
            for (int size = ((f)this).LIZ.size(), i = 0; i < size; ++i) {
                ((f)this).LIZ.get(i).LIZ();
            }
            ((f)this).LIZ.clear();
        }
        
        public final void LJI(final ViewHolder viewHolder) {
            final f.b ljii = ((f)this).LJII;
            if (ljii != null) {
                ljii.LIZ(viewHolder);
            }
        }
        
        public boolean LJII(final ViewHolder viewHolder) {
            return true;
        }
        
        public static final class c
        {
            public int LIZ;
            public int LIZIZ;
            
            static {
                Covode.recordClassIndex(1529);
            }
            
            public final c LIZ(final ViewHolder viewHolder) {
                final View itemView = viewHolder.itemView;
                ((c)this).LIZ = itemView.getLeft();
                ((c)this).LIZIZ = itemView.getTop();
                itemView.getRight();
                itemView.getBottom();
                return (c)this;
            }
        }
    }
    
    public abstract static class i
    {
        public final 0Ej.b LIZ;
        public final 0Ej.b LIZIZ;
        public 0Ey LJIJJLI;
        public RecyclerView LJIL;
        public 0Ej LJJ;
        public 0Ej LJJI;
        public s LJJIFFI;
        public boolean LJJII;
        public boolean LJJIII;
        public boolean LJJIIJ;
        public boolean LJJIIJZLJL;
        public boolean LJJIIZ;
        public int LJJIIZI;
        public boolean LJJIJ;
        public int LJJIJIIJI;
        public int LJJIJIIJIL;
        public int LJJIJIL;
        public int LJJIJL;
        
        static {
            Covode.recordClassIndex(1532);
        }
        
        public i() {
            final 16k liz = new 16k((i)this);
            ((i)this).LIZ = liz;
            final 16l liziz = new 16l((i)this);
            ((i)this).LIZIZ = liziz;
            ((i)this).LJJ = new 0Ej((0Ej.b)liz);
            ((i)this).LJJI = new 0Ej((0Ej.b)liziz);
            ((i)this).LJJII = false;
            ((i)this).LJJIII = false;
            ((i)this).LJJIIJ = false;
            ((i)this).LJJIIJZLJL = true;
            ((i)this).LJJIIZ = true;
        }
        
        public static int LIZ(int n, final int n2, final int n3) {
            final int mode = View$MeasureSpec.getMode(n);
            n = View$MeasureSpec.getSize(n);
            if (mode != Integer.MIN_VALUE) {
                if (mode != 1073741824) {
                    n = Math.max(n2, n3);
                }
                return n;
            }
            return Math.min(n, Math.max(n2, n3));
        }
        
        public static int LIZ(int n, final int n2, int max, int n3, final boolean b) {
            max = Math.max(0, n - max);
            Label_0110: {
                Label_0095: {
                    Label_0040: {
                        if (b) {
                            if (n3 < 0) {
                                if (n3 == -1) {
                                    n = n2;
                                    if (n2 != Integer.MIN_VALUE && (n = n2) != 1073741824) {
                                        break Label_0095;
                                    }
                                    break Label_0040;
                                }
                                else {
                                    if (n3 == -2) {
                                        n3 = 0;
                                        break Label_0110;
                                    }
                                    break Label_0095;
                                }
                            }
                        }
                        else if (n3 < 0) {
                            if (n3 == -1) {
                                n = n2;
                                break Label_0040;
                            }
                            if (n3 != -2) {
                                break Label_0095;
                            }
                            if (n2 == Integer.MIN_VALUE || n2 == 1073741824) {
                                n = Integer.MIN_VALUE;
                                break Label_0040;
                            }
                            n3 = max;
                            break Label_0110;
                        }
                        n = 1073741824;
                        return View$MeasureSpec.makeMeasureSpec(n3, n);
                    }
                    n3 = max;
                    return View$MeasureSpec.makeMeasureSpec(n3, n);
                }
                n = 0;
                n3 = 0;
                return View$MeasureSpec.makeMeasureSpec(n3, n);
            }
            n = 0;
            return View$MeasureSpec.makeMeasureSpec(n3, n);
        }
        
        public static i.b LIZ(final Context context, final AttributeSet set, final int n, final int n2) {
            final i.b b = new i.b();
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, new int[] { 16842948, 16842987, 16842993, 2130969557, 2130969558, 2130969559, 2130969560, 2130969561, 2130969781, 2130970828, 2130971008, 2130971085 }, n, n2);
            b.LIZ = obtainStyledAttributes.getInt(0, 1);
            b.LIZIZ = obtainStyledAttributes.getInt(10, 1);
            b.LIZJ = obtainStyledAttributes.getBoolean(9, false);
            b.LIZLLL = obtainStyledAttributes.getBoolean(11, false);
            obtainStyledAttributes.recycle();
            return b;
        }
        
        private void LIZ(final int n) {
            if (this.LJI(n) != null) {
                ((i)this).LJIJJLI.LIZ(n);
            }
        }
        
        private void LIZ(final int n, final int n2) {
            final View lji = this.LJI(n);
            if (lji != null) {
                this.LIZIZ(n);
                this.LIZIZ(lji, n2);
                return;
            }
            final StringBuilder sb = new StringBuilder("Cannot move a child from non-existing index:");
            sb.append(n);
            sb.append(((i)this).LJIL.toString());
            throw new IllegalArgumentException(sb.toString());
        }
        
        private void LIZ(final View view, final int n, final boolean b) {
            final ViewHolder lizj = RecyclerView.LIZJ(view);
            if (b || lizj.isRemoved()) {
                ((i)this).LJIL.LJIIIIZZ.LIZJ(lizj);
            }
            else {
                ((i)this).LJIL.LJIIIIZZ.LIZLLL(lizj);
            }
            final j j = (j)view.getLayoutParams();
            if (lizj.wasReturnedFromScrap() || lizj.isScrap()) {
                if (lizj.isScrap()) {
                    lizj.unScrap();
                }
                else {
                    lizj.clearReturnedFromScrapFlag();
                }
                ((i)this).LJIJJLI.LIZ(view, n, view.getLayoutParams(), false);
            }
            else if (view.getParent() == ((i)this).LJIL) {
                final int lizj2 = ((i)this).LJIJJLI.LIZJ(view);
                int liz;
                if ((liz = n) == -1) {
                    liz = ((i)this).LJIJJLI.LIZ();
                }
                if (lizj2 == -1) {
                    final StringBuilder sb = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    sb.append(((i)this).LJIL.indexOfChild(view));
                    sb.append(((i)this).LJIL.LIZ());
                    throw new IllegalStateException(sb.toString());
                }
                if (lizj2 != liz) {
                    ((i)((i)this).LJIL.LJIILJJIL).LIZ(lizj2, liz);
                }
            }
            else {
                ((i)this).LJIJJLI.LIZ(view, n, false);
                j.LJ = true;
                final s ljjiffi = ((i)this).LJJIFFI;
                if (ljjiffi != null && ljjiffi.LJIIJ) {
                    ((i)this).LJJIFFI.LIZ(view);
                }
            }
            if (j.LJFF) {
                lizj.itemView.invalidate();
                j.LJFF = false;
            }
        }
        
        private void LIZIZ(final int n) {
            this.LJI(n);
            this.LIZLLL(n);
        }
        
        private void LIZIZ(final View view, final int n) {
            final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
            final ViewHolder lizj = RecyclerView.LIZJ(view);
            if (lizj.isRemoved()) {
                ((i)this).LJIL.LJIIIIZZ.LIZJ(lizj);
            }
            else {
                ((i)this).LJIL.LJIIIIZZ.LIZLLL(lizj);
            }
            ((i)this).LJIJJLI.LIZ(view, n, layoutParams, lizj.isRemoved());
        }
        
        public static boolean LIZIZ(final int n, int size, final int n2) {
            final int mode = View$MeasureSpec.getMode(size);
            size = View$MeasureSpec.getSize(size);
            if (n2 > 0 && n != n2) {
                return false;
            }
            if (mode != Integer.MIN_VALUE) {
                return mode == 0 || (mode == 1073741824 && size == n);
            }
            return size >= n;
        }
        
        private int[] LIZJ(final View view, final Rect rect) {
            final int ljijj = this.LJIJJ();
            final int ljijjli = this.LJIJJLI();
            final int ljjijil = ((i)this).LJJIJIL;
            final int ljil = this.LJIL();
            final int ljjijl = ((i)this).LJJIJL;
            final int ljj = this.LJJ();
            final int n = view.getLeft() + rect.left - view.getScrollX();
            final int n2 = view.getTop() + rect.top - view.getScrollY();
            final int width = rect.width();
            final int height = rect.height();
            final int n3 = n - ljijj;
            int n4 = Math.min(0, n3);
            final int n5 = n2 - ljijjli;
            int n6 = Math.min(0, n5);
            final int n7 = width + n - (ljjijil - ljil);
            final int max = Math.max(0, n7);
            final int max2 = Math.max(0, height + n2 - (ljjijl - ljj));
            if (this.LJIIZILJ() == 1) {
                if (max != 0) {
                    n4 = max;
                }
                else {
                    n4 = Math.max(n4, n7);
                }
            }
            else if (n4 == 0) {
                n4 = Math.min(n3, max);
            }
            if (n6 == 0) {
                n6 = Math.min(n5, max2);
            }
            return new int[] { n4, n6 };
        }
        
        private void LIZLLL(final int n) {
            ((i)this).LJIJJLI.LIZLLL(n);
        }
        
        private boolean LIZLLL(final RecyclerView recyclerView, final int n, final int n2) {
            final View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            final int ljijj = this.LJIJJ();
            final int ljijjli = this.LJIJJLI();
            final int ljjijil = ((i)this).LJJIJIL;
            final int ljil = this.LJIL();
            final int ljjijl = ((i)this).LJJIJL;
            final int ljj = this.LJJ();
            final Rect ljiijji = ((i)this).LJIL.LJIIJJI;
            RecyclerView.LIZ(focusedChild, ljiijji);
            return ljiijji.left - n < ljjijil - ljil && ljiijji.right - n > ljijj && ljiijji.top - n2 < ljjijl - ljj && ljiijji.bottom - n2 > ljijjli;
        }
        
        public int LIZ(final int n, final o o, final t t) {
            return 0;
        }
        
        public int LIZ(final o o, final t t) {
            return -1;
        }
        
        public j LIZ(final Context context, final AttributeSet set) {
            return new j(context, set);
        }
        
        public j LIZ(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
            if (viewGroup$LayoutParams instanceof j) {
                return new j((j)viewGroup$LayoutParams);
            }
            if (viewGroup$LayoutParams instanceof ViewGroup$MarginLayoutParams) {
                return new j((ViewGroup$MarginLayoutParams)viewGroup$LayoutParams);
            }
            return new j(viewGroup$LayoutParams);
        }
        
        public View LIZ(final View view, final int n, final o o, final t t) {
            return null;
        }
        
        public void LIZ(final int n, final int n2, final t t, final i.a a) {
        }
        
        public void LIZ(final int n, final i.a a) {
        }
        
        public final void LIZ(final int n, final o o) {
            final View lji = this.LJI(n);
            this.LIZ(n);
            o.LIZ(lji);
        }
        
        public void LIZ(final a a, final a a2) {
        }
        
        public final void LIZ(final o o) {
            for (int i = this.LJIJI() - 1; i >= 0; --i) {
                final View lji = this.LJI(i);
                final ViewHolder lizj = RecyclerView.LIZJ(lji);
                if (!lizj.shouldIgnore()) {
                    if (lizj.isInvalid() && !lizj.isRemoved() && !((i)this).LJIL.LJIILIIL.mHasStableIds) {
                        this.LIZ(i);
                        o.LIZ(lizj);
                    }
                    else {
                        this.LIZIZ(i);
                        o.LIZJ(lji);
                        ((i)this).LJIL.LJIIIIZZ.LIZLLL(lizj);
                    }
                }
            }
        }
        
        public void LIZ(final o o, final t t, final int n, final int n2) {
            ((i)this).LJIL.LJ(n, n2);
        }
        
        public void LIZ(final o o, final t t, final View view, final 07e 07e) {
        }
        
        public final void LIZ(final s ljjiffi) {
            final s ljjiffi2 = ((i)this).LJJIFFI;
            if (ljjiffi2 != null && ljjiffi != ljjiffi2 && ljjiffi2.LJIIJ) {
                ((i)this).LJJIFFI.LIZLLL();
            }
            ((i)this).LJJIFFI = ljjiffi;
            final RecyclerView ljil = ((i)this).LJIL;
            ljil.LJJIIJZLJL.LIZIZ();
            ljjiffi.LJII = ljil;
            ljjiffi.LJIIIIZZ = (i)this;
            if (ljjiffi.LJI != -1) {
                ljjiffi.LJII.LJJIJ.LIZ = ljjiffi.LJI;
                ljjiffi.LJIIJ = true;
                ljjiffi.LJIIIZ = true;
                ljjiffi.LJIIJJI = ((i)ljjiffi.LJII.LJIILJJIL).LIZJ(ljjiffi.LJI);
                ljjiffi.LJII.LJJIIJZLJL.LIZ();
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }
        
        public void LIZ(final t t) {
        }
        
        public void LIZ(final Rect rect, final int n, final int n2) {
            this.LIZLLL(LIZ(n, rect.width() + this.LJIJJ() + this.LJIL(), ((View)((i)this).LJIL).getMinimumWidth()), LIZ(n2, rect.height() + this.LJIJJLI() + this.LJJ(), ((View)((i)this).LJIL).getMinimumHeight()));
        }
        
        public void LIZ(final Parcelable parcelable) {
        }
        
        public final void LIZ(final View view, final int n) {
            this.LIZ(view, n, false);
        }
        
        public final void LIZ(final View view, final int n, final int n2, final int n3, final int n4) {
            final Rect lizlll = ((j)view.getLayoutParams()).LIZLLL;
            view.layout(n + lizlll.left, n2 + lizlll.top, n3 - lizlll.right, n4 - lizlll.bottom);
        }
        
        public final void LIZ(final View view, final 07e 07e) {
            final ViewHolder lizj = RecyclerView.LIZJ(view);
            if (lizj != null && !lizj.isRemoved() && !((i)this).LJIJJLI.LIZLLL(lizj.itemView)) {
                this.LIZ(((i)this).LJIL.LJ, ((i)this).LJIL.LJJIJ, view, 07e);
            }
        }
        
        public final void LIZ(final View view, final o o) {
            this.LJFF(view);
            o.LIZ(view);
        }
        
        public final void LIZ(final View view, final Rect rect) {
            final Rect lizlll = ((j)view.getLayoutParams()).LIZLLL;
            rect.set(-lizlll.left, -lizlll.top, view.getWidth() + lizlll.right, view.getHeight() + lizlll.bottom);
            if (((i)this).LJIL != null) {
                final Matrix matrix = view.getMatrix();
                if (matrix != null && !matrix.isIdentity()) {
                    final RectF ljiil = ((i)this).LJIL.LJIIL;
                    ljiil.set(rect);
                    matrix.mapRect(ljiil);
                    rect.set((int)Math.floor(ljiil.left), (int)Math.floor(ljiil.top), (int)Math.ceil(ljiil.right), (int)Math.ceil(ljiil.bottom));
                }
            }
            rect.offset(view.getLeft(), view.getTop());
        }
        
        public void LIZ(final AccessibilityEvent accessibilityEvent) {
            final RecyclerView ljil = ((i)this).LJIL;
            if (ljil != null && accessibilityEvent != null) {
                boolean scrollable;
                final boolean b = scrollable = true;
                if (!ljil.canScrollVertically(1)) {
                    scrollable = b;
                    if (!((i)this).LJIL.canScrollVertically(-1)) {
                        scrollable = b;
                        if (!((i)this).LJIL.canScrollHorizontally(-1)) {
                            scrollable = (((i)this).LJIL.canScrollHorizontally(1) && b);
                        }
                    }
                }
                accessibilityEvent.setScrollable(scrollable);
                if (((i)this).LJIL.LJIILIIL != null) {
                    accessibilityEvent.setItemCount(((a)((i)this).LJIL.LJIILIIL).getItemCount());
                }
            }
        }
        
        public final void LIZ(final RecyclerView ljil) {
            if (ljil == null) {
                ((i)this).LJIL = null;
                ((i)this).LJIJJLI = null;
                ((i)this).LJJIJIL = 0;
                ((i)this).LJJIJL = 0;
            }
            else {
                ((i)this).LJIL = ljil;
                ((i)this).LJIJJLI = ljil.LJII;
                ((i)this).LJJIJIL = ljil.getWidth();
                ((i)this).LJJIJL = ljil.getHeight();
            }
            ((i)this).LJJIJIIJI = 1073741824;
            ((i)this).LJJIJIIJIL = 1073741824;
        }
        
        public void LIZ(final RecyclerView recyclerView, final int n, final int n2) {
        }
        
        public void LIZ(final RecyclerView recyclerView, final int n, final int n2, final int n3) {
        }
        
        public void LIZ(final RecyclerView recyclerView, final int n, final int n2, final Object o) {
            this.LIZJ(recyclerView, n, n2);
        }
        
        public void LIZ(final RecyclerView recyclerView, final o o) {
        }
        
        public void LIZ(final RecyclerView recyclerView, final t t, final int n) {
        }
        
        public void LIZ(final String s) {
            final RecyclerView ljil = ((i)this).LJIL;
            if (ljil != null) {
                ljil.LIZ(s);
            }
        }
        
        public boolean LIZ(final j j) {
            return j != null;
        }
        
        public final boolean LIZ(final View view, final int n, final int n2, final j j) {
            return !((i)this).LJJIIJZLJL || !LIZIZ(view.getMeasuredWidth(), n, j.width) || !LIZIZ(view.getMeasuredHeight(), n2, j.height);
        }
        
        public final boolean LIZ(final RecyclerView recyclerView, final View view, final Rect rect, final boolean b, final boolean b2) {
            final int[] lizj = this.LIZJ(view, rect);
            final int n = lizj[0];
            final int n2 = lizj[1];
            if ((!b2 || this.LIZLLL(recyclerView, n, n2)) && (n != 0 || n2 != 0)) {
                if (b) {
                    recyclerView.scrollBy(n, n2);
                }
                else {
                    recyclerView.LIZ(n, n2);
                }
                return true;
            }
            return false;
        }
        
        public final boolean LIZ(final Runnable runnable) {
            final RecyclerView ljil = ((i)this).LJIL;
            return ljil != null && ljil.removeCallbacks(runnable);
        }
        
        public int LIZIZ(final int n, final o o, final t t) {
            return 0;
        }
        
        public int LIZIZ(final o o, final t t) {
            return -1;
        }
        
        public int LIZIZ(final t t) {
            return 0;
        }
        
        public abstract j LIZIZ();
        
        public final void LIZIZ(final o o) {
            final int size = o.LIZ.size();
            for (int i = size - 1; i >= 0; --i) {
                final View itemView = o.LIZ.get(i).itemView;
                final ViewHolder lizj = RecyclerView.LIZJ(itemView);
                if (!lizj.shouldIgnore()) {
                    lizj.setIsRecyclable(false);
                    if (lizj.isTmpDetached()) {
                        ((i)this).LJIL.removeDetachedView(itemView, false);
                    }
                    if (((i)this).LJIL.LJJIIJ != null) {
                        ((i)this).LJIL.LJJIIJ.LIZJ(lizj);
                    }
                    lizj.setIsRecyclable(true);
                    o.LIZIZ(itemView);
                }
            }
            o.LIZ.clear();
            if (o.LIZIZ != null) {
                o.LIZIZ.clear();
            }
            if (size > 0) {
                ((i)this).LJIL.invalidate();
            }
        }
        
        public void LIZIZ(final View view, final int n, final int n2, final int n3, final int n4) {
            final j j = (j)view.getLayoutParams();
            final Rect lizlll = j.LIZLLL;
            view.layout(n + lizlll.left + j.leftMargin, n2 + lizlll.top + j.topMargin, n3 - lizlll.right - j.rightMargin, n4 - lizlll.bottom - j.bottomMargin);
        }
        
        public final void LIZIZ(final View view, final Rect rect) {
            final RecyclerView ljil = ((i)this).LJIL;
            if (ljil == null) {
                rect.set(0, 0, 0, 0);
                return;
            }
            rect.set(ljil.LJFF(view));
        }
        
        public final void LIZIZ(final RecyclerView recyclerView) {
            ((i)this).LJJIII = true;
            this.LIZJ(recyclerView);
        }
        
        public void LIZIZ(final RecyclerView recyclerView, final int n, final int n2) {
        }
        
        public final void LIZIZ(final RecyclerView recyclerView, final o o) {
            ((i)this).LJJIII = false;
            this.LIZ(recyclerView, o);
        }
        
        public final boolean LIZIZ(final View view, final int n, final int n2, final j j) {
            return view.isLayoutRequested() || !((i)this).LJJIIJZLJL || !LIZIZ(view.getWidth(), n, j.width) || !LIZIZ(view.getHeight(), n2, j.height);
        }
        
        public int LIZJ(final t t) {
            return 0;
        }
        
        public View LIZJ(final int n) {
            for (int ljiji = this.LJIJI(), i = 0; i < ljiji; ++i) {
                final View lji = this.LJI(i);
                final ViewHolder lizj = RecyclerView.LIZJ(lji);
                if (lizj != null && lizj.getLayoutPosition() == n && !lizj.shouldIgnore() && (((i)this).LJIL.LJJIJ.LJI || !lizj.isRemoved())) {
                    return lji;
                }
            }
            return null;
        }
        
        public final void LIZJ(final int n, final int n2) {
            final int ljiji = this.LJIJI();
            if (ljiji == 0) {
                ((i)this).LJIL.LJ(n, n2);
                return;
            }
            int i = 0;
            int n3 = Integer.MIN_VALUE;
            int n4 = Integer.MIN_VALUE;
            int n5 = Integer.MAX_VALUE;
            int n6 = Integer.MAX_VALUE;
            while (i < ljiji) {
                final View lji = this.LJI(i);
                final Rect ljiijji = ((i)this).LJIL.LJIIJJI;
                RecyclerView.LIZ(lji, ljiijji);
                int left;
                if (ljiijji.left < (left = n5)) {
                    left = ljiijji.left;
                }
                int right;
                if (ljiijji.right > (right = n3)) {
                    right = ljiijji.right;
                }
                int top;
                if (ljiijji.top < (top = n6)) {
                    top = ljiijji.top;
                }
                int bottom;
                if (ljiijji.bottom > (bottom = n4)) {
                    bottom = ljiijji.bottom;
                }
                ++i;
                n6 = top;
                n5 = left;
                n4 = bottom;
                n3 = right;
            }
            ((i)this).LJIL.LJIIJJI.set(n5, n6, n3, n4);
            this.LIZ(((i)this).LJIL.LJIIJJI, n, n2);
        }
        
        public final void LIZJ(final o o) {
            for (int i = this.LJIJI() - 1; i >= 0; --i) {
                if (!RecyclerView.LIZJ(this.LJI(i)).shouldIgnore()) {
                    this.LIZ(i, o);
                }
            }
        }
        
        public void LIZJ(final o o, final t t) {
        }
        
        public final void LIZJ(final View view) {
            this.LIZ(view, -1, true);
        }
        
        public void LIZJ(final RecyclerView recyclerView) {
        }
        
        public void LIZJ(final RecyclerView recyclerView, final int n, final int n2) {
        }
        
        public int LIZLLL(final t t) {
            return 0;
        }
        
        public final void LIZLLL(final int n, final int n2) {
            RecyclerView.LIZ(((i)this).LJIL, n, n2);
        }
        
        public final void LIZLLL(final View view) {
            this.LIZ(view, 0, true);
        }
        
        public final void LIZLLL(final RecyclerView recyclerView) {
            this.a_(View$MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View$MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }
        
        public int LJ(final t t) {
            return 0;
        }
        
        public Parcelable LJ() {
            return null;
        }
        
        public void LJ(final int n) {
        }
        
        public final void LJ(final View view) {
            this.LIZ(view, -1, false);
        }
        
        public int LJFF(final t t) {
            return 0;
        }
        
        public final void LJFF(final View view) {
            final 0Ey ljijjli = ((i)this).LJIJJLI;
            final int liz = ljijjli.LIZ.LIZ(view);
            if (liz >= 0) {
                if (ljijjli.LIZIZ.LIZLLL(liz)) {
                    ljijjli.LIZIZ(view);
                }
                ljijjli.LIZ.LIZ(liz);
            }
        }
        
        public boolean LJFF() {
            return false;
        }
        
        public int LJI(final t t) {
            return 0;
        }
        
        public final int LJI(final View view) {
            return ((j)view.getLayoutParams()).LIZJ.getLayoutPosition();
        }
        
        public final View LJI(final int n) {
            final 0Ey ljijjli = ((i)this).LJIJJLI;
            if (ljijjli != null) {
                return ljijjli.LIZIZ(n);
            }
            return null;
        }
        
        public boolean LJI() {
            return false;
        }
        
        public final int LJII(final View view) {
            return RecyclerView.LIZJ(view).getItemViewType();
        }
        
        public void LJII(final int n) {
            final RecyclerView ljil = ((i)this).LJIL;
            if (ljil != null) {
                for (int liz = ljil.LJII.LIZ(), i = 0; i < liz; ++i) {
                    ljil.LJII.LIZIZ(i).offsetLeftAndRight(n);
                }
            }
        }
        
        public final View LJIIIIZZ(View liziz) {
            final RecyclerView ljil = ((i)this).LJIL;
            if (ljil == null) {
                return null;
            }
            liziz = ljil.LIZIZ(liziz);
            if (liziz == null) {
                return null;
            }
            if (((i)this).LJIJJLI.LIZLLL(liziz)) {
                return null;
            }
            return liziz;
        }
        
        public void LJIIIIZZ(final int n) {
            final RecyclerView ljil = ((i)this).LJIL;
            if (ljil != null) {
                for (int liz = ljil.LJII.LIZ(), i = 0; i < liz; ++i) {
                    ljil.LJII.LIZIZ(i).offsetTopAndBottom(n);
                }
            }
        }
        
        public void LJIIIZ(final int n) {
        }
        
        public final void LJIIIZ(final View view) {
            final int lizj = ((i)this).LJIJJLI.LIZJ(view);
            if (lizj >= 0) {
                this.LIZLLL(lizj);
            }
        }
        
        public final void LJIIJ(final View view) {
            this.LIZIZ(view, -1);
        }
        
        public final void LJIIJJI(final View view) {
            final ViewParent parent = view.getParent();
            final RecyclerView ljil = ((i)this).LJIL;
            if (parent == ljil && ljil.indexOfChild(view) != -1) {
                final ViewHolder lizj = RecyclerView.LIZJ(view);
                lizj.addFlags(128);
                ((i)this).LJIL.LJIIIIZZ.LJ(lizj);
                return;
            }
            final StringBuilder sb = new StringBuilder("View should be fully attached to be ignored");
            sb.append(((i)this).LJIL.LIZ());
            throw new IllegalArgumentException(sb.toString());
        }
        
        public final void LJIIL(final View view) {
            final ViewHolder lizj = RecyclerView.LIZJ(view);
            lizj.stopIgnoring();
            lizj.resetInternal();
            lizj.addFlags(4);
        }
        
        public final void LJIILIIL(final View view) {
            final j j = (j)view.getLayoutParams();
            final Rect ljff = ((i)this).LJIL.LJFF(view);
            final int left = ljff.left;
            final int right = ljff.right;
            final int top = ljff.top;
            final int bottom = ljff.bottom;
            final int liz = LIZ(((i)this).LJJIJIL, ((i)this).LJJIJIIJI, this.LJIJJ() + this.LJIL() + j.leftMargin + j.rightMargin + (left + right + 0), j.width, this.LJFF());
            final int liz2 = LIZ(((i)this).LJJIJL, ((i)this).LJJIJIIJIL, this.LJIJJLI() + this.LJJ() + j.topMargin + j.bottomMargin + (top + bottom + 0), j.height, this.LJI());
            if (this.LIZIZ(view, liz, liz2, j)) {
                view.measure(liz, liz2);
            }
        }
        
        public final int LJIILJJIL(final View view) {
            final Rect lizlll = ((j)view.getLayoutParams()).LIZLLL;
            return view.getMeasuredWidth() + lizlll.left + lizlll.right;
        }
        
        public final void LJIILJJIL() {
            final RecyclerView ljil = ((i)this).LJIL;
            if (ljil != null) {
                ljil.requestLayout();
            }
        }
        
        public final int LJIILL(final View view) {
            final Rect lizlll = ((j)view.getLayoutParams()).LIZLLL;
            return view.getMeasuredHeight() + lizlll.top + lizlll.bottom;
        }
        
        public final boolean LJIILL() {
            final RecyclerView ljil = ((i)this).LJIL;
            return ljil != null && ljil.LJIIIZ;
        }
        
        public final int LJIILLIIL(final View view) {
            return view.getLeft() - this.LJIL(view);
        }
        
        public final boolean LJIILLIIL() {
            final s ljjiffi = ((i)this).LJJIFFI;
            return ljjiffi != null && ljjiffi.LJIIJ;
        }
        
        public final int LJIIZILJ() {
            return ((View)((i)this).LJIL).getLayoutDirection();
        }
        
        public final int LJIIZILJ(final View view) {
            return view.getTop() - this.LJIJJ(view);
        }
        
        public final int LJIJ(final View view) {
            return view.getRight() + this.LJJ(view);
        }
        
        public final void LJIJ() {
            for (int i = this.LJIJI() - 1; i >= 0; --i) {
                ((i)this).LJIJJLI.LIZ(i);
            }
        }
        
        public final int LJIJI() {
            final 0Ey ljijjli = ((i)this).LJIJJLI;
            if (ljijjli != null) {
                return ljijjli.LIZ();
            }
            return 0;
        }
        
        public final int LJIJI(final View view) {
            return view.getBottom() + this.LJIJJLI(view);
        }
        
        public final int LJIJJ() {
            final RecyclerView ljil = ((i)this).LJIL;
            if (ljil != null) {
                return ljil.getPaddingLeft();
            }
            return 0;
        }
        
        public final int LJIJJ(final View view) {
            return ((j)view.getLayoutParams()).LIZLLL.top;
        }
        
        public final int LJIJJLI() {
            final RecyclerView ljil = ((i)this).LJIL;
            if (ljil != null) {
                return ljil.getPaddingTop();
            }
            return 0;
        }
        
        public final int LJIJJLI(final View view) {
            return ((j)view.getLayoutParams()).LIZLLL.bottom;
        }
        
        public final int LJIL() {
            final RecyclerView ljil = ((i)this).LJIL;
            if (ljil != null) {
                return ljil.getPaddingRight();
            }
            return 0;
        }
        
        public final int LJIL(final View view) {
            return ((j)view.getLayoutParams()).LIZLLL.left;
        }
        
        public final int LJJ() {
            final RecyclerView ljil = ((i)this).LJIL;
            if (ljil != null) {
                return ljil.getPaddingBottom();
            }
            return 0;
        }
        
        public final int LJJ(final View view) {
            return ((j)view.getLayoutParams()).LIZLLL.right;
        }
        
        public final int LJJI() {
            final RecyclerView ljil = ((i)this).LJIL;
            if (ljil != null) {
                return ((View)ljil).getPaddingStart();
            }
            return 0;
        }
        
        public final int LJJIFFI() {
            final RecyclerView ljil = ((i)this).LJIL;
            if (ljil != null) {
                return ((View)ljil).getPaddingEnd();
            }
            return 0;
        }
        
        public final View LJJII() {
            final RecyclerView ljil = ((i)this).LJIL;
            if (ljil == null) {
                return null;
            }
            final View focusedChild = ljil.getFocusedChild();
            if (focusedChild == null || ((i)this).LJIJJLI.LIZLLL(focusedChild)) {
                return null;
            }
            return focusedChild;
        }
        
        public final int LJJIII() {
            final RecyclerView ljil = ((i)this).LJIL;
            if (ljil != null) {
                final a adapter = ljil.getAdapter();
                if (adapter != null) {
                    return adapter.getItemCount();
                }
            }
            return 0;
        }
        
        public final int LJJIIJ() {
            return ((View)((i)this).LJIL).getMinimumWidth();
        }
        
        public final int LJJIIJZLJL() {
            return ((View)((i)this).LJIL).getMinimumHeight();
        }
        
        public final void LJJIIZ() {
            final s ljjiffi = ((i)this).LJJIFFI;
            if (ljjiffi != null) {
                ljjiffi.LIZLLL();
            }
        }
        
        public final void a_(int n, final int n2) {
            ((i)this).LJJIJIL = View$MeasureSpec.getSize(n);
            n = View$MeasureSpec.getMode(n);
            ((i)this).LJJIJIIJI = n;
            if (n == 0 && !RecyclerView.LIZIZ) {
                ((i)this).LJJIJIL = 0;
            }
            ((i)this).LJJIJL = View$MeasureSpec.getSize(n2);
            n = View$MeasureSpec.getMode(n2);
            if ((((i)this).LJJIJIIJIL = n) == 0 && !RecyclerView.LIZIZ) {
                ((i)this).LJJIJL = 0;
            }
        }
        
        public boolean ak_() {
            return ((i)this).LJJIIJ;
        }
        
        public boolean al_() {
            return false;
        }
        
        public void am_() {
        }
        
        public boolean an_() {
            return false;
        }
    }
    
    public final class o
    {
        public final ArrayList<ViewHolder> LIZ;
        public ArrayList<ViewHolder> LIZIZ;
        public final ArrayList<ViewHolder> LIZJ;
        public final List<ViewHolder> LIZLLL;
        public int LJ;
        public int LJFF;
        public RecycledViewPool LJI;
        public u LJII;
        public final /* synthetic */ RecyclerView LJIIIIZZ;
        
        static {
            Covode.recordClassIndex(1542);
        }
        
        public o() {
            final ArrayList liz = new ArrayList();
            ((o)this).LIZ = liz;
            ((o)this).LIZIZ = null;
            ((o)this).LIZJ = new ArrayList<ViewHolder>();
            ((o)this).LIZLLL = (List<ViewHolder>)Collections.unmodifiableList((List<?>)liz);
            ((o)this).LJ = 2;
            ((o)this).LJFF = 2;
        }
        
        private ViewHolder LIZ(int n, final boolean b) {
            final int size = ((o)this).LIZ.size();
            final int n2 = 0;
            for (int i = 0; i < size; ++i) {
                final ViewHolder viewHolder = ((o)this).LIZ.get(i);
                if (!viewHolder.wasReturnedFromScrap() && viewHolder.getLayoutPosition() == n && !viewHolder.isInvalid() && (RecyclerView.this.LJJIJ.LJI || !viewHolder.isRemoved())) {
                    viewHolder.addFlags(32);
                    return viewHolder;
                }
            }
            if (!b) {
                final 0Ey ljii = RecyclerView.this.LJII;
                final int size2 = ljii.LIZJ.size();
                int j = 0;
                while (j < size2) {
                    final View view = ljii.LIZJ.get(j);
                    final ViewHolder liziz = ljii.LIZ.LIZIZ(view);
                    if (liziz.getLayoutPosition() == n && !liziz.isInvalid() && !liziz.isRemoved()) {
                        if (view == null) {
                            break;
                        }
                        final ViewHolder lizj = RecyclerView.LIZJ(view);
                        final 0Ey ljii2 = RecyclerView.this.LJII;
                        n = ljii2.LIZ.LIZ(view);
                        if (n < 0) {
                            throw new IllegalArgumentException("view is not a child, cannot hide ".concat(String.valueOf(view)));
                        }
                        if (!ljii2.LIZIZ.LIZJ(n)) {
                            throw new RuntimeException("trying to unhide a view that was not hidden".concat(String.valueOf(view)));
                        }
                        ljii2.LIZIZ.LIZIZ(n);
                        ljii2.LIZIZ(view);
                        n = RecyclerView.this.LJII.LIZJ(view);
                        if (n != -1) {
                            RecyclerView.this.LJII.LIZLLL(n);
                            this.LIZJ(view);
                            lizj.addFlags(8224);
                            return lizj;
                        }
                        final StringBuilder sb = new StringBuilder("layout index should not be -1 after unhiding a view:");
                        sb.append(lizj);
                        sb.append(RecyclerView.this.LIZ());
                        throw new IllegalStateException(sb.toString());
                    }
                    else {
                        ++j;
                    }
                }
            }
            for (int size3 = ((o)this).LIZJ.size(), k = n2; k < size3; ++k) {
                final ViewHolder viewHolder2 = ((o)this).LIZJ.get(k);
                if (!viewHolder2.isInvalid() && viewHolder2.getLayoutPosition() == n && !viewHolder2.isAttachedToTransitionOverlay()) {
                    if (!b) {
                        ((o)this).LIZJ.remove(k);
                    }
                    return viewHolder2;
                }
            }
            return null;
        }
        
        private ViewHolder LIZ(final int mPreLayoutPosition, final boolean b, final long n) {
            if (mPreLayoutPosition < 0 || mPreLayoutPosition >= RecyclerView.this.LJJIJ.LIZ()) {
                final StringBuilder sb = new StringBuilder("Invalid item position ");
                sb.append(mPreLayoutPosition);
                sb.append("(");
                sb.append(mPreLayoutPosition);
                sb.append("). Item count:");
                sb.append(RecyclerView.this.LJJIJ.LIZ());
                sb.append(RecyclerView.this.LIZ());
                throw new IndexOutOfBoundsException(sb.toString());
            }
            final boolean lji = RecyclerView.this.LJJIJ.LJI;
            final boolean b2 = true;
            while (true) {
                Label_0338: {
                    if (!lji) {
                        break Label_0338;
                    }
                    final Object lizj = this.LJ(mPreLayoutPosition);
                    if (lizj == null) {
                        break Label_0338;
                    }
                    final int n2 = 1;
                    if (n2 != 0 && !RecyclerView.this.LJJIJ.LJI && ((ViewHolder)lizj).hasAnyOfTheFlags(8192)) {
                        ((ViewHolder)lizj).setFlags(0, 8192);
                        if (RecyclerView.this.LJJIJ.LJIIIZ) {
                            f.LJFF((ViewHolder)lizj);
                            final f ljjiij = RecyclerView.this.LJJIIJ;
                            ((ViewHolder)lizj).getUnmodifiedPayloads();
                            RecyclerView.this.LIZ((ViewHolder)lizj, ljjiij.LIZLLL((ViewHolder)lizj));
                        }
                    }
                    boolean liz = false;
                    Label_0172: {
                        if (RecyclerView.this.LJJIJ.LJI && ((ViewHolder)lizj).isBound()) {
                            ((ViewHolder)lizj).mPreLayoutPosition = mPreLayoutPosition;
                        }
                        else if (!((ViewHolder)lizj).isBound() || ((ViewHolder)lizj).needsUpdate() || ((ViewHolder)lizj).isInvalid()) {
                            liz = this.LIZ((ViewHolder)lizj, RecyclerView.this.LJI.LIZIZ(mPreLayoutPosition), mPreLayoutPosition, n);
                            break Label_0172;
                        }
                        liz = false;
                    }
                    final ViewGroup$LayoutParams layoutParams = ((ViewHolder)lizj).itemView.getLayoutParams();
                    j j;
                    if (layoutParams == null) {
                        j = (j)RecyclerView.this.generateDefaultLayoutParams();
                        ((ViewHolder)lizj).itemView.setLayoutParams((ViewGroup$LayoutParams)j);
                    }
                    else if (!RecyclerView.this.checkLayoutParams(layoutParams)) {
                        j = (j)RecyclerView.this.generateLayoutParams(layoutParams);
                        ((ViewHolder)lizj).itemView.setLayoutParams((ViewGroup$LayoutParams)j);
                    }
                    else {
                        j = (j)layoutParams;
                    }
                    j.LIZJ = (ViewHolder)lizj;
                    j.LJFF = (n2 != 0 && liz && b2);
                    return (ViewHolder)lizj;
                }
                final int n3 = 0;
                Object lizj = this.LIZ(mPreLayoutPosition, false);
                if (lizj != null) {
                    if (this.LIZJ((ViewHolder)lizj)) {
                        final int n2 = 1;
                        continue;
                    }
                    ((ViewHolder)lizj).addFlags(4);
                    if (((ViewHolder)lizj).isScrap()) {
                        RecyclerView.this.removeDetachedView(((ViewHolder)lizj).itemView, false);
                        ((ViewHolder)lizj).unScrap();
                    }
                    else if (((ViewHolder)lizj).wasReturnedFromScrap()) {
                        ((ViewHolder)lizj).clearReturnedFromScrapFlag();
                    }
                    this.LIZ((ViewHolder)lizj);
                }
                final int liziz = RecyclerView.this.LJI.LIZIZ(mPreLayoutPosition);
                if (liziz < 0 || liziz >= ((a)RecyclerView.this.LJIILIIL).getItemCount()) {
                    final StringBuilder sb2 = new StringBuilder("Inconsistency detected. Invalid item position ");
                    sb2.append(mPreLayoutPosition);
                    sb2.append("(offset:");
                    sb2.append(liziz);
                    sb2.append(").state:");
                    sb2.append(RecyclerView.this.LJJIJ.LIZ());
                    sb2.append(RecyclerView.this.LIZ());
                    throw new IndexOutOfBoundsException(sb2.toString());
                }
                final int itemViewType = ((a)RecyclerView.this.LJIILIIL).getItemViewType(liziz);
                if (RecyclerView.this.LJIILIIL.mHasStableIds) {
                    lizj = this.LIZ(((a)RecyclerView.this.LJIILIIL).getItemId(liziz), itemViewType, false);
                    if (lizj != null) {
                        ((ViewHolder)lizj).mPosition = liziz;
                        final int n2 = 1;
                        continue;
                    }
                }
                final u ljii = ((o)this).LJII;
                if (ljii != null) {
                    final View liz2 = ljii.LIZ((o)this, itemViewType);
                    if (liz2 != null) {
                        lizj = RecyclerView.this.LIZ(liz2);
                        if (lizj == null) {
                            final StringBuilder sb3 = new StringBuilder("getViewForPositionAndType returned a view which does not have a ViewHolder");
                            sb3.append(RecyclerView.this.LIZ());
                            throw new IllegalArgumentException(sb3.toString());
                        }
                        if (!((ViewHolder)lizj).shouldIgnore()) {
                            final int n2 = n3;
                            continue;
                        }
                        final StringBuilder sb4 = new StringBuilder("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view.");
                        sb4.append(RecyclerView.this.LIZ());
                        throw new IllegalArgumentException(sb4.toString());
                    }
                }
                final ViewHolder recycledView = this.LIZJ().getRecycledView(itemViewType);
                if (recycledView != null) {
                    recycledView.resetInternal();
                    int n2 = n3;
                    lizj = recycledView;
                    if (RecyclerView.LIZ) {
                        this.LIZLLL(recycledView);
                        n2 = n3;
                        lizj = recycledView;
                    }
                    continue;
                }
                else {
                    final long nanoTime = RecyclerView.this.getNanoTime();
                    if (n != Long.MAX_VALUE && !((o)this).LJI.willCreateInTime(itemViewType, nanoTime, n)) {
                        return null;
                    }
                    lizj = ((a)RecyclerView.this.LJIILIIL).createViewHolder(RecyclerView.this, itemViewType);
                    if (RecyclerView.LIZLLL) {
                        final RecyclerView lji2 = RecyclerView.LJI(((ViewHolder)lizj).itemView);
                        if (lji2 != null) {
                            ((ViewHolder)lizj).mNestedRecyclerView = new WeakReference<RecyclerView>(lji2);
                        }
                    }
                    ((o)this).LJI.factorInCreateTime(itemViewType, RecyclerView.this.getNanoTime() - nanoTime);
                    final int n2 = n3;
                    continue;
                }
                break;
            }
        }
        
        private ViewHolder LIZ(final long n, final int n2, final boolean b) {
            for (int i = ((o)this).LIZ.size() - 1; i >= 0; --i) {
                final ViewHolder viewHolder = ((o)this).LIZ.get(i);
                if (viewHolder.getItemId() == n && !viewHolder.wasReturnedFromScrap()) {
                    if (n2 == viewHolder.getItemViewType()) {
                        viewHolder.addFlags(32);
                        if (viewHolder.isRemoved() && !RecyclerView.this.LJJIJ.LJI) {
                            viewHolder.setFlags(2, 14);
                        }
                        return viewHolder;
                    }
                    if (!b) {
                        ((o)this).LIZ.remove(i);
                        RecyclerView.this.removeDetachedView(viewHolder.itemView, false);
                        this.LIZIZ(viewHolder.itemView);
                    }
                }
            }
            for (int j = ((o)this).LIZJ.size() - 1; j >= 0; --j) {
                final ViewHolder viewHolder2 = ((o)this).LIZJ.get(j);
                if (viewHolder2.getItemId() == n && !viewHolder2.isAttachedToTransitionOverlay()) {
                    if (n2 == viewHolder2.getItemViewType()) {
                        if (!b) {
                            ((o)this).LIZJ.remove(j);
                        }
                        return viewHolder2;
                    }
                    if (!b) {
                        this.LIZLLL(j);
                        return null;
                    }
                }
            }
            return null;
        }
        
        public static ViewHolder LIZ(final o o, final int n, final long n2) {
            if (2Qs.LIZ == null) {
                2Qs.LIZ = SettingsManager.LIZ().LIZ("catch_tryGetViewHolderForPositionByDeadline_crash", true);
            }
            final Boolean liz = 2Qs.LIZ;
            if (liz == null) {
                n.LIZIZ();
            }
            if (!liz) {
                return ((o)o).LIZ(n, false, n2);
            }
            try {
                return ((o)o).LIZ(n, false, n2);
            }
            catch (final IndexOutOfBoundsException ex) {
                final StringBuffer sb = new StringBuffer();
                sb.append("tryGetViewHolderForPositionByDeadline crash hook, error: ");
                sb.append(Log.getStackTraceString((Throwable)ex));
                2ex.LIZIZ = sb.toString();
                if (SettingsManager.LIZ().LIZ("mock_recycle_view_holder", false)) {
                    try {
                        if (Uac.LIZ == null) {
                            Uac.LIZ = (ViewHolder)new Uab(new View(NQO.LJJ.LIZ()));
                            final Field declaredField = ViewHolder.class.getDeclaredField("itemView");
                            declaredField.setAccessible(true);
                            final Field declaredField2 = Field.class.getDeclaredField("accessFlags");
                            declaredField2.setAccessible(true);
                            declaredField2.setInt(declaredField, declaredField.getModifiers() & 0xFFFFFFEF);
                            declaredField.set(Uac.LIZ, null);
                        }
                        return Uac.LIZ;
                    }
                    catch (final Exception ex2) {
                        2ex.LIZIZ = ex2.toString();
                    }
                }
                return null;
            }
        }
        
        private void LIZ(final ViewGroup viewGroup, final boolean b) {
            for (int i = viewGroup.getChildCount() - 1; i >= 0; --i) {
                final View child = viewGroup.getChildAt(i);
                if (child instanceof ViewGroup) {
                    this.LIZ((ViewGroup)child, true);
                }
            }
            if (!b) {
                return;
            }
            if (viewGroup.getVisibility() == 4) {
                viewGroup.setVisibility(0);
                viewGroup.setVisibility(4);
                return;
            }
            final int visibility = viewGroup.getVisibility();
            viewGroup.setVisibility(4);
            viewGroup.setVisibility(visibility);
        }
        
        private boolean LIZ(final ViewHolder viewHolder, final int n, final int mPreLayoutPosition, long nanoTime) {
            viewHolder.mBindingAdapter = null;
            viewHolder.mOwnerRecyclerView = RecyclerView.this;
            final int itemViewType = viewHolder.getItemViewType();
            final long nanoTime2 = RecyclerView.this.getNanoTime();
            if (nanoTime != Long.MAX_VALUE && !((o)this).LJI.willBindInTime(itemViewType, nanoTime2, nanoTime)) {
                return false;
            }
            ((a<ViewHolder>)RecyclerView.this.LJIILIIL).bindViewHolder(viewHolder, n);
            nanoTime = RecyclerView.this.getNanoTime();
            ((o)this).LJI.factorInBindTime(viewHolder.getItemViewType(), nanoTime - nanoTime2);
            if (RecyclerView.this.LJIIIIZZ()) {
                final View itemView = viewHolder.itemView;
                if (itemView.getImportantForAccessibility() == 0) {
                    itemView.setImportantForAccessibility(1);
                }
                if (RecyclerView.this.LJJIJL != null) {
                    final 17N.a lizj = RecyclerView.this.LJJIJL.LIZJ;
                    Label_0164: {
                        if (lizj instanceof 17N.a) {
                            final View$AccessibilityDelegate liz = androidx.core.g.t.LIZ(itemView);
                            if (liz != null) {
                                07k liz2;
                                if (liz instanceof 07k.a) {
                                    liz2 = ((07k.a)liz).LIZ;
                                    if (liz2 == null) {
                                        break Label_0164;
                                    }
                                }
                                else {
                                    liz2 = new 07k(liz);
                                }
                                if (liz2 != lizj) {
                                    lizj.LIZJ.put(itemView, liz2);
                                }
                            }
                        }
                    }
                    androidx.core.g.t.LIZ(itemView, lizj);
                }
            }
            if (RecyclerView.this.LJJIJ.LJI) {
                viewHolder.mPreLayoutPosition = mPreLayoutPosition;
            }
            return true;
        }
        
        private boolean LIZJ(final ViewHolder viewHolder) {
            if (viewHolder.isRemoved()) {
                return RecyclerView.this.LJJIJ.LJI;
            }
            if (viewHolder.mPosition >= 0 && viewHolder.mPosition < ((a)RecyclerView.this.LJIILIIL).getItemCount()) {
                return (RecyclerView.this.LJJIJ.LJI || ((a)RecyclerView.this.LJIILIIL).getItemViewType(viewHolder.mPosition) == viewHolder.getItemViewType()) && (!RecyclerView.this.LJIILIIL.mHasStableIds || viewHolder.getItemId() == ((a)RecyclerView.this.LJIILIIL).getItemId(viewHolder.mPosition));
            }
            final StringBuilder sb = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
            sb.append(viewHolder);
            sb.append(RecyclerView.this.LIZ());
            throw new IndexOutOfBoundsException(sb.toString());
        }
        
        private void LIZLLL(final ViewHolder viewHolder) {
            if (viewHolder.itemView instanceof ViewGroup) {
                this.LIZ((ViewGroup)viewHolder.itemView, false);
            }
        }
        
        private ViewHolder LJ(int i) {
            final ArrayList<ViewHolder> liziz = ((o)this).LIZIZ;
            if (liziz != null) {
                final int size = liziz.size();
                if (size != 0) {
                    final int n = 0;
                    for (int j = 0; j < size; ++j) {
                        final ViewHolder viewHolder = ((o)this).LIZIZ.get(j);
                        if (!viewHolder.wasReturnedFromScrap() && viewHolder.getLayoutPosition() == i) {
                            viewHolder.addFlags(32);
                            return viewHolder;
                        }
                    }
                    if (RecyclerView.this.LJIILIIL.mHasStableIds) {
                        i = RecyclerView.this.LJI.LIZ(i, 0);
                        if (i > 0 && i < ((a)RecyclerView.this.LJIILIIL).getItemCount()) {
                            final long itemId = ((a)RecyclerView.this.LJIILIIL).getItemId(i);
                            ViewHolder viewHolder2;
                            for (i = n; i < size; ++i) {
                                viewHolder2 = ((o)this).LIZIZ.get(i);
                                if (!viewHolder2.wasReturnedFromScrap() && viewHolder2.getItemId() == itemId) {
                                    viewHolder2.addFlags(32);
                                    return viewHolder2;
                                }
                            }
                        }
                    }
                }
            }
            return null;
        }
        
        private void LJ(final ViewHolder viewHolder) {
            if (RecyclerView.this.LJIILL != null) {
                RecyclerView.this.LJIILL.LIZ(viewHolder);
            }
            for (int size = RecyclerView.this.LJIILLIIL.size(), i = 0; i < size; ++i) {
                ((p)RecyclerView.this.LJIILLIIL.get(i)).LIZ(viewHolder);
            }
            if (RecyclerView.this.LJIILIIL != null) {
                ((a<ViewHolder>)RecyclerView.this.LJIILIIL).onViewRecycled(viewHolder);
            }
            if (RecyclerView.this.LJJIJ != null) {
                RecyclerView.this.LJIIIIZZ.LJ(viewHolder);
            }
        }
        
        private void LJI() {
            for (int i = ((o)this).LIZJ.size() - 1; i >= 0; --i) {
                this.LIZLLL(i);
            }
            ((o)this).LIZJ.clear();
            if (RecyclerView.LIZLLL) {
                RecyclerView.this.LJJIIZI.LIZ();
            }
        }
        
        public final int LIZ(final int n) {
            if (n < 0 || n >= RecyclerView.this.LJJIJ.LIZ()) {
                final StringBuilder sb = new StringBuilder("invalid position ");
                sb.append(n);
                sb.append(". State item count is ");
                sb.append(RecyclerView.this.LJJIJ.LIZ());
                sb.append(RecyclerView.this.LIZ());
                throw new IndexOutOfBoundsException(sb.toString());
            }
            if (!RecyclerView.this.LJJIJ.LJI) {
                return n;
            }
            return RecyclerView.this.LJI.LIZIZ(n);
        }
        
        public final void LIZ() {
            ((o)this).LIZ.clear();
            this.LJI();
        }
        
        public final void LIZ(final a a, final a a2, final boolean b) {
            this.LIZ();
            this.LIZJ().onAdapterChanged(a, a2, b);
        }
        
        public final void LIZ(final View view) {
            final ViewHolder lizj = RecyclerView.LIZJ(view);
            if (lizj.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (lizj.isScrap()) {
                lizj.unScrap();
            }
            else if (lizj.wasReturnedFromScrap()) {
                lizj.clearReturnedFromScrapFlag();
            }
            this.LIZ(lizj);
            if (RecyclerView.this.LJJIIJ != null && !lizj.isRecyclable()) {
                RecyclerView.this.LJJIIJ.LIZJ(lizj);
            }
        }
        
        public final void LIZ(final View view, final int n) {
            final ViewHolder lizj = RecyclerView.LIZJ(view);
            if (lizj == null) {
                final StringBuilder sb = new StringBuilder("The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter");
                sb.append(RecyclerView.this.LIZ());
                throw new IllegalArgumentException(sb.toString());
            }
            final int liziz = RecyclerView.this.LJI.LIZIZ(n);
            if (liziz >= 0 && liziz < ((a)RecyclerView.this.LJIILIIL).getItemCount()) {
                this.LIZ(lizj, liziz, n, Long.MAX_VALUE);
                final ViewGroup$LayoutParams layoutParams = lizj.itemView.getLayoutParams();
                j j;
                if (layoutParams == null) {
                    j = (j)RecyclerView.this.generateDefaultLayoutParams();
                    lizj.itemView.setLayoutParams((ViewGroup$LayoutParams)j);
                }
                else if (!RecyclerView.this.checkLayoutParams(layoutParams)) {
                    j = (j)RecyclerView.this.generateLayoutParams(layoutParams);
                    lizj.itemView.setLayoutParams((ViewGroup$LayoutParams)j);
                }
                else {
                    j = (j)layoutParams;
                }
                boolean ljff = true;
                j.LJ = true;
                j.LIZJ = lizj;
                if (lizj.itemView.getParent() != null) {
                    ljff = false;
                }
                j.LJFF = ljff;
                return;
            }
            final StringBuilder sb2 = new StringBuilder("Inconsistency detected. Invalid item position ");
            sb2.append(n);
            sb2.append("(offset:");
            sb2.append(liziz);
            sb2.append(").state:");
            sb2.append(RecyclerView.this.LJJIJ.LIZ());
            sb2.append(RecyclerView.this.LIZ());
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        
        public final void LIZ(final ViewHolder viewHolder) {
            final boolean scrap = viewHolder.isScrap();
            boolean b = false;
            boolean b2 = false;
            boolean b3 = true;
            if (scrap || viewHolder.itemView.getParent() != null) {
                final StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(viewHolder.isScrap());
                sb.append(" isAttached:");
                if (viewHolder.itemView.getParent() != null) {
                    b2 = true;
                }
                sb.append(b2);
                sb.append(RecyclerView.this.LIZ());
                throw new IllegalArgumentException(sb.toString());
            }
            if (viewHolder.isTmpDetached()) {
                final StringBuilder sb2 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
                sb2.append(viewHolder);
                sb2.append(RecyclerView.this.LIZ());
                throw new IllegalArgumentException(sb2.toString());
            }
            if (!viewHolder.shouldIgnore()) {
                final boolean doesTransientStatePreventRecycling = viewHolder.doesTransientStatePreventRecycling();
                Label_0331: {
                    if ((RecyclerView.this.LJIILIIL != null && doesTransientStatePreventRecycling && ((a<ViewHolder>)RecyclerView.this.LJIILIIL).onFailedToRecycleView(viewHolder)) || viewHolder.isRecyclable()) {
                        if (((o)this).LJFF <= 0 || viewHolder.hasAnyOfTheFlags(526)) {
                            this.LIZ(viewHolder, true);
                            b = false;
                            break Label_0331;
                        }
                        int size;
                        final int n = size = ((o)this).LIZJ.size();
                        if (n >= ((o)this).LJFF && (size = n) > 0) {
                            this.LIZLLL(0);
                            size = n - 1;
                        }
                        int n2 = size;
                        if (RecyclerView.LIZLLL && (n2 = size) > 0) {
                            n2 = size;
                            if (!RecyclerView.this.LJJIIZI.LIZ(viewHolder.mPosition)) {
                                --size;
                                while (size >= 0 && RecyclerView.this.LJJIIZI.LIZ(((o)this).LIZJ.get(size).mPosition)) {
                                    --size;
                                }
                                n2 = size + 1;
                            }
                        }
                        ((o)this).LIZJ.add(n2, viewHolder);
                        b = true;
                    }
                    b3 = false;
                }
                RecyclerView.this.LJIIIIZZ.LJ(viewHolder);
                if (!b && !b3 && doesTransientStatePreventRecycling) {
                    viewHolder.mBindingAdapter = null;
                    viewHolder.mOwnerRecyclerView = null;
                }
                return;
            }
            final StringBuilder sb3 = new StringBuilder("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
            sb3.append(RecyclerView.this.LIZ());
            throw new IllegalArgumentException(sb3.toString());
        }
        
        public final void LIZ(final ViewHolder viewHolder, final boolean b) {
            RecyclerView.LIZJ(viewHolder);
            final View itemView = viewHolder.itemView;
            if (RecyclerView.this.LJJIJL != null) {
                final 17N.a lizj = RecyclerView.this.LJJIJL.LIZJ;
                07k lizj2;
                if (lizj instanceof 17N.a) {
                    lizj2 = lizj.LIZJ(itemView);
                }
                else {
                    lizj2 = null;
                }
                androidx.core.g.t.LIZ(itemView, lizj2);
            }
            if (b) {
                this.LJ(viewHolder);
            }
            viewHolder.mBindingAdapter = null;
            viewHolder.mOwnerRecyclerView = null;
            this.LIZJ().putRecycledView(viewHolder);
        }
        
        public final View LIZIZ(final int n) {
            return this.LIZJ(n);
        }
        
        public final void LIZIZ() {
            int ljjiizi;
            if (RecyclerView.this.LJIILJJIL != null) {
                ljjiizi = RecyclerView.this.LJIILJJIL.LJJIIZI;
            }
            else {
                ljjiizi = 0;
            }
            ((o)this).LJFF = ((o)this).LJ + ljjiizi;
            for (int n = ((o)this).LIZJ.size() - 1; n >= 0 && ((o)this).LIZJ.size() > ((o)this).LJFF; --n) {
                this.LIZLLL(n);
            }
        }
        
        public final void LIZIZ(final View view) {
            final ViewHolder lizj = RecyclerView.LIZJ(view);
            lizj.mScrapContainer = null;
            lizj.mInChangeScrap = false;
            lizj.clearReturnedFromScrapFlag();
            this.LIZ(lizj);
        }
        
        public final void LIZIZ(final ViewHolder viewHolder) {
            if (viewHolder.mInChangeScrap) {
                ((o)this).LIZIZ.remove(viewHolder);
            }
            else {
                ((o)this).LIZ.remove(viewHolder);
            }
            viewHolder.mScrapContainer = null;
            viewHolder.mInChangeScrap = false;
            viewHolder.clearReturnedFromScrapFlag();
        }
        
        public final View LIZJ(final int n) {
            return LIZ((o)this, n, Long.MAX_VALUE).itemView;
        }
        
        public final RecycledViewPool LIZJ() {
            if (((o)this).LJI == null) {
                ((o)this).LJI = new RecycledViewPool();
            }
            return ((o)this).LJI;
        }
        
        public final void LIZJ(final View view) {
            final ViewHolder lizj = RecyclerView.LIZJ(view);
            if (!lizj.hasAnyOfTheFlags(12) && lizj.isUpdated() && !RecyclerView.this.LIZIZ(lizj)) {
                if (((o)this).LIZIZ == null) {
                    ((o)this).LIZIZ = new ArrayList<ViewHolder>();
                }
                lizj.setScrapContainer((o)this, true);
                ((o)this).LIZIZ.add(lizj);
                return;
            }
            if (!lizj.isInvalid() || lizj.isRemoved() || RecyclerView.this.LJIILIIL.mHasStableIds) {
                lizj.setScrapContainer((o)this, false);
                ((o)this).LIZ.add(lizj);
                return;
            }
            final StringBuilder sb = new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
            sb.append(RecyclerView.this.LIZ());
            throw new IllegalArgumentException(sb.toString());
        }
        
        public final void LIZLLL() {
            for (int size = ((o)this).LIZJ.size(), i = 0; i < size; ++i) {
                final ViewHolder viewHolder = ((o)this).LIZJ.get(i);
                if (viewHolder != null) {
                    viewHolder.addFlags(6);
                    viewHolder.addChangePayload(null);
                }
            }
            if (RecyclerView.this.LJIILIIL == null || !RecyclerView.this.LJIILIIL.mHasStableIds) {
                this.LJI();
            }
        }
        
        public final void LIZLLL(final int n) {
            this.LIZ(((o)this).LIZJ.get(n), true);
            ((o)this).LIZJ.remove(n);
        }
        
        public final void LJ() {
            final int size = ((o)this).LIZJ.size();
            final int n = 0;
            for (int i = 0; i < size; ++i) {
                ((o)this).LIZJ.get(i).clearOldPosition();
            }
            for (int size2 = ((o)this).LIZ.size(), j = 0; j < size2; ++j) {
                ((o)this).LIZ.get(j).clearOldPosition();
            }
            final ArrayList<ViewHolder> liziz = ((o)this).LIZIZ;
            if (liziz != null) {
                for (int size3 = liziz.size(), k = n; k < size3; ++k) {
                    ((o)this).LIZIZ.get(k).clearOldPosition();
                }
            }
        }
        
        public final void LJFF() {
            for (int size = ((o)this).LIZJ.size(), i = 0; i < size; ++i) {
                final j j = (j)((o)this).LIZJ.get(i).itemView.getLayoutParams();
                if (j != null) {
                    j.LJ = true;
                }
            }
        }
    }
    
    public static final class t
    {
        public int LIZ;
        public int LIZIZ;
        public int LIZJ;
        public int LIZLLL;
        public int LJ;
        public boolean LJFF;
        public boolean LJI;
        public boolean LJII;
        public boolean LJIIIIZZ;
        public boolean LJIIIZ;
        public boolean LJIIJ;
        public int LJIIJJI;
        public long LJIIL;
        public int LJIILIIL;
        public SparseArray<Object> LJIILJJIL;
        
        static {
            Covode.recordClassIndex(1549);
        }
        
        public t() {
            ((t)this).LIZ = -1;
            ((t)this).LIZLLL = 1;
        }
        
        public final int LIZ() {
            if (((t)this).LJI) {
                return ((t)this).LIZIZ - ((t)this).LIZJ;
            }
            return ((t)this).LJ;
        }
        
        public final void LIZ(final int n) {
            if ((((t)this).LIZLLL & n) != 0x0) {
                return;
            }
            final StringBuilder sb = new StringBuilder("Layout state should be one of ");
            sb.append(Integer.toBinaryString(n));
            sb.append(" but it is ");
            sb.append(Integer.toBinaryString(((t)this).LIZLLL));
            throw new IllegalStateException(sb.toString());
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder("State{mTargetPosition=");
            sb.append(((t)this).LIZ);
            sb.append(", mData=");
            sb.append(((t)this).LJIILJJIL);
            sb.append(", mItemCount=");
            sb.append(((t)this).LJ);
            sb.append(", mIsMeasuring=");
            sb.append(((t)this).LJIIIIZZ);
            sb.append(", mPreviousLayoutItemCount=");
            sb.append(((t)this).LIZIZ);
            sb.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            sb.append(((t)this).LIZJ);
            sb.append(", mStructureChanged=");
            sb.append(((t)this).LJFF);
            sb.append(", mInPreLayout=");
            sb.append(((t)this).LJI);
            sb.append(", mRunSimpleAnimations=");
            sb.append(((t)this).LJIIIZ);
            sb.append(", mRunPredictiveAnimations=");
            sb.append(((t)this).LJIIJ);
            sb.append('}');
            return sb.toString();
        }
    }
    
    public static class j extends ViewGroup$MarginLayoutParams
    {
        public ViewHolder LIZJ;
        public final Rect LIZLLL;
        public boolean LJ;
        public boolean LJFF;
        
        static {
            Covode.recordClassIndex(1537);
        }
        
        public j(final int n, final int n2) {
            super(n, n2);
            ((j)this).LIZLLL = new Rect();
            ((j)this).LJ = true;
            ((j)this).LJFF = false;
        }
        
        public j(final j j) {
            super((ViewGroup$LayoutParams)j);
            ((j)this).LIZLLL = new Rect();
            ((j)this).LJ = true;
            ((j)this).LJFF = false;
        }
        
        public j(final Context context, final AttributeSet set) {
            super(context, set);
            ((j)this).LIZLLL = new Rect();
            ((j)this).LJ = true;
            ((j)this).LJFF = false;
        }
        
        public j(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
            super(viewGroup$LayoutParams);
            ((j)this).LIZLLL = new Rect();
            ((j)this).LJ = true;
            ((j)this).LJFF = false;
        }
        
        public j(final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams) {
            super(viewGroup$MarginLayoutParams);
            ((j)this).LIZLLL = new Rect();
            ((j)this).LJ = true;
            ((j)this).LJFF = false;
        }
        
        public final boolean ao_() {
            return ((j)this).LIZJ.isInvalid();
        }
        
        public final boolean ap_() {
            return ((j)this).LIZJ.isRemoved();
        }
        
        public final int aq_() {
            return ((j)this).LIZJ.getBindingAdapterPosition();
        }
    }
    
    public abstract static class a<VH extends ViewHolder>
    {
        public boolean mHasStableIds;
        public final b mObservable;
        public a.a mStateRestorationPolicy;
        
        static {
            Covode.recordClassIndex(1520);
        }
        
        public a() {
            this.mObservable = new b();
            this.mHasStableIds = false;
            this.mStateRestorationPolicy = a.a.ALLOW;
        }
        
        public final void bindViewHolder(final VH vh, final int mPosition) {
            int n;
            if (vh.mBindingAdapter == null) {
                n = 1;
                vh.mPosition = mPosition;
                if (this.mHasStableIds) {
                    vh.mItemId = this.getItemId(mPosition);
                }
                vh.setFlags(1, 519);
                Trace.beginSection("RV OnBindView");
            }
            else {
                n = 0;
            }
            (vh.mBindingAdapter = (a<? extends ViewHolder>)this).onBindViewHolder((ViewHolder)vh, mPosition, vh.getUnmodifiedPayloads());
            if (n != 0) {
                vh.clearPayload();
                final ViewGroup$LayoutParams layoutParams = vh.itemView.getLayoutParams();
                if (layoutParams instanceof j) {
                    ((j)layoutParams).LJ = true;
                }
                Trace.endSection();
            }
        }
        
        public boolean canRestoreState() {
            final int n = RecyclerView$7.LIZ[this.mStateRestorationPolicy.ordinal()];
            if (n != 1) {
                if (n != 2) {
                    return true;
                }
                if (this.getItemCount() > 0) {
                    return true;
                }
            }
            return false;
        }
        
        public final VH createViewHolder(final ViewGroup viewGroup, final int mItemViewType) {
            try {
                Trace.beginSection("RV CreateView");
                final ViewHolder onCreateViewHolder = this.onCreateViewHolder(viewGroup, mItemViewType);
                if (onCreateViewHolder.itemView.getParent() == null) {
                    onCreateViewHolder.mItemViewType = mItemViewType;
                    return (VH)onCreateViewHolder;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            }
            finally {
                Trace.endSection();
            }
        }
        
        public int findRelativeAdapterPositionIn(final a<? extends ViewHolder> a, final ViewHolder viewHolder, final int n) {
            if (a == this) {
                return n;
            }
            return -1;
        }
        
        public abstract int getItemCount();
        
        public long getItemId(final int n) {
            return -1L;
        }
        
        public int getItemViewType(final int n) {
            return 0;
        }
        
        public final boolean hasObservers() {
            return this.mObservable.LIZ();
        }
        
        public final void notifyDataSetChanged() {
            this.mObservable.LIZIZ();
        }
        
        public final void notifyItemChanged(final int n) {
            this.mObservable.LIZ(n, 1);
        }
        
        public final void notifyItemChanged(final int n, final Object o) {
            this.mObservable.LIZ(n, 1, o);
        }
        
        public final void notifyItemInserted(final int n) {
            this.mObservable.LIZIZ(n, 1);
        }
        
        public final void notifyItemMoved(final int n, final int n2) {
            this.mObservable.LIZLLL(n, n2);
        }
        
        public final void notifyItemRangeChanged(final int n, final int n2) {
            this.mObservable.LIZ(n, n2);
        }
        
        public final void notifyItemRangeChanged(final int n, final int n2, final Object o) {
            this.mObservable.LIZ(n, n2, o);
        }
        
        public final void notifyItemRangeInserted(final int n, final int n2) {
            this.mObservable.LIZIZ(n, n2);
        }
        
        public final void notifyItemRangeRemoved(final int n, final int n2) {
            this.mObservable.LIZJ(n, n2);
        }
        
        public final void notifyItemRemoved(final int n) {
            this.mObservable.LIZJ(n, 1);
        }
        
        public void onAttachedToRecyclerView(final RecyclerView recyclerView) {
        }
        
        public abstract void onBindViewHolder(final VH p0, final int p1);
        
        public void onBindViewHolder(final VH vh, final int n, final List<Object> list) {
            this.onBindViewHolder(vh, n);
        }
        
        public abstract VH onCreateViewHolder(final ViewGroup p0, final int p1);
        
        public void onDetachedFromRecyclerView(final RecyclerView recyclerView) {
        }
        
        public boolean onFailedToRecycleView(final VH vh) {
            return false;
        }
        
        public void onViewAttachedToWindow(final VH vh) {
        }
        
        public void onViewDetachedFromWindow(final VH vh) {
        }
        
        public void onViewRecycled(final VH vh) {
        }
        
        public void registerAdapterDataObserver(final c c) {
            this.mObservable.registerObserver((Object)c);
        }
        
        public void setHasStableIds(final boolean mHasStableIds) {
            if (!this.hasObservers()) {
                this.mHasStableIds = mHasStableIds;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        
        public void setStateRestorationPolicy(final a.a mStateRestorationPolicy) {
            this.mStateRestorationPolicy = mStateRestorationPolicy;
            this.mObservable.LIZJ();
        }
        
        public void unregisterAdapterDataObserver(final c c) {
            this.mObservable.unregisterObserver((Object)c);
        }
    }
    
    public interface k
    {
        default static {
            Covode.recordClassIndex(1538);
        }
        
        void LIZ(final View p0);
        
        void LIZIZ(final View p0);
    }
    
    public abstract static class u
    {
        static {
            Covode.recordClassIndex(1550);
        }
        
        public abstract View LIZ(final o p0, final int p1);
    }
}
