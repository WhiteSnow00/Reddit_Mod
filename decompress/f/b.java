// 
// Decompiled by Procyon v0.6.0
// 

package f;

import sg2.e;
import android.content.Intent;
import androidx.activity.ComponentActivity;
import android.net.Uri;

public final class b extends a<String, Uri>
{
    public final Intent a(final ComponentActivity componentActivity, final Object o) {
        final String type = (String)o;
        e.f((Object)componentActivity, "context");
        e.f((Object)type, "input");
        final Intent setType = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(type);
        e.e((Object)setType, "Intent(Intent.ACTION_GET\u2026          .setType(input)");
        return setType;
    }
    
    public final a$a b(final ComponentActivity componentActivity, final Object o) {
        final String s = (String)o;
        e.f((Object)componentActivity, "context");
        e.f((Object)s, "input");
        return null;
    }
    
    public final Object c(int n, Intent intent) {
        if (n == -1) {
            n = 1;
        }
        else {
            n = 0;
        }
        Object data = null;
        if (n == 0) {
            intent = null;
        }
        if (intent != null) {
            data = intent.getData();
        }
        return data;
    }
}
