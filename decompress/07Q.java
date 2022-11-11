// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import java.io.Writer;

public final class 07Q extends Writer
{
    public StringBuilder LIZ;
    
    static {
        Covode.recordClassIndex(795);
    }
    
    public 07Q() {
        this.LIZ = new StringBuilder(128);
    }
    
    private void LIZ() {
        if (this.LIZ.length() > 0) {
            final StringBuilder liz = this.LIZ;
            liz.delete(0, liz.length());
        }
    }
    
    @Override
    public final void close() {
        this.LIZ();
    }
    
    @Override
    public final void flush() {
        this.LIZ();
    }
    
    @Override
    public final void write(final char[] array, final int n, final int n2) {
        for (int i = 0; i < n2; ++i) {
            final char c = array[n + i];
            if (c == '\n') {
                this.LIZ();
            }
            else {
                this.LIZ.append(c);
            }
        }
    }
}
