// 
// Decompiled by Procyon v0.6.0
// 

package qc2;

import rc2.t;
import java.util.concurrent.TimeUnit;
import java.io.IOException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import com.sendbird.android.shadow.okio.ByteString;
import java.io.Closeable;
import gc2.b;
import java.net.ProtocolException;
import com.sendbird.android.shadow.okio.a$a;
import com.sendbird.android.shadow.okio.a;

public final class e
{
    public final boolean a;
    public final rc2.e b;
    public final a c;
    public boolean d;
    public int e;
    public long f;
    public boolean g;
    public boolean h;
    public final com.sendbird.android.shadow.okio.a i;
    public final com.sendbird.android.shadow.okio.a j;
    public final byte[] k;
    public final a$a l;
    
    public e(final boolean a, final rc2.e b, final c c) {
        this.i = new com.sendbird.android.shadow.okio.a();
        this.j = new com.sendbird.android.shadow.okio.a();
        if (b == null) {
            throw new NullPointerException("source == null");
        }
        if (c != null) {
            this.a = a;
            this.b = b;
            this.c = (a)c;
            final a$a a$a = null;
            byte[] k;
            if (a) {
                k = null;
            }
            else {
                k = new byte[4];
            }
            this.k = k;
            a$a l;
            if (a) {
                l = a$a;
            }
            else {
                l = new a$a();
            }
            this.l = l;
            return;
        }
        throw new NullPointerException("frameCallback == null");
    }
    
    public final void a() throws IOException {
        final long f = this.f;
        if (f > 0L) {
            this.b.z(this.i, f);
            if (!this.a) {
                this.i.n(this.l);
                this.l.h(0L);
                qc2.d.b(this.l, this.k);
                this.l.close();
            }
        }
        final c c3;
        Label_0533: {
            int short1 = 0;
            switch (this.e) {
                default: {
                    final StringBuilder t = a.t("Unknown control opcode: ");
                    t.append(Integer.toHexString(this.e));
                    throw new ProtocolException(t.toString());
                }
                case 10: {
                    final a c = this.c;
                    this.i.q();
                    final Object k = c;
                    synchronized (k) {
                        ((c)k).t = false;
                        return;
                    }
                }
                case 9: {
                    final a c2 = this.c;
                    final ByteString q = this.i.q();
                    final Object k = c2;
                    synchronized (k) {
                        if (!((c)k).r && (!((c)k).o || !((c)k).m.isEmpty())) {
                            ((c)k).l.add(q);
                            final ScheduledThreadPoolExecutor j = ((c)k).j;
                            if (j != null) {
                                j.execute(((c)k).g);
                            }
                        }
                        return;
                    }
                }
                case 8: {
                    short1 = 1005;
                    final com.sendbird.android.shadow.okio.a i = this.i;
                    final long g = i.g;
                    if (g == 1L) {
                        throw new ProtocolException("Malformed close payload length of 1.");
                    }
                    if (g != 0L) {
                        short1 = i.readShort();
                        this.i.s();
                        final String a = qc2.d.a(short1);
                        if (a != null) {
                            throw new ProtocolException(a);
                        }
                    }
                    c3 = (c)this.c;
                    if (short1 != -1) {
                        break;
                    }
                    break Label_0533;
                }
            }
            synchronized (c3) {
                if (c3.q == -1) {
                    c3.q = short1;
                    c3.getClass();
                    final boolean o = c3.o;
                    Object k;
                    final c c4 = (c)(k = null);
                    if (o) {
                        k = c4;
                        if (c3.m.isEmpty()) {
                            k = c3.k;
                            c3.k = null;
                            final ScheduledFuture p = c3.p;
                            if (p != null) {
                                p.cancel(false);
                            }
                            c3.j.shutdown();
                        }
                    }
                    monitorexit(c3);
                    try {
                        c3.b.getClass();
                        if (k != null) {
                            c3.b.m2(short1);
                        }
                        gc2.b.e((Closeable)k);
                        this.d = true;
                        return;
                    }
                    finally {
                        gc2.b.e((Closeable)k);
                    }
                }
                throw new IllegalStateException("already closed");
            }
        }
        c3.getClass();
        throw new IllegalArgumentException();
    }
    
    public final void b() throws IOException {
        if (!this.d) {
            long n = ((t)this.b).timeout().h();
            ((t)this.b).timeout().b();
            try {
                final int n2 = this.b.readByte() & 0xFF;
                ((t)this.b).timeout().g(n, TimeUnit.NANOSECONDS);
                this.e = (n2 & 0xF);
                final boolean b = true;
                final boolean g = (n2 & 0x80) != 0x0;
                this.g = g;
                final boolean h = (n2 & 0x8) != 0x0;
                this.h = h;
                if (h && !g) {
                    throw new ProtocolException("Control frames must be final.");
                }
                final boolean b2 = (n2 & 0x40) != 0x0;
                final boolean b3 = (n2 & 0x20) != 0x0;
                final boolean b4 = (n2 & 0x10) != 0x0;
                if (b2 || b3 || b4) {
                    throw new ProtocolException("Reserved flags are unsupported.");
                }
                final int n3 = this.b.readByte() & 0xFF;
                final boolean b5 = (n3 & 0x80) != 0x0 && b;
                if (b5 == this.a) {
                    String s;
                    if (this.a) {
                        s = "Server-sent frames must not be masked.";
                    }
                    else {
                        s = "Client-sent frames must be masked.";
                    }
                    throw new ProtocolException(s);
                }
                n = (n3 & 0x7F);
                this.f = n;
                if (n == 126L) {
                    this.f = ((long)this.b.readShort() & 0xFFFFL);
                }
                else if (n == 127L) {
                    n = this.b.readLong();
                    this.f = n;
                    if (n < 0L) {
                        final StringBuilder t = a.t("Frame length 0x");
                        t.append(Long.toHexString(this.f));
                        t.append(" > 0x7FFFFFFFFFFFFFFF");
                        throw new ProtocolException(t.toString());
                    }
                }
                if (this.h && this.f > 125L) {
                    throw new ProtocolException("Control frame must be less than 125B.");
                }
                if (b5) {
                    this.b.readFully(this.k);
                }
                return;
            }
            finally {
                ((t)this.b).timeout().g(n, TimeUnit.NANOSECONDS);
            }
        }
        throw new IOException("closed");
    }
    
    public interface a
    {
    }
}
