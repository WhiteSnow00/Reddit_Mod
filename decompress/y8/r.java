// 
// Decompiled by Procyon v0.6.0
// 

package y8;

import java.io.IOException;
import com.bumptech.glide.load.resource.bitmap.a$b;
import com.bumptech.glide.load.resource.bitmap.b;
import com.bumptech.glide.load.resource.bitmap.b$b;
import r8.l;
import p8.g;
import com.bumptech.glide.load.resource.bitmap.a;
import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import p8.h;

public final class r implements h<ParcelFileDescriptor, Bitmap>
{
    public final a a;
    
    public r(final a a) {
        this.a = a;
    }
    
    @Override
    public final l a(final Object o, final int n, final int n2, final g g) throws IOException {
        final ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor)o;
        final a a = this.a;
        return a.a((b)new b$b(parcelFileDescriptor, a.d, a.c), n, n2, g, (a$b)com.bumptech.glide.load.resource.bitmap.a.l);
    }
    
    @Override
    public final boolean b(final Object o, final g g) throws IOException {
        final ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor)o;
        this.a.getClass();
        return true;
    }
}
