// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Collection;
import java.util.PriorityQueue;
import java.util.ArrayList;
import android.graphics.Color;
import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.Comparator;

public final class 0BJ
{
    public static final Comparator<a> LJFF;
    public final int[] LIZ;
    public final int[] LIZIZ;
    public final List<0BO.d> LIZJ;
    public final 0BO.b[] LIZLLL;
    public final float[] LJ;
    
    static {
        Covode.recordClassIndex(1171);
        LJFF = new 0BH();
    }
    
    public 0BJ(int[] liz, int i, final 0BO.b[] lizlll) {
        this.LJ = new float[3];
        this.LIZLLL = lizlll;
        final int[] liziz = new int[32768];
        this.LIZIZ = liziz;
        final int n = 0;
        for (int j = 0; j < liz.length; ++j) {
            final int n2 = liz[j];
            final int n3 = LIZIZ(Color.blue(n2), 8, 5) | (LIZIZ(Color.red(n2), 8, 5) << 10 | LIZIZ(Color.green(n2), 8, 5) << 5);
            liziz[liz[j] = n3] = liziz[n3] + 1;
        }
        int n4 = 0;
        int n5 = 0;
        int n6;
        while (true) {
            if (liziz[n4] > 0) {
                08O.LIZ(LIZ(n4), this.LJ);
                if (this.LIZ(this.LJ)) {
                    liziz[n4] = 0;
                }
            }
            n6 = n5;
            if (liziz[n4] > 0) {
                n6 = n5 + 1;
            }
            if (++n4 >= 32768) {
                break;
            }
            n5 = n6;
        }
        liz = new int[n6];
        this.LIZ = liz;
        int n7 = 0;
        int n8 = 0;
        while (true) {
            int n9 = n8;
            if (liziz[n7] > 0) {
                liz[n8] = n7;
                n9 = n8 + 1;
            }
            if (++n7 >= 32768) {
                break;
            }
            n8 = n9;
        }
        if (n6 <= i) {
            this.LIZJ = new ArrayList<0BO.d>();
            int n10;
            for (i = n; i < n6; ++i) {
                n10 = liz[i];
                this.LIZJ.add(new 0BO.d(LIZ(n10), liziz[n10]));
            }
            return;
        }
        final PriorityQueue<a> priorityQueue = new PriorityQueue<a>(i, 0BJ.LJFF);
        priorityQueue.offer(new a(0, this.LIZ.length - 1));
        this.LIZ(priorityQueue, i);
        this.LIZJ = this.LIZ(priorityQueue);
    }
    
    public static int LIZ(final int n) {
        return LIZ(n >> 10 & 0x1F, n >> 5 & 0x1F, n & 0x1F);
    }
    
    public static int LIZ(final int n, final int n2, final int n3) {
        return Color.rgb(LIZIZ(n, 5, 8), LIZIZ(n2, 5, 8), LIZIZ(n3, 5, 8));
    }
    
