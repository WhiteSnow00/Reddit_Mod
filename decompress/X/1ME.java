// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.live.liveinteract.multimatch.remote.api.MultiMatchApi;
import java.util.HashMap;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import android.text.TextUtils;
import com.bytedance.android.livesdkapi.depend.model.live.match.TeamUser;
import com.bytedance.android.livesdkapi.depend.model.live.match.MultiInviteResponse;
import org.json.JSONObject;
import kotlin.jvm.internal.n;
import java.util.Map;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.live.liveinteract.multimatch.business.dialog.contract.MultiMatchInviteContract;

public final class 1me extends a
{
    public final 1ci LIZ;
    public final MultiMatchInviteContract.b LIZIZ;
    
    static {
        Covode.recordClassIndex(10043);
    }
    
    public 1me(final MultiMatchInviteContract.AbsView absView, final MultiMatchInviteContract.b liziz) {
        CTM.LIZ((Object)absView, (Object)liziz);
        super(absView);
        this.LIZIZ = liziz;
        this.LIZ = liziz.LIZ.LIZ(1ci.class);
    }
    
    @Override
    public final void LIZ() {
        final 0pc lji = this.LIZ.LJI;
        if (lji != null) {
            ((MultiMatchInviteContract.a)this).LIZ(lji);
        }
    }
    
    @Override
    public final void LIZ(final 0pc lji) {
        CTM.LIZ((Object)lji);
        final 1ci liz = this.LIZ;
        if (liz != null) {
            liz.LJI = lji;
            final List<0pc> coHostLinkedUserList = 0jz.LIZLLL().getCoHostLinkedUserList();
            final ArrayList value = new ArrayList();
            final ArrayList value2 = new ArrayList();
            int n = 0;
            for (final 0pc next : coHostLinkedUserList) {
                if (n < 0) {
                    Ey9.LIZ();
                }
                final 0pc 0pc = next;
                if (0pc.LJIILIIL == lji.LJIILIIL || n == 0) {
                    value.add(0pc);
                }
                else {
                    value2.add(0pc);
                }
                ++n;
            }
            liz.LIZLLL.setValue(value);
            liz.LJ.setValue(value2);
            1mg.LJIILJJIL.LIZ(lji, value2);
        }
    }
    
    @Override
    public final void LIZIZ() {
        public final class 1c7<T> implements 2d6
        {
            public final /* synthetic */ 1me LIZ;
            public final /* synthetic */ int LIZIZ;
            public final /* synthetic */ long LIZJ;
            public final /* synthetic */ 1Qk LIZLLL;
            
            static {
                Covode.recordClassIndex(10047);
            }
            
            public 1c7(final 1me liz, final int liziz, final long lizj, final 1Qk lizlll) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
                this.LIZJ = lizj;
                this.LIZLLL = lizlll;
            }
        }
        public final class 1c6<T> implements 2d6
        {
            public final /* synthetic */ 1me LIZ;
            public final /* synthetic */ int LIZIZ;
            public final /* synthetic */ long LIZJ;
            public final /* synthetic */ 1Qk LIZLLL;
            public final /* synthetic */ Map LJ;
            
            static {
                Covode.recordClassIndex(10046);
            }
            
