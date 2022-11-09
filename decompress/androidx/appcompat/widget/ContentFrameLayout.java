// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import android.view.View;
import androidx.appcompat.view.menu.MenuBuilder;
import h.f;
import android.util.DisplayMetrics;
import android.view.View$MeasureSpec;
import a4.s1;
import h.h;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Rect;
import android.util.TypedValue;
import android.widget.FrameLayout;

public class ContentFrameLayout extends FrameLayout
{
    public TypedValue f;
    public TypedValue g;
    public TypedValue h;
    public TypedValue i;
    public TypedValue j;
    public TypedValue k;
    public final Rect l;
    public a m;
    
    public ContentFrameLayout(final Context context, final AttributeSet set) {
        super(context, set, 0);
        this.l = new Rect();
    }
    
    public TypedValue getFixedHeightMajor() {
        if (this.j == null) {
            this.j = new TypedValue();
        }
        return this.j;
    }
    
    public TypedValue getFixedHeightMinor() {
        if (this.k == null) {
            this.k = new TypedValue();
        }
        return this.k;
    }
    
    public TypedValue getFixedWidthMajor() {
        if (this.h == null) {
            this.h = new TypedValue();
        }
        return this.h;
    }
    
    public TypedValue getFixedWidthMinor() {
        if (this.i == null) {
            this.i = new TypedValue();
        }
        return this.i;
    }
    
    public TypedValue getMinWidthMajor() {
        if (this.f == null) {
            this.f = new TypedValue();
        }
        return this.f;
    }
    
    public TypedValue getMinWidthMinor() {
        if (this.g == null) {
            this.g = new TypedValue();
        }
        return this.g;
    }
    
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        final a m = this.m;
        if (m != null) {
            m.getClass();
        }
    }
    
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Object o = this.m;
        if (o == null) {
            return;
        }
        o = ((h)o).a;
        final b0 y = ((f)o).y;
        if (y != null) {
            y.m();
        }
        Label_0080: {
            if (((f)o).D == null) {
                break Label_0080;
            }
            ((f)o).s.getDecorView().removeCallbacks((Runnable)((f)o).E);
            while (true) {
                if (!((f)o).D.isShowing()) {
                    break Label_0075;
                }
                try {
                    ((f)o).D.dismiss();
                    ((f)o).D = null;
                    final s1 f = ((f)o).F;
                    if (f != null) {
                        f.b();
                    }
                    o = ((f)o).X(0).h;
                    if (o != null) {
                        ((MenuBuilder)o).close();
                    }
                }
                catch (final IllegalArgumentException ex) {
                    continue;
                }
                break;
            }
        }
    }
    
    public final void onMeasure(int n, int n2) {
        final DisplayMetrics displayMetrics = ((View)this).getContext().getResources().getDisplayMetrics();
        final int widthPixels = displayMetrics.widthPixels;
        final int heightPixels = displayMetrics.heightPixels;
        final int n3 = 1;
        final boolean b = widthPixels < heightPixels;
        final int mode = View$MeasureSpec.getMode(n);
        final int mode2 = View$MeasureSpec.getMode(n2);
        int measureSpec = 0;
        Label_0205: {
            if (mode == Integer.MIN_VALUE) {
                TypedValue typedValue;
                if (b) {
                    typedValue = this.i;
                }
                else {
                    typedValue = this.h;
                }
                if (typedValue != null) {
                    final int type = typedValue.type;
                    if (type != 0) {
                        int n5 = 0;
                        Label_0152: {
                            float n4;
                            if (type == 5) {
                                n4 = typedValue.getDimension(displayMetrics);
                            }
                            else {
                                if (type != 6) {
                                    n5 = 0;
                                    break Label_0152;
                                }
                                final int widthPixels2 = displayMetrics.widthPixels;
                                n4 = typedValue.getFraction((float)widthPixels2, (float)widthPixels2);
                            }
                            n5 = (int)n4;
                        }
                        if (n5 > 0) {
                            final Rect l = this.l;
                            measureSpec = View$MeasureSpec.makeMeasureSpec(Math.min(n5 - (l.left + l.right), View$MeasureSpec.getSize(n)), 1073741824);
                            n = 1;
                            break Label_0205;
                        }
                    }
                }
            }
            final int n6 = 0;
            measureSpec = n;
            n = n6;
        }
        int measureSpec2 = n2;
        if (mode2 == Integer.MIN_VALUE) {
            TypedValue typedValue2;
            if (b) {
                typedValue2 = this.j;
            }
            else {
                typedValue2 = this.k;
            }
            measureSpec2 = n2;
            if (typedValue2 != null) {
                final int type2 = typedValue2.type;
                measureSpec2 = n2;
                if (type2 != 0) {
                    int n8 = 0;
                    Label_0312: {
                        float n7;
                        if (type2 == 5) {
                            n7 = typedValue2.getDimension(displayMetrics);
                        }
                        else {
                            if (type2 != 6) {
                                n8 = 0;
                                break Label_0312;
                            }
                            final int heightPixels2 = displayMetrics.heightPixels;
                            n7 = typedValue2.getFraction((float)heightPixels2, (float)heightPixels2);
                        }
                        n8 = (int)n7;
                    }
                    measureSpec2 = n2;
                    if (n8 > 0) {
                        final Rect i = this.l;
                        measureSpec2 = View$MeasureSpec.makeMeasureSpec(Math.min(n8 - (i.top + i.bottom), View$MeasureSpec.getSize(n2)), 1073741824);
                    }
                }
            }
        }
        super.onMeasure(measureSpec, measureSpec2);
        final int measuredWidth = ((View)this).getMeasuredWidth();
        final int measureSpec3 = View$MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        Label_0520: {
            if (n == 0 && mode == Integer.MIN_VALUE) {
                TypedValue typedValue3;
                if (b) {
                    typedValue3 = this.g;
                }
                else {
                    typedValue3 = this.f;
                }
                if (typedValue3 != null) {
                    n = typedValue3.type;
                    if (n != 0) {
                        Label_0470: {
                            float n9;
                            if (n == 5) {
                                n9 = typedValue3.getDimension(displayMetrics);
                            }
                            else {
                                if (n != 6) {
                                    n = 0;
                                    break Label_0470;
                                }
                                n = displayMetrics.widthPixels;
                                n9 = typedValue3.getFraction((float)n, (float)n);
                            }
                            n = (int)n9;
                        }
                        n2 = n;
                        if (n > 0) {
                            final Rect j = this.l;
                            n2 = n - (j.left + j.right);
                        }
                        if (measuredWidth < n2) {
                            n = View$MeasureSpec.makeMeasureSpec(n2, 1073741824);
                            n2 = n3;
                            break Label_0520;
                        }
                    }
                }
            }
            n2 = 0;
            n = measureSpec3;
        }
        if (n2 != 0) {
            super.onMeasure(n, measureSpec2);
        }
    }
    
    public void setAttachListener(final a m) {
        this.m = m;
    }
    
    public interface a
    {
    }
}
