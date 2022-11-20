// 
// Decompiled by Procyon v0.6.0
// 

package com.tonyodev.fetch2core;

import android.net.Uri;
import java.util.LinkedHashMap;
import ng2.e;
import java.util.List;
import java.util.Map;
import java.io.InputStream;
import kotlin.Metadata;
import qd2.h;
import java.util.Set;
import java.io.Closeable;

public interface Downloader<T, R> extends Closeable
{
    Set<FileDownloaderType> C(final b p0);
    
    void G(final b p0);
    
    a N(final b p0, final h p1);
    
    FileDownloaderType Q(final b p0, final Set<? extends FileDownloaderType> p1);
    
    boolean c(final b p0, final String p1);
    
    void e(final a p0);
    
    void f(final b p0);
    
    void u(final b p0);
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005" }, d2 = { "Lcom/tonyodev/fetch2core/Downloader$FileDownloaderType;", "", "(Ljava/lang/String;I)V", "SEQUENTIAL", "PARALLEL", "fetch2core_release" }, k = 1, mv = { 1, 1, 16 })
    public enum FileDownloaderType
    {
        private static final FileDownloaderType[] $VALUES;
        
        PARALLEL, 
        SEQUENTIAL;
    }
    
    public static final class a
    {
        public final int a;
        public final boolean b;
        public final long c;
        public final InputStream d;
        public final b e;
        public final String f;
        public final Map<String, List<String>> g;
        public final boolean h;
        public final String i;
        
        public a(final int a, final boolean b, final long c, final InputStream d, final b e, final String f, final Map<String, ? extends List<String>> g, final boolean h, final String i) {
            e.g((Object)e, "request");
            e.g((Object)f, "hash");
            e.g((Object)g, "responseHeaders");
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = (Map<String, List<String>>)g;
            this.h = h;
            this.i = i;
        }
        
        public final boolean a() {
            return this.h;
        }
        
        public final long b() {
            return this.c;
        }
        
        public final String c() {
            return this.f;
        }
        
        public final b d() {
            return this.e;
        }
        
        public final boolean e() {
            return this.b;
        }
    }
    
    public static final class b
    {
        public final String a;
        public final Map<String, String> b;
        public final String c;
        public final String d;
        public final Extras e;
        
        public b(final String a, final LinkedHashMap b, final String c, final Uri uri, final String d, final Extras e) {
            e.g((Object)a, "url");
            e.g((Object)c, "file");
            e.g((Object)e, "extras");
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
        }
    }
}
