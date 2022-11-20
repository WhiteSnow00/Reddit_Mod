// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.view.ViewGroup$LayoutParams;
import java.util.Arrays;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.AttributeSet;
import androidx.constraintlayout.solver.widgets.b;
import android.content.Context;
import android.view.View;

public abstract class a extends View
{
    public int[] f;
    public int g;
    public Context h;
    public b i;
    public String j;
    
    public a(final Context h) {
        super(h);
        this.f = new int[32];
        this.h = h;
        this.b(null);
    }
    
    public a(final Context h, final AttributeSet set) {
        super(h, set);
        this.f = new int[32];
        this.h = h;
        this.b(set);
    }
    
    private void setIds(final String s) {
        if (s == null) {
            return;
        }
        int n = 0;
        while (true) {
            final int index = s.indexOf(44, n);
            if (index == -1) {
                break;
            }
            this.a(s.substring(n, index));
            n = index + 1;
        }
        this.a(s.substring(n));
    }
    
    public final void a(String trim) {
        if (trim == null) {
            return;
        }
        if (this.h == null) {
            return;
        }
        trim = trim.trim();
        int int1;
        try {
            int1 = i3.a.class.getField(trim).getInt(null);
        }
        catch (final Exception ex) {
            int1 = 0;
        }
        int identifier = int1;
        if (int1 == 0) {
            identifier = this.h.getResources().getIdentifier(trim, "id", this.h.getPackageName());
        }
        int intValue;
        if ((intValue = identifier) == 0) {
            intValue = identifier;
            if (this.isInEditMode()) {
                intValue = identifier;
                if (this.getParent() instanceof ConstraintLayout) {
                    final Object designInformation = ((ConstraintLayout)this.getParent()).getDesignInformation(0, trim);
                    intValue = identifier;
                    if (designInformation != null) {
                        intValue = identifier;
                        if (designInformation instanceof Integer) {
                            intValue = (int)designInformation;
                        }
                    }
                }
            }
        }
        if (intValue != 0) {
            this.setTag(intValue, null);
        }
        else {
            final StringBuilder sb = new StringBuilder();
            sb.append("Could not find id of \"");
            sb.append(trim);
            sb.append("\"");
            Log.w("ConstraintHelper", sb.toString());
        }
    }
    
    public void b(final AttributeSet set) {
        if (set != null) {
            final TypedArray obtainStyledAttributes = this.getContext().obtainStyledAttributes(set, ah0.b.u);
            for (int indexCount = obtainStyledAttributes.getIndexCount(), i = 0; i < indexCount; ++i) {
                final int index = obtainStyledAttributes.getIndex(i);
                if (index == 9) {
                    this.setIds(this.j = obtainStyledAttributes.getString(index));
                }
            }
        }
    }
    
    public void c() {
    }
    
    public void d(final ConstraintLayout constraintLayout) {
        if (this.isInEditMode()) {
            this.setIds(this.j);
        }
        final b i = this.i;
        if (i == null) {
            return;
        }
        int j = 0;
        i.j0 = 0;
        while (j < this.g) {
            final View viewById = constraintLayout.getViewById(this.f[j]);
            if (viewById != null) {
                final b k = this.i;
                final ConstraintWidget viewWidget = constraintLayout.getViewWidget(viewById);
                final int j2 = k.j0;
                final ConstraintWidget[] i2 = k.i0;
                if (j2 + 1 > i2.length) {
                    k.i0 = Arrays.copyOf(i2, i2.length * 2);
                }
                final ConstraintWidget[] i3 = k.i0;
                final int j3 = k.j0;
                i3[j3] = viewWidget;
                k.j0 = j3 + 1;
            }
            ++j;
        }
    }
    
    public final void e() {
        if (this.i == null) {
            return;
        }
        final ViewGroup$LayoutParams layoutParams = this.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.a) {
            ((ConstraintLayout.a)layoutParams).k0 = (ConstraintWidget)this.i;
        }
    }
    
    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f, this.g);
    }
    
    public final void onDraw(final Canvas canvas) {
    }
    
    public final void onMeasure(final int n, final int n2) {
        this.setMeasuredDimension(0, 0);
    }
    
    public void setReferencedIds(final int[] array) {
        int i = 0;
        this.g = 0;
        while (i < array.length) {
            this.setTag(array[i], null);
            ++i;
        }
    }
    
    public final void setTag(final int n, final Object o) {
        final int g = this.g;
        final int[] f = this.f;
        if (g + 1 > f.length) {
            this.f = Arrays.copyOf(f, f.length * 2);
        }
        final int[] f2 = this.f;
        final int g2 = this.g;
        f2[g2] = n;
        this.g = g2 + 1;
    }
}
