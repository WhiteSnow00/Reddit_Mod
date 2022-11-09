// 
// Decompiled by Procyon v0.6.0
// 

package mg;

import java.io.IOException;
import java.util.zip.ZipFile;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Set;

public final class h implements k
{
    public final /* synthetic */ q a;
    public final /* synthetic */ Set b;
    public final /* synthetic */ AtomicBoolean c;
    public final /* synthetic */ n d;
    
    public h(final n d, final q a, final HashSet b, final AtomicBoolean c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void a(final ZipFile zipFile, final HashSet set) throws IOException {
        this.d.c(this.a, set, new g(this));
    }
}
