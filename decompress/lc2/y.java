// 
// Decompiled by Procyon v0.6.0
// 

package lc2;

import java.io.IOException;
import java.util.logging.Logger;
import java.io.Closeable;
import mc2.a;
import java.io.InputStream;
import xc2.l;
import java.io.FileInputStream;
import xc2.u;
import xc2.n;
import xc2.o;
import java.io.File;

public final class y extends z
{
    public final /* synthetic */ t a;
    public final /* synthetic */ File b;
    
    public y(final t a, final File b) {
        this.a = a;
        this.b = b;
    }
    
    public final long a() {
        return this.b.length();
    }
    
    public final t b() {
        return this.a;
    }
    
    public final void d(final o o) throws IOException {
        Closeable closeable = null;
        try {
            final File b = this.b;
            final Logger a = n.a;
            if (b != null) {
                final l l = new l(new u(), (InputStream)new FileInputStream(b));
                try {
                    o.c((xc2.t)l);
                    mc2.a.e((Closeable)l);
                    return;
                }
                finally {
                    closeable = (Closeable)l;
                }
            }
            throw new IllegalArgumentException("file == null");
        }
        finally {}
        mc2.a.e(closeable);
    }
}
