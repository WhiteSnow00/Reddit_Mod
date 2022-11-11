// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.View;
import android.util.AndroidRuntimeException;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public abstract class 14x<T extends 14x<T>> implements 097.b
{
    public static final d LIZ;
    public static final d LIZIZ;
    public static final d LIZJ;
    public static final d LIZLLL;
    public static final d LJ;
    public static final d LJFF;
    public static final d LJI;
    public static final d LJII;
    public float LJIIIIZZ;
    public float LJIIIZ;
    public boolean LJIIJ;
    public final Object LJIIJJI;
    public final 09B LJIIL;
    public boolean LJIILIIL;
    public float LJIILJJIL;
    public float LJIILL;
    public float LJIILLIIL;
    public final ArrayList<c> LJIIZILJ;
    public long LJIJ;
    public final ArrayList<b> LJIJI;
    
    static {
        Covode.recordClassIndex(958);
        LIZ = (d)new 1fu("translationY");
        LIZIZ = (d)new 1fv("scaleX");
        LIZJ = (d)new 1fw("scaleY");
        LIZLLL = (d)new 1fx("rotation");
        LJ = (d)new 1fy("rotationX");
        LJFF = (d)new 1fz("rotationY");
        LJI = (d)new 1fs("alpha");
        LJII = (d)new 1ft("scrollY");
    }
    
    public <K> 14x(final K ljiijji, final 09B<K> ljiil) {
        this.LJIIIZ = Float.MAX_VALUE;
        this.LJIILJJIL = Float.MAX_VALUE;
        this.LJIILL = -Float.MAX_VALUE;
        this.LJIJI = new ArrayList<b>();
        this.LJIIZILJ = new ArrayList<c>();
        this.LJIIJJI = ljiijji;
        this.LJIIL = ljiil;
        if (ljiil == 14x.LIZLLL || ljiil == 14x.LJ || ljiil == 14x.LJFF) {
            this.LJIILLIIL = 0.1f;
            return;
        }
        if (ljiil == 14x.LJI) {
            this.LJIILLIIL = 0.00390625f;
            return;
        }
        if (ljiil == 14x.LIZIZ || ljiil == 14x.LIZJ) {
            this.LJIILLIIL = 0.00390625f;
            return;
        }
        this.LJIILLIIL = 1.0f;
    }
    
    public static <T> void LIZ(final ArrayList<T> list) {
        for (int i = list.size() - 1; i >= 0; --i) {
            if (list.get(i) == null) {
                list.remove(i);
            }
        }
    }
    
    private void LIZIZ(final float n) {
        this.LJIIL.LIZ(this.LJIIJJI, n);
        for (int i = 0; i < this.LJIIZILJ.size(); ++i) {
            if (this.LJIIZILJ.get(i) != null) {
                this.LJIIZILJ.get(i).LIZ();
            }
        }
        LIZ(this.LJIIZILJ);
    }
    
    private void LIZJ() {
        int i = 0;
        this.LJIILIIL = false;
        097.LIZ().LIZ((097.b)this);
        this.LJIJ = 0L;
        this.LJIIJ = false;
        while (i < this.LJIJI.size()) {
            if (this.LJIJI.get(i) != null) {
                this.LJIJI.get(i).LIZ();
            }
            ++i;
        }
        LIZ(this.LJIJI);
    }
    
    public final T LIZ(final float ljiiiz) {
        this.LJIIIZ = ljiiiz;
        this.LJIIJ = true;
        return (T)this;
    }
    
    public final T LIZ(final b b) {
        if (!this.LJIJI.contains(b)) {
            this.LJIJI.add(b);
        }
        return (T)this;
    }
    
    public void LIZ() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (!this.LJIILIIL) {
                this.LJIILIIL = true;
                if (!this.LJIIJ) {
                    this.LJIIIZ = this.LJIIL.LIZ(this.LJIIJJI);
                }
                final float ljiiiz = this.LJIIIZ;
                if (ljiiiz > this.LJIILJJIL || ljiiiz < this.LJIILL) {
                    throw new IllegalArgumentException("Starting value need to be in between min value and max value");
                }
                final 097 liz = 097.LIZ();
                if (liz.LIZJ.size() == 0) {
                    liz.LIZIZ().LIZ();
                }
                if (!liz.LIZJ.contains(this)) {
                    liz.LIZJ.add((097.b)this);
                }
            }
            return;
        }
        throw new AndroidRuntimeException("Animations may only be started on the main thread");
    }
    
    @Override
    public final boolean LIZ(final long n) {
        final long ljij = this.LJIJ;
        if (ljij == 0L) {
            this.LJIJ = n;
            this.LIZIZ(this.LJIIIZ);
            return false;
        }
        this.LJIJ = n;
        final boolean liziz = this.LIZIZ(n - ljij);
        final float min = Math.min(this.LJIIIZ, this.LJIILJJIL);
        this.LJIIIZ = min;
        this.LIZIZ(this.LJIIIZ = Math.max(min, this.LJIILL));
        if (liziz) {
            this.LIZJ();
        }
        return liziz;
    }
    
    public final void LIZIZ() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.LJIILIIL) {
                this.LIZJ();
            }
            return;
        }
        throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
    }
    
    public abstract boolean LIZIZ(final long p0);
    
    public static final class a
    {
        public float LIZ;
        public float LIZIZ;
        
        static {
            Covode.recordClassIndex(967);
        }
    }
    
    public interface b
    {
        default static {
            Covode.recordClassIndex(968);
        }
        
        void LIZ();
    }
    
    public interface c
    {
        default static {
            Covode.recordClassIndex(969);
        }
        
        void LIZ();
    }
    
    public abstract static class d extends 09B<View>
    {
        static {
            Covode.recordClassIndex(970);
        }
    }
}
