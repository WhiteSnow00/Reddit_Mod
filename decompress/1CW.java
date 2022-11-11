// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.ArrayList;
import java.util.List;
import android.os.Build$VERSION;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.covode.number.Covode;
import android.content.Context;

public class 1CW implements 0OL
{
    public static volatile 1CW LIZ;
    public Context LIZIZ;
    public 1CX LIZJ;
    public 1Cd LIZLLL;
    public 1CZ LJ;
    public 0OM LJFF;
    public 0OG LJI;
    
    static {
        Covode.recordClassIndex(3960);
    }
    
    public 1CW(final Context context) {
        this(context, 0OG.LIZ);
    }
    
    public 1CW(Context liziz, final 0OG 0og) {
        liziz = ((Context)liziz).getApplicationContext();
        if (5WL.LIZIZ) {
            if (liziz == null) {
                liziz = 5WL.LIZ;
            }
        }
        this.LIZIZ = (Context)liziz;
        0OG liz;
        if ((liz = 0og) == null) {
            liz = 0OG.LIZ;
        }
        this.LJI = liz;
        this.LIZJ = new 1CX(this.LIZIZ, this);
        this.LIZLLL = new 1Cd(this.LIZIZ, this);
        this.LJ = new 1CZ(this.LIZIZ, this);
        this.LJFF = new 0OM(this);
    }
    
    public static 1CW LIZ(final Context context) {
        MethodCollector.i(14593);
        if (1CW.LIZ == null) {
            monitorenter(1CW.class);
            try {
                if (1CW.LIZ == null) {
                    1CW.LIZ = new 1CW(context);
                }
                monitorexit(1CW.class);
            }
            finally {
                monitorexit(1CW.class);
                MethodCollector.o(14593);
            }
        }
        final 1CW liz = 1CW.LIZ;
        MethodCollector.o(14593);
        return liz;
    }
    
    public static 1CW LIZ(final Context context, final 0OG 0og) {
        return new 1CW(context, 0og);
    }
    
    @Override
    public final 0OG LIZ() {
        return this.LJI;
    }
    
    @Override
    public final boolean LIZ(final float n) {
        final 0OM ljff = this.LJFF;
        if (ljff.LIZ()) {
            final 0OG.a ljiiiizz = ljff.LIZ.LIZ().LJIIIIZZ;
            if (ljiiiizz == null) {
                return true;
            }
            final float lizj = ljiiiizz.LIZJ;
            final float ljff2 = ljiiiizz.LJFF;
            if (n >= lizj) {
                if (ljff2 > 0.0) {
                    final c ljiil = ljff.LIZ.LJIIL();
                    if (ljiil != null) {
                        return ljiil.LJIILJJIL > ljff2;
                    }
                }
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final 0OL LIZIZ() {
        this.LIZJ.LIZ();
        this.LIZLLL.LIZ();
        this.LJ.LIZ();
        return this;
    }
    
    @Override
    public final boolean LIZJ() {
        final 1CX lizj = this.LIZJ;
        lizj.LIZIZ();
        return lizj.LIZLLL;
    }
    
    @Override
    public final int LIZLLL() {
        final 1CX lizj = this.LIZJ;
        if (lizj.LIZJ == null) {
            return -1;
        }
        if (lizj.LIZJ.isPowerSaveMode()) {
            return 1;
        }
        return 0;
    }
    
    @Override
    public final int LJ() {
        final 1CX lizj = this.LIZJ;
        lizj.LIZIZ();
        return lizj.LJ;
    }
    
    @Override
    public final float LJFF() {
        final 1CX lizj = this.LIZJ;
        lizj.LIZIZ();
        return lizj.LJFF;
    }
    
    @Override
    public final int LJI() {
        final 1Cd lizlll = this.LIZLLL;
        if (Build$VERSION.SDK_INT >= 29 && lizlll.LIZJ != null) {
            return lizlll.LIZJ.getCurrentThermalStatus();
        }
        return -1;
    }
    
    @Override
    public final void LJII() {
        this.LJ.LJFF();
    }
    
    @Override
    public final double LJIIIIZZ() {
        return this.LJ.LIZIZ();
    }
    
    @Override
    public final double LJIIIZ() {
        return this.LJ.LIZJ();
    }
    
    @Override
    public final double LJIIJ() {
        return this.LJ.LIZLLL();
    }
    
    @Override
    public final List<1hI> LJIIJJI() {
        return this.LJ.LJ();
    }
    
    @Override
    public final c LJIIL() {
        return this.LJ.LJII();
    }
    
    @Override
    public final List<a> LJIILIIL() {
        final List<0OW.a> lizj = 0OW.LIZJ();
        if (lizj == null) {
            return null;
        }
        final ArrayList list = new ArrayList();
        for (int size = lizj.size(), i = 0; i < size; ++i) {
            final 0OW.a a = lizj.get(i);
            final a a2 = new a();
            a2.LIZ = a.LIZ;
            a2.LIZIZ = a.LIZIZ;
            a2.LIZJ = a.LIZJ;
            a2.LJ = 0OW.LIZ(i, "/scaling_max_freq");
            a2.LJFF = 0OW.LIZ(i, "/scaling_cur_freq");
            a2.LJI = 0OW.LIZ(i, "/scaling_max_freq");
            if (a2.LJ != -1L && a2.LJI != -1L && a2.LJ == a2.LJI) {
                a2.LIZLLL = true;
            }
            a2.LJII = 0OW.LIZ(i, a2.LJ);
            a2.LJIIIIZZ = 0OW.LIZ(i, a2.LJFF);
            a2.LJIIIZ = 0OW.LIZ(i, a2.LJI);
            list.add(a2);
        }
        return list;
    }
    
    @Override
    public final boolean LJIILJJIL() {
        return this.LJFF.LIZ();
    }
    
    @Override
    public final b LJIILL() {
        final b b = new b();
        String liz;
        if (0OW.LIZ != null) {
            liz = 0OW.LIZ;
        }
        else {
            liz = (0OW.LIZ = 0Ob.LIZ("ro.board.platform", ""));
        }
        b.LIZ = liz;
        b.LIZIZ = this.LIZJ();
        b.LIZJ = this.LJ();
        b.LIZLLL = this.LJI();
        b.LJ = this.LIZLLL();
        b.LJFF = this.LJFF();
        this.LJ.LJI();
        return b;
    }
}
