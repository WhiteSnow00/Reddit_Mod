// 
// Decompiled by Procyon v0.6.0
// 

package o9;

import java.util.regex.Matcher;
import java.lang.reflect.InvocationTargetException;
import o72.f;
import com.coremedia.iso.boxes.Box;
import java.util.regex.Pattern;
import java.util.Properties;

public final class d extends a
{
    public static String[] h;
    public Properties c;
    public Pattern d;
    public StringBuilder e;
    public ThreadLocal<String> f;
    public ThreadLocal<String[]> g;
    
    static {
        d.h = new String[0];
    }
    
    public d(final String... p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   o9/a.<init>:()V
        //     4: aload_0        
        //     5: ldc             "(.*)\\((.*?)\\)"
        //     7: invokestatic    java/util/regex/Pattern.compile:(Ljava/lang/String;)Ljava/util/regex/Pattern;
        //    10: putfield        o9/d.d:Ljava/util/regex/Pattern;
        //    13: aload_0        
        //    14: new             Ljava/lang/StringBuilder;
        //    17: dup            
        //    18: invokespecial   java/lang/StringBuilder.<init>:()V
        //    21: putfield        o9/d.e:Ljava/lang/StringBuilder;
        //    24: aload_0        
        //    25: new             Ljava/lang/ThreadLocal;
        //    28: dup            
        //    29: invokespecial   java/lang/ThreadLocal.<init>:()V
        //    32: putfield        o9/d.f:Ljava/lang/ThreadLocal;
        //    35: aload_0        
        //    36: new             Ljava/lang/ThreadLocal;
        //    39: dup            
        //    40: invokespecial   java/lang/ThreadLocal.<init>:()V
        //    43: putfield        o9/d.g:Ljava/lang/ThreadLocal;
        //    46: ldc             Lo9/d;.class
        //    48: ldc             "/isoparser-default.properties"
        //    50: invokevirtual   java/lang/Class.getResourceAsStream:(Ljava/lang/String;)Ljava/io/InputStream;
        //    53: astore_2       
        //    54: new             Ljava/util/Properties;
        //    57: astore_3       
        //    58: aload_3        
        //    59: invokespecial   java/util/Properties.<init>:()V
        //    62: aload_0        
        //    63: aload_3        
        //    64: putfield        o9/d.c:Ljava/util/Properties;
        //    67: aload_3        
        //    68: aload_2        
        //    69: invokevirtual   java/util/Properties.load:(Ljava/io/InputStream;)V
        //    72: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //    75: invokevirtual   java/lang/Thread.getContextClassLoader:()Ljava/lang/ClassLoader;
        //    78: astore          4
        //    80: aload           4
        //    82: astore_3       
        //    83: aload           4
        //    85: ifnonnull       92
        //    88: invokestatic    java/lang/ClassLoader.getSystemClassLoader:()Ljava/lang/ClassLoader;
        //    91: astore_3       
        //    92: aload_3        
        //    93: ldc             "isoparser-custom.properties"
        //    95: invokevirtual   java/lang/ClassLoader.getResources:(Ljava/lang/String;)Ljava/util/Enumeration;
        //    98: astore          4
        //   100: aload           4
        //   102: invokeinterface java/util/Enumeration.hasMoreElements:()Z
        //   107: ifne            161
        //   110: aload_1        
        //   111: arraylength    
        //   112: istore          5
        //   114: iconst_0       
        //   115: istore          6
        //   117: iload           6
        //   119: iload           5
        //   121: if_icmplt       137
        //   124: aload_2        
        //   125: invokevirtual   java/io/InputStream.close:()V
        //   128: goto            136
        //   131: astore_1       
        //   132: aload_1        
        //   133: invokevirtual   java/lang/Throwable.printStackTrace:()V
        //   136: return         
        //   137: aload_1        
        //   138: iload           6
        //   140: aaload         
        //   141: astore_3       
        //   142: aload_0        
        //   143: getfield        o9/d.c:Ljava/util/Properties;
        //   146: ldc             Lo9/d;.class
        //   148: aload_3        
        //   149: invokevirtual   java/lang/Class.getResourceAsStream:(Ljava/lang/String;)Ljava/io/InputStream;
        //   152: invokevirtual   java/util/Properties.load:(Ljava/io/InputStream;)V
        //   155: iinc            6, 1
        //   158: goto            117
        //   161: aload           4
        //   163: invokeinterface java/util/Enumeration.nextElement:()Ljava/lang/Object;
        //   168: checkcast       Ljava/net/URL;
        //   171: invokestatic    com/google/firebase/perf/network/FirebasePerfUrlConnection.openStream:(Ljava/net/URL;)Ljava/io/InputStream;
        //   174: astore_3       
        //   175: aload_0        
        //   176: getfield        o9/d.c:Ljava/util/Properties;
        //   179: aload_3        
        //   180: invokevirtual   java/util/Properties.load:(Ljava/io/InputStream;)V
        //   183: aload_3        
        //   184: invokevirtual   java/io/InputStream.close:()V
        //   187: goto            100
        //   190: astore_1       
        //   191: aload_3        
        //   192: invokevirtual   java/io/InputStream.close:()V
        //   195: aload_1        
        //   196: athrow         
        //   197: astore_3       
        //   198: new             Ljava/lang/RuntimeException;
        //   201: astore_1       
        //   202: aload_1        
        //   203: aload_3        
        //   204: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/Throwable;)V
        //   207: aload_1        
        //   208: athrow         
        //   209: astore_1       
        //   210: aload_2        
        //   211: invokevirtual   java/io/InputStream.close:()V
        //   214: goto            222
        //   217: astore_3       
        //   218: aload_3        
        //   219: invokevirtual   java/lang/Throwable.printStackTrace:()V
        //   222: aload_1        
        //   223: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  54     67     209    224    Any
        //  67     80     197    209    Ljava/io/IOException;
        //  67     80     209    224    Any
        //  88     92     197    209    Ljava/io/IOException;
        //  88     92     209    224    Any
        //  92     100    197    209    Ljava/io/IOException;
        //  92     100    209    224    Any
        //  100    114    197    209    Ljava/io/IOException;
        //  100    114    209    224    Any
        //  124    128    131    136    Ljava/io/IOException;
        //  142    155    197    209    Ljava/io/IOException;
        //  142    155    209    224    Any
        //  161    175    197    209    Ljava/io/IOException;
        //  161    175    209    224    Any
        //  175    183    190    197    Any
        //  183    187    197    209    Ljava/io/IOException;
        //  183    187    209    224    Any
        //  191    197    197    209    Ljava/io/IOException;
        //  191    197    209    224    Any
        //  198    209    209    224    Any
        //  210    214    217    222    Ljava/io/IOException;
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
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:799)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:635)
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
    
    public final Box a(final String s, final String s2, final byte[] array) {
        int i = 0;
        String s4;
        if (array != null) {
            if (!"uuid".equals(s)) {
                throw new RuntimeException("we have a userType but no uuid box type. Something's wrong");
            }
            final Properties c = this.c;
            final StringBuilder sb = new StringBuilder("uuid[");
            sb.append(o72.f.m(0, array).toUpperCase());
            sb.append("]");
            String s3;
            if ((s3 = c.getProperty(sb.toString())) == null) {
                final Properties c2 = this.c;
                final StringBuilder sb2 = new StringBuilder(String.valueOf(s2));
                sb2.append("-uuid[");
                sb2.append(o72.f.m(0, array).toUpperCase());
                sb2.append("]");
                s3 = c2.getProperty(sb2.toString());
            }
            if ((s4 = s3) == null) {
                s4 = this.c.getProperty("uuid");
            }
        }
        else if ((s4 = this.c.getProperty(s)) == null) {
            final StringBuilder e = this.e;
            e.append(s2);
            e.append('-');
            e.append(s);
            final String string = e.toString();
            this.e.setLength(0);
            s4 = this.c.getProperty(string);
        }
        String property;
        if ((property = s4) == null) {
            property = this.c.getProperty("default");
        }
        if (property != null) {
            Label_0662: {
                if (!property.endsWith(")")) {
                    this.g.set(o9.d.h);
                    this.f.set(property);
                }
                else {
                    final Matcher matcher = this.d.matcher(property);
                    if (!matcher.matches()) {
                        break Label_0662;
                    }
                    this.f.set(matcher.group(1));
                    if (matcher.group(2).length() == 0) {
                        this.g.set(o9.d.h);
                    }
                    else {
                        final ThreadLocal<String[]> g = this.g;
                        String[] split;
                        if (matcher.group(2).length() > 0) {
                            split = matcher.group(2).split(",");
                        }
                        else {
                            split = new String[0];
                        }
                        g.set(split);
                    }
                }
                final String[] array2 = this.g.get();
                try {
                    final Class<?> forName = Class.forName(this.f.get());
                    if (array2.length > 0) {
                        final Class[] array3 = new Class[array2.length];
                        final Object[] array4 = new Object[array2.length];
                        while (i < array2.length) {
                            if ("userType".equals(array2[i])) {
                                array4[i] = array;
                                array3[i] = byte[].class;
                            }
                            else if ("type".equals(array2[i])) {
                                array4[i] = s;
                                array3[i] = String.class;
                            }
                            else {
                                if (!"parent".equals(array2[i])) {
                                    final StringBuilder sb3 = new StringBuilder("No such param: ");
                                    sb3.append(array2[i]);
                                    throw new InternalError(sb3.toString());
                                }
                                array4[i] = s2;
                                array3[i] = String.class;
                            }
                            ++i;
                        }
                        return (Box)forName.getConstructor((Class<?>[])array3).newInstance(array4);
                    }
                    return (Box)forName.newInstance();
                }
                catch (final NoSuchMethodException ex) {
                    throw new RuntimeException(ex);
                }
                catch (final InvocationTargetException ex2) {
                    throw new RuntimeException(ex2);
                }
                catch (final IllegalAccessException ex3) {
                    throw new RuntimeException(ex3);
                }
                catch (final InstantiationException ex4) {
                    throw new RuntimeException(ex4);
                }
                catch (final ClassNotFoundException ex5) {
                    throw new RuntimeException(ex5);
                }
            }
            final StringBuilder sb4 = new StringBuilder("Cannot work with that constructor: ");
            sb4.append(property);
            throw new RuntimeException(sb4.toString());
        }
        final StringBuilder sb5 = new StringBuilder("No box object found for ");
        sb5.append(s);
        throw new RuntimeException(sb5.toString());
    }
}
