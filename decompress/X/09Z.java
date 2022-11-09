// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import android.graphics.Typeface;

public final class 09Z
{
    public final 16M LIZ;
    public final char[] LIZIZ;
    public final a LIZJ;
    public final Typeface LIZLLL;
    
    static {
        Covode.recordClassIndex(1000);
    }
    
    public 09Z() {
        this.LIZJ = new a(1024);
        this.LIZIZ = new char[0];
    }
    
    public 09Z(final Typeface lizlll, final 16M liz) {
        this.LIZLLL = lizlll;
        this.LIZ = liz;
        this.LIZJ = new a(1024);
        this.LIZIZ = new char[liz.LIZIZ() * 2];
        this.LIZ(liz);
    }
    
    private void LIZ(final 16M 16M) {
        for (int liziz = 16M.LIZIZ(), i = 0; i < liziz; ++i) {
            final 09L liziz2 = new 09L(this, i);
            Character.toChars(liziz2.LIZ().LIZ(), this.LIZIZ, i * 2);
            07U.LIZ(liziz2, "emoji metadata cannot be null");
            07U.LIZ(liziz2.LIZ().LJFF() > 0, (Object)"invalid metadata codepoint length");
            a lizj = this.LIZJ;
            final int ljff = liziz2.LIZ().LJFF();
            int n = 0;
            a liz;
            while (true) {
                if ((liz = lizj.LIZ(liziz2.LIZ(n))) == null) {
                    liz = new a();
                    lizj.LIZ.put(liziz2.LIZ(n), (Object)liz);
                }
                if (ljff - 1 <= n) {
                    break;
                }
                ++n;
                lizj = liz;
            }
            liz.LIZIZ = liziz2;
        }
    }
    
    public static final class a
    {
        public final SparseArray<a> LIZ;
        public 09L LIZIZ;
        
        static {
            Covode.recordClassIndex(1001);
        }
        
        public a() {
            this(1);
        }
        
        public a(final int n) {
            this.LIZ = (SparseArray<a>)new SparseArray(n);
        }
        
        public final a LIZ(final int n) {
            final SparseArray<a> liz = this.LIZ;
            if (liz == null) {
                return null;
            }
            return (a)liz.get(n);
        }
    }
}
