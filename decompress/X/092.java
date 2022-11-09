// 
// Decompiled by Procyon v0.6.0
// 

package X;

import androidx.customview.view.AbsSavedState;
import android.view.accessibility.AccessibilityEvent;
import android.view.ViewParent;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.os.Parcelable;
import android.view.View$MeasureSpec;
import android.view.KeyEvent;
import android.view.WindowInsets;
import android.view.ViewGroup$MarginLayoutParams;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.ViewGroup$LayoutParams;
import android.view.Gravity;
import android.view.View$OnApplyWindowInsetsListener;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.core.g.t;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import android.graphics.drawable.Drawable;
import android.graphics.Paint;
import java.util.List;
import android.view.ViewGroup;

public class 092 extends ViewGroup
{
    public static final int[] LIZ;
    public static final boolean LIZIZ;
    public static final int[] LJIIIIZZ;
    public static final boolean LJIIIZ;
    public boolean LIZJ;
    public List<c> LIZLLL;
    public CharSequence LJ;
    public CharSequence LJFF;
    public Object LJI;
    public boolean LJII;
    public final b LJIIJ;
    public float LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    public float LJIILJJIL;
    public Paint LJIILL;
    public final 08u LJIILLIIL;
    public final 08u LJIIZILJ;
    public final e LJIJ;
    public final e LJIJI;
    public int LJIJJ;
    public boolean LJIJJLI;
    public boolean LJIL;
    public int LJJ;
    public int LJJI;
    public int LJJIFFI;
    public int LJJII;
    public c LJJIII;
    public float LJJIIJ;
    public float LJJIIJZLJL;
    public Drawable LJJIIZ;
    public Drawable LJJIIZI;
    public Drawable LJJIJ;
    public Drawable LJJIJIIJI;
    public Drawable LJJIJIIJIL;
    public Drawable LJJIJIL;
    public Drawable LJJIJL;
    public final ArrayList<View> LJJIJLIJ;
    public Rect LJJIL;
    public Matrix LJJIZ;
    
    static {
        Covode.recordClassIndex(942);
        LJIIIIZZ = new int[] { 16843828 };
        LIZ = new int[] { 16842931 };
        LIZIZ = true;
        LJIIIZ = true;
    }
    
    public 092(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public 092(Context obtainStyledAttributes, final AttributeSet set, final int n) {
        super(obtainStyledAttributes, set, 0);
        this.LJIIJ = new b();
        this.LJIILIIL = -1728053248;
        this.LJIILL = new Paint();
        this.LJIL = true;
        this.LJJ = 3;
        this.LJJI = 3;
        this.LJJIFFI = 3;
        this.LJJII = 3;
        this.LJJIJIIJI = null;
        this.LJJIJIIJIL = null;
        this.LJJIJIL = null;
        this.LJJIJL = null;
        this.setDescendantFocusability(262144);
        final float density = this.getResources().getDisplayMetrics().density;
        this.LJIIL = (int)(64.0f * density + 0.5f);
        final float n2 = 400.0f * density;
        final e ljij = new e(3);
        this.LJIJ = ljij;
        final e ljiji = new e(5);
        this.LJIJI = ljiji;
        final 08u liz = 08u.LIZ(this, 1.0f, (08u.a)ljij);
        this.LJIILLIIL = liz;
        liz.LJI = 1;
        liz.LIZLLL = n2;
        ljij.LIZIZ = liz;
        final 08u liz2 = 08u.LIZ(this, 1.0f, (08u.a)ljiji);
        this.LJIIZILJ = liz2;
        liz2.LJI = 2;
        liz2.LIZLLL = n2;
        ljiji.LIZIZ = liz2;
        this.setFocusableInTouchMode(true);
        ((View)this).setImportantForAccessibility(1);
        t.LIZ((View)this, new a());
        this.setMotionEventSplittingEnabled(false);
        if (((View)this).getFitsSystemWindows()) {
            this.setOnApplyWindowInsetsListener((View$OnApplyWindowInsetsListener)new DrawerLayout.DrawerLayout$1());
            this.setSystemUiVisibility(1280);
            obtainStyledAttributes = (Context)obtainStyledAttributes.obtainStyledAttributes(092.LJIIIIZZ);
            try {
                this.LJJIIZ = ((TypedArray)obtainStyledAttributes).getDrawable(0);
            }
            finally {
                ((TypedArray)obtainStyledAttributes).recycle();
            }
            ((TypedArray)obtainStyledAttributes).recycle();
        }
        this.LJIIJJI = density * 10.0f;
        this.LJJIJLIJ = new ArrayList<View>();
    }
    
    private void LIZ(final int n, final int n2) {
        final int absoluteGravity = Gravity.getAbsoluteGravity(n2, ((View)this).getLayoutDirection());
        if (n2 != 3) {
            if (n2 != 5) {
                if (n2 != 8388611) {
                    if (n2 == 8388613) {
                        this.LJJII = n;
                    }
                }
                else {
                    this.LJJIFFI = n;
                }
            }
            else {
                this.LJJI = n;
            }
        }
        else {
            this.LJJ = n;
        }
        if (n != 0) {
            08u 08u;
            if (absoluteGravity == 3) {
                08u = this.LJIILLIIL;
            }
            else {
                08u = this.LJIIZILJ;
            }
            08u.LIZ();
            if (n != 1) {
                if (n == 2) {
                    final View liziz = this.LIZIZ(absoluteGravity);
                    if (liziz != null) {
                        this.LIZJ(liziz, true);
                    }
                }
            }
            else {
                final View liziz2 = this.LIZIZ(absoluteGravity);
                if (liziz2 != null) {
                    this.LIZ(liziz2, true);
                }
            }
        }
    }
    
    private boolean LIZ(final Drawable drawable, final int n) {
        if (drawable == null || !drawable.isAutoMirrored()) {
            return false;
        }
        08U.LIZIZ(drawable, n);
        return true;
    }
    
    private void LIZIZ(final View view, final boolean b) {
        final int childCount = this.getChildCount();
        int i = 0;
    Label_0041_Outer:
        while (i < childCount) {
            final View child = this.getChildAt(i);
            while (true) {
                Label_0053: {
                    if (!b) {
                        if (!this.LIZLLL(child)) {
                            break Label_0053;
                        }
                    }
                    else if (child == view) {
                        break Label_0053;
                    }
                    child.setImportantForAccessibility(4);
                    ++i;
                    continue Label_0041_Outer;
                }
                child.setImportantForAccessibility(1);
                continue;
            }
        }
    }
    
    private View LIZJ() {
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            if ((((d)child.getLayoutParams()).LIZLLL & 0x1) == 0x1) {
                return child;
            }
        }
        return null;
    }
    
