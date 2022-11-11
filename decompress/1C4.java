// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import android.view.Choreographer$FrameCallback;

public final class 1C4 extends 0Ky implements Choreographer$FrameCallback
{
    public static a LJIIJ;
    public float LIZ;
    public float LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public long LJ;
    public int LJFF;
    public float LJI;
    public float LJII;
    public 0Kp LJIIIIZZ;
    public 0KG LJIIIZ;
    
    static {
        Covode.recordClassIndex(2418);
        1C4.LJIIJ = (a)new 1C3();
    }
    
    public 1C4() {
        this.LIZ = 1.0f;
        this.LJI = -2.14748365E9f;
        this.LJII = 2.14748365E9f;
    }
    
    private void LJIIJJI() {
        this.LIZ = -this.LIZ;
    }
    
    private void LJIIL() {
        if (this.isRunning()) {
            this.LIZJ(false);
            1C4.LJIIJ.LIZ((Choreographer$FrameCallback)this);
        }
    }
    
    public final void LIZ(final int n) {
        final float liziz = this.LIZIZ;
        final float n2 = (float)n;
        if (liziz == n2) {
            return;
        }
        this.LIZIZ = 0L4.LIZ(n2, this.LJIIIZ(), this.LJIIJ());
        if (0KM.a.LIZ) {
            this.LJ = 0L;
        }
        else {
            this.LJ = System.nanoTime();
        }
        this.LIZJ();
    }
    
    public final void LIZ(final int n, final int n2) {
        final 0Kp ljiiiizz = this.LJIIIIZZ;
        float ljii;
        if (ljiiiizz == null) {
            ljii = -3.4028235E38f;
        }
        else {
            ljii = ljiiiizz.LJII;
        }
        final 0Kp ljiiiizz2 = this.LJIIIIZZ;
        float ljiiiizz3;
        if (ljiiiizz2 == null) {
            ljiiiizz3 = Float.MAX_VALUE;
        }
        else {
            ljiiiizz3 = ljiiiizz2.LJIIIIZZ;
        }
        final float n3 = (float)n;
        this.LJI = 0L4.LIZ(n3, ljii, ljiiiizz3);
        final float n4 = (float)n2;
        this.LJII = 0L4.LIZ(n4, ljii, ljiiiizz3);
        this.LIZ((int)0L4.LIZ(this.LIZIZ, n3, n4));
    }
    
    public final void LIZ(final 0Kp ljiiiizz) {
        int n;
        if (this.LJIIIIZZ == null) {
            n = 1;
        }
        else {
            n = 0;
        }
        this.LJIIIIZZ = ljiiiizz;
        if (n != 0) {
            this.LIZ((int)Math.max(this.LJI, ljiiiizz.LJII), (int)Math.min(this.LJII, ljiiiizz.LJIIIIZZ));
        }
        else {
            this.LIZ((int)ljiiiizz.LJII, (int)ljiiiizz.LJIIIIZZ);
        }
        this.LIZ((int)this.LIZIZ);
        if (!0KM.a.LIZ) {
            this.LJ = System.nanoTime();
        }
    }
    
    public final void LIZIZ(final int n) {
        this.LIZ(n, (int)this.LJII);
    }
    
    public final void LIZJ(final int n) {
        this.LIZ((int)this.LJI, n);
    }
    
    public final void LIZJ(final boolean b) {
        1C4.LJIIJ.LIZIZ((Choreographer$FrameCallback)this);
        if (b) {
            this.LIZJ = false;
        }
    }
    
    public final float LIZLLL() {
        final 0Kp ljiiiizz = this.LJIIIIZZ;
        if (ljiiiizz == null) {
            return 0.0f;
        }
        return (this.LIZIZ - ljiiiizz.LJII) / (this.LJIIIIZZ.LJIIIIZZ - this.LJIIIIZZ.LJII);
    }
    
    public final void LJ() {
        this.LJIIIIZZ = null;
        this.LJI = -2.14748365E9f;
        this.LJII = 2.14748365E9f;
    }
    
