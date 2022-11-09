// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import ie.cb;
import ie.y9;
import java.util.regex.Pattern;
import java.io.Serializable;
import ie.ja;

final class zzt extends ja implements Serializable
{
    private final Pattern zza;
    
    public zzt(final Pattern zza) {
        zza.getClass();
        this.zza = zza;
    }
    
    public final String toString() {
        return this.zza.toString();
    }
    
    public final y9 zza(final CharSequence charSequence) {
        return (y9)new cb(this.zza.matcher(charSequence));
    }
}
