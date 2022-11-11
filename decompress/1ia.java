// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.ViewGroup$LayoutParams;
import android.view.View$MeasureSpec;
import android.graphics.Xfermode;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Canvas;
import android.content.res.TypedArray;
import androidx.core.g.t;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import android.graphics.Paint;
import android.content.res.ColorStateList;
import android.widget.TextView;
import android.view.View;

public class 1ia extends 1JF
{
    public View LIZ;
    public TextView LIZIZ;
    public int LIZJ;
    public ColorStateList LIZLLL;
    public 1ic LJ;
    public int LJFF;
    public boolean LJI;
    public Paint LJII;
    
    static {
        Covode.recordClassIndex(6103);
    }
    
    public 1ia(final Context context, final AttributeSet set) {
        this(context, set, (byte)0);
    }
    
    public 1ia(final Context context, final AttributeSet set, final byte b) {
        super(context, set, (byte)0);
        this.LJFF = Integer.MAX_VALUE;
        inflate(this.getContext(), 2131560684, (ViewGroup)this);
        this.LIZ = this.findViewById(2131372704);
        this.LIZIZ = (TextView)this.findViewById(2131372778);
        this.setGravity(17);
        this.setOrientation(0);
        (this.LJ = new 1ic((View)this)).LIZ(set, 2130970588, 0);
        final TypedArray obtainStyledAttributes = this.getContext().obtainStyledAttributes(set, new int[] { 16842804, 16842904, 16843039, 16843087, 2130969432, 2130969640, 2130969654, 2130969658 }, 2130970588, 0);
        for (int indexCount = obtainStyledAttributes.getIndexCount(), i = 0; i < indexCount; ++i) {
            final int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                final int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                if (resourceId != 0) {
                    08p.LIZ(this.LIZIZ, resourceId);
                }
            }
            else if (index == 3) {
                this.setText(obtainStyledAttributes.getText(index));
            }
            else if (index == 1) {
                final ColorStateList liz = 0eN.LIZ(this.getContext(), obtainStyledAttributes, index);
                if (liz != null) {
                    this.LIZIZ.setTextColor(liz);
                }
            }
            else if (index == 5) {
                final int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                if (resourceId2 != 0) {
                    this.setIcon(resourceId2);
                }
                else {
                    this.setIcon(null);
                }
            }
            else if (index == 7) {
                final ColorStateList liz2 = 0eN.LIZ(this.getContext(), obtainStyledAttributes, index);
                if ((this.LIZLLL = liz2) != null) {
                    t.LIZ(this.LIZ, liz2);
                }
            }
            else if (index == 6) {
                this.setIconSize(obtainStyledAttributes.getDimensionPixelSize(index, -2));
            }
            else if (index == 2) {
                this.LJFF = obtainStyledAttributes.getDimensionPixelSize(index, this.LJFF);
            }
            else if (index == 4) {
                this.setCutout(obtainStyledAttributes.getBoolean(index, false));
            }
        }
        obtainStyledAttributes.recycle();
    }
    
    private void LIZ(final Drawable background) {
        if (background != null) {
            this.LIZ.setVisibility(0);
        }
        else {
            this.LIZ.setVisibility(8);
        }
        this.LIZ.setBackground(background);
        t.LIZ(this.LIZ, this.LIZLLL);
        if (background != null) {
            background.setAutoMirrored(true);
        }
    }
    
    public void dispatchDraw(final Canvas canvas) {
        if (this.LJI) {
            if (this.LJII == null) {
                (this.LJII = new Paint(1)).setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff$Mode.DST_OUT));
            }
            final int liz = 0dv.LIZ(canvas, this.getWidth(), this.getHeight(), this.LJII);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(liz);
            return;
        }
        super.dispatchDraw(canvas);
    }
    
    @Override
    public void draw(final Canvas canvas) {
        final 1ic lj = this.LJ;
        if (lj == null) {
            super.draw(canvas);
            return;
        }
        final boolean liz = lj.LIZ(canvas);
        super.draw(canvas);
        this.LJ.LIZ(canvas, liz);
    }
    
    @Override
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.invalidate();
    }
    
    public void onMeasure(int n, final int n2) {
        final int mode = View$MeasureSpec.getMode(n);
        final int n3 = n = View$MeasureSpec.getSize(n);
        if (mode != 1073741824) {
            n = Math.min(n3, this.LJFF);
        }
        super.onMeasure(View$MeasureSpec.makeMeasureSpec(n, mode), n2);
    }
    
    public void setCutout(final boolean lji) {
        if (this.LJI != lji) {
            this.LJI = lji;
            this.invalidate();
        }
    }
    
    public void setIcon(final int n) {
        this.LIZ(01s.LIZIZ(this.getContext(), n));
    }
    
    public void setIcon(final Drawable drawable) {
        this.LIZ(drawable);
    }
    
    public void setIconSize(final int height) {
        if (height != this.LIZJ) {
            this.LIZJ = height;
            final ViewGroup$LayoutParams layoutParams = this.LIZ.getLayoutParams();
            layoutParams.width = height;
            layoutParams.height = height;
            this.LIZ.setLayoutParams(layoutParams);
        }
    }
    
    public void setText(final int text) {
        this.LIZIZ.setText(text);
    }
    
    public void setText(final CharSequence text) {
        this.LIZIZ.setText(text);
    }
}