    private List<0BO.d> LIZ(final Collection<a> collection) {
        final ArrayList list = new ArrayList(collection.size());
        final Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            final 0BO.d lj = ((a)iterator.next()).LJ();
            if (!this.LIZ(lj.LIZ())) {
                list.add(lj);
            }
        }
        return list;
    }
    
    private void LIZ(final PriorityQueue<a> priorityQueue, final int n) {
        while (priorityQueue.size() < n) {
            final a a = priorityQueue.poll();
            if (a == null || !a.LIZIZ()) {
                break;
            }
            if (!a.LIZIZ()) {
                throw new IllegalStateException("Can not split a box with only 1 color");
            }
            final int lizlll = a.LIZLLL();
            final a a2 = a.LIZIZ.new a(lizlll + 1, a.LIZ);
            a.LIZ = lizlll;
            a.LIZJ();
            priorityQueue.offer(a2);
            priorityQueue.offer(a);
        }
    }
    
    public static void LIZ(final int[] array, int n, int i, final int n2) {
        int j = i;
        if (n != -2) {
            if (n == -1) {
                while (i <= n2) {
                    n = array[i];
                    array[i] = ((n >> 10 & 0x1F) | ((n & 0x1F) << 10 | (n >> 5 & 0x1F) << 5));
                    ++i;
                }
            }
            return;
        }
        while (j <= n2) {
            n = array[j];
            array[j] = ((n & 0x1F) | ((n >> 5 & 0x1F) << 10 | (n >> 10 & 0x1F) << 5));
            ++j;
        }
    }
    
    private boolean LIZ(final float[] array) {
        final 0BO.b[] lizlll = this.LIZLLL;
        if (lizlll != null && lizlll.length > 0) {
            for (int length = lizlll.length, i = 0; i < length; ++i) {
                if (!this.LIZLLL[i].LIZ(array)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static int LIZIZ(int n, final int n2, final int n3) {
        if (n3 > n2) {
            n <<= n3 - n2;
        }
        else {
            n >>= n2 - n3;
        }
        return n & (1 << n3) - 1;
    }
    
    public final class a
    {
        public int LIZ;
        public final /* synthetic */ 0BJ LIZIZ;
        public int LIZJ;
        public int LIZLLL;
        public int LJ;
        public int LJFF;
        public int LJI;
        public int LJII;
        public int LJIIIIZZ;
        public int LJIIIZ;
        
        static {
            Covode.recordClassIndex(1173);
        }
        
        public a(final int lizj, final int liz) {
            this.LIZJ = lizj;
            this.LIZ = liz;
            this.LIZJ();
        }
        
        private int LJFF() {
            return this.LIZ + 1 - this.LIZJ;
        }
        
        public final int LIZ() {
            return (this.LJFF - this.LJ + 1) * (this.LJII - this.LJI + 1) * (this.LJIIIZ - this.LJIIIIZZ + 1);
        }
        
        public final boolean LIZIZ() {
            return this.LJFF() > 1;
        }
        
        public final void LIZJ() {
            final int[] liz = 0BJ.this.LIZ;
            final int[] liziz = 0BJ.this.LIZIZ;
            int i = this.LIZJ;
            int lj = Integer.MAX_VALUE;
            int lji = Integer.MAX_VALUE;
            int ljiiiizz = Integer.MAX_VALUE;
            int ljff = Integer.MIN_VALUE;
            int ljii = Integer.MIN_VALUE;
            int ljiiiz = Integer.MIN_VALUE;
            int lizlll = 0;
            while (i <= this.LIZ) {
                final int n = liz[i];
                final int n2 = lizlll + liziz[n];
                final int n3 = n >> 10 & 0x1F;
                final int n4 = n >> 5 & 0x1F;
                final int n5 = n & 0x1F;
                int n6;
                if (n3 > (n6 = ljff)) {
                    n6 = n3;
                }
                int n7;
                if (n3 < (n7 = lj)) {
                    n7 = n3;
                }
                int n8;
                if (n4 > (n8 = ljii)) {
                    n8 = n4;
                }
                int n9;
                if (n4 < (n9 = lji)) {
                    n9 = n4;
                }
                int n10;
                if (n5 > (n10 = ljiiiz)) {
                    n10 = n5;
                }
                int n11;
                if (n5 < (n11 = ljiiiizz)) {
                    n11 = n5;
                }
                ++i;
                lizlll = n2;
                ljiiiz = n10;
                ljii = n8;
                ljff = n6;
                ljiiiizz = n11;
                lji = n9;
                lj = n7;
            }
            this.LJ = lj;
            this.LJFF = ljff;
            this.LJI = lji;
            this.LJII = ljii;
            this.LJIIIIZZ = ljiiiizz;
            this.LJIIIZ = ljiiiz;
            this.LIZLLL = lizlll;
        }
        
        public final int LIZLLL() {
            final int n = this.LJFF - this.LJ;
            final int n2 = this.LJII - this.LJI;
            final int n3 = this.LJIIIZ - this.LJIIIIZZ;
            int n4;
            if (n >= n2 && n >= n3) {
                n4 = -3;
            }
            else if (n2 >= n && n2 >= n3) {
                n4 = -2;
            }
            else {
                n4 = -1;
            }
            final int[] liz = 0BJ.this.LIZ;
            final int[] liziz = 0BJ.this.LIZIZ;
            0BJ.LIZ(liz, n4, this.LIZJ, this.LIZ);
            Arrays.sort(liz, this.LIZJ, this.LIZ + 1);
            0BJ.LIZ(liz, n4, this.LIZJ, this.LIZ);
            final int n5 = this.LIZLLL / 2;
            int lizj = this.LIZJ;
            int n6 = 0;
            while (true) {
                final int liz2 = this.LIZ;
                if (lizj > liz2) {
                    return this.LIZJ;
                }
                n6 += liziz[liz[lizj]];
                if (n6 >= n5) {
                    return Math.min(liz2 - 1, lizj);
                }
                ++lizj;
            }
        }
        
        public final 0BO.d LJ() {
            final int[] liz = 0BJ.this.LIZ;
            final int[] liziz = 0BJ.this.LIZIZ;
            int i = this.LIZJ;
            int n = 0;
            int n2 = 0;
            int n3 = 0;
            int n4 = 0;
            while (i <= this.LIZ) {
                final int n5 = liz[i];
                final int n6 = liziz[n5];
                n2 += n6;
                n += (n5 >> 10 & 0x1F) * n6;
                n3 += (n5 >> 5 & 0x1F) * n6;
                n4 += n6 * (n5 & 0x1F);
                ++i;
            }
            final float n7 = (float)n;
            final float n8 = (float)n2;
            return new 0BO.d(0BJ.LIZ(Math.round(n7 / n8), Math.round(n3 / n8), Math.round(n4 / n8)), n2);
        }
    }
}
