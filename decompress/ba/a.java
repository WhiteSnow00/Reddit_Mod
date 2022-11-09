// 
// Decompiled by Procyon v0.6.0
// 

package ba;

import android.content.pm.ApplicationInfo;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.io.File;
import android.content.Context;
import java.io.IOException;
import java.io.Closeable;

public final class a implements b
{
    public static void a(final Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        }
        catch (final IOException ex) {}
    }
    
    public static a b(final Context context, final String[] array, final String s, final e e) {
        final String[] d = d(context);
        final int length = d.length;
        int n = 0;
        ZipFile zipFile2 = null;
        ZipEntry entry = null;
    Label_0220_Outer:
        while (true) {
            final ZipFile zipFile = null;
            Label_0226: {
                if (n >= length) {
                    break Label_0226;
                }
                final String s2 = d[n];
                int n2 = 0;
                while (true) {
                    zipFile2 = zipFile;
                    if (n2 < 5) {
                        try {
                            zipFile2 = new ZipFile(new File(s2), 1);
                        }
                        catch (final IOException ex) {
                            ++n2;
                            continue Label_0220_Outer;
                        }
                        break;
                    }
                    break;
                }
                while (true) {
                    if (zipFile2 == null) {
                        break Label_0220;
                    }
                    for (int i = 0; i < 5; ++i) {
                        for (final String s3 : array) {
                            final StringBuilder k = a.k("lib");
                            k.append(File.separatorChar);
                            k.append(s3);
                            k.append(File.separatorChar);
                            k.append(s);
                            final String string = k.toString();
                            e.getClass();
                            e.d("Looking for %s in APK %s...", string, s2);
                            entry = zipFile2.getEntry(string);
                            if (entry != null) {
                                break Label_0220_Outer;
                            }
                        }
                    }
                    try {
                        zipFile2.close();
                        ++n;
                        continue Label_0220_Outer;
                        return null;
                    }
                    catch (final IOException ex2) {
                        continue;
                    }
                    break;
                }
            }
        }
        return new a(zipFile2, entry);
    }
    
    public static String[] c(final Context p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: invokestatic    a.k:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //     5: astore_2       
        //     6: aload_2        
        //     7: getstatic       java/io/File.separatorChar:C
        //    10: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //    13: pop            
        //    14: aload_2        
        //    15: ldc             "([^\\"
        //    17: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    20: pop            
        //    21: aload_2        
        //    22: getstatic       java/io/File.separatorChar:C
        //    25: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //    28: pop            
        //    29: aload_2        
        //    30: ldc             "]*)"
        //    32: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    35: pop            
        //    36: aload_2        
        //    37: getstatic       java/io/File.separatorChar:C
        //    40: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //    43: pop            
        //    44: aload_2        
        //    45: aload_1        
        //    46: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    49: pop            
        //    50: aload_2        
        //    51: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    54: invokestatic    java/util/regex/Pattern.compile:(Ljava/lang/String;)Ljava/util/regex/Pattern;
        //    57: astore_2       
        //    58: new             Ljava/util/HashSet;
        //    61: dup            
        //    62: invokespecial   java/util/HashSet.<init>:()V
        //    65: astore_1       
        //    66: aload_0        
        //    67: invokestatic    ba/a.d:(Landroid/content/Context;)[Ljava/lang/String;
        //    70: astore_0       
        //    71: aload_0        
        //    72: arraylength    
        //    73: istore_3       
        //    74: iconst_0       
        //    75: istore          4
        //    77: iload           4
        //    79: iload_3        
        //    80: if_icmpge       178
        //    83: aload_0        
        //    84: iload           4
        //    86: aaload         
        //    87: astore          5
        //    89: new             Ljava/util/zip/ZipFile;
        //    92: astore          6
        //    94: new             Ljava/io/File;
        //    97: astore          7
        //    99: aload           7
        //   101: aload           5
        //   103: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //   106: aload           6
        //   108: aload           7
        //   110: iconst_1       
        //   111: invokespecial   java/util/zip/ZipFile.<init>:(Ljava/io/File;I)V
        //   114: aload           6
        //   116: invokevirtual   java/util/zip/ZipFile.entries:()Ljava/util/Enumeration;
        //   119: astore          7
        //   121: aload           7
        //   123: invokeinterface java/util/Enumeration.hasMoreElements:()Z
        //   128: ifeq            172
        //   131: aload_2        
        //   132: aload           7
        //   134: invokeinterface java/util/Enumeration.nextElement:()Ljava/lang/Object;
        //   139: checkcast       Ljava/util/zip/ZipEntry;
        //   142: invokevirtual   java/util/zip/ZipEntry.getName:()Ljava/lang/String;
        //   145: invokevirtual   java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
        //   148: astore          5
        //   150: aload           5
        //   152: invokevirtual   java/util/regex/Matcher.matches:()Z
        //   155: ifeq            121
        //   158: aload_1        
        //   159: aload           5
        //   161: iconst_1       
        //   162: invokevirtual   java/util/regex/Matcher.group:(I)Ljava/lang/String;
        //   165: invokevirtual   java/util/HashSet.add:(Ljava/lang/Object;)Z
        //   168: pop            
        //   169: goto            121
        //   172: iinc            4, 1
        //   175: goto            77
        //   178: aload_1        
        //   179: aload_1        
        //   180: invokevirtual   java/util/HashSet.size:()I
        //   183: anewarray       Ljava/lang/String;
        //   186: invokeinterface java/util/Set.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //   191: checkcast       [Ljava/lang/String;
        //   194: areturn        
        //   195: astore          5
        //   197: goto            172
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  89     114    195    200    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.assembler.ir.StackMappingVisitor.push(StackMappingVisitor.java:290)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:837)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visit(StackMappingVisitor.java:398)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2086)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
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
    
    public static String[] d(final Context context) {
        final ApplicationInfo applicationInfo = context.getApplicationInfo();
        final String[] splitSourceDirs = applicationInfo.splitSourceDirs;
        if (splitSourceDirs != null && splitSourceDirs.length != 0) {
            final String[] array = new String[splitSourceDirs.length + 1];
            array[0] = applicationInfo.sourceDir;
            System.arraycopy(splitSourceDirs, 0, array, 1, splitSourceDirs.length);
            return array;
        }
        return new String[] { applicationInfo.sourceDir };
    }
    
    public static final class a
    {
        public ZipFile a;
        public ZipEntry b;
        
        public a(final ZipFile a, final ZipEntry b) {
            this.a = a;
            this.b = b;
        }
    }
}
