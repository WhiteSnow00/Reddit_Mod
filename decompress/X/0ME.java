// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Callable;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.attribute.BasicFileAttributes;
import android.text.TextUtils;
import org.json.JSONObject;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import java.util.Iterator;
import android.os.Build$VERSION;
import com.bytedance.ies.abmock.SettingsManager;
import android.content.ComponentName;
import android.content.Intent;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.List;

public final class 0Me
{
    public static volatile boolean LIZ;
    public static volatile boolean LIZIZ;
    public static boolean LIZJ;
    public static 0MZ LIZLLL;
    public static 0Mk LJ;
    public static List<0Mn> LJFF;
    public static 0Mj LJI;
    public static 0Ml LJII;
    public static long LJIIIIZZ;
    
    static {
        Covode.recordClassIndex(2746);
    }
    
    public static ComponentName LIZ(Context context, final Intent ex) {
        Label_0176: {
            if (!(context instanceof Context)) {
                break Label_0176;
            }
            final boolean liz = KiO.LIZ(context, (Intent)ex);
            final Context context2 = null;
            if (liz) {
                return null;
            }
            int i = 0;
            while (true) {
                try {
                    try {
                        if (SettingsManager.LIZ().LIZ("StartServiceLancet_startService", false) && Build$VERSION.SDK_INT >= 26 && NR7.LJIIJJI) {
                            final StringBuilder sb = new StringBuilder("dangerousStartService warning! make sure you are in forground call startService ");
                            sb.append(ex.getClass().getName());
                            VYh.LIZ(sb.toString());
                        }
                        context = (Context)context.startService((Intent)ex);
                    }
                    catch (final RuntimeException ex) {
                        context = (Context)(Object)ex.getStackTrace();
                        final int length = context.length;
                        int n = 0;
                        while (i < length) {
                            final StackTraceElement stackTraceElement = context[i];
                            int n2 = n;
                            if (stackTraceElement.getClassName().startsWith("com.ss.android.ugc.aweme.scheduler.PublishService")) {
                                n2 = n;
                                if ("show".equals(stackTraceElement.getMethodName())) {
                                    n2 = 1;
                                }
                            }
                            ++i;
                            n = n2;
                        }
                        if (n == 0) {
                            throw ex;
                        }
                        context = context2;
                    }
                    return (ComponentName)context;
                    return context.startService((Intent)ex);
                }
                catch (final Exception ex2) {
                    continue;
                }
                break;
            }
        }
    }
    
    public static Context LIZ(Context applicationContext) {
        applicationContext = applicationContext.getApplicationContext();
        if (!5WL.LIZIZ) {
            return applicationContext;
        }
        if (applicationContext != null) {
            return applicationContext;
        }
        return (Context)5WL.LIZ;
    }
    
    public static void LIZ() {
        final List<0Mn> ljff = 0Me.LJFF;
        if (ljff != null && !ljff.isEmpty()) {
            for (final 0Mn 0Mn : 0Me.LJFF) {
                if (0Mn != null) {
                    0Mn.LIZ();
                }
            }
        }
    }
    
