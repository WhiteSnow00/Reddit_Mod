// 
// Decompiled by Procyon v0.6.0
// 

package com.bumptech.glide.integration.okhttp3;

import u8.o;
import java.io.InputStream;
import com.bumptech.glide.Registry;
import com.bumptech.glide.d;
import android.content.Context;
import e9.c;

@Deprecated
public class OkHttpGlideModule implements c
{
    @Override
    public final void a(final Context context, final d d) {
    }
    
    @Override
    public final void b(final Context context, final com.bumptech.glide.c c, final Registry registry) {
        registry.i(InputStream.class, (o)new b$a());
    }
}
