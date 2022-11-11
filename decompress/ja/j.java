// 
// Decompiled by Procyon v0.6.0
// 

package ja;

import ga.d;
import com.google.android.datatransport.runtime.c;
import ga.b;
import java.util.Set;
import ga.f;

public final class j implements f
{
    public final Set<b> a;
    public final c b;
    public final m c;
    
    public j(final Set a, final com.google.android.datatransport.runtime.b b, final m c) {
        this.a = a;
        this.b = (c)b;
        this.c = c;
    }
    
    public final l a(final String s, final b b, final d d) {
        if (this.a.contains(b)) {
            return new l(this.b, s, b, (d<T, byte[]>)d, this.c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", b, this.a));
    }
}
