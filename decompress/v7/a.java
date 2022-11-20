// 
// Decompiled by Procyon v0.6.0
// 

package v7;

import java.util.concurrent.ExecutorService;
import mg.d0;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import dg.l1;
import com.bumptech.glide.load.EncodeStrategy;
import android.net.Uri;
import java.io.IOException;
import android.util.Log;
import r8.m;
import o8.k;
import p8.g;
import com.instabug.library.internal.video.InternalAutoScreenRecorderHelper;
import org.slf4j.helpers.NOPLogger;
import java.io.File;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import com.apollographql.apollo.api.ResponseField;
import com.instabug.library.internal.video.ScreenRecordingContract;
import hg.v;
import hg.m0;
import p8.i;
import j7.b;

public final class a implements b, i, m0, v, ScreenRecordingContract, ot2.a
{
    public static a f;
    
    public final Object a(final ResponseField responseField, final Object o) {
        return ((Map)o).get(responseField.b);
    }
    
    public final Object[] b(final Object o, final ArrayList list, final ArrayList list2) {
        return (Object[])com.google.android.play.core.internal.a.g(o, "makePathElements", (Class)List.class, list, (Class)File.class, (File)null, (Class)List.class, list2);
    }
    
    public final ot2.b c(final String s) {
        return (ot2.b)NOPLogger.NOP_LOGGER;
    }
    
    public final void clear() {
        InternalAutoScreenRecorderHelper.getInstance().clear();
    }
    
    public final void delete() {
        InternalAutoScreenRecorderHelper.getInstance().delete();
    }
    
    public final boolean g(final Object o, final File file, final g g) {
        final k k = ((m)o).get();
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
    
    public final Uri getAutoScreenRecordingFileUri() {
        return InternalAutoScreenRecorderHelper.getInstance().getAutoScreenRecordingFileUri();
    }
    
    public final EncodeStrategy i(final g g) {
        return EncodeStrategy.SOURCE;
    }
    
    public final boolean isEnabled() {
        return InternalAutoScreenRecorderHelper.getInstance().isEnabled();
    }
    
    public final /* bridge */ Object zza() {
        final ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor((ThreadFactory)l1.f);
        d0.u1((Object)singleThreadExecutor);
        return singleThreadExecutor;
    }
}
