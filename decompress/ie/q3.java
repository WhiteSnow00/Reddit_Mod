// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import java.util.List;
import java.util.Set;
import com.google.android.gms.internal.measurement.b;
import java.util.Arrays;
import java.util.ArrayList;

public final class q3 extends e6 implements c7
{
    private static final q3 zze;
    private boolean zzA;
    private String zzB;
    private long zzC;
    private int zzD;
    private String zzE;
    private String zzF;
    private boolean zzG;
    private j6 zzH;
    private String zzI;
    private int zzJ;
    private int zzK;
    private int zzL;
    private String zzM;
    private long zzN;
    private long zzO;
    private String zzP;
    private String zzQ;
    private int zzR;
    private String zzS;
    private t3 zzT;
    private h6 zzU;
    private long zzV;
    private long zzW;
    private String zzX;
    private String zzY;
    private int zzZ;
    private boolean zzaa;
    private String zzab;
    private boolean zzac;
    private m3 zzad;
    private String zzae;
    private j6 zzaf;
    private String zzag;
    private int zzf;
    private int zzg;
    private int zzh;
    private j6 zzi;
    private j6 zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private String zzp;
    private String zzq;
    private String zzr;
    private String zzs;
    private int zzt;
    private String zzu;
    private String zzv;
    private String zzw;
    private long zzx;
    private long zzy;
    private String zzz;
    
    static {
        e6.m(q3.class, zze = new q3());
    }
    
    public q3() {
        final k7 i = k7.i;
        this.zzi = (j6)i;
        this.zzj = (j6)i;
        this.zzp = "";
        this.zzq = "";
        this.zzr = "";
        this.zzs = "";
        this.zzu = "";
        this.zzv = "";
        this.zzw = "";
        this.zzz = "";
        this.zzB = "";
        this.zzE = "";
        this.zzF = "";
        this.zzH = (j6)i;
        this.zzI = "";
        this.zzM = "";
        this.zzP = "";
        this.zzQ = "";
        this.zzS = "";
        this.zzU = (h6)f6.i;
        this.zzX = "";
        this.zzY = "";
        this.zzab = "";
        this.zzae = "";
        this.zzaf = (j6)i;
        this.zzag = "";
    }
    
    public static p3 A1() {
        return (p3)q3.zze.n();
    }
    
    public static void K(final q3 q3, final ArrayList list) {
        final h6 zzU = q3.zzU;
        if (!((f5)zzU).f) {
            final f6 f6 = (f6)zzU;
            final int h = f6.h;
            int n;
            if (h == 0) {
                n = 10;
            }
            else {
                n = h + h;
            }
            if (n < h) {
                throw new IllegalArgumentException();
            }
            q3.zzU = (h6)new f6(Arrays.copyOf(f6.g, n), f6.h);
        }
        b.g((Iterable)list, (j6)q3.zzU);
    }
    
    public static void h0(final q3 q3) {
        q3.zzH = (j6)k7.i;
    }
    
    public static void u0(final q3 q3) {
        q3.zzi = (j6)k7.i;
    }
    
    public final String A() {
        return this.zzz;
    }
    
    public final String B() {
        return this.zzae;
    }
    
    public final String C() {
        return this.zzs;
    }
    
    public final z3 C1(final int n) {
        return ((List<z3>)this.zzj).get(n);
    }
    
    public final j6 D() {
        return this.zzH;
    }
    
    public final String D1() {
        return this.zzS;
    }
    
    public final j6 E() {
        return this.zzi;
    }
    
    public final String E1() {
        return this.zzv;
    }
    
    public final j6 F() {
        return this.zzj;
    }
    
    public final String F1() {
        return this.zzB;
    }
    
    public final String G1() {
        return this.zzu;
    }
    
    public final int Q() {
        return this.zzJ;
    }
    
    public final int Q0() {
        return this.zzD;
    }
    
    public final void R0() {
        final j6 zzi = this.zzi;
        if (!zzi.s()) {
            this.zzi = e6.k(zzi);
        }
    }
    
    public final void S0() {
        final j6 zzj = this.zzj;
        if (!zzj.s()) {
            this.zzj = e6.k(zzj);
        }
    }
    
    public final boolean T0() {
        return (this.zzf & 0x20000000) != 0x0;
    }
    
    public final boolean U0() {
        return (this.zzg & 0x80) != 0x0;
    }
    
    public final boolean V0() {
        return (this.zzf & 0x80000) != 0x0;
    }
    
    public final boolean W0() {
        return (this.zzg & 0x10) != 0x0;
    }
    
    public final boolean X0() {
        return (this.zzf & 0x8) != 0x0;
    }
    
