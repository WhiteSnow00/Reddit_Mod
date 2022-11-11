// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.ViewGroup$MarginLayoutParams;
import android.view.Window$Callback;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.view.ViewGroup$LayoutParams;
import android.view.Menu;
import android.content.res.TypedArray;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import android.widget.OverScroller;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ContentFrameLayout;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.view.ViewGroup;

public class 1nF extends ViewGroup implements 04Y, 083, 14d, 1fn
{
    public static final int[] LJI;
    public 02x LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public ViewPropertyAnimator LJ;
    public final AnimatorListenerAdapter LJFF;
    public int LJII;
    public int LJIIIIZZ;
    public ContentFrameLayout LJIIIZ;
    public 04Z LJIIJ;
    public Drawable LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public int LJIILJJIL;
    public int LJIILL;
    public final Rect LJIILLIIL;
    public final Rect LJIIZILJ;
    public final Rect LJIJ;
    public final Rect LJIJI;
    public final Rect LJIJJ;
    public final Rect LJIJJLI;
    public final Rect LJIL;
    public a LJJ;
    public OverScroller LJJI;
    public final Runnable LJJIFFI;
    public final Runnable LJJII;
    public final 084 LJJIII;
    
    static {
        Covode.recordClassIndex(377);
        LJI = new int[] { 2130968986, 16842841 };
    }
    
    public 1nF(final Context context, final AttributeSet set) {
        super(context, set);
        this.LJIILLIIL = new Rect();
        this.LJIIZILJ = new Rect();
        this.LJIJ = new Rect();
        this.LJIJI = new Rect();
        this.LJIJJ = new Rect();
        this.LJIJJLI = new Rect();
        this.LJIL = new Rect();
        this.LJFF = (AnimatorListenerAdapter)new ActionBarOverlayLayout.ActionBarOverlayLayout$1(this);
        this.LJJIFFI = (Runnable)new ActionBarOverlayLayout.ActionBarOverlayLayout$2(this);
        this.LJJII = (Runnable)new ActionBarOverlayLayout.ActionBarOverlayLayout$3(this);
        this.LIZ(context);
        this.LJJIII = new 084();
    }
    
    private 04Z LIZ(final View view) {
        if (view instanceof 04Z) {
            return (04Z)view;
        }
        if (view instanceof 03X) {
            return ((03X)view).getWrapper();
        }
        final StringBuilder sb = new StringBuilder("Can't make a decor toolbar out of ");
        sb.append(view.getClass().getSimpleName());
        throw new IllegalStateException(sb.toString());
    }
    
