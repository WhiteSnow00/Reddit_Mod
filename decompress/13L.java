// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.View;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import com.bytedance.covode.number.Covode;

public final class 13l implements 054
{
    static {
        Covode.recordClassIndex(591);
    }
    
    private void LJIIIIZZ(final 053 053) {
        if (!053.LIZ()) {
            053.LIZ(0, 0, 0, 0);
            return;
        }
        final float liz = this.LIZ(053);
        final float lizlll = this.LIZLLL(053);
        final int n = (int)Math.ceil(056.LIZIZ(liz, lizlll, 053.LIZIZ()));
        final int n2 = (int)Math.ceil(056.LIZ(liz, lizlll, 053.LIZIZ()));
        053.LIZ(n, n2, n, n2);
    }
    
    private 055 LJIIIZ(final 053 053) {
        return (055)053.LIZJ();
    }
    
    @Override
    public final float LIZ(final 053 053) {
        return this.LJIIIZ(053).LIZIZ;
    }
    
    @Override
    public final void LIZ(final 053 053, final float liz) {
        final 055 ljiiiz = this.LJIIIZ(053);
        if (liz != ljiiiz.LIZ) {
            ljiiiz.LIZ = liz;
            ljiiiz.LIZ((Rect)null);
            ljiiiz.invalidateSelf();
        }
    }
    
    @Override
    public final void LIZ(final 053 053, final ColorStateList list) {
        final 055 ljiiiz = this.LJIIIZ(053);
        ljiiiz.LIZ(list);
        ljiiiz.invalidateSelf();
    }
    
    @Override
    public final void LIZ(final 053 053, final ColorStateList list, final float n, final float elevation, final float n2) {
        053.LIZ(new 055(list, n));
        final View lizlll = 053.LIZLLL();
        lizlll.setClipToOutline(true);
        lizlll.setElevation(elevation);
        this.LIZIZ(053, n2);
    }
    
    @Override
    public final float LIZIZ(final 053 053) {
        return this.LIZLLL(053) * 2.0f;
    }
    
    @Override
    public final void LIZIZ(final 053 053, final float n) {
        this.LJIIIZ(053).LIZ(n, 053.LIZ(), 053.LIZIZ());
        this.LJIIIIZZ(053);
    }
    
    @Override
    public final float LIZJ(final 053 053) {
        return this.LIZLLL(053) * 2.0f;
    }
    
    @Override
    public final void LIZJ(final 053 053, final float elevation) {
        053.LIZLLL().setElevation(elevation);
    }
    
    @Override
    public final float LIZLLL(final 053 053) {
        return this.LJIIIZ(053).LIZ;
    }
    
    @Override
    public final float LJ(final 053 053) {
        return 053.LIZLLL().getElevation();
    }
    
    @Override
    public final void LJFF(final 053 053) {
        this.LIZIZ(053, this.LIZ(053));
    }
    
    @Override
    public final void LJI(final 053 053) {
        this.LIZIZ(053, this.LIZ(053));
    }
    
    @Override
    public final ColorStateList LJII(final 053 053) {
        return this.LJIIIZ(053).LIZJ;
    }
}
