// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.View$MeasureSpec;
import android.view.accessibility.AccessibilityEvent;
import android.view.MotionEvent;
import android.view.ViewGroup$MarginLayoutParams;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup$LayoutParams;
import androidx.appcompat.widget.ActionMenuPresenter;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.ActionBarContextView;
import android.text.TextUtils;
import android.view.LayoutInflater$Factory;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import android.widget.TextView;
import android.widget.LinearLayout;
import android.view.View;

public class 136 extends 03Z
{
    public boolean LJI;
    public CharSequence LJII;
    public CharSequence LJIIIIZZ;
    public View LJIIIZ;
    public View LJIIJ;
    public LinearLayout LJIIJJI;
    public TextView LJIIL;
    public TextView LJIILIIL;
    public int LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;
    
    static {
        Covode.recordClassIndex(375);
    }
    
    public 136(final Context context) {
        this(context, null);
    }
    
    public 136(final Context context, final AttributeSet set) {
        this(context, set, (byte)0);
    }
    
    public 136(final Context context, final AttributeSet set, final byte b) {
        super(context, set, 2130969011);
        final 043 liz = 043.LIZ(context, set, new int[] { 2130969085, 2130969088, 2130969292, 2130969619, 2130971131, 2130971259 }, 2130969011, 0);
        ((View)this).setBackground(liz.LIZ(0));
        this.LJIILJJIL = liz.LJFF(5, 0);
        this.LJIILL = liz.LJFF(4, 0);
        super.LJ = liz.LJ(3, 0);
        this.LJIILLIIL = liz.LJFF(2, 2131558444);
        liz.LIZ.recycle();
    }
    
    public static View LIZ(final LayoutInflater layoutInflater, final ViewGroup viewGroup) {
        if (NEN.LIZ(NEN.LIZ(), true, "tiktok_tux_text_view_opt", false) && layoutInflater != null && layoutInflater.getFactory() == null && layoutInflater.getFactory2() == null) {
            try {
                layoutInflater.setFactory((LayoutInflater$Factory)new SgJ());
            }
            catch (final Exception ex) {
                return layoutInflater.inflate(2131558439, viewGroup);
            }
        }
        return layoutInflater.inflate(2131558439, viewGroup);
    }
    
    private void LIZLLL() {
        if (this.LJIIJJI == null) {
            LIZ(LayoutInflater.from(this.getContext()), this);
            final LinearLayout ljiijji = (LinearLayout)this.getChildAt(this.getChildCount() - 1);
            this.LJIIJJI = ljiijji;
            this.LJIIL = (TextView)ljiijji.findViewById(2131361910);
            this.LJIILIIL = (TextView)this.LJIIJJI.findViewById(2131361909);
            if (this.LJIILJJIL != 0) {
                this.LJIIL.setTextAppearance(this.getContext(), this.LJIILJJIL);
            }
            if (this.LJIILL != 0) {
                this.LJIILIIL.setTextAppearance(this.getContext(), this.LJIILL);
            }
        }
        this.LJIIL.setText(this.LJII);
        this.LJIILIIL.setText(this.LJIIIIZZ);
        final boolean empty = TextUtils.isEmpty(this.LJII);
        final boolean b = TextUtils.isEmpty(this.LJIIIIZZ) ^ true;
        final TextView ljiiliil = this.LJIILIIL;
        final int n = 0;
        int visibility;
        if (b) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        ljiiliil.setVisibility(visibility);
        final LinearLayout ljiijji2 = this.LJIIJJI;
        int visibility2 = n;
        if (!(empty ^ true)) {
            if (b) {
                visibility2 = n;
            }
            else {
                visibility2 = 8;
            }
        }
        ljiijji2.setVisibility(visibility2);
        if (this.LJIIJJI.getParent() == null) {
            this.addView((View)this.LJIIJJI);
        }
    }
    
    public final void LIZ(final 02T 02T) {
        final View ljiiiz = this.LJIIIZ;
        if (ljiiiz == null) {
            this.addView(this.LJIIIZ = 0II.LIZ(LayoutInflater.from(this.getContext()), this.LJIILLIIL, this, false));
        }
        else if (ljiiiz.getParent() == null) {
            this.addView(this.LJIIIZ);
        }
        this.LJIIIZ.findViewById(2131361932).setOnClickListener((View$OnClickListener)new ActionBarContextView.ActionBarContextView$1(02T));
        final 12x 12x = (12x)02T.LIZIZ();
        if (super.LIZLLL != null) {
            super.LIZLLL.LJII();
        }
        (super.LIZLLL = new ActionMenuPresenter(this.getContext())).LIZLLL();
        final ViewGroup$LayoutParams viewGroup$LayoutParams = new ViewGroup$LayoutParams(-2, -1);
        12x.LIZ(super.LIZLLL, super.LIZIZ);
        ((View)(super.LIZJ = (13G)super.LIZLLL.LIZ(this))).setBackground((Drawable)null);
        this.addView((View)super.LIZJ, viewGroup$LayoutParams);
    }
    
