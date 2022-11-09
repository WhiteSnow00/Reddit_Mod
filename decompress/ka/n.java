// 
// Decompiled by Procyon v0.6.0
// 

package ka;

import java.io.IOException;
import sa.d;
import javax.inject.Singleton;
import java.io.Closeable;

@Singleton
public abstract class n implements Closeable
{
    @Override
    public final void close() throws IOException {
        ((d)((c)this).i.get()).close();
    }
}
