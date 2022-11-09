// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import android.content.Intent;
import android.net.Uri;
import ah2.f;
import android.content.Context;

public final class z implements f1
{
    public final Context a;
    
    public z(final Context a) {
        this.a = a;
    }
    
    public final void a(final String s) {
        f.f((Object)s, "uri");
        this.a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(s)));
    }
}
