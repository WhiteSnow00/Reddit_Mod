// 
// Decompiled by Procyon v0.6.0
// 

package wa;

import com.google.android.exoplayer2.audio.DefaultAudioSink$c;
import android.content.Intent;
import com.google.android.exoplayer2.audio.AudioProcessor;
import ya.e$a;
import android.provider.Settings$Global;
import bd.c0;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import com.google.android.exoplayer2.audio.DefaultAudioSink$e;
import com.google.android.exoplayer2.audio.DefaultAudioSink;
import com.google.android.exoplayer2.z;
import com.google.android.exoplayer2.k$b;
import android.os.Handler;
import com.google.android.exoplayer2.mediacodec.e;
import com.google.android.exoplayer2.mediacodec.b;
import android.content.Context;

public class d implements h0
{
    public final Context a;
    public final b b;
    public int c;
    public e d;
    
    public d(final Context a) {
        this.a = a;
        this.b = new b();
        this.c = 0;
        this.d = (e)e.Q2;
    }
    
    @Override
    public final z[] a(final Handler p0, final k$b p1, final k$b p2, final k$b p3, final k$b p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokespecial   java/util/ArrayList.<init>:()V
        //     7: astore          9
        //     9: aload_0        
        //    10: getfield        wa/d.a:Landroid/content/Context;
        //    13: astore          10
        //    15: aload_0        
        //    16: getfield        wa/d.c:I
        //    19: istore          8
        //    21: aload_0        
        //    22: getfield        wa/d.d:Lcom/google/android/exoplayer2/mediacodec/e;
        //    25: astore          11
        //    27: aload           9
        //    29: new             Lcd/g;
        //    32: dup            
        //    33: aload           10
        //    35: aload_0        
        //    36: getfield        wa/d.b:Lcom/google/android/exoplayer2/mediacodec/b;
        //    39: aload           11
        //    41: aload_1        
        //    42: aload_2        
        //    43: invokespecial   cd/g.<init>:(Landroid/content/Context;Lcom/google/android/exoplayer2/mediacodec/b;Lcom/google/android/exoplayer2/mediacodec/e;Landroid/os/Handler;Lcom/google/android/exoplayer2/k$b;)V
        //    46: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //    49: pop            
        //    50: iload           8
        //    52: ifne            58
        //    55: goto            302
        //    58: aload           9
        //    60: invokevirtual   java/util/ArrayList.size:()I
        //    63: istore          7
        //    65: iload           7
        //    67: istore          6
        //    69: iload           8
        //    71: iconst_2       
        //    72: if_icmpne       81
        //    75: iload           7
        //    77: iconst_1       
        //    78: isub           
        //    79: istore          6
        //    81: ldc             "com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer"
        //    83: invokestatic    java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
        //    86: iconst_4       
        //    87: anewarray       Ljava/lang/Class;
        //    90: dup            
        //    91: iconst_0       
        //    92: getstatic       java/lang/Long.TYPE:Ljava/lang/Class;
        //    95: aastore        
        //    96: dup            
        //    97: iconst_1       
        //    98: ldc             Landroid/os/Handler;.class
        //   100: aastore        
        //   101: dup            
        //   102: iconst_2       
        //   103: ldc             Lcd/p;.class
        //   105: aastore        
        //   106: dup            
        //   107: iconst_3       
        //   108: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
        //   111: aastore        
        //   112: invokevirtual   java/lang/Class.getConstructor:([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
        //   115: iconst_4       
        //   116: anewarray       Ljava/lang/Object;
        //   119: dup            
        //   120: iconst_0       
        //   121: ldc2_w          5000
        //   124: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   127: aastore        
        //   128: dup            
        //   129: iconst_1       
        //   130: aload_1        
        //   131: aastore        
        //   132: dup            
        //   133: iconst_2       
        //   134: aload_2        
        //   135: aastore        
        //   136: dup            
        //   137: iconst_3       
        //   138: bipush          50
        //   140: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   143: aastore        
        //   144: invokevirtual   java/lang/reflect/Constructor.newInstance:([Ljava/lang/Object;)Ljava/lang/Object;
        //   147: checkcast       Lcom/google/android/exoplayer2/z;
        //   150: astore          10
        //   152: iload           6
        //   154: iconst_1       
        //   155: iadd           
        //   156: istore          7
        //   158: aload           9
        //   160: iload           6
        //   162: aload           10
        //   164: invokevirtual   java/util/ArrayList.add:(ILjava/lang/Object;)V
        //   167: ldc             "DefaultRenderersFactory"
        //   169: ldc             "Loaded LibvpxVideoRenderer."
        //   171: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
        //   174: pop            
        //   175: goto            203
        //   178: astore          10
        //   180: iload           7
        //   182: istore          6
        //   184: goto            199
        //   187: astore_1       
        //   188: new             Ljava/lang/RuntimeException;
        //   191: dup            
        //   192: ldc             "Error instantiating VP9 extension"
        //   194: aload_1        
        //   195: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   198: athrow         
        //   199: iload           6
        //   201: istore          7
        //   203: aload           9
        //   205: iload           7
        //   207: ldc             "com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer"
        //   209: invokestatic    java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
        //   212: iconst_4       
        //   213: anewarray       Ljava/lang/Class;
        //   216: dup            
        //   217: iconst_0       
        //   218: getstatic       java/lang/Long.TYPE:Ljava/lang/Class;
        //   221: aastore        
        //   222: dup            
        //   223: iconst_1       
        //   224: ldc             Landroid/os/Handler;.class
        //   226: aastore        
        //   227: dup            
        //   228: iconst_2       
        //   229: ldc             Lcd/p;.class
        //   231: aastore        
        //   232: dup            
        //   233: iconst_3       
        //   234: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
        //   237: aastore        
        //   238: invokevirtual   java/lang/Class.getConstructor:([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
        //   241: iconst_4       
        //   242: anewarray       Ljava/lang/Object;
        //   245: dup            
        //   246: iconst_0       
        //   247: ldc2_w          5000
        //   250: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   253: aastore        
        //   254: dup            
        //   255: iconst_1       
        //   256: aload_1        
        //   257: aastore        
        //   258: dup            
        //   259: iconst_2       
        //   260: aload_2        
        //   261: aastore        
        //   262: dup            
        //   263: iconst_3       
        //   264: bipush          50
        //   266: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   269: aastore        
        //   270: invokevirtual   java/lang/reflect/Constructor.newInstance:([Ljava/lang/Object;)Ljava/lang/Object;
        //   273: checkcast       Lcom/google/android/exoplayer2/z;
        //   276: invokevirtual   java/util/ArrayList.add:(ILjava/lang/Object;)V
        //   279: ldc             "DefaultRenderersFactory"
        //   281: ldc             "Loaded Libgav1VideoRenderer."
        //   283: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
        //   286: pop            
        //   287: goto            302
        //   290: astore_1       
        //   291: new             Ljava/lang/RuntimeException;
        //   294: dup            
        //   295: ldc             "Error instantiating AV1 extension"
        //   297: aload_1        
        //   298: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   301: athrow         
        //   302: aload_0        
        //   303: aload_0        
        //   304: getfield        wa/d.a:Landroid/content/Context;
        //   307: invokevirtual   wa/d.b:(Landroid/content/Context;)Lcom/google/android/exoplayer2/audio/DefaultAudioSink;
        //   310: astore_2       
        //   311: aload_2        
        //   312: ifnull          671
        //   315: aload_0        
        //   316: getfield        wa/d.a:Landroid/content/Context;
        //   319: astore          11
        //   321: aload_0        
        //   322: getfield        wa/d.c:I
        //   325: istore          8
        //   327: aload_0        
        //   328: getfield        wa/d.d:Lcom/google/android/exoplayer2/mediacodec/e;
        //   331: astore          10
        //   333: aload           9
        //   335: new             Lcom/google/android/exoplayer2/audio/g;
        //   338: dup            
        //   339: aload           11
        //   341: aload_0        
        //   342: getfield        wa/d.b:Lcom/google/android/exoplayer2/mediacodec/b;
        //   345: aload           10
        //   347: aload_1        
        //   348: aload_3        
        //   349: aload_2        
        //   350: invokespecial   com/google/android/exoplayer2/audio/g.<init>:(Landroid/content/Context;Lcom/google/android/exoplayer2/mediacodec/b;Lcom/google/android/exoplayer2/mediacodec/e;Landroid/os/Handler;Lcom/google/android/exoplayer2/k$b;Lcom/google/android/exoplayer2/audio/AudioSink;)V
        //   353: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   356: pop            
        //   357: iload           8
        //   359: ifne            365
        //   362: goto            671
        //   365: aload           9
        //   367: invokevirtual   java/util/ArrayList.size:()I
        //   370: istore          7
        //   372: iload           7
        //   374: istore          6
        //   376: iload           8
        //   378: iconst_2       
        //   379: if_icmpne       388
        //   382: iload           7
        //   384: iconst_1       
        //   385: isub           
        //   386: istore          6
        //   388: ldc             "com.google.android.exoplayer2.ext.opus.LibopusAudioRenderer"
        //   390: invokestatic    java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
        //   393: iconst_3       
        //   394: anewarray       Ljava/lang/Class;
        //   397: dup            
        //   398: iconst_0       
        //   399: ldc             Landroid/os/Handler;.class
        //   401: aastore        
        //   402: dup            
        //   403: iconst_1       
        //   404: ldc             Lcom/google/android/exoplayer2/audio/a;.class
        //   406: aastore        
        //   407: dup            
        //   408: iconst_2       
        //   409: ldc             Lcom/google/android/exoplayer2/audio/AudioSink;.class
        //   411: aastore        
        //   412: invokevirtual   java/lang/Class.getConstructor:([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
        //   415: iconst_3       
        //   416: anewarray       Ljava/lang/Object;
        //   419: dup            
        //   420: iconst_0       
        //   421: aload_1        
        //   422: aastore        
        //   423: dup            
        //   424: iconst_1       
        //   425: aload_3        
        //   426: aastore        
        //   427: dup            
        //   428: iconst_2       
        //   429: aload_2        
        //   430: aastore        
        //   431: invokevirtual   java/lang/reflect/Constructor.newInstance:([Ljava/lang/Object;)Ljava/lang/Object;
        //   434: checkcast       Lcom/google/android/exoplayer2/z;
        //   437: astore          10
        //   439: iload           6
        //   441: iconst_1       
        //   442: iadd           
        //   443: istore          7
        //   445: aload           9
        //   447: iload           6
        //   449: aload           10
        //   451: invokevirtual   java/util/ArrayList.add:(ILjava/lang/Object;)V
        //   454: ldc             "DefaultRenderersFactory"
        //   456: ldc             "Loaded LibopusAudioRenderer."
        //   458: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
        //   461: pop            
        //   462: iload           7
        //   464: istore          6
        //   466: goto            490
        //   469: astore          10
        //   471: iload           7
        //   473: istore          6
        //   475: goto            490
        //   478: astore_1       
        //   479: new             Ljava/lang/RuntimeException;
        //   482: dup            
        //   483: ldc             "Error instantiating Opus extension"
        //   485: aload_1        
        //   486: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   489: athrow         
        //   490: ldc             "com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer"
        //   492: invokestatic    java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
        //   495: iconst_3       
        //   496: anewarray       Ljava/lang/Class;
        //   499: dup            
        //   500: iconst_0       
        //   501: ldc             Landroid/os/Handler;.class
        //   503: aastore        
        //   504: dup            
        //   505: iconst_1       
        //   506: ldc             Lcom/google/android/exoplayer2/audio/a;.class
        //   508: aastore        
        //   509: dup            
        //   510: iconst_2       
        //   511: ldc             Lcom/google/android/exoplayer2/audio/AudioSink;.class
        //   513: aastore        
        //   514: invokevirtual   java/lang/Class.getConstructor:([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
        //   517: iconst_3       
        //   518: anewarray       Ljava/lang/Object;
        //   521: dup            
        //   522: iconst_0       
        //   523: aload_1        
        //   524: aastore        
        //   525: dup            
        //   526: iconst_1       
        //   527: aload_3        
        //   528: aastore        
        //   529: dup            
        //   530: iconst_2       
        //   531: aload_2        
        //   532: aastore        
        //   533: invokevirtual   java/lang/reflect/Constructor.newInstance:([Ljava/lang/Object;)Ljava/lang/Object;
        //   536: checkcast       Lcom/google/android/exoplayer2/z;
        //   539: astore          10
        //   541: iload           6
        //   543: iconst_1       
        //   544: iadd           
        //   545: istore          7
        //   547: aload           9
        //   549: iload           6
        //   551: aload           10
        //   553: invokevirtual   java/util/ArrayList.add:(ILjava/lang/Object;)V
        //   556: ldc             "DefaultRenderersFactory"
        //   558: ldc             "Loaded LibflacAudioRenderer."
        //   560: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
        //   563: pop            
        //   564: iload           7
        //   566: istore          6
        //   568: goto            592
        //   571: astore          10
        //   573: iload           7
        //   575: istore          6
        //   577: goto            592
        //   580: astore_1       
        //   581: new             Ljava/lang/RuntimeException;
        //   584: dup            
        //   585: ldc             "Error instantiating FLAC extension"
        //   587: aload_1        
        //   588: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   591: athrow         
        //   592: aload           9
        //   594: iload           6
        //   596: ldc             "com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer"
        //   598: invokestatic    java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
        //   601: iconst_3       
        //   602: anewarray       Ljava/lang/Class;
        //   605: dup            
        //   606: iconst_0       
        //   607: ldc             Landroid/os/Handler;.class
        //   609: aastore        
        //   610: dup            
        //   611: iconst_1       
        //   612: ldc             Lcom/google/android/exoplayer2/audio/a;.class
        //   614: aastore        
        //   615: dup            
        //   616: iconst_2       
        //   617: ldc             Lcom/google/android/exoplayer2/audio/AudioSink;.class
        //   619: aastore        
        //   620: invokevirtual   java/lang/Class.getConstructor:([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
        //   623: iconst_3       
        //   624: anewarray       Ljava/lang/Object;
        //   627: dup            
        //   628: iconst_0       
        //   629: aload_1        
        //   630: aastore        
        //   631: dup            
        //   632: iconst_1       
        //   633: aload_3        
        //   634: aastore        
        //   635: dup            
        //   636: iconst_2       
        //   637: aload_2        
        //   638: aastore        
        //   639: invokevirtual   java/lang/reflect/Constructor.newInstance:([Ljava/lang/Object;)Ljava/lang/Object;
        //   642: checkcast       Lcom/google/android/exoplayer2/z;
        //   645: invokevirtual   java/util/ArrayList.add:(ILjava/lang/Object;)V
        //   648: ldc             "DefaultRenderersFactory"
        //   650: ldc             "Loaded FfmpegAudioRenderer."
        //   652: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
        //   655: pop            
        //   656: goto            671
        //   659: astore_1       
        //   660: new             Ljava/lang/RuntimeException;
        //   663: dup            
        //   664: ldc             "Error instantiating FFmpeg extension"
        //   666: aload_1        
        //   667: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   670: athrow         
        //   671: aload           9
        //   673: new             Lnc/l;
        //   676: dup            
        //   677: aload           4
        //   679: aload_1        
        //   680: invokevirtual   android/os/Handler.getLooper:()Landroid/os/Looper;
        //   683: invokespecial   nc/l.<init>:(Lcom/google/android/exoplayer2/k$b;Landroid/os/Looper;)V
        //   686: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   689: pop            
        //   690: aload           9
        //   692: new             Lqb/f;
        //   695: dup            
        //   696: aload           5
        //   698: aload_1        
        //   699: invokevirtual   android/os/Handler.getLooper:()Landroid/os/Looper;
        //   702: invokespecial   qb/f.<init>:(Lcom/google/android/exoplayer2/k$b;Landroid/os/Looper;)V
        //   705: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   708: pop            
        //   709: aload           9
        //   711: new             Ldd/b;
        //   714: dup            
        //   715: invokespecial   dd/b.<init>:()V
        //   718: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   721: pop            
        //   722: aload           9
        //   724: iconst_0       
        //   725: anewarray       Lcom/google/android/exoplayer2/z;
        //   728: invokevirtual   java/util/ArrayList.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //   731: checkcast       [Lcom/google/android/exoplayer2/z;
        //   734: areturn        
        //   735: astore          10
        //   737: goto            199
        //   740: astore_2       
        //   741: goto            302
        //   744: astore          10
        //   746: goto            490
        //   749: astore          10
        //   751: goto            592
        //   754: astore_2       
        //   755: goto            671
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  81     152    735    740    Ljava/lang/ClassNotFoundException;
        //  81     152    187    199    Ljava/lang/Exception;
        //  158    175    178    187    Ljava/lang/ClassNotFoundException;
        //  158    175    187    199    Ljava/lang/Exception;
        //  203    287    740    744    Ljava/lang/ClassNotFoundException;
        //  203    287    290    302    Ljava/lang/Exception;
        //  388    439    744    749    Ljava/lang/ClassNotFoundException;
        //  388    439    478    490    Ljava/lang/Exception;
        //  445    462    469    478    Ljava/lang/ClassNotFoundException;
        //  445    462    478    490    Ljava/lang/Exception;
        //  490    541    749    754    Ljava/lang/ClassNotFoundException;
        //  490    541    580    592    Ljava/lang/Exception;
        //  547    564    571    580    Ljava/lang/ClassNotFoundException;
        //  547    564    580    592    Ljava/lang/Exception;
        //  592    656    754    758    Ljava/lang/ClassNotFoundException;
        //  592    656    659    671    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 420, Size: 420
        //     at java.util.ArrayList.rangeCheck(Unknown Source)
        //     at java.util.ArrayList.get(Unknown Source)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3476)
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
    
    public DefaultAudioSink b(final Context context) {
        final DefaultAudioSink$e defaultAudioSink$e = new DefaultAudioSink$e();
        final Intent registerReceiver = context.registerReceiver((BroadcastReceiver)null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
        final int a = c0.a;
        final int n = 1;
        boolean b = false;
        Label_0071: {
            if (a >= 17) {
                final String c = c0.c;
                if ("Amazon".equals(c) || "Xiaomi".equals(c)) {
                    b = true;
                    break Label_0071;
                }
            }
            b = false;
        }
        ya.e a2 = null;
        Label_0208: {
            if (b && Settings$Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
                a2 = ya.e.d;
            }
            else {
                Label_0156: {
                    if (a >= 29) {
                        if (!c0.I(context)) {
                            int n2;
                            if (a >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                                n2 = n;
                            }
                            else {
                                n2 = 0;
                            }
                            if (n2 == 0) {
                                break Label_0156;
                            }
                        }
                        a2 = new ya.e(e$a.a(), 8);
                        break Label_0208;
                    }
                }
                if (registerReceiver != null && registerReceiver.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 0) {
                    a2 = new ya.e(registerReceiver.getIntArrayExtra("android.media.extra.ENCODINGS"), registerReceiver.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
                }
                else {
                    a2 = ya.e.c;
                }
            }
        }
        a2.getClass();
        defaultAudioSink$e.a = a2;
        defaultAudioSink$e.c = false;
        defaultAudioSink$e.d = false;
        defaultAudioSink$e.e = 0;
        if (defaultAudioSink$e.b == null) {
            defaultAudioSink$e.b = (DefaultAudioSink$c)new DefaultAudioSink.g(new AudioProcessor[0]);
        }
        return new DefaultAudioSink(defaultAudioSink$e);
    }
}