    public final boolean Y0() {
        return (this.zzf & 0x4000) != 0x0;
    }
    
    public final boolean Z0() {
        return (this.zzf & 0x20000) != 0x0;
    }
    
    public final boolean a1() {
        return (this.zzf & 0x20) != 0x0;
    }
    
    public final boolean b1() {
        return (this.zzf & 0x10) != 0x0;
    }
    
    public final boolean c1() {
        return (this.zzf & 0x1) != 0x0;
    }
    
    public final boolean d1() {
        return (this.zzg & 0x2) != 0x0;
    }
    
    public final boolean e1() {
        return (this.zzf & 0x800000) != 0x0;
    }
    
    public final boolean f1() {
        return (this.zzg & 0x2000) != 0x0;
    }
    
    public final boolean g1() {
        return (this.zzf & 0x4) != 0x0;
    }
    
    public final boolean h1() {
        return (this.zzf & 0x400) != 0x0;
    }
    
    public final boolean i1() {
        return (this.zzf & 0x2) != 0x0;
    }
    
    public final boolean j1() {
        return (this.zzf & 0x8000) != 0x0;
    }
    
    public final int k1() {
        return ((List)this.zzi).size();
    }
    
    public final int l1() {
        return this.zzh;
    }
    
    public final int m1() {
        return this.zzR;
    }
    
    public final boolean n0() {
        return this.zzA;
    }
    
    public final int n1() {
        return this.zzt;
    }
    
    public final boolean o0() {
        return this.zzG;
    }
    
    public final int o1() {
        return ((List)this.zzj).size();
    }
    
    public final boolean p0() {
        return (this.zzf & 0x2000000) != 0x0;
    }
    
    public final long p1() {
        return this.zzN;
    }
    
    @Override
    public final Object q(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new l7((e6)q3.zze, "\u00014\u0000\u0002\u0001A4\u0000\u0005\u0000\u0001\u1004\u0000\u0002\u001b\u0003\u001b\u0004\u1002\u0001\u0005\u1002\u0002\u0006\u1002\u0003\u0007\u1002\u0005\b\u1008\u0006\t\u1008\u0007\n\u1008\b\u000b\u1008\t\f\u1004\n\r\u1008\u000b\u000e\u1008\f\u0010\u1008\r\u0011\u1002\u000e\u0012\u1002\u000f\u0013\u1008\u0010\u0014\u1007\u0011\u0015\u1008\u0012\u0016\u1002\u0013\u0017\u1004\u0014\u0018\u1008\u0015\u0019\u1008\u0016\u001a\u1002\u0004\u001c\u1007\u0017\u001d\u001b\u001e\u1008\u0018\u001f\u1004\u0019 \u1004\u001a!\u1004\u001b\"\u1008\u001c#\u1002\u001d$\u1002\u001e%\u1008\u001f&\u1008 '\u1004!)\u1008\",\u1009#-\u001d.\u1002$/\u1002%2\u1008&4\u1008'5\u100c(7\u1007)9\u1008*:\u1007+;\u1009,?\u1008-@\u001aA\u1008.", new Object[] { "zzf", "zzg", "zzh", "zzi", g3.class, "zzj", z3.class, "zzk", "zzl", "zzm", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzn", "zzG", "zzH", c3.class, "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", "zzY", "zzZ", y2.a, "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", "zzag" });
        }
        if (n == 3) {
            return new q3();
        }
        if (n == 4) {
            return new p3(0);
        }
        if (n != 5) {
            return null;
        }
        return q3.zze;
    }
    
    public final boolean q0() {
        return (this.zzf & 0x100000) != 0x0;
    }
    
    public final long q1() {
        return this.zzC;
    }
    
    public final String r() {
        return this.zzw;
    }
    
    public final long r1() {
        return this.zzV;
    }
    
    public final String s() {
        return this.zzY;
    }
    
    public final long s1() {
        return this.zzm;
    }
    
    public final String t() {
        return this.zzr;
    }
    
    public final long t1() {
        return this.zzx;
    }
    
    public final String u() {
        return this.zzP;
    }
    
    public final long u1() {
        return this.zzo;
    }
    
    public final String v() {
        return this.zzI;
    }
    
    public final long v1() {
        return this.zzn;
    }
    
    public final String w() {
        return this.zzF;
    }
    
    public final long w1() {
        return this.zzl;
    }
    
    public final String x() {
        return this.zzE;
    }
    
    public final long x1() {
        return this.zzk;
    }
    
    public final String y() {
        return this.zzq;
    }
    
    public final long y1() {
        return this.zzy;
    }
    
    public final String z() {
        return this.zzp;
    }
    
    public final g3 z1(final int n) {
        return ((List<g3>)this.zzi).get(n);
    }
}
