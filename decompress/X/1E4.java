// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.widget.HorizontalScrollView;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import org.json.JSONObject;
import java.util.Map;
import kotlin.n.y;
import java.util.HashMap;
import java.util.Iterator;
import android.graphics.drawable.Drawable;
import java.util.Objects;
import java.util.Collection;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import androidx.recyclerview.widget.GridLayoutManager;
import com.bytedance.android.livesdk.chatroom.ui.SSGridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.n;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.comment.LiveCommentEmoteInputMaxCount;
import java.util.ArrayList;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import java.util.List;
import android.text.SpannableStringBuilder;

public final class 1E4 extends 0TN
{
    public final SpannableStringBuilder LIZ;
    public Gnv LIZIZ;
    public final List<EmoteModel> LIZJ;
    public final int LIZLLL;
    public a LJ;
    public b LJFF;
    public boolean LJI;
    public 1ib LJIILL;
    public b LJIILLIIL;
    public final int LJIIZILJ;
    public final int LJIJ;
    public final int LJIJI;
    
    static {
        Covode.recordClassIndex(4600);
    }
    
    public 1E4(final Context context, final boolean lji) {
        CTM.LIZ((Object)context);
        super(context);
        this.LJI = lji;
        this.LIZ = new SpannableStringBuilder();
        this.LJIIZILJ = context.getResources().getDimensionPixelSize(2131166150);
        this.LJIJ = context.getResources().getDimensionPixelSize(2131166151);
        this.LJIJI = context.getResources().getDimensionPixelSize(2131166149);
        this.LIZJ = new ArrayList<EmoteModel>();
        int value;
        if (!this.LJI) {
            value = LiveCommentEmoteInputMaxCount.INSTANCE.getValue();
        }
        else {
            value = Integer.MAX_VALUE;
        }
        this.LIZLLL = value;
    }
    
    private final void LJI() {
        if (super.LJIILIIL) {
            final 1ib ljiill = this.LJIILL;
            if (ljiill != null) {
                ljiill.setText(2131830678);
            }
            return;
        }
        if (((CharSequence)this.LIZ).length() == 0) {
            final 1ib ljiill2 = this.LJIILL;
            if (ljiill2 != null) {
                ljiill2.setText((CharSequence)super.LJIILJJIL.getResources().getString(2131831884, new Object[] { String.valueOf(this.LIZLLL) }));
            }
            return;
        }
        final 1ib ljiill3 = this.LJIILL;
        if (ljiill3 != null) {
            ljiill3.setText((CharSequence)this.LIZ);
        }
    }
    
    @Override
    public final int LIZ() {
        return 2131234332;
    }
    
