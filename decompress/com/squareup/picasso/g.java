// 
// Decompiled by Procyon v0.6.0
// 

package com.squareup.picasso;

import java.io.IOException;
import java.io.InputStream;
import android.graphics.Bitmap;
import android.media.ExifInterface;
import android.content.Context;

public final class g extends e
{
    public g(final Context context) {
        super(context);
    }
    
    public final boolean b(final l l) {
        return "file".equals(l.d.getScheme());
    }
    
    public final n$a e(final l l) throws IOException {
        final InputStream g = this.g(l);
        final Picasso$LoadedFrom disk = Picasso$LoadedFrom.DISK;
        final int attributeInt = new ExifInterface(l.d.getPath()).getAttributeInt("Orientation", 1);
        int n;
        if (attributeInt != 3) {
            if (attributeInt != 6) {
                if (attributeInt != 8) {
                    n = 0;
                }
                else {
                    n = 270;
                }
            }
            else {
                n = 90;
            }
        }
        else {
            n = 180;
        }
        return new n$a((Bitmap)null, g, disk, n);
    }
}
