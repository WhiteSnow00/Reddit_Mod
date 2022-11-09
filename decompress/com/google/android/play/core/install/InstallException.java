// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.play.core.install;

import java.util.HashMap;
import hg.a;
import com.google.android.play.core.tasks.zzj;

public class InstallException extends zzj
{
    private final int zza;
    
    public InstallException(final int zza) {
        final HashMap a = hg.a.a;
        final Integer value = zza;
        String j = null;
        Label_0094: {
            if (a.containsKey(value)) {
                final HashMap b = hg.a.b;
                if (b.containsKey(value)) {
                    final String s = a.get(value);
                    final String s2 = b.get(value);
                    j = a.j(new StringBuilder(String.valueOf(s).length() + 103 + String.valueOf(s2).length()), s, " (https://developer.android.com/reference/com/google/android/play/core/install/model/InstallErrorCode#", s2, ")");
                    break Label_0094;
                }
            }
            j = "";
        }
        super(String.format("Install Error(%d): %s", zza, j));
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
