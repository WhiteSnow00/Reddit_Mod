// 
// Decompiled by Procyon v0.6.0
// 

package nc;

import ab.d;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import android.os.Message;
import bd.o;
import wa.e0;
import wi.b;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.List;
import java.util.Collections;
import bd.c0;
import android.os.Looper;
import com.google.android.exoplayer2.k$b;
import com.google.android.exoplayer2.n;
import com.android.billingclient.api.d0;
import android.os.Handler;
import android.os.Handler$Callback;
import com.google.android.exoplayer2.e;

public final class l extends e implements Handler$Callback
{
    public g A;
    public i B;
    public j C;
    public j D;
    public int E;
    public long F;
    public final Handler r;
    public final k s;
    public final h t;
    public final d0 u;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;
    public n z;
    
    public l(final k$b s, final Looper looper) {
        final h a = (h)h.a;
        super(3);
        this.s = (k)s;
        Handler r;
        if (looper == null) {
            r = null;
        }
        else {
            final int a2 = c0.a;
            r = new Handler(looper, (Handler$Callback)this);
        }
        this.r = r;
        this.t = (h)a;
        this.u = new d0(1);
        this.F = -9223372036854775807L;
    }
    
    public final void B(final long n, final boolean b) {
        final List<Object> emptyList = Collections.emptyList();
        final Handler r = this.r;
        if (r != null) {
            r.obtainMessage(0, (Object)emptyList).sendToTarget();
        }
        else {
            this.s.onCues((List)emptyList);
        }
        this.v = false;
        this.w = false;
        this.F = -9223372036854775807L;
        if (this.y != 0) {
            this.J();
            final g a = this.A;
            a.getClass();
            ((d)a).release();
            this.A = null;
            this.y = 0;
            this.x = true;
            final h t = this.t;
            final n z = this.z;
            z.getClass();
            this.A = ((h.h$a)t).a(z);
        }
        else {
            this.J();
            final g a2 = this.A;
            a2.getClass();
            ((d)a2).flush();
        }
    }
    
    public final void F(final n[] array, final long n, final long n2) {
        final n z = array[0];
        this.z = z;
        if (this.A != null) {
            this.y = 1;
        }
        else {
            this.x = true;
            final h t = this.t;
            z.getClass();
            this.A = ((h.h$a)t).a(z);
        }
    }
    
    public final long H() {
        final int e = this.E;
        long a = Long.MAX_VALUE;
        if (e == -1) {
            return Long.MAX_VALUE;
        }
        this.C.getClass();
        if (this.E < this.C.c()) {
            a = this.C.a(this.E);
        }
        return a;
    }
    
    public final void I(final SubtitleDecoderException ex) {
        final String value = String.valueOf(this.z);
        final StringBuilder sb = new StringBuilder(value.length() + 39);
        sb.append("Subtitle decoding failed. streamFormat=");
        sb.append(value);
        b.C("TextRenderer", sb.toString(), (Throwable)ex);
        final List<Object> emptyList = Collections.emptyList();
        final Handler r = this.r;
        if (r != null) {
            r.obtainMessage(0, (Object)emptyList).sendToTarget();
        }
        else {
            this.s.onCues((List)emptyList);
        }
        this.J();
        final g a = this.A;
        a.getClass();
        ((d)a).release();
        this.A = null;
        this.y = 0;
        this.x = true;
        final h t = this.t;
        final n z = this.z;
        z.getClass();
        this.A = ((h.h$a)t).a(z);
    }
    
    public final void J() {
        this.B = null;
        this.E = -1;
        final j c = this.C;
        if (c != null) {
            c.p();
            this.C = null;
        }
        final j d = this.D;
        if (d != null) {
            d.p();
            this.D = null;
        }
    }
    
    public final int a(final n n) {
        if (((h.h$a)this.t).b(n)) {
            int n2;
            if (n.J == 0) {
                n2 = 4;
            }
            else {
                n2 = 2;
            }
            return e0.l(n2, 0, 0);
        }
        if (o.l(n.q)) {
            return e0.l(1, 0, 0);
        }
        return e0.l(0, 0, 0);
    }
    
    public final boolean b() {
        return this.w;
    }
    
    public final String getName() {
        return "TextRenderer";
    }
    
