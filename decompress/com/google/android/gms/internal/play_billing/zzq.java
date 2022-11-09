// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.play_billing;

final class zzq<E> extends zzp<E>
{
    public static final zzp<Object> zza;
    public final transient Object[] zzb;
    
    static {
        zza = new zzq<Object>(new Object[0], 0);
    }
    
    public zzq(final Object[] zzb, final int n) {
        this.zzb = zzb;
    }
    
    public final E get(final int n) {
        h.a(n, 0);
        return (E)this.zzb[n];
    }
    
    public final int size() {
        return 0;
    }
    
    @Override
    public final int zza(final Object[] array, final int n) {
        System.arraycopy(this.zzb, 0, array, 0, 0);
        return 0;
    }
    
    public final int zzb() {
        return 0;
    }
    
    public final int zzc() {
        return 0;
    }
    
    public final Object[] zze() {
        return this.zzb;
    }
}
