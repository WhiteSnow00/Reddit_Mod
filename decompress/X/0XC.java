// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class 0xc
{
    @c(LIZ = "type")
    public int LIZ;
    @c(LIZ = "account")
    public long LIZIZ;
    @c(LIZ = "alpha")
    public int LIZJ;
    @c(LIZ = "w")
    public double LIZLLL;
    @c(LIZ = "h")
    public double LJ;
    @c(LIZ = "x")
    public double LJFF;
    @c(LIZ = "y")
    public double LJI;
    @c(LIZ = "zorder")
    public int LJII;
    @c(LIZ = "stat")
    public int LJIIIIZZ;
    @c(LIZ = "uid")
    public String LJIIIZ;
    @c(LIZ = "uid_str")
    public String LJIIJ;
    @c(LIZ = "talk_volume")
    public int LJIIJJI;
    @c(LIZ = "mute_audio")
    public int LJIIL;
    @c(LIZ = "p")
    public int LJIILIIL;
    @c(LIZ = "mute_a")
    public boolean LJIILJJIL;
    @c(LIZ = "mute_v")
    public boolean LJIILL;
    
    static {
        Covode.recordClassIndex(10313);
    }
    
    public final String LIZ() {
        if (TextUtils.isEmpty((CharSequence)this.LJIIJ)) {
            return this.LJIIIZ;
        }
        return this.LJIIJ;
    }
    
    public final boolean LIZ(final 0xc 0xc) {
        return 0xc != null && (this.LJ == 0xc.LJ && this.LIZLLL == 0xc.LIZLLL && this.LJIILIIL == 0xc.LJIILIIL && this.LJFF == 0xc.LJFF && this.LJI == 0xc.LJI);
    }
}
