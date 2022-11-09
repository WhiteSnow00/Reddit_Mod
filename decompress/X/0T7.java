// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 0T7
{
    static {
        Covode.recordClassIndex(4578);
    }
    
    public static String LIZ() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.i:(I)V
        //     6: new             Ljava/io/BufferedReader;
        //     9: astore_0       
        //    10: new             Ljava/io/FileReader;
        //    13: astore_1       
        //    14: aload_1        
        //    15: ldc             "/proc/self/cmdline"
        //    17: invokespecial   java/io/FileReader.<init>:(Ljava/lang/String;)V
        //    20: aload_0        
        //    21: aload_1        
        //    22: invokespecial   java/io/BufferedReader.<init>:(Ljava/io/Reader;)V
        //    25: aload_0        
        //    26: invokevirtual   java/io/BufferedReader.readLine:()Ljava/lang/String;
        //    29: astore_2       
        //    30: aload_0        
        //    31: astore_1       
        //    32: aload_2        
        //    33: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    36: ifne            101
        //    39: aload_2        
        //    40: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //    43: astore_2       
        //    44: aload_0        
        //    45: astore_1       
        //    46: aload_2        
        //    47: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    50: ifne            101
        //    53: aload_0        
        //    54: invokevirtual   java/io/BufferedReader.close:()V
        //    57: sipush          4368
        //    60: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //    63: aload_2        
        //    64: areturn        
        //    65: astore_0       
        //    66: aconst_null    
        //    67: astore_2       
        //    68: goto            76
        //    71: astore_1       
        //    72: aload_0        
        //    73: astore_2       
        //    74: aload_1        
        //    75: astore_0       
        //    76: aload_2        
        //    77: ifnull          84
        //    80: aload_2        
        //    81: invokevirtual   java/io/BufferedReader.close:()V
        //    84: sipush          4368
        //    87: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //    90: aload_0        
        //    91: athrow         
        //    92: astore_0       
        //    93: aconst_null    
        //    94: astore_0       
        //    95: aload_0        
        //    96: ifnull          105
        //    99: aload_0        
        //   100: astore_1       
        //   101: aload_1        
        //   102: invokevirtual   java/io/BufferedReader.close:()V
        //   105: sipush          4368
        //   108: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //   111: aconst_null    
        //   112: areturn        
        //   113: astore_1       
        //   114: goto            95
        //   117: astore_0       
        //   118: goto            57
        //   121: astore_1       
        //   122: goto            84
        //   125: astore_0       
        //   126: goto            105
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  6      25     92     95     Ljava/lang/Exception;
        //  6      25     65     71     Any
        //  25     30     113    117    Ljava/lang/Exception;
        //  25     30     71     76     Any
        //  32     44     113    117    Ljava/lang/Exception;
        //  32     44     71     76     Any
        //  46     53     113    117    Ljava/lang/Exception;
        //  46     53     71     76     Any
        //  53     57     117    121    Ljava/lang/Exception;
        //  80     84     121    125    Ljava/lang/Exception;
        //  101    105    125    129    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 72, Size: 72
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
    
    public static String LIZ(final Context context) {
        String versionName;
        try {
            final PackageManager packageManager = context.getPackageManager();
            final String packageName = context.getPackageName();
            final Context liz = NQO.LJJ.LIZ();
            if (6Tl.LJIIIZ) {
                TextUtils.equals((CharSequence)packageName, (CharSequence)liz.getPackageName());
            }
            PackageInfo packageInfo;
            if (6Tl.LJIIIZ && TextUtils.equals((CharSequence)packageName, (CharSequence)liz.getPackageName())) {
                if (6Tl.LIZLLL == null) {
                    6Tl.LIZLLL = packageManager.getPackageInfo(packageName, 0);
                }
                packageInfo = 6Tl.LIZLLL;
            }
            else {
                if (6Tl.LJIIIZ) {
                    TextUtils.equals((CharSequence)packageName, (CharSequence)liz.getPackageName());
                }
                if (6Tl.LJIIIZ) {
                    TextUtils.equals((CharSequence)packageName, (CharSequence)liz.getPackageName());
                }
                packageInfo = packageManager.getPackageInfo(packageName, 0);
            }
            versionName = packageInfo.versionName;
        }
        catch (final Exception ex) {
            versionName = null;
        }
        String s = versionName;
        if (TextUtils.isEmpty((CharSequence)versionName)) {
            s = "unknown";
        }
        return s;
    }
}
