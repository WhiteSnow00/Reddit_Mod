// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.ads.identifier;

import java.util.Iterator;
import android.net.Uri$Builder;
import android.net.Uri;
import java.util.Map;

final class zza extends Thread
{
    public final /* synthetic */ Map zza;
    
    public zza(final AdvertisingIdClient advertisingIdClient, final Map zza) {
        this.zza = zza;
    }
    
    @Override
    public final void run() {
        final Map zza = this.zza;
        final Uri$Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (final String s : zza.keySet()) {
            buildUpon.appendQueryParameter(s, (String)zza.get(s));
        }
        zzc.zza(buildUpon.build().toString());
    }
}
