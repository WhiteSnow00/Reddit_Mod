// 
// Decompiled by Procyon v0.6.0
// 

package dm2;

import java.io.IOException;
import nm2.a;
import java.io.OutputStream;
import java.io.ObjectOutputStream;
import java.io.ByteArrayOutputStream;
import org.bouncycastle.pqc.crypto.xmss.BDSStateMap;
import nm2.c;

public final class h extends f implements c
{
    public final g g;
    public final byte[] h;
    public final byte[] i;
    public final byte[] j;
    public final byte[] k;
    public volatile long l;
    public volatile BDSStateMap m;
    
    public h(final h.h$a h$a) {
        final g a = h$a.a;
        final j b = a.b;
        super(true, b.f);
        this.g = a;
        final int g = b.g;
        this.l = h$a.b;
        final byte[] d = h$a.d;
        if (d != null) {
            if (d.length != g) {
                throw new IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
            }
            this.h = d;
        }
        else {
            this.h = new byte[g];
        }
        final byte[] e = h$a.e;
        if (e != null) {
            if (e.length != g) {
                throw new IllegalArgumentException("size of secretKeyPRF needs to be equal size of digest");
            }
            this.i = e;
        }
        else {
            this.i = new byte[g];
        }
        final byte[] f = h$a.f;
        if (f != null) {
            if (f.length != g) {
                throw new IllegalArgumentException("size of publicSeed needs to be equal size of digest");
            }
            this.j = f;
        }
        else {
            this.j = new byte[g];
        }
        final byte[] g2 = h$a.g;
        if (g2 != null) {
            if (g2.length != g) {
                throw new IllegalArgumentException("size of root needs to be equal size of digest");
            }
            this.k = g2;
        }
        else {
            this.k = new byte[g];
        }
        BDSStateMap h = h$a.h;
        if (h == null) {
            if (dm2.l.g(a.c, h$a.b) && f != null && d != null) {
                h = new BDSStateMap(a, h$a.b, f, d);
            }
            else {
                h = new BDSStateMap(h$a.c + 1L);
            }
        }
        this.m = h;
        final long c = h$a.c;
        if (c >= 0L && c != this.m.getMaxIndex()) {
            throw new IllegalArgumentException("maxIndex set but not reflected in state");
        }
    }
    
    public final void a() {
        synchronized (this) {
            if (this.l < this.m.getMaxIndex()) {
                this.m.updateState(this.g, this.l, this.j, this.h);
                ++this.l;
            }
            else {
                this.l = this.m.getMaxIndex() + 1L;
                this.m = new BDSStateMap(this.m.getMaxIndex());
            }
        }
    }
    
    public final byte[] b() {
        synchronized (this) {
            final g g = this.g;
            final int g2 = g.b.g;
            int n = (g.c + 7) / 8;
            final byte[] array = new byte[n + g2 + g2 + g2 + g2];
            dm2.l.d(array, 0, dm2.l.h(n, this.l));
            n += 0;
            dm2.l.d(array, n, this.h);
            final int n2 = n + g2;
            dm2.l.d(array, n2, this.i);
            final int n3 = n2 + g2;
            dm2.l.d(array, n3, this.j);
            dm2.l.d(array, n3 + g2, this.k);
            try {
                final BDSStateMap m = this.m;
                final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                final ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                objectOutputStream.writeObject(m);
                objectOutputStream.flush();
                return a.b(array, byteArrayOutputStream.toByteArray());
            }
            catch (final IOException ex) {
                final StringBuilder sb = new StringBuilder();
                sb.append("error serializing bds state: ");
                sb.append(ex.getMessage());
                throw new IllegalStateException(sb.toString(), ex);
            }
        }
    }
    
    public final byte[] getEncoded() throws IOException {
        synchronized (this) {
            return this.b();
        }
    }
}
