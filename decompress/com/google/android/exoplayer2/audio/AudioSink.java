// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.audio;

import al0.f0;
import java.nio.ByteBuffer;
import wa.c0;
import xa.d;
import xa.k;
import com.google.android.exoplayer2.v;
import com.google.android.exoplayer2.n;

public interface AudioSink
{
    boolean a(final n p0);
    
    boolean b();
    
    v c();
    
    void d(final k p0);
    
    void e(final v p0);
    
    void f(final n p0, final int[] p1) throws ConfigurationException;
    
    void flush();
    
    void g();
    
    void h(final d p0);
    
    default void i(final c0 c0) {
    }
    
    void j();
    
    void k(final g$a p0);
    
    boolean l();
    
    void m(final int p0);
    
    boolean n(final long p0, final int p1, final ByteBuffer p2) throws InitializationException, WriteException;
    
    int o(final n p0);
    
    void p() throws WriteException;
    
    void pause();
    
    void play();
    
    long q(final boolean p0);
    
    void r();
    
    void reset();
    
    void s(final boolean p0);
    
    void setVolume(final float p0);
    
    public static final class WriteException extends Exception
    {
        public final int errorCode;
        public final n format;
        public final boolean isRecoverable;
        
        public WriteException(final int errorCode, final n format, final boolean isRecoverable) {
            super(f0.f(36, "AudioTrack write failed: ", errorCode));
            this.isRecoverable = isRecoverable;
            this.errorCode = errorCode;
            this.format = format;
        }
    }
    
    public static final class InitializationException extends Exception
    {
        public final int audioTrackState;
        public final n format;
        public final boolean isRecoverable;
        
        public InitializationException(final int audioTrackState, final int n, final int n2, final int n3, final n format, final boolean isRecoverable, final Exception ex) {
            String s;
            if (isRecoverable) {
                s = " (recoverable)";
            }
            else {
                s = "";
            }
            final StringBuilder sb = new StringBuilder(s.length() + 80);
            sb.append("AudioTrack init failed ");
            sb.append(audioTrackState);
            sb.append(" ");
            sb.append("Config(");
            d.z(sb, n, ", ", n2, ", ");
            sb.append(n3);
            sb.append(")");
            sb.append(s);
            super(sb.toString(), ex);
            this.audioTrackState = audioTrackState;
            this.isRecoverable = isRecoverable;
            this.format = format;
        }
    }
    
    public static final class ConfigurationException extends Exception
    {
        public final n format;
        
        public ConfigurationException(final String s, final n format) {
            super(s);
            this.format = format;
        }
        
        public ConfigurationException(final Throwable t, final n format) {
            super(t);
            this.format = format;
        }
    }
    
    public static final class UnexpectedDiscontinuityException extends Exception
    {
        public final long actualPresentationTimeUs;
        public final long expectedPresentationTimeUs;
        
        public UnexpectedDiscontinuityException(final long actualPresentationTimeUs, final long expectedPresentationTimeUs) {
            final StringBuilder sb = new StringBuilder(103);
            sb.append("Unexpected audio track timestamp discontinuity: expected ");
            sb.append(expectedPresentationTimeUs);
            sb.append(", got ");
            sb.append(actualPresentationTimeUs);
            super(sb.toString());
            this.actualPresentationTimeUs = actualPresentationTimeUs;
            this.expectedPresentationTimeUs = expectedPresentationTimeUs;
        }
    }
    
    public interface a
    {
    }
}
