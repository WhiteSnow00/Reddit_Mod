// 
// Decompiled by Procyon v0.6.0
// 

package com.bumptech.glide.load.resource.bitmap;

import android.os.ParcelFileDescriptor;
import android.media.MediaDataSource;
import android.content.res.AssetFileDescriptor;
import java.io.IOException;
import al0.g7;
import q8.l;
import o8.g;
import android.util.Log;
import x8.x;
import android.os.Build$VERSION;
import android.media.MediaMetadataRetriever;
import java.security.MessageDigest;
import java.nio.ByteBuffer;
import r8.d;
import o8.f;
import android.graphics.Bitmap;
import o8.h;

public final class VideoDecoder<T> implements h<T, Bitmap>
{
    public static final f<Long> d;
    public static final f<Integer> e;
    public static final e f;
    public final VideoDecoder$f<T> a;
    public final r8.d b;
    public final e c;
    
    static {
        d = new f<Long>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, (f.b<Long>)new f.b<Long>() {
            public final ByteBuffer a = ByteBuffer.allocate(8);
            
            @Override
            public final void a(final byte[] array, final Object o, final MessageDigest messageDigest) {
                final Long n = (Long)o;
                messageDigest.update(array);
                synchronized (this.a) {
                    this.a.position(0);
                    messageDigest.update(this.a.putLong(n).array());
                }
            }
        });
        e = new f<Integer>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, (f.b<Integer>)new f.b<Integer>() {
            public final ByteBuffer a = ByteBuffer.allocate(4);
            
            @Override
            public final void a(final byte[] array, final Object o, final MessageDigest messageDigest) {
                final Integer n = (Integer)o;
                if (n == null) {
                    return;
                }
                messageDigest.update(array);
                synchronized (this.a) {
                    this.a.position(0);
                    messageDigest.update(this.a.putInt(n).array());
                }
            }
        });
        f = new e();
    }
    
    public VideoDecoder(final r8.d b, final VideoDecoder$f<T> a) {
        final e f = VideoDecoder.f;
        this.b = b;
        this.a = a;
        this.c = f;
    }
    
    public static Bitmap c(final MediaMetadataRetriever mediaMetadataRetriever, final long n, final int n2, final int n3, final int n4, final DownsampleStrategy downsampleStrategy) {
        final Throwable t;
        Label_0162: {
            if (Build$VERSION.SDK_INT >= 27 && n3 != Integer.MIN_VALUE && n4 != Integer.MIN_VALUE && downsampleStrategy != DownsampleStrategy.f) {
                try {
                    final int int1 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                    final int int2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                    final int int3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
                    int n5 = 0;
                    int n6 = 0;
                    Label_0094: {
                        if (int3 != 90) {
                            n5 = int1;
                            n6 = int2;
                            if (int3 != 270) {
                                break Label_0094;
                            }
                        }
                        n6 = int1;
                        n5 = int2;
                    }
                    final float b = downsampleStrategy.b(n5, n6, n3, n4);
                    x.a(mediaMetadataRetriever, n, n2, Math.round(n5 * b), Math.round(b * n6));
                    break Label_0162;
                }
                finally {
                    if (Log.isLoggable("VideoDecoder", 3)) {
                        Log.d("VideoDecoder", "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame", t);
                    }
                }
            }
            t = null;
        }
        Object frameAtTime = t;
        if (t == null) {
            frameAtTime = mediaMetadataRetriever.getFrameAtTime(n, n2);
        }
        if (frameAtTime != null) {
            return (Bitmap)frameAtTime;
        }
        throw new VideoDecoderException();
    }
    
    @Override
    public final boolean a(final T t, final o8.g g) {
        return true;
    }
    
    @Override
    public final l<Bitmap> b(final T t, final int n, final int n2, final o8.g g) throws IOException {
        final long longValue = g.a(VideoDecoder.d);
        if (longValue < 0L && longValue != -1L) {
            throw new IllegalArgumentException(g7.g("Requested frame must be non-negative, or DEFAULT_FRAME, given: ", longValue));
        }
        Integer value;
        if ((value = g.a(VideoDecoder.e)) == null) {
            value = 2;
        }
        DownsampleStrategy g2;
        if ((g2 = g.a(DownsampleStrategy.h)) == null) {
            g2 = DownsampleStrategy.g;
        }
        this.c.getClass();
        final MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            this.a.a(mediaMetadataRetriever, (Object)t);
            final Bitmap c = c(mediaMetadataRetriever, longValue, value, n, n2, g2);
            mediaMetadataRetriever.release();
            return (l<Bitmap>)x8.d.b(this.b, c);
        }
        finally {
            mediaMetadataRetriever.release();
        }
    }
    
    public static final class VideoDecoderException extends RuntimeException
    {
        private static final long serialVersionUID = -2556382523004027815L;
        
        public VideoDecoderException() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }
    
    public static final class c implements VideoDecoder$f<AssetFileDescriptor>
    {
        public final void a(final MediaMetadataRetriever mediaMetadataRetriever, final Object o) {
            final AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor)o;
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }
    }
    
    public static final class d implements VideoDecoder$f<ByteBuffer>
    {
        public final void a(final MediaMetadataRetriever mediaMetadataRetriever, final Object o) {
            mediaMetadataRetriever.setDataSource((MediaDataSource)new com.bumptech.glide.load.resource.bitmap.d((ByteBuffer)o));
        }
    }
    
    public static final class e
    {
    }
    
    public static final class g implements VideoDecoder$f<ParcelFileDescriptor>
    {
        public final void a(final MediaMetadataRetriever mediaMetadataRetriever, final Object o) {
            mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor)o).getFileDescriptor());
        }
    }
}