    private void LIZ(final Context context) {
        final TypedArray obtainStyledAttributes = this.getContext().getTheme().obtainStyledAttributes(1nF.LJI);
        final boolean b = false;
        this.LJII = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        final Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.LJIIJJI = drawable;
        this.setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        boolean ljiil = b;
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            ljiil = true;
        }
        this.LJIIL = ljiil;
        this.LJJI = new OverScroller(context);
    }
    
    private boolean LIZ(final View view, final Rect rect, final boolean b) {
        final b b2 = (b)view.getLayoutParams();
        final int leftMargin = b2.leftMargin;
        final int left = rect.left;
        final boolean b3 = true;
        boolean b4;
        if (leftMargin != left) {
            b2.leftMargin = rect.left;
            b4 = true;
        }
        else {
            b4 = false;
        }
        if (b2.topMargin != rect.top) {
            b2.topMargin = rect.top;
            b4 = true;
        }
        if (b2.rightMargin != rect.right) {
            b2.rightMargin = rect.right;
            b4 = true;
        }
        if (b && b2.bottomMargin != rect.bottom) {
            b2.bottomMargin = rect.bottom;
            b4 = b3;
        }
        return b4;
    }
    
    private void LJIIIIZZ() {
        if (this.LJIIIZ == null) {
            this.LJIIIZ = (ContentFrameLayout)this.findViewById(2131361903);
            this.LIZ = (02x)this.findViewById(2131361905);
            this.LJIIJ = this.LIZ(this.findViewById(2131361902));
        }
    }
    
    public final void LIZ() {
        this.removeCallbacks(this.LJJIFFI);
        this.removeCallbacks(this.LJJII);
        final ViewPropertyAnimator lj = this.LJ;
        if (lj != null) {
            lj.cancel();
        }
    }
    
    public final void LIZ(final int n) {
        this.LJIIIIZZ();
        if (n == 109) {
            this.setOverlayMode(true);
        }
    }
    
    public final void LIZ(final Menu menu, final 02r.a a) {
        this.LJIIIIZZ();
        this.LJIIJ.LIZ(menu, a);
    }
    
    public final void LIZ(final View view, final int n) {
        if (n == 0) {
            this.onStopNestedScroll(view);
        }
    }
    
    public final void LIZ(final View view, final int n, final int n2, final int n3, final int n4, final int n5) {
        if (n5 == 0) {
            this.onNestedScroll(view, n, n2, n3, n4);
        }
    }
    
    public final void LIZ(final View view, final int n, final int n2, final int n3, final int n4, final int n5, final int[] array) {
        this.LIZ(view, n, n2, n3, n4, n5);
    }
    
    public final void LIZ(final View view, final int n, final int n2, final int[] array, final int n3) {
        if (n3 == 0) {
            this.onNestedPreScroll(view, n, n2, array);
        }
    }
    
    public final boolean LIZ(final View view, final View view2, final int n, final int n2) {
        return n2 == 0 && this.onStartNestedScroll(view, view2, n);
    }
    
    public final void LIZIZ(final View view, final View view2, final int n, final int n2) {
        if (n2 == 0) {
            this.onNestedScrollAccepted(view, view2, n);
        }
    }
    
    public final boolean LIZIZ() {
        this.LJIIIIZZ();
        return this.LJIIJ.LJFF();
    }
    
    public final boolean LIZJ() {
        this.LJIIIIZZ();
        return this.LJIIJ.LJI();
    }
    
    public final boolean LIZLLL() {
        this.LJIIIIZZ();
        return this.LJIIJ.LJII();
    }
    
    public final boolean LJ() {
        this.LJIIIIZZ();
        return this.LJIIJ.LJIIIIZZ();
    }
    
    public final boolean LJFF() {
        this.LJIIIIZZ();
        return this.LJIIJ.LJIIIZ();
    }
    
    public final void LJI() {
        this.LJIIIIZZ();
        this.LJIIJ.LJIIJ();
    }
    
    public final void LJII() {
        this.LJIIIIZZ();
        this.LJIIJ.LJIIJJI();
    }
    
    public boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof b;
    }
    
    public void draw(final Canvas canvas) {
        super.draw(canvas);
        if (this.LJIIJJI != null && !this.LJIIL) {
            int n;
            if (this.LIZ.getVisibility() == 0) {
                n = (int)(this.LIZ.getBottom() + this.LIZ.getTranslationY() + 0.5f);
            }
            else {
                n = 0;
            }
            this.LJIIJJI.setBounds(0, n, this.getWidth(), this.LJIIJJI.getIntrinsicHeight() + n);
            this.LJIIJJI.draw(canvas);
        }
    }
    
    public boolean fitSystemWindows(final Rect rect) {
        this.LJIIIIZZ();
        ((View)this).getWindowSystemUiVisibility();
        boolean liz = this.LIZ((View)this.LIZ, rect, false);
        this.LJIJI.set(rect);
        04A.LIZ((View)this, this.LJIJI, this.LJIILLIIL);
        if (!this.LJIJJ.equals((Object)this.LJIJI)) {
            this.LJIJJ.set(this.LJIJI);
            liz = true;
        }
        if (!this.LJIIZILJ.equals((Object)this.LJIILLIIL)) {
            this.LJIIZILJ.set(this.LJIILLIIL);
        }
        else if (!liz) {
            return true;
        }
        this.requestLayout();
        return true;
    }
    
    public ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return (ViewGroup$LayoutParams)new b(viewGroup$LayoutParams);
    }
    
    public int getActionBarHideOffset() {
        final 02x liz = this.LIZ;
        if (liz != null) {
            return -(int)liz.getTranslationY();
        }
        return 0;
    }
    
    public int getNestedScrollAxes() {
        return this.LJJIII.LIZ();
    }
    
    public CharSequence getTitle() {
        this.LJIIIIZZ();
        return this.LJIIJ.LJ();
    }
    
    public void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.LIZ(this.getContext());
        ((View)this).requestApplyInsets();
    }
    
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LIZ();
    }
    
    public void onLayout(final boolean b, int i, int paddingLeft, int childCount, int paddingTop) {
        childCount = this.getChildCount();
        paddingLeft = this.getPaddingLeft();
        this.getPaddingRight();
        paddingTop = this.getPaddingTop();
        this.getPaddingBottom();
        View child;
        b b2;
        int measuredWidth;
        int measuredHeight;
        int n;
        int n2;
        for (i = 0; i < childCount; ++i) {
            child = this.getChildAt(i);
            if (child.getVisibility() != 8) {
                b2 = (b)child.getLayoutParams();
                measuredWidth = child.getMeasuredWidth();
                measuredHeight = child.getMeasuredHeight();
                n = b2.leftMargin + paddingLeft;
                n2 = b2.topMargin + paddingTop;
                child.layout(n, n2, measuredWidth + n, measuredHeight + n2);
            }
        }
    }
    
    public void onMeasure(final int n, final int n2) {
        this.LJIIIIZZ();
        this.measureChildWithMargins((View)this.LIZ, n, 0, n2, 0);
        final b b = (b)this.LIZ.getLayoutParams();
        final int max = Math.max(0, this.LIZ.getMeasuredWidth() + b.leftMargin + b.rightMargin);
        final int max2 = Math.max(0, this.LIZ.getMeasuredHeight() + b.topMargin + b.bottomMargin);
        final int combineMeasuredStates = View.combineMeasuredStates(0, this.LIZ.getMeasuredState());
        int n5;
        int n6;
        if ((((View)this).getWindowSystemUiVisibility() & 0x100) != 0x0) {
            final int n3 = 1;
            final int n4 = n5 = this.LJII;
            n6 = n3;
            if (this.LJIILIIL) {
                n5 = n4;
                n6 = n3;
                if (this.LIZ.getTabContainer() != null) {
                    n5 = n4 + this.LJII;
                    n6 = n3;
                }
            }
        }
        else {
            n6 = 0;
            if (this.LIZ.getVisibility() != 8) {
                n5 = this.LIZ.getMeasuredHeight();
            }
            else {
                n5 = 0;
            }
        }
        this.LJIJ.set(this.LJIILLIIL);
        this.LJIJJLI.set(this.LJIJI);
        if (!this.LIZIZ && n6 == 0) {
            final Rect ljij = this.LJIJ;
            ljij.top += n5;
            final Rect ljij2 = this.LJIJ;
            ljij2.bottom += 0;
        }
        else {
            final Rect ljijjli = this.LJIJJLI;
            ljijjli.top += n5;
            final Rect ljijjli2 = this.LJIJJLI;
            ljijjli2.bottom += 0;
        }
        this.LIZ((View)this.LJIIIZ, this.LJIJ, true);
        if (!this.LJIL.equals((Object)this.LJIJJLI)) {
            this.LJIL.set(this.LJIJJLI);
            this.LJIIIZ.LIZ(this.LJIJJLI);
        }
        this.measureChildWithMargins((View)this.LJIIIZ, n, 0, n2, 0);
        final b b2 = (b)this.LJIIIZ.getLayoutParams();
        final int max3 = Math.max(max, this.LJIIIZ.getMeasuredWidth() + b2.leftMargin + b2.rightMargin);
        final int max4 = Math.max(max2, this.LJIIIZ.getMeasuredHeight() + b2.topMargin + b2.bottomMargin);
        final int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.LJIIIZ.getMeasuredState());
        this.setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + (this.getPaddingLeft() + this.getPaddingRight()), this.getSuggestedMinimumWidth()), n, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + (this.getPaddingTop() + this.getPaddingBottom()), this.getSuggestedMinimumHeight()), n2, combineMeasuredStates2 << 16));
    }
    
    public boolean onNestedFling(final View view, final float n, final float n2, final boolean b) {
        if (!this.LIZJ || !b) {
            return false;
        }
        this.LJJI.fling(0, 0, 0, (int)n2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.LJJI.getFinalY() > this.LIZ.getHeight()) {
            this.LIZ();
            this.LJJII.run();
        }
        else {
            this.LIZ();
            this.LJJIFFI.run();
        }
        return this.LIZLLL = true;
    }
    
    public boolean onNestedPreFling(final View view, final float n, final float n2) {
        return false;
    }
    
    public void onNestedPreScroll(final View view, final int n, final int n2, final int[] array) {
    }
    
    public void onNestedScroll(final View view, int ljiiljjil, final int n, final int n2, final int n3) {
        ljiiljjil = this.LJIILJJIL + n;
        this.setActionBarHideOffset(this.LJIILJJIL = ljiiljjil);
    }
    
    public void onNestedScrollAccepted(final View view, final View view2, final int n) {
        this.LJJIII.LIZ(n, 0);
        this.LJIILJJIL = this.getActionBarHideOffset();
        this.LIZ();
        final a ljj = this.LJJ;
        if (ljj != null) {
            ljj.LJIIL();
        }
    }
    
    public boolean onStartNestedScroll(final View view, final View view2, final int n) {
        return (n & 0x2) != 0x0 && this.LIZ.getVisibility() == 0 && this.LIZJ;
    }
    
    public void onStopNestedScroll(final View view) {
        if (this.LIZJ && !this.LIZLLL) {
            if (this.LJIILJJIL <= this.LIZ.getHeight()) {
                this.LIZ();
                this.postDelayed(this.LJJIFFI, 600L);
                return;
            }
            this.LIZ();
            this.postDelayed(this.LJJII, 600L);
        }
    }
    
    public void onWindowSystemUiVisibilityChanged(final int ljiill) {
        super.onWindowSystemUiVisibilityChanged(ljiill);
        this.LJIIIIZZ();
        final int ljiill2 = this.LJIILL;
        this.LJIILL = ljiill;
        boolean b = false;
        boolean b2;
        if ((ljiill & 0x4) == 0x0) {
            b2 = true;
        }
        else {
            b2 = false;
        }
        if ((ljiill & 0x100) != 0x0) {
            b = true;
        }
        final a ljj = this.LJJ;
        if (ljj != null) {
            ljj.LJ(b ^ true);
            if (b2 || !b) {
                this.LJJ.LJIIJ();
            }
            else {
                this.LJJ.LJIIJJI();
            }
        }
        if (((ljiill2 ^ ljiill) & 0x100) != 0x0 && this.LJJ != null) {
            ((View)this).requestApplyInsets();
        }
    }
    
    public void onWindowVisibilityChanged(final int ljiiiizz) {
        super.onWindowVisibilityChanged(ljiiiizz);
        this.LJIIIIZZ = ljiiiizz;
        final a ljj = this.LJJ;
        if (ljj != null) {
            ljj.LIZIZ(ljiiiizz);
        }
    }
    
    public void setActionBarHideOffset(int max) {
        this.LIZ();
        max = Math.max(0, Math.min(max, this.LIZ.getHeight()));
        this.LIZ.setTranslationY((float)(-max));
    }
    
    public void setActionBarVisibilityCallback(final a ljj) {
        this.LJJ = ljj;
        if (this.getWindowToken() != null) {
            this.LJJ.LIZIZ(this.LJIIIIZZ);
            final int ljiill = this.LJIILL;
            if (ljiill != 0) {
                this.onWindowSystemUiVisibilityChanged(ljiill);
                ((View)this).requestApplyInsets();
            }
        }
    }
    
    public void setHasNonEmbeddedTabs(final boolean ljiiliil) {
        this.LJIILIIL = ljiiliil;
    }
    
    public void setHideOnContentScrollEnabled(final boolean lizj) {
        if (lizj != this.LIZJ && !(this.LIZJ = lizj)) {
            this.LIZ();
            this.setActionBarHideOffset(0);
        }
    }
    
    public void setIcon(final int n) {
        this.LJIIIIZZ();
        this.LJIIJ.LIZ(n);
    }
    
    public void setIcon(final Drawable drawable) {
        this.LJIIIIZZ();
        this.LJIIJ.LIZ(drawable);
    }
    
    public void setLogo(final int n) {
        this.LJIIIIZZ();
        this.LJIIJ.LIZIZ(n);
    }
    
    public void setOverlayMode(final boolean liziz) {
        this.LIZIZ = liziz;
        this.LJIIL = (liziz && this.getContext().getApplicationInfo().targetSdkVersion < 19);
    }
    
    public void setShowingForActionMode(final boolean b) {
    }
    
    public void setUiOptions(final int n) {
    }
    
    public void setWindowCallback(final Window$Callback window$Callback) {
        this.LJIIIIZZ();
        this.LJIIJ.LIZ(window$Callback);
    }
    
    public void setWindowTitle(final CharSequence charSequence) {
        this.LJIIIIZZ();
        this.LJIIJ.LIZ(charSequence);
    }
    
    public boolean shouldDelayChildPressedState() {
        return false;
    }
    
    public interface a
    {
        default static {
            Covode.recordClassIndex(381);
        }
        
        void LIZIZ(final int p0);
        
        void LJ(final boolean p0);
        
        void LJIIJ();
        
        void LJIIJJI();
        
        void LJIIL();
    }
    
    public static final class b extends ViewGroup$MarginLayoutParams
    {
        static {
            Covode.recordClassIndex(382);
        }
        
        public b() {
            super(-1, -1);
        }
        
        public b(final Context context, final AttributeSet set) {
            super(context, set);
        }
        
        public b(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
            super(viewGroup$LayoutParams);
        }
    }
}