            public 1c6(final 1me liz, final int liziz, final long lizj, final 1Qk lizlll, final Map lj) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
                this.LIZJ = lizj;
                this.LIZLLL = lizlll;
                this.LJ = lj;
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        X/1me.LIZ:LX/1ci;
        //     4: getfield        X/1ci.LIZLLL:LX/15z;
        //     7: invokevirtual   androidx/lifecycle/LiveData.getValue:()Ljava/lang/Object;
        //    10: checkcast       Ljava/util/List;
        //    13: astore_1       
        //    14: aload_0        
        //    15: getfield        X/1me.LIZ:LX/1ci;
        //    18: getfield        X/1ci.LJ:LX/15z;
        //    21: invokevirtual   androidx/lifecycle/LiveData.getValue:()Ljava/lang/Object;
        //    24: checkcast       Ljava/util/List;
        //    27: astore_2       
        //    28: aload_0        
        //    29: getfield        X/1me.LIZIZ:LX/1cJ;
        //    32: getfield        X/1cJ.LIZIZ:LX/0xr;
        //    35: astore_3       
        //    36: aload_0        
        //    37: getfield        X/1me.LIZIZ:LX/1cJ;
        //    40: getfield        X/1cJ.LIZJ:Z
        //    43: istore          4
        //    45: invokestatic    X/0jz.LIZLLL:()Lcom/bytedance/android/live/liveinteract/multicohost/service/IMultiCoHostService;
        //    48: invokeinterface com/bytedance/android/live/liveinteract/multicohost/service/IMultiCoHostService.getCoHostLinkedUserList:()Ljava/util/List;
        //    53: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    58: astore          5
        //    60: aload           5
        //    62: invokeinterface java/util/Iterator.hasNext:()Z
        //    67: ifeq            117
        //    70: aload           5
        //    72: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    77: checkcast       LX/0pc;
        //    80: astore          6
        //    82: getstatic       X/0wQ.LIZIZ:LX/0wQ;
        //    85: invokevirtual   X/0wQ.LIZ:()J
        //    88: aload           6
        //    90: getfield        X/0pc.LJIILIIL:J
        //    93: lcmp           
        //    94: ifeq            60
        //    97: getstatic       X/0wQ.LIZIZ:LX/0wQ;
        //   100: aload           6
        //   102: getfield        X/0pc.LJIILIIL:J
        //   105: aload_1        
        //   106: aload_2        
        //   107: aload_3        
        //   108: iconst_1       
        //   109: iload           4
        //   111: invokevirtual   X/0wQ.LIZ:(JLjava/util/List;Ljava/util/List;LX/0xr;ZZ)V
        //   114: goto            60
        //   117: aload_0        
        //   118: getfield        X/1me.LIZIZ:LX/1cJ;
        //   121: getfield        X/1cJ.LIZJ:Z
        //   124: istore          7
        //   126: aload_0        
        //   127: getfield        X/1me.LIZ:LX/1ci;
        //   130: getfield        X/1ci.LJI:LX/0pc;
        //   133: astore          5
        //   135: aload           5
        //   137: ifnull          222
        //   140: aload           5
        //   142: getfield        X/0pc.LJIILIIL:J
        //   145: lstore          8
        //   147: aload_0        
        //   148: getfield        X/1me.LIZ:LX/1ci;
        //   151: getfield        X/1ci.LJ:LX/15z;
        //   154: invokevirtual   androidx/lifecycle/LiveData.getValue:()Ljava/lang/Object;
        //   157: checkcast       Ljava/util/List;
        //   160: astore_1       
        //   161: aload_1        
        //   162: ifnull          238
        //   165: new             Ljava/util/ArrayList;
        //   168: dup            
        //   169: aload_1        
        //   170: bipush          10
        //   172: invokestatic    X/6Jd.LIZ:(Ljava/lang/Iterable;I)I
        //   175: invokespecial   java/util/ArrayList.<init>:(I)V
        //   178: astore          5
        //   180: aload_1        
        //   181: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   186: astore_1       
        //   187: aload_1        
        //   188: invokeinterface java/util/Iterator.hasNext:()Z
        //   193: ifeq            228
        //   196: aload           5
        //   198: aload_1        
        //   199: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   204: checkcast       LX/0pc;
        //   207: getfield        X/0pc.LJIILIIL:J
        //   210: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   213: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   218: pop            
        //   219: goto            187
        //   222: lconst_0       
        //   223: lstore          8
        //   225: goto            147
        //   228: aload           5
        //   230: checkcast       Ljava/util/List;
        //   233: astore          5
        //   235: goto            241
        //   238: aconst_null    
        //   239: astore          5
        //   241: aload           5
        //   243: ifnonnull       256
        //   246: bipush          6
        //   248: ldc             "MultiMatchInvitePresent"
        //   250: ldc             "sendInvite rival team null,  multiMatchViewModel.rivalTeamInviting.value"
        //   252: invokestatic    X/0ba.LIZ:(ILjava/lang/String;Ljava/lang/String;)V
        //   255: return         
        //   256: getstatic       X/1mg.LJIILJJIL:LX/1mg;
        //   259: astore_3       
        //   260: invokestatic    X/Gqs.LIZ:()J
        //   263: putstatic       X/1mg.LIZIZ:J
        //   266: new             Lorg/json/JSONObject;
        //   269: dup            
        //   270: invokespecial   org/json/JSONObject.<init>:()V
        //   273: astore_1       
        //   274: aload_1        
        //   275: ldc             "invite_type"
        //   277: iload           7
        //   279: invokestatic    X/0d3.LIZ:(Lorg/json/JSONObject;Ljava/lang/String;I)V
        //   282: new             Lorg/json/JSONObject;
        //   285: dup            
        //   286: invokespecial   org/json/JSONObject.<init>:()V
        //   289: astore          6
        //   291: aload           6
        //   293: ldc             "role_type"
        //   295: ldc             "inviter"
        //   297: invokestatic    X/0d3.LIZ:(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V
        //   300: aload_3        
        //   301: ldc             "invite_request"
        //   303: aload_1        
        //   304: aload           6
        //   306: aconst_null    
        //   307: iconst_0       
        //   308: bipush          8
        //   310: invokestatic    X/1mg.LIZ:(LX/1mg;Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONObject;Lorg/json/JSONObject;ZI)V
        //   313: aload_0        
        //   314: getfield        X/1me.LIZIZ:LX/1cJ;
        //   317: getfield        X/1cJ.LIZJ:Z
        //   320: ifeq            669
        //   323: getstatic       X/0n9.LIZIZ:LX/1Qk;
        //   326: astore_1       
        //   327: aload_1        
        //   328: getstatic       X/0nC.INVITED:LX/0nC;
        //   331: iconst_0       
        //   332: invokevirtual   X/1Qk.LIZ:(LX/0nC;Z)Z
        //   335: pop            
        //   336: aload_1        
        //   337: iconst_1       
        //   338: putfield        X/1Qk.LIZLLL:Z
        //   341: aload_1        
        //   342: aload_0        
        //   343: getfield        X/1me.LIZIZ:LX/1cJ;
        //   346: getfield        X/1cJ.LIZJ:Z
        //   349: putfield        X/1Qk.LIZJ:Z
        //   352: invokestatic    X/0jz.LIZLLL:()Lcom/bytedance/android/live/liveinteract/multicohost/service/IMultiCoHostService;
        //   355: invokeinterface com/bytedance/android/live/liveinteract/multicohost/service/IMultiCoHostService.getCoHostLinkedUserList:()Ljava/util/List;
        //   360: invokeinterface java/util/Collection.isEmpty:()Z
        //   365: iconst_1       
        //   366: ixor           
        //   367: ifeq            663
        //   370: invokestatic    X/0jz.LIZLLL:()Lcom/bytedance/android/live/liveinteract/multicohost/service/IMultiCoHostService;
        //   373: invokeinterface com/bytedance/android/live/liveinteract/multicohost/service/IMultiCoHostService.getCoHostLinkedUserList:()Ljava/util/List;
        //   378: iconst_0       
        //   379: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   384: checkcast       LX/0pc;
        //   387: getfield        X/0pc.LJIILIIL:J
        //   390: lstore          10
        //   392: aload_1        
        //   393: aload_0        
        //   394: getfield        X/1me.LIZIZ:LX/1cJ;
        //   397: getfield        X/1cJ.LIZIZ:LX/0xr;
        //   400: putfield        X/1Qk.LJJII:LX/0xr;
        //   403: aload_0        
        //   404: getfield        X/1me.LIZ:LX/1ci;
        //   407: astore          6
        //   409: getstatic       com/bytedance/ies/sdk/datachannel/DataChannelGlobal.LIZJ:Lcom/bytedance/ies/sdk/datachannel/DataChannelGlobal;
        //   412: ldc             LX/HQ5;.class
        //   414: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannelGlobal.LIZIZ:(Ljava/lang/Class;)Ljava/lang/Object;
        //   417: checkcast       Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //   420: astore_3       
        //   421: aload_3        
        //   422: ifnull          657
        //   425: aload_3        
        //   426: invokevirtual   com/bytedance/android/livesdkapi/depend/model/live/Room.getOwner:()Lcom/bytedance/android/live/base/model/user/User;
        //   429: astore_3       
        //   430: aload_3        
        //   431: ifnull          657
        //   434: aload_3        
        //   435: invokevirtual   com/bytedance/android/live/base/model/user/User.getId:()J
        //   438: lstore          12
        //   440: aload           6
        //   442: lload           12
        //   444: putfield        X/1ci.LJII:J
        //   447: iconst_3       
        //   448: ldc             "MultiMatchInvitePresent"
        //   450: ldc_w           "inviteActionByUid updated by send invite"
        //   453: invokestatic    X/0ba.LIZ:(ILjava/lang/String;Ljava/lang/String;)V
        //   456: aload_0        
        //   457: getfield        X/1me.LIZ:LX/1ci;
        //   460: invokestatic    java/lang/System.currentTimeMillis:()J
        //   463: putfield        X/1ci.LJIIIZ:J
        //   466: aload_0        
        //   467: getfield        X/1me.LIZ:LX/1ci;
        //   470: getfield        X/1ci.LJFF:LX/15z;
        //   473: invokevirtual   androidx/lifecycle/LiveData.getValue:()Ljava/lang/Object;
        //   476: checkcast       Ljava/util/Map;
        //   479: astore_3       
        //   480: aload_3        
        //   481: astore          6
        //   483: aload_3        
        //   484: ifnonnull       496
        //   487: new             Ljava/util/HashMap;
        //   490: dup            
        //   491: invokespecial   java/util/HashMap.<init>:()V
        //   494: astore          6
        //   496: aload           6
        //   498: ldc_w           ""
        //   501: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   504: aload           6
        //   506: lload           10
        //   508: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   511: iconst_1       
        //   512: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   515: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   520: pop            
        //   521: aload_0        
        //   522: getfield        X/1me.LIZ:LX/1ci;
        //   525: getfield        X/1ci.LJFF:LX/15z;
        //   528: aload           6
        //   530: invokevirtual   androidx/lifecycle/LiveData.setValue:(Ljava/lang/Object;)V
        //   533: invokestatic    X/0yr.LIZ:()LX/0yr;
        //   536: ldc_w           Lcom/bytedance/android/live/liveinteract/multimatch/remote/api/MultiMatchApi;.class
        //   539: invokevirtual   X/0yr.LIZ:(Ljava/lang/Class;)Ljava/lang/Object;
        //   542: checkcast       Lcom/bytedance/android/live/liveinteract/multimatch/remote/api/MultiMatchApi;
        //   545: astore          14
        //   547: aload_0        
        //   548: getfield        X/1me.LIZ:LX/1ci;
        //   551: getfield        X/1ci.LIZ:LX/15z;
        //   554: invokevirtual   androidx/lifecycle/LiveData.getValue:()Ljava/lang/Object;
        //   557: checkcast       Ljava/lang/Long;
        //   560: astore_2       
        //   561: aload_2        
        //   562: astore_3       
        //   563: aload_2        
        //   564: ifnonnull       572
        //   567: lconst_0       
        //   568: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   571: astore_3       
        //   572: aload_3        
        //   573: ldc_w           ""
        //   576: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   579: aload           14
        //   581: aload_3        
        //   582: invokevirtual   java/lang/Long.longValue:()J
        //   585: iload           7
        //   587: lload           8
        //   589: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //   592: aload           5
        //   594: ldc_w           ","
        //   597: aconst_null    
        //   598: aconst_null    
        //   599: iconst_0       
        //   600: aconst_null    
        //   601: aconst_null    
        //   602: bipush          62
        //   604: invokestatic    X/Qsi.LIZ:(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;LX/SRS;I)Ljava/lang/String;
        //   607: invokeinterface com/bytedance/android/live/liveinteract/multimatch/remote/api/MultiMatchApi.multiInvite:(JILjava/lang/String;Ljava/lang/String;)LX/FBF;
        //   612: aload_0        
        //   613: invokevirtual   X/0kz.LJI:()LX/FCn;
        //   616: invokevirtual   X/FBF.LIZ:(LX/FBZ;)Ljava/lang/Object;
        //   619: checkcast       LX/FIc;
        //   622: new             LX/1c6;
        //   625: dup            
        //   626: aload_0        
        //   627: iload           7
        //   629: lload           8
        //   631: aload_1        
        //   632: aload           6
        //   634: invokespecial   X/1c6.<init>:(LX/1me;IJLX/1Qk;Ljava/util/Map;)V
        //   637: new             LX/1c7;
        //   640: dup            
        //   641: aload_0        
        //   642: iload           7
        //   644: lload           8
        //   646: aload_1        
        //   647: invokespecial   X/1c7.<init>:(LX/1me;IJLX/1Qk;)V
        //   650: invokeinterface X/FIc.LIZ:(LX/2d6;LX/2d6;)LX/2fc;
        //   655: pop            
        //   656: return         
        //   657: lconst_0       
        //   658: lstore          12
        //   660: goto            440
        //   663: lconst_0       
        //   664: lstore          10
        //   666: goto            392
        //   669: getstatic       X/0n9.LIZ:LX/1Qk;
        //   672: astore_1       
        //   673: goto            327
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
    public final void LIZJ() {
        public final class 1c5<T> implements 2d6
        {
            public final /* synthetic */ 1me LIZ;
            public final /* synthetic */ 1Qk LIZIZ;
            
            static {
                Covode.recordClassIndex(10045);
            }
            
            public 1c5(final 1me liz, final 1Qk liziz) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
            }
        }
        public final class 1c4<T> implements 2d6
        {
            public final /* synthetic */ 1me LIZ;
            
