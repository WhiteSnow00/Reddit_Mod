// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.live.liveinteract.cohost.remote.api.CoHostApi;
import java.util.List;
import kotlin.jvm.internal.n;
import java.util.Map;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostInviteTimeOutSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.MultiHostPerceptionEnableSetting;
import java.util.HashMap;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import webcast.api.linkmic.GetUserLinkmicStatusResponse$ResponseData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.covode.number.Covode;

public final class 0lG
{
    static {
        Covode.recordClassIndex(7336);
    }
    
    public static final void LIZ(final 0xL 0xL, final DataChannel dataChannel, final 1NX 1nx, final long ljii, final 0CH 0ch, final 0lF 0lF) {
        public final class 1On<T> implements 2d6
        {
            public final /* synthetic */ 0lF LIZ;
            
            static {
                Covode.recordClassIndex(7342);
            }
            
            public 1On(final 0lF liz) {
                this.LIZ = liz;
            }
        }
        public final class 1Om<T> implements 2d6
        {
            public final /* synthetic */ 0lF LIZ;
            
            static {
                Covode.recordClassIndex(7341);
            }
            
            public 1Om(final 0lF liz) {
                this.LIZ = liz;
            }
        }
        public final class 1Ol<T> implements 2d6
        {
            public final /* synthetic */ 0lF LIZ;
            
            static {
                Covode.recordClassIndex(7340);
            }
            
            public 1Ol(final 0lF liz) {
                this.LIZ = liz;
            }
        }
        public final class 1Ok<T> implements 2d6
        {
            public final /* synthetic */ 1NX LIZ;
            public final /* synthetic */ 1NN LIZIZ;
            public final /* synthetic */ 0lF LIZJ;
            
            static {
                Covode.recordClassIndex(7337);
            }
            
            public 1Ok(final 1NX liz, final 1NN liziz, final 0lF lizj) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
                this.LIZJ = lizj;
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_1        
        //     2: aload_2        
        //     3: aload           5
        //     5: aload           6
        //     7: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
        //    10: getstatic       X/1NN.LLFF:LX/0k5;
        //    13: invokevirtual   X/0k5.LIZ:()LX/1NN;
        //    16: astore          7
        //    18: invokestatic    X/0py.LIZIZ:()LX/0pL;
        //    21: invokevirtual   X/0pL.isMultiCoHost:()Z
        //    24: ifeq            124
        //    27: new             LX/FH6;
        //    30: dup            
        //    31: invokespecial   X/FH6.<init>:()V
        //    34: astore_0       
        //    35: invokestatic    X/0yr.LIZ:()LX/0yr;
        //    38: ldc             Lcom/bytedance/android/live/liveinteract/cohost/remote/api/CoHostApi;.class
        //    40: invokevirtual   X/0yr.LIZ:(Ljava/lang/Class;)Ljava/lang/Object;
        //    43: checkcast       Lcom/bytedance/android/live/liveinteract/cohost/remote/api/CoHostApi;
        //    46: astore_1       
        //    47: aload_1        
        //    48: ifnull          123
        //    51: aload_1        
        //    52: lload_3        
        //    53: aload_2        
        //    54: getfield        X/1NX.LIZ:Ljava/lang/String;
        //    57: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //    60: aload_2        
        //    61: getfield        X/1NX.LIZJ:Ljava/lang/String;
        //    64: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //    67: invokeinterface com/bytedance/android/live/liveinteract/cohost/remote/api/CoHostApi.getLinkMicUserStatus:(JJJ)LX/FAE;
        //    72: astore_1       
        //    73: aload_1        
        //    74: ifnull          123
        //    77: aload_1        
        //    78: new             LX/FC5;
        //    81: dup            
        //    82: invokespecial   X/FC5.<init>:()V
        //    85: invokevirtual   X/FAE.LIZ:(LX/FCC;)LX/FAE;
        //    88: astore_1       
        //    89: aload_1        
        //    90: ifnull          123
        //    93: aload_0        
        //    94: aload_1        
        //    95: new             LX/1Ok;
        //    98: dup            
        //    99: aload_2        
        //   100: aload           7
        //   102: aload           6
        //   104: invokespecial   X/1Ok.<init>:(LX/1NX;LX/1NN;LX/0lF;)V
        //   107: new             LX/1Ol;
        //   110: dup            
        //   111: aload           6
        //   113: invokespecial   X/1Ol.<init>:(LX/0lF;)V
        //   116: invokevirtual   X/FAE.LIZ:(LX/2d6;LX/2d6;)LX/2fc;
        //   119: invokevirtual   X/FH6.LIZ:(LX/2fc;)Z
        //   122: pop            
        //   123: return         
        //   124: getstatic       X/1jw.LIZ:LX/1jw;
        //   127: astore          8
        //   129: new             LX/1jy;
        //   132: dup            
        //   133: invokespecial   X/1jy.<init>:()V
        //   136: astore          9
        //   138: aconst_null    
        //   139: astore          10
        //   141: aconst_null    
        //   142: astore          11
        //   144: aload           8
        //   146: aload           9
        //   148: aconst_null    
        //   149: invokevirtual   X/1Na.LIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   152: new             LX/1cm;
        //   155: dup            
        //   156: invokespecial   X/1cm.<init>:()V
        //   159: astore          8
        //   161: aload           8
        //   163: iconst_1       
        //   164: putfield        X/1cm.LIZ:Z
        //   167: invokestatic    X/Fk2.LIZ:()LX/Fk2;
        //   170: invokevirtual   X/Fk2.LIZIZ:()LX/GIK;
        //   173: astore          9
        //   175: aload           9
        //   177: ldc             ""
        //   179: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   182: aload_0        
        //   183: aload           9
        //   185: invokeinterface X/GIK.LIZJ:()J
        //   190: getstatic       X/0xF.COHOST:LX/0xF;
        //   193: aload_1        
        //   194: aload           8
        //   196: invokevirtual   X/0xL.LIZ:(JLX/0xF;Lcom/bytedance/ies/sdk/datachannel/DataChannel;LX/1cm;)V
        //   199: aload           7
        //   201: iconst_1       
        //   202: putfield        X/1NN.LJJLL:Z
        //   205: aload           7
        //   207: iconst_1       
        //   208: putfield        X/1NN.LJIIZILJ:Z
        //   211: aload           7
        //   213: iconst_1       
        //   214: putfield        X/1NN.LIZIZ:Z
        //   217: aload           7
        //   219: aload_2        
        //   220: getfield        X/1NX.LIZ:Ljava/lang/String;
        //   223: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //   226: putfield        X/1NN.LJFF:J
        //   229: aload           7
        //   231: aload_2        
        //   232: getfield        X/1NX.LIZIZ:Ljava/lang/String;
        //   235: putfield        X/1NN.LJI:Ljava/lang/String;
        //   238: new             Lcom/bytedance/android/live/base/model/user/User;
        //   241: dup            
        //   242: invokespecial   com/bytedance/android/live/base/model/user/User.<init>:()V
        //   245: astore          9
        //   247: aload           9
        //   249: aload_2        
        //   250: getfield        X/1NX.LIZLLL:Ljava/lang/String;
        //   253: invokevirtual   com/bytedance/android/live/base/model/user/User.setDisplayId:(Ljava/lang/String;)V
        //   256: aload_2        
        //   257: getfield        X/1NX.LJFF:Ljava/util/List;
        //   260: astore          8
        //   262: aload           8
        //   264: ifnull          277
        //   267: aload           8
        //   269: invokeinterface java/util/Collection.isEmpty:()Z
        //   274: ifeq            607
        //   277: aload           7
        //   279: aload           9
        //   281: putfield        X/1NN.LJJLI:Lcom/bytedance/android/live/base/model/user/User;
        //   284: aload           7
        //   286: aload_2        
        //   287: getfield        X/1NX.LIZJ:Ljava/lang/String;
        //   290: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //   293: putfield        X/1NN.LJIIIIZZ:J
        //   296: aload           7
        //   298: lload_3        
        //   299: putfield        X/1NN.LJII:J
        //   302: aload           7
        //   304: getstatic       X/0kd.INVITING:LX/0kd;
        //   307: invokevirtual   X/1NN.LIZIZ:(LX/0kd;)Z
        //   310: pop            
        //   311: aload_1        
        //   312: ldc             LX/2Et;.class
        //   314: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZJ:(Ljava/lang/Class;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   317: pop            
        //   318: aload           7
        //   320: aload_2        
        //   321: getfield        X/1NX.LJ:LX/0kf;
        //   324: invokevirtual   X/1NN.LIZ:(LX/0kf;)V
        //   327: aload           7
        //   329: aload_2        
        //   330: getfield        X/1NX.LJII:Ljava/util/Map;
        //   333: putfield        X/1NN.LJLILLLLZI:Ljava/util/Map;
        //   336: aload           7
        //   338: aload_2        
        //   339: getfield        X/1NX.LJIIIIZZ:Ljava/lang/String;
        //   342: putfield        X/1NN.LJLJJLL:Ljava/lang/String;
        //   345: aload           7
        //   347: aload_2        
        //   348: getfield        X/1NX.LJIIIZ:Z
        //   351: putfield        X/1NN.LJLJL:Z
        //   354: new             Ljava/util/HashMap;
        //   357: dup            
        //   358: invokespecial   java/util/HashMap.<init>:()V
        //   361: astore_1       
        //   362: new             Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //   365: dup            
        //   366: invokespecial   com/bytedance/android/livesdkapi/depend/model/live/Room.<init>:()V
        //   369: astore          7
        //   371: new             Lcom/bytedance/android/live/base/model/user/User;
        //   374: dup            
        //   375: invokespecial   com/bytedance/android/live/base/model/user/User.<init>:()V
        //   378: astore          9
        //   380: aload           9
        //   382: aload_2        
        //   383: getfield        X/1NX.LIZ:Ljava/lang/String;
        //   386: invokevirtual   com/bytedance/android/live/base/model/user/User.setIdStr:(Ljava/lang/String;)V
        //   389: aload           7
        //   391: aload           9
        //   393: invokevirtual   com/bytedance/android/livesdkapi/depend/model/live/Room.setOwner:(Lcom/bytedance/android/live/base/model/user/User;)V
        //   396: aload           7
        //   398: aload_2        
        //   399: getfield        X/1NX.LIZJ:Ljava/lang/String;
        //   402: invokevirtual   com/bytedance/android/livesdkapi/depend/model/live/Room.setIdStr:(Ljava/lang/String;)V
        //   405: getstatic       com/bytedance/android/livesdk/livesetting/broadcast/LiveCoHostPreviewAnchorAndroidSwitchSetting.INSTANCE:Lcom/bytedance/android/livesdk/livesetting/broadcast/LiveCoHostPreviewAnchorAndroidSwitchSetting;
        //   408: invokevirtual   com/bytedance/android/livesdk/livesetting/broadcast/LiveCoHostPreviewAnchorAndroidSwitchSetting.getValue:()Z
        //   411: ifne            441
        //   414: aload           7
        //   416: getstatic       X/1NN.LLFF:LX/0k5;
        //   419: invokevirtual   X/0k5.LIZ:()LX/1NN;
        //   422: getfield        X/1NN.LJIILL:LX/0kf;
        //   425: getstatic       X/1NN.LLFF:LX/0k5;
        //   428: invokevirtual   X/0k5.LIZ:()LX/1NN;
        //   431: getfield        X/1NN.LJJIJLIJ:Ljava/lang/String;
        //   434: aload_2        
        //   435: getfield        X/1NX.LJIIIIZZ:Ljava/lang/String;
        //   438: invokestatic    X/0xy.LIZ:(Lcom/bytedance/android/livesdkapi/depend/model/live/Room;LX/0kf;Ljava/lang/String;Ljava/lang/String;)V
        //   441: getstatic       X/1NN.LLFF:LX/0k5;
        //   444: invokevirtual   X/0k5.LIZ:()LX/1NN;
        //   447: invokestatic    java/lang/System.currentTimeMillis:()J
        //   450: putfield        X/1NN.LJJL:J
        //   453: getstatic       X/FIV.LIZ:LX/FcU;
        //   456: ldc_w           LX/1Np;.class
        //   459: invokevirtual   X/FcU.LIZ:(Ljava/lang/Class;)LX/S4L;
        //   462: astore_2       
        //   463: aload_2        
        //   464: getstatic       X/FIV.LIZ:LX/FcU;
        //   467: ldc_w           LX/1Np;.class
        //   470: invokevirtual   X/FcU.LIZ:(Ljava/lang/Class;)LX/S4L;
        //   473: invokestatic    kotlin/jvm/internal/n.LIZ:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   476: ifeq            562
        //   479: aload_0        
        //   480: getstatic       X/0xF.COHOST:LX/0xF;
        //   483: invokevirtual   X/0xL.LIZIZ:(LX/0xF;)LX/0xJ;
        //   486: astore_0       
        //   487: aload_0        
        //   488: instanceof      LX/1Np;
        //   491: ifne            559
        //   494: aload           11
        //   496: astore_0       
        //   497: aload_0        
        //   498: checkcast       LX/1Np;
        //   501: astore_0       
        //   502: aload_0        
        //   503: ifnull          558
        //   506: aload_0        
        //   507: aload_1        
        //   508: invokevirtual   X/0xJ.LIZ:(Ljava/util/Map;)LX/FAE;
        //   511: astore_0       
        //   512: aload_0        
        //   513: ifnull          558
        //   516: aload_0        
        //   517: aload           5
        //   519: invokestatic    X/FFb.LIZ:(LX/0CH;)LX/FCn;
        //   522: invokevirtual   X/FAE.LIZ:(LX/FAN;)Ljava/lang/Object;
        //   525: checkcast       LX/FIw;
        //   528: astore_0       
        //   529: aload_0        
        //   530: ifnull          558
        //   533: aload_0        
        //   534: new             LX/1Om;
        //   537: dup            
        //   538: aload           6
        //   540: invokespecial   X/1Om.<init>:(LX/0lF;)V
        //   543: new             LX/1On;
        //   546: dup            
        //   547: aload           6
        //   549: invokespecial   X/1On.<init>:(LX/0lF;)V
        //   552: invokeinterface X/FIw.LIZ:(LX/2d6;LX/2d6;)LX/2fc;
        //   557: pop            
        //   558: return         
        //   559: goto            497
        //   562: aload_2        
        //   563: getstatic       X/FIV.LIZ:LX/FcU;
        //   566: ldc_w           LX/1TT;.class
        //   569: invokevirtual   X/FcU.LIZ:(Ljava/lang/Class;)LX/S4L;
        //   572: invokestatic    kotlin/jvm/internal/n.LIZ:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   575: ifeq            558
        //   578: aload_0        
        //   579: getstatic       X/0xF.MULTIGUEST:LX/0xF;
        //   582: invokevirtual   X/0xL.LIZIZ:(LX/0xF;)LX/0xJ;
        //   585: astore_0       
        //   586: aload_0        
        //   587: instanceof      LX/1Np;
        //   590: ifne            604
        //   593: aload           10
        //   595: astore_0       
        //   596: aload_0        
        //   597: checkcast       LX/1Np;
        //   600: astore_0       
        //   601: goto            502
        //   604: goto            596
        //   607: new             Lcom/bytedance/android/live/base/model/ImageModel;
        //   610: dup            
        //   611: invokespecial   com/bytedance/android/live/base/model/ImageModel.<init>:()V
        //   614: astore          8
        //   616: aload           8
        //   618: aload_2        
        //   619: getfield        X/1NX.LJFF:Ljava/util/List;
        //   622: putfield        com/bytedance/android/live/base/model/ImageModel.mUrls:Ljava/util/List;
        //   625: aload           9
        //   627: aload           8
        //   629: invokevirtual   com/bytedance/android/live/base/model/user/User.setAvatarThumb:(Lcom/bytedance/android/live/base/model/ImageModel;)V
        //   632: goto            277
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
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:425)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:425)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:425)
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
}
