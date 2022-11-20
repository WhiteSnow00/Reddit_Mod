// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import android.content.Intent;
import android.net.Uri;
import ng2.e;
import android.content.Context;

public final class x implements f1
{
    public final Context a;
    
    public x(final Context a) {
        this.a = a;
    }
    
    @Override
    public final void a(final String s) {
        e.f((Object)s, "uri");
        this.a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(s)));
    }
}
