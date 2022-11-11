// 
// Decompiled by Procyon v0.6.0
// 

package q3;

import java.lang.reflect.Array;
import w3.m;
import p3.d$d;
import java.lang.reflect.InvocationTargetException;
import android.graphics.Typeface;
import android.content.res.Resources;
import p3.d$c;
import android.content.Context;
import java.nio.ByteBuffer;
import android.graphics.fonts.FontVariationAxis;
import android.content.res.AssetManager;
import android.util.Log;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;

public class l extends j
{
    public final Class<?> f;
    public final Constructor<?> g;
    public final Method h;
    public final Method i;
    public final Method j;
    public final Method k;
    public final Method l;
    
    public l() {
        final Class clazz = null;
        Class<?> forName = null;
        Constructor<?> constructor = null;
        Method m = null;
        Method n = null;
        Method method = null;
        Method method2 = null;
        Object o = null;
        Label_0130: {
            try {
                forName = Class.forName("android.graphics.FontFamily");
                constructor = forName.getConstructor((Class<?>[])new Class[0]);
                m = m(forName);
                n = n(forName);
                method = forName.getMethod("freeze", (Class[])new Class[0]);
                method2 = forName.getMethod("abortCreation", (Class[])new Class[0]);
                o = this.o(forName);
                break Label_0130;
            }
            catch (final NoSuchMethodException method2) {}
            catch (final ClassNotFoundException ex) {}
            final StringBuilder r = a.r("Unable to collect necessary methods for class ");
            r.append(((Constructor<?>)method2).getClass().getName());
            Log.e("TypefaceCompatApi26Impl", r.toString(), (Throwable)method2);
            o = (method2 = null);
            final Method method3 = m = method2;
            n = (method = m);
            constructor = (Constructor<?>)method3;
            forName = clazz;
        }
        this.f = forName;
        this.g = constructor;
        this.h = m;
        this.i = n;
        this.j = method;
        this.k = method2;
        this.l = (Method)o;
    }
    
    public static Method m(final Class clazz) throws NoSuchMethodException {
        final Class<Integer> type = Integer.TYPE;
        return clazz.getMethod("addFontFromAssetManager", AssetManager.class, String.class, type, Boolean.TYPE, type, type, type, FontVariationAxis[].class);
    }
    
    public static Method n(final Class clazz) throws NoSuchMethodException {
        final Class<Integer> type = Integer.TYPE;
        return clazz.getMethod("addFontFromBuffer", ByteBuffer.class, type, FontVariationAxis[].class, type, type);
    }
    
    public final Typeface a(final Context context, final d$c d$c, final Resources resources, int n) {
        if (!this.l()) {
            return super.a(context, d$c, resources, n);
        }
        Object instance;
        try {
            instance = this.g.newInstance(new Object[0]);
        }
        catch (final IllegalAccessException | InstantiationException | InvocationTargetException ex) {
            instance = null;
        }
        if (instance == null) {
            return null;
        }
        final d$d[] a = d$c.a;
        final int length = a.length;
        n = 0;
        while (true) {
            Label_0121: {
                if (n >= length) {
                    break Label_0121;
                }
                final d$d d$d = a[n];
                Label_0115: {
                    if (this.i(context, instance, d$d.a, d$d.e, d$d.b, d$d.c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(d$d.d))) {
                        break Label_0115;
                    }
                    try {
                        this.k.invoke(instance, new Object[0]);
                        return null;
                        Label_0131: {
                            return this.j(instance);
                        }
                        iftrue(Label_0131:)(this.k(instance));
                        return null;
                        ++n;
                    }
                    catch (final IllegalAccessException | InvocationTargetException ex2) {
                        return null;
                    }
                }
            }
        }
    }
    
