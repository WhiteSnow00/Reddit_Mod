// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.audio;

import com.google.common.collect.ImmutableCollection$a;
import wa.e0;
import bd.o;
import java.nio.ByteBuffer;
import ya.k;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.android.billingclient.api.d0;
import com.google.android.exoplayer2.v;
import android.view.Surface;
import com.google.android.exoplayer2.n$a;
import android.media.MediaFormat;
import bd.c0;
import com.google.android.exoplayer2.mediacodec.c$a;
import android.media.MediaCrypto;
import java.util.regex.Pattern;
import java.util.Comparator;
import java.util.Collections;
import pb.j;
import m3.c;
import java.util.ArrayList;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.ExoPlaybackException;
import xa.b0;
import wa.f0;
import s4.a;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil$DecoderQueryException;
import com.google.common.collect.ImmutableList$a;
import java.util.List;
import com.google.android.exoplayer2.mediacodec.d;
import java.util.Collection;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.common.collect.ImmutableList;
import com.google.android.exoplayer2.k$b;
import android.os.Handler;
import com.google.android.exoplayer2.mediacodec.e;
import com.google.android.exoplayer2.mediacodec.b;
import com.google.android.exoplayer2.z$a;
import android.content.Context;
import bd.n;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;

public final class g extends MediaCodecRenderer implements n
{
    public final Context K0;
    public final a$a L0;
    public final AudioSink M0;
    public int N0;
    public boolean O0;
    public com.google.android.exoplayer2.n P0;
    public long Q0;
    public boolean R0;
    public boolean S0;
    public boolean T0;
    public z$a U0;
    
    public g(final Context context, final b b, final e e, final Handler handler, final k$b k$b, final AudioSink m0) {
        super(1, b, e, 44100.0f);
        this.K0 = context.getApplicationContext();
        this.M0 = m0;
        this.L0 = new a$a(handler, k$b);
        m0.h(new g.g$a(this));
    }
    
    public static ImmutableList x0(final e e, final com.google.android.exoplayer2.n n, final boolean b, final AudioSink audioSink) throws MediaCodecUtil$DecoderQueryException {
        final String q = n.q;
        if (q == null) {
            return ImmutableList.of();
        }
        if (audioSink.a(n)) {
            final d e2 = MediaCodecUtil.e("audio/raw");
            if (e2 != null) {
                return ImmutableList.of((Object)e2);
            }
        }
        final List c = e.c(q, b, false);
        final String b2 = MediaCodecUtil.b(n);
        if (b2 == null) {
            return ImmutableList.copyOf((Collection)c);
        }
        final List c2 = e.c(b2, b, false);
        final ImmutableList$a builder = ImmutableList.builder();
        ((ImmutableCollection$a)builder).d((Iterable)c);
        ((ImmutableCollection$a)builder).d((Iterable)c2);
        return builder.f();
    }
    
    public final void A(final boolean b, final boolean b2) throws ExoPlaybackException {
        final ab.e f0 = new ab.e();
        super.F0 = f0;
        final a$a l0 = this.L0;
        final Handler a = l0.a;
        if (a != null) {
            a.post((Runnable)new a(3, l0, f0));
        }
        final f0 h = ((com.google.android.exoplayer2.e)this).h;
        h.getClass();
        if (h.a) {
            this.M0.g();
        }
        else {
            this.M0.f();
        }
        final AudioSink m0 = this.M0;
        final b0 j = ((com.google.android.exoplayer2.e)this).j;
        j.getClass();
        m0.i(j);
    }
    
    public final void B(final long q0, final boolean b) throws ExoPlaybackException {
        super.B(q0, b);
        this.M0.flush();
        this.Q0 = q0;
        this.R0 = true;
        this.S0 = true;
    }
    
    public final void C() {
        try {
            this.K();
            this.l0();
            try {
                DrmSession.d(super.I, (DrmSession)null);
                super.I = null;
                if (this.T0) {
                    this.T0 = false;
                    this.M0.reset();
                }
            }
            finally {
                if (this.T0) {
                    this.T0 = false;
                    this.M0.reset();
                }
            }
        }
        finally {}
    }
    
    public final void D() {
        this.M0.play();
    }
    
    public final void E() {
        this.y0();
        this.M0.pause();
    }
    
    public final ab.g I(final d d, final com.google.android.exoplayer2.n n, final com.google.android.exoplayer2.n n2) {
        final ab.g b = d.b(n, n2);
        int e;
        final int n3 = e = b.e;
        if (this.w0(n2, d) > this.N0) {
            e = (n3 | 0x40);
        }
        final String a = d.a;
        int d2;
        if (e != 0) {
            d2 = 0;
        }
        else {
            d2 = b.d;
        }
        return new ab.g(a, n, n2, d2, e);
    }
    
