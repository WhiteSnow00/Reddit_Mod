// 
// Decompiled by Procyon v0.6.0
// 

package x8;

import android.util.Size;
import y8.o;
import android.graphics.ColorSpace;
import android.graphics.ColorSpace$Named;
import android.os.Build$VERSION;
import android.util.Log;
import android.graphics.ImageDecoder$DecodeException;
import android.graphics.ImageDecoder$OnPartialImageListener;
import android.graphics.ImageDecoder$Source;
import android.graphics.ImageDecoder$ImageInfo;
import android.graphics.ImageDecoder;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.load.DecodeFormat;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;

public final class a implements ImageDecoder$OnHeaderDecodedListener
{
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ DecodeFormat d;
    public final /* synthetic */ DownsampleStrategy e;
    public final /* synthetic */ PreferredColorSpace f;
    public final /* synthetic */ b g;
    
    public a(final b g, final int a, final int b, final boolean c, final DecodeFormat d, final DownsampleStrategy e, final PreferredColorSpace f) {
        this.g = g;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final void onHeaderDecoded(final ImageDecoder imageDecoder, final ImageDecoder$ImageInfo imageDecoder$ImageInfo, final ImageDecoder$Source imageDecoder$Source) {
        final o a = this.g.a;
        final int a2 = this.a;
        final int b = this.b;
        final boolean c = this.c;
        final boolean b2 = false;
        if (a.a(a2, b, c, false)) {
            imageDecoder.setAllocator(3);
        }
        else {
            imageDecoder.setAllocator(1);
        }
        if (this.d == DecodeFormat.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new ImageDecoder$OnPartialImageListener() {
            public final boolean onPartialImage(final ImageDecoder$DecodeException ex) {
                return false;
            }
        });
        final Size size = imageDecoder$ImageInfo.getSize();
        int n;
        if ((n = this.a) == Integer.MIN_VALUE) {
            n = size.getWidth();
        }
        int n2;
        if ((n2 = this.b) == Integer.MIN_VALUE) {
            n2 = size.getHeight();
        }
        final float b3 = this.e.b(size.getWidth(), size.getHeight(), n, n2);
        final int round = Math.round(size.getWidth() * b3);
        final int round2 = Math.round(size.getHeight() * b3);
        if (Log.isLoggable("ImageDecoder", 2)) {
            final StringBuilder k = a.k("Resizing from [");
            k.append(size.getWidth());
            k.append("x");
            k.append(size.getHeight());
            k.append("] to [");
            k.append(round);
            k.append("x");
            k.append(round2);
            k.append("] scaleFactor: ");
            k.append(b3);
            Log.v("ImageDecoder", k.toString());
        }
        imageDecoder.setTargetSize(round, round2);
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 28) {
            int n3 = b2 ? 1 : 0;
            if (this.f == PreferredColorSpace.DISPLAY_P3) {
                n3 = (b2 ? 1 : 0);
                if (imageDecoder$ImageInfo.getColorSpace() != null) {
                    n3 = (b2 ? 1 : 0);
                    if (imageDecoder$ImageInfo.getColorSpace().isWideGamut()) {
                        n3 = 1;
                    }
                }
            }
            ColorSpace$Named colorSpace$Named;
            if (n3 != 0) {
                colorSpace$Named = ColorSpace$Named.DISPLAY_P3;
            }
            else {
                colorSpace$Named = ColorSpace$Named.SRGB;
            }
            imageDecoder.setTargetColorSpace(ColorSpace.get(colorSpace$Named));
        }
        else if (sdk_INT >= 26) {
            imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace$Named.SRGB));
        }
    }
}
