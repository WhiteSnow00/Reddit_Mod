// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.utils.jcodec;

import org.jcodec.api.SequenceEncoder;
import android.graphics.Bitmap;
import org.jcodec.common.io.FileChannelWrapper;
import android.content.ContentResolver;
import java.io.Closeable;
import com.reddit.video.creation.video.utils.BitmapUtilsKt;
import org.jcodec.common.io.SeekableByteChannel;
import org.jcodec.api.android.AndroidSequenceEncoder;
import org.jcodec.common.model.Rational;
import j8.d;
import com.bumptech.glide.c;
import java.nio.ByteBuffer;
import com.reddit.video.creation.video.utils.BitmapUtils;
import android.graphics.Rect;
import java.io.InputStream;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory$Options;
import java.io.BufferedInputStream;
import org.jcodec.common.io.NIOUtils;
import su2.a;
import java.io.File;
import com.reddit.video.creation.video.utils.VideoCacheHelper;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import android.content.Context;
import cj2.k;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.text.b;
import cj2.j;
import sg2.e;
import kotlin.Metadata;

@Metadata(d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006J\u0016\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011J\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0015" }, d2 = { "Lcom/reddit/video/creation/utils/jcodec/EncodingUtils;", "", "()V", "CACHE_SUFFIX_LENGTH", "", "GIF_CACHE_SUFFIX", "", "IMAGE_CACHE_SUFFIX", "IMAGE_VIDEO_LENGTH", "", "IMAGE_VIDEO_TRIM", "MAX_FRAME_SIZE", "decodeCacheFileToMediaUri", "path", "encodeMediaToVideo", "mediaPath", "context", "Landroid/content/Context;", "encodeMediaUriToCacheFile", "isGif", "", "creation_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class EncodingUtils
{
    public static final int $stable = 0;
    private static final int CACHE_SUFFIX_LENGTH = 8;
    public static final String GIF_CACHE_SUFFIX = "-gif.mp4";
    public static final String IMAGE_CACHE_SUFFIX = "-img.mp4";
    public static final long IMAGE_VIDEO_LENGTH = 20000L;
    public static final long IMAGE_VIDEO_TRIM = 2000L;
    public static final EncodingUtils INSTANCE;
    public static final int MAX_FRAME_SIZE = 1500;
    
    static {
        INSTANCE = new EncodingUtils();
    }
    
    private EncodingUtils() {
    }
    
    public final String decodeCacheFileToMediaUri(final String s) {
        e.f((Object)s, "path");
        if (!j.D0(s, "-img.mp4", true)) {
            final String k0 = s;
            if (!j.D0(s, "-gif.mp4", true)) {
                return k0;
            }
        }
        return j.K0(j.K0(k.E1(8, (String)CollectionsKt___CollectionsKt.K3(b.n1((CharSequence)s, new String[] { "/" }))), "-", "/", false), "_", ":", false);
    }
    
    public final String encodeMediaToVideo(String s, final Context context) {
        e.f((Object)s, "mediaPath");
        e.f((Object)context, "context");
        final ContentResolver contentResolver = context.getContentResolver();
        final MimeTypeMap singleton = MimeTypeMap.getSingleton();
        final Uri parse = Uri.parse(s);
        e.e((Object)parse, "parse(this)");
        final String extensionFromMimeType = singleton.getExtensionFromMimeType(contentResolver.getType(parse));
        System.out.println((Object)extensionFromMimeType);
        String s2 = s;
        if (extensionFromMimeType != null) {
            final int hashCode = extensionFromMimeType.hashCode();
            int i = 0;
            final int n = 0;
            switch (hashCode) {
                default: {
                    s2 = s;
                    return s2;
                }
                case 3268712: {
                    s2 = s;
                    if (extensionFromMimeType.equals("jpeg")) {
                        break;
                    }
                    return s2;
                }
                case 111145: {
                    if (!extensionFromMimeType.equals("png")) {
                        s2 = s;
                        return s2;
                    }
                    break;
                }
                case 105441: {
                    if (!extensionFromMimeType.equals("jpg")) {
                        s2 = s;
                        return s2;
                    }
                    break;
                }
                case 102340: {
                    if (!extensionFromMimeType.equals("gif")) {
                        s2 = s;
                        return s2;
                    }
                    final ContentResolver contentResolver2 = context.getContentResolver();
                    final File file = new File(VideoCacheHelper.getImgVideosCacheDirectory(context).getAbsolutePath(), this.encodeMediaUriToCacheFile(s, true));
                    if (file.exists()) {
                        a.a.a("encodeMediaToVideo - cached file found for gif", new Object[0]);
                        s = file.getAbsolutePath();
                        e.e((Object)s, "outputFile.absolutePath");
                        return s;
                    }
                    a.a.a("encodeMediaToVideo - creating video from gif", new Object[0]);
                    final FileChannelWrapper writableFileChannel = NIOUtils.writableFileChannel(file.getPath());
                    final Uri parse2 = Uri.parse(s);
                    e.e((Object)parse2, "parse(this)");
                    final InputStream openInputStream = contentResolver2.openInputStream(parse2);
                    e.c((Object)openInputStream);
                    final BufferedInputStream bufferedInputStream = new BufferedInputStream(openInputStream);
                    bufferedInputStream.mark(bufferedInputStream.available());
                    final BitmapFactory$Options bitmapFactory$Options = new BitmapFactory$Options();
                    bitmapFactory$Options.inJustDecodeBounds = true;
                    BitmapFactory.decodeStream((InputStream)bufferedInputStream, (Rect)null, bitmapFactory$Options);
                    bufferedInputStream.reset();
                    final int calculateInSampleSize = BitmapUtils.INSTANCE.calculateInSampleSize(bitmapFactory$Options, 1500);
                    final ByteBuffer wrap = ByteBuffer.wrap(lw0.b.T1((InputStream)bufferedInputStream));
                    final c b = c.b(context);
                    e.e((Object)b, "get(context)");
                    final b9.b b2 = new b9.b(b.j, b.f);
                    final d d = new d();
                    d.g(wrap);
                    final j8.c b3 = d.b();
                    e.e((Object)b3, "GifHeaderParser().setDat\u2026byteBuffer).parseHeader()");
                    final j8.e e = new j8.e(b2, b3, wrap, calculateInSampleSize);
                    e.a();
                    final AndroidSequenceEncoder androidSequenceEncoder = new AndroidSequenceEncoder((SeekableByteChannel)writableFileChannel, Rational.R(1000, 1).divideByInt(e.e()));
                    while (i < e.l.c) {
                        final Bitmap nextFrame = e.getNextFrame();
                        sg2.e.c((Object)nextFrame);
                        androidSequenceEncoder.encodeImage(BitmapUtilsKt.trimToEvenDimensions(nextFrame));
                        e.a();
                        ++i;
                    }
                    ((SequenceEncoder)androidSequenceEncoder).finish();
                    NIOUtils.closeQuietly((Closeable)writableFileChannel);
                    s2 = file.getPath();
                    sg2.e.e((Object)s2, "{\n        val cr = conte\u2026  outputFile.path\n      }");
                    return s2;
                }
            }
            final File file2 = new File(VideoCacheHelper.getImgVideosCacheDirectory(context).getAbsolutePath(), this.encodeMediaUriToCacheFile(s, false));
            if (file2.exists()) {
                a.a.a("encodeMediaToVideo - cached file found for image", new Object[0]);
                s = file2.getAbsolutePath();
                e.e((Object)s, "outputFile.absolutePath");
                return s;
            }
            a.a.a("encodeMediaToVideo - creating video from image", new Object[0]);
            final BitmapUtils instance = BitmapUtils.INSTANCE;
            final Uri parse3 = Uri.parse(s);
            e.e((Object)parse3, "parse(this)");
            final Bitmap trimToEvenDimensions = BitmapUtilsKt.trimToEvenDimensions(instance.loadBitmap(parse3, context, 1500));
            final FileChannelWrapper writableFileChannel2 = NIOUtils.writableFileChannel(file2.getPath());
            final AndroidSequenceEncoder androidSequenceEncoder2 = new AndroidSequenceEncoder((SeekableByteChannel)writableFileChannel2, Rational.ONE);
            for (int j = n; j < 20; ++j) {
                androidSequenceEncoder2.encodeImage(trimToEvenDimensions);
            }
            ((SequenceEncoder)androidSequenceEncoder2).finish();
            NIOUtils.closeQuietly((Closeable)writableFileChannel2);
            s2 = file2.getPath();
            e.e((Object)s2, "{\n        val outputDir \u2026  outputFile.path\n      }");
        }
        return s2;
    }
    
    public final String encodeMediaUriToCacheFile(String s, final boolean b) {
        e.f((Object)s, "path");
        s = j.K0(j.K0(s, "/", "-", false), ":", "_", false);
        if (b) {
            s = al0.b.h(s, "-gif.mp4");
        }
        else {
            s = al0.b.h(s, "-img.mp4");
        }
        return s;
    }
}
