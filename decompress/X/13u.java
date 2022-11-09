// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public class 13u extends 05a
{
    static {
        Covode.recordClassIndex(635);
    }
    
    public 13u(final Context context) {
        super(context);
    }
    
    public 13u(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    @Override
    public void init(final AttributeSet set) {
        super.init(set);
        super.mUseViewMeasure = false;
    }
    
    @Override
    public void updatePostLayout(final ConstraintLayout constraintLayout) {
        final ConstraintLayout.a a = (ConstraintLayout.a)this.getLayoutParams();
        a.widget.setWidth(0);
        a.widget.setHeight(0);
    }
    
    @Override
    public void updatePreLayout(final ConstraintLayout constraintLayout) {
        final int visibility = this.getVisibility();
        final float elevation = this.getElevation();
        for (int i = 0; i < super.mCount; ++i) {
            final View viewById = constraintLayout.getViewById(super.mIds[i]);
            if (viewById != null) {
                viewById.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewById.setElevation(elevation);
                }
            }
        }
    }
}
