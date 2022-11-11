// 
// Decompiled by Procyon v0.6.0
// 

package X;

import androidx.core.g.t;
import android.view.View$MeasureSpec;
import android.widget.ListView;
import android.view.MotionEvent;
import android.view.animation.Interpolator;
import android.content.res.TypedArray;
import android.util.DisplayMetrics;
import android.graphics.drawable.Drawable;
import android.view.ViewConfiguration;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.View;
import android.view.ViewGroup;

public class 17f extends ViewGroup implements 081, 083
{
    public static final int[] LJJIIJZLJL;
    public b LIZ;
    public boolean LIZIZ;
    public int LIZJ;
    public boolean LIZLLL;
    public 0GS LJ;
    public int LJFF;
    public float LJI;
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public 0GW LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public View LJIILIIL;
    public int LJIILJJIL;
    public float LJIILL;
    public float LJIILLIIL;
    public final 084 LJIIZILJ;
    public final 082 LJIJ;
    public final int[] LJIJI;
    public final int[] LJIJJ;
    public boolean LJIJJLI;
    public int LJIL;
    public float LJJ;
    public float LJJI;
    public boolean LJJIFFI;
    public int LJJII;
    public boolean LJJIII;
    public final DecelerateInterpolator LJJIIJ;
    public int LJJIIZ;
    public Animation LJJIIZI;
    public Animation LJJIJ;
    public Animation LJJIJIIJI;
    public Animation LJJIJIIJIL;
    public Animation LJJIJIL;
    public int LJJIJL;
    public a LJJIJLIJ;
    public Animation$AnimationListener LJJIL;
    public final Animation LJJIZ;
    public final Animation LJJJ;
    
    static {
        Covode.recordClassIndex(1737);
        LJJIIJZLJL = new int[] { 16842766 };
    }
    
    public 17f(final Context context) {
        this(context, null);
    }
    
