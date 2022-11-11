// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.ActionMode;
import android.view.ActionMode$Callback;
import android.view.ViewGroup$LayoutParams;
import android.graphics.drawable.Drawable$Callback;
import android.view.View$MeasureSpec;
import android.view.MotionEvent;
import android.widget.FrameLayout$LayoutParams;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import android.view.View;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;

public class 02x extends FrameLayout
{
    public Drawable LIZ;
    public Drawable LIZIZ;
    public Drawable LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public View LJI;
    public View LJII;
    public View LJIIIIZZ;
    public int LJIIIZ;
    
    static {
        Covode.recordClassIndex(374);
    }
    
    public 02x(final Context context, final AttributeSet set) {
        super(context, set);
        ((View)this).setBackground((Drawable)new 04C(this));
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, new int[] { 2130969085, 2130969088, 2130969089, 2130969383, 2130969384, 2130969385, 2130969386, 2130969387, 2130969388, 2130969430, 2130969459, 2130969461, 2130969506, 2130969619, 2130969625, 2130969636, 2130969637, 2130969640, 2130969677, 2130969730, 2130970603, 2130970691, 2130970747, 2130970766, 2130970767, 2130971128, 2130971131, 2130971244, 2130971259 });
        final boolean b = false;
        this.LIZ = obtainStyledAttributes.getDrawable(0);
        this.LIZIZ = obtainStyledAttributes.getDrawable(2);
        this.LJIIIZ = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (this.getId() == 2131371566) {
            this.LIZLLL = true;
            this.LIZJ = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        boolean willNotDraw = false;
        Label_0274: {
            if (this.LIZLLL) {
                willNotDraw = b;
                if (this.LIZJ != null) {
                    break Label_0274;
                }
            }
            else {
                willNotDraw = b;
                if (this.LIZ != null) {
                    break Label_0274;
                }
                willNotDraw = b;
                if (this.LIZIZ != null) {
                    break Label_0274;
                }
            }
            willNotDraw = true;
        }
        this.setWillNotDraw(willNotDraw);
    }
    
    private boolean LIZ(final View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }
    
    private int LIZIZ(final View view) {
        final FrameLayout$LayoutParams frameLayout$LayoutParams = (FrameLayout$LayoutParams)view.getLayoutParams();
        return view.getMeasuredHeight() + frameLayout$LayoutParams.topMargin + frameLayout$LayoutParams.bottomMargin;
    }
    
    public void drawableStateChanged() {
        super.drawableStateChanged();
        final Drawable liz = this.LIZ;
        if (liz != null && liz.isStateful()) {
            this.LIZ.setState(this.getDrawableState());
        }
        final Drawable liziz = this.LIZIZ;
        if (liziz != null && liziz.isStateful()) {
            this.LIZIZ.setState(this.getDrawableState());
        }
        final Drawable lizj = this.LIZJ;
        if (lizj != null && lizj.isStateful()) {
            this.LIZJ.setState(this.getDrawableState());
        }
    }
    
