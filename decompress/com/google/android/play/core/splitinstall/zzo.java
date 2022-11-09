// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.play.core.splitinstall;

import ng.x;
import java.util.concurrent.atomic.AtomicReference;
import ng.w;

public enum zzo implements w
{
    zza;
    
    private static final AtomicReference<x> zzb;
    
    static {
        zzb = new AtomicReference<x>(null);
    }
    
    public final x zza() {
        return zzo.zzb.get();
    }
    
    public final void zzb(final x x) {
        zzo.zzb.set(x);
    }
}
