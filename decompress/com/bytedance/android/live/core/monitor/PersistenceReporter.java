// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.core.monitor;

import com.google.gson.a.c;
import com.google.gson.Gson;
import X.0cB;
import X.0ba;
import X.2P9;
import X.SRT;
import android.os.Message;
import X.CTM;
import java.util.Map;
import X.2w5;
import X.2Nf;
import com.ss.avframework.livestreamv2.utils.JsonUtils;
import android.os.Handler;
import X.0d8;
import X.F1j;
import X.F1k;
import org.json.JSONObject;
import kotlin.jvm.internal.n;
import X.QgG;
import X.3Os;
import X.1sd;
import java.util.concurrent.ConcurrentHashMap;
import com.bytedance.covode.number.Covode;
import android.os.HandlerThread;
import X.5DO;
import com.bytedance.keva.Keva;
import X.0d5;

public final class PersistenceReporter implements 0d5
{
    public static final Keva LJII;
    public static final 5DO LJIIIIZZ;
    public static final Companion LJIIIZ;
    public long LIZ;
    public long LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public long LJ;
    public final Keva LJFF;
    public final HandlerThread LJI;
    public final 5DO LJIIJ;
    public final String LJIIJJI;
    
    static {
        Covode.recordClassIndex(5773);
        LJIIIZ = new Companion((byte)0);
        new ConcurrentHashMap();
        LJII = Keva.getRepo("PersistenceReporter-config");
        LJIIIIZZ = 3Os.LIZ((QgG)1sd.LIZ);
    }
    
