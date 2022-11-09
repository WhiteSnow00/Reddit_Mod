// 
// Decompiled by Procyon v0.6.0
// 

package mg;

import java.io.IOException;
import java.util.Collection;
import java.util.zip.ZipFile;
import java.util.HashSet;
import java.util.Set;

public final class i implements k
{
    public final /* synthetic */ Set a;
    public final /* synthetic */ q b;
    public final /* synthetic */ n c;
    
    public i(final n c, final HashSet a, final q b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a(final ZipFile zipFile, final HashSet set) throws IOException {
        final Set a = this.a;
        final n c = this.c;
        final q b = this.b;
        final HashSet set2 = new HashSet();
        c.c(b, set, new j(set2, b, zipFile));
        a.addAll(set2);
    }
}
