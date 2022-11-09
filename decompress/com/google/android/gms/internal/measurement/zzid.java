// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.measurement;

final class zzid extends zzif
{
    public static final zzid zza;
    
    static {
        zza = new zzid();
    }
    
    private zzid() {
    }
    
    public final boolean equals(final Object o) {
        return o == this;
    }
    
    public final int hashCode() {
        return 2040732332;
    }
    
    public final String toString() {
        return "Optional.absent()";
    }
    
    public final Object zza() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }
    
    public final boolean zzb() {
        return false;
    }
}