    public PersistenceReporter(final String ljiijji) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   java/lang/Object.<init>:()V
        //     4: aload_0        
        //     5: aload_1        
        //     6: putfield        com/bytedance/android/live/core/monitor/PersistenceReporter.LJIIJJI:Ljava/lang/String;
        //     9: aload_0        
        //    10: ldc2_w          300000
        //    13: putfield        com/bytedance/android/live/core/monitor/PersistenceReporter.LIZ:J
        //    16: aload_0        
        //    17: ldc2_w          2048
        //    20: putfield        com/bytedance/android/live/core/monitor/PersistenceReporter.LIZIZ:J
        //    23: aload_0        
        //    24: ldc2_w          9223372036854775807
        //    27: putfield        com/bytedance/android/live/core/monitor/PersistenceReporter.LIZJ:J
        //    30: aload_0        
        //    31: ldc2_w          -1
        //    34: putfield        com/bytedance/android/live/core/monitor/PersistenceReporter.LJ:J
        //    37: aload_0        
        //    38: aload_1        
        //    39: invokestatic    com/bytedance/keva/Keva.getRepo:(Ljava/lang/String;)Lcom/bytedance/keva/Keva;
        //    42: putfield        com/bytedance/android/live/core/monitor/PersistenceReporter.LJFF:Lcom/bytedance/keva/Keva;
        //    45: new             Ljava/lang/StringBuilder;
        //    48: dup            
        //    49: ldc             "PersistenceReporter-"
        //    51: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //    54: astore_2       
        //    55: aload_2        
        //    56: aload_1        
        //    57: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    60: pop            
        //    61: new             Landroid/os/HandlerThread;
        //    64: dup            
        //    65: aload_2        
        //    66: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    69: invokespecial   android/os/HandlerThread.<init>:(Ljava/lang/String;)V
        //    72: astore_1       
        //    73: aload_0        
        //    74: aload_1        
        //    75: putfield        com/bytedance/android/live/core/monitor/PersistenceReporter.LJI:Landroid/os/HandlerThread;
        //    78: aload_0        
        //    79: new             LX/1se;
        //    82: dup            
        //    83: aload_0        
        //    84: invokespecial   X/1se.<init>:(Lcom/bytedance/android/live/core/monitor/PersistenceReporter;)V
        //    87: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    90: putfield        com/bytedance/android/live/core/monitor/PersistenceReporter.LJIIJ:LX/5DO;
        //    93: aload_1        
        //    94: invokevirtual   android/os/HandlerThread.start:()V
        //    97: aload_0        
        //    98: invokevirtual   com/bytedance/android/live/core/monitor/PersistenceReporter.LIZIZ:()V
        //   101: aload_0        
        //   102: getfield        com/bytedance/android/live/core/monitor/PersistenceReporter.LIZLLL:J
        //   105: lconst_0       
        //   106: lcmp           
        //   107: iflt            125
        //   110: aload_0        
        //   111: invokespecial   com/bytedance/android/live/core/monitor/PersistenceReporter.LIZJ:()Landroid/os/Handler;
        //   114: sipush          10004
        //   117: aload_0        
        //   118: getfield        com/bytedance/android/live/core/monitor/PersistenceReporter.LIZLLL:J
        //   121: invokevirtual   android/os/Handler.sendEmptyMessageDelayed:(IJ)Z
        //   124: pop            
        //   125: aload_0        
        //   126: invokespecial   com/bytedance/android/live/core/monitor/PersistenceReporter.LIZJ:()Landroid/os/Handler;
        //   129: new             Lcom/bytedance/android/live/core/monitor/PersistenceReporter$1;
        //   132: dup            
        //   133: aload_0        
        //   134: invokespecial   com/bytedance/android/live/core/monitor/PersistenceReporter$1.<init>:(Lcom/bytedance/android/live/core/monitor/PersistenceReporter;)V
        //   137: ldc2_w          5000
        //   140: invokevirtual   android/os/Handler.postDelayed:(Ljava/lang/Runnable;J)Z
        //   143: pop            
        //   144: return         
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
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:548)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:534)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:377)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:213)
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
    
    private final void LIZ(final InnerRecord innerRecord, final boolean b) {
        if (innerRecord.getValue().length() != 0) {
            if (!n.LIZ((Object)innerRecord.getValue(), (Object)"{}")) {
                Object liz = null;
                try {
                    F1k.constructor-impl((Object)new JSONObject(innerRecord.getValue()));
                }
                finally {
                    final Throwable t;
                    liz = F1j.LIZ(t);
                    F1k.constructor-impl(liz);
                }
                Object o = liz;
                if (F1k.isFailure-impl(liz)) {
                    o = null;
                }
                final JSONObject jsonObject = (JSONObject)o;
                if (b && jsonObject != null) {
                    final StringBuilder sb = new StringBuilder("{expire:1,time:");
                    sb.append(this.LJ);
                    sb.append('}');
                    jsonObject.put("expire_info", (Object)new JSONObject(sb.toString()));
                }
                if (innerRecord.getStartID() != PersistenceReporter.LJIIIZ.LIZ() && innerRecord.getStatus() != 0) {
                    if (jsonObject == null) {
                        return;
                    }
                    jsonObject.put("app_killed", true);
                }
                else if (jsonObject == null) {
                    return;
                }
                0d8.LIZ(this.LJIIJJI, innerRecord.getStatus(), jsonObject);
            }
        }
    }
    
    private final Handler LIZJ() {
        return (Handler)this.LJIIJ.getValue();
    }
    
    private final String LIZJ(String string, final String s) {
        final JSONObject jsonObject = new JSONObject(string);
        JsonUtils.mergeJson(jsonObject, new JSONObject(s));
        string = jsonObject.toString();
        n.LIZIZ((Object)string, "");
        return string;
    }
    
    public static boolean LIZLLL() {
        try {
            return 2Nf.LIZ.LIZIZ();
        }
        catch (final Exception ex) {
            return false;
        }
    }
    
    private final void LJ() {
        this.LIZJ().sendEmptyMessage(10005);
    }
    
    public final void LIZ() {
        public final class 0cx implements Runnable
        {
            public final /* synthetic */ PersistenceReporter LIZ;
            
            static {
                Covode.recordClassIndex(5779);
            }
            
            public 0cx(final PersistenceReporter liz) {
                this.LIZ = liz;
            }
            
            @Override
            public final void run() {
                this.LIZ.LIZ();
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/bytedance/android/live/core/monitor/PersistenceReporter.LJFF:Lcom/bytedance/keva/Keva;
        //     4: astore_1       
        //     5: aload_1        
        //     6: ldc             ""
        //     8: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    11: aload_1        
        //    12: invokevirtual   com/bytedance/keva/Keva.getAll:()Ljava/util/Map;
        //    15: astore_2       
        //    16: aload_2        
        //    17: invokeinterface java/util/Map.isEmpty:()Z
        //    22: ifeq            26
        //    25: return         
        //    26: new             LX/2w5;
        //    29: dup            
        //    30: invokespecial   X/2w5.<init>:()V
        //    33: astore_1       
        //    34: aload_1        
        //    35: iconst_0       
        //    36: putfield        X/2w5.element:I
        //    39: aload_2        
        //    40: ldc             ""
        //    42: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    45: aload_2        
        //    46: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //    51: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //    56: astore_2       
        //    57: aload_2        
        //    58: invokeinterface java/util/Iterator.hasNext:()Z
        //    63: ifeq            357
        //    66: aload_2        
        //    67: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    72: checkcast       Ljava/util/Map$Entry;
        //    75: astore_3       
        //    76: aload_1        
        //    77: getfield        X/2w5.element:I
        //    80: bipush          10
        //    82: if_icmplt       105
        //    85: aload_0        
        //    86: invokespecial   com/bytedance/android/live/core/monitor/PersistenceReporter.LIZJ:()Landroid/os/Handler;
        //    89: new             LX/0cx;
        //    92: dup            
        //    93: aload_0        
        //    94: invokespecial   X/0cx.<init>:(Lcom/bytedance/android/live/core/monitor/PersistenceReporter;)V
        //    97: ldc2_w          5000
        //   100: invokevirtual   android/os/Handler.postDelayed:(Ljava/lang/Runnable;J)Z
        //   103: pop            
        //   104: return         
        //   105: invokestatic    X/0cB.LJ:()Landroid/content/Context;
        //   108: pop            
        //   109: invokestatic    com/bytedance/android/live/core/monitor/PersistenceReporter.LIZLLL:()Z
        //   112: ifne            116
        //   115: return         
        //   116: aload_3        
        //   117: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   122: instanceof      Ljava/lang/String;
        //   125: ifeq            57
        //   128: aload_3        
        //   129: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   134: astore          4
        //   136: aload           4
        //   138: ldc             ""
        //   140: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   143: aload_0        
        //   144: aload           4
        //   146: checkcast       Ljava/lang/String;
        //   149: aload_3        
        //   150: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   155: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   158: invokevirtual   com/bytedance/android/live/core/monitor/PersistenceReporter.LIZIZ:(Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/android/live/core/monitor/PersistenceReporter$Companion$InnerRecord;
        //   161: astore          4
        //   163: aload           4
        //   165: ifnonnull       171
        //   168: goto            57
        //   171: invokestatic    java/lang/System.currentTimeMillis:()J
        //   174: lstore          5
        //   176: aload           4
        //   178: invokevirtual   com/bytedance/android/live/core/monitor/PersistenceReporter$Companion$InnerRecord.getCreateTimeStamp:()J
        //   181: lload           5
        //   183: lcmp           
        //   184: ifle            206
        //   187: aload_0        
        //   188: getfield        com/bytedance/android/live/core/monitor/PersistenceReporter.LJFF:Lcom/bytedance/keva/Keva;
        //   191: aload_3        
        //   192: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   197: checkcast       Ljava/lang/String;
        //   200: invokevirtual   com/bytedance/keva/Keva.erase:(Ljava/lang/String;)V
        //   203: goto            57
        //   206: lload           5
        //   208: aload           4
        //   210: invokevirtual   com/bytedance/android/live/core/monitor/PersistenceReporter$Companion$InnerRecord.getCreateTimeStamp:()J
        //   213: lsub           
        //   214: invokestatic    java/lang/Math.abs:(J)J
        //   217: aload_0        
        //   218: getfield        com/bytedance/android/live/core/monitor/PersistenceReporter.LIZJ:J
        //   221: lcmp           
        //   222: ifle            244
        //   225: aload_0        
        //   226: getfield        com/bytedance/android/live/core/monitor/PersistenceReporter.LJFF:Lcom/bytedance/keva/Keva;
        //   229: aload_3        
        //   230: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   235: checkcast       Ljava/lang/String;
        //   238: invokevirtual   com/bytedance/keva/Keva.erase:(Ljava/lang/String;)V
        //   241: goto            57
        //   244: aload           4
        //   246: invokevirtual   com/bytedance/android/live/core/monitor/PersistenceReporter$Companion$InnerRecord.getStartID:()J
        //   249: getstatic       com/bytedance/android/live/core/monitor/PersistenceReporter.LJIIIZ:Lcom/bytedance/android/live/core/monitor/PersistenceReporter$Companion;
        //   252: invokevirtual   com/bytedance/android/live/core/monitor/PersistenceReporter$Companion.LIZ:()J
        //   255: lcmp           
        //   256: ifeq            293
        //   259: aload           4
        //   261: invokevirtual   com/bytedance/android/live/core/monitor/PersistenceReporter$Companion$InnerRecord.getDiscardWhenNextBoot:()Z
        //   264: ifne            274
        //   267: aload_0        
        //   268: aload           4
        //   270: iconst_0       
        //   271: invokespecial   com/bytedance/android/live/core/monitor/PersistenceReporter.LIZ:(Lcom/bytedance/android/live/core/monitor/PersistenceReporter$Companion$InnerRecord;Z)V
        //   274: aload_0        
        //   275: getfield        com/bytedance/android/live/core/monitor/PersistenceReporter.LJFF:Lcom/bytedance/keva/Keva;
        //   278: aload_3        
        //   279: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   284: checkcast       Ljava/lang/String;
        //   287: invokevirtual   com/bytedance/keva/Keva.erase:(Ljava/lang/String;)V
        //   290: goto            57
        //   293: aload_0        
        //   294: getfield        com/bytedance/android/live/core/monitor/PersistenceReporter.LJ:J
        //   297: lconst_0       
        //   298: lcmp           
        //   299: ifle            57
        //   302: lload           5
        //   304: aload           4
        //   306: invokevirtual   com/bytedance/android/live/core/monitor/PersistenceReporter$Companion$InnerRecord.getCreateTimeStamp:()J
        //   309: lsub           
        //   310: invokestatic    java/lang/Math.abs:(J)J
        //   313: aload_0        
        //   314: getfield        com/bytedance/android/live/core/monitor/PersistenceReporter.LJ:J
        //   317: lcmp           
        //   318: ifle            57
        //   321: aload_0        
        //   322: aload           4
        //   324: iconst_0       
        //   325: invokespecial   com/bytedance/android/live/core/monitor/PersistenceReporter.LIZ:(Lcom/bytedance/android/live/core/monitor/PersistenceReporter$Companion$InnerRecord;Z)V
        //   328: aload_1        
        //   329: aload_1        
        //   330: getfield        X/2w5.element:I
        //   333: iconst_1       
        //   334: iadd           
        //   335: putfield        X/2w5.element:I
        //   338: aload_0        
        //   339: getfield        com/bytedance/android/live/core/monitor/PersistenceReporter.LJFF:Lcom/bytedance/keva/Keva;
        //   342: aload_3        
        //   343: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   348: checkcast       Ljava/lang/String;
        //   351: invokevirtual   com/bytedance/keva/Keva.erase:(Ljava/lang/String;)V
        //   354: goto            57
        //   357: return         
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
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:425)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:410)
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
    
    @Override
    public final void LIZ(final String obj) {
        CTM.LIZ((Object)obj);
        final Message obtain = Message.obtain();
        obtain.what = 10002;
        obtain.obj = obj;
        this.LIZJ().sendMessage(obtain);
    }
    
    public final void LIZ(final String obj, final long n) {
        if (n > 0L) {
            final Message obtain = Message.obtain();
            obtain.what = 10001;
            obtain.obj = obj;
            this.LIZJ().sendMessageDelayed(obtain, n);
        }
    }
    
    @Override
    public final void LIZ(final String s, final SRT<? super String, ? super Long, 2P9> srt) {
        public final class 0cy implements Runnable
        {
            public final /* synthetic */ PersistenceReporter LIZ;
            public final /* synthetic */ String LIZIZ;
            public final /* synthetic */ SRT LIZJ;
            
            static {
                Covode.recordClassIndex(5780);
            }
            
            public 0cy(final PersistenceReporter liz, final String liziz, final SRT lizj) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
                this.LIZJ = lizj;
            }
            
            @Override
            public final void run() {
                final String string = this.LIZ.LJFF.getString(this.LIZIZ, "{}");
                final PersistenceReporter liz = this.LIZ;
                final String liziz = this.LIZIZ;
                n.LIZIZ((Object)string, "");
                Object liziz2;
                if ((liziz2 = liz.LIZIZ(liziz, string)) == null) {
                    liziz2 = new InnerRecord();
                }
                Object liz2 = null;
                try {
                    this.LIZJ.invoke((Object)((InnerRecord)liziz2).getValue(), (Object)((InnerRecord)liziz2).getCreateTimeStamp());
                    F1k.constructor-impl((Object)2P9.LIZ);
                }
                finally {
                    final Throwable t;
                    liz2 = F1j.LIZ(t);
                    F1k.constructor-impl(liz2);
                }
                final Throwable exceptionOrNull-impl = F1k.exceptionOrNull-impl(liz2);
                if (exceptionOrNull-impl != null) {
                    0ba.LIZ(6, "PersistenceReporter", exceptionOrNull-impl.getMessage());
                }
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_2        
        //     2: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;Ljava/lang/Object;)V
        //     5: aload_0        
        //     6: invokespecial   com/bytedance/android/live/core/monitor/PersistenceReporter.LIZJ:()Landroid/os/Handler;
        //     9: new             LX/0cy;
        //    12: dup            
        //    13: aload_0        
        //    14: aload_1        
        //    15: aload_2        
        //    16: invokespecial   X/0cy.<init>:(Lcom/bytedance/android/live/core/monitor/PersistenceReporter;Ljava/lang/String;LX/SRT;)V
        //    19: invokevirtual   android/os/Handler.post:(Ljava/lang/Runnable;)Z
        //    22: pop            
        //    23: return         
        //    Signature:
        //  (Ljava/lang/String;LX/SRT<-Ljava/lang/String;-Ljava/lang/Long;LX/2P9;>;)V
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
    
    @Override
    public final void LIZ(final String s, final String s2) {
        public final class 0d1 implements Runnable
        {
            public final /* synthetic */ PersistenceReporter LIZ;
            public final /* synthetic */ String LIZIZ;
            public final /* synthetic */ String LIZJ;
            
            static {
                Covode.recordClassIndex(5784);
            }
            
            public 0d1(final PersistenceReporter liz, final String liziz, final String lizj) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
                this.LIZJ = lizj;
            }
            
            @Override
            public final void run() {
                final String string = this.LIZ.LJFF.getString(this.LIZIZ, "");
                n.LIZIZ((Object)string, "");
                if (string.length() > 0) {
                    this.LIZ.LJFF.storeString(this.LIZJ, string);
                    this.LIZ.LJFF.erase(this.LIZIZ);
                    if (this.LIZ.LJ > 0L) {
                        final PersistenceReporter liz = this.LIZ;
                        liz.LIZ(this.LIZJ, liz.LJ);
                    }
                }
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_2        
        //     2: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;Ljava/lang/Object;)V
        //     5: aload_0        
        //     6: invokespecial   com/bytedance/android/live/core/monitor/PersistenceReporter.LIZJ:()Landroid/os/Handler;
        //     9: new             LX/0d1;
        //    12: dup            
        //    13: aload_0        
        //    14: aload_1        
        //    15: aload_2        
        //    16: invokespecial   X/0d1.<init>:(Lcom/bytedance/android/live/core/monitor/PersistenceReporter;Ljava/lang/String;Ljava/lang/String;)V
        //    19: invokevirtual   android/os/Handler.post:(Ljava/lang/Runnable;)Z
        //    22: pop            
        //    23: return         
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
    
    public final void LIZ(final String s, final boolean b) {
        if (s.length() == 0 || !this.LJFF.contains(s)) {
            0ba.LIZ(3, "PersistenceReporter", "report specific record id empty  recordId =".concat(String.valueOf(s)));
            return;
        }
        0cB.LJ();
        if (!LIZLLL()) {
            return;
        }
        final String string = this.LJFF.getString(s, "{}");
        n.LIZIZ((Object)string, "");
        final InnerRecord liziz = this.LIZIZ(s, string);
        if (liziz == null) {
            return;
        }
        if (b) {
            liziz.setStatus(1);
        }
        this.LIZ(liziz, b);
        this.LJFF.erase(s);
    }
    
    @Override
    public final boolean LIZ(final String s, final String s2, final boolean b, final boolean b2, final long n, final boolean b3) {
        public final class 0d2 implements Runnable
        {
            public final /* synthetic */ PersistenceReporter LIZ;
            public final /* synthetic */ String LIZIZ;
            public final /* synthetic */ String LIZJ;
            public final /* synthetic */ boolean LIZLLL;
            public final /* synthetic */ boolean LJ;
            public final /* synthetic */ long LJFF;
            public final /* synthetic */ boolean LJI;
            
            static {
                Covode.recordClassIndex(5785);
            }
            
            public 0d2(final PersistenceReporter liz, final String liziz, final String lizj, final boolean lizlll, final boolean lj, final long ljff, final boolean lji) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
                this.LIZJ = lizj;
                this.LIZLLL = lizlll;
                this.LJ = lj;
                this.LJFF = ljff;
                this.LJI = lji;
            }
            
            @Override
            public final void run() {
                this.LIZ.LIZIZ(this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_2        
        //     2: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;Ljava/lang/Object;)V
        //     5: aload_1        
        //     6: invokeinterface java/lang/CharSequence.length:()I
        //    11: ifne            16
        //    14: iconst_0       
        //    15: ireturn        
        //    16: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //    19: astore          8
        //    21: aload           8
        //    23: ldc             ""
        //    25: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    28: aload           8
        //    30: invokevirtual   java/lang/Thread.getId:()J
        //    33: aload_0        
        //    34: getfield        com/bytedance/android/live/core/monitor/PersistenceReporter.LJI:Landroid/os/HandlerThread;
        //    37: invokevirtual   android/os/HandlerThread.getId:()J
        //    40: lcmp           
        //    41: ifeq            71
        //    44: aload_0        
        //    45: invokespecial   com/bytedance/android/live/core/monitor/PersistenceReporter.LIZJ:()Landroid/os/Handler;
        //    48: new             LX/0d2;
        //    51: dup            
        //    52: aload_0        
        //    53: aload_1        
        //    54: aload_2        
        //    55: iload_3        
        //    56: iload           4
        //    58: lload           5
        //    60: iload           7
        //    62: invokespecial   X/0d2.<init>:(Lcom/bytedance/android/live/core/monitor/PersistenceReporter;Ljava/lang/String;Ljava/lang/String;ZZJZ)V
        //    65: invokevirtual   android/os/Handler.post:(Ljava/lang/Runnable;)Z
        //    68: pop            
        //    69: iconst_1       
        //    70: ireturn        
        //    71: aload_0        
        //    72: aload_1        
        //    73: aload_2        
        //    74: iload_3        
        //    75: iload           4
        //    77: lload           5
        //    79: iload           7
        //    81: invokevirtual   com/bytedance/android/live/core/monitor/PersistenceReporter.LIZIZ:(Ljava/lang/String;Ljava/lang/String;ZZJZ)V
        //    84: goto            69
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
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:425)
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
    
    public final InnerRecord LIZIZ(final String s, final String s2) {
        Object liz = null;
        try {
            F1k.constructor-impl((Object)new Gson().LIZ(s2, (Class)InnerRecord.class));
        }
        finally {
            final Throwable t;
            liz = F1j.LIZ(t);
            F1k.constructor-impl(liz);
        }
        Object o = liz;
        if (F1k.isFailure-impl(liz)) {
            o = null;
        }
        final InnerRecord innerRecord = (InnerRecord)o;
        if (innerRecord == null) {
            this.LJFF.erase(s);
        }
        return innerRecord;
    }
    
    public final void LIZIZ() {
        this.LIZJ().sendEmptyMessageDelayed(10000, this.LIZ);
    }
    
    @Override
    public final void LIZIZ(final String s) {
        public final class 0d0 implements Runnable
        {
            public final /* synthetic */ PersistenceReporter LIZ;
            public final /* synthetic */ String LIZIZ;
            
            static {
                Covode.recordClassIndex(5783);
            }
            
            public 0d0(final PersistenceReporter liz, final String liziz) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
            }
            
            @Override
            public final void run() {
                this.LIZ.LJFF.erase(this.LIZIZ);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: aload_0        
        //     5: invokespecial   com/bytedance/android/live/core/monitor/PersistenceReporter.LIZJ:()Landroid/os/Handler;
        //     8: new             LX/0d0;
        //    11: dup            
        //    12: aload_0        
        //    13: aload_1        
        //    14: invokespecial   X/0d0.<init>:(Lcom/bytedance/android/live/core/monitor/PersistenceReporter;Ljava/lang/String;)V
        //    17: invokevirtual   android/os/Handler.post:(Ljava/lang/Runnable;)Z
        //    20: pop            
        //    21: return         
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
    
    public final void LIZIZ(final String s, final String s2, final boolean b, final boolean b2, final long n, final boolean b3) {
        final StringBuilder sb = new StringBuilder("updateValue,recordId =");
        sb.append(s);
        sb.append(",isEnd =");
        sb.append(b);
        sb.append(" jsonString length = ");
        sb.append(s2.length());
        0ba.LIZ(3, "PersistenceReporter", sb.toString());
        InnerRecord liziz;
        if (!this.LJFF.contains(s)) {
            liziz = new InnerRecord();
            this.LIZ(s, n);
            this.LJ();
        }
        else {
            final String string = this.LJFF.getString(s, "{}");
            n.LIZIZ((Object)string, "");
            if ((liziz = this.LIZIZ(s, string)) == null) {
                liziz = new InnerRecord();
            }
        }
        if (liziz.getStatus() != 0) {
            if (b3) {
                liziz.setDiscardWhenNextBoot(true);
            }
            String lizj = s2;
            if (b2) {
                lizj = this.LIZJ(liziz.getValue(), s2);
            }
            liziz.setValue(lizj);
            liziz.setStatus((b ^ true) ? 1 : 0);
            this.LJFF.storeString(s, new Gson().LIZIZ((Object)liziz));
        }
    }
    
    public static final class Companion
    {
        static {
            Covode.recordClassIndex(5775);
        }
        
        public final long LIZ() {
            return ((Number)PersistenceReporter.LJIIIIZZ.getValue()).longValue();
        }
        
        public static final class InnerRecord
        {
            @c(LIZ = "create_time")
            public long createTimeStamp;
            @c(LIZ = "discard_next_boot")
            public boolean discardWhenNextBoot;
            @c(LIZ = "start_id")
            public long startID;
            @c(LIZ = "status")
            public int status;
            @c(LIZ = "value")
            public String value;
            
            static {
                Covode.recordClassIndex(5776);
            }
            
            public InnerRecord() {
                this.startID = PersistenceReporter.LJIIIZ.LIZ();
                this.createTimeStamp = System.currentTimeMillis();
                this.value = "{}";
                this.status = 1;
            }
            
            public final long getCreateTimeStamp() {
                return this.createTimeStamp;
            }
            
            public final boolean getDiscardWhenNextBoot() {
                return this.discardWhenNextBoot;
            }
            
            public final long getStartID() {
                return this.startID;
            }
            
            public final int getStatus() {
                return this.status;
            }
            
            public final String getValue() {
                return this.value;
            }
            
            public final void setCreateTimeStamp(final long createTimeStamp) {
                this.createTimeStamp = createTimeStamp;
            }
            
            public final void setDiscardWhenNextBoot(final boolean discardWhenNextBoot) {
                this.discardWhenNextBoot = discardWhenNextBoot;
            }
            
            public final void setStartID(final long startID) {
                this.startID = startID;
            }
            
            public final void setStatus(final int status) {
                this.status = status;
            }
            
            public final void setValue(final String value) {
                CTM.LIZ((Object)value);
                this.value = value;
            }
        }
    }
}