    public final float S(float n, final com.google.android.exoplayer2.n[] array) {
        final int length = array.length;
        int i = 0;
        int n2 = -1;
        while (i < length) {
            final int e = array[i].E;
            int max = n2;
            if (e != -1) {
                max = Math.max(n2, e);
            }
            ++i;
            n2 = max;
        }
        if (n2 == -1) {
            n = -1.0f;
        }
        else {
            n *= n2;
        }
        return n;
    }
    
    public final ArrayList T(final e e, final com.google.android.exoplayer2.n n, final boolean b) throws MediaCodecUtil$DecoderQueryException {
        final ImmutableList x0 = x0(e, n, b, this.M0);
        final Pattern a = MediaCodecUtil.a;
        final ArrayList list = new ArrayList((Collection<?>)x0);
        Collections.sort((List<E>)list, new j(new c(n, 8), 0));
        return list;
    }
    
    public final c$a V(final d d, final com.google.android.exoplayer2.n n, final MediaCrypto mediaCrypto, final float n2) {
        final com.google.android.exoplayer2.n[] m = ((com.google.android.exoplayer2.e)this).m;
        m.getClass();
        int w0 = this.w0(n, d);
        final int length = m.length;
        final int n3 = 1;
        int n4;
        if (length == 1) {
            n4 = w0;
        }
        else {
            final int length2 = m.length;
            int n5 = 0;
            while (true) {
                n4 = w0;
                if (n5 >= length2) {
                    break;
                }
                final com.google.android.exoplayer2.n n6 = m[n5];
                int max = w0;
                if (d.b(n, n6).d != 0) {
                    max = Math.max(w0, this.w0(n6, d));
                }
                ++n5;
                w0 = max;
            }
        }
        this.N0 = n4;
        final String a = d.a;
        final int a2 = c0.a;
        boolean o0 = false;
        Label_0202: {
            if (a2 < 24 && "OMX.SEC.aac.dec".equals(a) && "samsung".equals(c0.c)) {
                final String b = c0.b;
                if (b.startsWith("zeroflte") || b.startsWith("herolte") || b.startsWith("heroqlte")) {
                    o0 = true;
                    break Label_0202;
                }
            }
            o0 = false;
        }
        this.O0 = o0;
        final String c = d.c;
        final int n7 = this.N0;
        final MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", c);
        mediaFormat.setInteger("channel-count", n.D);
        mediaFormat.setInteger("sample-rate", n.E);
        at1.a.H1(mediaFormat, n.s);
        at1.a.f1(mediaFormat, "max-input-size", n7);
        if (a2 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (n2 != -1.0f) {
                boolean b2 = false;
                Label_0349: {
                    if (a2 == 23) {
                        final String d2 = c0.d;
                        if ("ZTE B2017G".equals(d2) || "AXON 7 mini".equals(d2)) {
                            b2 = true;
                            break Label_0349;
                        }
                    }
                    b2 = false;
                }
                if (!b2) {
                    mediaFormat.setFloat("operating-rate", n2);
                }
            }
        }
        if (a2 <= 28 && "audio/ac4".equals(n.q)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (a2 >= 24) {
            final AudioSink m2 = this.M0;
            final int d3 = n.D;
            final int e = n.E;
            final n$a n$a = new n$a();
            n$a.k = "audio/raw";
            n$a.x = d3;
            n$a.y = e;
            n$a.z = 4;
            if (m2.m(n$a.a()) == 2) {
                mediaFormat.setInteger("pcm-encoding", 4);
            }
        }
        if (a2 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        int n8;
        if ("audio/raw".equals(d.b) && !"audio/raw".equals(n.q)) {
            n8 = n3;
        }
        else {
            n8 = 0;
        }
        com.google.android.exoplayer2.n p4;
        if (n8 != 0) {
            p4 = n;
        }
        else {
            p4 = null;
        }
        this.P0 = p4;
        return new c$a(d, mediaFormat, n, (Surface)null, mediaCrypto);
    }
    
    public final void a0(final Exception ex) {
        wi.b.C("MediaCodecAudioRenderer", "Audio codec error", (Throwable)ex);
        final a$a l0 = this.L0;
        final Handler a = l0.a;
        if (a != null) {
            a.post((Runnable)new androidx.lifecycle.d(2, l0, ex));
        }
    }
    
    public final boolean b() {
        return super.B0 && this.M0.b();
    }
    
    public final void b0(final String s, final long n, final long n2) {
        final a$a l0 = this.L0;
        final Handler a = l0.a;
        if (a != null) {
            a.post((Runnable)new ya.g(l0, s, n, n2));
        }
    }
    
    public final v c() {
        return this.M0.c();
    }
    
    public final void c0(final String s) {
        final a$a l0 = this.L0;
        final Handler a = l0.a;
        if (a != null) {
            a.post((Runnable)new androidx.lifecycle.d(1, l0, s));
        }
    }
    
    public final ab.g d0(final d0 d0) throws ExoPlaybackException {
        final ab.g d2 = super.d0(d0);
        final a$a l0 = this.L0;
        final com.google.android.exoplayer2.n n = (com.google.android.exoplayer2.n)d0.h;
        final Handler a = l0.a;
        if (a != null) {
            a.post((Runnable)new androidx.emoji2.text.g(l0, 1, n, d2));
        }
        return d2;
    }
    
    public final void e(final v v) {
        this.M0.e(v);
    }
    
    public final void e0(com.google.android.exoplayer2.n o, final MediaFormat mediaFormat) throws ExoPlaybackException {
        final com.google.android.exoplayer2.n p2 = this.P0;
        final int[] array = null;
        final int[] array2 = null;
        int[] array3;
        if (p2 != null) {
            o = p2;
            array3 = array;
        }
        else if (super.O == null) {
            array3 = array;
        }
        else {
            int z;
            if ("audio/raw".equals(((com.google.android.exoplayer2.n)o).q)) {
                z = ((com.google.android.exoplayer2.n)o).F;
            }
            else if (c0.a >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                z = mediaFormat.getInteger("pcm-encoding");
            }
            else if (mediaFormat.containsKey("v-bits-per-sample")) {
                z = c0.w(mediaFormat.getInteger("v-bits-per-sample"));
            }
            else {
                z = 2;
            }
            final n$a n$a = new n$a();
            n$a.k = "audio/raw";
            n$a.z = z;
            n$a.A = ((com.google.android.exoplayer2.n)o).G;
            n$a.B = ((com.google.android.exoplayer2.n)o).H;
            n$a.x = mediaFormat.getInteger("channel-count");
            n$a.y = mediaFormat.getInteger("sample-rate");
            final com.google.android.exoplayer2.n n = new com.google.android.exoplayer2.n(n$a);
            array3 = array2;
            if (this.O0) {
                array3 = array2;
                if (n.D == 6) {
                    final int d = ((com.google.android.exoplayer2.n)o).D;
                    array3 = array2;
                    if (d < 6) {
                        array3 = new int[d];
                        for (int i = 0; i < ((com.google.android.exoplayer2.n)o).D; ++i) {
                            array3[i] = i;
                        }
                    }
                }
            }
            o = n;
        }
        try {
            this.M0.d((com.google.android.exoplayer2.n)o, array3);
        }
        catch (final AudioSink$ConfigurationException ex) {
            throw ((com.google.android.exoplayer2.e)this).x(ex.format, (Exception)ex, false, 5001);
        }
    }
    
    public final void g0() {
        this.M0.q();
    }
    
    public final String getName() {
        return "MediaCodecAudioRenderer";
    }
    
    public final void h0(final DecoderInputBuffer decoderInputBuffer) {
        if (this.R0 && !((ab.a)decoderInputBuffer).o()) {
            if (Math.abs(decoderInputBuffer.j - this.Q0) > 500000L) {
                this.Q0 = decoderInputBuffer.j;
            }
            this.R0 = false;
        }
    }
    
    public final void i(final int n, final Object o) throws ExoPlaybackException {
        if (n != 2) {
            if (n != 3) {
                if (n != 6) {
                    switch (n) {
                        case 11: {
                            this.U0 = (z$a)o;
                            break;
                        }
                        case 10: {
                            this.M0.k((int)o);
                            break;
                        }
                        case 9: {
                            this.M0.r((boolean)o);
                            break;
                        }
                    }
                }
                else {
                    this.M0.s((k)o);
                }
            }
            else {
                this.M0.n((ya.d)o);
            }
        }
        else {
            this.M0.setVolume((float)o);
        }
    }
    
    public final boolean isReady() {
        return this.M0.j() || super.isReady();
    }
    
    public final boolean j0(final long n, final long n2, final com.google.android.exoplayer2.mediacodec.c c, final ByteBuffer byteBuffer, final int n3, final int n4, final int n5, final long n6, final boolean b, final boolean b2, final com.google.android.exoplayer2.n n7) throws ExoPlaybackException {
        byteBuffer.getClass();
        if (this.P0 != null && (n4 & 0x2) != 0x0) {
            c.getClass();
            c.releaseOutputBuffer(n3, false);
            return true;
        }
        if (b) {
            if (c != null) {
                c.releaseOutputBuffer(n3, false);
            }
            final ab.e f0 = super.F0;
            f0.f += n5;
            this.M0.q();
            return true;
        }
        try {
            if (this.M0.l(n6, n5, byteBuffer)) {
                if (c != null) {
                    c.releaseOutputBuffer(n3, false);
                }
                final ab.e f2 = super.F0;
                f2.e += n5;
                return true;
            }
            return false;
        }
        catch (final AudioSink$WriteException ex) {
            throw ((com.google.android.exoplayer2.e)this).x(n7, (Exception)ex, ex.isRecoverable, 5002);
        }
        catch (final AudioSink$InitializationException ex2) {
            throw ((com.google.android.exoplayer2.e)this).x(ex2.format, (Exception)ex2, ex2.isRecoverable, 5001);
        }
    }
    
    public final void m0() throws ExoPlaybackException {
        try {
            this.M0.o();
        }
        catch (final AudioSink$WriteException ex) {
            throw ((com.google.android.exoplayer2.e)this).x(ex.format, (Exception)ex, ex.isRecoverable, 5002);
        }
    }
    
    public final n p() {
        return this;
    }
    
    public final boolean r0(final com.google.android.exoplayer2.n n) {
        return this.M0.a(n);
    }
    
    public final int s0(final e e, final com.google.android.exoplayer2.n n) throws MediaCodecUtil$DecoderQueryException {
        final boolean k = o.k(n.q);
        int n2 = 0;
        if (!k) {
            return e0.l(0, 0, 0);
        }
        int n3;
        if (c0.a >= 21) {
            n3 = 32;
        }
        else {
            n3 = 0;
        }
        final int j = n.J;
        final int n4 = 1;
        final boolean b = j != 0;
        final boolean b2 = j == 0 || j == 2;
        final int n5 = 8;
        final int n6 = 4;
        if (b2 && this.M0.a(n) && (!b || MediaCodecUtil.e("audio/raw") != null)) {
            return e0.l(4, 8, n3);
        }
        if ("audio/raw".equals(n.q) && !this.M0.a(n)) {
            return e0.l(1, 0, 0);
        }
        final AudioSink m0 = this.M0;
        final int d = n.D;
        final int e2 = n.E;
        final n$a n$a = new n$a();
        n$a.k = "audio/raw";
        n$a.x = d;
        n$a.y = e2;
        n$a.z = 2;
        if (!m0.a(n$a.a())) {
            return e0.l(1, 0, 0);
        }
        final ImmutableList x0 = x0(e, n, false, this.M0);
        if (((List)x0).isEmpty()) {
            return e0.l(1, 0, 0);
        }
        if (!b2) {
            return e0.l(2, 0, 0);
        }
        final d d2 = (d)((List)x0).get(0);
        int c = d2.c(n) ? 1 : 0;
        d d3 = null;
        boolean b3 = false;
        Label_0363: {
            if (c == 0) {
                for (int i = 1; i < ((List)x0).size(); ++i) {
                    d3 = (d)((List)x0).get(i);
                    if (d3.c(n)) {
                        b3 = false;
                        c = n4;
                        break Label_0363;
                    }
                }
            }
            b3 = true;
            d3 = d2;
        }
        int n7;
        if (c != 0) {
            n7 = n6;
        }
        else {
            n7 = 3;
        }
        int n8 = n5;
        if (c != 0) {
            n8 = n5;
            if (d3.d(n)) {
                n8 = 16;
            }
        }
        int n9;
        if (d3.g) {
            n9 = 64;
        }
        else {
            n9 = 0;
        }
        if (b3) {
            n2 = 128;
        }
        return n7 | n8 | n3 | n9 | n2;
    }
    
    public final long u() {
        if (((com.google.android.exoplayer2.e)this).k == 2) {
            this.y0();
        }
        return this.Q0;
    }
    
    public final int w0(final com.google.android.exoplayer2.n n, final d d) {
        if ("OMX.google.raw.decoder".equals(d.a)) {
            final int a = c0.a;
            if (a < 24 && (a != 23 || !c0.I(this.K0))) {
                return -1;
            }
        }
        return n.r;
    }
    
    public final void y0() {
        long q0 = this.M0.p(this.b());
        if (q0 != Long.MIN_VALUE) {
            if (!this.S0) {
                q0 = Math.max(this.Q0, q0);
            }
            this.Q0 = q0;
            this.S0 = false;
        }
    }
    
    public final void z() {
        this.T0 = true;
        try {
            this.M0.flush();
            try {
                super.z();
            }
            finally {
                this.L0.a(super.F0);
            }
        }
        finally {
            try {
                super.z();
                this.L0.a(super.F0);
            }
            finally {
                this.L0.a(super.F0);
            }
        }
    }
}
