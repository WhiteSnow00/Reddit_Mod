// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Objects;
import android.graphics.Bitmap;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 1mr extends 1e9
{
    public 1mq LJI;
    public 1mq LJII;
    public 1mq.a LJIIIZ;
    
    static {
        Covode.recordClassIndex(10594);
    }
    
    public 1mr(final Context context, final String s) {
        CTM.LIZ((Object)context, (Object)s);
        super(context, null, s, 0, 0, 0);
    }
    
    private 2A9 LJIIIIZZ() {
        final 2A9 2a9 = new 2A9(super.LIZ, super.LIZIZ, super.LJFF, super.LIZJ, super.LIZLLL, new 1eJ(super.LIZIZ != null, true, false, true, false, false, 0cB.LJI(), 0, super.LJ, super.LJ, 0, 0, 6580, (byte)0));
        1mq lji = this.LJI;
        final 1mq 1mq = null;
        if (lji != null) {
            lji.LIZIZ = this.LJIIIZ;
        }
        else {
            lji = null;
        }
        2a9.LJI = lji;
        final 1mq ljii = this.LJII;
        1mq ljii2 = 1mq;
        if (ljii != null) {
            ljii.LIZIZ = this.LJIIIZ;
            ljii2 = ljii;
        }
        2a9.LJII = ljii2;
        return 2a9;
    }
    
    @Override
    public final 1mq.a LIZ() {
        return this.LJIIIZ;
    }
    
    @Override
    public final void LIZ(final 1mq.a liziz) {
        this.LJIIIZ = liziz;
        final 1mq lji = this.LJI;
        if (lji != null) {
            lji.LIZIZ = liziz;
        }
        final 1mq ljii = this.LJII;
        if (ljii != null) {
            ljii.LIZIZ = liziz;
        }
    }
    
    public final void LIZIZ(final 1mq.a a) {
        final 2A9 ljii = ((0zr<2A9>)this).LJII();
        Objects.requireNonNull(ljii, "null cannot be cast to non-null type com.bytedance.android.live.pin.view.ExchangeableCombineLabel");
        ljii.LIZ(a);
    }
    
    @Override
    public final void LJFF() {
        ((0zr<106>)this).LJII().LJIIIIZZ = -1;
        final 1mq lji = this.LJI;
        if (lji != null) {
            lji.LIZ = 255;
        }
        final 1mq ljii = this.LJII;
        if (ljii != null) {
            ljii.LIZ = 0;
        }
    }
}