    private void LIZJ(final View view, final boolean b) {
        if (this.LIZLLL(view)) {
            final d d = (d)view.getLayoutParams();
            if (this.LJIL) {
                d.LIZIZ = 1.0f;
                d.LIZLLL = 1;
                this.LIZIZ(view, true);
            }
            else if (b) {
                d.LIZLLL |= 0x2;
                if (this.LIZ(view, 3)) {
                    this.LJIILLIIL.LIZ(view, 0, view.getTop());
                }
                else {
                    this.LJIIZILJ.LIZ(view, this.getWidth() - view.getWidth(), view.getTop());
                }
            }
            else {
                this.LIZIZ(view, 1.0f);
                this.LIZ(0, view);
                view.setVisibility(0);
            }
            this.invalidate();
            return;
        }
        final StringBuilder sb = new StringBuilder("View ");
        sb.append(view);
        sb.append(" is not a sliding drawer");
        throw new IllegalArgumentException(sb.toString());
    }
    
    private void LIZJ(final boolean b) {
        final int childCount = this.getChildCount();
        int i = 0;
        int n = 0;
        while (i < childCount) {
            final View child = this.getChildAt(i);
            final d d = (d)child.getLayoutParams();
            int n2 = n;
            Label_0110: {
                if (this.LIZLLL(child)) {
                    if (b) {
                        n2 = n;
                        if (!d.LIZJ) {
                            break Label_0110;
                        }
                    }
                    final int width = child.getWidth();
                    boolean b2;
                    if (this.LIZ(child, 3)) {
                        b2 = this.LJIILLIIL.LIZ(child, -width, child.getTop());
                    }
                    else {
                        b2 = this.LJIIZILJ.LIZ(child, this.getWidth(), child.getTop());
                    }
                    n2 = (n | (b2 ? 1 : 0));
                    d.LIZJ = false;
                }
            }
            ++i;
            n = n2;
        }
        this.LJIJ.LIZJ();
        this.LJIJI.LIZJ();
        if (n != 0) {
            this.invalidate();
        }
    }
    
    public static String LIZLLL(final int n) {
        if ((n & 0x3) == 0x3) {
            return "LEFT";
        }
        if ((n & 0x5) == 0x5) {
            return "RIGHT";
        }
        return Integer.toHexString(n);
    }
    
    public static boolean LJ(final View view) {
        return view.getImportantForAccessibility() != 4 && view.getImportantForAccessibility() != 2;
    }
    
    private boolean LJFF(final View view) {
        return ((d)view.getLayoutParams()).LIZ == 0;
    }
    