    public View getTabContainer() {
        return this.LJI;
    }
    
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        final Drawable liz = this.LIZ;
        if (liz != null) {
            liz.jumpToCurrentState();
        }
        final Drawable liziz = this.LIZIZ;
        if (liziz != null) {
            liziz.jumpToCurrentState();
        }
        final Drawable lizj = this.LIZJ;
        if (lizj != null) {
            lizj.jumpToCurrentState();
        }
    }
    
    public void onFinishInflate() {
        super.onFinishInflate();
        this.LJII = this.findViewById(2131361902);
        this.LJIIIIZZ = this.findViewById(2131361918);
    }
    
    public boolean onHoverEvent(final MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }
    
    public boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        return this.LJFF || super.onInterceptTouchEvent(motionEvent);
    }
    
    public void onLayout(final boolean b, int n, int n2, final int n3, int measuredHeight) {
        super.onLayout(b, n, n2, n3, measuredHeight);
        final View lji = this.LJI;
        n2 = 0;
        boolean lj = false;
        Label_0098: {
            boolean b2;
            if (lji != null && lji.getVisibility() != 8) {
                b2 = true;
            }
            else {
                lj = false;
                b2 = false;
                if (lji == null) {
                    break Label_0098;
                }
            }
            lj = b2;
            if (lji.getVisibility() != 8) {
                measuredHeight = this.getMeasuredHeight();
                final FrameLayout$LayoutParams frameLayout$LayoutParams = (FrameLayout$LayoutParams)lji.getLayoutParams();
                lji.layout(n, measuredHeight - lji.getMeasuredHeight() - frameLayout$LayoutParams.bottomMargin, n3, measuredHeight - frameLayout$LayoutParams.bottomMargin);
                lj = b2;
            }
        }
        Label_0131: {
            if (this.LIZLLL) {
                final Drawable lizj = this.LIZJ;
                if (lizj == null) {
                    return;
                }
                lizj.setBounds(0, 0, this.getMeasuredWidth(), this.getMeasuredHeight());
            }
            else {
                n = n2;
                if (this.LIZ != null) {
                    if (this.LJII.getVisibility() == 0) {
                        this.LIZ.setBounds(this.LJII.getLeft(), this.LJII.getTop(), this.LJII.getRight(), this.LJII.getBottom());
                    }
                    else {
                        final View ljiiiizz = this.LJIIIIZZ;
                        if (ljiiiizz != null && ljiiiizz.getVisibility() == 0) {
                            this.LIZ.setBounds(this.LJIIIIZZ.getLeft(), this.LJIIIIZZ.getTop(), this.LJIIIIZZ.getRight(), this.LJIIIIZZ.getBottom());
                        }
                        else {
                            this.LIZ.setBounds(0, 0, 0, 0);
                        }
                    }
                    n = 1;
                }
                this.LJ = lj;
                if (lj) {
                    final Drawable liziz = this.LIZIZ;
                    if (liziz != null) {
                        liziz.setBounds(lji.getLeft(), lji.getTop(), lji.getRight(), lji.getBottom());
                        break Label_0131;
                    }
                }
                if (n == 0) {
                    return;
                }
            }
        }
        this.invalidate();
    }
    
    public void onMeasure(int n, int n2) {
        int measureSpec = n2;
        if (this.LJII == null) {
            measureSpec = n2;
            if (View$MeasureSpec.getMode(n2) == Integer.MIN_VALUE) {
                final int ljiiiz = this.LJIIIZ;
                measureSpec = n2;
                if (ljiiiz >= 0) {
                    measureSpec = View$MeasureSpec.makeMeasureSpec(Math.min(ljiiiz, View$MeasureSpec.getSize(n2)), Integer.MIN_VALUE);
                }
            }
        }
        super.onMeasure(n, measureSpec);
        if (this.LJII == null) {
            return;
        }
        n2 = View$MeasureSpec.getMode(measureSpec);
        final View lji = this.LJI;
        if (lji != null && lji.getVisibility() != 8 && n2 != 1073741824) {
            if (!this.LIZ(this.LJII)) {
                n = this.LIZIZ(this.LJII);
            }
            else if (!this.LIZ(this.LJIIIIZZ)) {
                n = this.LIZIZ(this.LJIIIIZZ);
            }
            else {
                n = 0;
            }
            if (n2 == Integer.MIN_VALUE) {
                n2 = View$MeasureSpec.getSize(measureSpec);
            }
            else {
                n2 = Integer.MAX_VALUE;
            }
            this.setMeasuredDimension(this.getMeasuredWidth(), Math.min(n + this.LIZIZ(this.LJI), n2));
        }
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }
    
    public void setPrimaryBackground(final Drawable liz) {
        final Drawable liz2 = this.LIZ;
        if (liz2 != null) {
            liz2.setCallback((Drawable$Callback)null);
            this.unscheduleDrawable(this.LIZ);
        }
        if ((this.LIZ = liz) != null) {
            liz.setCallback((Drawable$Callback)this);
            final View ljii = this.LJII;
            if (ljii != null) {
                this.LIZ.setBounds(ljii.getLeft(), this.LJII.getTop(), this.LJII.getRight(), this.LJII.getBottom());
            }
        }
        final boolean lizlll = this.LIZLLL;
        boolean willNotDraw = true;
        while (true) {
            Label_0128: {
                if (lizlll) {
                    if (this.LIZJ != null) {
                        break Label_0128;
                    }
                }
                else if (this.LIZ != null || this.LIZIZ != null) {
                    break Label_0128;
                }
                this.setWillNotDraw(willNotDraw);
                this.invalidate();
                this.invalidateOutline();
                return;
            }
            willNotDraw = false;
            continue;
        }
    }
    
    public void setSplitBackground(Drawable lizj) {
        final Drawable lizj2 = this.LIZJ;
        if (lizj2 != null) {
            lizj2.setCallback((Drawable$Callback)null);
            this.unscheduleDrawable(this.LIZJ);
        }
        this.LIZJ = lizj;
        final boolean b = false;
        if (lizj != null) {
            lizj.setCallback((Drawable$Callback)this);
            if (this.LIZLLL) {
                lizj = this.LIZJ;
                if (lizj != null) {
                    lizj.setBounds(0, 0, this.getMeasuredWidth(), this.getMeasuredHeight());
                }
            }
        }
        boolean willNotDraw = false;
        Label_0088: {
            if (this.LIZLLL) {
                willNotDraw = b;
                if (this.LIZJ != null) {
                    break Label_0088;
                }
            }
            else {
                willNotDraw = b;
                if (this.LIZ != null) {
                    break Label_0088;
                }
                willNotDraw = b;
                if (this.LIZIZ != null) {
                    break Label_0088;
                }
            }
            willNotDraw = true;
        }
        this.setWillNotDraw(willNotDraw);
        this.invalidate();
        this.invalidateOutline();
    }
    
    public void setStackedBackground(Drawable liziz) {
        final Drawable liziz2 = this.LIZIZ;
        if (liziz2 != null) {
            liziz2.setCallback((Drawable$Callback)null);
            this.unscheduleDrawable(this.LIZIZ);
        }
        if ((this.LIZIZ = liziz) != null) {
            liziz.setCallback((Drawable$Callback)this);
            if (this.LJ) {
                liziz = this.LIZIZ;
                if (liziz != null) {
                    liziz.setBounds(this.LJI.getLeft(), this.LJI.getTop(), this.LJI.getRight(), this.LJI.getBottom());
                }
            }
        }
        final boolean lizlll = this.LIZLLL;
        boolean willNotDraw = true;
        while (true) {
            Label_0135: {
                if (lizlll) {
                    if (this.LIZJ != null) {
                        break Label_0135;
                    }
                }
                else if (this.LIZ != null || this.LIZIZ != null) {
                    break Label_0135;
                }
                this.setWillNotDraw(willNotDraw);
                this.invalidate();
                this.invalidateOutline();
                return;
            }
            willNotDraw = false;
            continue;
        }
    }
    
    public void setTabContainer(final 03x lji) {
        final View lji2 = this.LJI;
        if (lji2 != null) {
            this.removeView(lji2);
        }
        if ((this.LJI = (View)lji) != null) {
            this.addView((View)lji);
            final ViewGroup$LayoutParams layoutParams = lji.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            lji.setAllowCollapse(false);
        }
    }
    
    public void setTransitioning(final boolean ljff) {
        this.LJFF = ljff;
        int descendantFocusability;
        if (ljff) {
            descendantFocusability = 393216;
        }
        else {
            descendantFocusability = 262144;
        }
        this.setDescendantFocusability(descendantFocusability);
    }
    
    public void setVisibility(final int visibility) {
        super.setVisibility(visibility);
        final boolean b = visibility == 0;
        final Drawable liz = this.LIZ;
        if (liz != null) {
            liz.setVisible(b, false);
        }
        final Drawable liziz = this.LIZIZ;
        if (liziz != null) {
            liziz.setVisible(b, false);
        }
        final Drawable lizj = this.LIZJ;
        if (lizj != null) {
            lizj.setVisible(b, false);
        }
    }
    
    public ActionMode startActionModeForChild(final View view, final ActionMode$Callback actionMode$Callback) {
        return null;
    }
    
    public ActionMode startActionModeForChild(final View view, final ActionMode$Callback actionMode$Callback, final int n) {
        if (n != 0) {
            return super.startActionModeForChild(view, actionMode$Callback, n);
        }
        return null;
    }
    
    public boolean verifyDrawable(final Drawable drawable) {
        return (drawable == this.LIZ && !this.LIZLLL) || (drawable == this.LIZIZ && this.LJ) || (drawable == this.LIZJ && this.LIZLLL) || super.verifyDrawable(drawable);
    }
}
