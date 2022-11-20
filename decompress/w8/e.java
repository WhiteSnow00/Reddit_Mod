// 
// Decompiled by Procyon v0.6.0
// 

package w8;

import android.database.Cursor;
import a4.u0;
import android.text.TextUtils;
import a4.t0;
import java.io.FileNotFoundException;
import com.bumptech.glide.load.data.d$a;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.InputStream;
import android.os.ParcelFileDescriptor;
import v8.r;
import v8.o;
import ah0.b;
import android.os.Build$VERSION;
import k9.d;
import v8.n$a;
import p8.g;
import java.io.File;
import android.content.Context;
import android.net.Uri;
import v8.n;

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
        return new n$a((p8.d)new k9.d(uri), (com.bumptech.glide.load.data.d)new d(this.a, (v8.n<File, Object>)this.b, (v8.n<Uri, Object>)this.c, uri, n, n2, g, (Class<Object>)this.d));
    }
    
    public final boolean handles(final Object o) {
        final Uri uri = (Uri)o;
        return Build$VERSION.SDK_INT >= 29 && ah0.b.L0(uri);
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
            return (n<Uri, DataT>)new e(this.a, (v8.n<File, Object>)r.b((Class)File.class, (Class)this.b), (v8.n<Uri, Object>)r.b((Class)Uri.class, (Class)this.b), (Class<Object>)this.b);
        }
        
        public final void teardown() {
        }
    }
    
    public static final class b extends a<ParcelFileDescriptor>
    {
        public b(final Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }
    
    public static final class c extends a<InputStream>
    {
        public c(final Context context) {
            super(context, InputStream.class);
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
        
        public final Class<DataT> a() {
            return this.m;
        }
        
        public final void b() {
            final com.bumptech.glide.load.data.d<DataT> o = this.o;
            if (o != null) {
                o.b();
            }
        }
        
        public final DataSource c() {
            return DataSource.LOCAL;
        }
        
        public final void cancel() {
            this.n = true;
            final com.bumptech.glide.load.data.d<DataT> o = this.o;
            if (o != null) {
                o.cancel();
            }
        }
        
        public final void d(final Priority priority, final d$a<? super DataT> d$a) {
            try {
                final com.bumptech.glide.load.data.d<DataT> e = this.e();
                if (e == null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Failed to build fetcher for: ");
                    sb.append(this.i);
                    d$a.f((Exception)new IllegalArgumentException(sb.toString()));
                    return;
                }
                this.o = e;
                if (this.n) {
                    this.cancel();
                }
                else {
                    e.d(priority, (d$a)d$a);
                }
            }
            catch (final FileNotFoundException ex) {
                d$a.f((Exception)ex);
            }
        }
        
        public final com.bumptech.glide.load.data.d<DataT> e() throws FileNotFoundException {
            final boolean m = t0.m();
            Object c = null;
            Object string = null;
            n$a buildLoadData = null;
            Label_0301: {
                if (m) {
                    final n<File, DataT> g = this.g;
                    final Uri i = this.i;
                    try {
                        final Cursor query = this.f.getContentResolver().query(i, d.p, (String)null, (String[])null, (String)null);
                        Label_0169: {
                            if (query == null) {
                                break Label_0169;
                            }
                            try {
                                if (!query.moveToFirst()) {
                                    string = new StringBuilder();
                                    ((StringBuilder)string).append("Failed to media store entry for: ");
                                    ((StringBuilder)string).append(i);
                                    throw new FileNotFoundException(((StringBuilder)string).toString());
                                }
                                string = query.getString(query.getColumnIndexOrThrow("_data"));
                                if (!TextUtils.isEmpty((CharSequence)string)) {
                                    final File file = new File((String)string);
                                    query.close();
                                    g.buildLoadData((Object)file, this.j, this.k, this.l);
                                    break Label_0301;
                                }
                                string = new StringBuilder();
                                ((StringBuilder)string).append("File path was empty in media store for: ");
                                ((StringBuilder)string).append(i);
                                throw new FileNotFoundException(((StringBuilder)string).toString());
                            }
                            finally {}
                        }
                    }
                    finally {
                        c = string;
                    }
                    if (c != null) {
                        ((Cursor)c).close();
                    }
                }
                else {
                    Uri uri;
                    if (this.f.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                        uri = u0.b(this.i);
                    }
                    else {
                        uri = this.i;
                    }
                    buildLoadData = this.h.buildLoadData((Object)uri, this.j, this.k, this.l);
                }
            }
            if (buildLoadData != null) {
                c = buildLoadData.c;
            }
            return (com.bumptech.glide.load.data.d<DataT>)c;
        }
    }
}