    public final void LJFF() {
        this.LIZJ = true;
        this.LIZ(this.LJIIIIZZ());
        float n;
        if (this.LJIIIIZZ()) {
            n = this.LJIIJ();
        }
        else {
            n = this.LJIIIZ();
        }
        this.LIZ((int)n);
        if (0KM.a.LIZ) {
            this.LJ = 0L;
        }
        else {
            this.LJ = System.nanoTime();
        }
        this.LJFF = 0;
        this.LJIIL();
    }
    
    public final void LJI() {
        this.LIZJ(true);
    }
    
    public final void LJII() {
        this.LIZJ = true;
        this.LJIIL();
        if (0KM.a.LIZ) {
            this.LJ = 0L;
        }
        else {
            this.LJ = System.nanoTime();
        }
        if (this.LJIIIIZZ() && this.LIZIZ == this.LJIIIZ()) {
            this.LIZIZ = this.LJIIJ();
            return;
        }
        if (!this.LJIIIIZZ() && this.LIZIZ == this.LJIIJ()) {
            this.LIZIZ = this.LJIIIZ();
        }
    }
    
    public final boolean LJIIIIZZ() {
        return this.LIZ < 0.0f;
    }
    
    public final float LJIIIZ() {
        final 0Kp ljiiiizz = this.LJIIIIZZ;
        if (ljiiiizz == null) {
            return 0.0f;
        }
        final float lji = this.LJI;
        if (lji == -2.14748365E9f) {
            return ljiiiizz.LJII;
        }
        return lji;
    }
    
    public final float LJIIJ() {
        final 0Kp ljiiiizz = this.LJIIIIZZ;
        if (ljiiiizz == null) {
            return 0.0f;
        }
        final float ljii = this.LJII;
        if (ljii == 2.14748365E9f) {
            return ljiiiizz.LJIIIIZZ;
        }
        return ljii;
    }
    
    public final void cancel() {
        this.LIZIZ();
        this.LIZJ(true);
    }
    
