// 
// Decompiled by Procyon v0.6.0
// 

package v8;

import com.bumptech.glide.load.data.m;
import java.io.InputStream;
import com.bumptech.glide.load.data.h;
import android.os.ParcelFileDescriptor;
import k9.d;
import p8.g;
import android.content.res.AssetManager;
import android.net.Uri;

public final class a<Data> implements n<Uri, Data>
{
    public final AssetManager a;
    public final a<Data> b;
    
    public a(final AssetManager a, final a<Data> b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final n.a buildLoadData(final Object o, final int n, final int n2, final g g) {
        final Uri uri = (Uri)o;
        return new n.a(new d(uri), (com.bumptech.glide.load.data.d<Object>)this.b.a(this.a, uri.toString().substring(22)));
    }
    
    @Override
    public final boolean handles(final Object o) {
        final Uri uri = (Uri)o;
        final boolean equals = "file".equals(uri.getScheme());
        boolean b2;
        final boolean b = b2 = false;
        if (equals) {
            b2 = b;
            if (!uri.getPathSegments().isEmpty()) {
                b2 = b;
                if ("android_asset".equals(uri.getPathSegments().get(0))) {
                    b2 = true;
                }
            }
        }
        return b2;
    }
    
    public interface a<Data>
    {
        com.bumptech.glide.load.data.d<Data> a(final AssetManager p0, final String p1);
    }
    
    public static final class b implements o<Uri, ParcelFileDescriptor>, a<ParcelFileDescriptor>
    {
        public final AssetManager a;
        
        public b(final AssetManager a) {
            this.a = a;
        }
        
        @Override
        public final com.bumptech.glide.load.data.d<ParcelFileDescriptor> a(final AssetManager assetManager, final String s) {
            return (com.bumptech.glide.load.data.d<ParcelFileDescriptor>)new h(assetManager, s);
        }
        
        @Override
        public final n<Uri, ParcelFileDescriptor> build(final r r) {
            return new a<ParcelFileDescriptor>(this.a, (a<ParcelFileDescriptor>)this);
        }
        
        @Override
        public final void teardown() {
        }
    }
    
    public static final class c implements o<Uri, InputStream>, a<InputStream>
    {
        public final AssetManager a;
        
        public c(final AssetManager a) {
            this.a = a;
        }
        
        @Override
        public final com.bumptech.glide.load.data.d<InputStream> a(final AssetManager assetManager, final String s) {
            return (com.bumptech.glide.load.data.d<InputStream>)new m(assetManager, s);
        }
        
        @Override
        public final n<Uri, InputStream> build(final r r) {
            return new a<InputStream>(this.a, (a<InputStream>)this);
        }
        
        @Override
        public final void teardown() {
        }
    }
}
