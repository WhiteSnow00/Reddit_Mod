// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.View$MeasureSpec;
import java.util.WeakHashMap;
import android.view.ViewGroup;
import a4.p0;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;

public class AlertDialogLayout extends LinearLayoutCompat
{
    public AlertDialogLayout(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public static int d(final View view) {
        final WeakHashMap a = p0.a;
        final int d = p0.d.d(view);
        if (d > 0) {
            return d;
        }
        if (view instanceof ViewGroup) {
            final ViewGroup viewGroup = (ViewGroup)view;
            if (viewGroup.getChildCount() == 1) {
                return d(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }
    
    public final void forceUniformWidth(final int n, final int n2) {
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(((View)this).getMeasuredWidth(), 1073741824);
        for (int i = 0; i < n; ++i) {
            final View child = this.getChildAt(i);
            if (child.getVisibility() != 8) {
                final a a = (a)child.getLayoutParams();
                if (a.width == -1) {
                    final int height = a.height;
                    a.height = child.getMeasuredHeight();
                    this.measureChildWithMargins(child, measureSpec, 0, n2, 0);
                    a.height = height;
                }
            }
        }
    }
    
    @Override
    public final void onLayout(final boolean b, int n, int intrinsicHeight, int i, int n2) {
        final int paddingLeft = ((View)this).getPaddingLeft();
        final int n3 = i - n;
        final int paddingRight = ((View)this).getPaddingRight();
        final int paddingRight2 = ((View)this).getPaddingRight();
        n = ((View)this).getMeasuredHeight();
        final int childCount = this.getChildCount();
        final int gravity = this.getGravity();
        i = (gravity & 0x70);
        if (i != 16) {
            if (i != 80) {
                n = ((View)this).getPaddingTop();
            }
            else {
                n = ((View)this).getPaddingTop() + n2 - intrinsicHeight - n;
            }
        }
        else {
            i = ((View)this).getPaddingTop();
            n = (n2 - intrinsicHeight - n) / 2 + i;
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
            n2 = n;
            if (child != null) {
                n2 = n;
                if (child.getVisibility() != 8) {
                    final int measuredWidth = child.getMeasuredWidth();
                    final int measuredHeight = child.getMeasuredHeight();
                    final a a = (a)child.getLayoutParams();
                    if ((n2 = a.gravity) < 0) {
                        n2 = (gravity & 0x800007);
                    }
                    final WeakHashMap a2 = p0.a;
                    n2 = (Gravity.getAbsoluteGravity(n2, p0.e.d((View)this)) & 0x7);
                    Label_0313: {
                        int n4;
                        if (n2 != 1) {
                            if (n2 != 5) {
                                n2 = a.leftMargin + paddingLeft;
                                break Label_0313;
                            }
                            n4 = n3 - paddingRight - measuredWidth;
                            n2 = a.rightMargin;
                        }
                        else {
                            n4 = (n3 - paddingLeft - paddingRight2 - measuredWidth) / 2 + paddingLeft + a.leftMargin;
                            n2 = a.rightMargin;
                        }
                        n2 = n4 - n2;
                    }
                    int n5 = n;
                    if (this.hasDividerBeforeChildAt(i)) {
                        n5 = n + intrinsicHeight;
                    }
                    n = n5 + a.topMargin;
                    child.layout(n2, n, measuredWidth + n2, measuredHeight + n);
                    n2 = measuredHeight + a.bottomMargin + n;
                }
            }
            ++i;
            n = n2;
        }
    }
    
    @Override
    public final void onMeasure(final int n, final int n2) {
        final int childCount = this.getChildCount();
        View view = null;
        final boolean b = false;
        View view3;
        View view2 = view3 = null;
    Label_0603:
        while (true) {
            for (int i = 0; i < childCount; ++i) {
                final View child = this.getChildAt(i);
                if (child.getVisibility() != 8) {
                    final int id = child.getId();
                    if (id == 2131431826) {
                        view = child;
                    }
                    else {
                        if (id != 2131428033) {
                            if (id != 2131428463) {
                                final int n3 = b ? 1 : 0;
                                if (id != 2131428606) {
                                    break Label_0603;
                                }
                            }
                            if (view3 == null) {
                                view3 = child;
                                continue;
                            }
                            final int n3 = b ? 1 : 0;
                            if (n3 == 0) {
                                super.onMeasure(n, n2);
                            }
                            return;
                        }
                        view2 = child;
                    }
                }
            }
            final int mode = View$MeasureSpec.getMode(n2);
            final int size = View$MeasureSpec.getSize(n2);
            final int mode2 = View$MeasureSpec.getMode(n);
            int n4 = ((View)this).getPaddingBottom() + ((View)this).getPaddingTop();
            int n5;
            if (view != null) {
                view.measure(n, 0);
                n4 += view.getMeasuredHeight();
                n5 = View.combineMeasuredStates(0, view.getMeasuredState());
            }
            else {
                n5 = 0;
            }
            int d;
            int n6;
            if (view2 != null) {
                view2.measure(n, 0);
                d = d(view2);
                n6 = view2.getMeasuredHeight() - d;
                n4 += d;
                n5 = View.combineMeasuredStates(n5, view2.getMeasuredState());
            }
            else {
                d = (n6 = 0);
            }
            int measuredHeight;
            if (view3 != null) {
                int measureSpec;
                if (mode == 0) {
                    measureSpec = 0;
                }
                else {
                    measureSpec = View$MeasureSpec.makeMeasureSpec(Math.max(0, size - n4), mode);
                }
                view3.measure(n, measureSpec);
                measuredHeight = view3.getMeasuredHeight();
                n4 += measuredHeight;
                n5 = View.combineMeasuredStates(n5, view3.getMeasuredState());
            }
            else {
                measuredHeight = 0;
            }
            final int n7 = size - n4;
            int n8 = n5;
            int n9 = n7;
            int n10 = n4;
            if (view2 != null) {
                final int min = Math.min(n7, n6);
                int n11 = n7;
                int n12 = d;
                if (min > 0) {
                    n11 = n7 - min;
                    n12 = d + min;
                }
                view2.measure(n, View$MeasureSpec.makeMeasureSpec(n12, 1073741824));
                n10 = n4 - d + view2.getMeasuredHeight();
                final int combineMeasuredStates = View.combineMeasuredStates(n5, view2.getMeasuredState());
                n9 = n11;
                n8 = combineMeasuredStates;
            }
            int combineMeasuredStates2 = n8;
            int n13 = n10;
            if (view3 != null) {
                combineMeasuredStates2 = n8;
                n13 = n10;
                if (n9 > 0) {
                    view3.measure(n, View$MeasureSpec.makeMeasureSpec(measuredHeight + n9, mode));
                    n13 = n10 - measuredHeight + view3.getMeasuredHeight();
                    combineMeasuredStates2 = View.combineMeasuredStates(n8, view3.getMeasuredState());
                }
            }
            int j = 0;
            int n14 = 0;
            while (j < childCount) {
                final View child2 = this.getChildAt(j);
                int max = n14;
                if (child2.getVisibility() != 8) {
                    max = Math.max(n14, child2.getMeasuredWidth());
                }
                ++j;
                n14 = max;
            }
            ((View)this).setMeasuredDimension(View.resolveSizeAndState(((View)this).getPaddingRight() + ((View)this).getPaddingLeft() + n14, n, combineMeasuredStates2), View.resolveSizeAndState(n13, n2, 0));
            if (mode2 != 1073741824) {
                this.forceUniformWidth(childCount, n2);
            }
            final int n3 = 1;
            continue Label_0603;
        }
    }
}
