// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public class 051<E> implements Cloneable
{
    public static final Object LIZ;
    public boolean LIZIZ;
    public int[] LIZJ;
    public Object[] LIZLLL;
    public int LJ;
    
    static {
        Covode.recordClassIndex(588);
        LIZ = new Object();
    }
    
    public 051() {
        this(10);
    }
    
    public 051(int liz) {
        if (liz == 0) {
            this.LIZJ = 04u.LIZ;
            this.LIZLLL = 04u.LIZJ;
            return;
        }
        liz = 04u.LIZ(liz);
        this.LIZJ = new int[liz];
        this.LIZLLL = new Object[liz];
    }
    
    private void LIZLLL() {
        final int lj = this.LJ;
        final int[] lizj = this.LIZJ;
        final Object[] lizlll = this.LIZLLL;
        int i = 0;
        int lj2 = 0;
        while (i < lj) {
            final Object o = lizlll[i];
            int n = lj2;
            if (o != 051.LIZ) {
                if (i != lj2) {
                    lizj[lj2] = lizj[i];
                    lizlll[lj2] = o;
                    lizlll[i] = null;
                }
                n = lj2 + 1;
            }
            ++i;
            lj2 = n;
        }
        this.LIZIZ = false;
        this.LJ = lj2;
    }
    
    public final 051<E> LIZ() {
        try {
            final 051 051 = (051)super.clone();
            051.LIZJ = this.LIZJ.clone();
            051.LIZLLL = this.LIZLLL.clone();
            return 051;
        }
        catch (final CloneNotSupportedException ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    public final E LIZ(final int n) {
        return this.LIZ(n, null);
    }
    
    public final E LIZ(int liz, final E e) {
        liz = 04u.LIZ(this.LIZJ, this.LJ, liz);
        if (liz >= 0) {
            final Object[] lizlll = this.LIZLLL;
            if (lizlll[liz] != 051.LIZ) {
                return (E)lizlll[liz];
            }
        }
        return e;
    }
    
    public final int LIZIZ() {
        if (this.LIZIZ) {
            this.LIZLLL();
        }
        return this.LJ;
    }
    
    public final void LIZIZ(int liz) {
        liz = 04u.LIZ(this.LIZJ, this.LJ, liz);
        if (liz >= 0) {
            final Object[] lizlll = this.LIZLLL;
            final Object o = lizlll[liz];
            final Object liz2 = 051.LIZ;
            if (o != liz2) {
                lizlll[liz] = liz2;
                this.LIZIZ = true;
            }
        }
    }
    
    public final void LIZIZ(final int n, final E e) {
        final int liz = 04u.LIZ(this.LIZJ, this.LJ, n);
        if (liz >= 0) {
            this.LIZLLL[liz] = e;
            return;
        }
        final int n2 = ~liz;
        final int lj = this.LJ;
        if (n2 < lj) {
            final Object[] lizlll = this.LIZLLL;
            if (lizlll[n2] == 051.LIZ) {
                this.LIZJ[n2] = n;
                lizlll[n2] = e;
                return;
            }
        }
        int n3 = n2;
        if (this.LIZIZ) {
            n3 = n2;
            if (lj >= this.LIZJ.length) {
                this.LIZLLL();
                n3 = ~04u.LIZ(this.LIZJ, this.LJ, n);
            }
        }
        final int lj2 = this.LJ;
        if (lj2 >= this.LIZJ.length) {
            final int liz2 = 04u.LIZ(lj2 + 1);
            final int[] lizj = new int[liz2];
            final Object[] lizlll2 = new Object[liz2];
            final int[] lizj2 = this.LIZJ;
            System.arraycopy(lizj2, 0, lizj, 0, lizj2.length);
            final Object[] lizlll3 = this.LIZLLL;
            System.arraycopy(lizlll3, 0, lizlll2, 0, lizlll3.length);
            this.LIZJ = lizj;
            this.LIZLLL = lizlll2;
        }
        final int lj3 = this.LJ;
        if (lj3 - n3 != 0) {
            final int[] lizj3 = this.LIZJ;
            final int n4 = n3 + 1;
            System.arraycopy(lizj3, n3, lizj3, n4, lj3 - n3);
            final Object[] lizlll4 = this.LIZLLL;
            System.arraycopy(lizlll4, n3, lizlll4, n4, this.LJ - n3);
        }
        this.LIZJ[n3] = n;
        this.LIZLLL[n3] = e;
        ++this.LJ;
    }
    
    public final int LIZJ(final int n) {
        if (this.LIZIZ) {
            this.LIZLLL();
        }
        return this.LIZJ[n];
    }
    
    public final void LIZJ() {
        final int lj = this.LJ;
        final Object[] lizlll = this.LIZLLL;
        for (int i = 0; i < lj; ++i) {
            lizlll[i] = null;
        }
        this.LJ = 0;
        this.LIZIZ = false;
    }
    
    public final void LIZJ(final int n, final E e) {
        final int lj = this.LJ;
        if (lj != 0 && n <= this.LIZJ[lj - 1]) {
            this.LIZIZ(n, e);
            return;
        }
        if (this.LIZIZ && lj >= this.LIZJ.length) {
            this.LIZLLL();
        }
        final int lj2 = this.LJ;
        if (lj2 >= this.LIZJ.length) {
            final int liz = 04u.LIZ(lj2 + 1);
            final int[] lizj = new int[liz];
            final Object[] lizlll = new Object[liz];
            final int[] lizj2 = this.LIZJ;
            System.arraycopy(lizj2, 0, lizj, 0, lizj2.length);
            final Object[] lizlll2 = this.LIZLLL;
            System.arraycopy(lizlll2, 0, lizlll, 0, lizlll2.length);
            this.LIZJ = lizj;
            this.LIZLLL = lizlll;
        }
        this.LIZJ[lj2] = n;
        this.LIZLLL[lj2] = e;
        this.LJ = lj2 + 1;
    }
    
    public final E LIZLLL(final int n) {
        if (this.LIZIZ) {
            this.LIZLLL();
        }
        return (E)this.LIZLLL[n];
    }
    
    public final int LJ(final int n) {
        if (this.LIZIZ) {
            this.LIZLLL();
        }
        return 04u.LIZ(this.LIZJ, this.LJ, n);
    }
    
    @Override
    public String toString() {
        if (this.LIZIZ() <= 0) {
            return "{}";
        }
        final StringBuilder sb = new StringBuilder(this.LJ * 28);
        sb.append('{');
        for (int i = 0; i < this.LJ; ++i) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(this.LIZJ(i));
            sb.append('=');
            final E lizlll = this.LIZLLL(i);
            if (lizlll != this) {
                sb.append(lizlll);
            }
            else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
