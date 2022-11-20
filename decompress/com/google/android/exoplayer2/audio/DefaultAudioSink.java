// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.audio;

import ya.o;
import java.lang.reflect.Method;
import ya.j$a;
import bd.s;
import m5.a;
import a4.t0;
import com.google.common.primitives.Ints;
import t5.w;
import com.google.android.exoplayer2.z$a;
import java.nio.ByteOrder;
import a4.b1;
import ya.j;
import android.media.PlaybackParams;
import android.os.SystemClock;
import android.os.Handler;
import a4.u0;
import java.util.Objects;
import android.media.AudioAttributes;
import android.util.Log;
import a4.s1;
import android.media.AudioAttributes$Builder;
import java.util.Arrays;
import bd.p;
import android.util.Pair;
import com.google.android.exoplayer2.n;
import android.media.AudioFormat$Builder;
import android.media.AudioFormat;
import androidx.appcompat.widget.z;
import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;
import bd.c0;
import com.google.android.exoplayer2.v;
import android.media.AudioTrack;
import xa.d0;
import java.util.ArrayDeque;
import android.os.ConditionVariable;
import ya.e;
import ya.k;
import java.nio.ByteBuffer;

public final class DefaultAudioSink implements AudioSink
{
    public int A;
    public long B;
    public long C;
    public long D;
    public long E;
    public int F;
    public boolean G;
    public boolean H;
    public long I;
    public float J;
    public AudioProcessor[] K;
    public ByteBuffer[] L;
    public ByteBuffer M;
    public int N;
    public ByteBuffer O;
    public byte[] P;
    public int Q;
    public int R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public int W;
    public k X;
    public boolean Y;
    public long Z;
    public final e a;
    public boolean a0;
    public final DefaultAudioSink$c b;
    public boolean b0;
    public final boolean c;
    public final d d;
    public final l e;
    public final AudioProcessor[] f;
    public final AudioProcessor[] g;
    public final ConditionVariable h;
    public final b i;
    public final ArrayDeque<DefaultAudioSink.DefaultAudioSink$h> j;
    public final boolean k;
    public final int l;
    public DefaultAudioSink.DefaultAudioSink$k m;
    public final DefaultAudioSink.DefaultAudioSink$i<AudioSink$InitializationException> n;
    public final DefaultAudioSink.DefaultAudioSink$i<AudioSink$WriteException> o;
    public final com.google.android.exoplayer2.audio.e p;
    public d0 q;
    public AudioSink$a r;
    public DefaultAudioSink.DefaultAudioSink$f s;
    public DefaultAudioSink.DefaultAudioSink$f t;
    public AudioTrack u;
    public ya.d v;
    public DefaultAudioSink.DefaultAudioSink$h w;
    public DefaultAudioSink.DefaultAudioSink$h x;
    public v y;
    public ByteBuffer z;
    
    public DefaultAudioSink(final DefaultAudioSink.DefaultAudioSink$e defaultAudioSink$e) {
        this.a = defaultAudioSink$e.a;
        final DefaultAudioSink$c b = defaultAudioSink$e.b;
        this.b = b;
        final int a = c0.a;
        this.c = (a >= 21 && defaultAudioSink$e.c);
        this.k = (a >= 23 && defaultAudioSink$e.d);
        int e;
        if (a >= 29) {
            e = defaultAudioSink$e.e;
        }
        else {
            e = 0;
        }
        this.l = e;
        this.p = defaultAudioSink$e.f;
        this.h = new ConditionVariable(true);
        this.i = new b(new j());
        final d d = new d();
        this.d = d;
        final l e2 = new l();
        this.e = e2;
        final ArrayList<Object> list = new ArrayList<Object>();
        Collections.addAll(list, (c)new h(), (c)d, (c)e2);
        Collections.addAll(list, b.a());
        this.f = list.toArray(new AudioProcessor[0]);
        this.g = new AudioProcessor[] { (AudioProcessor)new f() };
        this.J = 1.0f;
        this.v = ya.d.l;
        this.W = 0;
        this.X = new k();
        final v i = com.google.android.exoplayer2.v.i;
        this.x = new DefaultAudioSink.DefaultAudioSink$h(i, false, 0L, 0L);
        this.y = i;
        this.R = -1;
        this.K = new AudioProcessor[0];
        this.L = new ByteBuffer[0];
        this.j = new ArrayDeque<DefaultAudioSink.DefaultAudioSink$h>();
        this.n = (DefaultAudioSink.DefaultAudioSink$i<AudioSink$InitializationException>)new DefaultAudioSink.DefaultAudioSink$i();
        this.o = (DefaultAudioSink.DefaultAudioSink$i<AudioSink$WriteException>)new DefaultAudioSink.DefaultAudioSink$i();
    }
    
    public static boolean C(final AudioTrack audioTrack) {
        return c0.a >= 29 && z.j(audioTrack);
    }
    
    public static AudioFormat v(final int sampleRate, final int channelMask, final int encoding) {
        return new AudioFormat$Builder().setSampleRate(sampleRate).setChannelMask(channelMask).setEncoding(encoding).build();
    }
    
    public static Pair<Integer, Integer> w(final n n, final e e) {
        final String q = n.q;
        q.getClass();
        final int d = p.d(q, n.n);
        final int n2 = 0;
        final int n3 = 6;
        if (d != 5 && d != 6 && d != 18 && d != 17 && d != 7 && d != 8 && d != 14) {
            return null;
        }
        int n4;
        if (d == 18 && Arrays.binarySearch(e.a, 18) < 0) {
            n4 = 6;
        }
        else if ((n4 = d) == 8) {
            final boolean b = Arrays.binarySearch(e.a, 8) >= 0;
            n4 = d;
            if (!b) {
                n4 = 7;
            }
        }
        if (Arrays.binarySearch(e.a, n4) < 0) {
            return null;
        }
        int d2;
        if (n4 == 18) {
            if (c0.a >= 29) {
                int e2 = n.E;
                if (e2 == -1) {
                    e2 = 48000;
                }
                final AudioAttributes build = new AudioAttributes$Builder().setUsage(1).setContentType(3).build();
                int n5 = 8;
                int n6;
                while (true) {
                    n6 = n2;
                    if (n5 <= 0) {
                        break;
                    }
                    if (s1.q(new AudioFormat$Builder().setEncoding(18).setSampleRate(e2).setChannelMask(c0.p(n5)).build(), build)) {
                        n6 = n5;
                        break;
                    }
                    --n5;
                }
                if ((d2 = n6) == 0) {
                    Log.w("DefaultAudioSink", "E-AC3 JOC encoding supported but no channel count supported");
                    return null;
                }
            }
            else {
                d2 = 6;
            }
        }
        else if ((d2 = n.D) > e.b) {
            return null;
        }
        final int a = c0.a;
        int n7 = 0;
        Label_0389: {
            if (a <= 28) {
                if (d2 == 7) {
                    n7 = 8;
                    break Label_0389;
                }
                n7 = n3;
                if (d2 == 3) {
                    break Label_0389;
                }
                n7 = n3;
                if (d2 == 4) {
                    break Label_0389;
                }
                if (d2 == 5) {
                    n7 = n3;
                    break Label_0389;
                }
            }
            n7 = d2;
        }
        int n8 = n7;
        if (a <= 26) {
            n8 = n7;
            if ("fugu".equals(c0.b) && (n8 = n7) == 1) {
                n8 = 2;
            }
        }
        final int p2 = c0.p(n8);
        if (p2 == 0) {
            return null;
        }
        return (Pair<Integer, Integer>)Pair.create((Object)n4, (Object)p2);
    }
    
