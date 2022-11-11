// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Iterator;
import java.io.InputStream;
import android.content.res.AssetManager;
import java.io.IOException;
import android.graphics.Rect;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.graphics.BitmapFactory$Options;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.graphics.Bitmap;
import java.util.HashMap;
import android.view.View;
import android.text.TextUtils;
import android.graphics.drawable.Drawable$Callback;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import android.content.Context;

public final class 0Jc
{
    public static final Object LIZLLL;
    public final Context LIZ;
    public 0Jd LIZIZ;
    public final Map<String, 0LL> LIZJ;
    public String LJ;
    public boolean LJFF;
    
    static {
        Covode.recordClassIndex(2279);
        LIZLLL = new Object();
    }
    
    public 0Jc(final Drawable$Callback drawable$Callback, String lj, final 0Jd liziz, final Map<String, 0LL> lizj, final boolean ljff) {
        this.LJ = lj;
        this.LJFF = ljff;
        if (!TextUtils.isEmpty((CharSequence)lj)) {
            lj = this.LJ;
            if (lj.charAt(lj.length() - 1) != '/') {
                final StringBuilder sb = new StringBuilder();
                sb.append(this.LJ);
                sb.append('/');
                this.LJ = sb.toString();
            }
        }
        if (!(drawable$Callback instanceof View)) {
            this.LIZJ = new HashMap<String, 0LL>();
            this.LIZ = null;
            return;
        }
        this.LIZ = ((View)drawable$Callback).getContext();
        this.LIZJ = lizj;
        this.LIZIZ = liziz;
    }
    
