// 
// Decompiled by Procyon v0.6.0
// 

package f;

import sg2.e;
import androidx.activity.ComponentActivity;
import android.content.Intent;

public final class d extends a<Intent, androidx.activity.result.a>
{
    public final Intent a(final ComponentActivity componentActivity, final Object o) {
        final Intent intent = (Intent)o;
        e.f((Object)componentActivity, "context");
        e.f((Object)intent, "input");
        return intent;
    }
    
    public final Object c(final int n, final Intent intent) {
        return new androidx.activity.result.a(n, intent);
    }
}
