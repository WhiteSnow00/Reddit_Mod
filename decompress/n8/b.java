// 
// Decompiled by Procyon v0.6.0
// 

package n8;

import android.content.res.Resources;
import p8.i;
import g9.d$a;
import o8.l;
import o8.g;
import o8.k;
import o8.e;
import android.graphics.drawable.BitmapDrawable;
import java.io.InputStream;
import p8.h;
import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import o8.f;
import o8.a;
import o8.j;
import com.bumptech.glide.Registry;
import com.bumptech.glide.c;
import android.content.Context;
import f9.d;

public final class b extends d
{
    @Override
    public final void b(Context d, final c c, final Registry registry) {
        final Resources resources = d.getResources();
        final s8.d f = c.f;
        final s8.b j = c.j;
        final j i = new j(registry.d(), resources.getDisplayMetrics(), f, j);
        final a a = new a(j, f);
        final o8.c c2 = new o8.c(i);
        final f f2 = new f(i, j);
        final o8.d d2 = new o8.d(d, j, f);
        registry.f((h)c2, ByteBuffer.class, Bitmap.class, "Bitmap");
        registry.f((h)f2, InputStream.class, Bitmap.class, "Bitmap");
        registry.f(new y8.a(resources, (h)c2), ByteBuffer.class, BitmapDrawable.class, "BitmapDrawable");
        registry.f(new y8.a(resources, (h)f2), InputStream.class, BitmapDrawable.class, "BitmapDrawable");
        registry.f((h)new o8.b(a), ByteBuffer.class, Bitmap.class, "Bitmap");
        registry.f((h)new e(a), InputStream.class, Bitmap.class, "Bitmap");
        registry.f((h)d2, ByteBuffer.class, k.class, "legacy_prepend_all");
        registry.f((h)new g(d2, j), InputStream.class, k.class, "legacy_prepend_all");
        final l l = new l(0);
        d = (Context)registry.d;
        synchronized (d) {
            ((g9.d)d).a.add(0, new d$a((Class)k.class, (i)l));
        }
    }
}
