// 
// Decompiled by Procyon v0.6.0
// 

package com.bumptech.glide.integration.okhttp3;

import v8.r;
import okhttp3.OkHttpClient;
import v8.o;
import p8.g;
import p8.d;
import l8.a;
import v8.n$a;
import okhttp3.Call$Factory;
import java.io.InputStream;
import v8.f;
import v8.n;

public class b implements n<f, InputStream>
{
    public final Call$Factory a;
    
    public b(final Call$Factory a) {
        this.a = a;
    }
    
    public n$a a(final f f) {
        return new n$a((d)f, (com.bumptech.glide.load.data.d)new l8.a(this.a, f));
    }
    
    public /* bridge */ n$a buildLoadData(final Object o, final int n, final int n2, final g g) {
        return this.a((f)o);
    }
    
    public final /* bridge */ boolean handles(final Object o) {
        final f f = (f)o;
        return true;
    }
    
    public static final class a implements o<f, InputStream>
    {
        public static volatile OkHttpClient b;
        public final Call$Factory a;
        
        public a() {
            if (a.b == null) {
                synchronized (a.class) {
                    if (a.b == null) {
                        a.b = new OkHttpClient();
                    }
                }
            }
            final OkHttpClient b = a.b;
            this.a = (Call$Factory)b;
        }
        
        public final n<f, InputStream> build(final r r) {
            return (n<f, InputStream>)new b(this.a);
        }
        
        public final void teardown() {
        }
    }
}
