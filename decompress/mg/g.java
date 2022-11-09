// 
// Decompiled by Procyon v0.6.0
// 

package mg;

import java.io.IOException;
import java.io.File;

public final class g implements l
{
    public final /* synthetic */ h a;
    
    public g(final h a) {
        this.a = a;
    }
    
    @Override
    public final void a(final m m, final File file, final boolean b) throws IOException {
        this.a.b.add(file);
        if (!b) {
            this.a.c.set(false);
        }
    }
}
