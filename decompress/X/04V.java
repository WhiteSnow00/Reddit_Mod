// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public class 04v<E> implements Cloneable
{
    public static final Object LIZ;
    public boolean LIZIZ;
    public long[] LIZJ;
    public Object[] LIZLLL;
    public int LJ;
    
    static {
        Covode.recordClassIndex(579);
        LIZ = new Object();
    }
    
    public 04v() {
        this(10);
    }
    
    public 04v(int liziz) {
        if (liziz == 0) {
            this.LIZJ = 04u.LIZIZ;
            this.LIZLLL = 04u.LIZJ;
            return;
        }
        liziz = 04u.LIZIZ(liziz);
        this.LIZJ = new long[liziz];
        this.LIZLLL = new Object[liziz];
    }
    
    private void LIZLLL() {
        final int lj = this.LJ;
        final long[] lizj = this.LIZJ;
        final Object[] lizlll = this.LIZLLL;
        int i = 0;
        int lj2 = 0;
        while (i < lj) {
            final Object o = lizlll[i];
            int n = lj2;
            if (o != 04v.LIZ) {
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
    
    public final 04v<E> LIZ() {
        try {
            final 04v 04v = (04v)super.clone();
            04v.LIZJ = this.LIZJ.clone();
            04v.LIZLLL = this.LIZLLL.clone();
            return 04v;
        }
        catch (final CloneNotSupportedException ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    public final E LIZ(final long n) {
        return this.LIZ(n, null);
    }
    
    public final E LIZ(final long n, final E e) {
        final int liz = 04u.LIZ(this.LIZJ, this.LJ, n);
        if (liz >= 0) {
            final Object[] lizlll = this.LIZLLL;
            if (lizlll[liz] != 04v.LIZ) {
                return (E)lizlll[liz];
            }
        }
        return e;
    }
    
    public final void LIZ(final int n) {
        final Object[] lizlll = this.LIZLLL;
        final Object o = lizlll[n];
        final Object liz = 04v.LIZ;
        if (o != liz) {
            lizlll[n] = liz;
            this.LIZIZ = true;
        }
    }
    
    public final int LIZIZ() {
        if (this.LIZIZ) {
            this.LIZLLL();
        }
        return this.LJ;
    }
    
    public final long LIZIZ(final int n) {
        if (this.LIZIZ) {
            this.LIZLLL();
        }
        return this.LIZJ[n];
    }
    
    public final void LIZIZ(final long n) {
        final int liz = 04u.LIZ(this.LIZJ, this.LJ, n);
        if (liz >= 0) {
            final Object[] lizlll = this.LIZLLL;
            final Object o = lizlll[liz];
            final Object liz2 = 04v.LIZ;
            if (o != liz2) {
                lizlll[liz] = liz2;
                this.LIZIZ = true;
            }
        }
    }
    
    public final void LIZIZ(final long n, final E e) {
        final int liz = 04u.LIZ(this.LIZJ, this.LJ, n);
        if (liz >= 0) {
            this.LIZLLL[liz] = e;
            return;
        }
        final int n2 = ~liz;
        final int lj = this.LJ;
        if (n2 < lj) {
            final Object[] lizlll = this.LIZLLL;
            if (lizlll[n2] == 04v.LIZ) {
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
            final int liziz = 04u.LIZIZ(lj2 + 1);
            final long[] lizj = new long[liziz];
            final Object[] lizlll2 = new Object[liziz];
            final long[] lizj2 = this.LIZJ;
            System.arraycopy(lizj2, 0, lizj, 0, lizj2.length);
            final Object[] lizlll3 = this.LIZLLL;
            System.arraycopy(lizlll3, 0, lizlll2, 0, lizlll3.length);
            this.LIZJ = lizj;
            this.LIZLLL = lizlll2;
        }
        final int lj3 = this.LJ;
        if (lj3 - n3 != 0) {
            final long[] lizj3 = this.LIZJ;
            final int n4 = n3 + 1;
            System.arraycopy(lizj3, n3, lizj3, n4, lj3 - n3);
            final Object[] lizlll4 = this.LIZLLL;
            System.arraycopy(lizlll4, n3, lizlll4, n4, this.LJ - n3);
        }
        this.LIZJ[n3] = n;
        this.LIZLLL[n3] = e;
        ++this.LJ;
    }
    
    public final int LIZJ(final long n) {
        if (this.LIZIZ) {
            this.LIZLLL();
        }
        return 04u.LIZ(this.LIZJ, this.LJ, n);
    }
    
    public final E LIZJ(final int n) {
        if (this.LIZIZ) {
            this.LIZLLL();
        }
        return (E)this.LIZLLL[n];
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
    
    public final void LIZJ(final long n, final E e) {
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
            final int liziz = 04u.LIZIZ(lj2 + 1);
            final long[] lizj = new long[liziz];
            final Object[] lizlll = new Object[liziz];
            final long[] lizj2 = this.LIZJ;
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
            sb.append(this.LIZIZ(i));
            sb.append('=');
            final E lizj = this.LIZJ(i);
            if (lizj != this) {
                sb.append(lizj);
            }
            else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
