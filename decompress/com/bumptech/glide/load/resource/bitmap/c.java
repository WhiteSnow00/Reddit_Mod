// 
// Decompiled by Procyon v0.6.0
// 

package com.bumptech.glide.load.resource.bitmap;

import java.util.ArrayDeque;
import k9.d;
import q8.l;
import java.io.IOException;
import o8.g;
import r8.b;
import android.graphics.Bitmap;
import java.io.InputStream;
import o8.h;

public final class c implements h<InputStream, Bitmap>
{
    public final com.bumptech.glide.load.resource.bitmap.a a;
    public final b b;
    
    public c(final com.bumptech.glide.load.resource.bitmap.a a, final b b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean a(final Object o, final g g) throws IOException {
        final InputStream inputStream = (InputStream)o;
        this.a.getClass();
        return true;
    }
    
    @Override
    public final l b(Object f, final int n, final int n2, g h) throws IOException {
        final InputStream inputStream = (InputStream)f;
        boolean b;
        if (inputStream instanceof RecyclableBufferedInputStream) {
            f = inputStream;
            b = false;
        }
        else {
            f = new RecyclableBufferedInputStream(inputStream, this.b);
            b = true;
        }
        final ArrayDeque h2 = d.h;
        synchronized (h2) {
            final d d = h2.poll();
            monitorexit(h2);
            d d2 = d;
            if (d == null) {
                d2 = new d();
            }
            d2.f = (InputStream)f;
            final k9.h h3 = new k9.h(d2);
            final a a = new a((RecyclableBufferedInputStream)f, d2);
            try {
                final com.bumptech.glide.load.resource.bitmap.a a2 = this.a;
                final x8.d a3 = a2.a((com.bumptech.glide.load.resource.bitmap.b)new com.bumptech.glide.load.resource.bitmap.b.a(a2.c, (InputStream)h3, a2.d), n, n2, h, (a$b)a);
                d2.g = null;
                d2.f = null;
                synchronized (h2) {
                    h2.offer(d2);
                    monitorexit(h2);
                    if (b) {
                        ((RecyclableBufferedInputStream)f).b();
                    }
                    return (l)a3;
                }
            }
            finally {
                d2.g = null;
                d2.f = null;
                h = (g)k9.d.h;
                synchronized (h) {
                    ((ArrayDeque<d>)h).offer(d2);
                    monitorexit(h);
                    if (b) {
                        ((RecyclableBufferedInputStream)f).b();
                    }
                }
            }
        }
    }
    
    public static final class a implements a$b
    {
        public final RecyclableBufferedInputStream a;
        public final d b;
        
        public a(final RecyclableBufferedInputStream a, final d b) {
            this.a = a;
            this.b = b;
        }
        
        public final void a() {
            final RecyclableBufferedInputStream a = this.a;
            synchronized (a) {
                a.h = a.f.length;
            }
        }
        
        public final void b(final r8.d d, final Bitmap bitmap) throws IOException {
            final IOException g = this.b.g;
            if (g != null) {
                if (bitmap != null) {
                    d.put(bitmap);
                }
                throw g;
            }
        }
    }
}
