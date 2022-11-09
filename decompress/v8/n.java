// 
// Decompiled by Procyon v0.6.0
// 

package v8;

import ng.f0;
import java.util.Collections;
import java.util.List;
import p8.d;
import p8.g;

public interface n<Model, Data>
{
    a<Data> buildLoadData(final Model p0, final int p1, final int p2, final g p3);
    
    boolean handles(final Model p0);
    
    public static final class a<Data>
    {
        public final d a;
        public final List<d> b;
        public final com.bumptech.glide.load.data.d<Data> c;
        
        public a(final d d, final com.bumptech.glide.load.data.d<Data> d2) {
            this(d, Collections.emptyList(), d2);
        }
        
        public a(final d a, final List<d> b, final com.bumptech.glide.load.data.d<Data> c) {
            f0.a2(a);
            this.a = a;
            f0.a2(b);
            this.b = b;
            f0.a2(c);
            this.c = c;
        }
    }
}
