// 
// Decompiled by Procyon v0.6.0
// 

package com.bumptech.glide.load.data;

import java.io.IOException;
import android.os.ParcelFileDescriptor;

public final class ParcelFileDescriptorRewinder implements e<ParcelFileDescriptor>
{
    public final ParcelFileDescriptorRewinder.ParcelFileDescriptorRewinder$InternalRewinder a;
    
    public ParcelFileDescriptorRewinder(final ParcelFileDescriptor parcelFileDescriptor) {
        this.a = new ParcelFileDescriptorRewinder.ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }
    
    public final /* bridge */ Object a() throws IOException {
        return this.c();
    }
    
    public final void b() {
    }
    
    public final ParcelFileDescriptor c() throws IOException {
        return this.a.rewind();
    }
    
    public static final class a implements e$a<ParcelFileDescriptor>
    {
        public final Class<ParcelFileDescriptor> a() {
            return ParcelFileDescriptor.class;
        }
        
        public final e b(final Object o) {
            return (e)new ParcelFileDescriptorRewinder((ParcelFileDescriptor)o);
        }
    }
}
