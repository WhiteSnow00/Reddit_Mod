// 
// Decompiled by Procyon v0.6.0
// 

package kk2;

import java.io.IOException;
import java.io.InputStream;

public final class j0 extends InputStream
{
    public final v f;
    public boolean g;
    public InputStream h;
    
    public j0(final v f) {
        this.g = true;
        this.f = f;
    }
    
    public final o b() throws IOException {
        final d a = this.f.a();
        if (a == null) {
            return null;
        }
        if (a instanceof o) {
            return (o)a;
        }
        final StringBuilder t = a.t("unknown object encountered: ");
        t.append(((o)a).getClass());
        throw new IOException(t.toString());
    }
    
    @Override
    public final int read() throws IOException {
        while (true) {
            o o = null;
            Label_0067: {
                if (this.h == null) {
                    if (!this.g) {
                        return -1;
                    }
                    o = this.b();
                    if (o == null) {
                        return -1;
                    }
                    this.g = false;
                    break Label_0067;
                }
                final int read = this.h.read();
                if (read >= 0) {
                    return read;
                }
                if ((o = this.b()) == null) {
                    this.h = null;
                    return -1;
                }
            }
            this.h = o.c();
            continue;
        }
    }
    
    @Override
    public final int read(final byte[] array, final int n, final int n2) throws IOException {
        final InputStream h = this.h;
        int n3 = 0;
        int n4 = 0;
        final int n5 = -1;
        while (true) {
            o o = null;
            Label_0047: {
                if (h == null) {
                    if (!this.g) {
                        return -1;
                    }
                    o = this.b();
                    if (o == null) {
                        return -1;
                    }
                    this.g = false;
                    break Label_0047;
                }
                int n6;
                do {
                    final int read = this.h.read(array, n + n3, n2 - n3);
                    if (read >= 0) {
                        n6 = n3 + read;
                    }
                    else {
                        final o o2 = o = this.b();
                        n4 = n3;
                        if (o2 == null) {
                            this.h = null;
                            if (n3 < 1) {
                                n3 = n5;
                            }
                            return n3;
                        }
                        break Label_0047;
                    }
                } while ((n3 = n6) != n2);
                return n6;
            }
            this.h = o.c();
            n3 = n4;
            continue;
        }
    }
}
