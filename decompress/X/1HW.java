// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.IOException;
import com.bytedance.covode.number.Covode;
import java.io.InputStream;

public final class 1hw extends a
{
    public final byte[] LIZIZ;
    public final InputStream LIZJ;
    public final int LIZLLL;
    public int LJ;
    
    static {
        Covode.recordClassIndex(4617);
    }
    
    public 1hw(final InputStream lizj) {
        this.LIZIZ = new byte[256];
        this.LIZJ = lizj;
        int available;
        try {
            available = lizj.available();
        }
        catch (final IOException ex) {
            available = -1;
        }
        this.LIZLLL = available;
    }
    
    @Override
    public final void LIZ(final long n) {
        this.LJ += (int)n;
        this.LIZJ.skip(n);
    }
    
    @Override
    public final boolean LIZ() {
        return this.LIZLLL - this.LJ > 0;
    }
    
    @Override
    public final byte LIZIZ() {
        MethodCollector.i(4953);
        ++this.LJ;
        final byte b = (byte)this.LIZJ.read();
        MethodCollector.o(4953);
        return b;
    }
    
    @Override
    public final byte[] LIZIZ(final long n) {
        MethodCollector.i(4958);
        this.LJ += (int)n;
        final byte[] array = new byte[(int)n];
        this.LIZJ.read(array);
        MethodCollector.o(4958);
        return array;
    }
    
    @Override
    public final String LIZJ(final long n) {
        MethodCollector.i(4967);
        this.LJ += (int)n;
        byte[] liziz;
        if (n > 256L) {
            final int n2 = (int)n;
            liziz = new byte[n2];
            this.LIZJ.read(liziz, 0, n2);
        }
        else {
            this.LIZJ.read(this.LIZIZ, 0, (int)n);
            liziz = this.LIZIZ;
        }
        final String s = new String(liziz, 0, (int)n, a.LIZ);
        MethodCollector.o(4967);
        return s;
    }
}
