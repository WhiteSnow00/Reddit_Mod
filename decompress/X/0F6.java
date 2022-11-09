// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.util.TypedValue;
import com.bytedance.covode.number.Covode;
import android.view.View;
import android.content.Context;

public class 0f6
{
    public Context LIZ;
    public View LIZIZ;
    public View LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public long LJI;
    public int LJII;
    public int LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public CharSequence LJIIJJI;
    public 0f8 LJIIL;
    public 0f7 LJIILIIL;
    public int LJIILJJIL;
    public int LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    
    static {
        Covode.recordClassIndex(6025);
    }
    
    public 0f6(final a<?> a) {
        final Context lizj = a.LIZJ;
        this.LIZ = lizj;
        if (lizj != null) {
            if (!a.LJIIIZ) {
                this.LJI = this.LIZ.getResources().getInteger(2131427415);
            }
            else {
                this.LJI = a.LJIIIIZZ;
            }
            if (!a.LJIIJJI) {
                this.LJII = this.LIZ.getResources().getDimensionPixelSize(2131166294);
            }
            else {
                this.LJII = a.LJIIJ;
            }
            if (!a.LJIILIIL) {
                this.LJIIIIZZ = this.LIZ.getResources().getDimensionPixelSize(2131166296);
            }
            else {
                this.LJIIIIZZ = a.LJIIL;
            }
        }
        this.LIZIZ = a.LIZLLL;
        this.LIZJ = a.LJ;
        this.LIZLLL = a.LJFF;
        this.LJ = a.LJI;
        this.LJFF = a.LJII;
        this.LJIIIZ = a.LJIILLIIL;
        this.LJIIZILJ = a.LJIL;
        this.LJIIJ = a.LJIIZILJ;
        this.LJIIL = a.LJIILJJIL;
        this.LJIILIIL = a.LJIILL;
        this.LJIIJJI = a.LJIJ;
        this.LJIILJJIL = a.LJIJI;
        this.LJIILL = a.LJIJJ;
        this.LJIILLIIL = a.LJIJJLI;
    }
    
    public void LIZ() {
        this.LJIIIZ = false;
    }
    
    public void LIZ(final 0f7 ljiiliil) {
        this.LJIILIIL = ljiiliil;
    }
    
    public void LIZIZ() {
        this.LJIIJ = true;
    }
    
    public void LIZJ() {
        this.LJI = 5000L;
    }
    
    public CharSequence LIZLLL() {
        return this.LJIIJJI;
    }
    
    public 0f7 LJ() {
        return this.LJIILIIL;
    }
    
    public static class a<T extends a<T>>
    {
        public Context LIZJ;
        public View LIZLLL;
        public View LJ;
        public int LJFF;
        public int LJI;
        public int LJII;
        public long LJIIIIZZ;
        public boolean LJIIIZ;
        public int LJIIJ;
        public boolean LJIIJJI;
        public int LJIIL;
        public boolean LJIILIIL;
        public 0f8 LJIILJJIL;
        public 0f7 LJIILL;
        public boolean LJIILLIIL;
        public boolean LJIIZILJ;
        public CharSequence LJIJ;
        public int LJIJI;
        public int LJIJJ;
        public boolean LJIJJLI;
        public boolean LJIL;
        
        static {
            Covode.recordClassIndex(6026);
        }
        
        public a(final View lizlll) {
            this.LJFF = 48;
            this.LJIILLIIL = true;
            this.LIZLLL = lizlll;
            if (lizlll != null) {
                final Context context = lizlll.getContext();
                this.LIZJ = context;
                final TypedValue liz = 0eI.LIZ();
                context.getTheme().resolveAttribute(2130969944, liz, true);
                if (liz.type != 18 || liz.data == 0) {
                    this.LIZJ = 0et.LIZ(this.LIZJ);
                }
                this.LJIJI = 0eI.LIZ(this.LIZJ, 2130971377);
                this.LJIJJ = this.LIZJ.getResources().getDimensionPixelSize(2131166298);
            }
        }
        
        public final T LIZ(final int ljff) {
            this.LJFF = ljff;
            return (T)this;
        }
        
        public final T LIZ(final long ljiiiizz) {
            this.LJIIIIZZ = ljiiiizz;
            this.LJIIIZ = true;
            return (T)this;
        }
        
        public final T LIZ(final 0f7 ljiill) {
            this.LJIILL = ljiill;
            return (T)this;
        }
        
        public final T LIZ(final 0f8 ljiiljjil) {
            this.LJIILJJIL = ljiiljjil;
            return (T)this;
        }
        
        public T LIZ(final View lj) {
            this.LJ = lj;
            return (T)this;
        }
        
        public final T LIZ(final boolean ljiizilj) {
            this.LJIIZILJ = ljiizilj;
            return (T)this;
        }
        
        public final T LIZIZ() {
            this.LJIL = true;
            return (T)this;
        }
        
        public final T LIZIZ(final int lji) {
            this.LJI = lji;
            return (T)this;
        }
        
        public final T LIZJ() {
            this.LJIILLIIL = false;
            return (T)this;
        }
        
        public final T LIZJ(final int ljii) {
            this.LJII = ljii;
            return (T)this;
        }
        
        public final T LIZLLL(final int ljiij) {
            this.LJIIJ = ljiij;
            this.LJIIJJI = true;
            return (T)this;
        }
        
        public final T LJ(final int ljiil) {
            this.LJIIL = ljiil;
            this.LJIILIIL = true;
            return (T)this;
        }
        
        public final T LJFF(final int n) {
            final Context lizj = this.LIZJ;
            if (lizj != null) {
                this.LJIJ = lizj.getResources().getString(n);
            }
            return (T)this;
        }
    }
}
