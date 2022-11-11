// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public final class 05T
{
    static {
        Covode.recordClassIndex(626);
    }
    
    public interface a<T>
    {
        default static {
            Covode.recordClassIndex(627);
        }
        
        T LIZ();
        
        void LIZ(final T[] p0, final int p1);
        
        boolean LIZ(final T p0);
    }
    
    public static final class b<T> implements a<T>
    {
        public final Object[] LIZ;
        public int LIZIZ;
        
        static {
            Covode.recordClassIndex(628);
        }
        
        public b() {
            this.LIZ = new Object[256];
        }
        
        @Override
        public final T LIZ() {
            final int liziz = this.LIZIZ;
            if (liziz > 0) {
                final int n = liziz - 1;
                final Object[] liz = this.LIZ;
                final Object o = liz[n];
                liz[n] = null;
                this.LIZIZ = liziz - 1;
                return (T)o;
            }
            return null;
        }
        
        @Override
        public final void LIZ(final T[] array, int i) {
            int length = i;
            if (i > array.length) {
                length = array.length;
            }
            T t;
            int liziz;
            Object[] liz;
            for (i = 0; i < length; ++i) {
                t = array[i];
                liziz = this.LIZIZ;
                liz = this.LIZ;
                if (liziz < liz.length) {
                    liz[liziz] = t;
                    this.LIZIZ = liziz + 1;
                }
            }
        }
        
        @Override
        public final boolean LIZ(final T t) {
            final int liziz = this.LIZIZ;
            final Object[] liz = this.LIZ;
            if (liziz < liz.length) {
                liz[liziz] = t;
                this.LIZIZ = liziz + 1;
                return true;
            }
            return false;
        }
    }
}
