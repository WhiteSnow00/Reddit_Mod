// 
// Decompiled by Procyon v0.6.0
// 

package com.bumptech.glide.integration.webp;

import android.content.res.Resources;
import o8.i;
import f9.d$a;
import n8.g;
import n8.k;
import n8.e;
import n8.b;
import android.graphics.drawable.BitmapDrawable;
import java.io.InputStream;
import o8.h;
import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import n8.f;
import n8.a;
import n8.j;
import com.bumptech.glide.Registry;
import com.bumptech.glide.d;
import android.content.Context;
import e9.c;

@Deprecated
public class WebpGlideModule implements c
{
    @Override
    public final void a(final Context context, final d d) {
    }
    
    @Override
    public final void b(final Context context, com.bumptech.glide.c d, final Registry registry) {
        final Resources resources = context.getResources();
        final r8.d f = d.f;
        final r8.b j = d.j;
        final j i = new j(registry.d(), resources.getDisplayMetrics(), f, j);
        final a a = new a(j, f);
        final n8.c c = new n8.c(i);
        final n8.f f2 = new n8.f(i, j);
        final n8.d d2 = new n8.d(context, j, f);
        registry.f((h)c, ByteBuffer.class, Bitmap.class, "Bitmap");
        registry.f(f2, InputStream.class, Bitmap.class, "Bitmap");
        registry.f((h)new x8.a(resources, (h)c), ByteBuffer.class, BitmapDrawable.class, "BitmapDrawable");
        registry.f((h)new x8.a(resources, (h)f2), InputStream.class, BitmapDrawable.class, "BitmapDrawable");
        registry.f((h)new n8.b(a), ByteBuffer.class, Bitmap.class, "Bitmap");
        registry.f(new e(a), InputStream.class, Bitmap.class, "Bitmap");
        registry.f(d2, ByteBuffer.class, k.class, "legacy_prepend_all");
        registry.f(new g(d2, j), InputStream.class, k.class, "legacy_prepend_all");
        final dn.a a2 = new dn.a(1);
        d = (com.bumptech.glide.c)registry.d;
        synchronized (d) {
            ((f9.d)d).a.add(0, new d$a((Class)k.class, (i)a2));
        }
    }
}
