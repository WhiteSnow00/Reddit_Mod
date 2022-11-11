// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.upstream;

import java.io.IOException;
import java.io.FileNotFoundException;
import com.google.android.exoplayer2.ParserException;

public class f implements h
{
    private static final int DEFAULT_BEHAVIOR_MIN_LOADABLE_RETRY_COUNT = -1;
    public static final long DEFAULT_LOCATION_EXCLUSION_MS = 300000L;
    public static final int DEFAULT_MIN_LOADABLE_RETRY_COUNT = 3;
    public static final int DEFAULT_MIN_LOADABLE_RETRY_COUNT_PROGRESSIVE_LIVE = 6;
    @Deprecated
    public static final long DEFAULT_TRACK_BLACKLIST_MS = 60000L;
    public static final long DEFAULT_TRACK_EXCLUSION_MS = 60000L;
    private final int minimumLoadableRetryCount;
    
    public f() {
        this(-1);
    }
    
    public f(final int minimumLoadableRetryCount) {
        this.minimumLoadableRetryCount = minimumLoadableRetryCount;
    }
    
    @Override
    public b getFallbackSelectionFor(final a a, final c c) {
        if (!this.isEligibleForFallback(c.a)) {
            return null;
        }
        if (a.a(1)) {
            return new b(1, 300000L);
        }
        if (a.a(2)) {
            return new b(2, 60000L);
        }
        return null;
    }
    
    @Override
    public int getMinimumLoadableRetryCount(int n) {
        final int minimumLoadableRetryCount = this.minimumLoadableRetryCount;
        if (minimumLoadableRetryCount == -1) {
            if (n == 7) {
                n = 6;
            }
            else {
                n = 3;
            }
            return n;
        }
        return minimumLoadableRetryCount;
    }
    
    @Override
    public long getRetryDelayMsFor(final c c) {
        final IOException a = c.a;
        long n;
        if (!(a instanceof ParserException) && !(a instanceof FileNotFoundException) && !(a instanceof HttpDataSource$CleartextNotPermittedException) && !(a instanceof Loader.UnexpectedLoaderException) && !DataSourceException.isCausedByPositionOutOfRange(a)) {
            n = Math.min((c.b - 1) * 1000, 5000);
        }
        else {
            n = -9223372036854775807L;
        }
        return n;
    }
    
    public boolean isEligibleForFallback(final IOException ex) {
        final boolean b = ex instanceof HttpDataSource$InvalidResponseCodeException;
        boolean b2 = false;
        if (!b) {
            return false;
        }
        final int responseCode = ((HttpDataSource$InvalidResponseCodeException)ex).responseCode;
        if (responseCode == 403 || responseCode == 404 || responseCode == 410 || responseCode == 416 || responseCode == 500 || responseCode == 503) {
            b2 = true;
        }
        return b2;
    }
}