    public final boolean handleMessage(final Message message) {
        if (message.what == 0) {
            this.s.onCues((List)message.obj);
            return true;
        }
        throw new IllegalStateException();
    }
    
    public final boolean isReady() {
        return true;
    }
    
    public final void m(final long n, long n2) {
        if (super.p) {
            n2 = this.F;
            if (n2 != -9223372036854775807L && n >= n2) {
                this.J();
                this.w = true;
            }
        }
        if (this.w) {
            return;
        }
        if (this.D == null) {
            final g a = this.A;
            a.getClass();
            a.b(n);
            try {
                final g a2 = this.A;
                a2.getClass();
                this.D = (j)((d)a2).c();
            }
            catch (final SubtitleDecoderException ex) {
                this.I(ex);
                return;
            }
        }
        if (super.k != 2) {
            return;
        }
        int n3;
        if (this.C != null) {
            n2 = this.H();
            n3 = 0;
            while (n2 <= n) {
                ++this.E;
                n2 = this.H();
                n3 = 1;
            }
        }
        else {
            n3 = 0;
        }
        final j d = this.D;
        int n4 = n3;
        if (d != null) {
            if (((ab.a)d).n(4)) {
                n4 = n3;
                if (n3 == 0) {
                    n4 = n3;
                    if (this.H() == Long.MAX_VALUE) {
                        if (this.y == 2) {
                            this.J();
                            final g a3 = this.A;
                            a3.getClass();
                            ((d)a3).release();
                            this.A = null;
                            this.y = 0;
                            this.x = true;
                            final h t = this.t;
                            final n z = this.z;
                            z.getClass();
                            this.A = ((h.h$a)t).a(z);
                            n4 = n3;
                        }
                        else {
                            this.J();
                            this.w = true;
                            n4 = n3;
                        }
                    }
                }
            }
            else {
                n4 = n3;
                if (d.g <= n) {
                    final j c = this.C;
                    if (c != null) {
                        c.p();
                    }
                    this.E = d.d(n);
                    this.C = d;
                    this.D = null;
                    n4 = 1;
                }
            }
        }
        if (n4 != 0) {
            this.C.getClass();
            final List<a> f = this.C.f(n);
            final Handler r = this.r;
            if (r != null) {
                r.obtainMessage(0, (Object)f).sendToTarget();
            }
            else {
                this.s.onCues((List)f);
            }
        }
        if (this.y == 2) {
            return;
        }
        try {
            i b = null;
            Block_26: {
                while (!this.v) {
                    if ((b = this.B) == null) {
                        final g a4 = this.A;
                        a4.getClass();
                        b = (i)((d)a4).a();
                        if (b == null) {
                            return;
                        }
                        this.B = b;
                    }
                    if (this.y == 1) {
                        break Block_26;
                    }
                    final int g = this.G(this.u, (DecoderInputBuffer)b, 0);
                    if (g == -4) {
                        if (((ab.a)b).n(4)) {
                            this.v = true;
                            this.x = false;
                        }
                        else {
                            final n n5 = (n)this.u.h;
                            if (n5 == null) {
                                return;
                            }
                            b.n = n5.u;
                            b.w();
                            this.x &= !((ab.a)b).n(1);
                        }
                        if (this.x) {
                            continue;
                        }
                        final g a5 = this.A;
                        a5.getClass();
                        ((d)a5).d(b);
                        this.B = null;
                    }
                    else {
                        if (g == -3) {
                            return;
                        }
                        continue;
                    }
                }
                return;
            }
            ((ab.a)b).f = 4;
            final g a6 = this.A;
            a6.getClass();
            ((d)a6).d(b);
            this.B = null;
            this.y = 2;
        }
        catch (final SubtitleDecoderException ex2) {
            this.I(ex2);
        }
    }
    
    public final void z() {
        this.z = null;
        this.F = -9223372036854775807L;
        final List<Object> emptyList = Collections.emptyList();
        final Handler r = this.r;
        if (r != null) {
            r.obtainMessage(0, (Object)emptyList).sendToTarget();
        }
        else {
            this.s.onCues((List)emptyList);
        }
        this.J();
        final g a = this.A;
        a.getClass();
        ((d)a).release();
        this.A = null;
        this.y = 0;
    }
}
