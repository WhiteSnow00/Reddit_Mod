// 
// Decompiled by Procyon v0.6.0
// 

package s0;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;

public interface c<T>
{
    a<T> get(final int p0);
    
    int getSize();
    
    public static final class a<T>
    {
        public final int a;
        public final int b;
        public final T c;
        
        public a(int a, final int b, final LazyLayoutIntervalContent c) {
            this.a = a;
            this.b = b;
            this.c = (T)c;
            final int n = 1;
            if (a < 0) {
                throw new IllegalArgumentException(d.h("startIndex should be >= 0, but was ", a).toString());
            }
            if (b > 0) {
                a = n;
            }
            else {
                a = 0;
            }
            if (a != 0) {
                return;
            }
            throw new IllegalArgumentException(d.h("size should be >0, but was ", b).toString());
        }
    }
}
