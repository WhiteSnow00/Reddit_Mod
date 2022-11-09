// 
// Decompiled by Procyon v0.6.0
// 

package k7;

import com.apollographql.apollo.api.internal.json.JsonDataException;
import ae.b;
import java.io.IOException;
import java.io.Flushable;
import java.io.Closeable;

public abstract class d implements Closeable, Flushable
{
    public int f;
    public final int[] g;
    public final String[] h;
    public final int[] i;
    public boolean j;
    
    public d() {
        this.g = new int[256];
        this.h = new String[256];
        this.i = new int[256];
    }
    
    public abstract c A(final String p0) throws IOException;
    
    public abstract c b() throws IOException;
    
    public abstract c h() throws IOException;
    
    public abstract c q() throws IOException;
    
    public abstract c r() throws IOException;
    
    public abstract c s(final String p0) throws IOException;
    
    public abstract c t() throws IOException;
    
    public final int v() {
        final int f = this.f;
        if (f != 0) {
            return this.g[f - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.".toString());
    }
    
    public final void w(final int n) {
        final int f = this.f;
        final int[] g = this.g;
        if (f != g.length) {
            this.f = f + 1;
            g[f] = n;
            return;
        }
        throw new JsonDataException(a2.b.j(a.k("Nesting too deep at "), b.E(this.f, this.g, this.h, this.i), ": circular reference?"));
    }
    
    public abstract c x(final Boolean p0) throws IOException;
    
    public abstract c y(final Number p0) throws IOException;
}
