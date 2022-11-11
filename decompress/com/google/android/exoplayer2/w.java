// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2;

import android.os.BaseBundle;
import java.util.Arrays;
import lw0.b;
import ac.u;
import java.util.ArrayList;
import android.os.Bundle;
import ad.j;
import bd.q;
import android.view.SurfaceView;
import android.view.TextureView;
import android.os.Looper;
import mc.a;
import java.util.List;

public interface w
{
    @Deprecated
    boolean A();
    
    @Deprecated
    int B();
    
    void C();
    
    void D(final boolean p0);
    
    List<mc.a> E();
    
    boolean F();
    
    int G();
    
    f0 H();
    
    e0 I();
    
    Looper J();
    
    void K();
    
    void L(final TextureView p0);
    
    void N(final int p0, final long p1);
    
    a O();
    
    boolean P();
    
    long Q();
    
    void R(final c p0);
    
    int S();
    
    void T(final SurfaceView p0);
    
    @Deprecated
    boolean U();
    
    boolean V();
    
    void W();
    
    r X();
    
    long Y();
    
    ExoPlaybackException a();
    
    boolean b();
    
    v c();
    
    long e();
    
    int g();
    
    long getBufferedPosition();
    
    long getCurrentPosition();
    
    long getDuration();
    
    q getVideoSize();
    
    float getVolume();
    
    void h(final c p0);
    
    void i(final SurfaceView p0);
    
    boolean isPlaying();
    
    boolean k();
    
    int l();
    
    int m();
    
    boolean n(final int p0);
    
    boolean o();
    
    void p(final int p0);
    
    void pause();
    
    void play();
    
    void prepare();
    
    void q(final boolean p0);
    
    void r();
    
    void release();
    
    int s();
    
    void seekTo(final long p0);
    
    void setVolume(final float p0);
    
    void stop();
    
    void t(final TextureView p0);
    
    int u();
    
    long v();
    
    boolean w();
    
    long x();
    
    void y();
    
    boolean z();
    
    public static final class a implements f
    {
        public final j f;
        
        static {
            new w.a.a().b();
        }
        
        public a(final j f) {
            this.f = f;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof w.a && this.f.equals(((w.a)o).f));
        }
        
        @Override
        public final int hashCode() {
            return this.f.hashCode();
        }
        
        @Override
        public final Bundle toBundle() {
            final Bundle bundle = new Bundle();
            final ArrayList list = new ArrayList();
            for (int i = 0; i < this.f.b(); ++i) {
                list.add(this.f.a(i));
            }
            bundle.putIntegerArrayList(Integer.toString(0, 36), list);
            return bundle;
        }
        
        public static final class a
        {
            public final j.a a;
            
            public a() {
                this.a = new j.a();
            }
            
            public final void a(final int n, final boolean b) {
                final j.a a = this.a;
                if (b) {
                    a.a(n);
                }
                else {
                    a.getClass();
                }
            }
            
            public final w.a b() {
                return new w.a(this.a.b());
            }
        }
    }
    
    public static final class b
    {
        public final j a;
        
        public b(final j a) {
            this.a = a;
        }
        
        public final boolean a(final int... array) {
            final j a = this.a;
            a.getClass();
            final int length = array.length;
            final boolean b = false;
            int n = 0;
            boolean b2;
            while (true) {
                b2 = b;
                if (n >= length) {
                    break;
                }
                if (a.a.get(array[n])) {
                    b2 = true;
                    break;
                }
                ++n;
            }
            return b2;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof b && this.a.equals(((b)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
    }
    
    public interface c
    {
        default void onAvailableCommandsChanged(final w.a a) {
        }
        
        default void onCues(final List<a> list) {
        }
        
        default void onDeviceInfoChanged(final i i) {
        }
        
        default void onDeviceVolumeChanged(final int n, final boolean b) {
        }
        
        default void onEvents(final w w, final b b) {
        }
        
        default void onIsLoadingChanged(final boolean b) {
        }
        
        default void onIsPlayingChanged(final boolean b) {
        }
        
        @Deprecated
        default void onLoadingChanged(final boolean b) {
        }
        
        default void onMediaItemTransition(final com.google.android.exoplayer2.q q, final int n) {
        }
        
        default void onMediaMetadataChanged(final r r) {
        }
        
        default void onMetadata(final pb.a a) {
        }
        
        default void onPlayWhenReadyChanged(final boolean b, final int n) {
        }
        
        default void onPlaybackParametersChanged(final v v) {
        }
        
        default void onPlaybackStateChanged(final int n) {
        }
        
        default void onPlaybackSuppressionReasonChanged(final int n) {
        }
        
        default void onPlayerError(final PlaybackException ex) {
        }
        
        default void onPlayerErrorChanged(final PlaybackException ex) {
        }
        
        @Deprecated
        default void onPlayerStateChanged(final boolean b, final int n) {
        }
        
        @Deprecated
        default void onPositionDiscontinuity(final int n) {
        }
        
        default void onPositionDiscontinuity(final d d, final d d2, final int n) {
        }
        
        default void onRenderedFirstFrame() {
        }
        
        default void onRepeatModeChanged(final int n) {
        }
        
        @Deprecated
        default void onSeekProcessed() {
        }
        
        default void onShuffleModeEnabledChanged(final boolean b) {
        }
        
        default void onSkipSilenceEnabledChanged(final boolean b) {
        }
        
        default void onSurfaceSizeChanged(final int n, final int n2) {
        }
        
        default void onTimelineChanged(final e0 e0, final int n) {
        }
        
        @Deprecated
        default void onTracksChanged(final u u, final wc.j j) {
        }
        
        default void onTracksInfoChanged(final f0 f0) {
        }
        
        default void onVideoSizeChanged(final q q) {
        }
        
        default void onVolumeChanged(final float n) {
        }
    }
    
    public static final class d implements f
    {
        public final Object f;
        public final int g;
        public final com.google.android.exoplayer2.q h;
        public final Object i;
        public final int j;
        public final long k;
        public final long l;
        public final int m;
        public final int n;
        
        public d(final Object f, final int g, final com.google.android.exoplayer2.q h, final Object i, final int j, final long k, final long l, final int m, final int n) {
            this.f = f;
            this.g = g;
            this.h = h;
            this.i = i;
            this.j = j;
            this.k = k;
            this.l = l;
            this.m = m;
            this.n = n;
        }
        
        public static String a(final int n) {
            return Integer.toString(n, 36);
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o != null && d.class == o.getClass()) {
                final d d = (d)o;
                if (this.g != d.g || this.j != d.j || this.k != d.k || this.l != d.l || this.m != d.m || this.n != d.n || !lw0.b.n0(this.f, d.f) || !lw0.b.n0(this.i, d.i) || !lw0.b.n0((Object)this.h, (Object)d.h)) {
                    b = false;
                }
                return b;
            }
            return false;
        }
        
        @Override
        public final int hashCode() {
            return Arrays.hashCode(new Object[] { this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n });
        }
        
        @Override
        public final Bundle toBundle() {
            final Bundle bundle = new Bundle();
            ((BaseBundle)bundle).putInt(a(0), this.g);
            bundle.putBundle(a(1), ad.b.e((f)this.h));
            ((BaseBundle)bundle).putInt(a(2), this.j);
            ((BaseBundle)bundle).putLong(a(3), this.k);
            ((BaseBundle)bundle).putLong(a(4), this.l);
            ((BaseBundle)bundle).putInt(a(5), this.m);
            ((BaseBundle)bundle).putInt(a(6), this.n);
            return bundle;
        }
    }
}