    private boolean LJI(final View view) {
        if (this.LIZLLL(view)) {
            return (((d)view.getLayoutParams()).LIZLLL & 0x1) == 0x1;
        }
        final StringBuilder sb = new StringBuilder("View ");
        sb.append(view);
        sb.append(" is not a drawer");
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final int LIZ(int n) {
        final int layoutDirection = ((View)this).getLayoutDirection();
        if (n != 3) {
            if (n != 5) {
                if (n != 8388611) {
                    if (n == 8388613) {
                        n = this.LJJII;
                        if (n != 3) {
                            return n;
                        }
                        if (layoutDirection == 0) {
                            n = this.LJJI;
                        }
                        else {
                            n = this.LJJ;
                        }
                        if (n != 3) {
                            return n;
                        }
                    }
                }
                else {
                    n = this.LJJIFFI;
                    if (n != 3) {
                        return n;
                    }
                    if (layoutDirection == 0) {
                        n = this.LJJ;
                    }
                    else {
                        n = this.LJJI;
                    }
                    if (n != 3) {
                        return n;
                    }
                }
            }
            else {
                n = this.LJJI;
                if (n != 3) {
                    return n;
                }
                if (layoutDirection == 0) {
                    n = this.LJJII;
                }
                else {
                    n = this.LJJIFFI;
                }
                if (n != 3) {
                    return n;
                }
            }
        }
        else {
            n = this.LJJ;
            if (n != 3) {
                return n;
            }
            if (layoutDirection == 0) {
                n = this.LJJIFFI;
            }
            else {
                n = this.LJJII;
            }
            if (n != 3) {
                return n;
            }
        }
        return 0;
    }
    
    public final int LIZ(final View view) {
        if (this.LIZLLL(view)) {
            return this.LIZ(((d)view.getLayoutParams()).LIZ);
        }
        final StringBuilder sb = new StringBuilder("View ");
        sb.append(view);
        sb.append(" is not a drawer");
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final void LIZ() {
        this.LIZIZ(true);
    }
    
    public final void LIZ(int i, View rootView) {
        final int liz = this.LJIILLIIL.LIZ;
        final int liz2 = this.LJIIZILJ.LIZ;
        final int n = 2;
        int ljijj;
        if (liz == 1 || liz2 == 1) {
            ljijj = 1;
        }
        else {
            ljijj = n;
            if (liz != 2) {
                if (liz2 == 2) {
                    ljijj = n;
                }
                else {
                    ljijj = 0;
                }
            }
        }
        if (rootView != null && i == 0) {
            final d d = (d)rootView.getLayoutParams();
            if (d.LIZIZ == 0.0f) {
                final d d2 = (d)rootView.getLayoutParams();
                if ((d2.LIZLLL & 0x1) == 0x1) {
                    d2.LIZLLL = 0;
                    final List<c> lizlll = this.LIZLLL;
                    if (lizlll != null) {
                        for (i = lizlll.size() - 1; i >= 0; --i) {
                            this.LIZLLL.get(i).LIZIZ(rootView);
                        }
                    }
                    this.LIZIZ(rootView, false);
                    if (this.hasWindowFocus()) {
                        rootView = this.getRootView();
                        if (rootView != null) {
                            rootView.sendAccessibilityEvent(32);
                        }
                    }
                }
            }
            else if (d.LIZIZ == 1.0f) {
                final d d3 = (d)rootView.getLayoutParams();
                if ((d3.LIZLLL & 0x1) == 0x0) {
                    d3.LIZLLL = 1;
                    final List<c> lizlll2 = this.LIZLLL;
                    if (lizlll2 != null) {
                        for (i = lizlll2.size() - 1; i >= 0; --i) {
                            this.LIZLLL.get(i).LIZ(rootView);
                        }
                    }
                    this.LIZIZ(rootView, true);
                    if (this.hasWindowFocus()) {
                        this.sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (ljijj != this.LJIJJ) {
            this.LJIJJ = ljijj;
            final List<c> lizlll3 = this.LIZLLL;
            if (lizlll3 != null) {
                for (i = lizlll3.size() - 1; i >= 0; --i) {
                    this.LIZLLL.get(i).LIZ(ljijj);
                }
            }
        }
    }
    
    public final void LIZ(final c c) {
        if (c == null) {
            return;
        }
        if (this.LIZLLL == null) {
            this.LIZLLL = new ArrayList<c>();
        }
        this.LIZLLL.add(c);
    }
    
    public final void LIZ(final View view, final float liziz) {
        final d d = (d)view.getLayoutParams();
        if (liziz == d.LIZIZ) {
            return;
        }
        d.LIZIZ = liziz;
        final List<c> lizlll = this.LIZLLL;
        if (lizlll != null) {
            for (int i = lizlll.size() - 1; i >= 0; --i) {
                this.LIZLLL.get(i).LIZ(view, liziz);
            }
        }
    }
    
    public final void LIZ(final View view, final boolean b) {
        if (this.LIZLLL(view)) {
            final d d = (d)view.getLayoutParams();
            if (this.LJIL) {
                d.LIZIZ = 0.0f;
                d.LIZLLL = 0;
            }
            else if (b) {
                d.LIZLLL |= 0x4;
                if (this.LIZ(view, 3)) {
                    this.LJIILLIIL.LIZ(view, -view.getWidth(), view.getTop());
                }
                else {
                    this.LJIIZILJ.LIZ(view, this.getWidth(), view.getTop());
                }
            }
            else {
                this.LIZIZ(view, 0.0f);
                this.LIZ(0, view);
                view.setVisibility(4);
            }
            this.invalidate();
            return;
        }
        final StringBuilder sb = new StringBuilder("View ");
        sb.append(view);
        sb.append(" is not a sliding drawer");
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final void LIZ(final boolean b) {
        final View liziz = this.LIZIZ(8388613);
        if (liziz != null) {
            this.LIZJ(liziz, b);
            return;
        }
        final StringBuilder sb = new StringBuilder("No drawer view found with gravity ");
        sb.append(LIZLLL(8388613));
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final boolean LIZ(final View view, final int n) {
        return (this.LIZJ(view) & n) == n;
    }
    
    public final float LIZIZ(final View view) {
        return ((d)view.getLayoutParams()).LIZIZ;
    }
    
    public final View LIZIZ() {
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            if (this.LIZLLL(child)) {
                if (!this.LIZLLL(child)) {
                    final StringBuilder sb = new StringBuilder("View ");
                    sb.append(child);
                    sb.append(" is not a drawer");
                    throw new IllegalArgumentException(sb.toString());
                }
                if (((d)child.getLayoutParams()).LIZIZ > 0.0f) {
                    return child;
                }
            }
        }
        return null;
    }
    
    public final View LIZIZ(int i) {
        final int absoluteGravity = Gravity.getAbsoluteGravity(i, ((View)this).getLayoutDirection());
        int childCount;
        View child;
        for (childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            child = this.getChildAt(i);
            if ((this.LIZJ(child) & 0x7) == (absoluteGravity & 0x7)) {
                return child;
            }
        }
        return null;
    }
    
    public void LIZIZ(final View view, final float n) {
        final float liziz = this.LIZIZ(view);
        final float n2 = (float)view.getWidth();
        int n3 = (int)(n2 * n) - (int)(liziz * n2);
        if (!this.LIZ(view, 3)) {
            n3 = -n3;
        }
        view.offsetLeftAndRight(n3);
        this.LIZ(view, n);
    }
    
    public final void LIZIZ(final boolean b) {
        final View liziz = this.LIZIZ(8388613);
        if (liziz != null) {
            this.LIZ(liziz, b);
            return;
        }
        final StringBuilder sb = new StringBuilder("No drawer view found with gravity ");
        sb.append(LIZLLL(8388613));
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final int LIZJ(final View view) {
        return Gravity.getAbsoluteGravity(((d)view.getLayoutParams()).LIZ, ((View)this).getLayoutDirection());
    }
    
    public final boolean LIZJ(final int n) {
        final View liziz = this.LIZIZ(n);
        return liziz != null && this.LJI(liziz);
    }
    
    public final boolean LIZLLL(final View view) {
        final int absoluteGravity = Gravity.getAbsoluteGravity(((d)view.getLayoutParams()).LIZ, view.getLayoutDirection());
        return (absoluteGravity & 0x3) != 0x0 || (absoluteGravity & 0x5) != 0x0;
    }
    
    public void addFocusables(final ArrayList<View> list, final int n, final int n2) {
        if (this.getDescendantFocusability() == 393216) {
            return;
        }
        final int childCount = this.getChildCount();
        final int n3 = 0;
        int i = 0;
        boolean b = false;
        while (i < childCount) {
            final View child = this.getChildAt(i);
            if (this.LIZLLL(child)) {
                if (this.LJI(child)) {
                    child.addFocusables((ArrayList)list, n, n2);
                    b = true;
                }
            }
            else {
                this.LJJIJLIJ.add(child);
            }
            ++i;
        }
        if (!b) {
            for (int size = this.LJJIJLIJ.size(), j = n3; j < size; ++j) {
                final View view = this.LJJIJLIJ.get(j);
                if (view.getVisibility() == 0) {
                    view.addFocusables((ArrayList)list, n, n2);
                }
            }
        }
        this.LJJIJLIJ.clear();
    }
    
    public void addView(final View view, final int n, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        super.addView(view, n, viewGroup$LayoutParams);
        if (this.LIZJ() != null || this.LIZLLL(view)) {
            view.setImportantForAccessibility(4);
        }
        else {
            view.setImportantForAccessibility(1);
        }
        if (!092.LIZIZ) {
            t.LIZ(view, this.LJIIJ);
        }
    }
    
    public boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof d && super.checkLayoutParams(viewGroup$LayoutParams);
    }
    
    public void computeScroll() {
        final int childCount = this.getChildCount();
        float max = 0.0f;
        for (int i = 0; i < childCount; ++i) {
            max = Math.max(max, ((d)this.getChildAt(i).getLayoutParams()).LIZIZ);
        }
        this.LJIILJJIL = max;
        final boolean lizj = this.LJIILLIIL.LIZJ();
        final boolean lizj2 = this.LJIIZILJ.LIZJ();
        if (lizj || lizj2) {
            ((View)this).postInvalidateOnAnimation();
        }
    }
    
    public boolean dispatchGenericMotionEvent(final MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 0x2) == 0x0 || motionEvent.getAction() == 10 || this.LJIILJJIL <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int i = this.getChildCount();
        if (i != 0) {
            final float x = motionEvent.getX();
            final float y = motionEvent.getY();
            --i;
            while (i >= 0) {
                final View child = this.getChildAt(i);
                if (this.LJJIL == null) {
                    this.LJJIL = new Rect();
                }
                child.getHitRect(this.LJJIL);
                if (this.LJJIL.contains((int)x, (int)y) && !this.LJFF(child)) {
                    boolean b;
                    if (!child.getMatrix().isIdentity()) {
                        final float n = (float)(this.getScrollX() - child.getLeft());
                        final float n2 = (float)(this.getScrollY() - child.getTop());
                        final MotionEvent obtain = MotionEvent.obtain(motionEvent);
                        obtain.offsetLocation(n, n2);
                        final Matrix matrix = child.getMatrix();
                        if (!matrix.isIdentity()) {
                            if (this.LJJIZ == null) {
                                this.LJJIZ = new Matrix();
                            }
                            matrix.invert(this.LJJIZ);
                            obtain.transform(this.LJJIZ);
                        }
                        b = child.dispatchGenericMotionEvent(obtain);
                        obtain.recycle();
                    }
                    else {
                        final float n3 = (float)(this.getScrollX() - child.getLeft());
                        final float n4 = (float)(this.getScrollY() - child.getTop());
                        motionEvent.offsetLocation(n3, n4);
                        b = child.dispatchGenericMotionEvent(motionEvent);
                        motionEvent.offsetLocation(-n3, -n4);
                    }
                    if (b) {
                        return true;
                    }
                }
                --i;
            }
        }
        return false;
    }
    
    public boolean drawChild(final Canvas canvas, final View view, final long n) {
        final int height = this.getHeight();
        final boolean ljff = this.LJFF(view);
        int width = this.getWidth();
        final int save = canvas.save();
        int n2 = 0;
        int n3 = width;
        if (ljff) {
            final int childCount = this.getChildCount();
            int i = 0;
            int n4 = 0;
            while (i < childCount) {
                final View child = this.getChildAt(i);
                int n5 = n4;
                int n6 = width;
                if (child != view) {
                    n5 = n4;
                    n6 = width;
                    if (child.getVisibility() == 0) {
                        final Drawable background = child.getBackground();
                        n5 = n4;
                        n6 = width;
                        if (background != null) {
                            n5 = n4;
                            n6 = width;
                            if (background.getOpacity() == -1) {
                                n5 = n4;
                                n6 = width;
                                if (this.LIZLLL(child)) {
                                    n5 = n4;
                                    n6 = width;
                                    if (child.getHeight() >= height) {
                                        if (this.LIZ(child, 3)) {
                                            final int right = child.getRight();
                                            n5 = n4;
                                            n6 = width;
                                            if (right > n4) {
                                                n5 = right;
                                                n6 = width;
                                            }
                                        }
                                        else {
                                            final int left = child.getLeft();
                                            n5 = n4;
                                            if (left < (n6 = width)) {
                                                n6 = left;
                                                n5 = n4;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                ++i;
                n4 = n5;
                width = n6;
            }
            canvas.clipRect(n4, 0, width, this.getHeight());
            n2 = n4;
            n3 = width;
        }
        final boolean drawChild = super.drawChild(canvas, view, n);
        canvas.restoreToCount(save);
        final float ljiiljjil = this.LJIILJJIL;
        if (ljiiljjil > 0.0f && ljff) {
            final int ljiiliil = this.LJIILIIL;
            this.LJIILL.setColor((ljiiliil & 0xFFFFFF) | (int)(((0xFF000000 & ljiiliil) >>> 24) * ljiiljjil) << 24);
            canvas.drawRect((float)n2, 0.0f, (float)n3, (float)this.getHeight(), this.LJIILL);
        }
        else if (this.LJJIIZI != null && this.LIZ(view, 3)) {
            final int intrinsicWidth = this.LJJIIZI.getIntrinsicWidth();
            final int right2 = view.getRight();
            final float max = Math.max(0.0f, Math.min(right2 / (float)this.LJIILLIIL.LJ, 1.0f));
            this.LJJIIZI.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.LJJIIZI.setAlpha((int)(max * 255.0f));
            this.LJJIIZI.draw(canvas);
        }
        else if (this.LJJIJ != null && this.LIZ(view, 5)) {
            final int intrinsicWidth2 = this.LJJIJ.getIntrinsicWidth();
            final int left2 = view.getLeft();
            final float max2 = Math.max(0.0f, Math.min((this.getWidth() - left2) / (float)this.LJIIZILJ.LJ, 1.0f));
            this.LJJIJ.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.LJJIJ.setAlpha((int)(max2 * 255.0f));
            this.LJJIJ.draw(canvas);
        }
        return drawChild;
    }
    
    public ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return (ViewGroup$LayoutParams)new d();
    }
    
    public ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        return (ViewGroup$LayoutParams)new d(this.getContext(), set);
    }
    
    public ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (viewGroup$LayoutParams instanceof d) {
            return (ViewGroup$LayoutParams)new d((d)viewGroup$LayoutParams);
        }
        if (viewGroup$LayoutParams instanceof ViewGroup$MarginLayoutParams) {
            return (ViewGroup$LayoutParams)new d((ViewGroup$MarginLayoutParams)viewGroup$LayoutParams);
        }
        return (ViewGroup$LayoutParams)new d(viewGroup$LayoutParams);
    }
    
    public float getDrawerElevation() {
        if (092.LJIIIZ) {
            return this.LJIIJJI;
        }
        return 0.0f;
    }
    
    public Drawable getStatusBarBackgroundDrawable() {
        return this.LJJIIZ;
    }
    
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LJIL = true;
    }
    
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LJIL = true;
    }
    
    public void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        if (this.LJII && this.LJJIIZ != null) {
            final Object lji = this.LJI;
            if (lji != null) {
                final int systemWindowInsetTop = ((WindowInsets)lji).getSystemWindowInsetTop();
                if (systemWindowInsetTop > 0) {
                    this.LJJIIZ.setBounds(0, 0, this.getWidth(), systemWindowInsetTop);
                    this.LJJIIZ.draw(canvas);
                }
            }
        }
    }
    
    public boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        final int actionMasked = motionEvent.getActionMasked();
        final boolean liz = this.LJIILLIIL.LIZ(motionEvent);
        final boolean liz2 = this.LJIIZILJ.LIZ(motionEvent);
        boolean b = false;
        Label_0045: {
            if (actionMasked != 0) {
                while (true) {
                    Label_0132: {
                        if (actionMasked == 1) {
                            break Label_0132;
                        }
                        if (actionMasked != 2) {
                            if (actionMasked == 3) {
                                break Label_0132;
                            }
                        }
                        else if (this.LJIILLIIL.LIZLLL()) {
                            this.LJIJ.LIZJ();
                            this.LJIJI.LIZJ();
                        }
                        b = false;
                        break Label_0045;
                    }
                    this.LIZJ(true);
                    this.LIZJ = false;
                    continue;
                }
            }
            final float x = motionEvent.getX();
            final float y = motionEvent.getY();
            this.LJJIIJ = x;
            this.LJJIIJZLJL = y;
            while (true) {
                Label_0214: {
                    if (this.LJIILJJIL <= 0.0f) {
                        break Label_0214;
                    }
                    final View liziz = this.LJIILLIIL.LIZIZ((int)x, (int)y);
                    if (liziz == null || !this.LJFF(liziz)) {
                        break Label_0214;
                    }
                    b = true;
                    this.LIZJ = false;
                    break Label_0045;
                }
                b = false;
                continue;
            }
        }
        if (!(liz | liz2) && !b) {
            for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
                if (((d)this.getChildAt(i).getLayoutParams()).LIZJ) {
                    return true;
                }
            }
            if (!this.LIZJ) {
                return false;
            }
        }
        return true;
    }
    
    public boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        if (n == 4 && this.LIZIZ() != null) {
            keyEvent.startTracking();
            return true;
        }
        return super.onKeyDown(n, keyEvent);
    }
    
    public boolean onKeyUp(final int n, final KeyEvent keyEvent) {
        if (n != 4) {
            return super.onKeyUp(n, keyEvent);
        }
        final View liziz = this.LIZIZ();
        if (liziz != null) {
            if (this.LIZ(liziz) == 0) {
                this.LIZJ(false);
            }
            return true;
        }
        return false;
    }
    
    public void onLayout(final boolean b, int topMargin, final int n, int i, final int n2) {
        this.LJIJJLI = true;
        final int n3 = i - topMargin;
        int childCount;
        View child;
        d d;
        int measuredWidth;
        int measuredHeight;
        float n4;
        int n5;
        float n6;
        float n7;
        int n8;
        int n9;
        int n10;
        for (childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            child = this.getChildAt(i);
            if (child.getVisibility() != 8) {
                d = (d)child.getLayoutParams();
                if (this.LJFF(child)) {
                    child.layout(d.leftMargin, d.topMargin, d.leftMargin + child.getMeasuredWidth(), d.topMargin + child.getMeasuredHeight());
                }
                else {
                    measuredWidth = child.getMeasuredWidth();
                    measuredHeight = child.getMeasuredHeight();
                    if (this.LIZ(child, 3)) {
                        topMargin = -measuredWidth;
                        n4 = (float)measuredWidth;
                        n5 = topMargin + (int)(d.LIZIZ * n4);
                        n6 = (measuredWidth + n5) / n4;
                    }
                    else {
                        n7 = (float)measuredWidth;
                        n5 = n3 - (int)(d.LIZIZ * n7);
                        n6 = (n3 - n5) / n7;
                    }
                    if (n6 != d.LIZIZ) {
                        n8 = 1;
                    }
                    else {
                        n8 = 0;
                    }
                    topMargin = (d.LIZ & 0x70);
                    if (topMargin != 16) {
                        if (topMargin != 80) {
                            child.layout(n5, d.topMargin, measuredWidth + n5, d.topMargin + measuredHeight);
                        }
                        else {
                            topMargin = n2 - n;
                            child.layout(n5, topMargin - d.bottomMargin - child.getMeasuredHeight(), measuredWidth + n5, topMargin - d.bottomMargin);
                        }
                    }
                    else {
                        n9 = n2 - n;
                        n10 = (n9 - measuredHeight) / 2;
                        if (n10 < d.topMargin) {
                            topMargin = d.topMargin;
                        }
                        else {
                            topMargin = n10;
                            if (n10 + measuredHeight > n9 - d.bottomMargin) {
                                topMargin = n9 - d.bottomMargin - measuredHeight;
                            }
                        }
                        child.layout(n5, topMargin, measuredWidth + n5, measuredHeight + topMargin);
                    }
                    if (n8 != 0) {
                        this.LIZ(child, n6);
                    }
                    if (d.LIZIZ > 0.0f) {
                        topMargin = 0;
                    }
                    else {
                        topMargin = 4;
                    }
                    if (child.getVisibility() != topMargin) {
                        child.setVisibility(topMargin);
                    }
                }
            }
        }
        this.LJIJJLI = false;
        this.LJIL = false;
    }
    
    public void onMeasure(final int n, final int n2) {
        final int mode = View$MeasureSpec.getMode(n);
        final int mode2 = View$MeasureSpec.getMode(n2);
        final int size = View$MeasureSpec.getSize(n);
        final int size2 = View$MeasureSpec.getSize(n2);
        int n3 = 0;
        int n4 = 0;
        Label_0115: {
            if (mode == 1073741824) {
                n3 = size2;
                n4 = size;
                if (mode2 == 1073741824) {
                    break Label_0115;
                }
            }
            if (!this.isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            int n5 = size;
            if (mode != Integer.MIN_VALUE) {
                n5 = size;
                if (mode == 0) {
                    n5 = 300;
                }
            }
            n3 = size2;
            n4 = n5;
            if (mode2 != Integer.MIN_VALUE) {
                n3 = size2;
                n4 = n5;
                if (mode2 == 0) {
                    n3 = 300;
                    n4 = n5;
                }
            }
        }
        this.setMeasuredDimension(n4, n3);
        int n6;
        if (this.LJI != null && ((View)this).getFitsSystemWindows()) {
            n6 = 1;
        }
        else {
            n6 = 0;
        }
        final int layoutDirection = ((View)this).getLayoutDirection();
        final int childCount = this.getChildCount();
        int i = 0;
        int n7 = 0;
        int n8 = 0;
        while (i < childCount) {
            final View child = this.getChildAt(i);
            int n9 = n8;
            int n10 = n7;
            Label_0333: {
                if (child.getVisibility() != 8) {
                    final d d = (d)child.getLayoutParams();
                    if (n6 != 0) {
                        final int absoluteGravity = Gravity.getAbsoluteGravity(d.LIZ, layoutDirection);
                        if (child.getFitsSystemWindows()) {
                            final WindowInsets windowInsets = (WindowInsets)this.LJI;
                            WindowInsets windowInsets2;
                            if (absoluteGravity == 3) {
                                windowInsets2 = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
                            }
                            else {
                                windowInsets2 = windowInsets;
                                if (absoluteGravity == 5) {
                                    windowInsets2 = windowInsets.replaceSystemWindowInsets(0, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                                }
                            }
                            child.dispatchApplyWindowInsets(windowInsets2);
                        }
                        else {
                            final WindowInsets windowInsets3 = (WindowInsets)this.LJI;
                            WindowInsets windowInsets4;
                            if (absoluteGravity == 3) {
                                windowInsets4 = windowInsets3.replaceSystemWindowInsets(windowInsets3.getSystemWindowInsetLeft(), windowInsets3.getSystemWindowInsetTop(), 0, windowInsets3.getSystemWindowInsetBottom());
                            }
                            else {
                                windowInsets4 = windowInsets3;
                                if (absoluteGravity == 5) {
                                    windowInsets4 = windowInsets3.replaceSystemWindowInsets(0, windowInsets3.getSystemWindowInsetTop(), windowInsets3.getSystemWindowInsetRight(), windowInsets3.getSystemWindowInsetBottom());
                                }
                            }
                            d.leftMargin = windowInsets4.getSystemWindowInsetLeft();
                            d.topMargin = windowInsets4.getSystemWindowInsetTop();
                            d.rightMargin = windowInsets4.getSystemWindowInsetRight();
                            d.bottomMargin = windowInsets4.getSystemWindowInsetBottom();
                        }
                    }
                    if (this.LJFF(child)) {
                        child.measure(View$MeasureSpec.makeMeasureSpec(n4 - d.leftMargin - d.rightMargin, 1073741824), View$MeasureSpec.makeMeasureSpec(n3 - d.topMargin - d.bottomMargin, 1073741824));
                        n10 = n7;
                        n9 = n8;
                    }
                    else {
                        if (this.LIZLLL(child)) {
                            if (092.LJIIIZ) {
                                final float elevation = child.getElevation();
                                final float ljiijji = this.LJIIJJI;
                                if (elevation != ljiijji) {
                                    child.setElevation(ljiijji);
                                }
                            }
                            final int n11 = this.LIZJ(child) & 0x7;
                            Label_0639: {
                                if (n11 == 3) {
                                    if (n7 != 0) {
                                        break Label_0639;
                                    }
                                    n7 = 1;
                                }
                                else {
                                    if (n8 != 0) {
                                        break Label_0639;
                                    }
                                    n8 = 1;
                                }
                                child.measure(getChildMeasureSpec(n, this.LJIIL + d.leftMargin + d.rightMargin, d.width), getChildMeasureSpec(n2, d.topMargin + d.bottomMargin, d.height));
                                n9 = n8;
                                n10 = n7;
                                break Label_0333;
                            }
                            final StringBuilder sb = new StringBuilder("Child drawer has absolute gravity ");
                            sb.append(LIZLLL(n11));
                            sb.append(" but this DrawerLayout already has a drawer view along that edge");
                            throw new IllegalStateException(sb.toString());
                        }
                        final StringBuilder sb2 = new StringBuilder("Child ");
                        sb2.append(child);
                        sb2.append(" at index ");
                        sb2.append(i);
                        sb2.append(" does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                        throw new IllegalStateException(sb2.toString());
                    }
                }
            }
            ++i;
            n8 = n9;
            n7 = n10;
        }
    }
    
    public void onRestoreInstanceState(final Parcelable parcelable) {
        if (!(parcelable instanceof 092.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final 092.SavedState savedState = (092.SavedState)parcelable;
        super.onRestoreInstanceState(((AbsSavedState)savedState).LIZLLL);
        if (savedState.LIZ != 0) {
            final View liziz = this.LIZIZ(savedState.LIZ);
            if (liziz != null) {
                this.LIZJ(liziz, true);
            }
        }
        if (savedState.LIZIZ != 3) {
            this.LIZ(savedState.LIZIZ, 3);
        }
        if (savedState.LJ != 3) {
            this.LIZ(savedState.LJ, 5);
        }
        if (savedState.LJFF != 3) {
            this.LIZ(savedState.LJFF, 8388611);
        }
        if (savedState.LJI != 3) {
            this.LIZ(savedState.LJI, 8388613);
        }
    }
    
    public void onRtlPropertiesChanged(int n) {
        if (!092.LJIIIZ) {
            n = ((View)this).getLayoutDirection();
            while (true) {
                Label_0133: {
                    Drawable ljjiizi;
                    if (n == 0) {
                        final Drawable ljjijiiji = this.LJJIJIIJI;
                        if (ljjijiiji == null) {
                            break Label_0133;
                        }
                        this.LIZ(ljjijiiji, n);
                        ljjiizi = this.LJJIJIIJI;
                    }
                    else {
                        final Drawable ljjijiijil = this.LJJIJIIJIL;
                        if (ljjijiijil == null) {
                            break Label_0133;
                        }
                        this.LIZ(ljjijiijil, n);
                        ljjiizi = this.LJJIJIIJIL;
                    }
                    this.LJJIIZI = ljjiizi;
                    n = ((View)this).getLayoutDirection();
                    while (true) {
                        Label_0101: {
                            Drawable ljjij;
                            if (n == 0) {
                                final Drawable ljjijiijil2 = this.LJJIJIIJIL;
                                if (ljjijiijil2 == null) {
                                    break Label_0101;
                                }
                                this.LIZ(ljjijiijil2, n);
                                ljjij = this.LJJIJIIJIL;
                            }
                            else {
                                final Drawable ljjijiiji2 = this.LJJIJIIJI;
                                if (ljjijiiji2 == null) {
                                    break Label_0101;
                                }
                                this.LIZ(ljjijiiji2, n);
                                ljjij = this.LJJIJIIJI;
                            }
                            this.LJJIJ = ljjij;
                            return;
                        }
                        Drawable ljjij = this.LJJIJL;
                        continue;
                    }
                }
                Drawable ljjiizi = this.LJJIJIL;
                continue;
            }
        }
    }
    
    public Parcelable onSaveInstanceState() {
        final 092.SavedState savedState = new 092.SavedState(super.onSaveInstanceState());
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final d d = (d)this.getChildAt(i).getLayoutParams();
            final int lizlll = d.LIZLLL;
            boolean b = true;
            boolean b2;
            if (lizlll == 1) {
                b2 = true;
            }
            else {
                b2 = false;
            }
            if (d.LIZLLL != 2) {
                b = false;
            }
            if (b2 || b) {
                savedState.LIZ = d.LIZ;
                break;
            }
        }
        savedState.LIZIZ = this.LJJ;
        savedState.LJ = this.LJJI;
        savedState.LJFF = this.LJJIFFI;
        savedState.LJI = this.LJJII;
        return (Parcelable)savedState;
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        this.LJIILLIIL.LIZIZ(motionEvent);
        this.LJIIZILJ.LIZIZ(motionEvent);
        final int n = motionEvent.getAction() & 0xFF;
        boolean b = false;
        if (n != 0) {
            if (n != 1) {
                if (n == 3) {
                    this.LIZJ(true);
                    this.LIZJ = false;
                }
            }
            else {
                final float x = motionEvent.getX();
                final float y = motionEvent.getY();
                final View liziz = this.LJIILLIIL.LIZIZ((int)x, (int)y);
                Label_0159: {
                    if (liziz != null && this.LJFF(liziz)) {
                        final float n2 = x - this.LJJIIJ;
                        final float n3 = y - this.LJJIIJZLJL;
                        final int liziz2 = this.LJIILLIIL.LIZIZ;
                        if (n2 * n2 + n3 * n3 < liziz2 * liziz2) {
                            final View lizj = this.LIZJ();
                            if (lizj != null && this.LIZ(lizj) != 2) {
                                break Label_0159;
                            }
                        }
                    }
                    b = true;
                }
                this.LIZJ(b);
            }
        }
        else {
            final float x2 = motionEvent.getX();
            final float y2 = motionEvent.getY();
            this.LJJIIJ = x2;
            this.LJJIIJZLJL = y2;
            this.LIZJ = false;
        }
        return true;
    }
    
    public void requestDisallowInterceptTouchEvent(final boolean b) {
        super.requestDisallowInterceptTouchEvent(b);
        if (b) {
            this.LIZJ(true);
        }
    }
    
    public void requestLayout() {
        if (!this.LJIJJLI) {
            super.requestLayout();
        }
    }
    
    public void setDrawerElevation(final float ljiijji) {
        this.LJIIJJI = ljiijji;
        for (int i = 0; i < this.getChildCount(); ++i) {
            final View child = this.getChildAt(i);
            if (this.LIZLLL(child)) {
                child.setElevation(this.LJIIJJI);
            }
        }
    }
    
    public void setDrawerListener(final c ljjiii) {
        final c ljjiii2 = this.LJJIII;
        if (ljjiii2 != null) {
            final List<c> lizlll = this.LIZLLL;
            if (lizlll != null) {
                lizlll.remove(ljjiii2);
            }
        }
        if (ljjiii != null) {
            this.LIZ(ljjiii);
        }
        this.LJJIII = ljjiii;
    }
    
    public void setDrawerLockMode(final int n) {
        this.LIZ(n, 3);
        this.LIZ(n, 5);
    }
    
    public void setScrimColor(final int ljiiliil) {
        this.LJIILIIL = ljiiliil;
        this.invalidate();
    }
    
    public void setStatusBarBackground(final int n) {
        Drawable drawable;
        if (n != 0) {
            drawable = this.getContext().getDrawable(n);
        }
        else {
            drawable = null;
        }
        this.LJJIIZ = drawable;
        this.invalidate();
    }
    
    public void setStatusBarBackground(final Drawable ljjiiz) {
        this.LJJIIZ = ljjiiz;
        this.invalidate();
    }
    
    public void setStatusBarBackgroundColor(final int n) {
        this.LJJIIZ = (Drawable)new ColorDrawable(n);
        this.invalidate();
    }
    
    public interface c
    {
        default static {
            Covode.recordClassIndex(948);
        }
        
        void LIZ(final int p0);
        
        void LIZ(final View p0);
        
        void LIZ(final View p0, final float p1);
        
        void LIZIZ(final View p0);
    }
    
    public static class d extends ViewGroup$MarginLayoutParams
    {
        public int LIZ;
        public float LIZIZ;
        public boolean LIZJ;
        public int LIZLLL;
        
        static {
            Covode.recordClassIndex(949);
        }
        
        public d() {
            super(-1, -1);
        }
        
        public d(final d d) {
            super((ViewGroup$MarginLayoutParams)d);
            this.LIZ = d.LIZ;
        }
        
        public d(final Context context, final AttributeSet set) {
            super(context, set);
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, 092.LIZ);
            this.LIZ = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }
        
        public d(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
            super(viewGroup$LayoutParams);
        }
        
        public d(final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams) {
            super(viewGroup$MarginLayoutParams);
        }
    }
    
    public final class a extends 07k
    {
        public final Rect LIZJ;
        
        static {
            Covode.recordClassIndex(946);
        }
        
        public a() {
            this.LIZJ = new Rect();
        }
        
        @Override
        public final void LIZ(View child, final 07e 07e) {
            if (092.LIZIZ) {
                super.LIZ(child, 07e);
            }
            else {
                final 07e liz = 07e.LIZ(07e);
                super.LIZ(child, liz);
                07e.LIZ(child);
                final ViewParent parentForAccessibility = child.getParentForAccessibility();
                if (parentForAccessibility instanceof View) {
                    07e.LIZJ((View)parentForAccessibility);
                }
                final Rect lizj = this.LIZJ;
                liz.LIZ(lizj);
                07e.LIZIZ(lizj);
                liz.LIZJ(lizj);
                07e.LIZLLL(lizj);
                07e.LIZLLL(liz.LIZ.isVisibleToUser());
                07e.LIZ(liz.LIZ.getPackageName());
                07e.LIZIZ(liz.LIZ.getClassName());
                07e.LJ(liz.LIZ.getContentDescription());
                07e.LJIIIIZZ(liz.LIZ.isEnabled());
                07e.LJI(liz.LIZ.isClickable());
                07e.LIZIZ(liz.LIZ.isFocusable());
                07e.LIZJ(liz.LIZ.isFocused());
                07e.LJ(liz.LIZ.isAccessibilityFocused());
                07e.LJFF(liz.LIZ.isSelected());
                07e.LJII(liz.LIZ.isLongClickable());
                07e.LIZ(liz.LIZ.getActions());
                liz.LIZ.recycle();
                final ViewGroup viewGroup = (ViewGroup)child;
                for (int childCount = viewGroup.getChildCount(), i = 0; i < childCount; ++i) {
                    child = viewGroup.getChildAt(i);
                    if (092.LJ(child)) {
                        07e.LIZIZ(child);
                    }
                }
            }
            07e.LIZIZ(092.class.getName());
            07e.LIZIZ(false);
            07e.LIZJ(false);
            07e.LIZIZ(X.07e.a.LIZ);
            07e.LIZIZ(X.07e.a.LIZIZ);
        }
        
        @Override
        public final boolean LIZ(final ViewGroup viewGroup, final View view, final AccessibilityEvent accessibilityEvent) {
            return (092.LIZIZ || 092.LJ(view)) && super.LIZ(viewGroup, view, accessibilityEvent);
        }
        
        @Override
        public final boolean LIZIZ(View liziz, final AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() == 32) {
                final List text = accessibilityEvent.getText();
                liziz = 092.this.LIZIZ();
                if (liziz != null) {
                    final int lizj = 092.this.LIZJ(liziz);
                    final 092 liziz2 = 092.this;
                    final int absoluteGravity = Gravity.getAbsoluteGravity(lizj, ((View)liziz2).getLayoutDirection());
                    CharSequence charSequence;
                    if (absoluteGravity == 3) {
                        charSequence = liziz2.LJ;
                    }
                    else {
                        if (absoluteGravity != 5) {
                            return true;
                        }
                        charSequence = liziz2.LJFF;
                    }
                    if (charSequence != null) {
                        text.add(charSequence);
                    }
                }
                return true;
            }
            return super.LIZIZ(liziz, accessibilityEvent);
        }
        
        @Override
        public final void LIZLLL(final View view, final AccessibilityEvent accessibilityEvent) {
            super.LIZLLL(view, accessibilityEvent);
            accessibilityEvent.setClassName((CharSequence)092.class.getName());
        }
    }
    
    public static final class b extends 07k
    {
        static {
            Covode.recordClassIndex(947);
        }
        
        @Override
        public final void LIZ(final View view, final 07e 07e) {
            super.LIZ(view, 07e);
            if (!092.LJ(view)) {
                07e.LIZJ((View)null);
            }
        }
    }
    
    public final class e extends 08u.a
    {
        public final int LIZ;
        public 08u LIZIZ;
        public final Runnable LIZLLL;
        
        static {
            Covode.recordClassIndex(950);
        }
        
        public e(final int liz) {
            this.LIZLLL = new 091(this);
            this.LIZ = liz;
        }
        
        @Override
        public final int LIZ(final View view) {
            if (092.this.LIZLLL(view)) {
                return view.getWidth();
            }
            return 0;
        }
        
        @Override
        public final int LIZ(final View view, final int n, final int n2) {
            return view.getTop();
        }
        
        @Override
        public final void LIZ() {
            092.this.postDelayed(this.LIZLLL, 160L);
        }
        
        @Override
        public final void LIZ(final int n) {
            092.this.LIZ(n, this.LIZIZ.LJII);
        }
        
        @Override
        public final void LIZ(final int n, final int n2) {
            View view;
            if ((n & 0x1) == 0x1) {
                view = 092.this.LIZIZ(3);
            }
            else {
                view = 092.this.LIZIZ(5);
            }
            if (view != null && 092.this.LIZ(view) == 0) {
                this.LIZIZ.LIZ(view, n2);
            }
        }
        
        @Override
        public final void LIZ(final View view, final float n, float liziz) {
            liziz = 092.this.LIZIZ(view);
            final int width = view.getWidth();
            int n3 = 0;
            Label_0052: {
                if (092.this.LIZ(view, 3)) {
                    final float n2 = fcmpl(n, 0.0f);
                    if (n2 > 0 || (n2 == 0 && liziz > 0.5f)) {
                        n3 = 0;
                    }
                    else {
                        n3 = -width;
                    }
                }
                else {
                    final int width2 = 092.this.getWidth();
                    if (n >= 0.0f) {
                        n3 = width2;
                        if (n != 0.0f) {
                            break Label_0052;
                        }
                        n3 = width2;
                        if (liziz <= 0.5f) {
                            break Label_0052;
                        }
                    }
                    n3 = width2 - width;
                }
            }
            this.LIZIZ.LIZ(n3, view.getTop());
            092.this.invalidate();
        }
        
        @Override
        public final void LIZ(final View view, final int n) {
            ((d)view.getLayoutParams()).LIZJ = false;
            this.LIZLLL();
        }
        
        @Override
        public final void LIZ(final View view, int visibility, int width, final int n, final int n2) {
            width = view.getWidth();
            float n3;
            if (092.this.LIZ(view, 3)) {
                n3 = (float)(visibility + width);
            }
            else {
                n3 = (float)(092.this.getWidth() - visibility);
            }
            final float n4 = n3 / width;
            092.this.LIZ(view, n4);
            if (n4 == 0.0f) {
                visibility = 4;
            }
            else {
                visibility = 0;
            }
            view.setVisibility(visibility);
            092.this.invalidate();
        }
        
        @Override
        public final boolean LIZIZ(final View view, final int n) {
            return 092.this.LIZLLL(view) && 092.this.LIZ(view, this.LIZ) && 092.this.LIZ(view) == 0;
        }
        
        @Override
        public final int LIZJ(final View view, final int n) {
            if (092.this.LIZ(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(n, 0));
            }
            final int width = 092.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(n, width));
        }
        
        public final void LIZJ() {
            092.this.removeCallbacks(this.LIZLLL);
        }
        
        public final void LIZLLL() {
            final int liz = this.LIZ;
            int n = 3;
            if (liz == 3) {
                n = 5;
            }
            final View liziz = 092.this.LIZIZ(n);
            if (liziz != null) {
                092.this.LIZ(liziz, true);
            }
        }
    }
}