    @Override
    public final boolean LIZ() {
        return super.LIZLLL != null && super.LIZLLL.LJ();
    }
    
    public final void LIZIZ() {
        if (this.LJIIIZ == null) {
            this.LIZJ();
        }
    }
    
    public final void LIZJ() {
        this.removeAllViews();
        this.LJIIJ = null;
        super.LIZJ = null;
    }
    
    public ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return (ViewGroup$LayoutParams)new ViewGroup$MarginLayoutParams(-1, -2);
    }
    
    public ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        return (ViewGroup$LayoutParams)new ViewGroup$MarginLayoutParams(this.getContext(), set);
    }
    
    public CharSequence getSubtitle() {
        return this.LJIIIIZZ;
    }
    
    public CharSequence getTitle() {
        return this.LJII;
    }
    
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (super.LIZLLL != null) {
            super.LIZLLL.LJI();
            super.LIZLLL.LJIIIIZZ();
        }
    }
    
    public void onInitializeAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource((View)this);
            accessibilityEvent.setClassName((CharSequence)this.getClass().getName());
            accessibilityEvent.setPackageName((CharSequence)this.getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.LJII);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }
    
    public void onLayout(final boolean b, int paddingLeft, int n, final int n2, int n3) {
        final boolean liz = 04A.LIZ((View)this);
        int paddingLeft2;
        if (liz) {
            paddingLeft2 = n2 - paddingLeft - this.getPaddingRight();
        }
        else {
            paddingLeft2 = this.getPaddingLeft();
        }
        final int paddingTop = this.getPaddingTop();
        final int n4 = n3 - n - this.getPaddingTop() - this.getPaddingBottom();
        final View ljiiiz = this.LJIIIZ;
        n = paddingLeft2;
        if (ljiiiz != null) {
            n = paddingLeft2;
            if (ljiiiz.getVisibility() != 8) {
                final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)this.LJIIIZ.getLayoutParams();
                if (liz) {
                    n3 = viewGroup$MarginLayoutParams.rightMargin;
                    n = viewGroup$MarginLayoutParams.leftMargin;
                }
                else {
                    n3 = viewGroup$MarginLayoutParams.leftMargin;
                    n = viewGroup$MarginLayoutParams.rightMargin;
                }
                n3 = 03Z.LIZ(paddingLeft2, n3, liz);
                n = 03Z.LIZ(n3 + this.LIZ(this.LJIIIZ, n3, paddingTop, n4, liz), n, liz);
            }
        }
        final LinearLayout ljiijji = this.LJIIJJI;
        n3 = n;
        if (ljiijji != null) {
            n3 = n;
            if (this.LJIIJ == null) {
                n3 = n;
                if (ljiijji.getVisibility() != 8) {
                    n3 = n + this.LIZ((View)this.LJIIJJI, n, paddingTop, n4, liz);
                }
            }
        }
        final View ljiij = this.LJIIJ;
        if (ljiij != null) {
            this.LIZ(ljiij, n3, paddingTop, n4, liz);
        }
        if (liz) {
            paddingLeft = this.getPaddingLeft();
        }
        else {
            paddingLeft = n2 - paddingLeft - this.getPaddingRight();
        }
        if (super.LIZJ != null) {
            this.LIZ((View)super.LIZJ, paddingLeft, paddingTop, n4, liz ^ true);
        }
    }
    
    public void onMeasure(int i, int visibility) {
        final int mode = View$MeasureSpec.getMode(i);
        final int n = 1073741824;
        if (mode != 1073741824) {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.getClass().getSimpleName());
            sb.append(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
            throw new IllegalStateException(sb.toString());
        }
        if (View$MeasureSpec.getMode(visibility) == 0) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(this.getClass().getSimpleName());
            sb2.append(" can only be used with android:layout_height=\"wrap_content\"");
            throw new IllegalStateException(sb2.toString());
        }
        final int size = View$MeasureSpec.getSize(i);
        int n2;
        if (super.LJ > 0) {
            n2 = super.LJ;
        }
        else {
            n2 = View$MeasureSpec.getSize(visibility);
        }
        final int n3 = this.getPaddingTop() + this.getPaddingBottom();
        i = size - this.getPaddingLeft() - this.getPaddingRight();
        final int n4 = n2 - n3;
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(n4, Integer.MIN_VALUE);
        final View ljiiiz = this.LJIIIZ;
        visibility = i;
        if (ljiiiz != null) {
            i = this.LIZ(ljiiiz, i, measureSpec);
            final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)this.LJIIIZ.getLayoutParams();
            visibility = i - (viewGroup$MarginLayoutParams.leftMargin + viewGroup$MarginLayoutParams.rightMargin);
        }
        i = visibility;
        if (super.LIZJ != null) {
            i = visibility;
            if (super.LIZJ.getParent() == this) {
                i = this.LIZ((View)super.LIZJ, visibility, measureSpec);
            }
        }
        final LinearLayout ljiijji = this.LJIIJJI;
        final int n5 = 0;
        visibility = i;
        if (ljiijji != null) {
            visibility = i;
            if (this.LJIIJ == null) {
                if (this.LJI) {
                    visibility = View$MeasureSpec.makeMeasureSpec(0, 0);
                    this.LJIIJJI.measure(visibility, measureSpec);
                    final int measuredWidth = this.LJIIJJI.getMeasuredWidth();
                    if (measuredWidth <= i) {
                        visibility = 1;
                        i -= measuredWidth;
                    }
                    else {
                        visibility = 0;
                    }
                    final LinearLayout ljiijji2 = this.LJIIJJI;
                    if (visibility != 0) {
                        visibility = 0;
                    }
                    else {
                        visibility = 8;
                    }
                    ljiijji2.setVisibility(visibility);
                    visibility = i;
                }
                else {
                    visibility = this.LIZ((View)ljiijji, i, measureSpec);
                }
            }
        }
        final View ljiij = this.LJIIJ;
        if (ljiij != null) {
            final ViewGroup$LayoutParams layoutParams = ljiij.getLayoutParams();
            if (layoutParams.width != -2) {
                i = 1073741824;
            }
            else {
                i = Integer.MIN_VALUE;
            }
            int min = visibility;
            if (layoutParams.width >= 0) {
                min = Math.min(layoutParams.width, visibility);
            }
            if (layoutParams.height != -2) {
                visibility = n;
            }
            else {
                visibility = Integer.MIN_VALUE;
            }
            int min2 = n4;
            if (layoutParams.height >= 0) {
                min2 = Math.min(layoutParams.height, n4);
            }
            this.LJIIJ.measure(View$MeasureSpec.makeMeasureSpec(min, i), View$MeasureSpec.makeMeasureSpec(min2, visibility));
        }
        if (super.LJ <= 0) {
            final int childCount = this.getChildCount();
            visibility = 0;
            int n6;
            int n7;
            for (i = n5; i < childCount; ++i, visibility = n7) {
                n6 = this.getChildAt(i).getMeasuredHeight() + n3;
                if (n6 > (n7 = visibility)) {
                    n7 = n6;
                }
            }
            this.setMeasuredDimension(size, visibility);
            return;
        }
        this.setMeasuredDimension(size, n2);
    }
    
    @Override
    public void setContentHeight(final int lj) {
        super.LJ = lj;
    }
    
    public void setCustomView(final View ljiij) {
        final View ljiij2 = this.LJIIJ;
        if (ljiij2 != null) {
            this.removeView(ljiij2);
        }
        if ((this.LJIIJ = ljiij) != null) {
            final LinearLayout ljiijji = this.LJIIJJI;
            if (ljiijji != null) {
                this.removeView((View)ljiijji);
                this.LJIIJJI = null;
            }
            this.addView(ljiij);
        }
        this.requestLayout();
    }
    
    public void setSubtitle(final CharSequence ljiiiizz) {
        this.LJIIIIZZ = ljiiiizz;
        this.LIZLLL();
    }
    
    public void setTitle(final CharSequence ljii) {
        this.LJII = ljii;
        this.LIZLLL();
    }
    
    public void setTitleOptional(final boolean lji) {
        if (lji != this.LJI) {
            this.requestLayout();
        }
        this.LJI = lji;
    }
    
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
