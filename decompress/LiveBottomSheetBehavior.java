// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.design.view.sheet;

import android.os.Parcel;
import android.os.Parcelable$ClassLoaderCreator;
import android.os.Parcelable$Creator;
import androidx.customview.view.AbsSavedState;
import android.os.Parcelable;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.View$MeasureSpec;
import androidx.core.g.t;
import android.view.MotionEvent;
import X.07p;
import android.view.ViewParent;
import java.util.HashMap;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.content.res.TypedArray;
import android.view.ViewConfiguration;
import android.util.TypedValue;
import android.util.AttributeSet;
import android.content.Context;
import X.06T;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import android.view.VelocityTracker;
import java.util.ArrayList;
import java.lang.ref.WeakReference;
import X.08u;
import X.1nH;
import android.view.View;

public class LiveBottomSheetBehavior<V extends View> extends 1nH.b<V>
{
    public int LIZ;
    public boolean LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public float LJII;
    public int LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public int LJIIL;
    public 08u LJIILIIL;
    public int LJIILJJIL;
    public WeakReference<V> LJIILL;
    public WeakReference<View> LJIILLIIL;
    public int LJIIZILJ;
    public boolean LJIJ;
    public boolean LJIJI;
    public float LJIJJ;
    public boolean LJIJJLI;
    public int LJIL;
    public b LJJ;
    public boolean LJJI;
    public int LJJIFFI;
    public boolean LJJII;
    public int LJJIII;
    public int LJJIIJ;
    public final ArrayList<a> LJJIIJZLJL;
    public VelocityTracker LJJIIZ;
    public int LJJIIZI;
    public Map<View, Integer> LJJIJ;
    public int LJJIJIIJI;
    public float LJJIJIIJIL;
    public int LJJIJIL;
    public float LJJIJL;
    public float LJJIJLIJ;
    public final 08u.a LJJIL;
    
    static {
        Covode.recordClassIndex(6058);
    }
    
