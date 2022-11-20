// 
// Decompiled by Procyon v0.6.0
// 

package com.bumptech.glide.load.data;

import java.io.IOException;
import s8.b;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.InputStream;

public final class k implements e<InputStream>
{
    public final RecyclableBufferedInputStream a;
    
    public k(final InputStream inputStream, final b b) {
        (this.a = new RecyclableBufferedInputStream(inputStream, b)).mark(5242880);
    }
    
    public final Object a() throws IOException {
        this.a.reset();
        return this.a;
    }
    
    public final void b() {
        this.a.b();
    }
    
    public static final class a implements e$a<InputStream>
    {
        public final b a;
        
        public a(final b a) {
            this.a = a;
        }
        
        public final Class<InputStream> a() {
            return InputStream.class;
        }
        
        public final e b(final Object o) {
            return (e)new k((InputStream)o, this.a);
        }
    }
}
