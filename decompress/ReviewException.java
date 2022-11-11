// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.play.core.review;

import java.util.HashMap;
import lg.a;
import java.util.Locale;
import com.google.android.play.core.tasks.zzj;

public class ReviewException extends zzj
{
    private final int zza;
    
    public ReviewException(final int zza) {
        final Locale default1 = Locale.getDefault();
        final HashMap a = lg.a.a;
        final Integer value = zza;
        String j;
        if (!a.containsKey(value)) {
            j = "";
        }
        else {
            final String s = a.get(value);
            final String s2 = lg.a.b.get(value);
            j = a.j(new StringBuilder(String.valueOf(s).length() + 106 + String.valueOf(s2).length()), s, " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#", s2, ")");
        }
        super(String.format(default1, "Review Error(%d): %s", zza, j));
        this.zza = zza;
    }
    
    public int getErrorCode() {
        return this.zza;
    }
}