    public LiveBottomSheetBehavior() {
        this.LIZIZ = true;
        this.LIZJ = -1;
        this.LJII = 0.5f;
        this.LJIIJJI = true;
        this.LJIIL = 4;
        this.LJJIIJZLJL = new ArrayList<a>();
        this.LJJIJIIJI = -1;
        this.LJJIJIL = -1;
        this.LJJIL = new 08u.a() {
            static {
                Covode.recordClassIndex(6060);
            }
            
            @Override
            public final int LIZ(final View view, final int n, int n2) {
                final int liz = LiveBottomSheetBehavior.this.LIZ();
                if (LiveBottomSheetBehavior.this.LJIIIZ) {
                    n2 = LiveBottomSheetBehavior.this.LJIILJJIL;
                }
                else {
                    n2 = LiveBottomSheetBehavior.this.LJIIIIZZ;
                }
                return 06T.LIZ(n, liz, n2);
            }
            
            @Override
            public final void LIZ(final int n) {
                if (n == 1 && LiveBottomSheetBehavior.this.LJIIJJI) {
                    LiveBottomSheetBehavior.this.LIZJ(1);
                }
            }
            
            @Override
            public final void LIZ(final View view, final float n, final float n2) {
                int n3 = 4;
                while (true) {
                    Label_0368: {
                        int n4;
                        if (n2 < 0.0f || LiveBottomSheetBehavior.this.LIZIZ(view, n2)) {
                            if (LiveBottomSheetBehavior.this.LIZIZ) {
                                n4 = LiveBottomSheetBehavior.this.LJFF;
                            }
                            else {
                                if (view.getTop() > LiveBottomSheetBehavior.this.LJI) {
                                    n4 = LiveBottomSheetBehavior.this.LJI;
                                    break Label_0368;
                                }
                                n4 = LiveBottomSheetBehavior.this.LJ;
                            }
                        }
                        else {
                            if (LiveBottomSheetBehavior.this.LJIIIZ && LiveBottomSheetBehavior.this.LIZ(view, n2)) {
                                n4 = LiveBottomSheetBehavior.this.LJIILJJIL;
                                n3 = 5;
                                break Label_0043;
                            }
                            if (n2 != 0.0f && Math.abs(n) <= Math.abs(n2)) {
                                if (!LiveBottomSheetBehavior.this.LIZIZ) {
                                    final int top = view.getTop();
                                    if (Math.abs(top - LiveBottomSheetBehavior.this.LJI) < Math.abs(top - LiveBottomSheetBehavior.this.LJIIIIZZ)) {
                                        n4 = LiveBottomSheetBehavior.this.LJI;
                                        break Label_0368;
                                    }
                                }
                                n4 = LiveBottomSheetBehavior.this.LJIIIIZZ;
                                break Label_0043;
                            }
                            final int top2 = view.getTop();
                            if (LiveBottomSheetBehavior.this.LIZIZ) {
                                if (Math.abs(top2 - LiveBottomSheetBehavior.this.LJFF) >= Math.abs(top2 - LiveBottomSheetBehavior.this.LJIIIIZZ)) {
                                    n4 = LiveBottomSheetBehavior.this.LJIIIIZZ;
                                    break Label_0043;
                                }
                                n4 = LiveBottomSheetBehavior.this.LJFF;
                            }
                            else if (top2 < LiveBottomSheetBehavior.this.LJI) {
                                if (top2 >= Math.abs(top2 - LiveBottomSheetBehavior.this.LJIIIIZZ)) {
                                    n4 = LiveBottomSheetBehavior.this.LJI;
                                    break Label_0368;
                                }
                                n4 = LiveBottomSheetBehavior.this.LJ;
                            }
                            else {
                                if (Math.abs(top2 - LiveBottomSheetBehavior.this.LJI) < Math.abs(top2 - LiveBottomSheetBehavior.this.LJIIIIZZ)) {
                                    n4 = LiveBottomSheetBehavior.this.LJI;
                                    break Label_0368;
                                }
                                n4 = LiveBottomSheetBehavior.this.LJIIIIZZ;
                                break Label_0043;
                            }
                        }
                        n3 = 3;
                        LiveBottomSheetBehavior.this.LIZ(view, n3, n4, true);
                        return;
                    }
                    n3 = 6;
                    continue;
                }
            }
            
            @Override
            public final void LIZ(final View view, final int n, final int n2, final int n3, final int n4) {
                LiveBottomSheetBehavior.this.LIZLLL(n2);
            }
            
            @Override
            public final int LIZIZ() {
                if (LiveBottomSheetBehavior.this.LJIIIZ) {
                    return LiveBottomSheetBehavior.this.LJIILJJIL;
                }
                return LiveBottomSheetBehavior.this.LJIIIIZZ;
            }
            
            @Override
            public final boolean LIZIZ(final View view, final int n) {
                if (LiveBottomSheetBehavior.this.LJIIL == 1) {
                    return false;
                }
                if (LiveBottomSheetBehavior.this.LJIJ) {
                    return false;
                }
                if (LiveBottomSheetBehavior.this.LJIIL == 3 && LiveBottomSheetBehavior.this.LJIIZILJ == n && LiveBottomSheetBehavior.this.LJIILLIIL != null) {
                    final View view2 = LiveBottomSheetBehavior.this.LJIILLIIL.get();
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                return LiveBottomSheetBehavior.this.LJIILL != null && LiveBottomSheetBehavior.this.LJIILL.get() == view;
            }
            
            @Override
            public final int LIZJ(final View view, final int n) {
                return view.getLeft();
            }
        };
    }
    
    public LiveBottomSheetBehavior(final Context context, final AttributeSet set) {
        super(context, set);
        this.LIZIZ = true;
        this.LIZJ = -1;
        this.LJII = 0.5f;
        this.LJIIJJI = true;
        this.LJIIL = 4;
        this.LJJIIJZLJL = new ArrayList<a>();
        this.LJJIJIIJI = -1;
        this.LJJIJIL = -1;
        this.LJJIL = new 08u.a() {
            static {
                Covode.recordClassIndex(6060);
            }
            
            @Override
            public final int LIZ(final View view, final int n, int n2) {
                final int liz = LiveBottomSheetBehavior.this.LIZ();
                if (LiveBottomSheetBehavior.this.LJIIIZ) {
                    n2 = LiveBottomSheetBehavior.this.LJIILJJIL;
                }
                else {
                    n2 = LiveBottomSheetBehavior.this.LJIIIIZZ;
                }
                return 06T.LIZ(n, liz, n2);
            }
            
            @Override
            public final void LIZ(final int n) {
                if (n == 1 && LiveBottomSheetBehavior.this.LJIIJJI) {
                    LiveBottomSheetBehavior.this.LIZJ(1);
                }
            }
            
            @Override
            public final void LIZ(final View view, final float n, final float n2) {
                int n3 = 4;
                while (true) {
                    Label_0368: {
                        int n4;
                        if (n2 < 0.0f || LiveBottomSheetBehavior.this.LIZIZ(view, n2)) {
                            if (LiveBottomSheetBehavior.this.LIZIZ) {
                                n4 = LiveBottomSheetBehavior.this.LJFF;
                            }
                            else {
                                if (view.getTop() > LiveBottomSheetBehavior.this.LJI) {
                                    n4 = LiveBottomSheetBehavior.this.LJI;
                                    break Label_0368;
                                }
                                n4 = LiveBottomSheetBehavior.this.LJ;
                            }
                        }
                        else {
                            if (LiveBottomSheetBehavior.this.LJIIIZ && LiveBottomSheetBehavior.this.LIZ(view, n2)) {
                                n4 = LiveBottomSheetBehavior.this.LJIILJJIL;
                                n3 = 5;
                                break Label_0043;
                            }
                            if (n2 != 0.0f && Math.abs(n) <= Math.abs(n2)) {
                                if (!LiveBottomSheetBehavior.this.LIZIZ) {
                                    final int top = view.getTop();
                                    if (Math.abs(top - LiveBottomSheetBehavior.this.LJI) < Math.abs(top - LiveBottomSheetBehavior.this.LJIIIIZZ)) {
                                        n4 = LiveBottomSheetBehavior.this.LJI;
                                        break Label_0368;
                                    }
                                }
                                n4 = LiveBottomSheetBehavior.this.LJIIIIZZ;
                                break Label_0043;
                            }
                            final int top2 = view.getTop();
                            if (LiveBottomSheetBehavior.this.LIZIZ) {
                                if (Math.abs(top2 - LiveBottomSheetBehavior.this.LJFF) >= Math.abs(top2 - LiveBottomSheetBehavior.this.LJIIIIZZ)) {
                                    n4 = LiveBottomSheetBehavior.this.LJIIIIZZ;
                                    break Label_0043;
                                }
                                n4 = LiveBottomSheetBehavior.this.LJFF;
                            }
                            else if (top2 < LiveBottomSheetBehavior.this.LJI) {
                                if (top2 >= Math.abs(top2 - LiveBottomSheetBehavior.this.LJIIIIZZ)) {
                                    n4 = LiveBottomSheetBehavior.this.LJI;
                                    break Label_0368;
                                }
                                n4 = LiveBottomSheetBehavior.this.LJ;
                            }
                            else {
                                if (Math.abs(top2 - LiveBottomSheetBehavior.this.LJI) < Math.abs(top2 - LiveBottomSheetBehavior.this.LJIIIIZZ)) {
                                    n4 = LiveBottomSheetBehavior.this.LJI;
                                    break Label_0368;
                                }
                                n4 = LiveBottomSheetBehavior.this.LJIIIIZZ;
                                break Label_0043;
                            }
                        }
                        n3 = 3;
                        LiveBottomSheetBehavior.this.LIZ(view, n3, n4, true);
                        return;
                    }
                    n3 = 6;
                    continue;
                }
            }
            
            @Override
            public final void LIZ(final View view, final int n, final int n2, final int n3, final int n4) {
                LiveBottomSheetBehavior.this.LIZLLL(n2);
            }
            
            @Override
            public final int LIZIZ() {
                if (LiveBottomSheetBehavior.this.LJIIIZ) {
                    return LiveBottomSheetBehavior.this.LJIILJJIL;
                }
                return LiveBottomSheetBehavior.this.LJIIIIZZ;
            }
            
            @Override
            public final boolean LIZIZ(final View view, final int n) {
                if (LiveBottomSheetBehavior.this.LJIIL == 1) {
                    return false;
                }
                if (LiveBottomSheetBehavior.this.LJIJ) {
                    return false;
                }
                if (LiveBottomSheetBehavior.this.LJIIL == 3 && LiveBottomSheetBehavior.this.LJIIZILJ == n && LiveBottomSheetBehavior.this.LJIILLIIL != null) {
                    final View view2 = LiveBottomSheetBehavior.this.LJIILLIIL.get();
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                return LiveBottomSheetBehavior.this.LJIILL != null && LiveBottomSheetBehavior.this.LJIILL.get() == view;
            }
            
            @Override
            public final int LIZJ(final View view, final int n) {
                return view.getLeft();
            }
        };
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, new int[] { 16843840, 2130969090, 2130969113, 2130969114, 2130969117, 2130969118, 2130969932, 2130969933, 2130969934, 2130969935, 2130969936, 2130969937, 2130969938, 2130969939, 2130969940 });
        obtainStyledAttributes.getDimension(0, -1.0f);
        final TypedValue peekValue = obtainStyledAttributes.peekValue(4);
        if (peekValue != null && peekValue.data == -1) {
            this.LIZ(peekValue.data);
        }
        else {
            this.LIZ(obtainStyledAttributes.getDimensionPixelSize(4, -1));
        }
        this.LIZIZ(obtainStyledAttributes.getBoolean(3, false));
        this.LIZ(obtainStyledAttributes.getBoolean(2, true));
        this.LJIIJ = obtainStyledAttributes.getBoolean(5, false);
        this.LJIIJJI = obtainStyledAttributes.getBoolean(6, true);
        this.LJJIJIIJI = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        final TypedValue typedValue = new TypedValue();
        obtainStyledAttributes.getValue(8, typedValue);
        this.LJJIJIIJIL = typedValue.getFloat();
        obtainStyledAttributes.getDimensionPixelSize(11, -1);
        obtainStyledAttributes.getValue(12, typedValue);
        typedValue.getFloat();
        this.LJJIJIL = obtainStyledAttributes.getDimensionPixelSize(9, -1);
        obtainStyledAttributes.getValue(10, typedValue);
        this.LJJIJL = typedValue.getFloat();
        obtainStyledAttributes.getValue(14, typedValue);
        this.LJJIJLIJ = typedValue.getFloat();
        this.LIZLLL = obtainStyledAttributes.getDimensionPixelSize(13, 0);
        obtainStyledAttributes.recycle();
        this.LJIJJ = (float)ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
    
    public static <V extends View> LiveBottomSheetBehavior<V> LIZ(final V v) {
        final ViewGroup$LayoutParams layoutParams = v.getLayoutParams();
        if (!(layoutParams instanceof e)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        final 1nH.b liz = ((e)layoutParams).LIZ;
        if (liz instanceof LiveBottomSheetBehavior) {
            return (LiveBottomSheetBehavior<V>)liz;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }
    
    private View LIZIZ(final View view) {
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (view instanceof ViewGroup) {
            final ViewGroup viewGroup = (ViewGroup)view;
            for (int i = 0; i < viewGroup.getChildCount(); ++i) {
                final View liziz = this.LIZIZ(viewGroup.getChildAt(i));
                if (liziz != null) {
                    return liziz;
                }
            }
        }
        return null;
    }
    
    private void LIZIZ() {
        if (this.LJIILL != null) {
            this.LIZLLL();
            if (this.LJIIL == 4) {
                final View view = this.LJIILL.get();
                if (view != null) {
                    view.requestLayout();
                }
            }
        }
    }
    
    private int LIZJ() {
        int n;
        if ((n = this.LIZJ) == -1) {
            n = Math.min(Math.max(this.LIZLLL, (int)(this.LJIILJJIL * this.LJJIJLIJ)), this.LJJIII);
        }
        return n;
    }
    
    private void LIZJ(final boolean b) {
        final WeakReference<V> ljiill = this.LJIILL;
        if (ljiill == null) {
            return;
        }
        final ViewParent parent = ljiill.get().getParent();
        if (!(parent instanceof 1nH)) {
            return;
        }
        final 1nH 1nH = (1nH)parent;
        final int childCount = 1nH.getChildCount();
        if (b) {
            if (this.LJJIJ != null) {
                return;
            }
            this.LJJIJ = new HashMap<View, Integer>(childCount);
        }
        for (int i = 0; i < childCount; ++i) {
            final View child = 1nH.getChildAt(i);
            if (child != this.LJIILL.get()) {
                if (b) {
                    this.LJJIJ.put(child, child.getImportantForAccessibility());
                    if (this.LJIJI) {
                        child.setImportantForAccessibility(4);
                    }
                }
                else if (this.LJIJI) {
                    final Map<View, Integer> ljjij = this.LJJIJ;
                    if (ljjij != null && ljjij.containsKey(child)) {
                        child.setImportantForAccessibility((int)this.LJJIJ.get(child));
                    }
                }
            }
        }
        if (!b) {
            this.LJJIJ = null;
            return;
        }
        if (this.LJIJI) {
            this.LJIILL.get().sendAccessibilityEvent(8);
        }
    }
    
    private void LIZLLL() {
        final int lizj = this.LIZJ();
        if (this.LIZIZ) {
            this.LJIIIIZZ = Math.max(this.LJIILJJIL - lizj, this.LJFF);
            return;
        }
        this.LJIIIIZZ = this.LJIILJJIL - lizj;
    }
    
    private void LJ() {
        this.LJIIZILJ = -1;
        final VelocityTracker ljjiiz = this.LJJIIZ;
        if (ljjiiz != null) {
            ljjiiz.recycle();
            this.LJJIIZ = null;
        }
    }
    
    private void LJ(final int n) {
        final View view = this.LJIILL.get();
        if (view == null) {
            return;
        }
        final ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
            view.post((Runnable)new Runnable() {
                static {
                    Covode.recordClassIndex(6059);
                }
                
                @Override
                public final void run() {
                    LiveBottomSheetBehavior.this.LIZ(view, n);
                }
            });
            return;
        }
        this.LIZ(view, n);
    }
    
    private float LJFF() {
        final VelocityTracker ljjiiz = this.LJJIIZ;
        if (ljjiiz == null) {
            return 0.0f;
        }
        ljjiiz.computeCurrentVelocity(1000, this.LJIJJ);
        return this.LJJIIZ.getYVelocity(this.LJIIZILJ);
    }
    
    public final int LIZ() {
        if (this.LIZIZ) {
            return this.LJFF;
        }
        return this.LJ;
    }
    
    public final void LIZ(final int n) {
        if (n == -1) {
            if (this.LJIJJLI) {
                return;
            }
            this.LJIJJLI = true;
        }
        else {
            if (!this.LJIJJLI && this.LIZJ == n) {
                return;
            }
            this.LJIJJLI = false;
            this.LIZJ = Math.max(0, n);
        }
        this.LIZIZ();
    }
    
    public final void LIZ(final a a) {
        if (!this.LJJIIJZLJL.contains(a)) {
            this.LJJIIJZLJL.add(a);
        }
    }
    
    public final void LIZ(final View view, int n) {
        int n2 = 0;
        Label_0010: {
            if (n == 4) {
                n2 = this.LJIIIIZZ;
            }
            else if (n == 6) {
                final int lji = this.LJI;
                if (this.LIZIZ) {
                    n2 = this.LJFF;
                    if (lji <= n2) {
                        n = 3;
                        break Label_0010;
                    }
                }
                n2 = lji;
            }
            else if (n == 3) {
                n2 = this.LIZ();
            }
            else {
                if (!this.LJIIIZ || n != 5) {
                    throw new IllegalArgumentException("Illegal state argument: ".concat(String.valueOf(n)));
                }
                n2 = this.LJIILJJIL;
            }
        }
        this.LIZ(view, n, n2, false);
    }
    
    public final void LIZ(final View view, final int n, final int n2, final boolean b) {
        final 08u ljiiliil = this.LJIILIIL;
        Label_0116: {
            if (ljiiliil != null) {
                if (b) {
                    if (!ljiiliil.LIZ(view.getLeft(), n2)) {
                        break Label_0116;
                    }
                }
                else if (!ljiiliil.LIZ(view, view.getLeft(), n2)) {
                    break Label_0116;
                }
                this.LIZJ(2);
                if (this.LJJ == null) {
                    this.LJJ = new b(view, n);
                }
                if (!this.LJJ.LIZ) {
                    this.LJJ.LIZIZ = n;
                    view.postOnAnimation((Runnable)this.LJJ);
                    this.LJJ.LIZ = true;
                    return;
                }
                this.LJJ.LIZIZ = n;
                return;
            }
        }
        this.LIZJ(n);
    }
    
    public final void LIZ(final boolean liziz) {
        if (this.LIZIZ == liziz) {
            return;
        }
        this.LIZIZ = liziz;
        if (this.LJIILL != null) {
            this.LIZLLL();
        }
        int ljiil;
        if (this.LIZIZ && this.LJIIL == 6) {
            ljiil = 3;
        }
        else {
            ljiil = this.LJIIL;
        }
        this.LIZJ(ljiil);
    }
    
    public final boolean LIZ(final View view, float abs) {
        if (this.LJIIJ) {
            return true;
        }
        if (view.getTop() < this.LJIIIIZZ) {
            return false;
        }
        final int lizj = this.LIZJ();
        abs = Math.abs(view.getTop() + abs * 0.01f - this.LJIIIIZZ);
        return abs > Math.min(this.LJJIIJ, lizj >> 1) || abs / this.LJIILJJIL > 0.16f;
    }
    
    public final void LIZIZ(final int ljiil) {
        if (ljiil == this.LJIIL) {
            return;
        }
        if (this.LJIILL == null) {
            if (ljiil == 4 || ljiil == 3 || ljiil == 6 || (this.LJIIIZ && ljiil == 5)) {
                this.LJIIL = ljiil;
            }
            return;
        }
        this.LJ(ljiil);
    }
    
    public final void LIZIZ(final boolean ljiiiz) {
        if (this.LJIIIZ != ljiiiz && !(this.LJIIIZ = ljiiiz) && this.LJIIL == 5) {
            this.LIZIZ(4);
        }
    }
    
    public final boolean LIZIZ(final View view, float abs) {
        final int ljiiljjil = this.LJIILJJIL;
        final int liz = this.LIZ();
        abs = Math.abs(view.getTop() + abs * 0.01f - this.LIZ());
        final int ljjiij = this.LJJIIJ;
        int n;
        if (this.LJIIJ) {
            n = ljjiij;
        }
        else {
            n = this.LJIIIIZZ - this.LIZ() >> 1;
        }
        return abs < Math.min(ljiiljjil - liz >> 2, Math.min(ljjiij, n)) && abs / this.LJIILJJIL < 0.16f;
    }
    
    public final void LIZJ(final int ljiil) {
        if (this.LJIIL == ljiil) {
            return;
        }
        this.LJIIL = ljiil;
        final WeakReference<V> ljiill = this.LJIILL;
        if (ljiill == null) {
            return;
        }
        final View view = ljiill.get();
        if (view == null) {
            return;
        }
        final int n = 0;
        int i = 0;
        Label_0052: {
            if (ljiil == 3) {
                this.LIZJ(true);
                i = n;
            }
            else {
                if (ljiil != 6 && ljiil != 5) {
                    i = n;
                    if (ljiil != 4) {
                        break Label_0052;
                    }
                }
                this.LIZJ(false);
                i = n;
            }
        }
        while (i < this.LJJIIJZLJL.size()) {
            ((a)this.LJJIIJZLJL.get(i)).LIZ(view, ljiil);
            ++i;
        }
    }
    
    public final void LIZLLL(int i) {
        final View view = this.LJIILL.get();
        if (view != null && !this.LJJIIJZLJL.isEmpty()) {
            final int ljiiiizz = this.LJIIIIZZ;
            float n;
            float n2;
            if (i > ljiiiizz || ljiiiizz == this.LIZ()) {
                final int ljiiiizz2 = this.LJIIIIZZ;
                n = (float)(ljiiiizz2 - i);
                n2 = (float)(this.LJIILJJIL - ljiiiizz2);
            }
            else {
                final int ljiiiizz3 = this.LJIIIIZZ;
                n = (float)(ljiiiizz3 - i);
                n2 = (float)(ljiiiizz3 - this.LIZ());
            }
            final float n3 = n / n2;
            for (i = 0; i < this.LJJIIJZLJL.size(); ++i) {
                ((a)this.LJJIIJZLJL.get(i)).LIZ(view, n3);
            }
        }
    }
    
    @Override
    public 07p onApplyWindowInsets(final 1nH 1nH, final V v, final 07p 07p) {
        this.LJIL = 07p.LIZIZ();
        07p.LIZLLL();
        v.setPadding(v.getPaddingLeft(), v.getPaddingTop(), v.getPaddingRight(), 07p.LIZLLL());
        return 07p;
    }
    
    @Override
    public void onAttachedToLayoutParams(final e e) {
        super.onAttachedToLayoutParams(e);
        this.LJIILL = null;
        this.LJIILIIL = null;
    }
    
    @Override
    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.LJIILL = null;
        this.LJIILIIL = null;
    }
    
    @Override
    public boolean onInterceptTouchEvent(final 1nH 1nH, final V v, final MotionEvent motionEvent) {
        if (!v.isShown() || !this.LJIIJJI) {
            this.LJJI = true;
            return false;
        }
        final int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.LJ();
        }
        if (this.LJJIIZ == null) {
            this.LJJIIZ = VelocityTracker.obtain();
        }
        this.LJJIIZ.addMovement(motionEvent);
        final View view = null;
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.LJIJ = false;
                this.LJIIZILJ = -1;
                if (this.LJJI) {
                    return this.LJJI = false;
                }
            }
        }
        else {
            final int n = (int)motionEvent.getX();
            this.LJJIIZI = (int)motionEvent.getY();
            if (this.LJIIL != 2) {
                final WeakReference<View> ljiilliil = this.LJIILLIIL;
                if (ljiilliil != null) {
                    final View view2 = ljiilliil.get();
                    if (view2 != null && 1nH.LIZ(view2, n, this.LJJIIZI)) {
                        this.LJIIZILJ = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.LJIJ = true;
                    }
                }
            }
            this.LJJI = (this.LJIIZILJ == -1 && !1nH.LIZ(v, n, this.LJJIIZI));
        }
        if (!this.LJJI) {
            final 08u ljiiliil = this.LJIILIIL;
            if (ljiiliil != null && ljiiliil.LIZ(motionEvent)) {
                return true;
            }
        }
        final WeakReference<View> ljiilliil2 = this.LJIILLIIL;
        View view3 = view;
        if (ljiilliil2 != null) {
            view3 = ljiilliil2.get();
        }
        return actionMasked == 2 && view3 != null && !this.LJJI && this.LJIIL != 1 && !1nH.LIZ(view3, (int)motionEvent.getX(), (int)motionEvent.getY()) && this.LJIILIIL != null && Math.abs(this.LJJIIZI - motionEvent.getY()) > this.LJIILIIL.LIZIZ;
    }
    
    @Override
    public boolean onLayoutChild(final 1nH 1nH, final V v, int ljjiii) {
        if (this.LJIILL == null) {
            this.LJIILL = new WeakReference<V>(v);
            if (v.getImportantForAccessibility() == 0) {
                v.setImportantForAccessibility(1);
            }
        }
        if (this.LJIILIIL == null) {
            this.LJIILIIL = 08u.LIZ(1nH, this.LJJIL);
        }
        final int top = v.getTop();
        1nH.LIZIZ(v, ljjiii);
        1nH.getWidth();
        this.LJIILJJIL = 1nH.getHeight();
        final int height = v.getHeight();
        this.LJJIII = height;
        ljjiii = this.LJIILJJIL;
        this.LJJIIJ = (int)(ljjiii * 0.25f);
        if (ljjiii - height < this.LJIL) {
            this.LJJIII = ljjiii;
        }
        this.LJFF = Math.max(0, ljjiii - this.LJJIII);
        this.LJI = (int)(this.LJIILJJIL * (1.0f - this.LJII));
        this.LIZLLL();
        ljjiii = this.LJIIL;
        if (ljjiii == 3) {
            t.LIZIZ(v, this.LIZ());
        }
        else if (ljjiii == 6) {
            t.LIZIZ(v, this.LJI);
        }
        else if (this.LJIIIZ && ljjiii == 5) {
            t.LIZIZ(v, this.LJIILJJIL);
        }
        else if (ljjiii == 4) {
            t.LIZIZ(v, this.LJIIIIZZ);
        }
        else if (ljjiii == 1 || ljjiii == 2) {
            t.LIZIZ(v, top - v.getTop());
        }
        this.LJIILLIIL = new WeakReference<View>(this.LIZIZ(v));
        return true;
    }
    
    @Override
    public boolean onMeasureChild(final 1nH 1nH, final V v, int measureSpec, final int n, final int n2, final int n3) {
        final int orientation = v.getContext().getResources().getConfiguration().orientation;
        final int size = View$MeasureSpec.getSize(n2);
        if (orientation != 1) {
            measureSpec = View$MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)v.getLayoutParams();
            v.measure(measureSpec, ViewGroup.getChildMeasureSpec(n2, 1nH.getPaddingTop() + 1nH.getPaddingBottom() + viewGroup$MarginLayoutParams.topMargin + viewGroup$MarginLayoutParams.bottomMargin + n3, viewGroup$MarginLayoutParams.height));
            return true;
        }
        int ljjijiiji = this.LJJIJIIJI;
        if (ljjijiiji == -1) {
            final float ljjijiijil = this.LJJIJIIJIL;
            if (ljjijiijil > 0.0f) {
                ljjijiiji = (int)(ljjijiijil * size);
            }
            else {
                ljjijiiji = -1;
            }
        }
        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams2 = (ViewGroup$MarginLayoutParams)v.getLayoutParams();
        final int childMeasureSpec = ViewGroup.getChildMeasureSpec(measureSpec, 1nH.getPaddingLeft() + 1nH.getPaddingRight() + viewGroup$MarginLayoutParams2.leftMargin + viewGroup$MarginLayoutParams2.rightMargin + n, viewGroup$MarginLayoutParams2.width);
        if (ljjijiiji != -1) {
            v.measure(childMeasureSpec, View$MeasureSpec.makeMeasureSpec(ljjijiiji, 1073741824));
            return true;
        }
        int ljjijil = this.LJJIJIL;
        if (ljjijil == -1) {
            final float ljjijl = this.LJJIJL;
            if (ljjijl <= 0.0f) {
                return super.onMeasureChild(1nH, v, measureSpec, n, n2, n3);
            }
            ljjijil = (int)(size * ljjijl);
        }
        if (ljjijil != -1) {
            v.measure(childMeasureSpec, View$MeasureSpec.makeMeasureSpec(ljjijil, Integer.MIN_VALUE));
            return true;
        }
        return super.onMeasureChild(1nH, v, measureSpec, n, n2, n3);
    }
    
    @Override
    public boolean onNestedPreFling(final 1nH 1nH, final V v, final View view, final float n, final float n2) {
        final WeakReference<View> ljiilliil = this.LJIILLIIL;
        return ljiilliil != null && view == ljiilliil.get() && (this.LJIIL != 3 || super.onNestedPreFling(1nH, v, view, n, n2));
    }
    
    @Override
    public void onNestedPreScroll(final 1nH 1nH, final V v, final View view, int n, final int ljjiffi, final int[] array, int top) {
        if (top == 1) {
            return;
        }
        final WeakReference<View> ljiilliil = this.LJIILLIIL;
        Object value;
        if (ljiilliil != null) {
            value = ljiilliil.get();
        }
        else {
            value = null;
        }
        if (view != value) {
            return;
        }
        top = v.getTop();
        n = top - ljjiffi;
        if (ljjiffi > 0) {
            if (n < this.LIZ()) {
                array[1] = top - this.LIZ();
                t.LIZIZ(v, -array[1]);
                this.LIZJ(3);
            }
            else {
                if (!this.LJIIJJI) {
                    return;
                }
                t.LIZIZ(v, -(array[1] = ljjiffi));
                this.LIZJ(1);
            }
        }
        else if (ljjiffi < 0 && !view.canScrollVertically(-1)) {
            final int ljiiiizz = this.LJIIIIZZ;
            if (n <= ljiiiizz || this.LJIIIZ) {
                if (!this.LJIIJJI) {
                    return;
                }
                t.LIZIZ(v, -(array[1] = ljjiffi));
                this.LIZJ(1);
            }
            else {
                array[1] = top - ljiiiizz;
                t.LIZIZ(v, -array[1]);
                this.LIZJ(4);
            }
        }
        this.LIZLLL(v.getTop());
        this.LJJIFFI = ljjiffi;
        this.LJJII = true;
    }
    
    @Override
    public void onNestedScroll(final 1nH 1nH, final V v, final View view, final int n, final int n2, final int n3, final int n4) {
    }
    
    @Override
    public void onNestedScroll(final 1nH 1nH, final V v, final View view, final int n, final int n2, final int n3, final int n4, final int n5) {
    }
    
    @Override
    public void onRestoreInstanceState(final 1nH 1nH, final V v, final Parcelable parcelable) {
        final SavedState savedState = (SavedState)parcelable;
        super.onRestoreInstanceState(1nH, v, savedState.LIZLLL);
        final int liz = this.LIZ;
        if (liz != 0) {
            if (liz == -1 || (liz & 0x1) == 0x1) {
                this.LIZJ = savedState.LIZIZ;
            }
            final int liz2 = this.LIZ;
            if (liz2 == -1 || (liz2 & 0x2) == 0x2) {
                this.LIZIZ = savedState.LJ;
            }
            final int liz3 = this.LIZ;
            if (liz3 == -1 || (liz3 & 0x4) == 0x4) {
                this.LJIIIZ = savedState.LJFF;
            }
            final int liz4 = this.LIZ;
            if (liz4 == -1 || (liz4 & 0x8) == 0x8) {
                this.LJIIJ = savedState.LJI;
            }
        }
        if (savedState.LIZ == 1 || savedState.LIZ == 2) {
            this.LJIIL = 4;
            return;
        }
        this.LJIIL = savedState.LIZ;
    }
    
    @Override
    public Parcelable onSaveInstanceState(final 1nH 1nH, final V v) {
        return (Parcelable)new SavedState(super.onSaveInstanceState(1nH, v), this);
    }
    
    @Override
    public boolean onStartNestedScroll(final 1nH 1nH, final V v, final View view, final View view2, final int n, final int n2) {
        boolean b = false;
        this.LJJIFFI = 0;
        this.LJJII = false;
        if ((n & 0x2) != 0x0) {
            b = true;
        }
        return b;
    }
    
    @Override
    public void onStopNestedScroll(final 1nH 1nH, final V v, final View view, int n) {
        n = v.getTop();
        final int liz = this.LIZ();
        int n2 = 3;
        if (n == liz) {
            this.LIZJ(3);
            return;
        }
        final WeakReference<View> ljiilliil = this.LJIILLIIL;
        if (ljiilliil != null && view == ljiilliil.get() && this.LJJII) {
            while (true) {
                Label_0335: {
                    if (this.LJJIFFI > 0 || this.LIZIZ(v, this.LJFF())) {
                        if (this.LIZIZ) {
                            n = this.LJFF;
                        }
                        else {
                            final int top = v.getTop();
                            n = this.LJI;
                            if (top > n) {
                                break Label_0335;
                            }
                            n = this.LJ;
                        }
                    }
                    else if (this.LJIIIZ && this.LIZ(v, this.LJFF())) {
                        n = this.LJIILJJIL;
                        n2 = 5;
                    }
                    else {
                        if (this.LJJIFFI == 0) {
                            final int top2 = v.getTop();
                            if (this.LIZIZ) {
                                if (Math.abs(top2 - this.LJFF) < Math.abs(top2 - this.LJIIIIZZ)) {
                                    n = this.LJFF;
                                    break Label_0085;
                                }
                                n = this.LJIIIIZZ;
                            }
                            else {
                                n = this.LJI;
                                if (top2 < n) {
                                    if (top2 < Math.abs(top2 - this.LJIIIIZZ)) {
                                        n = this.LJ;
                                        break Label_0085;
                                    }
                                    n = this.LJI;
                                    break Label_0335;
                                }
                                else {
                                    if (Math.abs(top2 - n) < Math.abs(top2 - this.LJIIIIZZ)) {
                                        n = this.LJI;
                                        break Label_0335;
                                    }
                                    n = this.LJIIIIZZ;
                                }
                            }
                        }
                        else {
                            if (!this.LIZIZ) {
                                n = v.getTop();
                                if (Math.abs(n - this.LJI) < Math.abs(n - this.LJIIIIZZ)) {
                                    n = this.LJI;
                                    break Label_0335;
                                }
                            }
                            n = this.LJIIIIZZ;
                        }
                        n2 = 4;
                    }
                    this.LIZ(v, n2, n, false);
                    this.LJJII = false;
                    return;
                }
                n2 = 6;
                continue;
            }
        }
    }
    
    @Override
    public boolean onTouchEvent(final 1nH 1nH, final V v, final MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        final int actionMasked = motionEvent.getActionMasked();
        if (this.LJIIL == 1 && actionMasked == 0) {
            return true;
        }
        final 08u ljiiliil = this.LJIILIIL;
        if (ljiiliil != null) {
            ljiiliil.LIZIZ(motionEvent);
        }
        if (actionMasked == 0) {
            this.LJ();
        }
        if (this.LJJIIZ == null) {
            this.LJJIIZ = VelocityTracker.obtain();
        }
        this.LJJIIZ.addMovement(motionEvent);
        if (this.LJIILIIL != null && actionMasked == 2 && !this.LJJI && Math.abs(this.LJJIIZI - motionEvent.getY()) > this.LJIILIIL.LIZIZ) {
            this.LJIILIIL.LIZ(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.LJJI;
    }
    
    public static class SavedState extends AbsSavedState
    {
        public static final Parcelable$Creator<SavedState> CREATOR;
        public final int LIZ;
        public int LIZIZ;
        public boolean LJ;
        public boolean LJFF;
        public boolean LJI;
        
        static {
            Covode.recordClassIndex(6061);
            CREATOR = (Parcelable$Creator)new Parcelable$ClassLoaderCreator<SavedState>() {
                static {
                    Covode.recordClassIndex(6062);
                }
            };
        }
        
        public SavedState(final Parcel parcel, final ClassLoader classLoader) {
            super(parcel, classLoader);
            this.LIZ = parcel.readInt();
            this.LIZIZ = parcel.readInt();
            final int int1 = parcel.readInt();
            final boolean b = false;
            this.LJ = (int1 == 1);
            this.LJFF = (parcel.readInt() == 1);
            boolean lji = b;
            if (parcel.readInt() == 1) {
                lji = true;
            }
            this.LJI = lji;
        }
        
        public SavedState(final Parcelable parcelable, final LiveBottomSheetBehavior<?> liveBottomSheetBehavior) {
            super(parcelable);
            this.LIZ = liveBottomSheetBehavior.LJIIL;
            this.LIZIZ = liveBottomSheetBehavior.LIZJ;
            this.LJ = liveBottomSheetBehavior.LIZIZ;
            this.LJFF = liveBottomSheetBehavior.LJIIIZ;
            this.LJI = liveBottomSheetBehavior.LJIIJ;
        }
        
        @Override
        public void writeToParcel(final Parcel parcel, final int n) {
            super.writeToParcel(parcel, n);
            parcel.writeInt(this.LIZ);
            parcel.writeInt(this.LIZIZ);
            parcel.writeInt((int)(this.LJ ? 1 : 0));
            parcel.writeInt((int)(this.LJFF ? 1 : 0));
            parcel.writeInt((int)(this.LJI ? 1 : 0));
        }
    }
    
    public final class b implements Runnable
    {
        public boolean LIZ;
        public int LIZIZ;
        public final View LIZLLL;
        
        static {
            Covode.recordClassIndex(6064);
        }
        
        public b(final View lizlll, final int liziz) {
            this.LIZLLL = lizlll;
            this.LIZIZ = liziz;
        }
        
        @Override
        public final void run() {
            if (LiveBottomSheetBehavior.this.LJIILIIL != null && LiveBottomSheetBehavior.this.LJIILIIL.LIZJ()) {
                this.LIZLLL.postOnAnimation((Runnable)this);
            }
            else {
                LiveBottomSheetBehavior.this.LIZJ(this.LIZIZ);
            }
            this.LIZ = false;
        }
    }
    
    public abstract static class a
    {
        static {
            Covode.recordClassIndex(6063);
        }
        
        public abstract void LIZ(final View p0, final float p1);
        
        public abstract void LIZ(final View p0, final int p1);
    }
}
