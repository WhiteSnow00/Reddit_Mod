// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.measurement;

import je.z4;
import java.io.Serializable;

final class zzii implements Serializable, z4
{
    public final z4 zza;
    public transient volatile boolean zzb;
    public transient Object zzc;
    
    public zzii(final z4 zza) {
        zza.getClass();
        this.zza = zza;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("Suppliers.memoize(");
        Object o;
        if (this.zzb) {
            final StringBuilder t2 = a.t("<supplier that returned ");
            t2.append(this.zzc);
            t2.append(">");
            o = t2.toString();
        }
        else {
            o = this.zza;
        }
        t.append(o);
        t.append(")");
        return t.toString();
    }
    
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
