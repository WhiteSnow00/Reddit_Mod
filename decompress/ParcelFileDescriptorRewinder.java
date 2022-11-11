// 
// Decompiled by Procyon v0.6.0
// 

package com.bumptech.glide.load.data;

import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.IOException;
import android.os.ParcelFileDescriptor;

public final class ParcelFileDescriptorRewinder implements e<ParcelFileDescriptor>
{
    public final InternalRewinder a;
    
    public ParcelFileDescriptorRewinder(final ParcelFileDescriptor parcelFileDescriptor) {
        this.a = new InternalRewinder(parcelFileDescriptor);
    }
    
    @Override
    public final void b() {
    }
    
    public final ParcelFileDescriptor c() throws IOException {
        return this.a.rewind();
    }
    
    public static final class InternalRewinder
    {
        public final ParcelFileDescriptor a;
        
        public InternalRewinder(final ParcelFileDescriptor a) {
            this.a = a;
        }
        
        public ParcelFileDescriptor rewind() throws IOException {
            try {
                Os.lseek(this.a.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
                return this.a;
            }
            catch (final ErrnoException ex) {
                throw new IOException((Throwable)ex);
            }
        }
    }
    
    public static final class a implements e.a<ParcelFileDescriptor>
    {
        @Override
        public final Class<ParcelFileDescriptor> a() {
            return ParcelFileDescriptor.class;
        }
        
        @Override
        public final e b(final Object o) {
            return new ParcelFileDescriptorRewinder((ParcelFileDescriptor)o);
        }
    }
}
