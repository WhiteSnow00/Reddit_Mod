// 
// Decompiled by Procyon v0.6.0
// 

package com.bumptech.glide.integration.webp;

import android.content.res.Resources;
import p8.i;
import g9.d$a;
import o8.l;
import o8.g;
import o8.k;
import o8.e;
import o8.b;
import android.graphics.drawable.BitmapDrawable;
import java.io.InputStream;
import p8.h;
import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import o8.f;
import o8.a;
import o8.j;
import com.bumptech.glide.Registry;
import com.bumptech.glide.d;
import android.content.Context;
import f9.c;

@Deprecated
public class WebpGlideModule implements c
{
    public final void a(final Context context, final d d) {
    }
    
    public final void b(final Context context, com.bumptech.glide.c d, final Registry registry) {
        final Resources resources = context.getResources();
        final s8.d f = d.f;
        final s8.b j = d.j;
        final j i = new j(registry.d(), resources.getDisplayMetrics(), f, j);
        final a a = new a(j, f);
        final o8.c c = new o8.c(i);
        final f f2 = new f(i, j);
        final o8.d d2 = new o8.d(context, j, f);
        registry.f((h)c, ByteBuffer.class, Bitmap.class, "Bitmap");
        registry.f((h)f2, InputStream.class, Bitmap.class, "Bitmap");
        registry.f(new y8.a(resources, (h)c), ByteBuffer.class, BitmapDrawable.class, "BitmapDrawable");
        registry.f(new y8.a(resources, (h)f2), InputStream.class, BitmapDrawable.class, "BitmapDrawable");
        registry.f((h)new b(a), ByteBuffer.class, Bitmap.class, "Bitmap");
        registry.f((h)new e(a), InputStream.class, Bitmap.class, "Bitmap");
        registry.f((h)d2, ByteBuffer.class, k.class, "legacy_prepend_all");
        registry.f((h)new g(d2, j), InputStream.class, k.class, "legacy_prepend_all");
        final l l = new l(0);
        d = (com.bumptech.glide.c)registry.d;
        synchronized (d) {
            ((g9.d)d).a.add(0, new d$a((Class)k.class, (i)l));
        }
    }
}
