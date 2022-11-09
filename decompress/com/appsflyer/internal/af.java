// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.internal;

import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.io.FileReader;
import X.608;
import X.4F0;
import com.bytedance.ies.abmock.SettingsManager;
import X.609;
import X.NIJ;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import X.5ek;
import com.appsflyer.AFLogger;
import java.io.File;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class af
{
    public static af valueOf;
    
    static {
        Covode.recordClassIndex(2581);
        af.valueOf = new af();
    }
    
    public static void AFKeystoreWrapper(final String s, final Context context) {
        final File file = new File(new File(INVOKEVIRTUAL_com_appsflyer_internal_af_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(context), "AFRequestCache"), s);
        final StringBuilder sb = new StringBuilder("Deleting ");
        sb.append(s);
        sb.append(" from cache");
        AFLogger.valueOf(sb.toString());
        if (file.exists()) {
            try {
                INVOKEVIRTUAL_com_appsflyer_internal_af_com_ss_android_ugc_aweme_storage_FileLancet_delete(file);
            }
            catch (final Exception ex) {
                final StringBuilder sb2 = new StringBuilder("Could not delete ");
                sb2.append(s);
                sb2.append(" from cache");
                AFLogger.valueOf(sb2.toString(), ex);
            }
        }
    }
    
    public static File INVOKEVIRTUAL_com_appsflyer_internal_af_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(final Context context) {
        if (5ek.LIZJ == null || !5ek.LJ) {
            return 5ek.LIZJ = context.getFilesDir();
        }
        return 5ek.LIZJ;
    }
    
    public static boolean INVOKEVIRTUAL_com_appsflyer_internal_af_com_ss_android_ugc_aweme_storage_FileLancet_delete(final File file) {
        MethodCollector.i(66);
        while (true) {
            try {
                609 liz;
                if (NIJ.LIZIZ()) {
                    liz = (609)SettingsManager.LIZ().LIZ("storage_intercepter_key", (Class)609.class, (Object)4F0.LIZ);
                }
                else {
                    liz = 4F0.LIZ;
                }
                if (608.LIZ(file.getAbsolutePath(), liz)) {
                    608.LIZ(file, (Throwable)new RuntimeException(), "exception_delete_log", 608.LIZ(liz));
                }
                if (608.LIZJ(file.getAbsolutePath(), liz)) {
                    608.LIZ(file, (Throwable)new RuntimeException(), "exception_handle", 608.LIZ(liz));
                    MethodCollector.o(66);
                    return false;
                }
                final boolean delete = file.delete();
                MethodCollector.o(66);
                return delete;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static f valueOf(final File file) {
        MethodCollector.i(1699);
        while (true) {
            try {
                final FileReader fileReader = new FileReader(file);
                try {
                    final char[] array = new char[(int)file.length()];
                    fileReader.read(array);
                    final f f = new f(array);
                    f.AFKeystoreWrapper = file.getName();
                    try {
                        fileReader.close();
                    }
                    catch (final IOException ex) {
                        AFLogger.valueOf(ex);
                    }
                    MethodCollector.o(1699);
                    return f;
                }
                catch (final Exception ex2) {
                    if (fileReader != null) {
                        try {
                            fileReader.close();
                        }
                        catch (final IOException ex3) {
                            AFLogger.valueOf(ex3);
                        }
                    }
                }
                finally {
                    try {
                        fileReader.close();
                    }
                    catch (final IOException ex4) {
                        AFLogger.valueOf(ex4);
                    }
                }
                MethodCollector.o(1699);
                return null;
            }
            catch (final Exception ex5) {
                continue;
            }
            break;
        }
    }
    
    public static List<f> valueOf(final Context context) {
        final ArrayList list = new ArrayList();
        try {
            final File file = new File(INVOKEVIRTUAL_com_appsflyer_internal_af_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(context), "AFRequestCache");
            if (!file.exists()) {
                file.mkdir();
            }
            else {
                for (final File file2 : file.listFiles()) {
                    final StringBuilder sb = new StringBuilder("Found cached request");
                    sb.append(file2.getName());
                    AFLogger.valueOf(sb.toString());
                    list.add(valueOf(file2));
                }
            }
        }
        catch (final Exception ex) {
            AFLogger.valueOf("Could not cache request", ex);
        }
        return list;
    }
    
    public static af values() {
        return af.valueOf;
    }
    
    public static File values(final Context context) {
        return new File(INVOKEVIRTUAL_com_appsflyer_internal_af_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(context), "AFRequestCache");
    }
}