    public final Typeface b(final Context p0, final m[] p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: arraylength    
        //     2: iconst_1       
        //     3: if_icmpge       8
        //     6: aconst_null    
        //     7: areturn        
        //     8: aload_0        
        //     9: invokevirtual   q3/l.l:()Z
        //    12: ifne            112
        //    15: aload_0        
        //    16: iload_3        
        //    17: aload_2        
        //    18: invokevirtual   q3/p.f:(I[Lw3/m;)Lw3/m;
        //    21: astore_2       
        //    22: aload_1        
        //    23: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //    26: astore_1       
        //    27: aload_1        
        //    28: aload_2        
        //    29: getfield        w3/m.a:Landroid/net/Uri;
        //    32: ldc             "r"
        //    34: aconst_null    
        //    35: invokevirtual   android/content/ContentResolver.openFileDescriptor:(Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;
        //    38: astore_1       
        //    39: aload_1        
        //    40: ifnonnull       53
        //    43: aload_1        
        //    44: ifnull          51
        //    47: aload_1        
        //    48: invokevirtual   android/os/ParcelFileDescriptor.close:()V
        //    51: aconst_null    
        //    52: areturn        
        //    53: new             Landroid/graphics/Typeface$Builder;
        //    56: astore          4
        //    58: aload           4
        //    60: aload_1        
        //    61: invokevirtual   android/os/ParcelFileDescriptor.getFileDescriptor:()Ljava/io/FileDescriptor;
        //    64: invokespecial   android/graphics/Typeface$Builder.<init>:(Ljava/io/FileDescriptor;)V
        //    67: aload           4
        //    69: aload_2        
        //    70: getfield        w3/m.c:I
        //    73: invokevirtual   android/graphics/Typeface$Builder.setWeight:(I)Landroid/graphics/Typeface$Builder;
        //    76: aload_2        
        //    77: getfield        w3/m.d:Z
        //    80: invokevirtual   android/graphics/Typeface$Builder.setItalic:(Z)Landroid/graphics/Typeface$Builder;
        //    83: invokevirtual   android/graphics/Typeface$Builder.build:()Landroid/graphics/Typeface;
        //    86: astore_2       
        //    87: aload_1        
        //    88: invokevirtual   android/os/ParcelFileDescriptor.close:()V
        //    91: aload_2        
        //    92: areturn        
        //    93: astore_2       
        //    94: aload_1        
        //    95: invokevirtual   android/os/ParcelFileDescriptor.close:()V
        //    98: goto            107
        //   101: astore_1       
        //   102: aload_2        
        //   103: aload_1        
        //   104: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   107: aload_2        
        //   108: athrow         
        //   109: astore_1       
        //   110: aconst_null    
        //   111: areturn        
        //   112: new             Ljava/util/HashMap;
        //   115: dup            
        //   116: invokespecial   java/util/HashMap.<init>:()V
        //   119: astore          4
        //   121: aload_2        
        //   122: arraylength    
        //   123: istore          5
        //   125: iconst_0       
        //   126: istore          6
        //   128: iload           6
        //   130: iload           5
        //   132: if_icmpge       192
        //   135: aload_2        
        //   136: iload           6
        //   138: aaload         
        //   139: astore          7
        //   141: aload           7
        //   143: getfield        w3/m.e:I
        //   146: ifeq            152
        //   149: goto            186
        //   152: aload           7
        //   154: getfield        w3/m.a:Landroid/net/Uri;
        //   157: astore          7
        //   159: aload           4
        //   161: aload           7
        //   163: invokevirtual   java/util/HashMap.containsKey:(Ljava/lang/Object;)Z
        //   166: ifeq            172
        //   169: goto            186
        //   172: aload           4
        //   174: aload           7
        //   176: aload_1        
        //   177: aload           7
        //   179: invokestatic    q3/q.e:(Landroid/content/Context;Landroid/net/Uri;)Ljava/nio/MappedByteBuffer;
        //   182: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   185: pop            
        //   186: iinc            6, 1
        //   189: goto            128
        //   192: aload           4
        //   194: invokestatic    java/util/Collections.unmodifiableMap:(Ljava/util/Map;)Ljava/util/Map;
        //   197: astore          4
        //   199: aload_0        
        //   200: getfield        q3/l.g:Ljava/lang/reflect/Constructor;
        //   203: iconst_0       
        //   204: anewarray       Ljava/lang/Object;
        //   207: invokevirtual   java/lang/reflect/Constructor.newInstance:([Ljava/lang/Object;)Ljava/lang/Object;
        //   210: astore_1       
        //   211: goto            217
        //   214: astore_1       
        //   215: aconst_null    
        //   216: astore_1       
        //   217: aload_1        
        //   218: ifnonnull       223
        //   221: aconst_null    
        //   222: areturn        
        //   223: aload_2        
        //   224: arraylength    
        //   225: istore          8
        //   227: iconst_0       
        //   228: istore          6
        //   230: iload           6
        //   232: istore          5
        //   234: iload           6
        //   236: iload           8
        //   238: if_icmpge       383
        //   241: aload_2        
        //   242: iload           6
        //   244: aaload         
        //   245: astore          7
        //   247: aload           4
        //   249: aload           7
        //   251: getfield        w3/m.a:Landroid/net/Uri;
        //   254: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   259: checkcast       Ljava/nio/ByteBuffer;
        //   262: astore          9
        //   264: aload           9
        //   266: ifnonnull       272
        //   269: goto            377
        //   272: aload           7
        //   274: getfield        w3/m.b:I
        //   277: istore          5
        //   279: aload           7
        //   281: getfield        w3/m.c:I
        //   284: istore          10
        //   286: aload           7
        //   288: getfield        w3/m.d:Z
        //   291: istore          11
        //   293: aload_0        
        //   294: getfield        q3/l.i:Ljava/lang/reflect/Method;
        //   297: aload_1        
        //   298: iconst_5       
        //   299: anewarray       Ljava/lang/Object;
        //   302: dup            
        //   303: iconst_0       
        //   304: aload           9
        //   306: aastore        
        //   307: dup            
        //   308: iconst_1       
        //   309: iload           5
        //   311: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   314: aastore        
        //   315: dup            
        //   316: iconst_2       
        //   317: aconst_null    
        //   318: aastore        
        //   319: dup            
        //   320: iconst_3       
        //   321: iload           10
        //   323: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   326: aastore        
        //   327: dup            
        //   328: iconst_4       
        //   329: iload           11
        //   331: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   334: aastore        
        //   335: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   338: checkcast       Ljava/lang/Boolean;
        //   341: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   344: istore          12
        //   346: goto            354
        //   349: astore          7
        //   351: iconst_0       
        //   352: istore          12
        //   354: iload           12
        //   356: ifne            374
        //   359: aload_0        
        //   360: getfield        q3/l.k:Ljava/lang/reflect/Method;
        //   363: aload_1        
        //   364: iconst_0       
        //   365: anewarray       Ljava/lang/Object;
        //   368: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   371: pop            
        //   372: aconst_null    
        //   373: areturn        
        //   374: iconst_1       
        //   375: istore          5
        //   377: iinc            6, 1
        //   380: goto            234
        //   383: iload           5
        //   385: ifne            403
        //   388: aload_0        
        //   389: getfield        q3/l.k:Ljava/lang/reflect/Method;
        //   392: aload_1        
        //   393: iconst_0       
        //   394: anewarray       Ljava/lang/Object;
        //   397: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   400: pop            
        //   401: aconst_null    
        //   402: areturn        
        //   403: aload_0        
        //   404: aload_1        
        //   405: invokevirtual   q3/l.k:(Ljava/lang/Object;)Z
        //   408: ifne            413
        //   411: aconst_null    
        //   412: areturn        
        //   413: aload_0        
        //   414: aload_1        
        //   415: invokevirtual   q3/l.j:(Ljava/lang/Object;)Landroid/graphics/Typeface;
        //   418: astore_1       
        //   419: aload_1        
        //   420: ifnonnull       425
        //   423: aconst_null    
        //   424: areturn        
        //   425: aload_1        
        //   426: iload_3        
        //   427: invokestatic    android/graphics/Typeface.create:(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;
        //   430: areturn        
        //   431: astore_1       
        //   432: goto            372
        //   435: astore_1       
        //   436: goto            401
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                         
        //  -----  -----  -----  -----  ---------------------------------------------
        //  27     39     109    112    Ljava/io/IOException;
        //  47     51     109    112    Ljava/io/IOException;
        //  53     87     93     109    Any
        //  87     91     109    112    Ljava/io/IOException;
        //  94     98     101    107    Any
        //  102    107    109    112    Ljava/io/IOException;
        //  107    109    109    112    Ljava/io/IOException;
        //  199    211    214    217    Ljava/lang/IllegalAccessException;
        //  199    211    214    217    Ljava/lang/InstantiationException;
        //  199    211    214    217    Ljava/lang/reflect/InvocationTargetException;
        //  293    346    349    354    Ljava/lang/IllegalAccessException;
        //  293    346    349    354    Ljava/lang/reflect/InvocationTargetException;
        //  359    372    431    435    Ljava/lang/IllegalAccessException;
        //  359    372    431    435    Ljava/lang/reflect/InvocationTargetException;
        //  388    401    435    439    Ljava/lang/IllegalAccessException;
        //  388    401    435    439    Ljava/lang/reflect/InvocationTargetException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0401:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
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
    
    public final Typeface d(final Context context, final Resources resources, final int n, final String s, final int n2) {
        if (!this.l()) {
            return super.d(context, resources, n, s, n2);
        }
        Object instance;
        try {
            instance = this.g.newInstance(new Object[0]);
        }
        catch (final IllegalAccessException | InstantiationException | InvocationTargetException ex) {
            instance = null;
        }
        if (instance == null) {
            return null;
        }
        Label_0073: {
            if (this.i(context, instance, s, 0, -1, -1, null)) {
                break Label_0073;
            }
            try {
                this.k.invoke(instance, new Object[0]);
                return null;
                iftrue(Label_0083:)(this.k(instance));
                return null;
                Label_0083: {
                    return this.j(instance);
                }
            }
            catch (final IllegalAccessException | InvocationTargetException ex2) {
                return null;
            }
        }
    }
    
    public final boolean i(final Context context, final Object o, final String s, final int n, final int n2, final int n3, final FontVariationAxis[] array) {
        try {
            return (boolean)this.h.invoke(o, context.getAssets(), s, 0, Boolean.FALSE, n, n2, n3, array);
        }
        catch (final IllegalAccessException | InvocationTargetException ex) {
            return false;
        }
    }
    
    public Typeface j(final Object o) {
        try {
            final Object instance = Array.newInstance(this.f, 1);
            Array.set(instance, 0, o);
            return (Typeface)this.l.invoke(null, instance, -1, -1);
        }
        catch (final IllegalAccessException | InvocationTargetException ex) {
            return null;
        }
    }
    
    public final boolean k(final Object o) {
        try {
            return (boolean)this.j.invoke(o, new Object[0]);
        }
        catch (final IllegalAccessException | InvocationTargetException ex) {
            return false;
        }
    }
    
    public final boolean l() {
        if (this.h == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.h != null;
    }
    
    public Method o(final Class<?> clazz) throws NoSuchMethodException {
        final Class<?> class1 = Array.newInstance(clazz, 1).getClass();
        final Class<Integer> type = Integer.TYPE;
        final Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", class1, type, type);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
