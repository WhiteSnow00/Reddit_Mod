// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.ArrayList;
import java.util.List;
import com.bytedance.covode.number.Covode;

public interface 0OL
{
    default static {
        Covode.recordClassIndex(3956);
    }
    
    0OG LIZ();
    
    boolean LIZ(final float p0);
    
    0OL LIZIZ();
    
    boolean LIZJ();
    
    int LIZLLL();
    
    int LJ();
    
    float LJFF();
    
    int LJI();
    
    void LJII();
    
    double LJIIIIZZ();
    
    double LJIIIZ();
    
    double LJIIJ();
    
    List<1hI> LJIIJJI();
    
    c LJIIL();
    
    List<a> LJIILIIL();
    
    boolean LJIILJJIL();
    
    b LJIILL();
    
    public static final class a
    {
        public String LIZ;
        public List<Integer> LIZIZ;
        public List<Long> LIZJ;
        public boolean LIZLLL;
        public long LJ;
        public long LJFF;
        public long LJI;
        public int LJII;
        public int LJIIIIZZ;
        public int LJIIIZ;
        
        static {
            Covode.recordClassIndex(3957);
        }
        
        public a() {
            this.LIZIZ = new ArrayList<Integer>();
            this.LIZJ = new ArrayList<Long>();
            this.LIZLLL = false;
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder("CpuClusterFreqInfo{name='");
            sb.append(this.LIZ);
            sb.append('\'');
            sb.append(", affectedCpuList=");
            sb.append(this.LIZIZ);
            sb.append(", freqList=");
            sb.append(this.LIZJ);
            sb.append(", isLockFreq=");
            sb.append(this.LIZLLL);
            sb.append(", scalingMinFreq=");
            sb.append(this.LJ);
            sb.append(", scalingCurFreq=");
            sb.append(this.LJFF);
            sb.append(", scalingMaxFreq=");
            sb.append(this.LJI);
            sb.append(", scalingMinFreqLevel=");
            sb.append(this.LJII);
            sb.append(", scalingCurFreqLevel=");
            sb.append(this.LJIIIIZZ);
            sb.append(", scalingMaxFreqLevel=");
            sb.append(this.LJIIIZ);
            sb.append('}');
            return sb.toString();
        }
    }
    
    public static final class b
    {
        public String LIZ;
        public boolean LIZIZ;
        public int LIZJ;
        public int LIZLLL;
        public int LJ;
        public float LJFF;
        
        static {
            Covode.recordClassIndex(3958);
        }
    }
    
    public static final class c
    {
        public float LIZ;
        public float LIZIZ;
        public float LIZJ;
        public float LIZLLL;
        public float LJ;
        public float LJFF;
        public float LJI;
        public float LJII;
        public float LJIIIIZZ;
        public float LJIIIZ;
        public float LJIIJ;
        public float LJIIJJI;
        public float LJIIL;
        public float LJIILIIL;
        public float LJIILJJIL;
        
        static {
            Covode.recordClassIndex(3959);
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder("CpuTimePercent{smallCoreLow=");
            sb.append(this.LIZ);
            sb.append(", smallCoreMidLow=");
            sb.append(this.LIZIZ);
            sb.append(", smallCoreMidHigh=");
            sb.append(this.LIZJ);
            sb.append(", smallCoreHigh=");
            sb.append(this.LIZLLL);
            sb.append(", smallCoreSum=");
            sb.append(this.LJ);
            sb.append(", middleCoreLow=");
            sb.append(this.LJFF);
            sb.append(", middleCoreMidLow=");
            sb.append(this.LJI);
            sb.append(", middleCoreMidHigh=");
            sb.append(this.LJII);
            sb.append(", middleCoreHigh=");
            sb.append(this.LJIIIIZZ);
            sb.append(", middleCoreSum=");
            sb.append(this.LJIIIZ);
            sb.append(", bigCoreLow=");
            sb.append(this.LJIIJ);
            sb.append(", bigCoreMidLow=");
            sb.append(this.LJIIJJI);
            sb.append(", bigCoreMidHigh=");
            sb.append(this.LJIIL);
            sb.append(", bigCoreHigh=");
            sb.append(this.LJIILIIL);
            sb.append(", bigCoreSum=");
            sb.append(this.LJIILJJIL);
            sb.append('}');
            return sb.toString();
        }
    }
}
