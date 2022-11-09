// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

public final class w0 extends Writer
{
    public final String f;
    public StringBuilder g;
    
    public w0() {
        this.g = new StringBuilder(128);
        this.f = "FragmentManager";
    }
    
    public final void b() {
        if (this.g.length() > 0) {
            Log.d(this.f, this.g.toString());
            final StringBuilder g = this.g;
            g.delete(0, g.length());
        }
    }
    
    @Override
    public final void close() {
        this.b();
    }
    
    @Override
    public final void flush() {
        this.b();
    }
    
    @Override
    public final void write(final char[] array, final int n, final int n2) {
        for (int i = 0; i < n2; ++i) {
            final char c = array[n + i];
            if (c == '\n') {
                this.b();
            }
            else {
                this.g.append(c);
            }
        }
    }
}