    public static void LIZ(File liz, String s, final 0Mh.b b, final List<0Mh.a> list) {
        MethodCollector.i(12629);
        if (s == null) {
            MethodCollector.o(12629);
            return;
        }
        final File file = new File(s);
        final String s2 = null;
        final String s3 = null;
        final Exception ex = null;
        final String s4 = null;
        liz = (Exception)0Mh.LIZ((File)liz, null, b);
        if (liz == null) {
            MethodCollector.o(12629);
            return;
        }
        if (!file.exists()) {
            try {
                file.createNewFile();
            }
            catch (final IOException ex2) {
                0II.LIZ(ex2);
            }
        }
        else {
            final 0Mh.a liz2 = 0Mh.LIZ(s);
            if (liz2 == null) {
                MethodCollector.o(12629);
                return;
            }
            0Mh.LIZ(liz2, (0Mh.a)liz, list);
        }
        final JSONObject lizj = ((0Mh.a)liz).LIZJ();
        liz = ex;
        Exception ex6;
        try {
            try {
                liz = ex;
                final File file2 = new File(s);
                liz = ex;
                if (!file2.exists()) {
                    liz = ex;
                    file2.createNewFile();
                }
                liz = ex;
                liz = ex;
                s = (String)new FileOutputStream(file2);
                try {
                    ((FileOutputStream)s).write(lizj.toString().getBytes());
                    ((FileOutputStream)s).close();
                    final String s5 = s;
                    ((FileOutputStream)s5).close();
                    final int n = 12629;
                    MethodCollector.o(n);
                    return;
                }
                catch (final Exception ex3) {}
                catch (final IOException ex4) {}
                catch (final FileNotFoundException ex5) {}
                finally {
                    final String s6 = s;
                }
            }
            catch (final Exception s6) {
                s = s4;
            }
            catch (final IOException s6) {
                s = s2;
            }
            catch (final FileNotFoundException s6) {
                s = s3;
            }
            try {
                final String s5 = s;
                ((FileOutputStream)s5).close();
                final int n = 12629;
                MethodCollector.o(n);
                return;
                final String s6;
                0II.LIZ((Exception)s6);
                ((FileOutputStream)s).close();
                MethodCollector.o(12629);
                return;
                0II.LIZ((Exception)s6);
                ((FileOutputStream)s).close();
                MethodCollector.o(12629);
                return;
                0II.LIZ((Exception)s6);
                ((FileOutputStream)s).close();
                MethodCollector.o(12629);
                return;
            }
            catch (final Exception liz) {
                0II.LIZ(liz);
                MethodCollector.o(12629);
                return;
            }
        }
        finally {
            ex6 = liz;
            final Exception ex7;
            liz = ex7;
        }
        try {
            ((FileOutputStream)ex6).close();
        }
        catch (final Exception ex8) {
            0II.LIZ(ex8);
        }
        MethodCollector.o(12629);
        throw liz;
    }
    
    public static void LIZ(final File file, final List<File> list) {
        if (file != null && file.exists() && list != null) {
            final boolean file2 = file.isFile();
            int i = 0;
            if (file2) {
                final long n = 50L;
                final 0MZ lizlll = 0Me.LIZLLL;
                long n2 = n;
                if (lizlll != null) {
                    n2 = n;
                    if (lizlll.LJII > 0) {
                        n2 = 0Me.LIZLLL.LJII;
                    }
                }
                if (file.length() > n2 * 1024L * 1024L) {
                    list.add(file);
                }
                return;
            }
            final File[] listFiles = file.listFiles();
            if (listFiles != null) {
                while (i < listFiles.length) {
                    LIZ(listFiles[i], list);
                    ++i;
                }
            }
        }
    }
    
    public static void LIZ(final String s) {
        if (!TextUtils.isEmpty((CharSequence)s) && Build$VERSION.SDK_INT >= 26 && 5eg.LIZ.LIZIZ("disk_gecko_monitor")) {
            try {
                final File file = new File(s);
                if (!file.exists()) {
                    return;
                }
                final BasicFileAttributes attributes = Files.readAttributes(file.toPath(), BasicFileAttributes.class, new LinkOption[0]);
                final JSONObject jsonObject = new JSONObject();
                jsonObject.put("c_time", attributes.creationTime().toMillis() / 86400000L);
                jsonObject.put("a_time", attributes.lastAccessTime().toMillis() / 86400000L);
                jsonObject.put("m_time", attributes.lastModifiedTime().toMillis() / 86400000L);
                final JSONObject jsonObject2 = new JSONObject();
                jsonObject2.put("key_status", (Object)"file_attr");
                jsonObject2.put("path", (Object)s);
                6ZX.LIZ("disk_gecko_monitor", jsonObject2, jsonObject, (JSONObject)null);
            }
            finally {}
        }
    }
    
