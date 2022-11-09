// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.measurement;

final class zzig extends zzif
{
    private final Object zza;
    
    public zzig(final Object zza) {
        this.zza = zza;
    }
    
    public final boolean equals(final Object o) {
        return o instanceof zzig && this.zza.equals(((zzig)o).zza);
    }
    
    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }
    
    public final String toString() {
        final StringBuilder k = a.k("Optional.of(");
        k.append(this.zza);
        k.append(")");
        return k.toString();
    }
    
    public final Object zza() {
        return this.zza;
    }
    
    public final boolean zzb() {
        return true;
    }
}