    public 17f(final Context context, final AttributeSet set) {
        super(context, set);
        this.LJIILL = -1.0f;
        this.LJIJI = new int[2];
        this.LJIJJ = new int[2];
        this.LJJII = -1;
        this.LJJIIZ = -1;
        this.LJJIL = (Animation$AnimationListener)new SwipeRefreshLayout.SwipeRefreshLayout$1(this);
        this.LJJIZ = (Animation)new SwipeRefreshLayout.SwipeRefreshLayout$6(this);
        this.LJJJ = (Animation)new SwipeRefreshLayout.SwipeRefreshLayout$7(this);
        this.LJIILJJIL = ViewConfiguration.get(context).getScaledTouchSlop();
        this.LJIL = this.getResources().getInteger(17694721);
        this.setWillNotDraw(false);
        this.LJJIIJ = new DecelerateInterpolator(2.0f);
        final DisplayMetrics displayMetrics = this.getResources().getDisplayMetrics();
        this.LJJIJL = (int)(displayMetrics.density * 40.0f);
        this.LJ = new 0GS(this.getContext());
        (this.LJIIJ = new 0GW(this.getContext())).LIZ(1);
        this.LJ.setImageDrawable((Drawable)this.LJIIJ);
        this.LJ.setVisibility(8);
        this.addView((View)this.LJ);
        this.setChildrenDrawingOrderEnabled(true);
        final int ljiiiizz = (int)(displayMetrics.density * 64.0f);
        this.LJIIIIZZ = ljiiiizz;
        this.LJIILL = (float)ljiiiizz;
        this.LJIIZILJ = new 084();
        this.LJIJ = new 082((View)this);
        this.setNestedScrollingEnabled(true);
        final int n = -this.LJJIJL;
        this.LIZJ = n;
        this.LJII = n;
        this.LIZ(1.0f);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, 17f.LJJIIJZLJL);
        this.setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }
    
    private void LIZ(final int ljff, final Animation$AnimationListener liz) {
        this.LJFF = ljff;
        this.LJJIZ.reset();
        this.LJJIZ.setDuration(200L);
        this.LJJIZ.setInterpolator((Interpolator)this.LJJIIJ);
        if (liz != null) {
            this.LJ.LIZ = liz;
        }
        this.LJ.clearAnimation();
        this.LJ.startAnimation(this.LJJIZ);
    }
    
    private void LIZ(final MotionEvent motionEvent) {
        final int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.LJJII) {
            int n;
            if (actionIndex == 0) {
                n = 1;
            }
            else {
                n = 0;
            }
            this.LJJII = motionEvent.getPointerId(n);
        }
    }
    
    private void LIZ(final boolean liziz, final boolean ljiijji) {
        if (this.LIZIZ != liziz) {
            this.LJIIJJI = ljiijji;
            this.LIZLLL();
            this.LIZIZ = liziz;
            if (liziz) {
                this.LIZ(this.LIZJ, this.LJJIL);
                return;
            }
            this.LIZ(this.LJJIL);
        }
    }
    
    private boolean LIZ(final Animation animation) {
        return animation != null && animation.hasStarted() && !animation.hasEnded();
    }
    
    private Animation LIZIZ(final int n, final int n2) {
        final SwipeRefreshLayout.SwipeRefreshLayout$4 swipeRefreshLayout$4 = new SwipeRefreshLayout.SwipeRefreshLayout$4(this, n, n2);
        ((Animation)swipeRefreshLayout$4).setDuration(300L);
        this.LJ.LIZ = null;
        this.LJ.clearAnimation();
        this.LJ.startAnimation((Animation)swipeRefreshLayout$4);
        return (Animation)swipeRefreshLayout$4;
    }
    
    private void LIZIZ() {
        this.LJJIJIIJI = this.LIZIZ(this.LJIIJ.getAlpha(), 76);
    }
    
    private void LIZIZ(final float n) {
        this.LJIIJ.LIZ(true);
        final float min = Math.min(1.0f, Math.abs(n / this.LJIILL));
        final float n2 = Math.max((float)(min - 0.4), 0.0f) * 5.0f / 3.0f;
        final float abs = Math.abs(n);
        final float ljiill = this.LJIILL;
        int n3 = this.LJIIIZ;
        if (n3 <= 0) {
            if (this.LJIIL) {
                n3 = this.LJIIIIZZ - this.LJII;
            }
            else {
                n3 = this.LJIIIIZZ;
            }
        }
        final float n4 = (float)n3;
        final double n5 = Math.max(0.0f, Math.min(abs - ljiill, n4 * 2.0f) / n4) / 4.0f;
        final float n6 = (float)(n5 - Math.pow(n5, 2.0)) * 2.0f;
        final int ljii = this.LJII;
        final int n7 = (int)(n4 * min + n4 * n6 * 2.0f);
        if (this.LJ.getVisibility() != 0) {
            this.LJ.setVisibility(0);
        }
        if (!this.LIZLLL) {
            this.LJ.setScaleX(1.0f);
            this.LJ.setScaleY(1.0f);
        }
        if (this.LIZLLL) {
            this.setAnimationProgress(Math.min(1.0f, n / this.LJIILL));
        }
        if (n < this.LJIILL) {
            if (this.LJIIJ.getAlpha() > 76 && !this.LIZ(this.LJJIJIIJI)) {
                this.LIZIZ();
            }
        }
        else if (this.LJIIJ.getAlpha() < 255 && !this.LIZ(this.LJJIJIIJIL)) {
            this.LIZJ();
        }
        this.LJIIJ.LIZIZ(Math.min(0.8f, n2 * 0.8f));
        this.LJIIJ.LIZ(Math.min(1.0f, n2));
        this.LJIIJ.LIZJ((n2 * 0.4f - 0.25f + n6 * 2.0f) * 0.5f);
        this.setTargetOffsetTopAndBottom(ljii + n7 - this.LIZJ);
    }
    
    private void LIZIZ(final int ljff, final Animation$AnimationListener liz) {
        if (this.LIZLLL) {
            this.LIZJ(ljff, liz);
            return;
        }
        this.LJFF = ljff;
        this.LJJJ.reset();
        this.LJJJ.setDuration(200L);
        this.LJJJ.setInterpolator((Interpolator)this.LJJIIJ);
        if (liz != null) {
            this.LJ.LIZ = liz;
        }
        this.LJ.clearAnimation();
        this.LJ.startAnimation(this.LJJJ);
    }
    
    private void LIZJ() {
        this.LJJIJIIJIL = this.LIZIZ(this.LJIIJ.getAlpha(), 255);
    }
    
    private void LIZJ(final float n) {
        if (n > this.LJIILL) {
            this.LIZ(true, true);
            return;
        }
        this.LIZIZ = false;
        this.LJIIJ.LIZIZ(0.0f);
        Object o = null;
        if (!this.LIZLLL) {
            o = new SwipeRefreshLayout.SwipeRefreshLayout$5(this);
        }
        this.LIZIZ(this.LIZJ, (Animation$AnimationListener)o);
        this.LJIIJ.LIZ(false);
    }
    
    private void LIZJ(final int ljff, final Animation$AnimationListener liz) {
        this.LJFF = ljff;
        this.LJI = this.LJ.getScaleX();
        (this.LJJIJIL = (Animation)new SwipeRefreshLayout.SwipeRefreshLayout$8(this)).setDuration(150L);
        if (liz != null) {
            this.LJ.LIZ = liz;
        }
        this.LJ.clearAnimation();
        this.LJ.startAnimation(this.LJJIJIL);
    }
    
    private void LIZLLL() {
        if (this.LJIILIIL == null) {
            for (int i = 0; i < this.getChildCount(); ++i) {
                final View child = this.getChildAt(i);
                if (!child.equals(this.LJ)) {
                    this.LJIILIIL = child;
                    return;
                }
            }
        }
    }
    
    private void LIZLLL(final float n) {
        final float ljji = this.LJJI;
        final int ljiiljjil = this.LJIILJJIL;
        if (n - ljji > ljiiljjil && !this.LJJIFFI) {
            this.LJJ = ljji + ljiiljjil;
            this.LJJIFFI = true;
            this.LJIIJ.setAlpha(76);
        }
    }
    
    private boolean LJ() {
        final a ljjijlij = this.LJJIJLIJ;
        if (ljjijlij != null) {
            return ljjijlij.LIZ();
        }
        final View ljiiliil = this.LJIILIIL;
        if (ljiiliil instanceof ListView) {
            return ((ListView)ljiiliil).canScrollList(-1);
        }
        return ljiiliil.canScrollVertically(-1);
    }
    
    private void setColorViewAlpha(final int n) {
        this.LJ.getBackground().setAlpha(n);
        this.LJIIJ.setAlpha(n);
    }
    
    public final void LIZ() {
        this.LJ.clearAnimation();
        this.LJIIJ.stop();
        this.LJ.setVisibility(8);
        this.setColorViewAlpha(255);
        if (this.LIZLLL) {
            this.setAnimationProgress(0.0f);
        }
        else {
            this.setTargetOffsetTopAndBottom(this.LJII - this.LIZJ);
        }
        this.LIZJ = this.LJ.getTop();
    }
    
    public final void LIZ(final float n) {
        final int ljff = this.LJFF;
        this.setTargetOffsetTopAndBottom(ljff + (int)((this.LJII - ljff) * n) - this.LJ.getTop());
    }
    
    public final void LIZ(final int ljii, final int ljiiiizz) {
        this.LIZLLL = false;
        this.LJII = ljii;
        this.LJIIIIZZ = ljiiiizz;
        this.LJIIL = true;
        this.LIZ();
        this.LIZIZ = false;
    }
    
    public final void LIZ(final Animation$AnimationListener liz) {
        (this.LJJIJ = (Animation)new SwipeRefreshLayout.SwipeRefreshLayout$3(this)).setDuration(150L);
        this.LJ.LIZ = liz;
        this.LJ.clearAnimation();
        this.LJ.startAnimation(this.LJJIJ);
    }
    
    public boolean dispatchNestedFling(final float n, final float n2, final boolean b) {
        return this.LJIJ.LIZ(n, n2, b);
    }
    
    public boolean dispatchNestedPreFling(final float n, final float n2) {
        return this.LJIJ.LIZ(n, n2);
    }
    
    public boolean dispatchNestedPreScroll(final int n, final int n2, final int[] array, final int[] array2) {
        return this.LJIJ.LIZ(n, n2, array, array2);
    }
    
    public boolean dispatchNestedScroll(final int n, final int n2, final int n3, final int n4, final int[] array) {
        return this.LJIJ.LIZ(n, n2, n3, n4, array);
    }
    
    public int getChildDrawingOrder(int n, final int n2) {
        final int ljjiiz = this.LJJIIZ;
        if (ljjiiz < 0) {
            return n2;
        }
        if (n2 == n - 1) {
            return ljjiiz;
        }
        if ((n = n2) >= ljjiiz) {
            n = n2 + 1;
        }
        return n;
    }
    
    public int getNestedScrollAxes() {
        return this.LJIIZILJ.LIZ();
    }
    
    public int getProgressCircleDiameter() {
        return this.LJJIJL;
    }
    
    public int getProgressViewEndOffset() {
        return this.LJIIIIZZ;
    }
    
    public int getProgressViewStartOffset() {
        return this.LJII;
    }
    
    public boolean hasNestedScrollingParent() {
        return this.LJIJ.LIZ(0);
    }
    
    public boolean isNestedScrollingEnabled() {
        return this.LJIJ.LIZ;
    }
    
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LIZ();
    }
    
    public boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        this.LIZLLL();
        final int actionMasked = motionEvent.getActionMasked();
        if (this.LJJIII && actionMasked == 0) {
            this.LJJIII = false;
        }
        if (!this.isEnabled() || this.LJJIII || this.LJ() || this.LIZIZ || this.LJIJJLI) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 6) {
                            return this.LJJIFFI;
                        }
                        this.LIZ(motionEvent);
                        return this.LJJIFFI;
                    }
                }
                else {
                    final int ljjii = this.LJJII;
                    if (ljjii == -1) {
                        return false;
                    }
                    final int pointerIndex = motionEvent.findPointerIndex(ljjii);
                    if (pointerIndex < 0) {
                        return false;
                    }
                    this.LIZLLL(motionEvent.getY(pointerIndex));
                    return this.LJJIFFI;
                }
            }
            this.LJJIFFI = false;
            this.LJJII = -1;
        }
        else {
            this.setTargetOffsetTopAndBottom(this.LJII - this.LJ.getTop());
            final int pointerId = motionEvent.getPointerId(0);
            this.LJJII = pointerId;
            this.LJJIFFI = false;
            final int pointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (pointerIndex2 < 0) {
                return false;
            }
            this.LJJI = motionEvent.getY(pointerIndex2);
        }
        return this.LJJIFFI;
    }
    
    public void onLayout(final boolean b, int measuredWidth, int n, int n2, int paddingTop) {
        measuredWidth = this.getMeasuredWidth();
        n = this.getMeasuredHeight();
        if (this.getChildCount() == 0) {
            return;
        }
        if (this.LJIILIIL == null) {
            this.LIZLLL();
        }
        final View ljiiliil = this.LJIILIIL;
        if (ljiiliil == null) {
            return;
        }
        n2 = this.getPaddingLeft();
        paddingTop = this.getPaddingTop();
        ljiiliil.layout(n2, paddingTop, measuredWidth - this.getPaddingLeft() - this.getPaddingRight() + n2, n - this.getPaddingTop() - this.getPaddingBottom() + paddingTop);
        n2 = this.LJ.getMeasuredWidth();
        n = this.LJ.getMeasuredHeight();
        final 0GS lj = this.LJ;
        measuredWidth /= 2;
        paddingTop = n2 / 2;
        n2 = this.LIZJ;
        lj.layout(measuredWidth - paddingTop, n2, measuredWidth + paddingTop, n + n2);
    }
    
    public void onMeasure(int i, final int n) {
        super.onMeasure(i, n);
        if (this.LJIILIIL == null) {
            this.LIZLLL();
        }
        final View ljiiliil = this.LJIILIIL;
        if (ljiiliil == null) {
            return;
        }
        ljiiliil.measure(View$MeasureSpec.makeMeasureSpec(this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight(), 1073741824), View$MeasureSpec.makeMeasureSpec(this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom(), 1073741824));
        this.LJ.measure(View$MeasureSpec.makeMeasureSpec(this.LJJIJL, 1073741824), View$MeasureSpec.makeMeasureSpec(this.LJJIJL, 1073741824));
        this.LJJIIZ = -1;
        for (i = 0; i < this.getChildCount(); ++i) {
            if (this.getChildAt(i) == this.LJ) {
                this.LJJIIZ = i;
                return;
            }
        }
    }
    
    public boolean onNestedFling(final View view, final float n, final float n2, final boolean b) {
        return this.dispatchNestedFling(n, n2, b);
    }
    
    public boolean onNestedPreFling(final View view, final float n, final float n2) {
        return this.dispatchNestedPreFling(n, n2);
    }
    
    public void onNestedPreScroll(final View view, final int n, final int n2, final int[] array) {
        if (n2 > 0) {
            final float ljiilliil = this.LJIILLIIL;
            if (ljiilliil > 0.0f) {
                final float n3 = (float)n2;
                if (n3 > ljiilliil) {
                    array[1] = n2 - (int)ljiilliil;
                    this.LJIILLIIL = 0.0f;
                }
                else {
                    this.LJIILLIIL = ljiilliil - n3;
                    array[1] = n2;
                }
                this.LIZIZ(this.LJIILLIIL);
            }
        }
        if (this.LJIIL && n2 > 0 && this.LJIILLIIL == 0.0f && Math.abs(n2 - array[1]) > 0) {
            this.LJ.setVisibility(8);
        }
        final int[] ljiji = this.LJIJI;
        if (this.dispatchNestedPreScroll(n - array[0], n2 - array[1], ljiji, null)) {
            array[0] += ljiji[0];
            array[1] += ljiji[1];
        }
    }
    
    public void onNestedScroll(final View view, int n, final int n2, final int n3, final int n4) {
        this.dispatchNestedScroll(n, n2, n3, n4, this.LJIJJ);
        n = n4 + this.LJIJJ[1];
        if (n < 0 && !this.LJ()) {
            this.LIZIZ(this.LJIILLIIL += Math.abs(n));
        }
    }
    
    public void onNestedScrollAccepted(final View view, final View view2, final int n) {
        this.LJIIZILJ.LIZ(n, 0);
        this.startNestedScroll(n & 0x2);
        this.LJIILLIIL = 0.0f;
        this.LJIJJLI = true;
    }
    
    public boolean onStartNestedScroll(final View view, final View view2, final int n) {
        return this.isEnabled() && !this.LJJIII && !this.LIZIZ && (n & 0x2) != 0x0;
    }
    
    public void onStopNestedScroll(final View view) {
        this.LJIIZILJ.LIZ(0);
        this.LJIJJLI = false;
        final float ljiilliil = this.LJIILLIIL;
        if (ljiilliil > 0.0f) {
            this.LIZJ(ljiilliil);
            this.LJIILLIIL = 0.0f;
        }
        this.stopNestedScroll();
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        final int actionMasked = motionEvent.getActionMasked();
        if (this.LJJIII && actionMasked == 0) {
            this.LJJIII = false;
        }
        if (!this.isEnabled() || this.LJJIII || this.LJ() || this.LIZIZ || this.LJIJJLI) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        return false;
                    }
                    if (actionMasked != 5) {
                        if (actionMasked == 6) {
                            this.LIZ(motionEvent);
                        }
                    }
                    else {
                        final int actionIndex = motionEvent.getActionIndex();
                        if (actionIndex < 0) {
                            return false;
                        }
                        this.LJJII = motionEvent.getPointerId(actionIndex);
                    }
                }
                else {
                    final int pointerIndex = motionEvent.findPointerIndex(this.LJJII);
                    if (pointerIndex < 0) {
                        return false;
                    }
                    final float y = motionEvent.getY(pointerIndex);
                    this.LIZLLL(y);
                    if (this.LJJIFFI) {
                        final float n = (y - this.LJJ) * 0.5f;
                        if (n <= 0.0f) {
                            return false;
                        }
                        this.LIZIZ(n);
                    }
                }
            }
            else {
                final int pointerIndex2 = motionEvent.findPointerIndex(this.LJJII);
                if (pointerIndex2 < 0) {
                    return false;
                }
                if (this.LJJIFFI) {
                    final float y2 = motionEvent.getY(pointerIndex2);
                    final float ljj = this.LJJ;
                    this.LJJIFFI = false;
                    this.LIZJ((y2 - ljj) * 0.5f);
                }
                this.LJJII = -1;
                return false;
            }
        }
        else {
            this.LJJII = motionEvent.getPointerId(0);
            this.LJJIFFI = false;
        }
        return true;
    }
    
    public void requestDisallowInterceptTouchEvent(final boolean b) {
        final View ljiiliil = this.LJIILIIL;
        if (ljiiliil == null || ljiiliil.isNestedScrollingEnabled()) {
            super.requestDisallowInterceptTouchEvent(b);
        }
    }
    
    public void setAnimationProgress(final float n) {
        this.LJ.setScaleX(n);
        this.LJ.setScaleY(n);
    }
    
    public void setColorScheme(final int... colorSchemeResources) {
        this.setColorSchemeResources(colorSchemeResources);
    }
    
    public void setColorSchemeColors(final int... array) {
        this.LIZLLL();
        final 0GW ljiij = this.LJIIJ;
        ljiij.LIZ.LIZ(array);
        ljiij.LIZ.LIZ(0);
        ljiij.invalidateSelf();
    }
    
    public void setColorSchemeResources(final int... array) {
        final Context context = this.getContext();
        final int[] colorSchemeColors = new int[array.length];
        for (int i = 0; i < array.length; ++i) {
            colorSchemeColors[i] = 06x.LIZJ(context, array[i]);
        }
        this.setColorSchemeColors(colorSchemeColors);
    }
    
    public void setDistanceToTriggerSync(final int n) {
        this.LJIILL = (float)n;
    }
    
    public void setEnabled(final boolean enabled) {
        super.setEnabled(enabled);
        if (!enabled) {
            this.LIZ();
        }
    }
    
    public void setNestedScrollingEnabled(final boolean b) {
        this.LJIJ.LIZ(b);
    }
    
    public void setOnChildScrollUpCallback(final a ljjijlij) {
        this.LJJIJLIJ = ljjijlij;
    }
    
    public void setOnRefreshListener(final b liz) {
        this.LIZ = liz;
    }
    
    public void setProgressBackgroundColor(final int progressBackgroundColorSchemeResource) {
        this.setProgressBackgroundColorSchemeResource(progressBackgroundColorSchemeResource);
    }
    
    public void setProgressBackgroundColorSchemeColor(final int backgroundColor) {
        this.LJ.setBackgroundColor(backgroundColor);
    }
    
    public void setProgressBackgroundColorSchemeResource(final int n) {
        this.setProgressBackgroundColorSchemeColor(06x.LIZJ(this.getContext(), n));
    }
    
    public void setRefreshing(final boolean liziz) {
        if (liziz && this.LIZIZ != liziz) {
            this.LIZIZ = liziz;
            int ljiiiizz;
            if (!this.LJIIL) {
                ljiiiizz = this.LJIIIIZZ + this.LJII;
            }
            else {
                ljiiiizz = this.LJIIIIZZ;
            }
            this.setTargetOffsetTopAndBottom(ljiiiizz - this.LIZJ);
            this.LJIIJJI = false;
            final Animation$AnimationListener ljjil = this.LJJIL;
            this.LJ.setVisibility(0);
            this.LJIIJ.setAlpha(255);
            (this.LJJIIZI = (Animation)new SwipeRefreshLayout.SwipeRefreshLayout$2(this)).setDuration((long)this.LJIL);
            if (ljjil != null) {
                this.LJ.LIZ = ljjil;
            }
            this.LJ.clearAnimation();
            this.LJ.startAnimation(this.LJJIIZI);
            return;
        }
        this.LIZ(liziz, false);
    }
    
    public void setSize(final int n) {
        if (n != 0 && n != 1) {
            return;
        }
        final DisplayMetrics displayMetrics = this.getResources().getDisplayMetrics();
        if (n == 0) {
            this.LJJIJL = (int)(displayMetrics.density * 56.0f);
        }
        else {
            this.LJJIJL = (int)(displayMetrics.density * 40.0f);
        }
        this.LJ.setImageDrawable((Drawable)null);
        this.LJIIJ.LIZ(n);
        this.LJ.setImageDrawable((Drawable)this.LJIIJ);
    }
    
    public void setSlingshotDistance(final int ljiiiz) {
        this.LJIIIZ = ljiiiz;
    }
    
    public void setTargetOffsetTopAndBottom(final int n) {
        this.LJ.bringToFront();
        t.LIZIZ((View)this.LJ, n);
        this.LIZJ = this.LJ.getTop();
    }
    
    public boolean startNestedScroll(final int n) {
        return this.LJIJ.LIZ(n, 0);
    }
    
    public void stopNestedScroll() {
        this.LJIJ.LIZIZ(0);
    }
    
    public interface a
    {
        default static {
            Covode.recordClassIndex(1746);
        }
        
        boolean LIZ();
    }
    
    public interface b
    {
        default static {
            Covode.recordClassIndex(1747);
        }
        
        void LIZ();
    }
}