    public static boolean LIZ(final Context context, long lizlll) {
        try {
            if (System.currentTimeMillis() - lizlll > 86400000L) {
                final 0MW.a a = (0MW.a)NEN.LIZ().LIZ(true, "disk_auto_clean_param", 31744, (Class)0MW.a.class, (Object)0MW.LIZ);
                if (a == null || a.LIZ == 0) {
                    return false;
                }
                lizlll = 5et.LIZLLL(context);
                final long lizj = 5et.LIZJ();
                if (a.LIZIZ > 0 && a.LIZIZ < lizlll) {
                    return true;
                }
                if (a.LIZ == 3 && lizj > 0L && lizj < 5368709120L) {
                    return true;
                }
            }
        }
        catch (final Exception ex) {
            0II.LIZ(ex);
        }
        return false;
    }
    
    public static boolean LIZ(final File file) {
        MethodCollector.i(18881);
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
                    MethodCollector.o(18881);
                    return false;
                }
                final boolean delete = file.delete();
                MethodCollector.o(18881);
                return delete;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static boolean LIZ(File parentFile, final File file) {
        if (file == null) {
            return false;
        }
        try {
            if (file.getCanonicalPath() == null) {
                return false;
            }
            while (parentFile != null && parentFile.getCanonicalPath() != null) {
                if (parentFile.getCanonicalPath().equals(file.getCanonicalPath())) {
                    return true;
                }
                parentFile = parentFile.getParentFile();
            }
            return false;
        }
        catch (final Exception ex) {
            0II.LIZ(ex);
        }
        return false;
    }
    
    public static void LIZIZ(final Context context, final long n) {
        try {
            final long lizj = 5et.LIZJ();
            final long lizj2 = 5et.LIZJ(context);
            final JSONObject jsonObject = new JSONObject();
            jsonObject.put("app_storage_size", n);
            jsonObject.put("storage_available_size", lizj + lizj2);
            final JSONObject jsonObject2 = new JSONObject();
            jsonObject2.put("key_status", (Object)"after_auto_clean_all");
            6ZX.LIZ("disk_auto_clean_monitor", jsonObject2, jsonObject, (JSONObject)null);
        }
        catch (final Exception ex) {
            0II.LIZ(ex);
        }
    }
    
    public static boolean LIZIZ(final Context context) {
        final 0Ml ljii = 0Me.LJII;
        return ljii != null && (ljii.LJFF && 0Mi.LIZJ(context));
    }
    
    public static void LIZJ(final Context context) {
        final boolean liziz = 5eg.LIZ.LIZIZ("disk_auto_clean_monitor");
        long lizlll;
        if (liziz) {
            lizlll = 5et.LIZLLL(context);
            LIZIZ(context, lizlll);
        }
        else {
            lizlll = 0L;
        }
        for (final 4Gj 4Gj : 5ey.LIZIZ()) {
            4Gj.LIZLLL();
            4Gj.LIZ();
        }
        final 0Mk lj = 0Me.LJ;
        if (lj != null) {
            lj.LIZ(LIZIZ(context));
        }
        LJFF(context);
        final 0Mk lj2 = 0Me.LJ;
        if (lj2 != null && lj2.LIZIZ()) {
            LJ(context);
        }
        if (liziz) {
            LIZJ(context, lizlll);
        }
    }
    
    public static void LIZJ(final Context context, final long n) {
        try {
            final long lizlll = 5et.LIZLLL(context);
            final JSONObject jsonObject = new JSONObject();
            jsonObject.put("app_storage_size", lizlll);
            jsonObject.put("clean_size", n - lizlll);
            final JSONObject jsonObject2 = new JSONObject();
            jsonObject2.put("key_status", (Object)"after_auto_clean_all");
            6ZX.LIZ("disk_auto_clean_monitor", jsonObject2, jsonObject, (JSONObject)null);
        }
        catch (final Exception ex) {
            0II.LIZ(ex);
        }
    }
    
