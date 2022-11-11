// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;
import android.content.res.Resources$NotFoundException;
import android.content.res.TypedArray;
import android.view.View;
import com.bytedance.covode.number.Covode;
import android.widget.CompoundButton;

public final class 1ie extends 1JC<CompoundButton>
{
    static {
        Covode.recordClassIndex(6116);
    }
    
    public 1ie(final CompoundButton compoundButton) {
        super((View)compoundButton);
    }
    
    public final void LIZ(final int n) {
        this.LIZLLL(n);
    }
    
    @Override
    public final void LIZ(final TypedArray typedArray) {
        if (typedArray.getIndexCount() > 0) {
            if (typedArray.hasValue(0)) {
                final int resourceId = typedArray.getResourceId(0, 0);
                if (resourceId != 0) {
                    ((CompoundButton)super.LIZLLL).setButtonDrawable(01s.LIZIZ(((CompoundButton)super.LIZLLL).getContext(), resourceId));
                }
            }
            ((CompoundButton)super.LIZLLL).setButtonDrawable(typedArray.getDrawable(0));
        }
        Label_0155: {
            if (typedArray.hasValue(3)) {
                final int resourceId2 = typedArray.getResourceId(3, 0);
                if (resourceId2 != 0) {
                    try {
                        ((CompoundButton)super.LIZLLL).setButtonDrawable(01s.LIZIZ(((CompoundButton)super.LIZLLL).getContext(), resourceId2));
                        break Label_0155;
                    }
                    catch (final Resources$NotFoundException ex) {}
                }
            }
            if (typedArray.hasValue(0)) {
                final int resourceId3 = typedArray.getResourceId(0, 0);
                if (resourceId3 != 0) {
                    ((CompoundButton)super.LIZLLL).setButtonDrawable(01s.LIZIZ(((CompoundButton)super.LIZLLL).getContext(), resourceId3));
                }
            }
        }
        if (typedArray.hasValue(1)) {
            final int resourceId4 = typedArray.getResourceId(1, 0);
            if (resourceId4 != 0) {
                ColorStateList buttonTintList;
                if ((buttonTintList = 01s.LIZ(((CompoundButton)super.LIZLLL).getContext(), resourceId4)) == null) {
                    buttonTintList = typedArray.getColorStateList(1);
                }
                ((CompoundButton)super.LIZLLL).setButtonTintList(buttonTintList);
            }
        }
        if (typedArray.hasValue(2)) {
            ((CompoundButton)super.LIZLLL).setButtonTintMode(0fo.LIZ(typedArray.getInt(2, -1), null));
        }
    }
    
    @Override
    public final int[] LIZ() {
        return new int[] { 16843015, 2130969194, 2130969195, 2130969942 };
    }
}
