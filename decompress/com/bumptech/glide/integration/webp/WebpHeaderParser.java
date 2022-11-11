// 
// Decompiled by Procyon v0.6.0
// 

package com.bumptech.glide.integration.webp;

import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import r8.b;
import java.io.InputStream;
import java.io.IOException;

public final class WebpHeaderParser
{
    public static WebpImageType a(final c c) throws IOException {
        if (((c.a() << 16 & 0xFFFF0000) | (c.a() & 0xFFFF)) != 0x52494646) {
            return WebpImageType.NONE_WEBP;
        }
        c.b();
        if (((c.a() << 16 & 0xFFFF0000) | (c.a() & 0xFFFF)) != 0x57454250) {
            return WebpImageType.NONE_WEBP;
        }
        final int n = (c.a() << 16 & 0xFFFF0000) | (c.a() & 0xFFFF);
        if (n == 1448097824) {
            return WebpImageType.WEBP_SIMPLE;
        }
        if (n == 1448097868) {
            c.b();
            WebpImageType webpImageType;
            if ((c.c() & 0x8) != 0x0) {
                webpImageType = WebpImageType.WEBP_LOSSLESS_WITH_ALPHA;
            }
            else {
                webpImageType = WebpImageType.WEBP_LOSSLESS;
            }
            return webpImageType;
        }
        if (n != 1448097880) {
            return WebpImageType.NONE_WEBP;
        }
        c.b();
        final int c2 = c.c();
        if ((c2 & 0x2) != 0x0) {
            return WebpImageType.WEBP_EXTENDED_ANIMATED;
        }
        if ((c2 & 0x10) != 0x0) {
            return WebpImageType.WEBP_EXTENDED_WITH_ALPHA;
        }
        return WebpImageType.WEBP_EXTENDED;
    }
    
    public static WebpImageType b(final InputStream inputStream, final b b) throws IOException {
        if (inputStream == null) {
            return WebpImageType.NONE_WEBP;
        }
        InputStream inputStream2 = inputStream;
        if (!inputStream.markSupported()) {
            inputStream2 = new RecyclableBufferedInputStream(inputStream, b);
        }
        inputStream2.mark(21);
        try {
            return a((c)new d(inputStream2));
        }
        finally {
            inputStream2.reset();
        }
    }
    
    public enum WebpImageType
    {
        NONE_WEBP(false, false), 
        WEBP_EXTENDED(false, false), 
        WEBP_EXTENDED_ANIMATED(false, true), 
        WEBP_EXTENDED_WITH_ALPHA(true, false), 
        WEBP_LOSSLESS(false, false), 
        WEBP_LOSSLESS_WITH_ALPHA(true, false), 
        WEBP_SIMPLE(false, false);
        
        private final boolean hasAlpha;
        private final boolean hasAnimation;
        
        private WebpImageType(final boolean hasAlpha, final boolean hasAnimation) {
            this.hasAlpha = hasAlpha;
            this.hasAnimation = hasAnimation;
        }
        
        public boolean hasAlpha() {
            return this.hasAlpha;
        }
        
        public boolean hasAnimation() {
            return this.hasAnimation;
        }
    }
    
    public interface c
    {
        int a() throws IOException;
        
        long b() throws IOException;
        
        int c() throws IOException;
    }
    
    public static final class d implements c
    {
        public final InputStream a;
        
        public d(final InputStream a) {
            this.a = a;
        }
        
        @Override
        public final int a() throws IOException {
            return (this.a.read() << 8 & 0xFF00) | (this.a.read() & 0xFF);
        }
        
        @Override
        public final long b() throws IOException {
            long n;
            long skip;
            for (n = 4L; n > 0L; n -= skip) {
                skip = this.a.skip(n);
                if (skip <= 0L) {
                    if (this.a.read() == -1) {
                        break;
                    }
                    skip = 1L;
                }
            }
            return 4L - n;
        }
        
        @Override
        public final int c() throws IOException {
            return this.a.read();
        }
    }
}
