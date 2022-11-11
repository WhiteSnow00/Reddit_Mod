// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.io.Closeable;
import com.bytedance.android.livesdk.livesetting.performance.CpuTemperaturePathListSetting;
import android.text.TextUtils;
import java.lang.reflect.Field;
import android.os.Handler;
import android.os.Looper;
import android.content.ClipboardManager;
import android.os.Build$VERSION;
import android.view.WindowManager;
import android.util.DisplayMetrics;
import android.content.Context;
import android.os.StatFs;
import java.io.IOException;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import com.bytedance.covode.number.Covode;
import java.io.FileFilter;

public final class 0cW
{
    public static int LIZ;
    public static float LIZIZ;
    public static final FileFilter LIZJ;
    
    static {
        Covode.recordClassIndex(5729);
        LIZJ = new 0cV();
        0cW.LIZ = -1;
        0cW.LIZIZ = -1.0f;
    }
    
    public static float LIZ(final File file) {
        MethodCollector.i(7651);
        try {
            final FileInputStream fileInputStream = new FileInputStream(file);
            final InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            final BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            final String line = bufferedReader.readLine();
            bufferedReader.close();
            inputStreamReader.close();
            fileInputStream.close();
            try {
                final float float1 = Float.parseFloat(line);
                MethodCollector.o(7651);
                return float1;
            }
            catch (final NumberFormatException ex) {
                MethodCollector.o(7651);
                return -999.0f;
            }
        }
        catch (final IOException ex2) {
            MethodCollector.o(7651);
            return -999.0f;
        }
    }
    
    public static int LIZ() {
        final int n = -1;
        try {
            int n2;
            if ((n2 = LIZIZ("/sys/devices/system/cpu/possible")) == -1) {
                n2 = LIZIZ("/sys/devices/system/cpu/present");
            }
            if (n2 == -1) {
                n2 = new File("/sys/devices/system/cpu/").listFiles(0cW.LIZJ).length;
            }
            return n2;
        }
        catch (final SecurityException | NullPointerException ex) {
            return n;
        }
    }
    
    public static long LIZ(final String s) {
        try {
            final StatFs statFs = new StatFs(s);
            return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
        }
        catch (final IllegalArgumentException | Exception ex) {
            return -1L;
        }
    }
    
