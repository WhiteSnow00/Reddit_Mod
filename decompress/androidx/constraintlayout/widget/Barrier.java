// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.widget;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import androidx.constraintlayout.solver.widgets.b;

public class Barrier extends a
{
    public int k;
    public int l;
    public b m;
    
    public Barrier(final Context context) {
        super(context);
        super.setVisibility(8);
    }
    
    public Barrier(final Context context, final AttributeSet set) {
        super(context, set);
        super.setVisibility(8);
    }
    
    @Override
    public final void b(final AttributeSet set) {
        super.b(set);
        this.m = new b();
        if (set != null) {
            final TypedArray obtainStyledAttributes = this.getContext().obtainStyledAttributes(set, ah0.b.u);
            for (int indexCount = obtainStyledAttributes.getIndexCount(), i = 0; i < indexCount; ++i) {
                final int index = obtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.setType(obtainStyledAttributes.getInt(index, 0));
                }
                else if (index == 5) {
                    this.m.m0 = obtainStyledAttributes.getBoolean(index, true);
                }
            }
        }
        super.i = this.m;
        this.e();
    }
    
    public int getType() {
        return this.k;
    }
    
    public void setAllowsGoneWidget(final boolean m0) {
        this.m.m0 = m0;
    }
    
    public void setType(int n) {
        this.k = n;
        this.l = n;
        if (1 == this.getResources().getConfiguration().getLayoutDirection()) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (n != 0) {
            n = this.k;
            if (n == 5) {
                this.l = 1;
            }
            else if (n == 6) {
                this.l = 0;
            }
        }
        else {
            n = this.k;
            if (n == 5) {
                this.l = 0;
            }
            else if (n == 6) {
                this.l = 1;
            }
        }
        this.m.k0 = this.l;
    }
}
