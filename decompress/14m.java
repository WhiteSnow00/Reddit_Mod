// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.io.InputStream;
import android.os.ParcelFileDescriptor;
import android.content.ContentResolver;
import android.os.CancellationSignal;
import android.graphics.fonts.Font;
import java.io.IOException;
import android.graphics.fonts.FontStyle;
import android.graphics.Typeface$CustomFallbackBuilder;
import android.graphics.fonts.FontFamily$Builder;
import android.graphics.fonts.Font$Builder;
import android.graphics.Typeface;
import android.content.res.Resources;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 14m extends 08c
{
    static {
        Covode.recordClassIndex(905);
    }
    
    @Override
    public final 075.b LIZ(final 075.b[] array, final int n) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
    
    @Override
    public final Typeface LIZ(Context context, final 06l.b b, final Resources resources, final int n) {
        final 06l.c[] liz = b.LIZ;
        final int length = liz.length;
        final int n2 = 0;
        context = null;
        int n3 = 0;
    Label_0129_Outer:
        while (true) {
            int slant = 1;
            Label_0135: {
                if (n3 >= length) {
                    break Label_0135;
                }
                final 06l.c c = liz[n3];
            Label_0153_Outer:
                while (true) {
                    try {
                        final Font$Builder setWeight = new Font$Builder(resources, c.LJFF).setWeight(c.LIZIZ);
                        if (!c.LIZJ) {
                            slant = 0;
                        }
                        final Font build = setWeight.setSlant(slant).setTtcIndex(c.LJ).setFontVariationSettings(c.LIZLLL).build();
                        if (context == null) {
                            context = (Context)new FontFamily$Builder(build);
                        }
                        else {
                            ((FontFamily$Builder)context).addFont(build);
                        }
                        ++n3;
                        continue Label_0129_Outer;
                        Label_0141: {
                            iftrue(Label_0198:)((n & 0x1) == 0x0);
                        }
                        while (true) {
                            Block_6: {
                                break Block_6;
                                while (true) {
                                    int n4 = 1;
                                    return new Typeface$CustomFallbackBuilder(((FontFamily$Builder)context).build()).setStyle(new FontStyle(n3, n4)).build();
                                    n4 = n2;
                                    iftrue(Label_0167:)((n & 0x2) == 0x0);
                                    continue Label_0153_Outer;
                                }
                                Label_0198:
                                n3 = 400;
                                continue;
                            }
                            n3 = 700;
                            continue;
                        }
                        iftrue(Label_0141:)(context != null);
                        return null;
                        int n4 = 0;
                        Label_0167:
                        return new Typeface$CustomFallbackBuilder(((FontFamily$Builder)context).build()).setStyle(new FontStyle(n3, n4)).build();
                    }
                    catch (final IOException ex) {
                        continue;
                    }
                    break;
                }
            }
        }
    }
    
    @Override
    public final Typeface LIZ(final Context context, final Resources resources, final int n, final String s, final int n2) {
        try {
            final Font build = new Font$Builder(resources, n).build();
            return new Typeface$CustomFallbackBuilder(new FontFamily$Builder(build).build()).setStyle(build.getStyle()).build();
        }
        catch (final IOException ex) {
            return null;
        }
    }
    
    @Override
    public final Typeface LIZ(Context context, CancellationSignal setWeight, final 075.b[] array, final int n) {
        final ContentResolver contentResolver = context.getContentResolver();
        final int length = array.length;
        final int n2 = 0;
        context = null;
        int n3 = 0;
    Label_0177_Outer:
        while (true) {
            int slant = 1;
            Label_0183: {
                if (n3 >= length) {
                    break Label_0183;
                }
                final 075.b b = array[n3];
                setWeight = (CancellationSignal)context;
            Block_7_Outer:
                while (true) {
                    try {
                        final ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(b.LIZ, "r", (CancellationSignal)null);
                        if (openFileDescriptor != null) {
                            try {
                                setWeight = (CancellationSignal)new Font$Builder(openFileDescriptor);
                                setWeight = (CancellationSignal)((Font$Builder)setWeight).setWeight(b.LIZJ);
                                if (!b.LIZLLL) {
                                    slant = 0;
                                }
                                final Font build = ((Font$Builder)setWeight).setSlant(slant).setTtcIndex(b.LIZIZ).build();
                                if (context == null) {
                                    setWeight = (CancellationSignal)(context = (Context)new FontFamily$Builder(build));
                                }
                                else {
                                    ((FontFamily$Builder)context).addFont(build);
                                }
                                setWeight = (CancellationSignal)context;
                                openFileDescriptor.close();
                            }
                            finally {
                                try {
                                    openFileDescriptor.close();
                                }
                                finally {
                                    setWeight = (CancellationSignal)context;
                                    final Throwable t;
                                    final Throwable t2;
                                    t.addSuppressed(t2);
                                }
                                setWeight = (CancellationSignal)context;
                            }
                        }
                        ++n3;
                        continue Label_0177_Outer;
                        iftrue(Label_0189:)(context != null);
                        return null;
                        while (true) {
                            while (true) {
                                int n4 = 0;
                                setWeight = (CancellationSignal)new FontStyle(n3, n4);
                                return new Typeface$CustomFallbackBuilder(((FontFamily$Builder)context).build()).setStyle((FontStyle)setWeight).build();
                                n3 = 700;
                                Label_0201: {
                                    break Label_0201;
                                    Label_0246: {
                                        n3 = 400;
                                    }
                                }
                                n4 = n2;
                                iftrue(Label_0215:)((n & 0x2) == 0x0);
                                n4 = 1;
                                continue Block_7_Outer;
                            }
                            Label_0189: {
                                iftrue(Label_0246:)((n & 0x1) == 0x0);
                            }
                            continue;
                        }
                    }
                    catch (final IOException ex) {
                        context = (Context)setWeight;
                        continue;
                    }
                    break;
                }
            }
        }
    }
    
    @Override
    public final Typeface LIZ(final Context context, final InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
