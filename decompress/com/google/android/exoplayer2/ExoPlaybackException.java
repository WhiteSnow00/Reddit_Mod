// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2;

import android.os.BaseBundle;
import java.io.IOException;
import ad.d0;
import ad.b;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.support.v4.media.a;
import a81.e;
import ad.c0;
import ja.k;
import ac.j;

public final class ExoPlaybackException extends PlaybackException
{
    public static final f.a<ExoPlaybackException> CREATOR;
    public static final int TYPE_REMOTE = 3;
    public static final int TYPE_RENDERER = 1;
    public static final int TYPE_SOURCE = 0;
    public static final int TYPE_UNEXPECTED = 2;
    public final boolean isRecoverable;
    public final j mediaPeriodId;
    public final n rendererFormat;
    public final int rendererFormatSupport;
    public final int rendererIndex;
    public final String rendererName;
    public final int type;
    
    static {
        CREATOR = new k(3);
    }
    
    public ExoPlaybackException(final int n, final Throwable t, final int n2) {
        this(n, t, null, n2, null, -1, null, 4, false);
    }
    
    public ExoPlaybackException(final int n, final Throwable t, final String s, final int n2, final String s2, final int n3, final n n4, final int n5, final boolean b) {
        String l;
        if (n != 0) {
            if (n != 1) {
                if (n != 3) {
                    l = "Unexpected runtime error";
                }
                else {
                    l = "Remote error";
                }
            }
            else {
                final String value = String.valueOf(n4);
                final String t2 = c0.t(n5);
                final StringBuilder sb = new StringBuilder(t2.length() + (value.length() + e.h(s2, 53)));
                sb.append(s2);
                sb.append(" error, index=");
                sb.append(n3);
                sb.append(", format=");
                l = a.l(sb, value, ", format_supported=", t2);
            }
        }
        else {
            l = "Source error";
        }
        String j = l;
        if (!TextUtils.isEmpty((CharSequence)s)) {
            final String value2 = String.valueOf(l);
            j = a.j(e.h(s, value2.length() + 2), value2, ": ", s);
        }
        this(j, t, n2, n, s2, n3, n4, n5, null, SystemClock.elapsedRealtime(), b);
    }
    
    public ExoPlaybackException(final Bundle bundle) {
        super(bundle);
        this.type = ((BaseBundle)bundle).getInt(PlaybackException.keyForField(1001), 2);
        this.rendererName = ((BaseBundle)bundle).getString(PlaybackException.keyForField(1002));
        this.rendererIndex = ((BaseBundle)bundle).getInt(PlaybackException.keyForField(1003), -1);
        this.rendererFormat = b.c((f.a<n>)n.M, bundle.getBundle(PlaybackException.keyForField(1004)));
        this.rendererFormatSupport = ((BaseBundle)bundle).getInt(PlaybackException.keyForField(1005), 4);
        this.isRecoverable = ((BaseBundle)bundle).getBoolean(PlaybackException.keyForField(1006), false);
        this.mediaPeriodId = null;
    }
    
    public ExoPlaybackException(final String s, final Throwable t, final int n, final int type, final String rendererName, final int rendererIndex, final n rendererFormat, final int rendererFormatSupport, final j mediaPeriodId, final long n2, final boolean isRecoverable) {
        super(s, t, n, n2);
        final boolean b = false;
        d0.c(!isRecoverable || type == 1);
        boolean b2 = false;
        Label_0057: {
            if (t == null) {
                b2 = b;
                if (type != 3) {
                    break Label_0057;
                }
            }
            b2 = true;
        }
        d0.c(b2);
        this.type = type;
        this.rendererName = rendererName;
        this.rendererIndex = rendererIndex;
        this.rendererFormat = rendererFormat;
        this.rendererFormatSupport = rendererFormatSupport;
        this.mediaPeriodId = mediaPeriodId;
        this.isRecoverable = isRecoverable;
    }
    
    public static ExoPlaybackException createForRemote(final String s) {
        return new ExoPlaybackException(3, null, s, 1001, null, -1, null, 4, false);
    }
    
    public static ExoPlaybackException createForRenderer(final Throwable t, final String s, final int n, final n n2, int n3, final boolean b, final int n4) {
        if (n2 == null) {
            n3 = 4;
        }
        return new ExoPlaybackException(1, t, null, n4, s, n, n2, n3, b);
    }
    
    public static ExoPlaybackException createForSource(final IOException ex, final int n) {
        return new ExoPlaybackException(0, ex, n);
    }
    
    @Deprecated
    public static ExoPlaybackException createForUnexpected(final RuntimeException ex) {
        return createForUnexpected(ex, 1000);
    }
    
    public static ExoPlaybackException createForUnexpected(final RuntimeException ex, final int n) {
        return new ExoPlaybackException(2, ex, n);
    }
    
    public ExoPlaybackException copyWithMediaPeriodId(final j j) {
        final String message = ((Throwable)this).getMessage();
        final int a = c0.a;
        return new ExoPlaybackException(message, ((Throwable)this).getCause(), super.errorCode, this.type, this.rendererName, this.rendererIndex, this.rendererFormat, this.rendererFormatSupport, j, super.timestampMs, this.isRecoverable);
    }
    
    public boolean errorInfoEquals(final PlaybackException ex) {
        final boolean errorInfoEquals = super.errorInfoEquals(ex);
        final boolean b = false;
        if (!errorInfoEquals) {
            return false;
        }
        final int a = c0.a;
        final ExoPlaybackException ex2 = (ExoPlaybackException)ex;
        boolean b2 = b;
        if (this.type == ex2.type) {
            b2 = b;
            if (c0.a(this.rendererName, ex2.rendererName)) {
                b2 = b;
                if (this.rendererIndex == ex2.rendererIndex) {
                    b2 = b;
                    if (c0.a(this.rendererFormat, ex2.rendererFormat)) {
                        b2 = b;
                        if (this.rendererFormatSupport == ex2.rendererFormatSupport) {
                            b2 = b;
                            if (c0.a(this.mediaPeriodId, ex2.mediaPeriodId)) {
                                b2 = b;
                                if (this.isRecoverable == ex2.isRecoverable) {
                                    b2 = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return b2;
    }
    
    public Exception getRendererException() {
        final int type = this.type;
        boolean b = true;
        if (type != 1) {
            b = false;
        }
        d0.f(b);
        final Throwable cause = ((Throwable)this).getCause();
        cause.getClass();
        return (Exception)cause;
    }
    
    public IOException getSourceException() {
        d0.f(this.type == 0);
        final Throwable cause = ((Throwable)this).getCause();
        cause.getClass();
        return (IOException)cause;
    }
    
    public RuntimeException getUnexpectedException() {
        d0.f(this.type == 2);
        final Throwable cause = ((Throwable)this).getCause();
        cause.getClass();
        return (RuntimeException)cause;
    }
    
    public Bundle toBundle() {
        final Bundle bundle = super.toBundle();
        ((BaseBundle)bundle).putInt(PlaybackException.keyForField(1001), this.type);
        ((BaseBundle)bundle).putString(PlaybackException.keyForField(1002), this.rendererName);
        ((BaseBundle)bundle).putInt(PlaybackException.keyForField(1003), this.rendererIndex);
        bundle.putBundle(PlaybackException.keyForField(1004), b.e((f)this.rendererFormat));
        ((BaseBundle)bundle).putInt(PlaybackException.keyForField(1005), this.rendererFormatSupport);
        ((BaseBundle)bundle).putBoolean(PlaybackException.keyForField(1006), this.isRecoverable);
        return bundle;
    }
}
