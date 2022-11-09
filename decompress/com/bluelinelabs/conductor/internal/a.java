// 
// Decompiled by Procyon v0.6.0
// 

package com.bluelinelabs.conductor.internal;

import android.os.Looper;

public final class a
{
    public static final void a() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new CalledFromWrongThreadException("Methods that affect the view hierarchy can can only be called from the main thread.");
    }
}
