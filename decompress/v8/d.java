// 
// Decompiled by Procyon v0.6.0
// 

package v8;

import p8.b;
import p8.a;
import p8.a$b;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder;
import u8.n$a;
import o8.g;
import android.content.Context;
import java.io.InputStream;
import android.net.Uri;
import u8.n;

public final class d implements n<Uri, InputStream>
{
    public final Context a;
    
    public d(final Context context) {
        this.a = context.getApplicationContext();
    }
    
    public final n$a buildLoadData(Object o, int n, final int n2, final g g) {
        final Uri uri = (Uri)o;
        final int n3 = 1;
        if (n != Integer.MIN_VALUE && n2 != Integer.MIN_VALUE && n <= 512 && n2 <= 384) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (n != 0) {
            final Long n4 = g.a(VideoDecoder.d);
            if (n4 != null && n4 == -1L) {
                n = n3;
            }
            else {
                n = 0;
            }
            if (n != 0) {
                final j9.d d = new j9.d(uri);
                final Context a = this.a;
                o = new n$a((o8.d)d, (com.bumptech.glide.load.data.d)p8.a.e(a, uri, (b)new a$b(a.getContentResolver())));
                return (n$a)o;
            }
        }
        o = null;
        return (n$a)o;
    }
    
    public final boolean handles(final Object o) {
        final Uri uri = (Uri)o;
        return lw0.b.m1(uri) && uri.getPathSegments().contains("video");
    }
}
