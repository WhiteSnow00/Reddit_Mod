// 
// Decompiled by Procyon v0.6.0
// 

package com.bumptech.glide.load;

import java.io.IOException;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.util.List;
import java.io.InputStream;
import r8.b;

public final class d
{
    public static int a(final b b, final InputStream inputStream, final List list) throws IOException {
        final int n = -1;
        if (inputStream == null) {
            return -1;
        }
        InputStream inputStream2 = inputStream;
        if (!inputStream.markSupported()) {
            inputStream2 = new RecyclableBufferedInputStream(inputStream, b);
        }
        inputStream2.mark(5242880);
        final o8.b b2 = new o8.b(inputStream2, b);
        final int size = list.size();
        int n2 = 0;
        int a;
        while (true) {
            a = n;
            if (n2 >= size) {
                break;
            }
            a = b2.a(list.get(n2));
            if (a != -1) {
                break;
            }
            ++n2;
        }
        return a;
    }
    
    public static ImageHeaderParser.ImageType b(final b b, final InputStream inputStream, final List list) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        InputStream inputStream2 = inputStream;
        if (!inputStream.markSupported()) {
            inputStream2 = new RecyclableBufferedInputStream(inputStream, b);
        }
        inputStream2.mark(5242880);
        return c(list, (a)new com.bumptech.glide.load.a(inputStream2));
    }
    
    public static ImageHeaderParser.ImageType c(final List<ImageHeaderParser> list, final a a) throws IOException {
        for (int size = list.size(), i = 0; i < size; ++i) {
            final ImageHeaderParser.ImageType a2 = a.a(list.get(i));
            if (a2 != ImageHeaderParser.ImageType.UNKNOWN) {
                return a2;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
    
    public interface a
    {
        ImageHeaderParser.ImageType a(final ImageHeaderParser p0) throws IOException;
    }
}