    public final void A() throws AudioSink$InitializationException {
        this.h.block();
        int a = 0;
        try {
            final DefaultAudioSink.DefaultAudioSink$f t = this.t;
            t.getClass();
            try {
                final AudioTrack u = t.a(this.Y, this.v, this.W);
            }
            catch (final AudioSink$InitializationException ex) {
                final AudioSink$a r = this.r;
                if (r != null) {
                    ((com.google.android.exoplayer2.audio.g.a)r).a((Exception)ex);
                }
                throw ex;
            }
        }
        catch (final AudioSink$InitializationException o) {
            final DefaultAudioSink.DefaultAudioSink$f t2 = this.t;
            if (t2.h > 1000000) {
                final DefaultAudioSink.DefaultAudioSink$f t3 = new DefaultAudioSink.DefaultAudioSink$f(t2.a, t2.b, t2.c, t2.d, t2.e, t2.f, t2.g, 1000000, t2.i);
                try {
                    final AudioTrack u = t3.a(this.Y, this.v, this.W);
                    try {
                        this.t = t3;
                        this.u = u;
                        if (C(u)) {
                            o = this.u;
                            if (this.m == null) {
                                this.m = new DefaultAudioSink.DefaultAudioSink$k(this);
                            }
                            final DefaultAudioSink.DefaultAudioSink$k m = this.m;
                            final Handler a2 = m.a;
                            Objects.requireNonNull(a2);
                            androidx.appcompat.widget.z.h((AudioTrack)o, new ya.l(a2), m.b);
                            if (this.l != 3) {
                                final AudioTrack u2 = this.u;
                                o = this.t.a;
                                u0.i(u2, ((n)o).G, ((n)o).H);
                            }
                        }
                        if (c0.a >= 31) {
                            final d0 q = this.q;
                            if (q != null) {
                                DefaultAudioSink.DefaultAudioSink$b.a(this.u, q);
                            }
                        }
                        this.W = this.u.getAudioSessionId();
                        o = this.i;
                        final AudioTrack u3 = this.u;
                        final DefaultAudioSink.DefaultAudioSink$f t4 = this.t;
                        ((b)o).c(u3, t4.c == 2, t4.g, t4.d, t4.h);
                        this.I();
                        a = this.X.a;
                        if (a != 0) {
                            this.u.attachAuxEffect(a);
                            this.u.setAuxEffectSendLevel(this.X.b);
                        }
                        this.H = true;
                        return;
                    }
                    catch (final AudioSink$InitializationException ex2) {}
                }
                catch (final AudioSink$InitializationException ex3) {
                    final AudioSink$a r2 = this.r;
                    if (r2 != null) {
                        ((com.google.android.exoplayer2.audio.g.a)r2).a((Exception)ex3);
                    }
                    throw ex3;
                }
                final AudioSink$InitializationException ex2;
                ((Throwable)o).addSuppressed((Throwable)ex2);
            }
            if (this.t.c == 1) {
                a = 1;
            }
            if (a != 0) {
                this.a0 = true;
            }
            throw o;
        }
    }
    
    public final boolean B() {
        return this.u != null;
    }
    
    public final void D() {
        if (!this.T) {
            this.T = true;
            final b i = this.i;
            final long z = this.z();
            i.z = i.a();
            i.x = SystemClock.elapsedRealtime() * 1000L;
            i.A = z;
            this.u.stop();
            this.A = 0;
        }
    }
    
