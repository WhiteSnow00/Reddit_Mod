// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.measurement;

import ie.c5;
import java.io.Serializable;

final class zzii implements Serializable, c5
{
    public final c5 zza;
    public transient volatile boolean zzb;
    public transient Object zzc;
    
    public zzii(final c5 zza) {
        zza.getClass();
        this.zza = zza;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("Suppliers.memoize(");
        Object o;
        if (this.zzb) {
            final StringBuilder r2 = a.r("<supplier that returned ");
            r2.append(this.zzc);
            r2.append(">");
            o = r2.toString();
        }
        else {
            o = this.zza;
        }
        r.append(o);
        r.append(")");
        return r.toString();
    }
    
    @Override
    public final Object zza() {
        if (!this.zzb) {
            synchronized (this) {
                if (!this.zzb) {
                    final Object zza = this.zza.zza();
                    this.zzc = zza;
                    this.zzb = true;
                    return zza;
                }
            }
        }
        return this.zzc;
    }
}