    @Override
    public final View LIZ(final ViewGroup viewGroup) {
        public final class 1E3 implements GoC
        {
            public final /* synthetic */ 1E4 LIZ;
            
            static {
                Covode.recordClassIndex(4603);
            }
            
            public 1E3(final 1E4 liz) {
                this.LIZ = liz;
            }
            
            public final void LIZ() {
                final b ljff = this.LIZ.LJFF;
                if (ljff != null) {
                    ljff.LIZ();
                }
            }
            
            public final void LIZ(final boolean b) {
                this.LIZ.LJ(b);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: aload_0        
        //     5: getfield        X/0TN.LJIILJJIL:Landroid/content/Context;
        //     8: astore_2       
        //     9: aload_0        
        //    10: getfield        X/0TN.LJII:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //    13: astore_3       
        //    14: aload_0        
        //    15: getfield        X/0TN.LJIIIZ:Z
        //    18: istore          4
        //    20: aload_0        
        //    21: getfield        X/1E4.LJIILLIIL:LX/1E5;
        //    24: astore_1       
        //    25: new             LX/Gnv;
        //    28: dup            
        //    29: aload_2        
        //    30: aload_3        
        //    31: invokespecial   X/Gnv.<init>:(Landroid/content/Context;Lcom/bytedance/ies/sdk/datachannel/DataChannel;)V
        //    34: astore_3       
        //    35: aload_3        
        //    36: aload_1        
        //    37: invokevirtual   X/Gnv.setOnEmojiSelectListener:(LX/0Vn;)V
        //    40: aload_3        
        //    41: iload           4
        //    43: putfield        X/Gnv.LJ:Z
        //    46: aload_3        
        //    47: getfield        X/Gnv.LJ:Z
        //    50: ifeq            777
        //    53: iconst_5       
        //    54: istore          5
        //    56: aload_3        
        //    57: iload           5
        //    59: putfield        X/Gnv.LJFF:I
        //    62: aload_3        
        //    63: ldc             2131370689
        //    65: invokevirtual   X/Gnv.findViewById:(I)Landroid/view/View;
        //    68: astore_1       
        //    69: aload_1        
        //    70: ldc             ""
        //    72: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    75: aload_3        
        //    76: aload_1        
        //    77: checkcast       Landroidx/recyclerview/widget/RecyclerView;
        //    80: putfield        X/Gnv.LIZ:Landroidx/recyclerview/widget/RecyclerView;
        //    83: aload_3        
        //    84: getfield        X/Gnv.LIZ:Landroidx/recyclerview/widget/RecyclerView;
        //    87: astore_1       
        //    88: aload_1        
        //    89: ifnonnull       97
        //    92: ldc             ""
        //    94: invokestatic    kotlin/jvm/internal/n.LIZ:(Ljava/lang/String;)V
        //    97: iconst_0       
        //    98: istore          6
        //   100: aload_1        
        //   101: iconst_0       
        //   102: invokevirtual   androidx/recyclerview/widget/RecyclerView.setClipToPadding:(Z)V
        //   105: aload_3        
        //   106: invokestatic    X/0cB.LIZJ:()I
        //   109: ldc             18.0
        //   111: invokestatic    X/0cB.LIZ:(F)I
        //   114: isub           
        //   115: aload_3        
        //   116: getfield        X/Gnv.LJFF:I
        //   119: idiv           
        //   120: putfield        X/Gnv.LJIIL:I
        //   123: aload_3        
        //   124: getfield        X/Gnv.LIZIZ:LX/Evr;
        //   127: astore_1       
        //   128: aload_1        
        //   129: ldc             LX/Go3;.class
        //   131: new             LX/Gno;
        //   134: dup            
        //   135: aload_3        
        //   136: invokespecial   X/Gno.<init>:(LX/GoD;)V
        //   139: invokevirtual   X/Evr.LIZ:(Ljava/lang/Class;LX/Evv;)V
        //   142: aload_1        
        //   143: ldc             Lcom/bytedance/android/live/base/model/emoji/EmoteModel;.class
        //   145: new             LX/Gnx;
        //   148: dup            
        //   149: aload_3        
        //   150: getfield        X/Gnv.LJIIL:I
        //   153: aload_3        
        //   154: aload_3        
        //   155: invokespecial   X/Gnx.<init>:(ILX/GoK;LX/GoP;)V
        //   158: invokevirtual   X/Evr.LIZ:(Ljava/lang/Class;LX/Evv;)V
        //   161: aload_3        
        //   162: new             Lcom/bytedance/android/livesdk/chatroom/ui/SSGridLayoutManager;
        //   165: dup            
        //   166: aload_3        
        //   167: invokevirtual   X/Gnv.getContext:()Landroid/content/Context;
        //   170: aload_3        
        //   171: getfield        X/Gnv.LJFF:I
        //   174: invokespecial   com/bytedance/android/livesdk/chatroom/ui/SSGridLayoutManager.<init>:(Landroid/content/Context;I)V
        //   177: putfield        X/Gnv.LIZJ:Lcom/bytedance/android/livesdk/chatroom/ui/SSGridLayoutManager;
        //   180: aload_3        
        //   181: getfield        X/Gnv.LIZJ:Lcom/bytedance/android/livesdk/chatroom/ui/SSGridLayoutManager;
        //   184: astore_1       
        //   185: aload_1        
        //   186: ifnull          201
        //   189: aload_1        
        //   190: new             LX/Go5;
        //   193: dup            
        //   194: aload_3        
        //   195: invokespecial   X/Go5.<init>:(LX/Gnv;)V
        //   198: invokevirtual   androidx/recyclerview/widget/GridLayoutManager.LIZ:(LX/0E5;)V
        //   201: aload_3        
        //   202: getfield        X/Gnv.LIZ:Landroidx/recyclerview/widget/RecyclerView;
        //   205: astore_1       
        //   206: aload_1        
        //   207: ifnonnull       215
        //   210: ldc             ""
        //   212: invokestatic    kotlin/jvm/internal/n.LIZ:(Ljava/lang/String;)V
        //   215: aload_1        
        //   216: aload_3        
        //   217: getfield        X/Gnv.LIZIZ:LX/Evr;
        //   220: invokevirtual   androidx/recyclerview/widget/RecyclerView.setAdapter:(LX/0EA;)V
        //   223: aload_3        
        //   224: getfield        X/Gnv.LIZ:Landroidx/recyclerview/widget/RecyclerView;
        //   227: astore_1       
        //   228: aload_1        
        //   229: ifnonnull       237
        //   232: ldc             ""
        //   234: invokestatic    kotlin/jvm/internal/n.LIZ:(Ljava/lang/String;)V
        //   237: aload_1        
        //   238: aload_3        
        //   239: getfield        X/Gnv.LIZJ:Lcom/bytedance/android/livesdk/chatroom/ui/SSGridLayoutManager;
        //   242: invokevirtual   androidx/recyclerview/widget/RecyclerView.setLayoutManager:(LX/0EM;)V
        //   245: aload_3        
        //   246: getfield        X/Gnv.LIZ:Landroidx/recyclerview/widget/RecyclerView;
        //   249: astore_1       
        //   250: aload_1        
        //   251: ifnonnull       259
        //   254: ldc             ""
        //   256: invokestatic    kotlin/jvm/internal/n.LIZ:(Ljava/lang/String;)V
        //   259: aload_1        
        //   260: iconst_1       
        //   261: invokevirtual   androidx/recyclerview/widget/RecyclerView.setHasFixedSize:(Z)V
        //   264: aload_3        
        //   265: getfield        X/Gnv.LIZ:Landroidx/recyclerview/widget/RecyclerView;
        //   268: astore_1       
        //   269: aload_1        
        //   270: ifnonnull       278
        //   273: ldc             ""
        //   275: invokestatic    kotlin/jvm/internal/n.LIZ:(Ljava/lang/String;)V
        //   278: aload_1        
        //   279: bipush          36
        //   281: invokevirtual   androidx/recyclerview/widget/RecyclerView.setItemViewCacheSize:(I)V
        //   284: getstatic       com/bytedance/ies/sdk/datachannel/DataChannelGlobal.LIZJ:Lcom/bytedance/ies/sdk/datachannel/DataChannelGlobal;
        //   287: ldc_w           LX/HQ5;.class
        //   290: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannelGlobal.LIZIZ:(Ljava/lang/Class;)Ljava/lang/Object;
        //   293: checkcast       Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //   296: astore_1       
        //   297: aload_1        
        //   298: ifnull          771
        //   301: aload_1        
        //   302: invokevirtual   com/bytedance/android/livesdkapi/depend/model/live/Room.getOwner:()Lcom/bytedance/android/live/base/model/user/User;
        //   305: astore_1       
        //   306: aload_1        
        //   307: ifnull          771
        //   310: aload_1        
        //   311: invokevirtual   com/bytedance/android/live/base/model/user/User.isFollowing:()Z
        //   314: istore          4
        //   316: aload_3        
        //   317: iload           4
        //   319: putfield        X/Gnv.LJII:Z
        //   322: aload_3        
        //   323: getfield        X/Gnv.LJIIJJI:LX/FH6;
        //   326: invokestatic    X/FGP.LIZ:()LX/FGP;
        //   329: ldc_w           LX/GFz;.class
        //   332: invokevirtual   X/FGP.LIZ:(Ljava/lang/Class;)LX/FBF;
        //   335: getstatic       X/F8V.LIZ:LX/FFV;
        //   338: invokestatic    X/F8U.LIZ:(LX/FFV;)LX/FFV;
        //   341: invokevirtual   X/FBF.LIZ:(LX/FFV;)LX/FBF;
        //   344: new             LX/Go7;
        //   347: dup            
        //   348: aload_3        
        //   349: invokespecial   X/Go7.<init>:(LX/Gnv;)V
        //   352: invokevirtual   X/FBF.LIZLLL:(LX/2d6;)LX/2fc;
        //   355: invokevirtual   X/FH6.LIZ:(LX/2fc;)Z
        //   358: pop            
        //   359: getstatic       com/bytedance/ies/sdk/datachannel/DataChannelGlobal.LIZJ:Lcom/bytedance/ies/sdk/datachannel/DataChannelGlobal;
        //   362: ldc_w           LX/HQ5;.class
        //   365: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannelGlobal.LIZIZ:(Ljava/lang/Class;)Ljava/lang/Object;
        //   368: checkcast       Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //   371: astore_1       
        //   372: aload_1        
        //   373: ifnull          765
        //   376: aload_1        
        //   377: invokevirtual   com/bytedance/android/livesdkapi/depend/model/live/Room.getOwner:()Lcom/bytedance/android/live/base/model/user/User;
        //   380: astore_1       
        //   381: aload_1        
        //   382: ifnull          765
        //   385: aload_1        
        //   386: invokevirtual   com/bytedance/android/live/base/model/user/User.isSubscribed:()Z
        //   389: istore          4
        //   391: aload_3        
        //   392: iload           4
        //   394: putfield        X/Gnv.LJI:Z
        //   397: invokestatic    X/Fk2.LIZ:()LX/Fk2;
        //   400: invokevirtual   X/Fk2.LIZIZ:()LX/GIK;
        //   403: astore_1       
        //   404: aload_1        
        //   405: ldc             ""
        //   407: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   410: aload_1        
        //   411: invokeinterface X/GIK.LIZJ:()J
        //   416: lstore          7
        //   418: getstatic       com/bytedance/ies/sdk/datachannel/DataChannelGlobal.LIZJ:Lcom/bytedance/ies/sdk/datachannel/DataChannelGlobal;
        //   421: ldc_w           LX/HQ5;.class
        //   424: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannelGlobal.LIZIZ:(Ljava/lang/Class;)Ljava/lang/Object;
        //   427: checkcast       Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //   430: astore_1       
        //   431: iload           6
        //   433: istore          4
        //   435: aload_1        
        //   436: ifnull          456
        //   439: iload           6
        //   441: istore          4
        //   443: lload           7
        //   445: aload_1        
        //   446: invokevirtual   com/bytedance/android/livesdkapi/depend/model/live/Room.getOwnerUserId:()J
        //   449: lcmp           
        //   450: ifne            456
        //   453: iconst_1       
        //   454: istore          4
        //   456: aload_3        
        //   457: iload           4
        //   459: putfield        X/Gnv.LJIIIIZZ:Z
        //   462: aload_3        
        //   463: getfield        X/Gnv.LIZLLL:LX/GoC;
        //   466: astore_1       
        //   467: aload_1        
        //   468: ifnull          481
        //   471: aload_1        
        //   472: aload_3        
        //   473: invokevirtual   X/Gnv.LIZ:()Z
        //   476: invokeinterface X/GoC.LIZ:(Z)V
        //   481: aload_3        
        //   482: getfield        X/Gnv.LJIIJ:Ljava/util/ArrayList;
        //   485: invokevirtual   java/util/ArrayList.clear:()V
        //   488: getstatic       com/bytedance/ies/sdk/datachannel/DataChannelGlobal.LIZJ:Lcom/bytedance/ies/sdk/datachannel/DataChannelGlobal;
        //   491: ldc_w           LX/HPc;.class
        //   494: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannelGlobal.LIZIZ:(Ljava/lang/Class;)Ljava/lang/Object;
        //   497: checkcast       Ljava/util/List;
        //   500: astore_2       
        //   501: aload_2        
        //   502: astore_1       
        //   503: aload_2        
        //   504: ifnonnull       515
        //   507: new             Ljava/util/ArrayList;
        //   510: dup            
        //   511: invokespecial   java/util/ArrayList.<init>:()V
        //   514: astore_1       
        //   515: aload_3        
        //   516: getfield        X/Gnv.LJIIJ:Ljava/util/ArrayList;
        //   519: aload_1        
        //   520: invokevirtual   java/util/ArrayList.addAll:(Ljava/util/Collection;)Z
        //   523: pop            
        //   524: aload_3        
        //   525: invokevirtual   X/Gnv.getContext:()Landroid/content/Context;
        //   528: instanceof      LX/0CH;
        //   531: ifeq            608
        //   534: getstatic       com/bytedance/ies/sdk/datachannel/DataChannelGlobal.LIZJ:Lcom/bytedance/ies/sdk/datachannel/DataChannelGlobal;
        //   537: astore_2       
        //   538: aload_3        
        //   539: invokevirtual   X/Gnv.getContext:()Landroid/content/Context;
        //   542: astore_1       
        //   543: aload_1        
        //   544: ldc_w           "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner"
        //   547: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
        //   550: pop            
        //   551: aload_2        
        //   552: aload_3        
        //   553: aload_1        
        //   554: checkcast       LX/0CH;
        //   557: ldc_w           LX/2DB;.class
        //   560: new             LX/Go0;
        //   563: dup            
        //   564: aload_3        
        //   565: invokespecial   X/Go0.<init>:(LX/Gnv;)V
        //   568: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannelGlobal.LIZ:(Ljava/lang/Object;LX/0CH;Ljava/lang/Class;LX/SRS;)V
        //   571: getstatic       com/bytedance/ies/sdk/datachannel/DataChannelGlobal.LIZJ:Lcom/bytedance/ies/sdk/datachannel/DataChannelGlobal;
        //   574: astore_1       
        //   575: aload_3        
        //   576: invokevirtual   X/Gnv.getContext:()Landroid/content/Context;
        //   579: astore_2       
        //   580: aload_2        
        //   581: ldc_w           "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner"
        //   584: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
        //   587: pop            
        //   588: aload_1        
        //   589: aload_3        
        //   590: aload_2        
        //   591: checkcast       LX/0CH;
        //   594: ldc_w           LX/HPc;.class
        //   597: new             LX/Gnz;
        //   600: dup            
        //   601: aload_3        
        //   602: invokespecial   X/Gnz.<init>:(LX/Gnv;)V
        //   605: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannelGlobal.LIZ:(Ljava/lang/Object;LX/0CH;Ljava/lang/Class;LX/SRS;)V
        //   608: aload_3        
        //   609: getfield        X/Gnv.LIZIZ:LX/Evr;
        //   612: aload_3        
        //   613: getfield        X/Gnv.LJIIIZ:LX/GQk;
        //   616: invokevirtual   X/Evr.LIZ:(Ljava/util/List;)V
        //   619: aload_3        
        //   620: invokevirtual   X/Gnv.LIZIZ:()V
        //   623: aload_3        
        //   624: invokevirtual   X/Gnv.getContext:()Landroid/content/Context;
        //   627: astore_1       
        //   628: aload_1        
        //   629: ldc             ""
        //   631: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   634: aload_1        
        //   635: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //   638: ldc_w           2131166148
        //   641: invokevirtual   android/content/res/Resources.getDimensionPixelSize:(I)I
        //   644: istore          9
        //   646: aload_3        
        //   647: getfield        X/Gnv.LIZ:Landroidx/recyclerview/widget/RecyclerView;
        //   650: astore_1       
        //   651: aload_1        
        //   652: ifnonnull       660
        //   655: ldc             ""
        //   657: invokestatic    kotlin/jvm/internal/n.LIZ:(Ljava/lang/String;)V
        //   660: aload_3        
        //   661: getfield        X/Gnv.LIZ:Landroidx/recyclerview/widget/RecyclerView;
        //   664: astore_2       
        //   665: aload_2        
        //   666: ifnonnull       674
        //   669: ldc             ""
        //   671: invokestatic    kotlin/jvm/internal/n.LIZ:(Ljava/lang/String;)V
        //   674: aload_2        
        //   675: invokevirtual   androidx/recyclerview/widget/RecyclerView.getPaddingLeft:()I
        //   678: istore          10
        //   680: aload_3        
        //   681: getfield        X/Gnv.LIZ:Landroidx/recyclerview/widget/RecyclerView;
        //   684: astore_2       
        //   685: aload_2        
        //   686: ifnonnull       694
        //   689: ldc             ""
        //   691: invokestatic    kotlin/jvm/internal/n.LIZ:(Ljava/lang/String;)V
        //   694: aload_2        
        //   695: invokevirtual   androidx/recyclerview/widget/RecyclerView.getPaddingTop:()I
        //   698: istore          5
        //   700: aload_3        
        //   701: getfield        X/Gnv.LIZ:Landroidx/recyclerview/widget/RecyclerView;
        //   704: astore_2       
        //   705: aload_2        
        //   706: ifnonnull       714
        //   709: ldc             ""
        //   711: invokestatic    kotlin/jvm/internal/n.LIZ:(Ljava/lang/String;)V
        //   714: aload_1        
        //   715: iload           10
        //   717: iload           5
        //   719: aload_2        
        //   720: invokevirtual   androidx/recyclerview/widget/RecyclerView.getPaddingRight:()I
        //   723: iload           9
        //   725: invokevirtual   androidx/recyclerview/widget/RecyclerView.setPadding:(IIII)V
        //   728: aload_0        
        //   729: aload_3        
        //   730: putfield        X/1E4.LIZIZ:LX/Gnv;
        //   733: aload_0        
        //   734: invokevirtual   X/1E4.LJ:()V
        //   737: aload_0        
        //   738: aload_3        
        //   739: invokevirtual   X/Gnv.LIZ:()Z
        //   742: invokevirtual   X/0TN.LJ:(Z)V
        //   745: aload_3        
        //   746: new             LX/1E3;
        //   749: dup            
        //   750: aload_0        
        //   751: invokespecial   X/1E3.<init>:(LX/1E4;)V
        //   754: invokevirtual   X/Gnv.setEmoteSelectPanelCallback:(LX/GoC;)V
        //   757: aload_3        
        //   758: ldc             ""
        //   760: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   763: aload_3        
        //   764: areturn        
        //   765: iconst_0       
        //   766: istore          4
        //   768: goto            391
        //   771: iconst_0       
        //   772: istore          4
        //   774: goto            316
        //   777: bipush          10
        //   779: istore          5
        //   781: goto            56
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
    public final void LIZ(final int n) {
        final a lj = this.LJ;
        if (lj != null) {
            final RuQ copy = RuQ.copyOf((List)this.LIZJ);
            n.LIZIZ((Object)copy, "");
            lj.LIZ((List<? extends EmoteModel>)copy);
        }
    }
    
    @Override
    public final void LIZ(final b ljff) {
        public final class 1ht implements b
        {
            public final /* synthetic */ b LIZ;
            public final /* synthetic */ 1E4 LIZIZ;
            
            static {
                Covode.recordClassIndex(4602);
            }
            
            public 1ht(final b liz, final 1E4 liziz) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
            }
            
            @Override
            public final void LIZ() {
                this.LIZ.LIZ();
            }
            
            @Override
            public final void LIZ(final 0TN 0tn) {
                CTM.LIZ((Object)0tn);
                this.LIZ.LIZ(0tn);
                this.LIZIZ.LJ();
            }
            
            @Override
            public final void LIZ(final 1F8 1f8) {
                final boolean lji = this.LIZIZ.LJI;
                1F8 1f9 = null;
                if (lji) {
                    if (1f8 instanceof EmoteModel) {
                        1f9 = 1f8;
                    }
                    final EmoteModel emoteModel = (EmoteModel)1f9;
                    if (emoteModel != null) {
                        this.LIZIZ.LIZ(emoteModel);
                    }
                    final 1E4.a lj = this.LIZIZ.LJ;
                    if (lj != null) {
                        lj.LIZ(1f8);
                    }
                    return;
                }
                if (this.LIZIZ.LIZ.length() >= this.LIZIZ.LIZLLL) {
                    Hf4.LIZ(0cB.LJ(), this.LIZIZ.LJIILJJIL.getResources().getQuantityString(2131689856, this.LIZIZ.LIZLLL, new Object[] { String.valueOf(this.LIZIZ.LIZLLL) }), 0L);
                    return;
                }
                1F8 1f10 = 1f8;
                if (!(1f8 instanceof EmoteModel)) {
                    1f10 = null;
                }
                final EmoteModel emoteModel2 = (EmoteModel)1f10;
                if (emoteModel2 != null) {
                    this.LIZIZ.LIZ(emoteModel2);
                }
                final int liz = Go9.LIZ.LIZ(this.LIZIZ.LJII);
                if (liz == 1 || liz == 2) {
                    final 1E4.a lj2 = this.LIZIZ.LJ;
                    if (lj2 != null) {
                        final RuQ copy = RuQ.copyOf((List)this.LIZIZ.LIZJ);
                        n.LIZIZ((Object)copy, "");
                        lj2.LIZ((List<? extends EmoteModel>)copy);
                    }
                }
            }
            
            @Override
            public final void LIZIZ() {
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ifnull          17
        //     4: aload_0        
        //     5: new             LX/1ht;
        //     8: dup            
        //     9: aload_1        
        //    10: aload_0        
        //    11: invokespecial   X/1ht.<init>:(LX/1E5;LX/1E4;)V
        //    14: putfield        X/1E4.LJIILLIIL:LX/1E5;
        //    17: aload_0        
        //    18: aload_1        
        //    19: putfield        X/1E4.LJFF:LX/1E5;
        //    22: return         
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
    
    public final void LIZ(final a lj) {
        this.LIZ((b)(this.LJ = lj));
    }
    
    public final void LIZ(final EmoteModel emoteModel) {
        this.LIZ.append('\ufffc');
        final SpannableStringBuilder liz = this.LIZ;
        final Drawable mutate = emoteModel.LJIIL.mutate();
        final int ljiizilj = this.LJIIZILJ;
        mutate.setBounds(0, 0, ljiizilj, ljiizilj);
        08U.LIZIZ(mutate, Ghp.LIZ(super.LJIILJJIL) ? 1 : 0);
        n.LIZIZ((Object)mutate, "");
        final 7wk 7wk = new 7wk(mutate);
        7wk.LIZ((float)this.LJIJI);
        7wk.LIZJ = this.LJIJ;
        liz.setSpan((Object)7wk, this.LIZ.length() - 1, this.LIZ.length(), 33);
        this.LIZJ.add(emoteModel);
        this.LJI();
        final b ljiilliil = this.LJIILLIIL;
        if (ljiilliil != null) {
            ljiilliil.LIZ(this);
        }
    }
    
    public final void LIZ(final List<? extends EmoteModel> list) {
        for (int size = this.LIZJ.size(), i = 0; i < size; ++i) {
            this.LIZJ();
        }
        if (list != null) {
            final Iterator<EmoteModel> iterator = list.iterator();
            while (iterator.hasNext()) {
                this.LIZ(iterator.next());
            }
        }
    }
    
    @Override
    public final void LIZ(final boolean b) {
        super.LIZ(b);
        final Gnv liziz = this.LIZIZ;
        if (liziz != null && b) {
            final Fvx liz = Fvx.LIZ;
            if (DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class) != null) {
                final HashMap hashMap = new HashMap();
                final String s = (String)DataChannelGlobal.LIZJ.LIZIZ((Class)2Do.class);
                final String s2 = "comment";
                String s3;
                if ((s3 = s) == null) {
                    s3 = "comment";
                }
                if (y.LIZ((CharSequence)s3)) {
                    s3 = s2;
                }
                hashMap.put("show_entrance", s3);
                liz.LIZ((Map)hashMap);
                final Gkn liz2 = Gkn.LJFF.LIZ("livesdk_privilege_emote_bar_show");
                liz2.LIZ();
                liz2.LIZ((Map)hashMap);
                liz2.LIZLLL();
            }
            final int value = LiveCommentEmoteInputMaxCount.INSTANCE.getValue();
            final int size = liziz.LJIIJ.size();
            final JSONObject jsonObject = new JSONObject();
            0d3.LIZ(jsonObject, "limit_emotes_size", value);
            0d3.LIZ(jsonObject, "total_emotes_size", size);
            Gkm.LIZ(Gkm.LIZJ, "subscription_emote_panel_show", jsonObject);
            if (!liziz.LJI && !liziz.LJIIIIZZ) {
                Fvx.LIZ.LIZ("emote_bar");
            }
        }
    }
    
    @Override
    public final View LIZIZ(final ViewGroup viewGroup) {
        MethodCollector.i(7830);
        CTM.LIZ((Object)viewGroup);
        final HorizontalScrollView horizontalScrollView = new HorizontalScrollView(super.LJIILJJIL);
        horizontalScrollView.setScrollBarSize(0);
        final 1ib ljiill = new 1ib(super.LJIILJJIL);
        ljiill.setGravity(16);
        ljiill.setSingleLine(true);
        ljiill.LIZ(2131886910);
        ljiill.setTextColor(0eI.LIZ((View)ljiill, 2130971383));
        horizontalScrollView.addView((View)(this.LJIILL = ljiill), -2, -1);
        this.LJI();
        MethodCollector.o(7830);
        return (View)horizontalScrollView;
    }
    
    @Override
    public final void LIZIZ(final boolean b) {
        super.LIZIZ(b);
        this.LJI();
        this.LJ();
    }
    
    @Override
    public final View LIZJ(final ViewGroup viewGroup) {
        CTM.LIZ((Object)viewGroup);
        final View lizj = super.LIZJ(viewGroup);
        final int liz = Go9.LIZ.LIZ(super.LJII);
        if ((liz == 1 || liz == 2) && !this.LJI) {
            this.LJFF().setVisibility(8);
        }
        return lizj;
    }
    
    @Override
    public final void LIZJ() {
        final SpannableStringBuilder liz = this.LIZ;
        int n;
        if (((CharSequence)liz).length() > 0) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (n != 0 && liz != null) {
            liz.delete(this.LIZ.length() - 1, this.LIZ.length());
        }
        final List<EmoteModel> lizj = this.LIZJ;
        if ((lizj.isEmpty() ^ true) && lizj != null) {
            lizj.remove(Ey9.LIZ((List)this.LIZJ));
        }
        this.LJI();
        final b ljiilliil = this.LJIILLIIL;
        if (ljiilliil != null) {
            ljiilliil.LIZ(this);
        }
        if (this.LJI) {
            final a lj = this.LJ;
            if (lj != null) {
                lj.LIZIZ();
            }
        }
    }
    
    @Override
    public final boolean LIZLLL() {
        return ((CharSequence)this.LIZ).length() == 0;
    }
    
    public final void LJ() {
        if (super.LJIILIIL) {
            final Gnv liziz = this.LIZIZ;
            if (liziz != null) {
                liziz.LIZ(true);
            }
            return;
        }
        if (this.LIZJ.size() >= this.LIZLLL) {
            final Gnv liziz2 = this.LIZIZ;
            if (liziz2 != null) {
                liziz2.LIZ(true);
            }
            return;
        }
        final Gnv liziz3 = this.LIZIZ;
        if (liziz3 != null) {
            liziz3.LIZ(false);
        }
    }
    
    public interface a extends b
    {
        default static {
            Covode.recordClassIndex(4601);
        }
        
        void LIZ(final List<? extends EmoteModel> p0);
    }
}
