// 
// Decompiled by Procyon v0.6.0
// 

package w8;

import v8.r;
import v8.o;
import q8.b;
import q8.a;
import p8.f;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder;
import v8.n$a;
import p8.g;
import android.content.Context;
import java.io.InputStream;
import android.net.Uri;
import v8.n;

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
            final Long n4 = g.a((f<Long>)VideoDecoder.d);
            if (n4 != null && n4 == -1L) {
                n = n3;
            }
            else {
                n = 0;
            }
            if (n != 0) {
                final k9.d d = new k9.d(uri);
                final Context a = this.a;
                o = new n$a((p8.d)d, (com.bumptech.glide.load.data.d)q8.a.e(a, uri, (b)new q8.a.b(a.getContentResolver())));
                return (n$a)o;
            }
        }
        o = null;
        return (n$a)o;
    }
    
    public final boolean handles(final Object o) {
        final Uri uri = (Uri)o;
        return ah0.b.L0(uri) && uri.getPathSegments().contains("video");
    }
    
    public static final class a implements o<Uri, InputStream>
    {
        public final Context a;
        
        public a(final Context a) {
            this.a = a;
        }
        
        public final n<Uri, InputStream> build(final r r) {
            return (n<Uri, InputStream>)new d(this.a);
        }
        
        public final void teardown() {
        }
    }
}
