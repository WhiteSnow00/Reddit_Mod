// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.widget;

import android.view.View;
import android.util.AttributeSet;
import android.content.Context;

public class Group extends a
{
    public Group(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public final void b(final AttributeSet set) {
        super.b(set);
    }
    
    public final void c() {
        final ConstraintLayout$a constraintLayout$a = (ConstraintLayout$a)((View)this).getLayoutParams();
        constraintLayout$a.k0.w(0);
        constraintLayout$a.k0.s(0);
    }
    
    public final void d(final ConstraintLayout constraintLayout) {
        final int visibility = ((View)this).getVisibility();
        final float elevation = ((View)this).getElevation();
        for (int i = 0; i < super.g; ++i) {
            final View viewById = constraintLayout.getViewById(super.f[i]);
            if (viewById != null) {
                viewById.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewById.setElevation(elevation);
                }
            }
        }
    }
}
