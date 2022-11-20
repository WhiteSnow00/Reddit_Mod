// 
// Decompiled by Procyon v0.6.0
// 

package vd;

import java.io.IOException;
import java.io.Closeable;

@Deprecated
public final class e
{
    public static void a(final Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        }
        catch (final IOException ex) {}
    }
}
