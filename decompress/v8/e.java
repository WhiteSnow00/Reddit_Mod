// 
// Decompiled by Procyon v0.6.0
// 

package v8;

import android.database.Cursor;
import a4.d1;
import android.text.TextUtils;
import a4.c1;
import java.io.FileNotFoundException;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import u8.r;
import u8.o;
import lw0.b;
import android.os.Build$VERSION;
import j9.d;
import u8.n$a;
import o8.g;
import java.io.File;
import android.content.Context;
import android.net.Uri;
import u8.n;

public final class e<DataT> implements n<Uri, DataT>
{
    public final Context a;
    public final n<File, DataT> b;
    public final n<Uri, DataT> c;
    public final Class<DataT> d;
    
    public e(final Context context, final n<File, DataT> b, final n<Uri, DataT> c, final Class<DataT> d) {
        this.a = context.getApplicationContext();
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final n$a buildLoadData(final Object o, final int n, final int n2, final g g) {
        final Uri uri = (Uri)o;
        return new n$a((o8.d)new j9.d(uri), (com.bumptech.glide.load.data.d)new d(this.a, (u8.n<File, Object>)this.b, (u8.n<Uri, Object>)this.c, uri, n, n2, g, (Class<Object>)this.d));
    }
    
    public final boolean handles(final Object o) {
        final Uri uri = (Uri)o;
        return Build$VERSION.SDK_INT >= 29 && lw0.b.m1(uri);
    }
    
    public abstract static class a<DataT> implements o<Uri, DataT>
    {
        public final Context a;
        public final Class<DataT> b;
        
        public a(final Context a, final Class<DataT> b) {
            this.a = a;
            this.b = b;
        }
        
        public final n<Uri, DataT> build(final r r) {
            return (n<Uri, DataT>)new e(this.a, (u8.n<File, Object>)r.b((Class)File.class, (Class)this.b), (u8.n<Uri, Object>)r.b((Class)Uri.class, (Class)this.b), (Class<Object>)this.b);
        }
        
        public final void teardown() {
        }
    }
    
    public static final class d<DataT> implements com.bumptech.glide.load.data.d<DataT>
    {
        public static final String[] p;
        public final Context f;
        public final n<File, DataT> g;
        public final n<Uri, DataT> h;
        public final Uri i;
        public final int j;
        public final int k;
        public final g l;
        public final Class<DataT> m;
        public volatile boolean n;
        public volatile com.bumptech.glide.load.data.d<DataT> o;
        
        static {
            p = new String[] { "_data" };
        }
        
        public d(final Context context, final n<File, DataT> g, final n<Uri, DataT> h, final Uri i, final int j, final int k, final g l, final Class<DataT> m) {
            this.f = context.getApplicationContext();
            this.g = g;
            this.h = h;
            this.i = i;
            this.j = j;
            this.k = k;
            this.l = l;
            this.m = m;
        }
        
        @Override
        public final Class<DataT> a() {
            return this.m;
        }
        
        @Override
        public final void b() {
            final com.bumptech.glide.load.data.d<DataT> o = this.o;
            if (o != null) {
                o.b();
            }
        }
        
        @Override
        public final DataSource c() {
            return DataSource.LOCAL;
        }
        
        @Override
        public final void cancel() {
            this.n = true;
            final com.bumptech.glide.load.data.d<DataT> o = this.o;
            if (o != null) {
                o.cancel();
            }
        }
        
        @Override
        public final void d(final Priority priority, final com.bumptech.glide.load.data.d.a<? super DataT> a) {
            try {
                final com.bumptech.glide.load.data.d<DataT> e = this.e();
                if (e == null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Failed to build fetcher for: ");
                    sb.append(this.i);
                    a.f(new IllegalArgumentException(sb.toString()));
                    return;
                }
                this.o = e;
                if (this.n) {
                    this.cancel();
                }
                else {
                    e.d(priority, a);
                }
            }
            catch (final FileNotFoundException ex) {
                a.f(ex);
            }
        }
        
        public final com.bumptech.glide.load.data.d<DataT> e() throws FileNotFoundException {
            final boolean j = c1.j();
            com.bumptech.glide.load.data.d<DataT> c = null;
            Object string = null;
            Object buildLoadData = null;
            Label_0287: {
                if (j) {
                    final n<File, DataT> g = this.g;
                    final Uri i = this.i;
                    try {
                        final Cursor query = this.f.getContentResolver().query(i, d.p, (String)null, (String[])null, (String)null);
                        Label_0160: {
                            if (query == null) {
                                break Label_0160;
                            }
                            try {
                                if (!query.moveToFirst()) {
                                    string = new(java.io.FileNotFoundException.class)();
                                    final StringBuilder sb = new StringBuilder();
                                    sb.append("Failed to media store entry for: ");
                                    sb.append(i);
                                    new FileNotFoundException(sb.toString());
                                    throw string;
                                }
                                string = query.getString(query.getColumnIndexOrThrow("_data"));
                                if (!TextUtils.isEmpty((CharSequence)string)) {
                                    string = new File((String)string);
                                    query.close();
                                    g.buildLoadData(string, this.j, this.k, this.l);
                                    break Label_0287;
                                }
                                string = new(java.io.FileNotFoundException.class)();
                                final StringBuilder sb2 = new StringBuilder();
                                sb2.append("File path was empty in media store for: ");
                                sb2.append(i);
                                new FileNotFoundException(sb2.toString());
                                throw string;
                            }
                            finally {}
                        }
                    }
                    finally {
                        buildLoadData = string;
                    }
                    if (buildLoadData != null) {
                        ((Cursor)buildLoadData).close();
                    }
                }
                else {
                    Uri uri;
                    if (this.f.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                        uri = d1.a(this.i);
                    }
                    else {
                        uri = this.i;
                    }
                    buildLoadData = this.h.buildLoadData((Object)uri, this.j, this.k, this.l);
                }
            }
            if (buildLoadData != null) {
                c = ((n$a)buildLoadData).c;
            }
            return c;
        }
    }
}
