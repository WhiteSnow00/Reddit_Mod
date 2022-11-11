// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.Canvas;
import android.content.res.TypedArray;
import com.bytedance.covode.number.Covode;
import android.graphics.drawable.Drawable;
import android.view.View;

public final class 1id extends 1JC<View>
{
    public Drawable LIZ;
    public Drawable LIZIZ;
    public Drawable LIZJ;
    
    static {
        Covode.recordClassIndex(6114);
    }
    
    public 1id(final View view) {
        super(view);
    }
    
    @Override
    public final void LIZ(final TypedArray typedArray) {
        for (int indexCount = typedArray.getIndexCount(), i = 0; i < indexCount; ++i) {
            final int index = typedArray.getIndex(i);
            if (index == 2) {
                this.LIZ(this.LIZ = typedArray.getDrawable(index));
            }
            else if (index == 0) {
                this.LIZ(this.LIZIZ = typedArray.getDrawable(index));
            }
            else if (index == 1) {
                this.LIZ(this.LIZJ = typedArray.getDrawable(index));
            }
        }
        super.LIZLLL.invalidate();
    }
    
    public final void LIZ(final Drawable drawable) {
        if (drawable != null) {
            drawable.setBounds(0, 0, super.LIZLLL.getWidth(), super.LIZLLL.getHeight());
        }
    }
    
    public final boolean LIZ(final Canvas canvas) {
        Drawable drawable;
        if (!super.LIZLLL.isEnabled()) {
            drawable = this.LIZIZ;
        }
        else if (super.LIZLLL.isPressed()) {
            drawable = this.LIZ;
        }
        else {
            drawable = this.LIZJ;
        }
        if (drawable != null) {
            drawable.draw(canvas);
            return true;
        }
        return false;
    }
    
    @Override
    public final int[] LIZ() {
        return new int[] { 2130969458, 2130970583, 2130970752 };
    }
    
    public final void LIZIZ(final Drawable lizj) {
        this.LIZ(this.LIZJ = lizj);
        super.LIZLLL.invalidate();
    }
    
    public final void LIZJ(final Drawable liz) {
        this.LIZ(this.LIZ = liz);
        super.LIZLLL.invalidate();
    }
    
    public final void LIZLLL(final Drawable liziz) {
        this.LIZ(this.LIZIZ = liziz);
        super.LIZLLL.invalidate();
    }
}
