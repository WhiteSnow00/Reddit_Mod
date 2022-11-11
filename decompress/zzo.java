// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.play_billing;

import java.util.List;

final class zzo extends zzp
{
    public final transient int zza;
    public final transient int zzb;
    public final /* synthetic */ zzp zzc;
    
    public zzo(final zzp zzc, final int zza, final int zzb) {
        this.zzc = zzc;
        this.zza = zza;
        this.zzb = zzb;
    }
    
    public final Object get(final int n) {
        h.a(n, this.zzb);
        return this.zzc.get(n + this.zza);
    }
    
    public final int size() {
        return this.zzb;
    }
    
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }
    
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }
    
    public final Object[] zze() {
        return this.zzc.zze();
    }
    
    @Override
    public final zzp zzf(final int n, final int n2) {
        h.c(n, n2, this.zzb);
        final zzp zzc = this.zzc;
        final int zza = this.zza;
        return zzc.zzf(n + zza, n2 + zza);
    }
}
