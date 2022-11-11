// 
// Decompiled by Procyon v0.6.0
// 

package f;

import android.os.Parcelable;
import android.content.Intent;
import androidx.activity.ComponentActivity;
import android.net.Uri;

public final class e extends a<Uri, Boolean>
{
    public final Intent a(final ComponentActivity componentActivity, final Object o) {
        final Uri uri = (Uri)o;
        sg2.e.f((Object)componentActivity, "context");
        sg2.e.f((Object)uri, "input");
        final Intent putExtra = new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", (Parcelable)uri);
        sg2.e.e((Object)putExtra, "Intent(MediaStore.ACTION\u2026tore.EXTRA_OUTPUT, input)");
        return putExtra;
    }
    
    public final a$a b(final ComponentActivity componentActivity, final Object o) {
        final Uri uri = (Uri)o;
        sg2.e.f((Object)componentActivity, "context");
        sg2.e.f((Object)uri, "input");
        return null;
    }
    
    public final Object c(final int n, final Intent intent) {
        return n == -1;
    }
}
