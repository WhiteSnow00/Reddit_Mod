// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.play.core.assetpacks;

import java.util.HashMap;
import fg.a;
import com.google.android.play.core.tasks.zzj;

public class AssetPackException extends zzj
{
    private final int zza;
    
    public AssetPackException(final int zza) {
        final HashMap a = fg.a.a;
        final Integer value = zza;
        String j;
        if (!a.containsKey(value)) {
            j = "";
        }
        else {
            final String s = a.get(value);
            final String s2 = fg.a.b.get(value);
            j = a.j(new StringBuilder(String.valueOf(s).length() + 113 + String.valueOf(s2).length()), s, " (https://developer.android.com/reference/com/google/android/play/core/assetpacks/model/AssetPackErrorCode.html#", s2, ")");
        }
        super(String.format("Asset Pack Download Error(%d): %s", zza, j));
        if (zza != 0) {
            this.zza = zza;
            return;
        }
        throw new IllegalArgumentException("errorCode should not be 0.");
    }
    
    public int getErrorCode() {
        return this.zza;
    }
}
