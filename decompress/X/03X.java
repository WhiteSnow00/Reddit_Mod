// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityEvent;
import android.view.ViewParent;
import android.text.TextUtils$TruncateAt;
import androidx.appcompat.widget.AppCompatTextView;
import android.text.TextUtils;
import android.widget.LinearLayout$LayoutParams;
import androidx.appcompat.widget.AppCompatImageView;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.LinearLayout;
import android.widget.AbsListView$LayoutParams;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.SpinnerAdapter;
import android.view.View$MeasureSpec;
import android.widget.AdapterView;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.res.Configuration;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.bytedance.covode.number.Covode;
import android.widget.Spinner;
import androidx.appcompat.widget.LinearLayoutCompat;
import android.widget.AdapterView$OnItemSelectedListener;
import android.widget.HorizontalScrollView;

public class 03x extends HorizontalScrollView implements AdapterView$OnItemSelectedListener
{
    public Runnable LIZ;
    public LinearLayoutCompat LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public Spinner LJFF;
    public boolean LJI;
    public int LJII;
    
    static {
        Covode.recordClassIndex(490);
        new DecelerateInterpolator();
    }
    
    private boolean LIZ() {
        final Spinner ljff = this.LJFF;
        return ljff != null && ljff.getParent() == this;
    }
    