    public static 1HX LIZ(final Context context) {
        final 1HX 1hx = new 1HX('\0');
        final DisplayMetrics displayMetrics = new DisplayMetrics();
        final WindowManager windowManager = (WindowManager)LIZ(context, "window");
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            1hx.LIZ = displayMetrics.densityDpi;
            1hx.LIZIZ = displayMetrics.widthPixels;
            1hx.LIZJ = displayMetrics.heightPixels;
        }
        return 1hx;
    }
    
    public static Object LIZ(Context context, String ex) {
        MethodCollector.i(7627);
    Label_0161_Outer:
        while (true) {
            if (Build$VERSION.SDK_INT <= 27 && "clipboard".equals(ex)) {
                if (!2JT.LIZ) {
                    break Label_0161_Outer;
                }
                monitorenter(ClipboardManager.class);
                try {
                    final Object systemService = context.getSystemService((String)ex);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            final Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            ex = (Exception)new 2Lq((Handler)declaredField.get(systemService));
                            declaredField.set(systemService, ex);
                        }
                        catch (final Exception ex) {
                            6Nw.LIZ((Throwable)ex, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    2JT.LIZ = false;
                    monitorexit(ClipboardManager.class);
                    break Label_0176;
                }
                finally {
                    monitorexit(ClipboardManager.class);
                    MethodCollector.o(7627);
                }
            }
            while (true) {
                if (2JT.LIZIZ || !"connectivity".equals(ex)) {
                    break Label_0161;
                }
                try {
                    new 6G9().LIZ();
                    2JT.LIZIZ = true;
                    context = (Context)context.getSystemService((String)ex);
                    MethodCollector.o(7627);
                    return context;
                    context = (Context)context.getSystemService((String)ex);
                    continue Label_0161_Outer;
                    context = (Context)context.getSystemService((String)ex);
                    continue Label_0161_Outer;
                }
                finally {
                    continue;
                }
                break;
            }
            break;
        }
    }
    
    public static boolean LIZ(final double n) {
        return n >= -30.0 && n <= 250.0;
    }
    
    public static float LIZIZ(final Context context) {
        float n = -999.0f;
        if (context == null) {
            return -999.0f;
        }
        final H2k liz = H2k.LIZ(context, "live-app-core-sdk");
        final String liz2 = liz.LIZ("cpu_temperature_path", "");
        if (TextUtils.equals((CharSequence)liz2, (CharSequence)"unknow")) {
            return -999.0f;
        }
        if (!TextUtils.isEmpty((CharSequence)liz2)) {
            final float liz3 = LIZ(new File(liz2));
            if (liz3 != -999.0f) {
                if (LIZ(liz3)) {
                    return liz3;
                }
                final float n2 = liz3 / 1000.0f;
                if (LIZ(n2)) {
                    return n2;
                }
                return -999.0f;
            }
        }
        for (final String s : CpuTemperaturePathListSetting.INSTANCE.getPathList()) {
            final float liz4 = LIZ(new File(s));
            if (liz4 != -999.0f) {
                if (LIZ(liz4)) {
                    liz.LIZ("cpu_temperature_path", (Object)s);
                    n = liz4;
                }
                else {
                    final float n3 = liz4 / 1000.0f;
                    if (LIZ(n3)) {
                        liz.LIZ("cpu_temperature_path", (Object)s);
                        n = n3;
                    }
                }
                return n;
            }
        }
        liz.LIZ("cpu_temperature_path", (Object)"unknow");
        return -999.0f;
    }
    
    public static int LIZIZ(String line) {
        MethodCollector.i(7624);
        final int n = -1;
        Closeable closeable = null;
        Label_0151: {
            BufferedReader bufferedReader;
            try {
                final FileInputStream fileInputStream = new FileInputStream(line);
                try {
                    closeable = new BufferedReader(new InputStreamReader(fileInputStream));
                    line = ((BufferedReader)closeable).readLine();
                    int n2 = n;
                    if (line != null) {
                        if (!line.matches("0-[\\d]+$")) {
                            n2 = n;
                        }
                        else {
                            n2 = Integer.valueOf(line.substring(2)) + 1;
                        }
                    }
                    try {
                        fileInputStream.close();
                    }
                    catch (final IOException ex) {
                        0II.LIZ(ex);
                    }
                    MethodCollector.o(7624);
                    return n2;
                }
                catch (final IOException ex2) {}
                finally {
                    try {
                        fileInputStream.close();
                    }
                    catch (final IOException ex3) {
                        0II.LIZ(ex3);
                    }
                }
            }
            catch (final IOException ex4) {
                if (!false) {
                    break Label_0151;
                }
                bufferedReader = (BufferedReader)closeable;
            }
            try {
                ((InputStream)bufferedReader).close();
            }
            catch (final IOException ex5) {
                0II.LIZ(ex5);
            }
        }
        MethodCollector.o(7624);
        return -1;
    }
    
    public static String LIZIZ() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore_0       
        //     4: sipush          7629
        //     7: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.i:(I)V
        //    10: aconst_null    
        //    11: astore_1       
        //    12: aconst_null    
        //    13: astore_2       
        //    14: new             Ljava/io/BufferedReader;
        //    17: astore_3       
        //    18: new             Ljava/io/FileReader;
        //    21: astore          4
        //    23: new             Ljava/io/File;
        //    26: astore          5
        //    28: aload           5
        //    30: ldc_w           "/proc/cpuinfo"
        //    33: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //    36: aload           4
        //    38: aload           5
        //    40: invokespecial   java/io/FileReader.<init>:(Ljava/io/File;)V
        //    43: aload_3        
        //    44: aload           4
        //    46: invokespecial   java/io/BufferedReader.<init>:(Ljava/io/Reader;)V
        //    49: aload_3        
        //    50: invokevirtual   java/io/BufferedReader.readLine:()Ljava/lang/String;
        //    53: astore_2       
        //    54: aload_0        
        //    55: astore_1       
        //    56: aload_2        
        //    57: ifnull          72
        //    60: aload_2        
        //    61: ldc_w           "Hardware"
        //    64: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //    67: ifeq            49
        //    70: aload_2        
        //    71: astore_1       
        //    72: aload_1        
        //    73: astore_2       
        //    74: aload_3        
        //    75: invokevirtual   java/io/BufferedReader.close:()V
        //    78: goto            121
        //    81: astore_1       
        //    82: aload_2        
        //    83: astore_0       
        //    84: goto            90
        //    87: astore_1       
        //    88: aload_3        
        //    89: astore_0       
        //    90: aload_0        
        //    91: ifnull          98
        //    94: aload_0        
        //    95: invokevirtual   java/io/BufferedReader.close:()V
        //    98: sipush          7629
        //   101: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //   104: aload_1        
        //   105: athrow         
        //   106: astore_1       
        //   107: aload_0        
        //   108: astore_1       
        //   109: aload_3        
        //   110: ifnull          121
        //   113: aload_0        
        //   114: astore_2       
        //   115: aload_3        
        //   116: invokevirtual   java/io/BufferedReader.close:()V
        //   119: aload_0        
        //   120: astore_1       
        //   121: aload_1        
        //   122: astore_0       
        //   123: aload_1        
        //   124: invokevirtual   java/lang/String.length:()I
        //   127: ifle            153
        //   130: aload_1        
        //   131: ldc_w           ":"
        //   134: invokevirtual   java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        //   137: astore_2       
        //   138: aload_1        
        //   139: astore_0       
        //   140: aload_2        
        //   141: arraylength    
        //   142: iconst_2       
        //   143: if_icmpne       153
        //   146: aload_2        
        //   147: iconst_1       
        //   148: aaload         
        //   149: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //   152: astore_0       
        //   153: sipush          7629
        //   156: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //   159: aload_0        
        //   160: areturn        
        //   161: astore_2       
        //   162: aload_1        
        //   163: astore_3       
        //   164: goto            107
        //   167: astore_1       
        //   168: aload_2        
        //   169: astore_1       
        //   170: goto            121
        //   173: astore_0       
        //   174: goto            98
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  14     49     161    167    Ljava/io/IOException;
        //  14     49     81     87     Any
        //  49     54     106    107    Ljava/io/IOException;
        //  49     54     87     90     Any
        //  60     70     106    107    Ljava/io/IOException;
        //  60     70     87     90     Any
        //  74     78     167    173    Ljava/io/IOException;
        //  94     98     173    177    Ljava/io/IOException;
        //  115    119    167    173    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 101, Size: 101
        //     at java.util.ArrayList.rangeCheck(Unknown Source)
        //     at java.util.ArrayList.get(Unknown Source)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:112)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
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
}
