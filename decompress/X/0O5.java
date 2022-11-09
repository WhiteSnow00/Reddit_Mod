// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import java.util.TimerTask;
import java.util.Map;
import android.os.Build;
import android.os.Build$VERSION;
import java.util.HashMap;
import android.text.TextUtils;
import org.json.JSONObject;
import com.bytedance.covode.number.Covode;

public final class 0O5
{
    public final 0O6 LIZ;
    public boolean LIZIZ;
    public int LIZJ;
    public long LIZLLL;
    public 0O8 LJ;
    public int LJFF;
    public long LJI;
    
    static {
        Covode.recordClassIndex(3940);
    }
    
    public 0O5(final 0O6 liz) {
        this.LJFF = 10;
        this.LIZ = liz;
    }
    
    public final 0O5 LIZ(final long lji) {
        if (lji < 1L) {
            return this;
        }
        this.LJI = lji;
        return this;
    }
    
    public final void LIZ(final String s, final String s2) {
        public final class 1CU implements a
        {
            public final /* synthetic */ String LIZ;
            public final /* synthetic */ String LIZIZ;
            public final /* synthetic */ 0O5 LIZJ;
            
            static {
                Covode.recordClassIndex(3941);
            }
            
            public 1CU(final 0O5 lizj, final String liz, final String liziz) {
                this.LIZJ = lizj;
                this.LIZ = liz;
                this.LIZIZ = liziz;
            }
            
            @Override
            public final void LIZ(final JSONObject jsonObject, final Error error) {
                if (error != null) {
                    this.LIZJ.LIZIZ(this.LIZ, this.LIZIZ);
                    return;
                }
                if (jsonObject == null) {
                    this.LIZJ.LIZIZ(this.LIZ, this.LIZIZ);
                    return;
                }
                System.currentTimeMillis();
                final JSONObject optJSONObject = jsonObject.optJSONObject("data");
                if (this.LIZJ.LIZ != null) {
                    final 0O6 liz = this.LIZJ.LIZ;
                    final int optInt = jsonObject.optInt("code");
                    jsonObject.optString("msg");
                    liz.LIZ(optInt, optJSONObject, this.LIZ, this.LIZIZ);
                }
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        X/0O5.LIZLLL:J
        //     4: lstore_3       
        //     5: lload_3        
        //     6: ldc2_w          9223372036854775807
        //     9: lcmp           
        //    10: iflt            44
        //    13: aload_0        
        //    14: lconst_1       
        //    15: putfield        X/0O5.LIZLLL:J
        //    18: aload_0        
        //    19: getfield        X/0O5.LJ:LX/0O8;
        //    22: ifnonnull       54
        //    25: aload_0        
        //    26: getfield        X/0O5.LIZ:LX/0O6;
        //    29: astore_1       
        //    30: aload_1        
        //    31: ifnull          43
        //    34: aload_1        
        //    35: sipush          -996
        //    38: invokeinterface X/0O6.LIZ:(I)V
        //    43: return         
        //    44: aload_0        
        //    45: lload_3        
        //    46: lconst_1       
        //    47: ladd           
        //    48: putfield        X/0O5.LIZLLL:J
        //    51: goto            18
        //    54: getstatic       X/0O3.LJII:Ljava/lang/String;
        //    57: astore          5
        //    59: aload           5
        //    61: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    64: ifeq            97
        //    67: aconst_null    
        //    68: astore          6
        //    70: aload           6
        //    72: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    75: ifeq            159
        //    78: aload_0        
        //    79: getfield        X/0O5.LIZ:LX/0O6;
        //    82: astore_1       
        //    83: aload_1        
        //    84: ifnull          96
        //    87: aload_1        
        //    88: sipush          -998
        //    91: invokeinterface X/0O6.LIZ:(I)V
        //    96: return         
        //    97: getstatic       X/0O3.LJI:Ljava/lang/String;
        //   100: astore          6
        //   102: aload           5
        //   104: getstatic       X/0O3.LIZIZ:Ljava/lang/String;
        //   107: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   110: ifeq            121
        //   113: getstatic       X/0O3.LJ:Ljava/lang/String;
        //   116: astore          6
        //   118: goto            70
        //   121: aload           5
        //   123: getstatic       X/0O3.LIZJ:Ljava/lang/String;
        //   126: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   129: ifeq            140
        //   132: getstatic       X/0O3.LJFF:Ljava/lang/String;
        //   135: astore          6
        //   137: goto            70
        //   140: aload           5
        //   142: getstatic       X/0O3.LIZ:Ljava/lang/String;
        //   145: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   148: ifeq            70
        //   151: getstatic       X/0O3.LJI:Ljava/lang/String;
        //   154: astore          6
        //   156: goto            70
        //   159: aload_0        
        //   160: aload_0        
        //   161: getfield        X/0O5.LIZJ:I
        //   164: iconst_1       
        //   165: iadd           
        //   166: putfield        X/0O5.LIZJ:I
        //   169: new             Ljava/util/HashMap;
        //   172: dup            
        //   173: invokespecial   java/util/HashMap.<init>:()V
        //   176: astore          5
        //   178: aload           5
        //   180: ldc             "caller_name"
        //   182: ldc             "VideoCloud"
        //   184: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   187: pop            
        //   188: aload           5
        //   190: ldc             "device_platform"
        //   192: ldc             "android"
        //   194: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   197: pop            
        //   198: aload           5
        //   200: ldc             "os_version"
        //   202: getstatic       android/os/Build$VERSION.RELEASE:Ljava/lang/String;
        //   205: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   208: pop            
        //   209: aload           5
        //   211: ldc             "os_api"
        //   213: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   216: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //   219: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   222: pop            
        //   223: new             Ljava/lang/StringBuilder;
        //   226: dup            
        //   227: invokespecial   java/lang/StringBuilder.<init>:()V
        //   230: astore          7
        //   232: aload           7
        //   234: aload_0        
        //   235: getfield        X/0O5.LJI:J
        //   238: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   241: pop            
        //   242: aload           5
        //   244: ldc             "config_version"
        //   246: aload           7
        //   248: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   251: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   254: pop            
        //   255: aload           5
        //   257: ldc             "device_brand"
        //   259: invokevirtual   java/util/HashMap.containsKey:(Ljava/lang/Object;)Z
        //   262: ifne            276
        //   265: aload           5
        //   267: ldc             "device_brand"
        //   269: getstatic       android/os/Build.BRAND:Ljava/lang/String;
        //   272: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   275: pop            
        //   276: aload           5
        //   278: ldc             "device_type"
        //   280: invokevirtual   java/util/HashMap.containsKey:(Ljava/lang/Object;)Z
        //   283: ifne            300
        //   286: aload           5
        //   288: ldc             "device_type"
        //   290: getstatic       android/os/Build.MODEL:Ljava/lang/String;
        //   293: invokevirtual   java/lang/String.toLowerCase:()Ljava/lang/String;
        //   296: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   299: pop            
        //   300: aload_1        
        //   301: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   304: ifne            325
        //   307: aload_1        
        //   308: ldc             "all"
        //   310: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   313: ifne            325
        //   316: aload           5
        //   318: ldc             "module"
        //   320: aload_1        
        //   321: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   324: pop            
        //   325: aload_0        
        //   326: getfield        X/0O5.LIZIZ:Z
        //   329: ifeq            342
        //   332: aload           5
        //   334: ldc             "debug"
        //   336: ldc             "1"
        //   338: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   341: pop            
        //   342: aload_2        
        //   343: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   346: ifne            358
        //   349: aload           5
        //   351: ldc             "config_key"
        //   353: aload_2        
        //   354: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   357: pop            
        //   358: invokestatic    X/0O3.LIZ:()Ljava/util/Map;
        //   361: ifnull          372
        //   364: aload           5
        //   366: invokestatic    X/0O3.LIZ:()Ljava/util/Map;
        //   369: invokevirtual   java/util/HashMap.putAll:(Ljava/util/Map;)V
        //   372: invokestatic    X/0O3.LIZIZ:()Ljava/util/Map;
        //   375: ifnull          386
        //   378: aload           5
        //   380: invokestatic    X/0O3.LIZIZ:()Ljava/util/Map;
        //   383: invokevirtual   java/util/HashMap.putAll:(Ljava/util/Map;)V
        //   386: new             Ljava/lang/StringBuilder;
        //   389: dup            
        //   390: ldc             "https://"
        //   392: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   395: astore          7
        //   397: aload           7
        //   399: aload           6
        //   401: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   404: pop            
        //   405: aload           7
        //   407: getstatic       X/0O3.LIZLLL:Ljava/lang/String;
        //   410: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   413: pop            
        //   414: aload           7
        //   416: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   419: astore          6
        //   421: aload_0        
        //   422: getfield        X/0O5.LJ:LX/0O8;
        //   425: aload           6
        //   427: aload           5
        //   429: new             LX/1CU;
        //   432: dup            
        //   433: aload_0        
        //   434: aload_1        
        //   435: aload_2        
        //   436: invokespecial   X/1CU.<init>:(LX/0O5;Ljava/lang/String;Ljava/lang/String;)V
        //   439: invokevirtual   X/0O8.LIZ:(Ljava/lang/String;Ljava/util/Map;LX/0O7;)V
        //   442: return         
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
    
    public final void LIZIZ(final String s, final String s2) {
        public final class 0O4 extends TimerTask
        {
            public final /* synthetic */ String LIZ;
            public final /* synthetic */ String LIZIZ;
            public final /* synthetic */ 0O5 LIZJ;
            
            static {
                Covode.recordClassIndex(3942);
            }
            
            public 0O4(final 0O5 lizj, final String liz, final String liziz) {
                this.LIZJ = lizj;
                this.LIZ = liz;
                this.LIZIZ = liziz;
            }
            
            @Override
            public final void run() {
                this.LIZJ.LIZ(this.LIZ, this.LIZIZ);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        X/0O5.LIZJ:I
        //     4: aload_0        
        //     5: getfield        X/0O5.LJFF:I
        //     8: if_icmple       35
        //    11: aload_0        
        //    12: getfield        X/0O5.LIZ:LX/0O6;
        //    15: astore_1       
        //    16: aload_1        
        //    17: ifnull          29
        //    20: aload_1        
        //    21: sipush          -999
        //    24: invokeinterface X/0O6.LIZ:(I)V
        //    29: aload_0        
        //    30: iconst_0       
        //    31: putfield        X/0O5.LIZJ:I
        //    34: return         
        //    35: new             Lcom/ss/android/ugc/bytex/pthread/base/proxy/PthreadTimer;
        //    38: dup            
        //    39: ldc             "tting/Fetcher"
        //    41: invokespecial   com/ss/android/ugc/bytex/pthread/base/proxy/PthreadTimer.<init>:(Ljava/lang/String;)V
        //    44: new             LX/0O4;
        //    47: dup            
        //    48: aload_0        
        //    49: aload_1        
        //    50: aload_2        
        //    51: invokespecial   X/0O4.<init>:(LX/0O5;Ljava/lang/String;Ljava/lang/String;)V
        //    54: ldc2_w          5000
        //    57: invokevirtual   java/util/Timer.schedule:(Ljava/util/TimerTask;J)V
        //    60: return         
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
}