    public final Bitmap LIZ(final String s) {
        MethodCollector.i(8399);
        final 0LL 0ll = this.LIZJ.get(s);
        if (0ll == null) {
            MethodCollector.o(8399);
            return null;
        }
        final Bitmap lji = 0ll.LJI;
        if (lji != null) {
            MethodCollector.o(8399);
            return lji;
        }
        0ll.LJII = false;
        0ll.LJIIIIZZ = false;
        if (0KM.a.LIZ && 0KM.a.LJFF && 0KM.e.LIZJ) {
            final int liz = 0ll.LIZ;
            final int liziz = 0ll.LIZIZ;
            if (liz >= 32 && liziz >= 32) {
                0ll.LJIIIIZZ = true;
            }
        }
        final 0Jd liziz2 = this.LIZIZ;
        if (liziz2 != null) {
            final Bitmap liz2 = liziz2.LIZ(0ll);
            if (liz2 != null) {
                this.LIZ(s, liz2);
            }
            MethodCollector.o(8399);
            return liz2;
        }
        final String lizlll = 0ll.LIZLLL;
        final BitmapFactory$Options bitmapFactory$Options = new BitmapFactory$Options();
        bitmapFactory$Options.inScaled = true;
        bitmapFactory$Options.inDensity = 160;
        if (lizlll.startsWith("data:") && lizlll.indexOf("base64,") > 0) {
            try {
                final byte[] decode = Base64.decode(lizlll.substring(lizlll.indexOf(44) + 1), 0);
                final Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length, bitmapFactory$Options);
                this.LIZ(s, decodeByteArray);
                MethodCollector.o(8399);
                return decodeByteArray;
            }
            catch (final IllegalArgumentException ex) {
                MethodCollector.o(8399);
                return null;
            }
        }
        try {
            if (TextUtils.isEmpty((CharSequence)this.LJ)) {
                final 0LQ liz3 = 0LQ.LIZJ.LIZ();
                final IllegalStateException ex2 = new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                final StringBuilder sb = new StringBuilder("fileName=");
                sb.append(lizlll);
                sb.append(" id=");
                sb.append(s);
                liz3.LIZ(ex2, sb.toString());
                MethodCollector.o(8399);
                return null;
            }
            final Context liz4 = this.LIZ;
            if (liz4 == null) {
                final 0LQ liz5 = 0LQ.LIZJ.LIZ();
                final IllegalStateException ex3 = new IllegalStateException("context is null!");
                final StringBuilder sb2 = new StringBuilder("fileName=");
                sb2.append(lizlll);
                sb2.append(" id=");
                sb2.append(s);
                liz5.LIZ(ex3, sb2.toString());
                MethodCollector.o(8399);
                return null;
            }
            final AssetManager assets = liz4.getAssets();
            final StringBuilder sb3 = new StringBuilder();
            sb3.append(this.LJ);
            sb3.append(lizlll);
            final InputStream open = assets.open(sb3.toString());
            Bitmap bitmap = null;
            Label_0551: {
                Label_0526: {
                    if (0KM.a.LIZ) {
                        if (0ll.LJIIIIZZ) {
                            bitmapFactory$Options.inSampleSize = 2;
                        }
                        Bitmap decodeStream = null;
                        Label_0537: {
                            try {
                                decodeStream = BitmapFactory.decodeStream(open, (Rect)null, bitmapFactory$Options);
                                break Label_0537;
                            }
                            catch (final OutOfMemoryError outOfMemoryError) {
                                if (!0KM.LIZ) {
                                    MethodCollector.o(8399);
                                    return null;
                                }
                                MethodCollector.o(8399);
                                throw outOfMemoryError;
                            }
                            catch (final IllegalArgumentException ex4) {
                                if (!0KM.LIZ) {
                                    MethodCollector.o(8399);
                                    return null;
                                }
                                MethodCollector.o(8399);
                                throw ex4;
                            }
                            break Label_0526;
                        }
                        bitmap = 0L9.LIZ(decodeStream, 0ll.LIZ, 0ll.LIZIZ, 0ll);
                        break Label_0551;
                    }
                }
                bitmap = BitmapFactory.decodeStream(open, (Rect)null, bitmapFactory$Options);
            }
            this.LIZ(s, bitmap);
            MethodCollector.o(8399);
            return bitmap;
        }
        catch (final IOException ex5) {
            MethodCollector.o(8399);
            return null;
        }
    }
    
    public final Bitmap LIZ(final String s, final Bitmap lji) {
        MethodCollector.i(1595);
        final Object lizlll = 0Jc.LIZLLL;
        monitorenter(lizlll);
        try {
            return this.LIZJ.get(s).LJI = lji;
        }
        finally {
            monitorexit(lizlll);
            MethodCollector.o(1595);
        }
    }
    
    public final void LIZ() {
        MethodCollector.i(219);
        if (this.LJFF) {
            MethodCollector.o(219);
            return;
        }
        try {
            final Object lizlll = 0Jc.LIZLLL;
            monitorenter(lizlll);
            try {
                final Iterator<Map.Entry<String, 0LL>> iterator = this.LIZJ.entrySet().iterator();
                while (iterator.hasNext()) {
                    final 0LL 0ll = ((Map.Entry<K, 0LL>)iterator.next()).getValue();
                    final Bitmap lji = 0ll.LJI;
                    if (lji != null) {
                        lji.recycle();
                        0ll.LJI = null;
                    }
                }
            }
            finally {
                monitorexit(lizlll);
                MethodCollector.o(219);
            }
        }
        finally {
            MethodCollector.o(219);
        }
    }
    
    public final void LIZIZ() {
        MethodCollector.i(985);
        if (this.LJFF) {
            MethodCollector.o(985);
            return;
        }
        try {
            final Object lizlll = 0Jc.LIZLLL;
            monitorenter(lizlll);
            try {
                final Iterator<Map.Entry<String, 0LL>> iterator = this.LIZJ.entrySet().iterator();
                while (iterator.hasNext()) {
                    final 0LL 0ll = ((Map.Entry<K, 0LL>)iterator.next()).getValue();
                    if (0ll.LJI != null) {
                        0ll.LJI = null;
                    }
                }
            }
            finally {
                monitorexit(lizlll);
                MethodCollector.o(985);
            }
        }
        finally {
            MethodCollector.o(985);
        }
    }
}
