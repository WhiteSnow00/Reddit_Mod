// 
// Decompiled by Procyon v0.6.0
// 

package ge2;

import android.content.ContentResolver;
import android.provider.Settings$System;
import android.os.Handler;
import android.database.ContentObserver;

public final class b extends ContentObserver
{
    public final /* synthetic */ c a;
    
    public b(final c a) {
        this.a = a;
        super((Handler)null);
    }
    
    public final void onChange(final boolean b) {
        final c a = this.a;
        final ContentResolver contentResolver = a.a.getContentResolver();
        boolean d = false;
        if (Settings$System.getInt(contentResolver, "haptic_feedback_enabled", 0) == 1) {
            d = true;
        }
        a.d = d;
    }
}
