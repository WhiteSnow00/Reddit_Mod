// 
// Decompiled by Procyon v0.6.0
// 

package zc;

import java.io.IOException;
import ad.c0;
import ad.d0;
import java.io.FileOutputStream;
import java.io.OutputStream;
import ad.a;
import java.io.BufferedOutputStream;

public final class l extends BufferedOutputStream
{
    public boolean f;
    
    public l(final a.a a) {
        super(a);
    }
    
    public l(final FileOutputStream fileOutputStream, final int n) {
        super(fileOutputStream, n);
    }
    
    public final void a(final OutputStream out) {
        d0.f(this.f);
        super.out = out;
        super.count = 0;
        this.f = false;
    }
    
    @Override
    public final void close() throws IOException {
        this.f = true;
        try {
            this.flush();
        }
        finally {}
        Throwable t = null;
        try {
            super.out.close();
        }
        finally {
            final Throwable t2;
            t = t2;
            if (t2 == null) {
                final Throwable t3;
                t = t3;
            }
        }
        if (t == null) {
            return;
        }
        final int a = c0.a;
        throw t;
    }
}
