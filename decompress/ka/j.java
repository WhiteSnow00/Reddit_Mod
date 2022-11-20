// 
// Decompiled by Procyon v0.6.0
// 

package ka;

import ha.d;
import com.google.android.datatransport.runtime.c;
import ha.b;
import java.util.Set;
import ha.f;

public final class j implements f
{
    public final Set<b> a;
    public final c b;
    public final l c;
    
    public j(final Set a, final com.google.android.datatransport.runtime.b b, final l c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final k a(final String s, final b b, final d d) {
        if (this.a.contains(b)) {
            return new k(this.b, s, b, (d<T, byte[]>)d, this.c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", b, this.a));
    }
}
