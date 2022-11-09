// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.Canvas;
import android.content.res.TypedArray;
import com.bytedance.covode.number.Covode;
import android.view.View;

public final class 1ic extends 1JC<View> implements 0fa, a
{
    public final 1JB LIZ;
    
    static {
        Covode.recordClassIndex(6112);
    }
    
    public 1ic(final View view) {
        super(view);
        this.LIZ = new 1JB((1JB.a)this);
    }
    
    public final void LIZ(final int n) {
        this.LIZLLL(n);
    }
    
    @Override
    public final void LIZ(final TypedArray typedArray) {
        this.LIZ.LIZ(super.LIZLLL.getContext(), typedArray);
    }
    
    public final void LIZ(final Canvas canvas, final boolean b) {
        this.LIZ.LIZ(canvas, b);
    }
    
    public final boolean LIZ(final Canvas canvas) {
        return this.LIZ.LIZ(canvas);
    }
    
    @Override
    public final int[] LIZ() {
        return new int[] { 2130969040, 2130969457, 2130970751 };
    }
    
    @Override
    public final void LIZIZ() {
        super.LIZLLL.invalidate();
    }
    
    @Override
    public final boolean LIZJ() {
        return super.LIZLLL.isEnabled();
    }
    
    @Override
    public final boolean LIZLLL() {
        return super.LIZLLL.isPressed();
    }
    
    @Override
    public final int LJ() {
        return super.LIZLLL.getWidth();
    }
    
    @Override
    public final int LJFF() {
        return super.LIZLLL.getHeight();
    }
}
