// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.content.res.ColorStateList;
import android.widget.TextView;
import android.graphics.drawable.Drawable;
import android.content.res.TypedArray;
import android.view.View;
import com.bytedance.covode.number.Covode;

public final class 1if extends 1JC<1Ig>
{
    static {
        Covode.recordClassIndex(6117);
    }
    
    public 1if(final 1Ig 1Ig) {
        super((View)1Ig);
    }
    
    @Override
    public final void LIZ(final TypedArray typedArray) {
        for (int indexCount = typedArray.getIndexCount(), i = 0; i < indexCount; ++i) {
            final int index = typedArray.getIndex(i);
            if (index == 7) {
                ((1Ig)super.LIZLLL).post((Runnable)new 0fe(this, typedArray.getInt(index, 0)));
            }
            else if (index == 4) {
                ((1Ig)super.LIZLLL).setIconSize(typedArray.getDimensionPixelSize(index, ((1Ig)super.LIZLLL).getContext().getResources().getDimensionPixelSize(2131165817)));
            }
            else if (index == 6) {
                ((1Ig)super.LIZLLL).setIllustration(typedArray.getResourceId(index, 0));
            }
            else if (index == 3) {
                final int liz = 0eI.LIZ(((1Ig)super.LIZLLL).getContext(), typedArray, index);
                if (liz != -1) {
                    ((1Ig)super.LIZLLL).setIcon(liz);
                }
                else {
                    ((1Ig)super.LIZLLL).setIcon(null);
                }
            }
            else if (index == 5) {
                ((1Ig)super.LIZLLL).setIconTint(0eN.LIZ(((1Ig)super.LIZLLL).getContext(), typedArray, index));
            }
            else if (index == 11) {
                ((1Ig)super.LIZLLL).setTitle(typedArray.getString(index));
            }
            else if (index == 8) {
                ((1Ig)super.LIZLLL).setMessage(typedArray.getString(index));
            }
            else if (index == 1) {
                ((1Ig)super.LIZLLL).setButtonText(typedArray.getString(index));
            }
            else if (index == 0) {
                final int liz2 = 0eI.LIZ(((1Ig)super.LIZLLL).getContext(), typedArray, index);
                if (liz2 != -1) {
                    ((1Ig)super.LIZLLL).setButtonIcon(liz2);
                }
                else {
                    ((1Ig)super.LIZLLL).setButtonIcon(null);
                }
            }
            else if (index == 2) {
                final int resourceId = typedArray.getResourceId(index, 0);
                if (resourceId != 0) {
                    ((1Ig)super.LIZLLL).setButtonStyle(resourceId);
                }
            }
            else if (index == 12) {
                final int resourceId2 = typedArray.getResourceId(index, 0);
                if (resourceId2 != 0) {
                    ((1Ig)super.LIZLLL).setTitleStyle(resourceId2);
                }
            }
            else if (index == 9) {
                final int resourceId3 = typedArray.getResourceId(index, 0);
                if (resourceId3 != 0) {
                    ((1Ig)super.LIZLLL).setMessageStyle(resourceId3);
                }
            }
            else if (index == 13) {
                final TextView textView = (TextView)((1Ig)super.LIZLLL).findViewById(2131373652);
                if (textView != null) {
                    final ColorStateList liz3 = 0eN.LIZ(((1Ig)super.LIZLLL).getContext(), typedArray, index);
                    if (liz3 != null) {
                        textView.setTextColor(liz3);
                    }
                }
            }
            else if (index == 10) {
                final TextView textView2 = (TextView)((1Ig)super.LIZLLL).findViewById(2131373320);
                if (textView2 != null) {
                    final ColorStateList liz4 = 0eN.LIZ(((1Ig)super.LIZLLL).getContext(), typedArray, index);
                    if (liz4 != null) {
                        textView2.setTextColor(liz4);
                    }
                }
            }
        }
    }
    
    @Override
    public final int[] LIZ() {
        return new int[] { 2130969186, 2130969188, 2130969191, 2130969640, 2130969654, 2130969658, 2130969663, 2130969782, 2130970662, 2130970663, 2130970664, 2130971244, 2130971254, 2130971257 };
    }
}
