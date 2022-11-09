// 
// Decompiled by Procyon v0.6.0
// 

package zf;

import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.Filterable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ListAdapter;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.view.View$MeasureSpec;
import java.util.Locale;
import android.os.Build;
import android.view.ViewParent;
import com.google.android.material.textfield.TextInputLayout;
import android.content.res.TypedArray;
import android.text.method.KeyListener;
import qf.g;
import pj2.u;
import ag.a;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Rect;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.widget.i0;
import androidx.appcompat.widget.d;

public final class n extends d
{
    public final i0 j;
    public final AccessibilityManager k;
    public final Rect l;
    
    public n(final Context context, final AttributeSet set) {
        super(a.a(context, set, 2130968664, 0), set, 0);
        this.l = new Rect();
        final Context context2 = ((View)this).getContext();
        final TypedArray d = qf.g.d(context2, set, u.C, 2130968664, 2132018001, new int[0]);
        if (d.hasValue(0) && d.getInt(0, 0) == 0) {
            this.setKeyListener(null);
        }
        this.k = (AccessibilityManager)context2.getSystemService("accessibility");
        final i0 j = new i0(context2, null, 2130969348, 0);
        this.j = j;
        j.C = true;
        j.D.setFocusable(true);
        j.t = (View)this;
        j.D.setInputMethodMode(2);
        j.n(this.getAdapter());
        j.u = (AdapterView$OnItemClickListener)new m(this);
        d.recycle();
    }
    
    public static void a(final n n, final Object o) {
        n.setText(n.convertSelectionToString(o), false);
    }
    
    public final TextInputLayout b() {
        for (ViewParent viewParent = ((View)this).getParent(); viewParent != null; viewParent = viewParent.getParent()) {
            if (viewParent instanceof TextInputLayout) {
                return (TextInputLayout)viewParent;
            }
        }
        return null;
    }
    
    public CharSequence getHint() {
        final TextInputLayout b = this.b();
        if (b != null && b.F) {
            return b.getHint();
        }
        return super.getHint();
    }
    
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        final TextInputLayout b = this.b();
        if (b != null && b.F && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            ((TextView)this).setHint((CharSequence)"");
        }
    }
    
    public final void onMeasure(final int n, int n2) {
        super.onMeasure(n, n2);
        if (View$MeasureSpec.getMode(n) == Integer.MIN_VALUE) {
            final int measuredWidth = ((View)this).getMeasuredWidth();
            final ListAdapter adapter = this.getAdapter();
            final TextInputLayout b = this.b();
            final int n3 = 0;
            int n4 = 0;
            n2 = n3;
            if (adapter != null) {
                if (b == null) {
                    n2 = n3;
                }
                else {
                    final int measureSpec = View$MeasureSpec.makeMeasureSpec(((View)this).getMeasuredWidth(), 0);
                    final int measureSpec2 = View$MeasureSpec.makeMeasureSpec(((View)this).getMeasuredHeight(), 0);
                    final i0 j = this.j;
                    if (!j.a()) {
                        n2 = -1;
                    }
                    else {
                        n2 = ((AdapterView)j.h).getSelectedItemPosition();
                    }
                    n2 = Math.max(0, n2);
                    final int min = Math.min(((Adapter)adapter).getCount(), n2 + 15);
                    int i = Math.max(0, min - 15);
                    View view = null;
                    n2 = 0;
                    while (i < min) {
                        final int itemViewType = ((Adapter)adapter).getItemViewType(i);
                        int n5;
                        if (itemViewType != (n5 = n4)) {
                            view = null;
                            n5 = itemViewType;
                        }
                        view = ((Adapter)adapter).getView(i, view, (ViewGroup)b);
                        if (view.getLayoutParams() == null) {
                            view.setLayoutParams(new ViewGroup$LayoutParams(-2, -2));
                        }
                        view.measure(measureSpec, measureSpec2);
                        n2 = Math.max(n2, view.getMeasuredWidth());
                        ++i;
                        n4 = n5;
                    }
                    final Drawable b2 = this.j.b();
                    int n6 = n2;
                    if (b2 != null) {
                        b2.getPadding(this.l);
                        final Rect l = this.l;
                        n6 = n2 + (l.left + l.right);
                    }
                    n2 = ((View)b.getEndIconView()).getMeasuredWidth() + n6;
                }
            }
            ((View)this).setMeasuredDimension(Math.min(Math.max(measuredWidth, n2), View$MeasureSpec.getSize(n)), ((View)this).getMeasuredHeight());
        }
    }
    
    public <T extends ListAdapter & Filterable> void setAdapter(final T adapter) {
        super.setAdapter((ListAdapter)adapter);
        this.j.n(this.getAdapter());
    }
    
    public final void showDropDown() {
        if (((TextView)this).getInputType() == 0) {
            final AccessibilityManager k = this.k;
            if (k != null && k.isTouchExplorationEnabled()) {
                this.j.show();
                return;
            }
        }
        super.showDropDown();
    }
}