    public final void doFrame(final long n) {
        this.LJIIL();
        if (this.LJIIIIZZ != null && this.isRunning()) {
            long n2;
            long nanoTime;
            if (0KM.a.LIZ) {
                final long lj = this.LJ;
                if (lj == 0L) {
                    n2 = 0L;
                }
                else {
                    n2 = n - lj;
                }
                if (0KM.a.LIZJ) {
                    if (this.LJIIIZ == null) {
                        this.LJIIIZ = new 0KG();
                    }
                    final 0KG ljiiiz = this.LJIIIZ;
                    if (ljiiiz != null) {
                        final float ljiiiz2 = this.LJIIIIZZ.LJIIIZ;
                        Label_0122: {
                            if (ljiiiz.LIZ != ljiiiz2) {
                                ljiiiz.LIZ = ljiiiz2;
                                if (ljiiiz2 >= 24.0f) {
                                    if (!0KM.e.LIZ) {
                                        ljiiiz.LIZJ = 16000000L;
                                        break Label_0122;
                                    }
                                }
                                else if (0KM.e.LIZ) {
                                    ljiiiz.LIZJ = 48000000L;
                                    break Label_0122;
                                }
                                ljiiiz.LIZJ = 32000000L;
                            }
                        }
                        if (ljiiiz.LIZIZ > 0L && n - ljiiiz.LIZIZ < ljiiiz.LIZJ) {
                            return;
                        }
                        ljiiiz.LIZIZ = n;
                    }
                }
                nanoTime = n;
            }
            else {
                nanoTime = System.nanoTime();
                n2 = nanoTime - this.LJ;
            }
            final 0Kp ljiiiizz = this.LJIIIIZZ;
            float n3;
            if (ljiiiizz == null) {
                n3 = Float.MAX_VALUE;
            }
            else {
                n3 = 1.0E9f / ljiiiizz.LJIIIZ / Math.abs(this.LIZ);
            }
            final float n4 = n2 / n3;
            final float liziz = this.LIZIZ;
            float n5 = n4;
            if (this.LJIIIIZZ()) {
                n5 = -n4;
            }
            final float liziz2 = liziz + n5;
            this.LIZIZ = liziz2;
            final float ljiiiz3 = this.LJIIIZ();
            final float ljiij = this.LJIIJ();
            boolean b;
            if (liziz2 >= ljiiiz3 && liziz2 <= ljiij) {
                b = true;
            }
            else {
                b = false;
            }
            this.LIZIZ = 0L4.LIZ(this.LIZIZ, this.LJIIIZ(), this.LJIIJ());
            this.LJ = nanoTime;
            if (0KF.LIZJ) {
                0KF.LIZIZ = n;
            }
            0KF.LIZIZ(null);
            this.LIZJ();
            if (b ^ true) {
                if (this.getRepeatCount() != -1 && this.LJFF >= this.getRepeatCount()) {
                    if (0KM.a.LIZ) {
                        float liziz3;
                        if (this.LIZ < 0.0f) {
                            liziz3 = this.LJIIIZ();
                        }
                        else {
                            liziz3 = this.LJIIJ();
                        }
                        this.LIZIZ = liziz3;
                    }
                    else {
                        this.LIZIZ = this.LJIIJ();
                    }
                    this.LIZJ(true);
                    this.LIZIZ(this.LJIIIIZZ());
                }
                else {
                    this.LIZ();
                    ++this.LJFF;
                    if (this.getRepeatMode() == 2) {
                        this.LIZLLL ^= true;
                        this.LJIIJJI();
                    }
                    else {
                        float liziz4;
                        if (this.LJIIIIZZ()) {
                            liziz4 = this.LJIIJ();
                        }
                        else {
                            liziz4 = this.LJIIIZ();
                        }
                        this.LIZIZ = liziz4;
                    }
                    this.LJ = nanoTime;
                }
            }
            if (this.LJIIIIZZ != null) {
                final float liziz5 = this.LIZIZ;
                if (liziz5 < this.LJI || liziz5 > this.LJII) {
                    final 0LQ liz = 0LQ.LIZJ.LIZ();
                    final IllegalStateException ex = new IllegalStateException(0II.LIZ("Frame must be [%f,%f]. It is %f", new Object[] { this.LJI, this.LJII, this.LIZIZ }));
                    final StringBuilder sb = new StringBuilder("resId=");
                    sb.append(this.LJIIIIZZ.LJIIL);
                    liz.LIZ(ex, sb.toString());
                }
            }
        }
    }
    
    public final float getAnimatedFraction() {
        if (this.LJIIIIZZ == null) {
            return 0.0f;
        }
        float n;
        float n2;
        float n3;
        if (this.LJIIIIZZ()) {
            n = this.LJIIJ() - this.LIZIZ;
            n2 = this.LJIIJ();
            n3 = this.LJIIIZ();
        }
        else {
            n = this.LIZIZ - this.LJIIIZ();
            n2 = this.LJIIJ();
            n3 = this.LJIIIZ();
        }
        return n / (n2 - n3);
    }
    
    public final Object getAnimatedValue() {
        return this.LIZLLL();
    }
    
    public final long getDuration() {
        final 0Kp ljiiiizz = this.LJIIIIZZ;
        if (ljiiiizz == null) {
            return 0L;
        }
        return (long)ljiiiizz.LIZ();
    }
    
    public final boolean isRunning() {
        return this.LIZJ;
    }
    
    public final void setRepeatMode(final int repeatMode) {
        super.setRepeatMode(repeatMode);
        if (repeatMode != 2 && this.LIZLLL) {
            this.LIZLLL = false;
            this.LJIIJJI();
        }
    }
    
    public interface a
    {
        default static {
            Covode.recordClassIndex(2420);
        }
        
        void LIZ(final Choreographer$FrameCallback p0);
        
        void LIZIZ(final Choreographer$FrameCallback p0);
    }
}
