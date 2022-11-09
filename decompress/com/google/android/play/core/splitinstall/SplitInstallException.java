// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.play.core.splitinstall;

import java.util.HashMap;
import og.a;
import com.google.android.play.core.tasks.zzj;

public class SplitInstallException extends zzj
{
    private final int zza;
    
    public SplitInstallException(final int zza) {
        final HashMap a = og.a.a;
        final Integer value = zza;
        String j = null;
        Label_0099: {
            if (a.containsKey(value)) {
                final HashMap b = og.a.b;
                if (b.containsKey(value)) {
                    final String s = a.get(value);
                    final String s2 = b.get(value);
                    j = a.j(new StringBuilder(String.valueOf(s).length() + 118 + String.valueOf(s2).length()), s, " (https://developer.android.com/reference/com/google/android/play/core/splitinstall/model/SplitInstallErrorCode.html#", s2, ")");
                    break Label_0099;
                }
            }
            j = "";
        }
        super(String.format("Split Install Error(%d): %s", zza, j));
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
