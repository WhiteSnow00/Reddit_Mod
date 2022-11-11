// 
// Decompiled by Procyon v0.6.0
// 

package X;

import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup$LayoutParams;
import java.util.ArrayList;
import com.bytedance.covode.number.Covode;
import android.view.View;
import java.util.List;

public final class 0Ey
{
    public final b LIZ;
    public final a LIZIZ;
    public final List<View> LIZJ;
    
    static {
        Covode.recordClassIndex(1600);
    }
    
    public 0Ey(final b liz) {
        this.LIZ = liz;
        this.LIZIZ = new a();
        this.LIZJ = new ArrayList<View>();
    }
    
    private int LJ(final int n) {
        if (n < 0) {
            return -1;
        }
        int n2;
        for (int liz = this.LIZ.LIZ(), i = n; i < liz; i += n2) {
            n2 = n - (i - this.LIZIZ.LJ(i));
            if (n2 == 0) {
                while (this.LIZIZ.LIZJ(i)) {
                    ++i;
                }
                return i;
            }
        }
        return -1;
    }
    
    public final int LIZ() {
        return this.LIZ.LIZ() - this.LIZJ.size();
    }
    
    public final void LIZ(int lj) {
        lj = this.LJ(lj);
        final View liziz = this.LIZ.LIZIZ(lj);
        if (liziz == null) {
            return;
        }
        if (this.LIZIZ.LIZLLL(lj)) {
            this.LIZIZ(liziz);
        }
        this.LIZ.LIZ(lj);
    }
    
    public final void LIZ(final View view) {
        this.LIZJ.add(view);
        this.LIZ.LIZJ(view);
    }
    
    public final void LIZ(final View view, int n, final ViewGroup$LayoutParams viewGroup$LayoutParams, final boolean b) {
        if (n < 0) {
            n = this.LIZ.LIZ();
        }
        else {
            n = this.LJ(n);
        }
        this.LIZIZ.LIZ(n, b);
        if (b) {
            this.LIZ(view);
        }
        this.LIZ.LIZ(view, n, viewGroup$LayoutParams);
    }
    
    public final void LIZ(final View view, int n, final boolean b) {
        if (n < 0) {
            n = this.LIZ.LIZ();
        }
        else {
            n = this.LJ(n);
        }
        this.LIZIZ.LIZ(n, b);
        if (b) {
            this.LIZ(view);
        }
        this.LIZ.LIZ(view, n);
    }
    
    public final int LIZIZ() {
        return this.LIZ.LIZ();
    }
    
    public final View LIZIZ(int lj) {
        lj = this.LJ(lj);
        return this.LIZ.LIZIZ(lj);
    }
    
    public final boolean LIZIZ(final View view) {
        if (this.LIZJ.remove(view)) {
            this.LIZ.LIZLLL(view);
            return true;
        }
        return false;
    }
    
    public final int LIZJ(final View view) {
        final int liz = this.LIZ.LIZ(view);
        if (liz == -1) {
            return -1;
        }
        if (this.LIZIZ.LIZJ(liz)) {
            return -1;
        }
        return liz - this.LIZIZ.LJ(liz);
    }
    
    public final View LIZJ(final int n) {
        return this.LIZ.LIZIZ(n);
    }
    
    public final void LIZLLL(int lj) {
        lj = this.LJ(lj);
        this.LIZIZ.LIZLLL(lj);
        this.LIZ.LIZJ(lj);
    }
    