            static {
                Covode.recordClassIndex(10044);
            }
            
            public 1c4(final 1me liz) {
                this.LIZ = liz;
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        X/1me.LIZIZ:LX/1cJ;
        //     4: getfield        X/0l0.LJ:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //     7: astore_1       
        //     8: aload_1        
        //     9: ifnull          214
        //    12: aload_1        
        //    13: ldc_w           LX/G69;.class
        //    16: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZIZ:(Ljava/lang/Class;)Ljava/lang/Object;
        //    19: checkcast       Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //    22: astore_1       
        //    23: aload_1        
        //    24: ifnull          209
        //    27: aload_1        
        //    28: invokevirtual   com/bytedance/android/livesdkapi/depend/model/live/Room.getId:()J
        //    31: lstore_2       
        //    32: aload_0        
        //    33: getfield        X/1me.LIZ:LX/1ci;
        //    36: getfield        X/1ci.LIZ:LX/15z;
        //    39: invokevirtual   androidx/lifecycle/LiveData.getValue:()Ljava/lang/Object;
        //    42: checkcast       Ljava/lang/Long;
        //    45: astore          4
        //    47: aload           4
        //    49: astore_1       
        //    50: aload           4
        //    52: ifnonnull       60
        //    55: lconst_0       
        //    56: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //    59: astore_1       
        //    60: aload_1        
        //    61: ldc_w           ""
        //    64: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    67: aload_1        
        //    68: invokevirtual   java/lang/Long.longValue:()J
        //    71: lstore          5
        //    73: aload_0        
        //    74: getfield        X/1me.LIZIZ:LX/1cJ;
        //    77: getfield        X/1cJ.LIZJ:Z
        //    80: ifeq            202
        //    83: getstatic       X/0n9.LIZIZ:LX/1Qk;
        //    86: astore_1       
        //    87: getstatic       X/0wQ.LIZIZ:LX/0wQ;
        //    90: aload_1        
        //    91: invokevirtual   X/1Qk.LJ:()J
        //    94: iconst_1       
        //    95: aload_0        
        //    96: getfield        X/1me.LIZ:LX/1ci;
        //    99: getfield        X/1ci.LIZLLL:LX/15z;
        //   102: invokevirtual   androidx/lifecycle/LiveData.getValue:()Ljava/lang/Object;
        //   105: checkcast       Ljava/util/List;
        //   108: aload_0        
        //   109: getfield        X/1me.LIZ:LX/1ci;
        //   112: getfield        X/1ci.LJ:LX/15z;
        //   115: invokevirtual   androidx/lifecycle/LiveData.getValue:()Ljava/lang/Object;
        //   118: checkcast       Ljava/util/List;
        //   121: aload_0        
        //   122: getfield        X/1me.LIZIZ:LX/1cJ;
        //   125: getfield        X/1cJ.LIZIZ:LX/0xr;
        //   128: invokevirtual   X/0wQ.LIZ:(JZLjava/util/List;Ljava/util/List;LX/0xr;)V
        //   131: getstatic       X/1mg.LJIILJJIL:LX/1mg;
        //   134: ldc_w           "active"
        //   137: aload_1        
        //   138: invokevirtual   X/1Qk.LJ:()J
        //   141: invokevirtual   X/1mg.LIZ:(Ljava/lang/String;J)V
        //   144: invokestatic    X/0yr.LIZ:()LX/0yr;
        //   147: ldc_w           Lcom/bytedance/android/live/liveinteract/multimatch/remote/api/MultiMatchApi;.class
        //   150: invokevirtual   X/0yr.LIZ:(Ljava/lang/Class;)Ljava/lang/Object;
        //   153: checkcast       Lcom/bytedance/android/live/liveinteract/multimatch/remote/api/MultiMatchApi;
        //   156: lload_2        
        //   157: lload           5
        //   159: getstatic       X/0n9.LJI:J
        //   162: iconst_0       
        //   163: invokeinterface com/bytedance/android/live/liveinteract/multimatch/remote/api/MultiMatchApi.cancel:(JJJI)LX/FBF;
        //   168: aload_0        
        //   169: invokevirtual   X/0kz.LJI:()LX/FCn;
        //   172: invokevirtual   X/FBF.LIZ:(LX/FBZ;)Ljava/lang/Object;
        //   175: checkcast       LX/FIc;
        //   178: new             LX/1c4;
        //   181: dup            
        //   182: aload_0        
        //   183: invokespecial   X/1c4.<init>:(LX/1me;)V
        //   186: new             LX/1c5;
        //   189: dup            
        //   190: aload_0        
        //   191: aload_1        
        //   192: invokespecial   X/1c5.<init>:(LX/1me;LX/1Qk;)V
        //   195: invokeinterface X/FIc.LIZ:(LX/2d6;LX/2d6;)LX/2fc;
        //   200: pop            
        //   201: return         
        //   202: getstatic       X/0n9.LIZ:LX/1Qk;
        //   205: astore_1       
        //   206: goto            87
        //   209: lconst_0       
        //   210: lstore_2       
        //   211: goto            32
        //   214: aconst_null    
        //   215: astore_1       
        //   216: goto            23
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
    public final 1ci LIZLLL() {
        return this.LIZ;
    }
    
    @Override
    public final boolean LJ() {
        return this.LIZIZ.LIZJ;
    }
    
    @Override
    public final MultiMatchInviteContract.b LJFF() {
        return this.LIZIZ;
    }
}
