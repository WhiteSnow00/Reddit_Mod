// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.measurement;

import ke.a5;
import java.io.Serializable;

final class zzii implements Serializable, a5
{
    public final a5 zza;
    public transient volatile boolean zzb;
    public transient Object zzc;
    
    public zzii(final a5 zza) {
        zza.getClass();
        this.zza = zza;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("Suppliers.memoize(");
        Object o;
        if (this.zzb) {
            final StringBuilder i = a.k("<supplier that returned ");
            i.append(this.zzc);
            i.append(">");
            o = i.toString();
        }
        else {
            o = this.zza;
        }
        k.append(o);
        k.append(")");
        return k.toString();
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