    public final boolean LIZLLL(final View view) {
        return this.LIZJ.contains(view);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.LIZIZ.toString());
        sb.append(", hidden list:");
        sb.append(this.LIZJ.size());
        return sb.toString();
    }
    
    public static final class a
    {
        public long LIZ;
        public a LIZIZ;
        
        static {
            Covode.recordClassIndex(1601);
        }
        
        private void LIZ() {
            if (this.LIZIZ == null) {
                this.LIZIZ = new a();
            }
        }
        
        public final void LIZ(int i) {
            a liziz = this;
            while (i >= 64) {
                liziz.LIZ();
                liziz = liziz.LIZIZ;
                i -= 64;
            }
            liziz.LIZ |= 1L << i;
        }
        
        public final void LIZ(int n, final boolean b) {
            a liziz = this;
            a liziz2;
            int n2;
            boolean b2;
            while (true) {
                liziz2 = liziz;
                n2 = n;
                b2 = b;
                if (n < 64) {
                    break;
                }
                liziz.LIZ();
                liziz = liziz.LIZIZ;
                n -= 64;
            }
            while (true) {
                final long liz = liziz2.LIZ;
                boolean b3;
                if ((Long.MIN_VALUE & liz) != 0x0L) {
                    b3 = true;
                }
                else {
                    b3 = false;
                }
                final long n3 = (1L << n2) - 1L;
                liziz2.LIZ = ((liz & ~n3) << 1 | (liz & n3));
                if (b2) {
                    liziz2.LIZ(n2);
                }
                else {
                    liziz2.LIZIZ(n2);
                }
                if (!b3 && liziz2.LIZIZ == null) {
                    break;
                }
                liziz2.LIZ();
                liziz2 = liziz2.LIZIZ;
                n2 = 0;
                b2 = b3;
            }
        }
        
        public final void LIZIZ(int i) {
            a liziz = this;
            while (i >= 64) {
                liziz = liziz.LIZIZ;
                if (liziz == null) {
                    return;
                }
                i -= 64;
            }
            liziz.LIZ &= ~(1L << i);
        }
        
        public final boolean LIZJ(int i) {
            a liziz = this;
            while (i >= 64) {
                liziz.LIZ();
                liziz = liziz.LIZIZ;
                i -= 64;
            }
            return (liziz.LIZ & 1L << i) != 0x0L;
        }
        
        public final boolean LIZLLL(int i) {
            a liziz = this;
            while (i >= 64) {
                liziz.LIZ();
                liziz = liziz.LIZIZ;
                i -= 64;
            }
            final long n = 1L << i;
            final long liz = liziz.LIZ;
            final boolean b = (liz & n) != 0x0L;
            final long liz2 = liz & ~n;
            liziz.LIZ = liz2;
            final long n2 = n - 1L;
            liziz.LIZ = ((liz2 & n2) | Long.rotateRight(~n2 & liz2, 1));
            final a liziz2 = liziz.LIZIZ;
            if (liziz2 != null) {
                if (liziz2.LIZJ(0)) {
                    liziz.LIZ(63);
                }
                liziz.LIZIZ.LIZLLL(0);
            }
            return b;
        }
        
        public final int LJ(final int n) {
            final a liziz = this.LIZIZ;
            if (liziz == null) {
                if (n >= 64) {
                    return Long.bitCount(this.LIZ);
                }
                return Long.bitCount(this.LIZ & (1L << n) - 1L);
            }
            else {
                if (n < 64) {
                    return Long.bitCount(this.LIZ & (1L << n) - 1L);
                }
                return liziz.LJ(n - 64) + Long.bitCount(this.LIZ);
            }
        }
        
        @Override
        public final String toString() {
            if (this.LIZIZ == null) {
                return Long.toBinaryString(this.LIZ);
            }
            final StringBuilder sb = new StringBuilder();
            sb.append(this.LIZIZ.toString());
            sb.append("xx");
            sb.append(Long.toBinaryString(this.LIZ));
            return sb.toString();
        }
    }
    
    public interface b
    {
        default static {
            Covode.recordClassIndex(1602);
        }
        
        int LIZ();
        
        int LIZ(final View p0);
        
        void LIZ(final int p0);
        
        void LIZ(final View p0, final int p1);
        
        void LIZ(final View p0, final int p1, final ViewGroup$LayoutParams p2);
        
        View LIZIZ(final int p0);
        
        RecyclerView.ViewHolder LIZIZ(final View p0);
        
        void LIZIZ();
        
        void LIZJ(final int p0);
        
        void LIZJ(final View p0);
        
        void LIZLLL(final View p0);
    }
}
