// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import he.bb;
import he.v9;
import java.util.regex.Pattern;
import java.io.Serializable;
import he.ia;

final class zzt extends ia implements Serializable
{
    private final Pattern zza;
    
    public zzt(final Pattern zza) {
        zza.getClass();
        this.zza = zza;
    }
    
    public final String toString() {
        return this.zza.toString();
    }
    
    public final v9 zza(final CharSequence charSequence) {
        return (v9)new bb(this.zza.matcher(charSequence));
    }
}