    public final void E(final long n) throws AudioSink$WriteException {
        int i;
        final int n2 = i = this.K.length;
        while (i >= 0) {
            ByteBuffer byteBuffer;
            if (i > 0) {
                byteBuffer = this.L[i - 1];
            }
            else {
                byteBuffer = this.M;
                if (byteBuffer == null) {
                    byteBuffer = AudioProcessor.a;
                }
            }
            if (i == n2) {
                this.L(byteBuffer, n);
            }
            else {
                final AudioProcessor audioProcessor = this.K[i];
                if (i > this.R) {
                    audioProcessor.a(byteBuffer);
                }
                final ByteBuffer output = audioProcessor.getOutput();
                this.L[i] = output;
                if (output.hasRemaining()) {
                    ++i;
                    continue;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            }
            --i;
        }
    }
    
    public final void F() {
        this.B = 0L;
        this.C = 0L;
        this.D = 0L;
        this.E = 0L;
        int n = 0;
        this.b0 = false;
        this.F = 0;
        this.x = new DefaultAudioSink.DefaultAudioSink$h(this.x().a, this.x().b, 0L, 0L);
        this.I = 0L;
        this.w = null;
        this.j.clear();
        this.M = null;
        this.N = 0;
        this.O = null;
        this.T = false;
        this.S = false;
        this.R = -1;
        this.z = null;
        this.A = 0;
        this.e.o = 0L;
        while (true) {
            final AudioProcessor[] k = this.K;
            if (n >= k.length) {
                break;
            }
            final AudioProcessor audioProcessor = k[n];
            audioProcessor.flush();
            this.L[n] = audioProcessor.getOutput();
            ++n;
        }
    }
    
    public final void G(final v v, final boolean b) {
        final DefaultAudioSink.DefaultAudioSink$h x = this.x();
        if (!v.equals(x.a) || b != x.b) {
            final DefaultAudioSink.DefaultAudioSink$h defaultAudioSink$h = new DefaultAudioSink.DefaultAudioSink$h(v, b, -9223372036854775807L, -9223372036854775807L);
            if (this.B()) {
                this.w = defaultAudioSink$h;
            }
            else {
                this.x = defaultAudioSink$h;
            }
        }
    }
    
    public final void H(final v v) {
        v y = v;
        if (this.B()) {
            final PlaybackParams setAudioFallbackMode = new PlaybackParams().allowDefaults().setSpeed(v.f).setPitch(v.g).setAudioFallbackMode(2);
            try {
                this.u.setPlaybackParams(setAudioFallbackMode);
            }
            catch (final IllegalArgumentException ex) {
                ah0.b.K1("DefaultAudioSink", "Failed to set playback params", (Throwable)ex);
            }
            final v v2 = new v(this.u.getPlaybackParams().getSpeed(), this.u.getPlaybackParams().getPitch());
            final b i = this.i;
            i.j = v2.f;
            final ya.j f = i.f;
            y = v2;
            if (f != null) {
                f.a();
                y = v2;
            }
        }
        this.y = y;
    }
    
    public final void I() {
        if (this.B()) {
            if (c0.a >= 21) {
                this.u.setVolume(this.J);
            }
            else {
                final AudioTrack u = this.u;
                final float j = this.J;
                u.setStereoVolume(j, j);
            }
        }
    }
    
    public final boolean J() {
        final boolean y = this.Y;
        boolean b = true;
        if (!y && "audio/raw".equals(this.t.a.q)) {
            final int f = this.t.a.F;
            boolean b2 = false;
            Label_0094: {
                if (this.c) {
                    final int a = c0.a;
                    if (f == 536870912 || f == 805306368 || f == 4) {
                        b2 = true;
                        break Label_0094;
                    }
                }
                b2 = false;
            }
            if (!b2) {
                return b;
            }
        }
        b = false;
        return b;
    }
    
    public final boolean K(final n n, final ya.d d) {
        final int a = c0.a;
        boolean b2;
        final boolean b = b2 = false;
        if (a >= 29) {
            if (this.l == 0) {
                b2 = b;
            }
            else {
                final String q = n.q;
                q.getClass();
                final int d2 = bd.p.d(q, n.n);
                if (d2 == 0) {
                    return false;
                }
                final int p2 = c0.p(n.D);
                if (p2 == 0) {
                    return false;
                }
                final AudioFormat v = v(n.E, p2, d2);
                final AudioAttributes a2 = d.a();
                int a3;
                if (a >= 31) {
                    a3 = b1.a(v, a2);
                }
                else if (!s1.t(v, a2)) {
                    a3 = 0;
                }
                else if (a == 30 && c0.d.startsWith("Pixel")) {
                    a3 = 2;
                }
                else {
                    a3 = 1;
                }
                b2 = b;
                if (a3 != 0) {
                    if (a3 != 1) {
                        if (a3 == 2) {
                            return true;
                        }
                        throw new IllegalStateException();
                    }
                    else {
                        final boolean b3 = n.G != 0 || n.H != 0;
                        final boolean b4 = this.l == 1;
                        if (b3) {
                            b2 = b;
                            if (b4) {
                                return b2;
                            }
                        }
                        b2 = true;
                    }
                }
            }
        }
        return b2;
    }
    
    public final void L(final ByteBuffer o, long n) throws AudioSink$WriteException {
        if (!o.hasRemaining()) {
            return;
        }
        final ByteBuffer o2 = this.O;
        final boolean b = false;
        boolean b2 = false;
        if (o2 != null) {
            ah0.b.C(o2 == o);
        }
        else {
            this.O = o;
            if (c0.a < 21) {
                final int remaining = o.remaining();
                final byte[] p2 = this.P;
                if (p2 == null || p2.length < remaining) {
                    this.P = new byte[remaining];
                }
                final int position = o.position();
                o.get(this.P, 0, remaining);
                o.position(position);
                this.Q = 0;
            }
        }
        final int remaining2 = o.remaining();
        final int a = c0.a;
        int n3 = 0;
        Label_0504: {
            Label_0447: {
                if (a < 21) {
                    final b i = this.i;
                    final int n2 = i.e - (int)(this.D - i.a() * i.d);
                    if (n2 > 0) {
                        final int write = this.u.write(this.P, this.Q, Math.min(remaining2, n2));
                        if ((n3 = write) > 0) {
                            this.Q += write;
                            o.position(o.position() + write);
                            n3 = write;
                        }
                        break Label_0504;
                    }
                }
                else {
                    if (!this.Y) {
                        n3 = this.u.write(o, remaining2, 1);
                        break Label_0504;
                    }
                    ah0.b.H(n != -9223372036854775807L);
                    final AudioTrack u = this.u;
                    if (a >= 26) {
                        n3 = u.write(o, remaining2, 1, n * 1000L);
                        break Label_0504;
                    }
                    if (this.z == null) {
                        (this.z = ByteBuffer.allocate(16)).order(ByteOrder.BIG_ENDIAN);
                        this.z.putInt(1431633921);
                    }
                    if (this.A == 0) {
                        this.z.putInt(4, remaining2);
                        this.z.putLong(8, n * 1000L);
                        this.z.position(0);
                        this.A = remaining2;
                    }
                    final int remaining3 = this.z.remaining();
                    if (remaining3 > 0) {
                        n3 = u.write(this.z, remaining3, 1);
                        if (n3 < 0) {
                            this.A = 0;
                            break Label_0504;
                        }
                        if (n3 < remaining3) {
                            break Label_0447;
                        }
                    }
                    n3 = u.write(o, remaining2, 1);
                    if (n3 < 0) {
                        this.A = 0;
                        break Label_0504;
                    }
                    this.A -= n3;
                    break Label_0504;
                }
            }
            n3 = 0;
        }
        this.Z = SystemClock.elapsedRealtime();
        if (n3 >= 0) {
            this.o.a = null;
            if (C(this.u)) {
                n = this.E;
                if (n > 0L) {
                    this.b0 = false;
                }
                if (this.U && this.r != null && n3 < remaining2 && !this.b0) {
                    final b j = this.i;
                    n = c0.U((n - j.a()) * 1000000L / j.g);
                    final z$a u2 = ((com.google.android.exoplayer2.audio.g.a)this.r).a.U0;
                    if (u2 != null) {
                        u2.b(n);
                    }
                }
            }
            final int c = this.t.c;
            if (c == 0) {
                this.D += n3;
            }
            if (n3 == remaining2) {
                if (c != 0) {
                    boolean b3 = b;
                    if (o == this.M) {
                        b3 = true;
                    }
                    ah0.b.H(b3);
                    this.E += this.F * this.N;
                }
                this.O = null;
            }
            return;
        }
        final boolean b4 = (a >= 24 && n3 == -6) || n3 == -32;
        if (b4) {
            if (this.t.c == 1) {
                b2 = true;
            }
            if (b2) {
                this.a0 = true;
            }
        }
        final AudioSink$WriteException ex = new AudioSink$WriteException(n3, this.t.a, b4);
        final AudioSink$a r = this.r;
        if (r != null) {
            ((com.google.android.exoplayer2.audio.g.a)r).a((Exception)ex);
        }
        if (!ex.isRecoverable) {
            this.o.a((Exception)ex);
            return;
        }
        throw ex;
    }
    
    public final boolean a(final n n) {
        return this.m(n) != 0;
    }
    
    public final boolean b() {
        return !this.B() || (this.S && !this.j());
    }
    
    public final v c() {
        v v;
        if (this.k) {
            v = this.y;
        }
        else {
            v = this.x().a;
        }
        return v;
    }
    
    public final void d(final n n, int[] i) throws AudioSink$ConfigurationException {
        final boolean equals = "audio/raw".equals(n.q);
        boolean b = false;
        int x = -1;
        int x2;
        int c;
        int n3;
        int p2;
        AudioProcessor[] array3;
        int n4;
        if (equals) {
            ah0.b.C(c0.H(n.F));
            x2 = c0.x(n.F, n.D);
            final int f = n.F;
            AudioProcessor[] array;
            if (this.c && (f == 536870912 || f == 805306368 || f == 4)) {
                array = this.g;
            }
            else {
                array = this.f;
            }
            final l e = this.e;
            final int g = n.G;
            final int h = n.H;
            e.i = g;
            e.j = h;
            if (c0.a < 21 && n.D == 8 && i == null) {
                final int[] array2 = new int[6];
                int n2 = 0;
                while (true) {
                    i = array2;
                    if (n2 >= 6) {
                        break;
                    }
                    array2[n2] = n2;
                    ++n2;
                }
            }
            this.d.i = i;
            AudioProcessor$a audioProcessor$a = new AudioProcessor$a(n.E, n.D, n.F);
            final int length = array.length;
            int j = 0;
            while (j < length) {
                final AudioProcessor audioProcessor = array[j];
                try {
                    final AudioProcessor$a d = audioProcessor.d(audioProcessor$a);
                    if (audioProcessor.isActive()) {
                        audioProcessor$a = d;
                    }
                    ++j;
                    continue;
                }
                catch (final AudioProcessor$UnhandledAudioFormatException ex) {
                    throw new AudioSink$ConfigurationException((Throwable)ex, n);
                }
                break;
            }
            c = audioProcessor$a.c;
            n3 = audioProcessor$a.a;
            p2 = c0.p(audioProcessor$a.b);
            x = c0.x(c, audioProcessor$a.b);
            array3 = array;
            n4 = 0;
        }
        else {
            n3 = n.E;
            int n5;
            int n6;
            int n7;
            if (this.K(n, this.v)) {
                final String q = n.q;
                q.getClass();
                n5 = bd.p.d(q, n.n);
                n6 = c0.p(n.D);
                n7 = 1;
            }
            else {
                final Pair<Integer, Integer> w = w(n, this.a);
                if (w == null) {
                    final String value = String.valueOf(n);
                    throw new AudioSink$ConfigurationException(t5.w.f(value.length() + 37, "Unable to configure passthrough for: ", value), n);
                }
                n5 = (int)w.first;
                n6 = (int)w.second;
                n7 = 2;
            }
            array3 = new AudioProcessor[0];
            final int n8 = -1;
            final int n9 = n5;
            p2 = n6;
            n4 = n7;
            c = n9;
            x2 = n8;
        }
        final com.google.android.exoplayer2.audio.e p3 = this.p;
        final int minBufferSize = AudioTrack.getMinBufferSize(n3, p2, c);
        if (minBufferSize != -2) {
            b = true;
        }
        ah0.b.H(b);
        double n10;
        if (this.k) {
            n10 = 8.0;
        }
        else {
            n10 = 1.0;
        }
        p3.getClass();
        int n11 = 250000;
        int n12;
        if (n4 != 0) {
            if (n4 != 1) {
                if (n4 != 2) {
                    throw new IllegalArgumentException();
                }
                if (c == 5) {
                    n11 = 500000;
                }
                n12 = Ints.s0(n11 * (long)com.google.android.exoplayer2.audio.e.a(c) / 1000000L);
            }
            else {
                n12 = Ints.s0(50000000 * (long)com.google.android.exoplayer2.audio.e.a(c) / 1000000L);
            }
        }
        else {
            final long n13 = 250000;
            final long n14 = n3;
            final long n15 = x;
            n12 = c0.i(minBufferSize * 4, Ints.s0(n13 * n14 * n15 / 1000000L), Ints.s0(750000 * n14 * n15 / 1000000L));
        }
        final int n16 = (Math.max(minBufferSize, (int)(n12 * n10)) + x - 1) / x;
        if (c == 0) {
            final String value2 = String.valueOf(n);
            final StringBuilder sb = new StringBuilder(value2.length() + 48);
            sb.append("Invalid output encoding (mode=");
            sb.append(n4);
            sb.append(") for: ");
            sb.append(value2);
            throw new AudioSink$ConfigurationException(sb.toString(), n);
        }
        if (p2 != 0) {
            this.a0 = false;
            final DefaultAudioSink.DefaultAudioSink$f defaultAudioSink$f = new DefaultAudioSink.DefaultAudioSink$f(n, x2, n4, x, n3, p2, c, n16 * x, array3);
            if (this.B()) {
                this.s = defaultAudioSink$f;
            }
            else {
                this.t = defaultAudioSink$f;
            }
            return;
        }
        final String value3 = String.valueOf(n);
        final StringBuilder sb2 = new StringBuilder(value3.length() + 54);
        sb2.append("Invalid output channel config (mode=");
        sb2.append(n4);
        sb2.append(") for: ");
        sb2.append(value3);
        throw new AudioSink$ConfigurationException(sb2.toString(), n);
    }
    
    public final void e(v v) {
        v = new v(c0.h(v.f, 0.1f, 8.0f), c0.h(v.g, 0.1f, 8.0f));
        if (this.k && c0.a >= 23) {
            this.H(v);
        }
        else {
            this.G(v, this.x().b);
        }
    }
    
    public final void f() {
        if (this.Y) {
            this.Y = false;
            this.flush();
        }
    }
    
    public final void flush() {
        if (this.B()) {
            this.F();
            final AudioTrack c = this.i.c;
            c.getClass();
            if (c.getPlayState() == 3) {
                this.u.pause();
            }
            if (C(this.u)) {
                final DefaultAudioSink.DefaultAudioSink$k m = this.m;
                m.getClass();
                s1.l(this.u, m.b);
                m.a.removeCallbacksAndMessages((Object)null);
            }
            final AudioTrack u = this.u;
            this.u = null;
            if (c0.a < 21 && !this.V) {
                this.W = 0;
            }
            final DefaultAudioSink.DefaultAudioSink$f s = this.s;
            if (s != null) {
                this.t = s;
                this.s = null;
            }
            final b i = this.i;
            i.l = 0L;
            i.w = 0;
            i.v = 0;
            i.m = 0L;
            i.C = 0L;
            i.F = 0L;
            i.k = false;
            i.c = null;
            i.f = null;
            this.h.close();
            ((Thread)new DefaultAudioSink$a(this, u)).start();
        }
        this.o.a = null;
        this.n.a = null;
    }
    
    public final void g() {
        ah0.b.H(c0.a >= 21);
        ah0.b.H(this.V);
        if (!this.Y) {
            this.Y = true;
            this.flush();
        }
    }
    
    public final void h(final com.google.android.exoplayer2.audio.g.a r) {
        this.r = (AudioSink$a)r;
    }
    
    public final void i(final d0 q) {
        this.q = q;
    }
    
    public final boolean j() {
        return this.B() && this.i.b(this.z());
    }
    
    public final void k(final int w) {
        if (this.W != w) {
            this.W = w;
            this.V = (w != 0);
            this.flush();
        }
    }
    
    public final boolean l(long z, int n, final ByteBuffer m) throws AudioSink$InitializationException, AudioSink$WriteException {
        final ByteBuffer i = this.M;
        ah0.b.C(i == null || m == i);
        final DefaultAudioSink.DefaultAudioSink$f s = this.s;
        final int n2 = 3;
        if (s != null) {
            if (!this.u()) {
                return false;
            }
            final DefaultAudioSink.DefaultAudioSink$f s2 = this.s;
            final DefaultAudioSink.DefaultAudioSink$f t = this.t;
            s2.getClass();
            if (t.c != s2.c || t.g != s2.g || t.e != s2.e || t.f != s2.f || t.d != s2.d) {
                this.D();
                if (this.j()) {
                    return false;
                }
                this.flush();
            }
            else {
                this.t = this.s;
                this.s = null;
                if (C(this.u) && this.l != 3) {
                    t0.g(this.u);
                    final AudioTrack u = this.u;
                    final n a = this.t.a;
                    u0.i(u, a.G, a.H);
                    this.b0 = true;
                }
            }
            this.t(z);
        }
        if (!this.B()) {
            try {
                this.A();
            }
            catch (final AudioSink$InitializationException ex) {
                if (!ex.isRecoverable) {
                    this.n.a((Exception)ex);
                    return false;
                }
                throw ex;
            }
        }
        this.n.a = null;
        if (this.H) {
            this.I = Math.max(0L, z);
            this.G = false;
            this.H = false;
            if (this.k && c0.a >= 23) {
                this.H(this.y);
            }
            this.t(z);
            if (this.U) {
                this.play();
            }
        }
        final b j = this.i;
        final long z2 = this.z();
        final AudioTrack c = j.c;
        c.getClass();
        final int playState = c.getPlayState();
        boolean b = false;
        Label_0506: {
            Label_0441: {
                if (j.h) {
                    if (playState == 2) {
                        j.p = false;
                    }
                    else if (playState != 1 || j.a() != 0L) {
                        break Label_0441;
                    }
                    b = false;
                    break Label_0506;
                }
            }
            final boolean p3 = j.p;
            final boolean b2 = j.b(z2);
            j.p = b2;
            if (p3 && !b2 && playState != 1) {
                j.a.d(j.e, c0.U(j.i));
            }
            b = true;
        }
        if (!b) {
            return false;
        }
        if (this.M == null) {
            ah0.b.C(m.order() == ByteOrder.LITTLE_ENDIAN);
            if (!m.hasRemaining()) {
                return true;
            }
            final DefaultAudioSink.DefaultAudioSink$f t2 = this.t;
            if (t2.c != 0 && this.F == 0) {
                final int g = t2.g;
                int f = 1024;
            Label_1298:
                while (true) {
                    switch (g) {
                        default: {
                            throw new IllegalStateException(m5.a.c(38, "Unexpected audio encoding: ", g));
                        }
                        case 14: {
                            final int position = m.position();
                            final int limit = m.limit();
                            int k = position;
                            while (true) {
                                while (k <= limit - 10) {
                                    final int a2 = c0.a;
                                    int n3 = m.getInt(k + 4);
                                    if (m.order() != ByteOrder.BIG_ENDIAN) {
                                        n3 = Integer.reverseBytes(n3);
                                    }
                                    if ((n3 & 0xFFFFFFFE) == 0xF8726FBA) {
                                        final int n4 = k - position;
                                        if (n4 == -1) {
                                            f = 0;
                                            break Label_1298;
                                        }
                                        final boolean b3 = (m.get(m.position() + n4 + 7) & 0xFF) == 0xBB;
                                        final int position2 = m.position();
                                        int n5;
                                        if (b3) {
                                            n5 = 9;
                                        }
                                        else {
                                            n5 = 8;
                                        }
                                        f = (40 << (m.get(position2 + n4 + n5) >> 4 & 0x7)) * 16;
                                        break Label_1298;
                                    }
                                    else {
                                        ++k;
                                    }
                                }
                                final int n4 = -1;
                                continue;
                            }
                        }
                        case 9: {
                            final int position3 = m.position();
                            final int a3 = c0.a;
                            int n6 = m.getInt(position3);
                            if (m.order() != ByteOrder.BIG_ENDIAN) {
                                n6 = Integer.reverseBytes(n6);
                            }
                            f = ya.n.b(n6);
                            if (f != -1) {
                                break Label_1298;
                            }
                            throw new IllegalArgumentException();
                        }
                        case 5:
                        case 6:
                        case 18: {
                            if ((m.get(m.position() + 5) & 0xF8) >> 3 > 10) {
                                int n7;
                                if ((m.get(m.position() + 4) & 0xC0) >> 6 == 3) {
                                    n7 = n2;
                                }
                                else {
                                    n7 = (m.get(m.position() + 4) & 0x30) >> 4;
                                }
                                f = ya.b.a[n7] * 256;
                                break Label_1298;
                            }
                            f = 1536;
                            break Label_1298;
                        }
                        case 10:
                        case 16: {
                            this.F = f;
                            if (f == 0) {
                                return true;
                            }
                            break;
                        }
                        case 17: {
                            final byte[] array = new byte[16];
                            final int position4 = m.position();
                            m.get(array);
                            m.position(position4);
                            f = ya.c.b(new s(array, 16)).c;
                            continue Label_1298;
                        }
                        case 15: {
                            f = 512;
                            continue Label_1298;
                        }
                        case 11:
                        case 12: {
                            f = 2048;
                            continue Label_1298;
                        }
                        case 7:
                        case 8: {
                            final int position5 = m.position();
                            final byte value = m.get(position5);
                            int n8 = 0;
                            int n9 = 0;
                            Label_1175: {
                                byte b4 = 0;
                                Label_1167: {
                                    if (value != -2) {
                                        byte b5;
                                        if (value != -1) {
                                            if (value != 31) {
                                                n8 = (m.get(position5 + 4) & 0x1) << 6;
                                                b4 = m.get(position5 + 5);
                                                break Label_1167;
                                            }
                                            n8 = (m.get(position5 + 5) & 0x7) << 4;
                                            b5 = m.get(position5 + 6);
                                        }
                                        else {
                                            n8 = (m.get(position5 + 4) & 0x7) << 4;
                                            b5 = m.get(position5 + 7);
                                        }
                                        n9 = (b5 & 0x3C);
                                        break Label_1175;
                                    }
                                    n8 = (m.get(position5 + 5) & 0x1) << 6;
                                    b4 = m.get(position5 + 4);
                                }
                                n9 = (b4 & 0xFC);
                            }
                            f = ((n9 >> 2 | n8) + 1) * 32;
                            continue Label_1298;
                        }
                    }
                    break;
                }
            }
            if (this.w != null) {
                if (!this.u()) {
                    return false;
                }
                this.t(z);
                this.w = null;
            }
            final long n10 = (this.y() - this.e.o) * 1000000L / this.t.a.E + this.I;
            if (!this.G && Math.abs(n10 - z) > 200000L) {
                ((com.google.android.exoplayer2.audio.g.a)this.r).a((Exception)new AudioSink$UnexpectedDiscontinuityException(z, n10));
                this.G = true;
            }
            if (this.G) {
                if (!this.u()) {
                    return false;
                }
                final long n11 = z - n10;
                this.I += n11;
                this.G = false;
                this.t(z);
                final AudioSink$a r = this.r;
                if (r != null && n11 != 0L) {
                    ((com.google.android.exoplayer2.audio.g.a)r).a.S0 = true;
                }
            }
            if (this.t.c == 0) {
                this.B += m.remaining();
            }
            else {
                this.C += this.F * n;
            }
            this.M = m;
            this.N = n;
        }
        this.E(z);
        if (!this.M.hasRemaining()) {
            this.M = null;
            this.N = 0;
            return true;
        }
        final b l = this.i;
        z = this.z();
        if (l.y != -9223372036854775807L && z > 0L && SystemClock.elapsedRealtime() - l.y >= 200L) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (n != 0) {
            Log.w("DefaultAudioSink", "Resetting stalled audio track");
            this.flush();
            return true;
        }
        return false;
    }
    
    public final int m(final n n) {
        final boolean equals = "audio/raw".equals(n.q);
        boolean b = true;
        if (equals) {
            if (!c0.H(n.F)) {
                ph0.a.h(33, "Invalid PCM encoding: ", n.F, "DefaultAudioSink");
                return 0;
            }
            final int f = n.F;
            if (f != 2 && (!this.c || f != 4)) {
                return 1;
            }
            return 2;
        }
        else {
            if (!this.a0 && this.K(n, this.v)) {
                return 2;
            }
            if (w(n, this.a) == null) {
                b = false;
            }
            if (b) {
                return 2;
            }
            return 0;
        }
    }
    
    public final void n(final ya.d v) {
        if (this.v.equals((Object)v)) {
            return;
        }
        this.v = v;
        if (this.Y) {
            return;
        }
        this.flush();
    }
    
    public final void o() throws AudioSink$WriteException {
        if (!this.S && this.B() && this.u()) {
            this.D();
            this.S = true;
        }
    }
    
    public final long p(final boolean b) {
        if (!this.B() || this.H) {
            return Long.MIN_VALUE;
        }
        Object o = this.i;
        final AudioTrack c = ((b)o).c;
        c.getClass();
        Label_0905: {
            if (c.getPlayState() != 3) {
                break Label_0905;
            }
            final long n = ((b)o).a() * 1000000L / ((b)o).g;
            if (n == 0L) {
                break Label_0905;
            }
            long n2 = System.nanoTime() / 1000L;
            if (n2 - ((b)o).m >= 30000L) {
                final long[] b2 = ((b)o).b;
                final int v = ((b)o).v;
                b2[v] = n - n2;
                ((b)o).v = (v + 1) % 10;
                final int w = ((b)o).w;
                if (w < 10) {
                    ((b)o).w = w + 1;
                }
                ((b)o).m = n2;
                ((b)o).l = 0L;
                int n3 = 0;
                while (true) {
                    final int w2 = ((b)o).w;
                    if (n3 >= w2) {
                        break;
                    }
                    ((b)o).l += ((b)o).b[n3] / w2;
                    ++n3;
                }
            }
            if (((b)o).h) {
                break Label_0905;
            }
            final ya.j f = ((b)o).f;
            f.getClass();
            final j$a a = f.a;
            boolean b4 = false;
            Label_0578: {
                if (a != null) {
                    if (n2 - f.e >= f.d) {
                        f.e = n2;
                        final boolean timestamp = a.a.getTimestamp(a.b);
                        if (timestamp) {
                            final long framePosition = a.b.framePosition;
                            if (a.d > framePosition) {
                                ++a.c;
                            }
                            a.d = framePosition;
                            a.e = framePosition + (a.c << 32);
                        }
                        final int b3 = f.b;
                        if (b3 != 0) {
                            if (b3 != 1) {
                                if (b3 != 2) {
                                    if (b3 != 3) {
                                        if (b3 == 4) {
                                            b4 = timestamp;
                                            break Label_0578;
                                        }
                                        throw new IllegalStateException();
                                    }
                                    else {
                                        b4 = timestamp;
                                        if (timestamp) {
                                            f.a();
                                            b4 = timestamp;
                                        }
                                        break Label_0578;
                                    }
                                }
                                else {
                                    b4 = timestamp;
                                    if (!timestamp) {
                                        f.a();
                                        b4 = timestamp;
                                    }
                                    break Label_0578;
                                }
                            }
                            else {
                                if (!timestamp) {
                                    f.a();
                                    b4 = timestamp;
                                    break Label_0578;
                                }
                                b4 = timestamp;
                                if (f.a.e > f.f) {
                                    f.b(2);
                                    b4 = timestamp;
                                }
                                break Label_0578;
                            }
                        }
                        else if (timestamp) {
                            final j$a a2 = f.a;
                            if (a2.b.nanoTime / 1000L >= f.c) {
                                f.f = a2.e;
                                f.b(1);
                                b4 = timestamp;
                                break Label_0578;
                            }
                        }
                        else {
                            b4 = timestamp;
                            if (n2 - f.c > 500000L) {
                                f.b(3);
                                b4 = timestamp;
                            }
                            break Label_0578;
                        }
                    }
                }
                b4 = false;
            }
            if (b4) {
                final j$a a3 = f.a;
                long n4;
                if (a3 != null) {
                    n4 = a3.b.nanoTime / 1000L;
                }
                else {
                    n4 = -9223372036854775807L;
                }
                long e;
                if (a3 != null) {
                    e = a3.e;
                }
                else {
                    e = -1L;
                }
                if (Math.abs(n4 - n2) > 5000000L) {
                    ((b)o).a.c(e, n4, n2, n);
                    f.b(4);
                }
                else if (Math.abs(e * 1000000L / ((b)o).g - n) > 5000000L) {
                    ((b)o).a.b(e, n4, n2, n);
                    f.b(4);
                }
                else if (f.b == 4) {
                    f.a();
                }
            }
            if (!((b)o).q) {
                break Label_0905;
            }
            final Method n5 = ((b)o).n;
            if (n5 == null || n2 - ((b)o).r < 500000L) {
                break Label_0905;
            }
        Label_0889_Outer:
            while (true) {
                AudioTrack c2 = null;
                try {
                    c2 = ((b)o).c;
                    c2.getClass();
                    final Method method = n5;
                    final AudioTrack audioTrack = c2;
                    final int n6 = 0;
                    final Object[] array = new Object[n6];
                    final Object o2 = method.invoke(audioTrack, array);
                    final Integer n7 = (Integer)o2;
                    final int n8 = c0.a;
                    final Integer n9 = n7;
                    final int n10 = n9;
                    final long n11 = n10;
                    final long n12 = 1000L;
                    final long n13 = n11 * n12;
                    final b b5 = (b)o;
                    final long n14 = b5.i;
                    final long n15 = n13 - n14;
                    final b b6 = (b)o;
                    final long n16 = n15;
                    b6.o = n16;
                    final long n17 = n15;
                    final long n18 = 0L;
                    final long n19 = Math.max(n17, n18);
                    final b b7 = (b)o;
                    final long n20 = n19;
                    b7.o = n20;
                    final long n21 = n19;
                    final long n22 = 5000000L;
                    final long n23 = lcmp(n21, n22);
                    if (n23 > 0) {
                        final b b8 = (b)o;
                        final b$a b$a = b8.a;
                        final long n24 = n19;
                        b$a.e(n24);
                        final b b9 = (b)o;
                        final long n25 = 0L;
                        b9.o = n25;
                        break Label_0895;
                    }
                    break Label_0895;
                }
                catch (final Exception ex) {}
                while (true) {
                    try {
                        final Method method = n5;
                        final AudioTrack audioTrack = c2;
                        final int n6 = 0;
                        final Object[] array = new Object[n6];
                        final Object o2 = method.invoke(audioTrack, array);
                        final Integer n7 = (Integer)o2;
                        final int n8 = c0.a;
                        final Integer n9 = n7;
                        final int n10 = n9;
                        final long n11 = n10;
                        final long n12 = 1000L;
                        final long n13 = n11 * n12;
                        final b b5 = (b)o;
                        final long n14 = b5.i;
                        final long n15 = n13 - n14;
                        final b b6 = (b)o;
                        final long n16 = n15;
                        b6.o = n16;
                        final long n17 = n15;
                        final long n18 = 0L;
                        final long n19 = Math.max(n17, n18);
                        final b b7 = (b)o;
                        final long n20 = n19;
                        b7.o = n20;
                        final long n21 = n19;
                        final long n22 = 5000000L;
                        final long n23 = lcmp(n21, n22);
                        if (n23 > 0) {
                            final b b8 = (b)o;
                            final b$a b$a = b8.a;
                            final long n24 = n19;
                            b$a.e(n24);
                            final b b9 = (b)o;
                            final long n25 = 0L;
                            b9.o = n25;
                        }
                        ((b)o).r = n2;
                        boolean d = false;
                        n2 = System.nanoTime() / 1000L;
                        final ya.j f2 = ((b)o).f;
                        f2.getClass();
                        if (f2.b == 2) {
                            d = true;
                        }
                        long max;
                        if (d) {
                            final j$a a4 = f2.a;
                            long e2;
                            if (a4 != null) {
                                e2 = a4.e;
                            }
                            else {
                                e2 = -1L;
                            }
                            final long n26 = e2 * 1000000L / ((b)o).g;
                            long n27;
                            if (a4 != null) {
                                n27 = a4.b.nanoTime / 1000L;
                            }
                            else {
                                n27 = -9223372036854775807L;
                            }
                            max = c0.u(((b)o).j, n2 - n27) + n26;
                        }
                        else {
                            long n28;
                            if (((b)o).w == 0) {
                                n28 = ((b)o).a() * 1000000L / ((b)o).g;
                            }
                            else {
                                n28 = ((b)o).l + n2;
                            }
                            max = n28;
                            if (!b) {
                                max = Math.max(0L, n28 - ((b)o).o);
                            }
                        }
                        if (((b)o).D != d) {
                            ((b)o).F = ((b)o).C;
                            ((b)o).E = ((b)o).B;
                        }
                        final long n29 = n2 - ((b)o).F;
                        long b10 = max;
                        if (n29 < 1000000L) {
                            final long e3 = ((b)o).E;
                            final long u = c0.u(((b)o).j, n29);
                            final long n30 = n29 * 1000L / 1000000L;
                            b10 = ((1000L - n30) * (u + e3) + max * n30) / 1000L;
                        }
                        if (!((b)o).k) {
                            final long b11 = ((b)o).B;
                            if (b10 > b11) {
                                ((b)o).k = true;
                                ((b)o).a.a(System.currentTimeMillis() - c0.U(c0.y(((b)o).j, c0.U(b10 - b11))));
                            }
                        }
                        ((b)o).C = n2;
                        ((b)o).B = b10;
                        ((b)o).D = d;
                        o = this.t;
                        final long min = Math.min(b10, this.z() * 1000000L / ((DefaultAudioSink.DefaultAudioSink$f)o).e);
                        while (!this.j.isEmpty() && min >= this.j.getFirst().d) {
                            this.x = this.j.remove();
                        }
                        o = this.x;
                        final long n31 = min - ((DefaultAudioSink.DefaultAudioSink$h)o).d;
                        long n32;
                        if (((DefaultAudioSink.DefaultAudioSink$h)o).a.equals(com.google.android.exoplayer2.v.i)) {
                            n32 = this.x.c + n31;
                        }
                        else if (this.j.isEmpty()) {
                            n32 = this.b.d(n31) + this.x.c;
                        }
                        else {
                            o = this.j.getFirst();
                            n32 = ((DefaultAudioSink.DefaultAudioSink$h)o).c - c0.u(this.x.a.f, ((DefaultAudioSink.DefaultAudioSink$h)o).d - min);
                        }
                        o = this.t;
                        return this.b.c() * 1000000L / ((DefaultAudioSink.DefaultAudioSink$f)o).e + n32;
                        ((b)o).n = null;
                        continue Label_0889_Outer;
                    }
                    catch (final Exception ex2) {
                        continue;
                    }
                    break;
                }
                break;
            }
        }
    }
    
    public final void pause() {
        boolean b = false;
        this.U = false;
        if (this.B()) {
            final b i = this.i;
            i.l = 0L;
            i.w = 0;
            i.v = 0;
            i.m = 0L;
            i.C = 0L;
            i.F = 0L;
            i.k = false;
            if (i.x == -9223372036854775807L) {
                final ya.j f = i.f;
                f.getClass();
                f.a();
                b = true;
            }
            if (b) {
                this.u.pause();
            }
        }
    }
    
    public final void play() {
        this.U = true;
        if (this.B()) {
            final ya.j f = this.i.f;
            f.getClass();
            f.a();
            this.u.play();
        }
    }
    
    public final void q() {
        this.G = true;
    }
    
    public final void r(final boolean b) {
        this.G(this.x().a, b);
    }
    
    public final void reset() {
        this.flush();
        final AudioProcessor[] f = this.f;
        for (int length = f.length, i = 0; i < length; ++i) {
            f[i].reset();
        }
        final AudioProcessor[] g = this.g;
        for (int length2 = g.length, j = 0; j < length2; ++j) {
            g[j].reset();
        }
        this.U = false;
        this.a0 = false;
    }
    
    public final void s(final k x) {
        if (this.X.equals((Object)x)) {
            return;
        }
        final int a = x.a;
        final float b = x.b;
        final AudioTrack u = this.u;
        if (u != null) {
            if (this.X.a != a) {
                u.attachAuxEffect(a);
            }
            if (a != 0) {
                this.u.setAuxEffectSendLevel(b);
            }
        }
        this.X = x;
    }
    
    public final void setVolume(final float j) {
        if (this.J != j) {
            this.J = j;
            this.I();
        }
    }
    
    public final void t(long max) {
        v v;
        if (this.J()) {
            v = this.b.b(this.x().a);
        }
        else {
            v = com.google.android.exoplayer2.v.i;
        }
        final boolean b = this.J() && this.b.e(this.x().b);
        final ArrayDeque<DefaultAudioSink.DefaultAudioSink$h> j = this.j;
        max = Math.max(0L, max);
        j.add(new DefaultAudioSink.DefaultAudioSink$h(v, b, max, this.z() * 1000000L / this.t.e));
        final AudioProcessor[] i = this.t.i;
        final ArrayList<AudioProcessor> list = new ArrayList<AudioProcessor>();
        for (final AudioProcessor audioProcessor : i) {
            if (audioProcessor.isActive()) {
                list.add(audioProcessor);
            }
            else {
                audioProcessor.flush();
            }
        }
        final int size = list.size();
        this.K = list.toArray(new AudioProcessor[size]);
        this.L = new ByteBuffer[size];
        int n = 0;
        while (true) {
            final AudioProcessor[] l = this.K;
            if (n >= l.length) {
                break;
            }
            final AudioProcessor audioProcessor2 = l[n];
            audioProcessor2.flush();
            this.L[n] = audioProcessor2.getOutput();
            ++n;
        }
        final AudioSink$a r = this.r;
        if (r != null) {
            final a$a l2 = ((com.google.android.exoplayer2.audio.g.a)r).a.L0;
            final Handler a = l2.a;
            if (a != null) {
                a.post((Runnable)new ya.h((Object)l2, b, 0));
            }
        }
    }
    
    public final boolean u() throws AudioSink$WriteException {
        while (true) {
            boolean b = false;
            Label_0020: {
                if (this.R != -1) {
                    b = false;
                    break Label_0020;
                }
                this.R = 0;
                b = true;
            }
            final int r = this.R;
            final AudioProcessor[] k = this.K;
            if (r >= k.length) {
                final ByteBuffer o = this.O;
                if (o != null) {
                    this.L(o, -9223372036854775807L);
                    if (this.O != null) {
                        return false;
                    }
                }
                this.R = -1;
                return true;
            }
            final AudioProcessor audioProcessor = k[r];
            if (b) {
                audioProcessor.c();
            }
            this.E(-9223372036854775807L);
            if (!audioProcessor.b()) {
                return false;
            }
            ++this.R;
            continue;
        }
    }
    
    public final DefaultAudioSink.DefaultAudioSink$h x() {
        DefaultAudioSink.DefaultAudioSink$h defaultAudioSink$h = this.w;
        if (defaultAudioSink$h == null) {
            if (!this.j.isEmpty()) {
                defaultAudioSink$h = this.j.getLast();
            }
            else {
                defaultAudioSink$h = this.x;
            }
        }
        return defaultAudioSink$h;
    }
    
    public final long y() {
        final DefaultAudioSink.DefaultAudioSink$f t = this.t;
        long c;
        if (t.c == 0) {
            c = this.B / t.b;
        }
        else {
            c = this.C;
        }
        return c;
    }
    
    public final long z() {
        final DefaultAudioSink.DefaultAudioSink$f t = this.t;
        long e;
        if (t.c == 0) {
            e = this.D / t.d;
        }
        else {
            e = this.E;
        }
        return e;
    }
    
    public static final class g implements DefaultAudioSink$c
    {
        public final AudioProcessor[] a;
        public final i b;
        public final com.google.android.exoplayer2.audio.j c;
        
        public g(final AudioProcessor... array) {
            final i b = new i();
            final com.google.android.exoplayer2.audio.j c = new com.google.android.exoplayer2.audio.j();
            final AudioProcessor[] a = new AudioProcessor[array.length + 2];
            System.arraycopy(array, 0, this.a = a, 0, array.length);
            this.b = b;
            this.c = c;
            a[array.length] = (AudioProcessor)b;
            a[array.length + 1] = (AudioProcessor)c;
        }
        
        public final AudioProcessor[] a() {
            return this.a;
        }
        
        public final v b(final v v) {
            final com.google.android.exoplayer2.audio.j c = this.c;
            final float f = v.f;
            if (c.c != f) {
                c.c = f;
                c.i = true;
            }
            final float g = v.g;
            if (c.d != g) {
                c.d = g;
                c.i = true;
            }
            return v;
        }
        
        public final long c() {
            return this.b.t;
        }
        
        public final long d(long n) {
            final com.google.android.exoplayer2.audio.j c = this.c;
            if (c.o >= 1024L) {
                final long n2 = c.n;
                final o j = c.j;
                j.getClass();
                final long n3 = n2 - j.k * j.b * 2;
                final int a = c.h.a;
                final int a2 = c.g.a;
                if (a == a2) {
                    n = c0.P(n, n3, c.o);
                }
                else {
                    n = c0.P(n, n3 * a, c.o * a2);
                }
            }
            else {
                n = (long)(c.c * (double)n);
            }
            return n;
        }
        
        public final boolean e(final boolean m) {
            return this.b.m = m;
        }
    }
    
    public final class j implements b$a
    {
        public final DefaultAudioSink a;
        
        public j(final DefaultAudioSink a) {
            this.a = a;
        }
        
        public final void a(final long n) {
            final AudioSink$a r = this.a.r;
            if (r != null) {
                final a$a l0 = ((com.google.android.exoplayer2.audio.g.a)r).a.L0;
                final Handler a = l0.a;
                if (a != null) {
                    a.post((Runnable)new ya.f(l0, n));
                }
            }
        }
        
        public final void b(final long n, final long n2, final long n3, final long n4) {
            final long y = this.a.y();
            final long z = this.a.z();
            final StringBuilder sb = new StringBuilder(182);
            sb.append("Spurious audio timestamp (frame position mismatch): ");
            sb.append(n);
            sb.append(", ");
            sb.append(n2);
            sb.append(", ");
            sb.append(n3);
            sb.append(", ");
            sb.append(n4);
            sb.append(", ");
            sb.append(y);
            sb.append(", ");
            sb.append(z);
            Log.w("DefaultAudioSink", sb.toString());
        }
        
        public final void c(final long n, final long n2, final long n3, final long n4) {
            final long y = this.a.y();
            final long z = this.a.z();
            final StringBuilder sb = new StringBuilder(180);
            sb.append("Spurious audio timestamp (system clock mismatch): ");
            sb.append(n);
            sb.append(", ");
            sb.append(n2);
            sb.append(", ");
            sb.append(n3);
            sb.append(", ");
            sb.append(n4);
            sb.append(", ");
            sb.append(y);
            sb.append(", ");
            sb.append(z);
            Log.w("DefaultAudioSink", sb.toString());
        }
        
        public final void d(final int n, final long n2) {
            if (this.a.r != null) {
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                final DefaultAudioSink a = this.a;
                final long z = a.Z;
                final a$a l0 = ((com.google.android.exoplayer2.audio.g.a)a.r).a.L0;
                final Handler a2 = l0.a;
                if (a2 != null) {
                    a2.post((Runnable)new ya.i(l0, n, n2, elapsedRealtime - z));
                }
            }
        }
        
        public final void e(final long n) {
            final StringBuilder sb = new StringBuilder(61);
            sb.append("Ignoring impossibly large audio latency: ");
            sb.append(n);
            Log.w("DefaultAudioSink", sb.toString());
        }
    }
}
