// 
// Decompiled by Procyon v0.6.0
// 

package o8;

import java.util.concurrent.ExecutorService;
import eg.c0;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import eg.p1;
import java.nio.ShortBuffer;
import android.net.Uri;
import com.bumptech.glide.load.EncodeStrategy;
import java.util.concurrent.atomic.AtomicReference;
import java.nio.ByteBuffer;
import com.instabug.library.internal.video.InternalAutoScreenRecorderHelper;
import org.slf4j.helpers.NOPLogger;
import java.io.IOException;
import android.util.Log;
import java.io.File;
import android.app.Activity;
import java.nio.charset.Charset;
import android.util.Base64;
import kj2.j;
import kotlin.text.b;
import ah2.f;
import bj2.l0;
import android.view.View;
import java.util.LinkedHashSet;
import android.view.ViewGroup;
import au2.a;
import com.instabug.library.internal.utils.stability.handler.penalty.PenaltyHandler;
import com.instabug.library.internal.video.ScreenRecordingContract;
import wk.d;
import ig.m0;
import e9.g;
import d9.c;
import p8.i;

public final class l implements i, c, g, m0, d, ScreenRecordingContract, PenaltyHandler, a, ev2.a
{
    public static l g;
    
    public static /* synthetic */ void f(final int n) {
        final Object[] array = new Object[3];
        switch (n) {
            default: {
                array[0] = "a";
                break;
            }
            case 9: {
                array[0] = "typeProjection";
                break;
            }
            case 8: {
                array[0] = "type";
                break;
            }
            case 6:
            case 11: {
                array[0] = "supertype";
                break;
            }
            case 5:
            case 10: {
                array[0] = "subtype";
                break;
            }
            case 2:
            case 7: {
                array[0] = "typeCheckingProcedure";
                break;
            }
            case 1:
            case 4: {
                array[0] = "b";
                break;
            }
        }
        array[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerProcedureCallbacksImpl";
        switch (n) {
            default: {
                array[2] = "assertEqualTypes";
                break;
            }
            case 10:
            case 11: {
                array[2] = "noCorrespondingSupertype";
                break;
            }
            case 8:
            case 9: {
                array[2] = "capture";
                break;
            }
            case 5:
            case 6:
            case 7: {
                array[2] = "assertSubtype";
                break;
            }
            case 3:
            case 4: {
                array[2] = "assertEqualTypeConstructors";
                break;
            }
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", array));
    }
    
    public static void g(final ViewGroup viewGroup, final LinkedHashSet set) {
        set.add(viewGroup);
        for (int i = 0; i < viewGroup.getChildCount(); ++i) {
            final View child = viewGroup.getChildAt(i);
            set.add(child);
            if (child instanceof ViewGroup) {
                g((ViewGroup)child, set);
            }
        }
    }
    
    public static boolean i(final l0 l0, final l0 l2) {
        if (l0 == null) {
            f(3);
            throw null;
        }
        if (l2 != null) {
            return l0.equals(l2);
        }
        f(4);
        throw null;
    }
    
    public static String j(final String s) {
        f.f((Object)s, "jwt");
        final Object[] array = b.E2((CharSequence)s, new String[] { "." }).toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        final String[] array2 = (String[])array;
        if (array2.length == 3) {
            final byte[] decode = Base64.decode(j.a2(j.a2(array2[1], "-", "+", false), "_", "/", false), 3);
            f.e((Object)decode, "decode(urlSafeString, Base64.NO_WRAP or Base64.NO_PADDING)");
            final Charset defaultCharset = Charset.defaultCharset();
            f.e((Object)defaultCharset, "defaultCharset()");
            return new String(decode, defaultCharset);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
    
    public final void a(final Activity activity) {
    }
    
    public final void a(final String s) {
    }
    
    public final boolean b(final Object o, final File file, final p8.g g) {
        final k k = ((r8.l)o).get();
        boolean b;
        try {
            l9.a.b(k.f.a.a.a.asReadOnlyBuffer(), file);
            b = true;
        }
        catch (final IOException ex) {
            if (Log.isLoggable("WebpEncoder", 5)) {
                Log.w("WebpEncoder", "Failed to encode WebP drawable data", (Throwable)ex);
            }
            b = false;
        }
        return b;
    }
    
    public final au2.b c(final String s) {
        return (au2.b)NOPLogger.NOP_LOGGER;
    }
    
    public final void clear() {
        InternalAutoScreenRecorderHelper.getInstance().clear();
    }
    
    public final r8.l d(final r8.l l, final p8.g g) {
        final ByteBuffer readOnlyBuffer = l.get().f.a.a.getData().asReadOnlyBuffer();
        final AtomicReference<byte[]> a = l9.a.a;
        Object o;
        if (!readOnlyBuffer.isReadOnly() && readOnlyBuffer.hasArray()) {
            o = new l9.a.b(readOnlyBuffer.array(), readOnlyBuffer.arrayOffset(), readOnlyBuffer.limit());
        }
        else {
            o = null;
        }
        byte[] array;
        if (o != null && ((l9.a.b)o).a == 0 && ((l9.a.b)o).b == ((l9.a.b)o).c.length) {
            array = readOnlyBuffer.array();
        }
        else {
            final ByteBuffer readOnlyBuffer2 = readOnlyBuffer.asReadOnlyBuffer();
            array = new byte[readOnlyBuffer2.limit()];
            readOnlyBuffer2.position(0);
            readOnlyBuffer2.get(array);
        }
        return new z8.b(array);
    }
    
    public final void delete() {
        InternalAutoScreenRecorderHelper.getInstance().delete();
    }
    
    public final EncodeStrategy e(final p8.g g) {
        return EncodeStrategy.SOURCE;
    }
    
    public final Uri getAutoScreenRecordingFileUri() {
        return InternalAutoScreenRecorderHelper.getInstance().getAutoScreenRecordingFileUri();
    }
    
    public final int getPenaltyType() {
        return 0;
    }
    
    public final void h() {
    }
    
    public final void handle(final Exception ex) {
    }
    
    public final boolean isEnabled() {
        return InternalAutoScreenRecorderHelper.getInstance().isEnabled();
    }
    
    public final int x(final int n, final int n2, final int n3) {
        return n;
    }
    
    public final void z(final int n, final int n2, final ShortBuffer shortBuffer, final ShortBuffer shortBuffer2) {
        shortBuffer2.put(shortBuffer);
    }
}
