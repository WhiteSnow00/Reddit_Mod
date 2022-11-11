// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.ViewGroup;
import android.view.View$MeasureSpec;
import android.view.View;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import androidx.appcompat.widget.LinearLayoutCompat;

public class 13H extends LinearLayoutCompat
{
    static {
        Covode.recordClassIndex(403);
    }
    
    public 13H(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    @Override
    public void onLayout(final boolean b, int n, int intrinsicHeight, int i, int ljii) {
        final int paddingLeft = this.getPaddingLeft();
        final int n2 = i - n;
        final int paddingRight = this.getPaddingRight();
        final int paddingRight2 = this.getPaddingRight();
        n = this.getMeasuredHeight();
        final int childCount = this.getChildCount();
        final int gravity = this.getGravity();
        i = (gravity & 0x70);
        if (i != 16) {
            if (i != 80) {
                n = this.getPaddingTop();
            }
            else {
                n = this.getPaddingTop() + ljii - intrinsicHeight - n;
            }
        }
        else {
            n = this.getPaddingTop() + (ljii - intrinsicHeight - n) / 2;
        }
        final Drawable dividerDrawable = this.getDividerDrawable();
        i = 0;
        if (dividerDrawable == null) {
            intrinsicHeight = 0;
        }
        else {
            intrinsicHeight = dividerDrawable.getIntrinsicHeight();
        }
        while (i < childCount) {
            final View child = this.getChildAt(i);
            ljii = n;
            Label_0257: {
                if (child != null) {
                    ljii = n;
                    if (child.getVisibility() != 8) {
                        final int measuredWidth = child.getMeasuredWidth();
                        final int measuredHeight = child.getMeasuredHeight();
                        final a a = (a)child.getLayoutParams();
                        if ((ljii = a.LJII) < 0) {
                            ljii = (gravity & 0x800007);
                        }
                        ljii = (Gravity.getAbsoluteGravity(ljii, ((View)this).getLayoutDirection()) & 0x7);
                        while (true) {
                            int n3 = 0;
                            Label_0317: {
                                if (ljii == 1) {
                                    ljii = (n2 - paddingLeft - paddingRight2 - measuredWidth) / 2 + paddingLeft + a.leftMargin;
                                    n3 = a.rightMargin;
                                    break Label_0317;
                                }
                                if (ljii == 5) {
                                    ljii = n2 - paddingRight - measuredWidth;
                                    n3 = a.rightMargin;
                                    break Label_0317;
                                }
                                ljii = a.leftMargin + paddingLeft;
                                int n4 = n;
                                if (this.LIZ(i)) {
                                    n4 = n + intrinsicHeight;
                                }
                                n = n4 + a.topMargin;
                                child.layout(ljii, n, measuredWidth + ljii, n + measuredHeight);
                                ljii = n + (measuredHeight + a.bottomMargin);
                                break Label_0257;
                            }
                            ljii -= n3;
                            continue;
                        }
                    }
                }
            }
            ++i;
            n = ljii;
        }
    }
    
    @Override
    public void onMeasure(int n, int i) {
        final int childCount = this.getChildCount();
        View view = null;
        View view2;
        Object o = view2 = null;
        int n2 = 0;
        while (true) {
            final int n3 = i;
            if (n2 < childCount) {
                final View child = this.getChildAt(n2);
                View view3 = view;
                View view4 = view2;
                ViewGroup viewGroup = (ViewGroup)o;
                if (child.getVisibility() != 8) {
                    final int id = child.getId();
                    if (id == 2131372452) {
                        viewGroup = (ViewGroup)o;
                        view4 = view2;
                        view3 = child;
                    }
                    else if (id == 2131363220) {
                        view3 = view;
                        view4 = view2;
                        viewGroup = (ViewGroup)child;
                    }
                    else {
                        if ((id != 2131363930 && id != 2131364133) || view2 != null) {
                            super.onMeasure(n, n3);
                            break;
                        }
                        view3 = view;
                        view4 = child;
                        viewGroup = (ViewGroup)o;
                    }
                }
                ++n2;
                view = view3;
                view2 = view4;
                o = viewGroup;
            }
            else {
                final int mode = View$MeasureSpec.getMode(n3);
                final int size = View$MeasureSpec.getSize(n3);
                final int mode2 = View$MeasureSpec.getMode(n);
                int n4 = this.getPaddingTop() + this.getPaddingBottom();
                int n5;
                if (view != null) {
                    view.measure(n, 0);
                    n4 += view.getMeasuredHeight();
                    n5 = View.combineMeasuredStates(0, view.getMeasuredState());
                }
                else {
                    n5 = 0;
                }
                int n6 = 0;
                Label_0240: {
                    if (o != null) {
                        ((View)o).measure(n, 0);
                        View child2 = (View)o;
                        while (true) {
                            Label_0568: {
                                while (true) {
                                    i = child2.getMinimumHeight();
                                    if (i > 0) {
                                        break;
                                    }
                                    if (!(child2 instanceof ViewGroup)) {
                                        break Label_0568;
                                    }
                                    final ViewGroup viewGroup2 = (ViewGroup)child2;
                                    if (viewGroup2.getChildCount() != 1) {
                                        break Label_0568;
                                    }
                                    child2 = viewGroup2.getChildAt(0);
                                }
                                n6 = ((View)o).getMeasuredHeight() - i;
                                n4 += i;
                                n5 = View.combineMeasuredStates(n5, ((View)o).getMeasuredState());
                                break Label_0240;
                            }
                            i = 0;
                            continue;
                        }
                    }
                    n6 = 0;
                    i = 0;
                }
                int measuredHeight;
                if (view2 != null) {
                    int measureSpec;
                    if (mode == 0) {
                        measureSpec = 0;
                    }
                    else {
                        measureSpec = View$MeasureSpec.makeMeasureSpec(Math.max(0, size - n4), mode);
                    }
                    view2.measure(n, measureSpec);
                    measuredHeight = view2.getMeasuredHeight();
                    n4 += measuredHeight;
                    n5 = View.combineMeasuredStates(n5, view2.getMeasuredState());
                }
                else {
                    measuredHeight = 0;
                }
                final int n7 = size - n4;
                int combineMeasuredStates = n5;
                int n8 = n4;
                int n9 = n7;
                if (o != null) {
                    final int min = Math.min(n7, n6);
                    int n10 = i;
                    int n11 = n7;
                    if (min > 0) {
                        n11 = n7 - min;
                        n10 = i + min;
                    }
                    ((View)o).measure(n, View$MeasureSpec.makeMeasureSpec(n10, 1073741824));
                    i = n4 - i + ((View)o).getMeasuredHeight();
                    combineMeasuredStates = View.combineMeasuredStates(n5, ((View)o).getMeasuredState());
                    n9 = n11;
                    n8 = i;
                }
                int combineMeasuredStates2 = combineMeasuredStates;
                i = n8;
                if (view2 != null) {
                    combineMeasuredStates2 = combineMeasuredStates;
                    i = n8;
                    if (n9 > 0) {
                        view2.measure(n, View$MeasureSpec.makeMeasureSpec(measuredHeight + n9, mode));
                        i = n8 - measuredHeight + view2.getMeasuredHeight();
                        combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, view2.getMeasuredState());
                    }
                }
                int j = 0;
                int n12 = 0;
                while (j < childCount) {
                    final View child3 = this.getChildAt(j);
                    int max = n12;
                    if (child3.getVisibility() != 8) {
                        max = Math.max(n12, child3.getMeasuredWidth());
                    }
                    ++j;
                    n12 = max;
                }
                this.setMeasuredDimension(View.resolveSizeAndState(n12 + (this.getPaddingLeft() + this.getPaddingRight()), n, combineMeasuredStates2), View.resolveSizeAndState(i, n3, 0));
                if (mode2 != 1073741824) {
                    final int measureSpec2 = View$MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 1073741824);
                    i = 0;
                    n = n3;
                    while (i < childCount) {
                        final View child4 = this.getChildAt(i);
                        int n13 = n;
                        if (child4.getVisibility() != 8) {
                            final a a = (a)child4.getLayoutParams();
                            n13 = n;
                            if (a.width == -1) {
                                final int height = a.height;
                                a.height = child4.getMeasuredHeight();
                                this.measureChildWithMargins(child4, measureSpec2, 0, n, 0);
                                a.height = height;
                                n13 = n;
                            }
                        }
                        ++i;
                        n = n13;
                    }
                    break;
                }
                break;
            }
        }
    }
}
