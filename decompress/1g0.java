// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.util.AndroidRuntimeException;
import android.os.Looper;
import com.bytedance.covode.number.Covode;

public final class 1g0 extends 14x<1g0>
{
    public 09C LJIJ;
    public float LJIJI;
    public boolean LJIJJ;
    
    static {
        Covode.recordClassIndex(972);
    }
    
    public <K> 1g0(final K k, final 09B<K> 09B) {
        super(k, 09B);
        this.LJIJI = Float.MAX_VALUE;
    }
    
    public <K> 1g0(final K k, final 09B<K> 09B, final float n) {
        super(k, 09B);
        this.LJIJI = Float.MAX_VALUE;
        this.LJIJ = new 09C(n);
    }
    
    @Override
    public final void LIZ() {
        final 09C ljij = this.LJIJ;
        if (ljij == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        final double n = (float)ljij.LJ;
        if (n > super.LJIILJJIL) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (n >= super.LJIILL) {
            final 09C ljij2 = this.LJIJ;
            ljij2.LIZJ = Math.abs((double)(super.LJIILLIIL * 0.75f));
            ljij2.LIZLLL = ljij2.LIZJ * 62.5;
            super.LIZ();
            return;
        }
        throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
    }
    
    @Override
    public final boolean LIZIZ(long n) {
        if (this.LJIJJ) {
            final float ljiji = this.LJIJI;
            if (ljiji != Float.MAX_VALUE) {
                this.LJIJ.LJ = ljiji;
                this.LJIJI = Float.MAX_VALUE;
            }
            super.LJIIIZ = (float)this.LJIJ.LJ;
            super.LJIIIIZZ = 0.0f;
            this.LJIJJ = false;
            return true;
        }
        if (this.LJIJI != Float.MAX_VALUE) {
            final 09C ljij = this.LJIJ;
            final double n2 = super.LJIIIZ;
            final double n3 = super.LJIIIIZZ;
            n /= 2L;
            final a liz = ljij.LIZ(n2, n3, n);
            this.LJIJ.LJ = this.LJIJI;
            this.LJIJI = Float.MAX_VALUE;
            final a liz2 = this.LJIJ.LIZ(liz.LIZ, liz.LIZIZ, n);
            super.LJIIIZ = liz2.LIZ;
            super.LJIIIIZZ = liz2.LIZIZ;
        }
        else {
            final a liz3 = this.LJIJ.LIZ(super.LJIIIZ, super.LJIIIIZZ, n);
            super.LJIIIZ = liz3.LIZ;
            super.LJIIIIZZ = liz3.LIZIZ;
        }
        super.LJIIIZ = Math.max(super.LJIIIZ, super.LJIILL);
        super.LJIIIZ = Math.min(super.LJIIIZ, super.LJIILJJIL);
        final float ljiiiz = super.LJIIIZ;
        final float ljiiiizz = super.LJIIIIZZ;
        final 09C ljij2 = this.LJIJ;
        if (Math.abs(ljiiiizz) < ljij2.LIZLLL && Math.abs(ljiiiz - (float)ljij2.LJ) < ljij2.LIZJ) {
            super.LJIIIZ = (float)this.LJIJ.LJ;
            super.LJIIIIZZ = 0.0f;
            return true;
        }
        return false;
    }
    
    public final void LIZJ() {
        if (this.LJIJ.LIZIZ <= 0.0) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (super.LJIILIIL) {
                this.LJIJJ = true;
            }
            return;
        }
        throw new AndroidRuntimeException("Animations may only be started on the main thread");
    }
}