    public static void LIZLLL(final Context context) {
        public final class 0Mc implements Callable<Object>
        {
            public final /* synthetic */ Context LIZ;
            
            static {
                Covode.recordClassIndex(2748);
            }
            
            public 0Mc(final Context liz) {
                this.LIZ = liz;
            }
            
            @Override
            public final Object call() {
                final Context liz = this.LIZ;
                if (liz == null) {
                    return null;
                }
                6Fr.LIZ(liz, "clean_storage_pref", 0).edit().putLong("key_clean_date", System.currentTimeMillis()).commit();
                0Me.LIZ = false;
                return null;
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ifnonnull       5
        //     4: return         
        //     5: new             LX/0Mc;
        //     8: dup            
        //     9: aload_0        
        //    10: invokestatic    X/0Me.LIZ:(Landroid/content/Context;)Landroid/content/Context;
        //    13: invokespecial   X/0Mc.<init>:(Landroid/content/Context;)V
        //    16: invokestatic    X/6v3.LIZ:()Ljava/util/concurrent/ExecutorService;
        //    19: aconst_null    
        //    20: invokestatic    X/0Gx.LIZ:(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;LX/0Gn;)LX/0Gx;
        //    23: pop            
        //    24: return         
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:419)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:207)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformCall(AstMethodBodyBuilder.java:1106)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:993)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:534)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:548)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:534)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:377)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:213)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static void LJ(final Context context) {
        if (0Me.LJI == null) {
            return;
        }
        try {
            LJIIJJI(context);
            LIZ();
            final JSONObject jsonObject = new JSONObject();
            final long liz = 0Mi.LIZ(LJI(context).getParent());
            final long liz2 = 0Mi.LIZ(LJII(context).getParent());
            long liz3 = 0L;
            final File lizj = 5ey.LIZJ(context);
            if (lizj != null) {
                liz3 = 0Mi.LIZ(lizj.getParent());
            }
            jsonObject.put("private_size", liz);
            jsonObject.put("external_size", liz2);
            jsonObject.put("sdcard_size", liz3);
            jsonObject.put("total_size", liz + liz2);
            jsonObject.put("device_size", 0Mi.LIZ(context));
            jsonObject.put("available_size", 0Mi.LIZIZ(context));
            jsonObject.put("apk_size", LJIIIZ(context));
            jsonObject.put("strategy_enabled", 5ey.LIZ() && 5ex.LIZ(context) != null && 5ex.LIZ(context).LIZ());
            0Ma.LIZ(context, jsonObject);
            0Me.LJI.LIZ("disk_usage", jsonObject);
            LJIIJ(context);
            LIZ(new File(LJIIIIZZ(context), "offlineX").getAbsolutePath());
            LIZ(new File(LJIIIIZZ(context), "offline").getAbsolutePath());
        }
        catch (final Exception ex) {}
    }
    
    public static void LJFF(final Context context) {
        if (context != null && LJI(context) != null && LJI(context).getParentFile() != null && LJII(context) != null && LJII(context).getParentFile() != null) {
            final 0MZ lizlll = 0Me.LIZLLL;
            if (lizlll != null && lizlll.LIZIZ != null && lizlll.LIZIZ.length > 0) {
                final 0Mk lj = 0Me.LJ;
                Set<String> liz;
                if (lj == null) {
                    liz = null;
                }
                else {
                    liz = lj.LIZ();
                }
                for (final String s : lizlll.LIZIZ) {
                    if (liz != null && !liz.contains(s)) {
                        final File file = new File(s);
                        if ((LIZ(file, LJI(context).getParentFile()) || LIZ(file, LJII(context).getParentFile())) && file.exists()) {
                            if (file.isFile()) {
                                LIZ(file);
                            }
                            else {
                                0Mi.LIZIZ(file);
                            }
                        }
                    }
                }
            }
        }
    }
    
    public static File LJI(final Context context) {
        if (5ek.LIZIZ == null || !5ek.LJ) {
            return 5ek.LIZIZ = context.getCacheDir();
        }
        return 5ek.LIZIZ;
    }
    
    public static File LJII(final Context context) {
        if (5ek.LIZ == null || !5ek.LJ) {
            return 5ek.LIZ = context.getExternalCacheDir();
        }
        return 5ek.LIZ;
    }
    
    public static File LJIIIIZZ(final Context context) {
        if (5ek.LIZJ == null || !5ek.LJ) {
            return 5ek.LIZJ = context.getFilesDir();
        }
        return 5ek.LIZJ;
    }
    
    public static long LJIIIZ(final Context context) {
        long n2;
        final long n = n2 = 0L;
        long n3;
        try {
            final String publicSourceDir = context.getApplicationInfo().publicSourceDir;
            long length = n;
            if (publicSourceDir != null) {
                n2 = n;
                n2 = n;
                final File file = new File(publicSourceDir);
                length = n;
                n2 = n;
                if (file.exists()) {
                    n2 = n;
                    length = file.length();
                }
            }
            n2 = length;
            final String[] splitPublicSourceDirs = context.getApplicationInfo().splitPublicSourceDirs;
            n3 = length;
            if (splitPublicSourceDirs != null) {
                n2 = length;
                n3 = length;
                if (splitPublicSourceDirs.length > 0) {
                    n2 = length;
                    final int length2 = splitPublicSourceDirs.length;
                    int n4 = 0;
                    while (true) {
                        n3 = length;
                        if (n4 >= length2) {
                            break;
                        }
                        final String s = splitPublicSourceDirs[n4];
                        n2 = length;
                        n2 = length;
                        final File file2 = new File(s);
                        long n5 = length;
                        n2 = length;
                        if (file2.exists()) {
                            n2 = length;
                            n5 = length + file2.length();
                        }
                        ++n4;
                        length = n5;
                    }
                }
            }
        }
        catch (final Exception ex) {
            0II.LIZ(ex);
            n3 = n2;
        }
        return n3;
    }
    
    public static void LJIIJ(final Context context) {
        if (context != null && 0Me.LJI != null) {
            final ArrayList list = new ArrayList();
            final File lji = LJI(context);
            if (lji != null) {
                LIZ(lji.getParentFile(), list);
            }
            final File ljii = LJII(context);
            File parentFile;
            if ((parentFile = ljii) != null) {
                parentFile = ljii.getParentFile();
                LIZ(parentFile, list);
            }
            if (list.size() > 0) {
                final JSONObject jsonObject = new JSONObject();
                while (true) {
                    try {
                        final StringBuilder sb = new StringBuilder();
                        for (final File file : list) {
                            if (!parentFile.getName().endsWith(".so")) {
                                final StringBuilder sb2 = new StringBuilder();
                                sb2.append(file.getAbsolutePath());
                                sb2.append(":");
                                sb2.append(file.length() / 1024L / 1024L);
                                sb2.append("#");
                                sb.append(sb2.toString());
                            }
                        }
                        jsonObject.put("files", (Object)sb.toString());
                        0Me.LJI.LIZ("large_files_v2", jsonObject);
                    }
                    catch (final Exception ex) {
                        continue;
                    }
                    break;
                }
            }
        }
    }
    
    public static void LJIIJJI(Context context) {
        0Me.LJIIIIZZ = 0L;
        if (!0Me.LIZJ) {
            return;
        }
        if (context == null) {
            return;
        }
        final ArrayList list = new ArrayList();
        final File lji = LJI(context);
        if (lji != null) {
            final File parentFile = lji.getParentFile();
            final StringBuilder sb = new StringBuilder();
            sb.append(lji.getAbsolutePath());
            sb.append(File.separator);
            sb.append("ptree.txt");
            LIZ(parentFile, sb.toString(), 0Mh.b.LIZ, list);
        }
        final File ljii = LJII(context);
        if (ljii != null) {
            final File parentFile2 = ljii.getParentFile();
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(ljii.getAbsolutePath());
            sb2.append(File.separator);
            sb2.append("etree.txt");
            LIZ(parentFile2, sb2.toString(), 0Mh.b.LIZIZ, list);
        }
        context = (Context)new JSONObject();
        while (true) {
            try {
                for (final 0Mh.a a : list) {
                    a.LIZIZ();
                    0Me.LJIIIIZZ += a.LIZ;
                    final String liziz = a.LIZIZ();
                    if (liziz != null) {
                        ((JSONObject)context).put(liziz.replace("/", "_"), a.LIZ / 1024L / 1024L);
                    }
                }
                final 0Mj lji2 = 0Me.LJI;
                if (lji2 != null) {
                    lji2.LIZIZ("mark_storage", (JSONObject)context);
                }
            }
            catch (final Exception ex) {
                continue;
            }
            break;
        }
    }
}
