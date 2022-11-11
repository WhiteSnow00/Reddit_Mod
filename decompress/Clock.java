// 
// Decompiled by Procyon v0.6.0
// 

package com.amazonaws.ivs.player;

import android.os.SystemClock;

class Clock
{
    private Clock() {
    }
    
    public static long getNanoTime() {
        return SystemClock.elapsedRealtimeNanos();
    }
    
    public static void sleep(final long n) {
        boolean b;
        try {
            Thread.sleep(n);
            b = false;
        }
        catch (final InterruptedException ex) {
            b = true;
        }
        if (b) {
            Thread.currentThread().interrupt();
        }
    }
}
