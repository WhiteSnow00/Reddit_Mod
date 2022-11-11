// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.play.core.assetpacks;

final class zzck extends RuntimeException
{
    public final int zza;
    
    public zzck(final String s) {
        super(s);
        this.zza = -1;
    }
    
    public zzck(final String s, final int zza) {
        super(s);
        this.zza = zza;
    }
    
    public zzck(final String s, final Exception ex) {
        super(s, ex);
        this.zza = -1;
    }
    
    public zzck(final String s, final Exception ex, final int zza) {
        super(s, ex);
        this.zza = zza;
    }
}