    private boolean LIZIZ() {
        if (!this.LIZ()) {
            return false;
        }
        this.removeView((View)this.LJFF);
        this.addView((View)this.LIZIZ, new ViewGroup$LayoutParams(-2, -1));
        this.setTabSelected(this.LJFF.getSelectedItemPosition());
        return false;
    }
    
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        final Runnable liz = this.LIZ;
        if (liz != null) {
            this.post(liz);
        }
    }
    
    public void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        final 02R liz = 02R.LIZ(this.getContext());
        final TypedArray obtainStyledAttributes = liz.LIZ.obtainStyledAttributes((AttributeSet)null, new int[] { 2130969085, 2130969088, 2130969089, 2130969383, 2130969384, 2130969385, 2130969386, 2130969387, 2130969388, 2130969430, 2130969459, 2130969461, 2130969506, 2130969619, 2130969625, 2130969636, 2130969637, 2130969640, 2130969677, 2130969730, 2130970603, 2130970691, 2130970747, 2130970766, 2130970767, 2130971128, 2130971131, 2130971244, 2130971259 }, 2130968988, 0);
        final int layoutDimension = obtainStyledAttributes.getLayoutDimension(13, 0);
        final Resources resources = liz.LIZ.getResources();
        int min = layoutDimension;
        if (!liz.LIZIZ()) {
            min = Math.min(layoutDimension, resources.getDimensionPixelSize(2131165196));
        }
        obtainStyledAttributes.recycle();
        this.setContentHeight(min);
        this.LIZLLL = liz.LIZ.getResources().getDimensionPixelSize(2131165197);
    }
    
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        final Runnable liz = this.LIZ;
        if (liz != null) {
            this.removeCallbacks(liz);
        }
    }
    
    public void onItemSelected(final AdapterView<?> adapterView, final View view, final int n, final long n2) {
    }
    
    public void onMeasure(int measuredWidth, int n) {
        final int mode = View$MeasureSpec.getMode(measuredWidth);
        final boolean fillViewport = mode == 1073741824;
        this.setFillViewport(fillViewport);
        n = this.LIZIZ.getChildCount();
        if (n > 1 && (mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            if (n > 2) {
                this.LIZJ = (int)(View$MeasureSpec.getSize(measuredWidth) * 0.4f);
            }
            else {
                this.LIZJ = View$MeasureSpec.getSize(measuredWidth) / 2;
            }
            this.LIZJ = Math.min(this.LIZJ, this.LIZLLL);
        }
        else {
            this.LIZJ = -1;
        }
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(this.LJ, 1073741824);
        if (!fillViewport && this.LJI) {
            this.LIZIZ.measure(0, measureSpec);
            if (this.LIZIZ.getMeasuredWidth() > View$MeasureSpec.getSize(measuredWidth)) {
                if (!this.LIZ()) {
                    if (this.LJFF == null) {
                        final 03E ljff = new 03E(this.getContext(), null, 2130968996);
                        ljff.setLayoutParams((ViewGroup$LayoutParams)new LinearLayoutCompat.a(-2, -1));
                        ljff.setOnItemSelectedListener((AdapterView$OnItemSelectedListener)this);
                        this.LJFF = ljff;
                    }
                    this.removeView((View)this.LIZIZ);
                    this.addView((View)this.LJFF, new ViewGroup$LayoutParams(-2, -1));
                    if (this.LJFF.getAdapter() == null) {
                        this.LJFF.setAdapter((SpinnerAdapter)new a());
                    }
                    final Runnable liz = this.LIZ;
                    if (liz != null) {
                        this.removeCallbacks(liz);
                        this.LIZ = null;
                    }
                    this.LJFF.setSelection(this.LJII);
                }
            }
            else {
                this.LIZIZ();
            }
        }
        else {
            this.LIZIZ();
        }
        n = this.getMeasuredWidth();
        super.onMeasure(measuredWidth, measureSpec);
        measuredWidth = this.getMeasuredWidth();
        if (fillViewport && n != measuredWidth) {
            this.setTabSelected(this.LJII);
        }
    }
    
    public void onNothingSelected(final AdapterView<?> adapterView) {
    }
    
    public void setAllowCollapse(final boolean lji) {
        this.LJI = lji;
    }
    
    public void setContentHeight(final int lj) {
        this.LJ = lj;
        this.requestLayout();
    }
    
    public void setTabSelected(final int n) {
        this.LJII = n;
        for (int childCount = this.LIZIZ.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = this.LIZIZ.getChildAt(i);
            final boolean selected = i == n;
            child.setSelected(selected);
            if (selected) {
                final View child2 = this.LIZIZ.getChildAt(n);
                final Runnable liz = this.LIZ;
                if (liz != null) {
                    this.removeCallbacks(liz);
                }
                this.post(this.LIZ = new 03u(this, child2));
            }
        }
        final Spinner ljff = this.LJFF;
        if (ljff != null && n >= 0) {
            ljff.setSelection(n);
        }
    }
    
    public final class a extends BaseAdapter
    {
        static {
            Covode.recordClassIndex(492);
        }
        
        public final int getCount() {
            return 03x.this.LIZIZ.getChildCount();
        }
        
        public final Object getItem(final int n) {
            return ((b)03x.this.LIZIZ.getChildAt(n)).LIZ;
        }
        
        public final long getItemId(final int n) {
            return n;
        }
        
        public final View getView(final int n, View view, final ViewGroup viewGroup) {
            if (view == null) {
                final 03x liz = 03x.this;
                view = (View)liz.new b(liz.getContext(), (023.b)this.getItem(n));
                ((b)view).setBackgroundDrawable((Drawable)null);
                ((b)view).setLayoutParams((ViewGroup$LayoutParams)new AbsListView$LayoutParams(-1, liz.LJ));
            }
            else {
                final b b = (b)view;
                b.LIZ = (023.b)this.getItem(n);
                b.LIZ();
            }
            return view;
        }
    }
    
    public final class b extends LinearLayout
    {
        public 023.b LIZ;
        public final int[] LIZJ;
        public TextView LIZLLL;
        public ImageView LJ;
        public View LJFF;
        
        static {
            Covode.recordClassIndex(493);
        }
        
        public b(final Context context, final 023.b liz) {
            super(context, (AttributeSet)null, 2130968990);
            final int[] lizj = { 16842964 };
            this.LIZJ = lizj;
            this.LIZ = liz;
            final 043 liz2 = 043.LIZ(context, null, lizj, 2130968990, 0);
            if (liz2.LJFF(0)) {
                this.setBackgroundDrawable(liz2.LIZ(0));
            }
            liz2.LIZ.recycle();
            this.setGravity(8388627);
            this.LIZ();
        }
        
        public final void LIZ() {
            final 023.b liz = this.LIZ;
            final View lizj = liz.LIZJ();
            CharSequence lizlll = null;
            if (lizj != null) {
                final ViewParent parent = lizj.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup)parent).removeView(lizj);
                    }
                    this.addView(lizj);
                }
                this.LJFF = lizj;
                final TextView lizlll2 = this.LIZLLL;
                if (lizlll2 != null) {
                    lizlll2.setVisibility(8);
                }
                final ImageView lj = this.LJ;
                if (lj != null) {
                    lj.setVisibility(8);
                    this.LJ.setImageDrawable((Drawable)null);
                }
                return;
            }
            final View ljff = this.LJFF;
            if (ljff != null) {
                this.removeView(ljff);
                this.LJFF = null;
            }
            final Drawable liz2 = liz.LIZ();
            final CharSequence liziz = liz.LIZIZ();
            if (liz2 != null) {
                if (this.LJ == null) {
                    final AppCompatImageView lj2 = new AppCompatImageView(this.getContext());
                    final LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    lj2.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
                    this.addView((View)lj2, 0);
                    this.LJ = lj2;
                }
                this.LJ.setImageDrawable(liz2);
                this.LJ.setVisibility(0);
            }
            else {
                final ImageView lj3 = this.LJ;
                if (lj3 != null) {
                    lj3.setVisibility(8);
                    this.LJ.setImageDrawable((Drawable)null);
                }
            }
            final boolean b = TextUtils.isEmpty(liziz) ^ true;
            if (b) {
                if (this.LIZLLL == null) {
                    final AppCompatTextView lizlll3 = new AppCompatTextView(this.getContext(), null, 2130968991);
                    lizlll3.setEllipsize(TextUtils$TruncateAt.END);
                    final LinearLayout$LayoutParams layoutParams2 = new LinearLayout$LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    lizlll3.setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
                    this.addView((View)lizlll3);
                    this.LIZLLL = lizlll3;
                }
                this.LIZLLL.setText(liziz);
                this.LIZLLL.setVisibility(0);
            }
            else {
                final TextView lizlll4 = this.LIZLLL;
                if (lizlll4 != null) {
                    lizlll4.setVisibility(8);
                    this.LIZLLL.setText((CharSequence)null);
                }
            }
            final ImageView lj4 = this.LJ;
            if (lj4 != null) {
                lj4.setContentDescription(liz.LIZLLL());
            }
            if (!b) {
                lizlll = liz.LIZLLL();
            }
            045.LIZ((View)this, lizlll);
        }
        
        public final void onInitializeAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName((CharSequence)"androidx.appcompat.app.ActionBar$Tab");
        }
        
        public final void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName((CharSequence)"androidx.appcompat.app.ActionBar$Tab");
        }
        
        public final void onMeasure(final int n, final int n2) {
            super.onMeasure(n, n2);
            if (03x.this.LIZJ > 0 && this.getMeasuredWidth() > 03x.this.LIZJ) {
                super.onMeasure(View$MeasureSpec.makeMeasureSpec(03x.this.LIZJ, 1073741824), n2);
            }
        }
        
        public final void setSelected(final boolean selected) {
            boolean b;
            if (this.isSelected() != selected) {
                b = true;
            }
            else {
                b = false;
            }
            super.setSelected(selected);
            if (b && selected) {
                this.sendAccessibilityEvent(4);
            }
        }
    }
}
