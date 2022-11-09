// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.util.Base64;
import android.text.TextUtils;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Bitmap$Config;
import java.io.OutputStream;
import android.graphics.Rect;
import java.io.ByteArrayOutputStream;
import android.graphics.YuvImage;
import android.graphics.BitmapFactory$Options;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import android.os.Handler$Callback;

public final class 0V4 implements Handler$Callback
{
    public final /* synthetic */ 0V6 LIZ;
    
    static {
        Covode.recordClassIndex(4767);
    }
    
    public 0V4(final 0V6 liz) {
        this.LIZ = liz;
    }
    
    public final boolean handleMessage(final Message message) {
        MethodCollector.i(335);
        Label_0402: {
            if (message.what != 0V6.LJFF) {
                break Label_0402;
            }
            final 0VN 0vn = (0VN)message.obj;
            final 0V6 liz = this.LIZ;
            while (true) {
                if (!liz.LIZ) {
                    break Label_0422;
                }
                try {
                    final byte[] liz2 = 0vn.LIZ;
                    while (true) {
                        if (liz2 != null) {
                            final int lizj = 0vn.LIZJ;
                            final int liziz = 0vn.LIZIZ;
                            int liz5 = 0;
                            int n = 0;
                            int n2 = 0;
                            int n3 = 0;
                            Label_0174: {
                                if (liz.LJ != null) {
                                    final int liz3 = liz.LJ.LIZ(1, lizj);
                                    final int liz4 = liz.LJ.LIZ(0, liziz);
                                    liz5 = liz.LJ.LIZ(2, liziz);
                                    final int liz6 = liz.LJ.LIZ(3, lizj);
                                    if (liz5 <= lizj) {
                                        n = liz6;
                                        n2 = liz4;
                                        n3 = liz3;
                                        if (liz6 <= liziz) {
                                            break Label_0174;
                                        }
                                    }
                                    liz5 = lizj;
                                    n = liziz;
                                    n2 = liz4;
                                    n3 = liz3;
                                }
                                else {
                                    liz5 = lizj;
                                    n = liziz;
                                    n3 = 0;
                                    n2 = 0;
                                }
                            }
                            if (liziz * lizj <= liz2.length) {
                                final int lizj2 = 0vn.LIZJ;
                                final int liziz2 = 0vn.LIZIZ;
                                new BitmapFactory$Options().inJustDecodeBounds = true;
                                final YuvImage yuvImage = new YuvImage(liz2, 17, lizj2, liziz2, (int[])null);
                                final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                yuvImage.compressToJpeg(new Rect(0, 0, lizj2, liziz2), 100, (OutputStream)byteArrayOutputStream);
                                final byte[] byteArray = byteArrayOutputStream.toByteArray();
                                final BitmapFactory$Options bitmapFactory$Options = new BitmapFactory$Options();
                                bitmapFactory$Options.inPreferredConfig = Bitmap$Config.ARGB_8888;
                                Bitmap bitmap2;
                                final Bitmap bitmap = bitmap2 = Bitmap.createBitmap(0UP.LIZ(BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, bitmapFactory$Options), 90.0f), n2, n3, liz5, n);
                                if (bitmap.getByteCount() > 4194304) {
                                    bitmap2 = 0UP.LIZ(bitmap, 4194304);
                                }
                                bitmap2.getByteCount();
                                final 1E7 liz7 = 1EK.LIZ.LJIIJ().LIZ();
                                if (TextUtils.isEmpty((CharSequence)liz7.LJFF)) {
                                    liz.LIZ(0, 101, "nonce is empty", null);
                                    break Label_0443;
                                }
                                liz7.LJI = Base64.encodeToString(0UP.LIZ(bitmap2), 0);
                                bitmap2.getByteCount();
                                6vJ.LIZ((Runnable)new 0V5(liz, liz7, bitmap2));
                            }
                            liz.LIZLLL.sendMessageDelayed(liz.LIZLLL.obtainMessage(0V6.LJI), 1000L);
                        }
                        MethodCollector.o(335);
                        return true;
                        iftrue(Label_0443:)(message.what != 0V6.LJI);
                        this.LIZ.LIZIZ();
                        continue;
                    }
                }
                finally {
                    continue;
                }
                break;
            }
        }
    }
}
