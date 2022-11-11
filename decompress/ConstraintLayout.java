// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.widget;

import X.13m;
import X.05Y;
import java.util.Iterator;
import java.util.List;
import X.05H;
import X.057;
import X.05Q;
import android.graphics.Paint;
import android.graphics.Canvas;
import android.view.ViewGroup$LayoutParams;
import X.05Z;
import android.view.View$MeasureSpec;
import X.13o;
import X.05D;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import X.05G;
import X.05R;
import X.1fh;
import java.util.HashMap;
import X.05c;
import X.05a;
import java.util.ArrayList;
import android.view.View;
import android.util.SparseArray;
import android.view.ViewGroup;

public class ConstraintLayout extends ViewGroup
{
    public SparseArray<View> mChildrenByIds;
    public ArrayList<05a> mConstraintHelpers;
    public 05c mConstraintSet;
    public int mConstraintSetId;
    public HashMap<String, Integer> mDesignIds;
    public boolean mDirtyHierarchy;
    public int mLastMeasureHeight;
    public int mLastMeasureHeightMode;
    public int mLastMeasureHeightSize;
    public int mLastMeasureWidth;
    public int mLastMeasureWidthMode;
    public int mLastMeasureWidthSize;
    public 1fh mLayoutWidget;
    public int mMaxHeight;
    public int mMaxWidth;
    public 05R mMetrics;
    public int mMinHeight;
    public int mMinWidth;
    public int mOptimizationLevel;
    public final ArrayList<05G> mVariableDimensionsWidgets;
    
    static {
        Covode.recordClassIndex(632);
    }
    
    public ConstraintLayout(final Context context) {
        super(context);
        this.mChildrenByIds = (SparseArray<View>)new SparseArray();
        this.mConstraintHelpers = new ArrayList<05a>(4);
        this.mVariableDimensionsWidgets = new ArrayList<05G>(100);
        this.mLayoutWidget = new 1fh();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 7;
        this.mConstraintSet = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<String, Integer>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.init(null);
    }
    
    public ConstraintLayout(final Context context, final AttributeSet set) {
        super(context, set);
        this.mChildrenByIds = (SparseArray<View>)new SparseArray();
        this.mConstraintHelpers = new ArrayList<05a>(4);
        this.mVariableDimensionsWidgets = new ArrayList<05G>(100);
        this.mLayoutWidget = new 1fh();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 7;
        this.mConstraintSet = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<String, Integer>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.init(set);
    }
    
    public ConstraintLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.mChildrenByIds = (SparseArray<View>)new SparseArray();
        this.mConstraintHelpers = new ArrayList<05a>(4);
        this.mVariableDimensionsWidgets = new ArrayList<05G>(100);
        this.mLayoutWidget = new 1fh();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 7;
        this.mConstraintSet = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<String, Integer>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.init(set);
    }
    
    private final 05G getTargetWidget(final int n) {
        if (n == 0) {
            return this.mLayoutWidget;
        }
        View view;
        if ((view = (View)this.mChildrenByIds.get(n)) == null) {
            final View viewById = this.findViewById(n);
            if (viewById == null) {
                return null;
            }
            if ((view = viewById) != this) {
                view = viewById;
                if (viewById.getParent() == this) {
                    this.onViewAdded(viewById);
                    view = viewById;
                }
            }
        }
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view != null) {
            return ((ConstraintLayout.a)view.getLayoutParams()).widget;
        }
        return null;
    }
    
    private void init(final AttributeSet p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        androidx/constraintlayout/widget/ConstraintLayout.mLayoutWidget:LX/1fh;
        //     4: aload_0        
        //     5: putfield        X/05G.mCompanionWidget:Ljava/lang/Object;
        //     8: aload_0        
        //     9: getfield        androidx/constraintlayout/widget/ConstraintLayout.mChildrenByIds:Landroid/util/SparseArray;
        //    12: aload_0        
        //    13: invokevirtual   androidx/constraintlayout/widget/ConstraintLayout.getId:()I
        //    16: aload_0        
        //    17: invokevirtual   android/util/SparseArray.put:(ILjava/lang/Object;)V
        //    20: aconst_null    
        //    21: astore_2       
        //    22: aload_0        
        //    23: aconst_null    
        //    24: putfield        androidx/constraintlayout/widget/ConstraintLayout.mConstraintSet:LX/05c;
        //    27: aload_1        
        //    28: ifnull          2871
        //    31: aload_0        
        //    32: invokevirtual   androidx/constraintlayout/widget/ConstraintLayout.getContext:()Landroid/content/Context;
        //    35: aload_1        
        //    36: bipush          60
        //    38: newarray        I
        //    40: dup            
        //    41: iconst_0       
        //    42: ldc             16842948
        //    44: iastore        
        //    45: dup            
        //    46: iconst_1       
        //    47: ldc             16843039
        //    49: iastore        
        //    50: dup            
        //    51: iconst_2       
        //    52: ldc             16843040
        //    54: iastore        
        //    55: dup            
        //    56: iconst_3       
        //    57: ldc             16843071
        //    59: iastore        
        //    60: dup            
        //    61: iconst_4       
        //    62: ldc             16843072
        //    64: iastore        
        //    65: dup            
        //    66: iconst_5       
        //    67: ldc             2130969098
        //    69: iastore        
        //    70: dup            
        //    71: bipush          6
        //    73: ldc             2130969099
        //    75: iastore        
        //    76: dup            
        //    77: bipush          7
        //    79: ldc             2130969229
        //    81: iastore        
        //    82: dup            
        //    83: bipush          8
        //    85: ldc             2130969379
        //    87: iastore        
        //    88: dup            
        //    89: bipush          9
        //    91: ldc             2130969380
        //    93: iastore        
        //    94: dup            
        //    95: bipush          10
        //    97: ldc             2130969795
        //    99: iastore        
        //   100: dup            
        //   101: bipush          11
        //   103: ldc             2130969796
        //   105: iastore        
        //   106: dup            
        //   107: bipush          12
        //   109: ldc             2130969797
        //   111: iastore        
        //   112: dup            
        //   113: bipush          13
        //   115: ldc             2130969798
        //   117: iastore        
        //   118: dup            
        //   119: bipush          14
        //   121: ldc             2130969799
        //   123: iastore        
        //   124: dup            
        //   125: bipush          15
        //   127: ldc             2130969800
        //   129: iastore        
        //   130: dup            
        //   131: bipush          16
        //   133: ldc             2130969801
        //   135: iastore        
        //   136: dup            
        //   137: bipush          17
        //   139: ldc             2130969802
        //   141: iastore        
        //   142: dup            
        //   143: bipush          18
        //   145: ldc             2130969803
        //   147: iastore        
        //   148: dup            
        //   149: bipush          19
        //   151: ldc             2130969804
        //   153: iastore        
        //   154: dup            
        //   155: bipush          20
        //   157: ldc             2130969805
        //   159: iastore        
        //   160: dup            
        //   161: bipush          21
        //   163: ldc             2130969806
        //   165: iastore        
        //   166: dup            
        //   167: bipush          22
        //   169: ldc             2130969807
        //   171: iastore        
        //   172: dup            
        //   173: bipush          23
        //   175: ldc             2130969808
        //   177: iastore        
        //   178: dup            
        //   179: bipush          24
        //   181: ldc             2130969809
        //   183: iastore        
        //   184: dup            
        //   185: bipush          25
        //   187: ldc             2130969810
        //   189: iastore        
        //   190: dup            
        //   191: bipush          26
        //   193: ldc             2130969811
        //   195: iastore        
        //   196: dup            
        //   197: bipush          27
        //   199: ldc             2130969812
        //   201: iastore        
        //   202: dup            
        //   203: bipush          28
        //   205: ldc             2130969813
        //   207: iastore        
        //   208: dup            
        //   209: bipush          29
        //   211: ldc             2130969814
        //   213: iastore        
        //   214: dup            
        //   215: bipush          30
        //   217: ldc             2130969815
        //   219: iastore        
        //   220: dup            
        //   221: bipush          31
        //   223: ldc             2130969816
        //   225: iastore        
        //   226: dup            
        //   227: bipush          32
        //   229: ldc             2130969817
        //   231: iastore        
        //   232: dup            
        //   233: bipush          33
        //   235: ldc             2130969818
        //   237: iastore        
        //   238: dup            
        //   239: bipush          34
        //   241: ldc             2130969819
        //   243: iastore        
        //   244: dup            
        //   245: bipush          35
        //   247: ldc             2130969820
        //   249: iastore        
        //   250: dup            
        //   251: bipush          36
        //   253: ldc             2130969821
        //   255: iastore        
        //   256: dup            
        //   257: bipush          37
        //   259: ldc             2130969822
        //   261: iastore        
        //   262: dup            
        //   263: bipush          38
        //   265: ldc             2130969823
        //   267: iastore        
        //   268: dup            
        //   269: bipush          39
        //   271: ldc             2130969824
        //   273: iastore        
        //   274: dup            
        //   275: bipush          40
        //   277: ldc             2130969825
        //   279: iastore        
        //   280: dup            
        //   281: bipush          41
        //   283: ldc             2130969826
        //   285: iastore        
        //   286: dup            
        //   287: bipush          42
        //   289: ldc             2130969827
        //   291: iastore        
        //   292: dup            
        //   293: bipush          43
        //   295: ldc             2130969828
        //   297: iastore        
        //   298: dup            
        //   299: bipush          44
        //   301: ldc             2130969829
        //   303: iastore        
        //   304: dup            
        //   305: bipush          45
        //   307: ldc             2130969830
        //   309: iastore        
        //   310: dup            
        //   311: bipush          46
        //   313: ldc             2130969831
        //   315: iastore        
        //   316: dup            
        //   317: bipush          47
        //   319: ldc             2130969832
        //   321: iastore        
        //   322: dup            
        //   323: bipush          48
        //   325: ldc             2130969833
        //   327: iastore        
        //   328: dup            
        //   329: bipush          49
        //   331: ldc             2130969834
        //   333: iastore        
        //   334: dup            
        //   335: bipush          50
        //   337: ldc             2130969835
        //   339: iastore        
        //   340: dup            
        //   341: bipush          51
        //   343: ldc             2130969837
        //   345: iastore        
        //   346: dup            
        //   347: bipush          52
        //   349: ldc             2130969838
        //   351: iastore        
        //   352: dup            
        //   353: bipush          53
        //   355: ldc             2130969842
        //   357: iastore        
        //   358: dup            
        //   359: bipush          54
        //   361: ldc             2130969843
        //   363: iastore        
        //   364: dup            
        //   365: bipush          55
        //   367: ldc             2130969844
        //   369: iastore        
        //   370: dup            
        //   371: bipush          56
        //   373: ldc             2130969845
        //   375: iastore        
        //   376: dup            
        //   377: bipush          57
        //   379: ldc             2130969846
        //   381: iastore        
        //   382: dup            
        //   383: bipush          58
        //   385: ldc             2130969847
        //   387: iastore        
        //   388: dup            
        //   389: bipush          59
        //   391: ldc             2130969858
        //   393: iastore        
        //   394: invokevirtual   android/content/Context.obtainStyledAttributes:(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
        //   397: astore_3       
        //   398: aload_3        
        //   399: invokevirtual   android/content/res/TypedArray.getIndexCount:()I
        //   402: istore          4
        //   404: iconst_0       
        //   405: istore          5
        //   407: aload_2        
        //   408: astore_1       
        //   409: iload           5
        //   411: iload           4
        //   413: if_icmpge       2867
        //   416: aload_3        
        //   417: iload           5
        //   419: invokevirtual   android/content/res/TypedArray.getIndex:(I)I
        //   422: istore          6
        //   424: iload           6
        //   426: iconst_3       
        //   427: if_icmpne       454
        //   430: aload_0        
        //   431: aload_3        
        //   432: iload           6
        //   434: aload_0        
        //   435: getfield        androidx/constraintlayout/widget/ConstraintLayout.mMinWidth:I
        //   438: invokevirtual   android/content/res/TypedArray.getDimensionPixelOffset:(II)I
        //   441: putfield        androidx/constraintlayout/widget/ConstraintLayout.mMinWidth:I
        //   444: aload_1        
        //   445: astore_2       
        //   446: iinc            5, 1
        //   449: aload_2        
        //   450: astore_1       
        //   451: goto            409
        //   454: iload           6
        //   456: iconst_4       
        //   457: if_icmpne       479
        //   460: aload_0        
        //   461: aload_3        
        //   462: iload           6
        //   464: aload_0        
        //   465: getfield        androidx/constraintlayout/widget/ConstraintLayout.mMinHeight:I
        //   468: invokevirtual   android/content/res/TypedArray.getDimensionPixelOffset:(II)I
        //   471: putfield        androidx/constraintlayout/widget/ConstraintLayout.mMinHeight:I
        //   474: aload_1        
        //   475: astore_2       
        //   476: goto            446
        //   479: iload           6
        //   481: iconst_1       
        //   482: if_icmpne       504
        //   485: aload_0        
        //   486: aload_3        
        //   487: iload           6
        //   489: aload_0        
        //   490: getfield        androidx/constraintlayout/widget/ConstraintLayout.mMaxWidth:I
        //   493: invokevirtual   android/content/res/TypedArray.getDimensionPixelOffset:(II)I
        //   496: putfield        androidx/constraintlayout/widget/ConstraintLayout.mMaxWidth:I
        //   499: aload_1        
        //   500: astore_2       
        //   501: goto            446
        //   504: iload           6
        //   506: iconst_2       
        //   507: if_icmpne       529
        //   510: aload_0        
        //   511: aload_3        
        //   512: iload           6
        //   514: aload_0        
        //   515: getfield        androidx/constraintlayout/widget/ConstraintLayout.mMaxHeight:I
        //   518: invokevirtual   android/content/res/TypedArray.getDimensionPixelOffset:(II)I
        //   521: putfield        androidx/constraintlayout/widget/ConstraintLayout.mMaxHeight:I
        //   524: aload_1        
        //   525: astore_2       
        //   526: goto            446
        //   529: iload           6
        //   531: bipush          59
        //   533: if_icmpne       555
        //   536: aload_0        
        //   537: aload_3        
        //   538: iload           6
        //   540: aload_0        
        //   541: getfield        androidx/constraintlayout/widget/ConstraintLayout.mOptimizationLevel:I
        //   544: invokevirtual   android/content/res/TypedArray.getInt:(II)I
        //   547: putfield        androidx/constraintlayout/widget/ConstraintLayout.mOptimizationLevel:I
        //   550: aload_1        
        //   551: astore_2       
        //   552: goto            446
        //   555: aload_1        
        //   556: astore_2       
        //   557: iload           6
        //   559: bipush          8
        //   561: if_icmpne       446
        //   564: aload_3        
        //   565: iload           6
        //   567: iconst_0       
        //   568: invokevirtual   android/content/res/TypedArray.getResourceId:(II)I
        //   571: istore          7
        //   573: new             LX/05c;
        //   576: astore_2       
        //   577: aload_2        
        //   578: invokespecial   X/05c.<init>:()V
        //   581: aload_0        
        //   582: aload_2        
        //   583: putfield        androidx/constraintlayout/widget/ConstraintLayout.mConstraintSet:LX/05c;
        //   586: aload_0        
        //   587: invokevirtual   androidx/constraintlayout/widget/ConstraintLayout.getContext:()Landroid/content/Context;
        //   590: astore          8
        //   592: aload           8
        //   594: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //   597: iload           7
        //   599: invokevirtual   android/content/res/Resources.getXml:(I)Landroid/content/res/XmlResourceParser;
        //   602: astore          9
        //   604: aload           9
        //   606: invokeinterface org/xmlpull/v1/XmlPullParser.getEventType:()I
        //   611: istore          6
        //   613: iload           6
        //   615: iconst_1       
        //   616: if_icmpeq       2839
        //   619: iload           6
        //   621: ifeq            2798
        //   624: iload           6
        //   626: iconst_2       
        //   627: if_icmpeq       633
        //   630: goto            2806
        //   633: aload           9
        //   635: invokeinterface org/xmlpull/v1/XmlPullParser.getName:()Ljava/lang/String;
        //   640: astore_1       
        //   641: aload           9
        //   643: invokestatic    android/util/Xml.asAttributeSet:(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;
        //   646: astore          10
        //   648: new             LX/05b;
        //   651: astore          11
        //   653: aload           11
        //   655: iconst_0       
        //   656: invokespecial   X/05b.<init>:(B)V
        //   659: aload           8
        //   661: aload           10
        //   663: bipush          80
        //   665: newarray        I
        //   667: dup            
        //   668: iconst_0       
        //   669: ldc             16842948
        //   671: iastore        
        //   672: dup            
        //   673: iconst_1       
        //   674: ldc_w           16842960
        //   677: iastore        
        //   678: dup            
        //   679: iconst_2       
        //   680: ldc_w           16842972
        //   683: iastore        
        //   684: dup            
        //   685: iconst_3       
        //   686: ldc_w           16842996
        //   689: iastore        
        //   690: dup            
        //   691: iconst_4       
        //   692: ldc_w           16842997
        //   695: iastore        
        //   696: dup            
        //   697: iconst_5       
        //   698: ldc_w           16842999
        //   701: iastore        
        //   702: dup            
        //   703: bipush          6
        //   705: ldc_w           16843000
        //   708: iastore        
        //   709: dup            
        //   710: bipush          7
        //   712: ldc_w           16843001
        //   715: iastore        
        //   716: dup            
        //   717: bipush          8
        //   719: ldc_w           16843002
        //   722: iastore        
        //   723: dup            
        //   724: bipush          9
        //   726: ldc             16843039
        //   728: iastore        
        //   729: dup            
        //   730: bipush          10
        //   732: ldc             16843040
        //   734: iastore        
        //   735: dup            
        //   736: bipush          11
        //   738: ldc             16843071
        //   740: iastore        
        //   741: dup            
        //   742: bipush          12
        //   744: ldc             16843072
        //   746: iastore        
        //   747: dup            
        //   748: bipush          13
        //   750: ldc_w           16843551
        //   753: iastore        
        //   754: dup            
        //   755: bipush          14
        //   757: ldc_w           16843552
        //   760: iastore        
        //   761: dup            
        //   762: bipush          15
        //   764: ldc_w           16843553
        //   767: iastore        
        //   768: dup            
        //   769: bipush          16
        //   771: ldc_w           16843554
        //   774: iastore        
        //   775: dup            
        //   776: bipush          17
        //   778: ldc_w           16843555
        //   781: iastore        
        //   782: dup            
        //   783: bipush          18
        //   785: ldc_w           16843556
        //   788: iastore        
        //   789: dup            
        //   790: bipush          19
        //   792: ldc_w           16843557
        //   795: iastore        
        //   796: dup            
        //   797: bipush          20
        //   799: ldc_w           16843558
        //   802: iastore        
        //   803: dup            
        //   804: bipush          21
        //   806: ldc_w           16843559
        //   809: iastore        
        //   810: dup            
        //   811: bipush          22
        //   813: ldc_w           16843560
        //   816: iastore        
        //   817: dup            
        //   818: bipush          23
        //   820: ldc_w           16843701
        //   823: iastore        
        //   824: dup            
        //   825: bipush          24
        //   827: ldc_w           16843702
        //   830: iastore        
        //   831: dup            
        //   832: bipush          25
        //   834: ldc_w           16843770
        //   837: iastore        
        //   838: dup            
        //   839: bipush          26
        //   841: ldc_w           16843840
        //   844: iastore        
        //   845: dup            
        //   846: bipush          27
        //   848: ldc             2130969098
        //   850: iastore        
        //   851: dup            
        //   852: bipush          28
        //   854: ldc             2130969099
        //   856: iastore        
        //   857: dup            
        //   858: bipush          29
        //   860: ldc             2130969229
        //   862: iastore        
        //   863: dup            
        //   864: bipush          30
        //   866: ldc             2130969380
        //   868: iastore        
        //   869: dup            
        //   870: bipush          31
        //   872: ldc             2130969795
        //   874: iastore        
        //   875: dup            
        //   876: bipush          32
        //   878: ldc             2130969796
        //   880: iastore        
        //   881: dup            
        //   882: bipush          33
        //   884: ldc             2130969797
        //   886: iastore        
        //   887: dup            
        //   888: bipush          34
        //   890: ldc             2130969798
        //   892: iastore        
        //   893: dup            
        //   894: bipush          35
        //   896: ldc             2130969799
        //   898: iastore        
        //   899: dup            
        //   900: bipush          36
        //   902: ldc             2130969800
        //   904: iastore        
        //   905: dup            
        //   906: bipush          37
        //   908: ldc             2130969801
        //   910: iastore        
        //   911: dup            
        //   912: bipush          38
        //   914: ldc             2130969802
        //   916: iastore        
        //   917: dup            
        //   918: bipush          39
        //   920: ldc             2130969803
        //   922: iastore        
        //   923: dup            
        //   924: bipush          40
        //   926: ldc             2130969804
        //   928: iastore        
        //   929: dup            
        //   930: bipush          41
        //   932: ldc             2130969805
        //   934: iastore        
        //   935: dup            
        //   936: bipush          42
        //   938: ldc             2130969806
        //   940: iastore        
        //   941: dup            
        //   942: bipush          43
        //   944: ldc             2130969807
        //   946: iastore        
        //   947: dup            
        //   948: bipush          44
        //   950: ldc             2130969808
        //   952: iastore        
        //   953: dup            
        //   954: bipush          45
        //   956: ldc             2130969809
        //   958: iastore        
        //   959: dup            
        //   960: bipush          46
        //   962: ldc             2130969810
        //   964: iastore        
        //   965: dup            
        //   966: bipush          47
        //   968: ldc             2130969811
        //   970: iastore        
        //   971: dup            
        //   972: bipush          48
        //   974: ldc             2130969812
        //   976: iastore        
        //   977: dup            
        //   978: bipush          49
        //   980: ldc             2130969813
        //   982: iastore        
        //   983: dup            
        //   984: bipush          50
        //   986: ldc             2130969814
        //   988: iastore        
        //   989: dup            
        //   990: bipush          51
        //   992: ldc             2130969815
        //   994: iastore        
        //   995: dup            
        //   996: bipush          52
        //   998: ldc             2130969816
        //  1000: iastore        
        //  1001: dup            
        //  1002: bipush          53
        //  1004: ldc             2130969817
        //  1006: iastore        
        //  1007: dup            
        //  1008: bipush          54
        //  1010: ldc             2130969818
        //  1012: iastore        
        //  1013: dup            
        //  1014: bipush          55
        //  1016: ldc             2130969819
        //  1018: iastore        
        //  1019: dup            
        //  1020: bipush          56
        //  1022: ldc             2130969820
        //  1024: iastore        
        //  1025: dup            
        //  1026: bipush          57
        //  1028: ldc             2130969821
        //  1030: iastore        
        //  1031: dup            
        //  1032: bipush          58
        //  1034: ldc             2130969822
        //  1036: iastore        
        //  1037: dup            
        //  1038: bipush          59
        //  1040: ldc             2130969823
        //  1042: iastore        
        //  1043: dup            
        //  1044: bipush          60
        //  1046: ldc             2130969824
        //  1048: iastore        
        //  1049: dup            
        //  1050: bipush          61
        //  1052: ldc             2130969825
        //  1054: iastore        
        //  1055: dup            
        //  1056: bipush          62
        //  1058: ldc             2130969826
        //  1060: iastore        
        //  1061: dup            
        //  1062: bipush          63
        //  1064: ldc             2130969827
        //  1066: iastore        
        //  1067: dup            
        //  1068: bipush          64
        //  1070: ldc             2130969828
        //  1072: iastore        
        //  1073: dup            
        //  1074: bipush          65
        //  1076: ldc             2130969829
        //  1078: iastore        
        //  1079: dup            
        //  1080: bipush          66
        //  1082: ldc             2130969830
        //  1084: iastore        
        //  1085: dup            
        //  1086: bipush          67
        //  1088: ldc             2130969831
        //  1090: iastore        
        //  1091: dup            
        //  1092: bipush          68
        //  1094: ldc             2130969832
        //  1096: iastore        
        //  1097: dup            
        //  1098: bipush          69
        //  1100: ldc             2130969833
        //  1102: iastore        
        //  1103: dup            
        //  1104: bipush          70
        //  1106: ldc             2130969834
        //  1108: iastore        
        //  1109: dup            
        //  1110: bipush          71
        //  1112: ldc             2130969835
        //  1114: iastore        
        //  1115: dup            
        //  1116: bipush          72
        //  1118: ldc             2130969837
        //  1120: iastore        
        //  1121: dup            
        //  1122: bipush          73
        //  1124: ldc             2130969838
        //  1126: iastore        
        //  1127: dup            
        //  1128: bipush          74
        //  1130: ldc             2130969842
        //  1132: iastore        
        //  1133: dup            
        //  1134: bipush          75
        //  1136: ldc             2130969843
        //  1138: iastore        
        //  1139: dup            
        //  1140: bipush          76
        //  1142: ldc             2130969844
        //  1144: iastore        
        //  1145: dup            
        //  1146: bipush          77
        //  1148: ldc             2130969845
        //  1150: iastore        
        //  1151: dup            
        //  1152: bipush          78
        //  1154: ldc             2130969846
        //  1156: iastore        
        //  1157: dup            
        //  1158: bipush          79
        //  1160: ldc             2130969847
        //  1162: iastore        
        //  1163: invokevirtual   android/content/Context.obtainStyledAttributes:(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
        //  1166: astore          10
        //  1168: aload           10
        //  1170: invokevirtual   android/content/res/TypedArray.getIndexCount:()I
        //  1173: istore          12
        //  1175: iconst_0       
        //  1176: istore          6
        //  1178: iload           6
        //  1180: iload           12
        //  1182: if_icmpge       2756
        //  1185: aload           10
        //  1187: iload           6
        //  1189: invokevirtual   android/content/res/TypedArray.getIndex:(I)I
        //  1192: istore          13
        //  1194: getstatic       X/05c.LIZJ:Landroid/util/SparseIntArray;
        //  1197: iload           13
        //  1199: invokevirtual   android/util/SparseIntArray.get:(I)I
        //  1202: istore          14
        //  1204: iload           14
        //  1206: bipush          69
        //  1208: if_icmpeq       1214
        //  1211: goto            1230
        //  1214: aload           11
        //  1216: aload           10
        //  1218: iload           13
        //  1220: fconst_1       
        //  1221: invokevirtual   android/content/res/TypedArray.getFloat:(IF)F
        //  1224: putfield        X/05b.LJJLIIJ:F
        //  1227: goto            1524
        //  1230: iload           14
        //  1232: bipush          70
        //  1234: if_icmpeq       2740
        //  1237: iload           14
        //  1239: tableswitch {
        //                2: 2720
        //                3: 2700
        //                4: 2680
        //                5: 2660
        //                6: 2645
        //                7: 2625
        //                8: 2605
        //                9: 2585
        //               10: 2565
        //               11: 2545
        //               12: 2525
        //               13: 2505
        //               14: 2485
        //               15: 2465
        //               16: 2445
        //               17: 2425
        //               18: 2405
        //               19: 2385
        //               20: 2365
        //               21: 2345
        //               22: 2325
        //               23: 2291
        //               24: 2271
        //               25: 2251
        //               26: 2231
        //               27: 2211
        //               28: 2191
        //               29: 2171
        //               30: 2151
        //               31: 2131
        //               32: 2111
        //               33: 2091
        //               34: 2071
        //               35: 2051
        //               36: 2031
        //               37: 2011
        //               38: 1991
        //               39: 1971
        //               40: 1951
        //               41: 1931
        //               42: 1911
        //               43: 1891
        //               44: 1871
        //               45: 1845
        //               46: 1825
        //               47: 1805
        //               48: 1785
        //               49: 1765
        //               50: 1745
        //               51: 1725
        //               52: 1705
        //               53: 1685
        //               54: 1665
        //          default: 1464
        //        }
        //  1464: iload           14
        //  1466: tableswitch {
        //              120: 1645
        //              121: 1625
        //              122: 1605
        //              123: 1585
        //          default: 1496
        //        }
        //  1496: iload           14
        //  1498: tableswitch {
        //              144: 1565
        //              145: 1550
        //              146: 1530
        //          default: 1524
        //        }
        //  1524: iinc            6, 1
        //  1527: goto            1178
        //  1530: aload           11
        //  1532: aload           10
        //  1534: iload           13
        //  1536: aload           11
        //  1538: getfield        X/05b.LJJLJ:Z
        //  1541: invokevirtual   android/content/res/TypedArray.getBoolean:(IZ)Z
        //  1544: putfield        X/05b.LJJLJ:Z
        //  1547: goto            1524
        //  1550: aload           11
        //  1552: aload           10
        //  1554: iload           13
        //  1556: invokevirtual   android/content/res/TypedArray.getString:(I)Ljava/lang/String;
        //  1559: putfield        X/05b.LJJZZI:Ljava/lang/String;
        //  1562: goto            1524
        //  1565: aload           11
        //  1567: aload           10
        //  1569: iload           13
        //  1571: aload           11
        //  1573: getfield        X/05b.LJJLJLI:I
        //  1576: invokevirtual   android/content/res/TypedArray.getInt:(II)I
        //  1579: putfield        X/05b.LJJLJLI:I
        //  1582: goto            1524
        //  1585: aload           11
        //  1587: aload           10
        //  1589: iload           13
        //  1591: aload           11
        //  1593: getfield        X/05b.LJJIFFI:F
        //  1596: invokevirtual   android/content/res/TypedArray.getFloat:(IF)F
        //  1599: putfield        X/05b.LJJIFFI:F
        //  1602: goto            1524
        //  1605: aload           11
        //  1607: aload           10
        //  1609: iload           13
        //  1611: aload           11
        //  1613: getfield        X/05b.LJJI:I
        //  1616: invokevirtual   android/content/res/TypedArray.getDimensionPixelSize:(II)I
        //  1619: putfield        X/05b.LJJI:I
        //  1622: goto            1524
        //  1625: aload           11
        //  1627: aload           10
        //  1629: iload           13
        //  1631: aload           11
        //  1633: getfield        X/05b.LJJ:I
        //  1636: invokestatic    X/05c.LIZ:(Landroid/content/res/TypedArray;II)I
        //  1639: putfield        X/05b.LJJ:I
        //  1642: goto            1524
        //  1645: aload           11
        //  1647: aload           10
        //  1649: iload           13
        //  1651: aload           11
        //  1653: getfield        X/05b.LJJJJLI:F
        //  1656: invokevirtual   android/content/res/TypedArray.getFloat:(IF)F
        //  1659: putfield        X/05b.LJJJJLI:F
        //  1662: goto            1524
        //  1665: aload           11
        //  1667: aload           10
        //  1669: iload           13
        //  1671: aload           11
        //  1673: getfield        X/05b.LJJLI:F
        //  1676: invokevirtual   android/content/res/TypedArray.getDimension:(IF)F
        //  1679: putfield        X/05b.LJJLI:F
        //  1682: goto            1524
        //  1685: aload           11
        //  1687: aload           10
        //  1689: iload           13
        //  1691: aload           11
        //  1693: getfield        X/05b.LJJL:F
        //  1696: invokevirtual   android/content/res/TypedArray.getDimension:(IF)F
        //  1699: putfield        X/05b.LJJL:F
        //  1702: goto            1524
        //  1705: aload           11
        //  1707: aload           10
        //  1709: iload           13
        //  1711: aload           11
        //  1713: getfield        X/05b.LJJJZ:F
        //  1716: invokevirtual   android/content/res/TypedArray.getDimension:(IF)F
        //  1719: putfield        X/05b.LJJJZ:F
        //  1722: goto            1524
        //  1725: aload           11
        //  1727: aload           10
        //  1729: iload           13
        //  1731: aload           11
        //  1733: getfield        X/05b.LJJJLZIJ:F
        //  1736: invokevirtual   android/content/res/TypedArray.getFloat:(IF)F
        //  1739: putfield        X/05b.LJJJLZIJ:F
        //  1742: goto            1524
        //  1745: aload           11
        //  1747: aload           10
        //  1749: iload           13
        //  1751: aload           11
        //  1753: getfield        X/05b.LJJJLL:F
        //  1756: invokevirtual   android/content/res/TypedArray.getFloat:(IF)F
        //  1759: putfield        X/05b.LJJJLL:F
        //  1762: goto            1524
        //  1765: aload           11
        //  1767: aload           10
        //  1769: iload           13
        //  1771: aload           11
        //  1773: getfield        X/05b.LJJJLIIL:F
        //  1776: invokevirtual   android/content/res/TypedArray.getFloat:(IF)F
        //  1779: putfield        X/05b.LJJJLIIL:F
        //  1782: goto            1524
        //  1785: aload           11
        //  1787: aload           10
        //  1789: iload           13
        //  1791: aload           11
        //  1793: getfield        X/05b.LJJJJZI:F
        //  1796: invokevirtual   android/content/res/TypedArray.getFloat:(IF)F
        //  1799: putfield        X/05b.LJJJJZI:F
        //  1802: goto            1524
        //  1805: aload           11
        //  1807: aload           10
        //  1809: iload           13
        //  1811: aload           11
        //  1813: getfield        X/05b.LJJJJZ:F
        //  1816: invokevirtual   android/content/res/TypedArray.getFloat:(IF)F
        //  1819: putfield        X/05b.LJJJJZ:F
        //  1822: goto            1524
        //  1825: aload           11
        //  1827: aload           10
        //  1829: iload           13
        //  1831: aload           11
        //  1833: getfield        X/05b.LJJJJLL:F
        //  1836: invokevirtual   android/content/res/TypedArray.getFloat:(IF)F
        //  1839: putfield        X/05b.LJJJJLL:F
        //  1842: goto            1524
        //  1845: aload           11
        //  1847: iconst_1       
        //  1848: putfield        X/05b.LJJJJJL:Z
        //  1851: aload           11
        //  1853: aload           10
        //  1855: iload           13
        //  1857: aload           11
        //  1859: getfield        X/05b.LJJJJL:F
        //  1862: invokevirtual   android/content/res/TypedArray.getDimension:(IF)F
        //  1865: putfield        X/05b.LJJJJL:F
        //  1868: goto            1524
        //  1871: aload           11
        //  1873: aload           10
        //  1875: iload           13
        //  1877: aload           11
        //  1879: getfield        X/05b.LJJJJJ:F
        //  1882: invokevirtual   android/content/res/TypedArray.getFloat:(IF)F
        //  1885: putfield        X/05b.LJJJJJ:F
        //  1888: goto            1524
        //  1891: aload           11
        //  1893: aload           10
        //  1895: iload           13
        //  1897: aload           11
        //  1899: getfield        X/05b.LJJJJIZL:I
        //  1902: invokevirtual   android/content/res/TypedArray.getInt:(II)I
        //  1905: putfield        X/05b.LJJJJIZL:I
        //  1908: goto            1524
        //  1911: aload           11
        //  1913: aload           10
        //  1915: iload           13
        //  1917: aload           11
        //  1919: getfield        X/05b.LJJJJI:I
        //  1922: invokevirtual   android/content/res/TypedArray.getInt:(II)I
        //  1925: putfield        X/05b.LJJJJI:I
        //  1928: goto            1524
        //  1931: aload           11
        //  1933: aload           10
        //  1935: iload           13
        //  1937: aload           11
        //  1939: getfield        X/05b.LJJJIL:F
        //  1942: invokevirtual   android/content/res/TypedArray.getFloat:(IF)F
        //  1945: putfield        X/05b.LJJJIL:F
        //  1948: goto            1524
        //  1951: aload           11
        //  1953: aload           10
        //  1955: iload           13
        //  1957: aload           11
        //  1959: getfield        X/05b.LJJJJ:F
        //  1962: invokevirtual   android/content/res/TypedArray.getFloat:(IF)F
        //  1965: putfield        X/05b.LJJJJ:F
        //  1968: goto            1524
        //  1971: aload           11
        //  1973: aload           10
        //  1975: iload           13
        //  1977: aload           11
        //  1979: getfield        X/05b.LIZLLL:I
        //  1982: invokevirtual   android/content/res/TypedArray.getResourceId:(II)I
        //  1985: putfield        X/05b.LIZLLL:I
        //  1988: goto            1524
        //  1991: aload           11
        //  1993: aload           10
        //  1995: iload           13
        //  1997: aload           11
        //  1999: getfield        X/05b.LJIJJLI:F
        //  2002: invokevirtual   android/content/res/TypedArray.getFloat:(IF)F
        //  2005: putfield        X/05b.LJIJJLI:F
        //  2008: goto            1524
        //  2011: aload           11
        //  2013: aload           10
        //  2015: iload           13
        //  2017: aload           11
        //  2019: getfield        X/05b.LJIIJJI:I
        //  2022: invokestatic    X/05c.LIZ:(Landroid/content/res/TypedArray;II)I
        //  2025: putfield        X/05b.LJIIJJI:I
        //  2028: goto            1524
        //  2031: aload           11
        //  2033: aload           10
        //  2035: iload           13
        //  2037: aload           11
        //  2039: getfield        X/05b.LJIIL:I
        //  2042: invokestatic    X/05c.LIZ:(Landroid/content/res/TypedArray;II)I
        //  2045: putfield        X/05b.LJIIL:I
        //  2048: goto            1524
        //  2051: aload           11
        //  2053: aload           10
        //  2055: iload           13
        //  2057: aload           11
        //  2059: getfield        X/05b.LJJIIZI:I
        //  2062: invokevirtual   android/content/res/TypedArray.getDimensionPixelSize:(II)I
        //  2065: putfield        X/05b.LJJIIZI:I
        //  2068: goto            1524
        //  2071: aload           11
        //  2073: aload           10
        //  2075: iload           13
        //  2077: aload           11
        //  2079: getfield        X/05b.LJIIZILJ:I
        //  2082: invokestatic    X/05c.LIZ:(Landroid/content/res/TypedArray;II)I
        //  2085: putfield        X/05b.LJIIZILJ:I
        //  2088: goto            1524
        //  2091: aload           11
        //  2093: aload           10
        //  2095: iload           13
        //  2097: aload           11
        //  2099: getfield        X/05b.LJIILLIIL:I
        //  2102: invokestatic    X/05c.LIZ:(Landroid/content/res/TypedArray;II)I
        //  2105: putfield        X/05b.LJIILLIIL:I
        //  2108: goto            1524
        //  2111: aload           11
        //  2113: aload           10
        //  2115: iload           13
        //  2117: aload           11
        //  2119: getfield        X/05b.LJJIJIIJIL:I
        //  2122: invokevirtual   android/content/res/TypedArray.getDimensionPixelSize:(II)I
        //  2125: putfield        X/05b.LJJIJIIJIL:I
        //  2128: goto            1524
        //  2131: aload           11
        //  2133: aload           10
        //  2135: iload           13
        //  2137: aload           11
        //  2139: getfield        X/05b.LJIIJ:I
        //  2142: invokestatic    X/05c.LIZ:(Landroid/content/res/TypedArray;II)I
        //  2145: putfield        X/05b.LJIIJ:I
        //  2148: goto            1524
        //  2151: aload           11
        //  2153: aload           10
        //  2155: iload           13
        //  2157: aload           11
        //  2159: getfield        X/05b.LJIIIZ:I
        //  2162: invokestatic    X/05c.LIZ:(Landroid/content/res/TypedArray;II)I
        //  2165: putfield        X/05b.LJIIIZ:I
        //  2168: goto            1524
        //  2171: aload           11
        //  2173: aload           10
        //  2175: iload           13
        //  2177: aload           11
        //  2179: getfield        X/05b.LJJIIZ:I
        //  2182: invokevirtual   android/content/res/TypedArray.getDimensionPixelSize:(II)I
        //  2185: putfield        X/05b.LJJIIZ:I
        //  2188: goto            1524
        //  2191: aload           11
        //  2193: aload           10
        //  2195: iload           13
        //  2197: aload           11
        //  2199: getfield        X/05b.LJJIIJ:I
        //  2202: invokevirtual   android/content/res/TypedArray.getInt:(II)I
        //  2205: putfield        X/05b.LJJIIJ:I
        //  2208: goto            1524
        //  2211: aload           11
        //  2213: aload           10
        //  2215: iload           13
        //  2217: aload           11
        //  2219: getfield        X/05b.LJIIIIZZ:I
        //  2222: invokestatic    X/05c.LIZ:(Landroid/content/res/TypedArray;II)I
        //  2225: putfield        X/05b.LJIIIIZZ:I
        //  2228: goto            1524
        //  2231: aload           11
        //  2233: aload           10
        //  2235: iload           13
        //  2237: aload           11
        //  2239: getfield        X/05b.LJII:I
        //  2242: invokestatic    X/05c.LIZ:(Landroid/content/res/TypedArray;II)I
        //  2245: putfield        X/05b.LJII:I
        //  2248: goto            1524
        //  2251: aload           11
        //  2253: aload           10
        //  2255: iload           13
        //  2257: aload           11
        //  2259: getfield        X/05b.LJJIIJZLJL:I
        //  2262: invokevirtual   android/content/res/TypedArray.getDimensionPixelSize:(II)I
        //  2265: putfield        X/05b.LJJIIJZLJL:I
        //  2268: goto            1524
        //  2271: aload           11
        //  2273: aload           10
        //  2275: iload           13
        //  2277: aload           11
        //  2279: getfield        X/05b.LIZIZ:I
        //  2282: invokevirtual   android/content/res/TypedArray.getLayoutDimension:(II)I
        //  2285: putfield        X/05b.LIZIZ:I
        //  2288: goto            1524
        //  2291: aload           11
        //  2293: aload           10
        //  2295: iload           13
        //  2297: aload           11
        //  2299: getfield        X/05b.LJJIJIL:I
        //  2302: invokevirtual   android/content/res/TypedArray.getInt:(II)I
        //  2305: putfield        X/05b.LJJIJIL:I
        //  2308: aload           11
        //  2310: getstatic       X/05c.LIZ:[I
        //  2313: aload           11
        //  2315: getfield        X/05b.LJJIJIL:I
        //  2318: iaload         
        //  2319: putfield        X/05b.LJJIJIL:I
        //  2322: goto            1524
        //  2325: aload           11
        //  2327: aload           10
        //  2329: iload           13
        //  2331: aload           11
        //  2333: getfield        X/05b.LIZJ:I
        //  2336: invokevirtual   android/content/res/TypedArray.getLayoutDimension:(II)I
        //  2339: putfield        X/05b.LIZJ:I
        //  2342: goto            1524
        //  2345: aload           11
        //  2347: aload           10
        //  2349: iload           13
        //  2351: aload           11
        //  2353: getfield        X/05b.LJIJJ:F
        //  2356: invokevirtual   android/content/res/TypedArray.getFloat:(IF)F
        //  2359: putfield        X/05b.LJIJJ:F
        //  2362: goto            1524
        //  2365: aload           11
        //  2367: aload           10
        //  2369: iload           13
        //  2371: aload           11
        //  2373: getfield        X/05b.LJI:F
        //  2376: invokevirtual   android/content/res/TypedArray.getFloat:(IF)F
        //  2379: putfield        X/05b.LJI:F
        //  2382: goto            1524
        //  2385: aload           11
        //  2387: aload           10
        //  2389: iload           13
        //  2391: aload           11
        //  2393: getfield        X/05b.LJFF:I
        //  2396: invokevirtual   android/content/res/TypedArray.getDimensionPixelOffset:(II)I
        //  2399: putfield        X/05b.LJFF:I
        //  2402: goto            1524
        //  2405: aload           11
        //  2407: aload           10
        //  2409: iload           13
        //  2411: aload           11
        //  2413: getfield        X/05b.LJ:I
        //  2416: invokevirtual   android/content/res/TypedArray.getDimensionPixelOffset:(II)I
        //  2419: putfield        X/05b.LJ:I
        //  2422: goto            1524
        //  2425: aload           11
        //  2427: aload           10
        //  2429: iload           13
        //  2431: aload           11
        //  2433: getfield        X/05b.LJJIJLIJ:I
        //  2436: invokevirtual   android/content/res/TypedArray.getDimensionPixelSize:(II)I
        //  2439: putfield        X/05b.LJJIJLIJ:I
        //  2442: goto            1524
        //  2445: aload           11
        //  2447: aload           10
        //  2449: iload           13
        //  2451: aload           11
        //  2453: getfield        X/05b.LJJJI:I
        //  2456: invokevirtual   android/content/res/TypedArray.getDimensionPixelSize:(II)I
        //  2459: putfield        X/05b.LJJJI:I
        //  2462: goto            1524
        //  2465: aload           11
        //  2467: aload           10
        //  2469: iload           13
        //  2471: aload           11
        //  2473: getfield        X/05b.LJJIL:I
        //  2476: invokevirtual   android/content/res/TypedArray.getDimensionPixelSize:(II)I
        //  2479: putfield        X/05b.LJJIL:I
        //  2482: goto            1524
        //  2485: aload           11
        //  2487: aload           10
        //  2489: iload           13
        //  2491: aload           11
        //  2493: getfield        X/05b.LJJIJL:I
        //  2496: invokevirtual   android/content/res/TypedArray.getDimensionPixelSize:(II)I
        //  2499: putfield        X/05b.LJJIJL:I
        //  2502: goto            1524
        //  2505: aload           11
        //  2507: aload           10
        //  2509: iload           13
        //  2511: aload           11
        //  2513: getfield        X/05b.LJJJ:I
        //  2516: invokevirtual   android/content/res/TypedArray.getDimensionPixelSize:(II)I
        //  2519: putfield        X/05b.LJJJ:I
        //  2522: goto            1524
        //  2525: aload           11
        //  2527: aload           10
        //  2529: iload           13
        //  2531: aload           11
        //  2533: getfield        X/05b.LJJIZ:I
        //  2536: invokevirtual   android/content/res/TypedArray.getDimensionPixelSize:(II)I
        //  2539: putfield        X/05b.LJJIZ:I
        //  2542: goto            1524
        //  2545: aload           11
        //  2547: aload           10
        //  2549: iload           13
        //  2551: aload           11
        //  2553: getfield        X/05b.LJIJ:I
        //  2556: invokestatic    X/05c.LIZ:(Landroid/content/res/TypedArray;II)I
        //  2559: putfield        X/05b.LJIJ:I
        //  2562: goto            1524
        //  2565: aload           11
        //  2567: aload           10
        //  2569: iload           13
        //  2571: aload           11
        //  2573: getfield        X/05b.LJIJI:I
        //  2576: invokestatic    X/05c.LIZ:(Landroid/content/res/TypedArray;II)I
        //  2579: putfield        X/05b.LJIJI:I
        //  2582: goto            1524
        //  2585: aload           11
        //  2587: aload           10
        //  2589: iload           13
        //  2591: aload           11
        //  2593: getfield        X/05b.LJJIJIIJI:I
        //  2596: invokevirtual   android/content/res/TypedArray.getDimensionPixelSize:(II)I
        //  2599: putfield        X/05b.LJJIJIIJI:I
        //  2602: goto            1524
        //  2605: aload           11
        //  2607: aload           10
        //  2609: iload           13
        //  2611: aload           11
        //  2613: getfield        X/05b.LJJIII:I
        //  2616: invokevirtual   android/content/res/TypedArray.getDimensionPixelOffset:(II)I
        //  2619: putfield        X/05b.LJJIII:I
        //  2622: goto            1524
        //  2625: aload           11
        //  2627: aload           10
        //  2629: iload           13
        //  2631: aload           11
        //  2633: getfield        X/05b.LJJII:I
        //  2636: invokevirtual   android/content/res/TypedArray.getDimensionPixelOffset:(II)I
        //  2639: putfield        X/05b.LJJII:I
        //  2642: goto            1524
        //  2645: aload           11
        //  2647: aload           10
        //  2649: iload           13
        //  2651: invokevirtual   android/content/res/TypedArray.getString:(I)Ljava/lang/String;
        //  2654: putfield        X/05b.LJIL:Ljava/lang/String;
        //  2657: goto            1524
        //  2660: aload           11
        //  2662: aload           10
        //  2664: iload           13
        //  2666: aload           11
        //  2668: getfield        X/05b.LJIILIIL:I
        //  2671: invokestatic    X/05c.LIZ:(Landroid/content/res/TypedArray;II)I
        //  2674: putfield        X/05b.LJIILIIL:I
        //  2677: goto            1524
        //  2680: aload           11
        //  2682: aload           10
        //  2684: iload           13
        //  2686: aload           11
        //  2688: getfield        X/05b.LJIILJJIL:I
        //  2691: invokestatic    X/05c.LIZ:(Landroid/content/res/TypedArray;II)I
        //  2694: putfield        X/05b.LJIILJJIL:I
        //  2697: goto            1524
        //  2700: aload           11
        //  2702: aload           10
        //  2704: iload           13
        //  2706: aload           11
        //  2708: getfield        X/05b.LJJIJ:I
        //  2711: invokevirtual   android/content/res/TypedArray.getDimensionPixelSize:(II)I
        //  2714: putfield        X/05b.LJJIJ:I
        //  2717: goto            1524
        //  2720: aload           11
        //  2722: aload           10
        //  2724: iload           13
        //  2726: aload           11
        //  2728: getfield        X/05b.LJIILL:I
        //  2731: invokestatic    X/05c.LIZ:(Landroid/content/res/TypedArray;II)I
        //  2734: putfield        X/05b.LJIILL:I
        //  2737: goto            1524
        //  2740: aload           11
        //  2742: aload           10
        //  2744: iload           13
        //  2746: fconst_1       
        //  2747: invokevirtual   android/content/res/TypedArray.getFloat:(IF)F
        //  2750: putfield        X/05b.LJJLIL:F
        //  2753: goto            1524
        //  2756: aload           10
        //  2758: invokevirtual   android/content/res/TypedArray.recycle:()V
        //  2761: aload_1        
        //  2762: ldc_w           "Guideline"
        //  2765: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //  2768: ifeq            2777
        //  2771: aload           11
        //  2773: iconst_1       
        //  2774: putfield        X/05b.LIZ:Z
        //  2777: aload_2        
        //  2778: getfield        X/05c.LIZIZ:Ljava/util/HashMap;
        //  2781: aload           11
        //  2783: getfield        X/05b.LIZLLL:I
        //  2786: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2789: aload           11
        //  2791: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  2794: pop            
        //  2795: goto            2806
        //  2798: aload           9
        //  2800: invokeinterface org/xmlpull/v1/XmlPullParser.getName:()Ljava/lang/String;
        //  2805: pop            
        //  2806: aload           9
        //  2808: invokeinterface org/xmlpull/v1/XmlPullParser.next:()I
        //  2813: istore          6
        //  2815: goto            613
        //  2818: astore_1       
        //  2819: goto            2827
        //  2822: astore_1       
        //  2823: goto            2835
        //  2826: astore_1       
        //  2827: aload_1        
        //  2828: invokestatic    X/0II.LIZ:(Ljava/lang/Exception;)V
        //  2831: goto            2839
        //  2834: astore_1       
        //  2835: aload_1        
        //  2836: invokestatic    X/0II.LIZ:(Ljava/lang/Exception;)V
        //  2839: aconst_null    
        //  2840: astore_1       
        //  2841: goto            2856
        //  2844: astore_1       
        //  2845: aconst_null    
        //  2846: astore_1       
        //  2847: goto            2851
        //  2850: astore_2       
        //  2851: aload_0        
        //  2852: aload_1        
        //  2853: putfield        androidx/constraintlayout/widget/ConstraintLayout.mConstraintSet:LX/05c;
        //  2856: aload_0        
        //  2857: iload           7
        //  2859: putfield        androidx/constraintlayout/widget/ConstraintLayout.mConstraintSetId:I
        //  2862: aload_1        
        //  2863: astore_2       
        //  2864: goto            446
        //  2867: aload_3        
        //  2868: invokevirtual   android/content/res/TypedArray.recycle:()V
        //  2871: aload_0        
        //  2872: getfield        androidx/constraintlayout/widget/ConstraintLayout.mLayoutWidget:LX/1fh;
        //  2875: aload_0        
        //  2876: getfield        androidx/constraintlayout/widget/ConstraintLayout.mOptimizationLevel:I
        //  2879: putfield        X/1fh.LJIILLIIL:I
        //  2882: return         
        //  2883: astore_1       
        //  2884: goto            2845
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                             
        //  -----  -----  -----  -----  -------------------------------------------------
        //  573    586    2850   2851   Landroid/content/res/Resources$NotFoundException;
        //  586    604    2844   2845   Landroid/content/res/Resources$NotFoundException;
        //  604    613    2834   2835   Lorg/xmlpull/v1/XmlPullParserException;
        //  604    613    2826   2827   Ljava/io/IOException;
        //  604    613    2844   2845   Landroid/content/res/Resources$NotFoundException;
        //  633    659    2834   2835   Lorg/xmlpull/v1/XmlPullParserException;
        //  633    659    2826   2827   Ljava/io/IOException;
        //  633    659    2844   2845   Landroid/content/res/Resources$NotFoundException;
        //  659    1175   2822   2826   Lorg/xmlpull/v1/XmlPullParserException;
        //  659    1175   2818   2822   Ljava/io/IOException;
        //  659    1175   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  1185   1204   2822   2826   Lorg/xmlpull/v1/XmlPullParserException;
        //  1185   1204   2818   2822   Ljava/io/IOException;
        //  1185   1204   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  1214   1227   2822   2826   Lorg/xmlpull/v1/XmlPullParserException;
        //  1214   1227   2818   2822   Ljava/io/IOException;
        //  1214   1227   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  1530   1547   2822   2826   Lorg/xmlpull/v1/XmlPullParserException;
        //  1530   1547   2818   2822   Ljava/io/IOException;
        //  1530   1547   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  1550   1562   2822   2826   Lorg/xmlpull/v1/XmlPullParserException;
        //  1550   1562   2818   2822   Ljava/io/IOException;
        //  1550   1562   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  1565   1582   2822   2826   Lorg/xmlpull/v1/XmlPullParserException;
        //  1565   1582   2818   2822   Ljava/io/IOException;
        //  1565   1582   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  1585   1602   2822   2826   Lorg/xmlpull/v1/XmlPullParserException;
        //  1585   1602   2818   2822   Ljava/io/IOException;
        //  1585   1602   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  1605   1622   2822   2826   Lorg/xmlpull/v1/XmlPullParserException;
        //  1605   1622   2818   2822   Ljava/io/IOException;
        //  1605   1622   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  1625   1642   2822   2826   Lorg/xmlpull/v1/XmlPullParserException;
        //  1625   1642   2818   2822   Ljava/io/IOException;
        //  1625   1642   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  1645   1662   2822   2826   Lorg/xmlpull/v1/XmlPullParserException;
        //  1645   1662   2818   2822   Ljava/io/IOException;
        //  1645   1662   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  1665   1682   2822   2826   Lorg/xmlpull/v1/XmlPullParserException;
        //  1665   1682   2818   2822   Ljava/io/IOException;
        //  1665   1682   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  1685   1702   2822   2826   Lorg/xmlpull/v1/XmlPullParserException;
        //  1685   1702   2818   2822   Ljava/io/IOException;
        //  1685   1702   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  1705   1722   2822   2826   Lorg/xmlpull/v1/XmlPullParserException;
        //  1705   1722   2818   2822   Ljava/io/IOException;
        //  1705   1722   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  1725   1742   2822   2826   Lorg/xmlpull/v1/XmlPullParserException;
        //  1725   1742   2818   2822   Ljava/io/IOException;
        //  1725   1742   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  1745   1762   2822   2826   Lorg/xmlpull/v1/XmlPullParserException;
        //  1745   1762   2818   2822   Ljava/io/IOException;
        //  1745   1762   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  1765   1782   2822   2826   Lorg/xmlpull/v1/XmlPullParserException;
        //  1765   1782   2818   2822   Ljava/io/IOException;
        //  1765   1782   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  1785   1802   2822   2826   Lorg/xmlpull/v1/XmlPullParserException;
        //  1785   1802   2818   2822   Ljava/io/IOException;
        //  1785   1802   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  1805   1822   2822   2826   Lorg/xmlpull/v1/XmlPullParserException;
        //  1805   1822   2818   2822   Ljava/io/IOException;
        //  1805   1822   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  1825   1842   2822   2826   Lorg/xmlpull/v1/XmlPullParserException;
        //  1825   1842   2818   2822   Ljava/io/IOException;
        //  1825   1842   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  1845   1868   2822   2826   Lorg/xmlpull/v1/XmlPullParserException;
        //  1845   1868   2818   2822   Ljava/io/IOException;
        //  1845   1868   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  1871   1888   2822   2826   Lorg/xmlpull/v1/XmlPullParserException;
        //  1871   1888   2818   2822   Ljava/io/IOException;
        //  1871   1888   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  1891   1908   2822   2826   Lorg/xmlpull/v1/XmlPullParserException;
        //  1891   1908   2818   2822   Ljava/io/IOException;
        //  1891   1908   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  1911   1928   2822   2826   Lorg/xmlpull/v1/XmlPullParserException;
        //  1911   1928   2818   2822   Ljava/io/IOException;
        //  1911   1928   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  1931   1948   2822   2826   Lorg/xmlpull/v1/XmlPullParserException;
        //  1931   1948   2818   2822   Ljava/io/IOException;
        //  1931   1948   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  1951   1968   2822   2826   Lorg/xmlpull/v1/XmlPullParserException;
        //  1951   1968   2818   2822   Ljava/io/IOException;
        //  1951   1968   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  1971   1988   2822   2826   Lorg/xmlpull/v1/XmlPullParserException;
        //  1971   1988   2818   2822   Ljava/io/IOException;
        //  1971   1988   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  1991   2008   2822   2826   Lorg/xmlpull/v1/XmlPullParserException;
        //  1991   2008   2818   2822   Ljava/io/IOException;
        //  1991   2008   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  2011   2028   2822   2826   Lorg/xmlpull/v1/XmlPullParserException;
        //  2011   2028   2818   2822   Ljava/io/IOException;
        //  2011   2028   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  2031   2048   2822   2826   Lorg/xmlpull/v1/XmlPullParserException;
        //  2031   2048   2818   2822   Ljava/io/IOException;
        //  2031   2048   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  2051   2068   2822   2826   Lorg/xmlpull/v1/XmlPullParserException;
        //  2051   2068   2818   2822   Ljava/io/IOException;
        //  2051   2068   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  2071   2088   2822   2826   Lorg/xmlpull/v1/XmlPullParserException;
        //  2071   2088   2818   2822   Ljava/io/IOException;
        //  2071   2088   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  2091   2108   2822   2826   Lorg/xmlpull/v1/XmlPullParserException;
        //  2091   2108   2818   2822   Ljava/io/IOException;
        //  2091   2108   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  2111   2128   2822   2826   Lorg/xmlpull/v1/XmlPullParserException;
        //  2111   2128   2818   2822   Ljava/io/IOException;
        //  2111   2128   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  2131   2148   2822   2826   Lorg/xmlpull/v1/XmlPullParserException;
        //  2131   2148   2818   2822   Ljava/io/IOException;
        //  2131   2148   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  2151   2168   2822   2826   Lorg/xmlpull/v1/XmlPullParserException;
        //  2151   2168   2818   2822   Ljava/io/IOException;
        //  2151   2168   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  2171   2188   2822   2826   Lorg/xmlpull/v1/XmlPullParserException;
        //  2171   2188   2818   2822   Ljava/io/IOException;
        //  2171   2188   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  2191   2208   2822   2826   Lorg/xmlpull/v1/XmlPullParserException;
        //  2191   2208   2818   2822   Ljava/io/IOException;
        //  2191   2208   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  2211   2228   2822   2826   Lorg/xmlpull/v1/XmlPullParserException;
        //  2211   2228   2818   2822   Ljava/io/IOException;
        //  2211   2228   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  2231   2248   2822   2826   Lorg/xmlpull/v1/XmlPullParserException;
        //  2231   2248   2818   2822   Ljava/io/IOException;
        //  2231   2248   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  2251   2268   2822   2826   Lorg/xmlpull/v1/XmlPullParserException;
        //  2251   2268   2818   2822   Ljava/io/IOException;
        //  2251   2268   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  2271   2288   2822   2826   Lorg/xmlpull/v1/XmlPullParserException;
        //  2271   2288   2818   2822   Ljava/io/IOException;
        //  2271   2288   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  2291   2322   2822   2826   Lorg/xmlpull/v1/XmlPullParserException;
        //  2291   2322   2818   2822   Ljava/io/IOException;
        //  2291   2322   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  2325   2342   2822   2826   Lorg/xmlpull/v1/XmlPullParserException;
        //  2325   2342   2818   2822   Ljava/io/IOException;
        //  2325   2342   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  2345   2362   2822   2826   Lorg/xmlpull/v1/XmlPullParserException;
        //  2345   2362   2818   2822   Ljava/io/IOException;
        //  2345   2362   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  2365   2382   2822   2826   Lorg/xmlpull/v1/XmlPullParserException;
        //  2365   2382   2818   2822   Ljava/io/IOException;
        //  2365   2382   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  2385   2402   2822   2826   Lorg/xmlpull/v1/XmlPullParserException;
        //  2385   2402   2818   2822   Ljava/io/IOException;
        //  2385   2402   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  2405   2422   2822   2826   Lorg/xmlpull/v1/XmlPullParserException;
        //  2405   2422   2818   2822   Ljava/io/IOException;
        //  2405   2422   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  2425   2442   2822   2826   Lorg/xmlpull/v1/XmlPullParserException;
        //  2425   2442   2818   2822   Ljava/io/IOException;
        //  2425   2442   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  2445   2462   2822   2826   Lorg/xmlpull/v1/XmlPullParserException;
        //  2445   2462   2818   2822   Ljava/io/IOException;
        //  2445   2462   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  2465   2482   2822   2826   Lorg/xmlpull/v1/XmlPullParserException;
        //  2465   2482   2818   2822   Ljava/io/IOException;
        //  2465   2482   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  2485   2502   2822   2826   Lorg/xmlpull/v1/XmlPullParserException;
        //  2485   2502   2818   2822   Ljava/io/IOException;
        //  2485   2502   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  2505   2522   2822   2826   Lorg/xmlpull/v1/XmlPullParserException;
        //  2505   2522   2818   2822   Ljava/io/IOException;
        //  2505   2522   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  2525   2542   2822   2826   Lorg/xmlpull/v1/XmlPullParserException;
        //  2525   2542   2818   2822   Ljava/io/IOException;
        //  2525   2542   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  2545   2562   2822   2826   Lorg/xmlpull/v1/XmlPullParserException;
        //  2545   2562   2818   2822   Ljava/io/IOException;
        //  2545   2562   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  2565   2582   2822   2826   Lorg/xmlpull/v1/XmlPullParserException;
        //  2565   2582   2818   2822   Ljava/io/IOException;
        //  2565   2582   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  2585   2602   2822   2826   Lorg/xmlpull/v1/XmlPullParserException;
        //  2585   2602   2818   2822   Ljava/io/IOException;
        //  2585   2602   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  2605   2622   2822   2826   Lorg/xmlpull/v1/XmlPullParserException;
        //  2605   2622   2818   2822   Ljava/io/IOException;
        //  2605   2622   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  2625   2642   2822   2826   Lorg/xmlpull/v1/XmlPullParserException;
        //  2625   2642   2818   2822   Ljava/io/IOException;
        //  2625   2642   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  2645   2657   2822   2826   Lorg/xmlpull/v1/XmlPullParserException;
        //  2645   2657   2818   2822   Ljava/io/IOException;
        //  2645   2657   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  2660   2677   2822   2826   Lorg/xmlpull/v1/XmlPullParserException;
        //  2660   2677   2818   2822   Ljava/io/IOException;
        //  2660   2677   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  2680   2697   2822   2826   Lorg/xmlpull/v1/XmlPullParserException;
        //  2680   2697   2818   2822   Ljava/io/IOException;
        //  2680   2697   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  2700   2717   2822   2826   Lorg/xmlpull/v1/XmlPullParserException;
        //  2700   2717   2818   2822   Ljava/io/IOException;
        //  2700   2717   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  2720   2737   2822   2826   Lorg/xmlpull/v1/XmlPullParserException;
        //  2720   2737   2818   2822   Ljava/io/IOException;
        //  2720   2737   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  2740   2753   2822   2826   Lorg/xmlpull/v1/XmlPullParserException;
        //  2740   2753   2818   2822   Ljava/io/IOException;
        //  2740   2753   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  2756   2777   2822   2826   Lorg/xmlpull/v1/XmlPullParserException;
        //  2756   2777   2818   2822   Ljava/io/IOException;
        //  2756   2777   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  2777   2795   2822   2826   Lorg/xmlpull/v1/XmlPullParserException;
        //  2777   2795   2818   2822   Ljava/io/IOException;
        //  2777   2795   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  2798   2806   2822   2826   Lorg/xmlpull/v1/XmlPullParserException;
        //  2798   2806   2818   2822   Ljava/io/IOException;
        //  2798   2806   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  2806   2815   2822   2826   Lorg/xmlpull/v1/XmlPullParserException;
        //  2806   2815   2818   2822   Ljava/io/IOException;
        //  2806   2815   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  2827   2831   2883   2887   Landroid/content/res/Resources$NotFoundException;
        //  2835   2839   2883   2887   Landroid/content/res/Resources$NotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_1178:
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
    
    private void internalMeasureChildren(final int n, final int n2) {
        final int n3 = this.getPaddingTop() + this.getPaddingBottom();
        final int n4 = this.getPaddingLeft() + this.getPaddingRight();
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            if (child.getVisibility() != 8) {
                final ConstraintLayout.a a = (ConstraintLayout.a)child.getLayoutParams();
                final 05G widget = a.widget;
                if (!a.isGuideline && !a.isHelper) {
                    widget.mVisibility = child.getVisibility();
                    final int width = a.width;
                    final int height = a.height;
                    int n8;
                    int measuredWidth;
                    int n9;
                    int n10;
                    if (a.horizontalDimensionFixed || a.verticalDimensionFixed || (!a.horizontalDimensionFixed && a.matchConstraintDefaultWidth == 1) || a.width == -1 || (!a.verticalDimensionFixed && (a.matchConstraintDefaultHeight == 1 || a.height == -1))) {
                        int n5;
                        int n6;
                        if (width == 0) {
                            n5 = getChildMeasureSpec(n, n4, -2);
                            n6 = 1;
                        }
                        else if (width == -1) {
                            n5 = getChildMeasureSpec(n, n4, -1);
                            n6 = 0;
                        }
                        else {
                            if (width == -2) {
                                n6 = 1;
                            }
                            else {
                                n6 = 0;
                            }
                            n5 = getChildMeasureSpec(n, n4, width);
                        }
                        int n7;
                        if (height == 0) {
                            n7 = getChildMeasureSpec(n2, n3, -2);
                            n8 = 1;
                        }
                        else if (height == -1) {
                            n7 = getChildMeasureSpec(n2, n3, -1);
                            n8 = 0;
                        }
                        else {
                            if (height == -2) {
                                n8 = 1;
                            }
                            else {
                                n8 = 0;
                            }
                            n7 = getChildMeasureSpec(n2, n3, height);
                        }
                        child.measure(n5, n7);
                        final 05R mMetrics = this.mMetrics;
                        if (mMetrics != null) {
                            ++mMetrics.LIZ;
                        }
                        widget.mIsWidthWrapContent = (width == -2);
                        widget.mIsHeightWrapContent = (height == -2);
                        measuredWidth = child.getMeasuredWidth();
                        final int measuredHeight = child.getMeasuredHeight();
                        n9 = n6;
                        n10 = measuredHeight;
                    }
                    else {
                        n9 = 0;
                        n8 = 0;
                        n10 = height;
                        measuredWidth = width;
                    }
                    widget.setWidth(measuredWidth);
                    widget.setHeight(n10);
                    if (n9 != 0) {
                        widget.mWrapWidth = measuredWidth;
                    }
                    if (n8 != 0) {
                        widget.mWrapHeight = n10;
                    }
                    if (a.needsBaseline) {
                        final int baseline = child.getBaseline();
                        if (baseline != -1) {
                            widget.mBaselineDistance = baseline;
                        }
                    }
                }
            }
        }
    }
    
    private void internalMeasureDimensions(final int n, final int n2) {
        ConstraintLayout constraintLayout = this;
        final int n3 = this.getPaddingTop() + this.getPaddingBottom();
        final int n4 = this.getPaddingLeft() + this.getPaddingRight();
        final int childCount = this.getChildCount();
        for (int i = 0; i < childCount; ++i) {
            final View child = constraintLayout.getChildAt(i);
            if (child.getVisibility() != 8) {
                final ConstraintLayout.a a = (ConstraintLayout.a)child.getLayoutParams();
                final 05G widget = a.widget;
                if (!a.isGuideline && !a.isHelper) {
                    widget.mVisibility = child.getVisibility();
                    final int width = a.width;
                    final int height = a.height;
                    if (width == 0 || height == 0) {
                        widget.getResolutionWidth().LIZJ();
                        widget.getResolutionHeight().LIZJ();
                    }
                    else {
                        int n5;
                        if (width == -2) {
                            n5 = 1;
                        }
                        else {
                            n5 = 0;
                        }
                        final int childMeasureSpec = getChildMeasureSpec(n, n4, width);
                        int n6;
                        if (height == -2) {
                            n6 = 1;
                        }
                        else {
                            n6 = 0;
                        }
                        child.measure(childMeasureSpec, getChildMeasureSpec(n2, n3, height));
                        final 05R mMetrics = constraintLayout.mMetrics;
                        if (mMetrics != null) {
                            ++mMetrics.LIZ;
                        }
                        widget.mIsWidthWrapContent = (width == -2);
                        widget.mIsHeightWrapContent = (height == -2);
                        final int measuredWidth = child.getMeasuredWidth();
                        final int measuredHeight = child.getMeasuredHeight();
                        widget.setWidth(measuredWidth);
                        widget.setHeight(measuredHeight);
                        if (n5 != 0) {
                            widget.mWrapWidth = measuredWidth;
                        }
                        if (n6 != 0) {
                            widget.mWrapHeight = measuredHeight;
                        }
                        if (a.needsBaseline) {
                            final int baseline = child.getBaseline();
                            if (baseline != -1) {
                                widget.mBaselineDistance = baseline;
                            }
                        }
                        if (a.horizontalDimensionFixed && a.verticalDimensionFixed) {
                            widget.getResolutionWidth().LIZ(measuredWidth);
                            widget.getResolutionHeight().LIZ(measuredHeight);
                        }
                    }
                }
            }
        }
        constraintLayout.mLayoutWidget.LIZIZ();
        int j = 0;
    Label_1045_Outer:
        while (j < childCount) {
            final View child2 = constraintLayout.getChildAt(j);
            while (true) {
                Label_1256: {
                    if (child2.getVisibility() == 8) {
                        break Label_1256;
                    }
                    final ConstraintLayout.a a2 = (ConstraintLayout.a)child2.getLayoutParams();
                    final 05G widget2 = a2.widget;
                    if (a2.isGuideline || a2.isHelper) {
                        break Label_1256;
                    }
                    widget2.mVisibility = child2.getVisibility();
                    int width2 = a2.width;
                    int height2 = a2.height;
                    if (width2 != 0 && height2 != 0) {
                        break Label_1256;
                    }
                    final 13o liz = widget2.getAnchor(05D.b.LEFT).LIZ;
                    final 13o liz2 = widget2.getAnchor(05D.b.RIGHT).LIZ;
                    boolean b;
                    if (widget2.getAnchor(05D.b.LEFT).LIZLLL != null && widget2.getAnchor(05D.b.RIGHT).LIZLLL != null) {
                        b = true;
                    }
                    else {
                        b = false;
                    }
                    final 13o liz3 = widget2.getAnchor(05D.b.TOP).LIZ;
                    final 13o liz4 = widget2.getAnchor(05D.b.BOTTOM).LIZ;
                    boolean b2;
                    if (widget2.getAnchor(05D.b.TOP).LIZLLL != null && widget2.getAnchor(05D.b.BOTTOM).LIZLLL != null) {
                        b2 = true;
                    }
                    else {
                        b2 = false;
                    }
                    ConstraintLayout constraintLayout2;
                    if (width2 != 0 || height2 != 0 || !b || !b2) {
                        boolean b3;
                        if (constraintLayout.mLayoutWidget.getHorizontalDimensionBehaviour() != 05G.a.WRAP_CONTENT) {
                            b3 = true;
                        }
                        else {
                            b3 = false;
                        }
                        int n7;
                        if (constraintLayout.mLayoutWidget.getVerticalDimensionBehaviour() != 05G.a.WRAP_CONTENT) {
                            n7 = 1;
                        }
                        else {
                            n7 = 0;
                        }
                        if (!b3) {
                            widget2.getResolutionWidth().LIZJ();
                        }
                        if (n7 == 0) {
                            widget2.getResolutionHeight().LIZJ();
                        }
                        int n8 = 0;
                        int n9 = 0;
                        int n10 = 0;
                        int n11 = 0;
                        Label_0774: {
                            Label_0756: {
                                int n12;
                                if (width2 == 0) {
                                    if (!b3 || !widget2.isSpreadWidth() || !b || !liz.LJ() || !liz2.LJ()) {
                                        n8 = getChildMeasureSpec(n, n4, -2);
                                        n9 = 0;
                                        n10 = 1;
                                        n11 = width2;
                                        break Label_0774;
                                    }
                                    n12 = (int)(liz2.LJ - liz.LJ);
                                    widget2.getResolutionWidth().LIZ(n12);
                                }
                                else {
                                    if (width2 == -1) {
                                        n8 = getChildMeasureSpec(n, n4, -1);
                                        n10 = 0;
                                        n11 = width2;
                                        n9 = (b3 ? 1 : 0);
                                        break Label_0774;
                                    }
                                    if ((n12 = width2) == -2) {
                                        n10 = 1;
                                        break Label_0756;
                                    }
                                }
                                n10 = 0;
                                width2 = n12;
                            }
                            n8 = getChildMeasureSpec(n, n4, width2);
                            n9 = (b3 ? 1 : 0);
                            n11 = width2;
                        }
                        int n13 = 0;
                        int n14 = 0;
                        Label_0858: {
                            int n15;
                            if (height2 == 0) {
                                if (n7 == 0 || !widget2.isSpreadHeight() || !b2 || !liz3.LJ() || !liz4.LJ()) {
                                    n13 = getChildMeasureSpec(n2, n3, -2);
                                    n7 = 0;
                                    n14 = 1;
                                    break Label_0858;
                                }
                                n15 = (int)(liz4.LJ - liz3.LJ);
                                widget2.getResolutionHeight().LIZ(n15);
                                n14 = 0;
                            }
                            else {
                                if (height2 == -1) {
                                    n13 = getChildMeasureSpec(n2, n3, -1);
                                    n14 = 0;
                                    break Label_0858;
                                }
                                if (height2 == -2) {
                                    n14 = 1;
                                    n15 = height2;
                                }
                                else {
                                    n14 = 0;
                                    n15 = height2;
                                }
                            }
                            final int childMeasureSpec2 = getChildMeasureSpec(n2, n3, n15);
                            height2 = n15;
                            n13 = childMeasureSpec2;
                        }
                        child2.measure(n8, n13);
                        final 05R mMetrics2 = this.mMetrics;
                        if (mMetrics2 != null) {
                            ++mMetrics2.LIZ;
                        }
                        widget2.mIsWidthWrapContent = (n11 == -2);
                        widget2.mIsHeightWrapContent = (height2 == -2);
                        final int measuredWidth2 = child2.getMeasuredWidth();
                        final int measuredHeight2 = child2.getMeasuredHeight();
                        widget2.setWidth(measuredWidth2);
                        widget2.setHeight(measuredHeight2);
                        if (n10 != 0) {
                            widget2.mWrapWidth = measuredWidth2;
                        }
                        if (n14 != 0) {
                            widget2.mWrapHeight = measuredHeight2;
                        }
                        if (n9 != 0) {
                            widget2.getResolutionWidth().LIZ(measuredWidth2);
                        }
                        else {
                            widget2.getResolutionWidth().LJIIIIZZ = 2;
                        }
                        if (n7 != 0) {
                            widget2.getResolutionHeight().LIZ(measuredHeight2);
                        }
                        else {
                            widget2.getResolutionHeight().LJIIIIZZ = 2;
                        }
                        constraintLayout2 = this;
                        if (a2.needsBaseline) {
                            final int baseline2 = child2.getBaseline();
                            constraintLayout2 = this;
                            if (baseline2 != -1) {
                                widget2.mBaselineDistance = baseline2;
                                constraintLayout2 = this;
                            }
                        }
                    }
                    else {
                        constraintLayout2 = constraintLayout;
                    }
                    ++j;
                    constraintLayout = constraintLayout2;
                    continue Label_1045_Outer;
                }
                ConstraintLayout constraintLayout2 = constraintLayout;
                continue;
            }
        }
    }
    
    private void setChildrenConstraints() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   androidx/constraintlayout/widget/ConstraintLayout.isInEditMode:()Z
        //     4: istore_1       
        //     5: aload_0        
        //     6: invokevirtual   androidx/constraintlayout/widget/ConstraintLayout.getChildCount:()I
        //     9: istore_2       
        //    10: iconst_0       
        //    11: istore_3       
        //    12: iload_1        
        //    13: ifeq            112
        //    16: iconst_0       
        //    17: istore          4
        //    19: iload           4
        //    21: iload_2        
        //    22: if_icmpge       112
        //    25: aload_0        
        //    26: iload           4
        //    28: invokevirtual   androidx/constraintlayout/widget/ConstraintLayout.getChildAt:(I)Landroid/view/View;
        //    31: astore          5
        //    33: aload_0        
        //    34: invokevirtual   androidx/constraintlayout/widget/ConstraintLayout.getResources:()Landroid/content/res/Resources;
        //    37: aload           5
        //    39: invokevirtual   android/view/View.getId:()I
        //    42: invokevirtual   android/content/res/Resources.getResourceName:(I)Ljava/lang/String;
        //    45: astore          6
        //    47: aload_0        
        //    48: iconst_0       
        //    49: aload           6
        //    51: aload           5
        //    53: invokevirtual   android/view/View.getId:()I
        //    56: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    59: invokevirtual   androidx/constraintlayout/widget/ConstraintLayout.setDesignInformation:(ILjava/lang/Object;Ljava/lang/Object;)V
        //    62: aload           6
        //    64: bipush          47
        //    66: invokevirtual   java/lang/String.indexOf:(I)I
        //    69: istore          7
        //    71: aload           6
        //    73: astore          8
        //    75: iload           7
        //    77: iconst_m1      
        //    78: if_icmpeq       92
        //    81: aload           6
        //    83: iload           7
        //    85: iconst_1       
        //    86: iadd           
        //    87: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //    90: astore          8
        //    92: aload_0        
        //    93: aload           5
        //    95: invokevirtual   android/view/View.getId:()I
        //    98: invokespecial   androidx/constraintlayout/widget/ConstraintLayout.getTargetWidget:(I)LX/05G;
        //   101: aload           8
        //   103: putfield        X/05G.mDebugName:Ljava/lang/String;
        //   106: iinc            4, 1
        //   109: goto            19
        //   112: iconst_0       
        //   113: istore          4
        //   115: iload           4
        //   117: iload_2        
        //   118: if_icmpge       149
        //   121: aload_0        
        //   122: aload_0        
        //   123: iload           4
        //   125: invokevirtual   androidx/constraintlayout/widget/ConstraintLayout.getChildAt:(I)Landroid/view/View;
        //   128: invokevirtual   androidx/constraintlayout/widget/ConstraintLayout.getViewWidget:(Landroid/view/View;)LX/05G;
        //   131: astore          8
        //   133: aload           8
        //   135: ifnull          143
        //   138: aload           8
        //   140: invokevirtual   X/05G.reset:()V
        //   143: iinc            4, 1
        //   146: goto            115
        //   149: aload_0        
        //   150: getfield        androidx/constraintlayout/widget/ConstraintLayout.mConstraintSetId:I
        //   153: iconst_m1      
        //   154: if_icmpeq       212
        //   157: iconst_0       
        //   158: istore          4
        //   160: iload           4
        //   162: iload_2        
        //   163: if_icmpge       212
        //   166: aload_0        
        //   167: iload           4
        //   169: invokevirtual   androidx/constraintlayout/widget/ConstraintLayout.getChildAt:(I)Landroid/view/View;
        //   172: astore          8
        //   174: aload           8
        //   176: invokevirtual   android/view/View.getId:()I
        //   179: aload_0        
        //   180: getfield        androidx/constraintlayout/widget/ConstraintLayout.mConstraintSetId:I
        //   183: if_icmpne       206
        //   186: aload           8
        //   188: instanceof      LX/05d;
        //   191: ifeq            206
        //   194: aload_0        
        //   195: aload           8
        //   197: checkcast       LX/05d;
        //   200: invokevirtual   X/05d.getConstraintSet:()LX/05c;
        //   203: putfield        androidx/constraintlayout/widget/ConstraintLayout.mConstraintSet:LX/05c;
        //   206: iinc            4, 1
        //   209: goto            160
        //   212: aload_0        
        //   213: getfield        androidx/constraintlayout/widget/ConstraintLayout.mConstraintSet:LX/05c;
        //   216: astore          8
        //   218: aload           8
        //   220: ifnull          229
        //   223: aload           8
        //   225: aload_0        
        //   226: invokevirtual   X/05c.LIZJ:(Landroidx/constraintlayout/widget/ConstraintLayout;)V
        //   229: aload_0        
        //   230: getfield        androidx/constraintlayout/widget/ConstraintLayout.mLayoutWidget:LX/1fh;
        //   233: getfield        X/13q.LJIJJ:Ljava/util/ArrayList;
        //   236: invokevirtual   java/util/ArrayList.clear:()V
        //   239: aload_0        
        //   240: getfield        androidx/constraintlayout/widget/ConstraintLayout.mConstraintHelpers:Ljava/util/ArrayList;
        //   243: invokevirtual   java/util/ArrayList.size:()I
        //   246: istore          7
        //   248: iload           7
        //   250: ifle            285
        //   253: iconst_0       
        //   254: istore          4
        //   256: aload_0        
        //   257: getfield        androidx/constraintlayout/widget/ConstraintLayout.mConstraintHelpers:Ljava/util/ArrayList;
        //   260: iload           4
        //   262: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   265: checkcast       LX/05a;
        //   268: aload_0        
        //   269: invokevirtual   X/05a.updatePreLayout:(Landroidx/constraintlayout/widget/ConstraintLayout;)V
        //   272: iinc            4, 1
        //   275: iload           4
        //   277: iload           7
        //   279: if_icmpge       285
        //   282: goto            256
        //   285: iconst_0       
        //   286: istore          4
        //   288: iload           4
        //   290: iload_2        
        //   291: if_icmpge       402
        //   294: aload_0        
        //   295: iload           4
        //   297: invokevirtual   androidx/constraintlayout/widget/ConstraintLayout.getChildAt:(I)Landroid/view/View;
        //   300: astore          8
        //   302: aload           8
        //   304: instanceof      LX/05Z;
        //   307: ifeq            396
        //   310: aload           8
        //   312: checkcast       LX/05Z;
        //   315: astore          8
        //   317: aload           8
        //   319: getfield        X/05Z.LIZ:I
        //   322: iconst_m1      
        //   323: if_icmpne       344
        //   326: aload           8
        //   328: invokevirtual   X/05Z.isInEditMode:()Z
        //   331: ifne            344
        //   334: aload           8
        //   336: aload           8
        //   338: getfield        X/05Z.LIZJ:I
        //   341: invokevirtual   X/05Z.setVisibility:(I)V
        //   344: aload           8
        //   346: aload_0        
        //   347: aload           8
        //   349: getfield        X/05Z.LIZ:I
        //   352: invokevirtual   androidx/constraintlayout/widget/ConstraintLayout.findViewById:(I)Landroid/view/View;
        //   355: putfield        X/05Z.LIZIZ:Landroid/view/View;
        //   358: aload           8
        //   360: getfield        X/05Z.LIZIZ:Landroid/view/View;
        //   363: ifnull          396
        //   366: aload           8
        //   368: getfield        X/05Z.LIZIZ:Landroid/view/View;
        //   371: invokevirtual   android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //   374: checkcast       Landroidx/constraintlayout/widget/05X;
        //   377: iconst_1       
        //   378: putfield        androidx/constraintlayout/widget/05X.isInPlaceholder:Z
        //   381: aload           8
        //   383: getfield        X/05Z.LIZIZ:Landroid/view/View;
        //   386: iconst_0       
        //   387: invokevirtual   android/view/View.setVisibility:(I)V
        //   390: aload           8
        //   392: iconst_0       
        //   393: invokevirtual   X/05Z.setVisibility:(I)V
        //   396: iinc            4, 1
        //   399: goto            288
        //   402: iconst_0       
        //   403: istore          4
        //   405: iload           4
        //   407: iload_2        
        //   408: if_icmpge       1880
        //   411: aload_0        
        //   412: iload           4
        //   414: invokevirtual   androidx/constraintlayout/widget/ConstraintLayout.getChildAt:(I)Landroid/view/View;
        //   417: astore          5
        //   419: aload_0        
        //   420: aload           5
        //   422: invokevirtual   androidx/constraintlayout/widget/ConstraintLayout.getViewWidget:(Landroid/view/View;)LX/05G;
        //   425: astore          6
        //   427: iload_3        
        //   428: istore          7
        //   430: aload           6
        //   432: ifnull          622
        //   435: aload           5
        //   437: invokevirtual   android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //   440: checkcast       Landroidx/constraintlayout/widget/05X;
        //   443: astore          8
        //   445: aload           8
        //   447: invokevirtual   androidx/constraintlayout/widget/05X.validate:()V
        //   450: aload           8
        //   452: getfield        androidx/constraintlayout/widget/05X.helped:Z
        //   455: ifeq            1813
        //   458: aload           8
        //   460: iload_3        
        //   461: putfield        androidx/constraintlayout/widget/05X.helped:Z
        //   464: aload           6
        //   466: aload           5
        //   468: invokevirtual   android/view/View.getVisibility:()I
        //   471: putfield        X/05G.mVisibility:I
        //   474: aload           8
        //   476: getfield        androidx/constraintlayout/widget/05X.isInPlaceholder:Z
        //   479: ifeq            489
        //   482: aload           6
        //   484: bipush          8
        //   486: putfield        X/05G.mVisibility:I
        //   489: aload           6
        //   491: aload           5
        //   493: putfield        X/05G.mCompanionWidget:Ljava/lang/Object;
        //   496: aload_0        
        //   497: getfield        androidx/constraintlayout/widget/ConstraintLayout.mLayoutWidget:LX/1fh;
        //   500: astore          5
        //   502: aload           5
        //   504: getfield        X/13q.LJIJJ:Ljava/util/ArrayList;
        //   507: aload           6
        //   509: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   512: pop            
        //   513: aload           6
        //   515: getfield        X/05G.mParent:LX/05G;
        //   518: ifnull          534
        //   521: aload           6
        //   523: getfield        X/05G.mParent:LX/05G;
        //   526: checkcast       LX/13q;
        //   529: aload           6
        //   531: invokevirtual   X/13q.LIZ:(LX/05G;)V
        //   534: aload           6
        //   536: aload           5
        //   538: putfield        X/05G.mParent:LX/05G;
        //   541: aload           8
        //   543: getfield        androidx/constraintlayout/widget/05X.verticalDimensionFixed:Z
        //   546: ifeq            557
        //   549: aload           8
        //   551: getfield        androidx/constraintlayout/widget/05X.horizontalDimensionFixed:Z
        //   554: ifne            567
        //   557: aload_0        
        //   558: getfield        androidx/constraintlayout/widget/ConstraintLayout.mVariableDimensionsWidgets:Ljava/util/ArrayList;
        //   561: aload           6
        //   563: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   566: pop            
        //   567: aload           8
        //   569: getfield        androidx/constraintlayout/widget/05X.isGuideline:Z
        //   572: ifeq            672
        //   575: aload           6
        //   577: checkcast       LX/13m;
        //   580: astore          6
        //   582: aload           8
        //   584: getfield        androidx/constraintlayout/widget/05X.resolvedGuideBegin:I
        //   587: istore          7
        //   589: aload           8
        //   591: getfield        androidx/constraintlayout/widget/05X.resolvedGuideEnd:I
        //   594: istore          9
        //   596: aload           8
        //   598: getfield        androidx/constraintlayout/widget/05X.resolvedGuidePercent:F
        //   601: fstore          10
        //   603: fload           10
        //   605: ldc_w           -1.0
        //   608: fcmpl          
        //   609: ifeq            631
        //   612: aload           6
        //   614: fload           10
        //   616: invokevirtual   X/13m.LIZ:(F)V
        //   619: iload_3        
        //   620: istore          7
        //   622: iinc            4, 1
        //   625: iload           7
        //   627: istore_3       
        //   628: goto            405
        //   631: iload           7
        //   633: iconst_m1      
        //   634: if_icmpeq       650
        //   637: aload           6
        //   639: iload           7
        //   641: invokevirtual   X/13m.LIZIZ:(I)V
        //   644: iload_3        
        //   645: istore          7
        //   647: goto            622
        //   650: iload_3        
        //   651: istore          7
        //   653: iload           9
        //   655: iconst_m1      
        //   656: if_icmpeq       622
        //   659: aload           6
        //   661: iload           9
        //   663: invokevirtual   X/13m.LIZJ:(I)V
        //   666: iload_3        
        //   667: istore          7
        //   669: goto            622
        //   672: aload           8
        //   674: getfield        androidx/constraintlayout/widget/05X.leftToLeft:I
        //   677: iconst_m1      
        //   678: if_icmpne       837
        //   681: aload           8
        //   683: getfield        androidx/constraintlayout/widget/05X.leftToRight:I
        //   686: iconst_m1      
        //   687: if_icmpne       837
        //   690: aload           8
        //   692: getfield        androidx/constraintlayout/widget/05X.rightToLeft:I
        //   695: iconst_m1      
        //   696: if_icmpne       837
        //   699: aload           8
        //   701: getfield        androidx/constraintlayout/widget/05X.rightToRight:I
        //   704: iconst_m1      
        //   705: if_icmpne       837
        //   708: aload           8
        //   710: getfield        androidx/constraintlayout/widget/05X.startToStart:I
        //   713: iconst_m1      
        //   714: if_icmpne       837
        //   717: aload           8
        //   719: getfield        androidx/constraintlayout/widget/05X.startToEnd:I
        //   722: iconst_m1      
        //   723: if_icmpne       837
        //   726: aload           8
        //   728: getfield        androidx/constraintlayout/widget/05X.endToStart:I
        //   731: iconst_m1      
        //   732: if_icmpne       837
        //   735: aload           8
        //   737: getfield        androidx/constraintlayout/widget/05X.endToEnd:I
        //   740: iconst_m1      
        //   741: if_icmpne       837
        //   744: aload           8
        //   746: getfield        androidx/constraintlayout/widget/05X.topToTop:I
        //   749: iconst_m1      
        //   750: if_icmpne       837
        //   753: aload           8
        //   755: getfield        androidx/constraintlayout/widget/05X.topToBottom:I
        //   758: iconst_m1      
        //   759: if_icmpne       837
        //   762: aload           8
        //   764: getfield        androidx/constraintlayout/widget/05X.bottomToTop:I
        //   767: iconst_m1      
        //   768: if_icmpne       837
        //   771: aload           8
        //   773: getfield        androidx/constraintlayout/widget/05X.bottomToBottom:I
        //   776: iconst_m1      
        //   777: if_icmpne       837
        //   780: aload           8
        //   782: getfield        androidx/constraintlayout/widget/05X.baselineToBaseline:I
        //   785: iconst_m1      
        //   786: if_icmpne       837
        //   789: aload           8
        //   791: getfield        androidx/constraintlayout/widget/05X.editorAbsoluteX:I
        //   794: iconst_m1      
        //   795: if_icmpne       837
        //   798: aload           8
        //   800: getfield        androidx/constraintlayout/widget/05X.editorAbsoluteY:I
        //   803: iconst_m1      
        //   804: if_icmpne       837
        //   807: aload           8
        //   809: getfield        androidx/constraintlayout/widget/05X.circleConstraint:I
        //   812: iconst_m1      
        //   813: if_icmpne       837
        //   816: aload           8
        //   818: getfield        androidx/constraintlayout/widget/05X.width:I
        //   821: iconst_m1      
        //   822: if_icmpeq       837
        //   825: iload_3        
        //   826: istore          7
        //   828: aload           8
        //   830: getfield        androidx/constraintlayout/widget/05X.height:I
        //   833: iconst_m1      
        //   834: if_icmpne       622
        //   837: aload           8
        //   839: getfield        androidx/constraintlayout/widget/05X.resolvedLeftToLeft:I
        //   842: istore_3       
        //   843: aload           8
        //   845: getfield        androidx/constraintlayout/widget/05X.resolvedLeftToRight:I
        //   848: istore          11
        //   850: aload           8
        //   852: getfield        androidx/constraintlayout/widget/05X.resolvedRightToLeft:I
        //   855: istore          12
        //   857: aload           8
        //   859: getfield        androidx/constraintlayout/widget/05X.resolvedRightToRight:I
        //   862: istore          7
        //   864: aload           8
        //   866: getfield        androidx/constraintlayout/widget/05X.resolveGoneLeftMargin:I
        //   869: istore          13
        //   871: aload           8
        //   873: getfield        androidx/constraintlayout/widget/05X.resolveGoneRightMargin:I
        //   876: istore          9
        //   878: aload           8
        //   880: getfield        androidx/constraintlayout/widget/05X.resolvedHorizontalBias:F
        //   883: fstore          10
        //   885: aload           8
        //   887: getfield        androidx/constraintlayout/widget/05X.circleConstraint:I
        //   890: iconst_m1      
        //   891: if_icmpeq       1268
        //   894: aload_0        
        //   895: aload           8
        //   897: getfield        androidx/constraintlayout/widget/05X.circleConstraint:I
        //   900: invokespecial   androidx/constraintlayout/widget/ConstraintLayout.getTargetWidget:(I)LX/05G;
        //   903: astore          5
        //   905: aload           5
        //   907: ifnull          927
        //   910: aload           6
        //   912: aload           5
        //   914: aload           8
        //   916: getfield        androidx/constraintlayout/widget/05X.circleAngle:F
        //   919: aload           8
        //   921: getfield        androidx/constraintlayout/widget/05X.circleRadius:I
        //   924: invokevirtual   X/05G.connectCircularConstraint:(LX/05G;FI)V
        //   927: iload_1        
        //   928: ifeq            964
        //   931: aload           8
        //   933: getfield        androidx/constraintlayout/widget/05X.editorAbsoluteX:I
        //   936: iconst_m1      
        //   937: if_icmpne       949
        //   940: aload           8
        //   942: getfield        androidx/constraintlayout/widget/05X.editorAbsoluteY:I
        //   945: iconst_m1      
        //   946: if_icmpeq       964
        //   949: aload           6
        //   951: aload           8
        //   953: getfield        androidx/constraintlayout/widget/05X.editorAbsoluteX:I
        //   956: aload           8
        //   958: getfield        androidx/constraintlayout/widget/05X.editorAbsoluteY:I
        //   961: invokevirtual   X/05G.setOrigin:(II)V
        //   964: aload           8
        //   966: getfield        androidx/constraintlayout/widget/05X.horizontalDimensionFixed:Z
        //   969: ifne            1247
        //   972: aload           8
        //   974: getfield        androidx/constraintlayout/widget/05X.width:I
        //   977: iconst_m1      
        //   978: if_icmpne       1230
        //   981: aload           6
        //   983: getstatic       X/05F.MATCH_PARENT:LX/05F;
        //   986: invokevirtual   X/05G.setHorizontalDimensionBehaviour:(LX/05F;)V
        //   989: aload           6
        //   991: getstatic       X/05C.LEFT:LX/05C;
        //   994: invokevirtual   X/05G.getAnchor:(LX/05C;)LX/05D;
        //   997: aload           8
        //   999: getfield        androidx/constraintlayout/widget/05X.leftMargin:I
        //  1002: putfield        X/05D.LJ:I
        //  1005: aload           6
        //  1007: getstatic       X/05C.RIGHT:LX/05C;
        //  1010: invokevirtual   X/05G.getAnchor:(LX/05C;)LX/05D;
        //  1013: aload           8
        //  1015: getfield        androidx/constraintlayout/widget/05X.rightMargin:I
        //  1018: putfield        X/05D.LJ:I
        //  1021: aload           8
        //  1023: getfield        androidx/constraintlayout/widget/05X.verticalDimensionFixed:Z
        //  1026: ifne            1209
        //  1029: aload           8
        //  1031: getfield        androidx/constraintlayout/widget/05X.height:I
        //  1034: iconst_m1      
        //  1035: if_icmpne       1192
        //  1038: aload           6
        //  1040: getstatic       X/05F.MATCH_PARENT:LX/05F;
        //  1043: invokevirtual   X/05G.setVerticalDimensionBehaviour:(LX/05F;)V
        //  1046: aload           6
        //  1048: getstatic       X/05C.TOP:LX/05C;
        //  1051: invokevirtual   X/05G.getAnchor:(LX/05C;)LX/05D;
        //  1054: aload           8
        //  1056: getfield        androidx/constraintlayout/widget/05X.topMargin:I
        //  1059: putfield        X/05D.LJ:I
        //  1062: aload           6
        //  1064: getstatic       X/05C.BOTTOM:LX/05C;
        //  1067: invokevirtual   X/05G.getAnchor:(LX/05C;)LX/05D;
        //  1070: aload           8
        //  1072: getfield        androidx/constraintlayout/widget/05X.bottomMargin:I
        //  1075: putfield        X/05D.LJ:I
        //  1078: iconst_0       
        //  1079: istore          7
        //  1081: aload           8
        //  1083: getfield        androidx/constraintlayout/widget/05X.dimensionRatio:Ljava/lang/String;
        //  1086: ifnull          1099
        //  1089: aload           6
        //  1091: aload           8
        //  1093: getfield        androidx/constraintlayout/widget/05X.dimensionRatio:Ljava/lang/String;
        //  1096: invokevirtual   X/05G.setDimensionRatio:(Ljava/lang/String;)V
        //  1099: aload           6
        //  1101: aload           8
        //  1103: getfield        androidx/constraintlayout/widget/05X.horizontalWeight:F
        //  1106: invokevirtual   X/05G.setHorizontalWeight:(F)V
        //  1109: aload           6
        //  1111: aload           8
        //  1113: getfield        androidx/constraintlayout/widget/05X.verticalWeight:F
        //  1116: invokevirtual   X/05G.setVerticalWeight:(F)V
        //  1119: aload           6
        //  1121: aload           8
        //  1123: getfield        androidx/constraintlayout/widget/05X.horizontalChainStyle:I
        //  1126: putfield        X/05G.mHorizontalChainStyle:I
        //  1129: aload           6
        //  1131: aload           8
        //  1133: getfield        androidx/constraintlayout/widget/05X.verticalChainStyle:I
        //  1136: putfield        X/05G.mVerticalChainStyle:I
        //  1139: aload           6
        //  1141: aload           8
        //  1143: getfield        androidx/constraintlayout/widget/05X.matchConstraintDefaultWidth:I
        //  1146: aload           8
        //  1148: getfield        androidx/constraintlayout/widget/05X.matchConstraintMinWidth:I
        //  1151: aload           8
        //  1153: getfield        androidx/constraintlayout/widget/05X.matchConstraintMaxWidth:I
        //  1156: aload           8
        //  1158: getfield        androidx/constraintlayout/widget/05X.matchConstraintPercentWidth:F
        //  1161: invokevirtual   X/05G.setHorizontalMatchStyle:(IIIF)V
        //  1164: aload           6
        //  1166: aload           8
        //  1168: getfield        androidx/constraintlayout/widget/05X.matchConstraintDefaultHeight:I
        //  1171: aload           8
        //  1173: getfield        androidx/constraintlayout/widget/05X.matchConstraintMinHeight:I
        //  1176: aload           8
        //  1178: getfield        androidx/constraintlayout/widget/05X.matchConstraintMaxHeight:I
        //  1181: aload           8
        //  1183: getfield        androidx/constraintlayout/widget/05X.matchConstraintPercentHeight:F
        //  1186: invokevirtual   X/05G.setVerticalMatchStyle:(IIIF)V
        //  1189: goto            622
        //  1192: aload           6
        //  1194: getstatic       X/05F.MATCH_CONSTRAINT:LX/05F;
        //  1197: invokevirtual   X/05G.setVerticalDimensionBehaviour:(LX/05F;)V
        //  1200: aload           6
        //  1202: iconst_0       
        //  1203: invokevirtual   X/05G.setHeight:(I)V
        //  1206: goto            1078
        //  1209: aload           6
        //  1211: getstatic       X/05F.FIXED:LX/05F;
        //  1214: invokevirtual   X/05G.setVerticalDimensionBehaviour:(LX/05F;)V
        //  1217: aload           6
        //  1219: aload           8
        //  1221: getfield        androidx/constraintlayout/widget/05X.height:I
        //  1224: invokevirtual   X/05G.setHeight:(I)V
        //  1227: goto            1078
        //  1230: aload           6
        //  1232: getstatic       X/05F.MATCH_CONSTRAINT:LX/05F;
        //  1235: invokevirtual   X/05G.setHorizontalDimensionBehaviour:(LX/05F;)V
        //  1238: aload           6
        //  1240: iconst_0       
        //  1241: invokevirtual   X/05G.setWidth:(I)V
        //  1244: goto            1021
        //  1247: aload           6
        //  1249: getstatic       X/05F.FIXED:LX/05F;
        //  1252: invokevirtual   X/05G.setHorizontalDimensionBehaviour:(LX/05F;)V
        //  1255: aload           6
        //  1257: aload           8
        //  1259: getfield        androidx/constraintlayout/widget/05X.width:I
        //  1262: invokevirtual   X/05G.setWidth:(I)V
        //  1265: goto            1021
        //  1268: iload_3        
        //  1269: iconst_m1      
        //  1270: if_icmpeq       1771
        //  1273: aload_0        
        //  1274: iload_3        
        //  1275: invokespecial   androidx/constraintlayout/widget/ConstraintLayout.getTargetWidget:(I)LX/05G;
        //  1278: astore          5
        //  1280: aload           5
        //  1282: ifnull          1305
        //  1285: aload           6
        //  1287: getstatic       X/05C.LEFT:LX/05C;
        //  1290: aload           5
        //  1292: getstatic       X/05C.LEFT:LX/05C;
        //  1295: aload           8
        //  1297: getfield        androidx/constraintlayout/widget/05X.leftMargin:I
        //  1300: iload           13
        //  1302: invokevirtual   X/05G.immediateConnect:(LX/05C;LX/05G;LX/05C;II)V
        //  1305: iload           12
        //  1307: iconst_m1      
        //  1308: if_icmpeq       1729
        //  1311: aload_0        
        //  1312: iload           12
        //  1314: invokespecial   androidx/constraintlayout/widget/ConstraintLayout.getTargetWidget:(I)LX/05G;
        //  1317: astore          5
        //  1319: aload           5
        //  1321: ifnull          1344
        //  1324: aload           6
        //  1326: getstatic       X/05C.RIGHT:LX/05C;
        //  1329: aload           5
        //  1331: getstatic       X/05C.LEFT:LX/05C;
        //  1334: aload           8
        //  1336: getfield        androidx/constraintlayout/widget/05X.rightMargin:I
        //  1339: iload           9
        //  1341: invokevirtual   X/05G.immediateConnect:(LX/05C;LX/05G;LX/05C;II)V
        //  1344: aload           8
        //  1346: getfield        androidx/constraintlayout/widget/05X.topToTop:I
        //  1349: iconst_m1      
        //  1350: if_icmpeq       1678
        //  1353: aload_0        
        //  1354: aload           8
        //  1356: getfield        androidx/constraintlayout/widget/05X.topToTop:I
        //  1359: invokespecial   androidx/constraintlayout/widget/ConstraintLayout.getTargetWidget:(I)LX/05G;
        //  1362: astore          5
        //  1364: aload           5
        //  1366: ifnull          1392
        //  1369: aload           6
        //  1371: getstatic       X/05C.TOP:LX/05C;
        //  1374: aload           5
        //  1376: getstatic       X/05C.TOP:LX/05C;
        //  1379: aload           8
        //  1381: getfield        androidx/constraintlayout/widget/05X.topMargin:I
        //  1384: aload           8
        //  1386: getfield        androidx/constraintlayout/widget/05X.goneTopMargin:I
        //  1389: invokevirtual   X/05G.immediateConnect:(LX/05C;LX/05G;LX/05C;II)V
        //  1392: aload           8
        //  1394: getfield        androidx/constraintlayout/widget/05X.bottomToTop:I
        //  1397: iconst_m1      
        //  1398: if_icmpeq       1627
        //  1401: aload_0        
        //  1402: aload           8
        //  1404: getfield        androidx/constraintlayout/widget/05X.bottomToTop:I
        //  1407: invokespecial   androidx/constraintlayout/widget/ConstraintLayout.getTargetWidget:(I)LX/05G;
        //  1410: astore          5
        //  1412: aload           5
        //  1414: ifnull          1440
        //  1417: aload           6
        //  1419: getstatic       X/05C.BOTTOM:LX/05C;
        //  1422: aload           5
        //  1424: getstatic       X/05C.TOP:LX/05C;
        //  1427: aload           8
        //  1429: getfield        androidx/constraintlayout/widget/05X.bottomMargin:I
        //  1432: aload           8
        //  1434: getfield        androidx/constraintlayout/widget/05X.goneBottomMargin:I
        //  1437: invokevirtual   X/05G.immediateConnect:(LX/05C;LX/05G;LX/05C;II)V
        //  1440: aload           8
        //  1442: getfield        androidx/constraintlayout/widget/05X.baselineToBaseline:I
        //  1445: iconst_m1      
        //  1446: if_icmpeq       1569
        //  1449: aload_0        
        //  1450: getfield        androidx/constraintlayout/widget/ConstraintLayout.mChildrenByIds:Landroid/util/SparseArray;
        //  1453: aload           8
        //  1455: getfield        androidx/constraintlayout/widget/05X.baselineToBaseline:I
        //  1458: invokevirtual   android/util/SparseArray.get:(I)Ljava/lang/Object;
        //  1461: checkcast       Landroid/view/View;
        //  1464: astore          14
        //  1466: aload_0        
        //  1467: aload           8
        //  1469: getfield        androidx/constraintlayout/widget/05X.baselineToBaseline:I
        //  1472: invokespecial   androidx/constraintlayout/widget/ConstraintLayout.getTargetWidget:(I)LX/05G;
        //  1475: astore          5
        //  1477: aload           5
        //  1479: ifnull          1569
        //  1482: aload           14
        //  1484: ifnull          1569
        //  1487: aload           14
        //  1489: invokevirtual   android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //  1492: instanceof      Landroidx/constraintlayout/widget/05X;
        //  1495: ifeq            1569
        //  1498: aload           14
        //  1500: invokevirtual   android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //  1503: checkcast       Landroidx/constraintlayout/widget/05X;
        //  1506: astore          14
        //  1508: aload           8
        //  1510: iconst_1       
        //  1511: putfield        androidx/constraintlayout/widget/05X.needsBaseline:Z
        //  1514: aload           14
        //  1516: iconst_1       
        //  1517: putfield        androidx/constraintlayout/widget/05X.needsBaseline:Z
        //  1520: aload           6
        //  1522: getstatic       X/05C.BASELINE:LX/05C;
        //  1525: invokevirtual   X/05G.getAnchor:(LX/05C;)LX/05D;
        //  1528: aload           5
        //  1530: getstatic       X/05C.BASELINE:LX/05C;
        //  1533: invokevirtual   X/05G.getAnchor:(LX/05C;)LX/05D;
        //  1536: iconst_0       
        //  1537: iconst_m1      
        //  1538: getstatic       X/05B.STRONG:LX/05B;
        //  1541: iconst_0       
        //  1542: iconst_1       
        //  1543: invokevirtual   X/05D.LIZ:(LX/05D;IILX/05B;IZ)Z
        //  1546: pop            
        //  1547: aload           6
        //  1549: getstatic       X/05C.TOP:LX/05C;
        //  1552: invokevirtual   X/05G.getAnchor:(LX/05C;)LX/05D;
        //  1555: invokevirtual   X/05D.LIZJ:()V
        //  1558: aload           6
        //  1560: getstatic       X/05C.BOTTOM:LX/05C;
        //  1563: invokevirtual   X/05G.getAnchor:(LX/05C;)LX/05D;
        //  1566: invokevirtual   X/05D.LIZJ:()V
        //  1569: fload           10
        //  1571: fconst_0       
        //  1572: fcmpl          
        //  1573: iflt            1592
        //  1576: fload           10
        //  1578: ldc_w           0.5
        //  1581: fcmpl          
        //  1582: ifeq            1592
        //  1585: aload           6
        //  1587: fload           10
        //  1589: putfield        X/05G.mHorizontalBiasPercent:F
        //  1592: aload           8
        //  1594: getfield        androidx/constraintlayout/widget/05X.verticalBias:F
        //  1597: fconst_0       
        //  1598: fcmpl          
        //  1599: iflt            927
        //  1602: aload           8
        //  1604: getfield        androidx/constraintlayout/widget/05X.verticalBias:F
        //  1607: ldc_w           0.5
        //  1610: fcmpl          
        //  1611: ifeq            927
        //  1614: aload           6
        //  1616: aload           8
        //  1618: getfield        androidx/constraintlayout/widget/05X.verticalBias:F
        //  1621: putfield        X/05G.mVerticalBiasPercent:F
        //  1624: goto            927
        //  1627: aload           8
        //  1629: getfield        androidx/constraintlayout/widget/05X.bottomToBottom:I
        //  1632: iconst_m1      
        //  1633: if_icmpeq       1440
        //  1636: aload_0        
        //  1637: aload           8
        //  1639: getfield        androidx/constraintlayout/widget/05X.bottomToBottom:I
        //  1642: invokespecial   androidx/constraintlayout/widget/ConstraintLayout.getTargetWidget:(I)LX/05G;
        //  1645: astore          5
        //  1647: aload           5
        //  1649: ifnull          1440
        //  1652: aload           6
        //  1654: getstatic       X/05C.BOTTOM:LX/05C;
        //  1657: aload           5
        //  1659: getstatic       X/05C.BOTTOM:LX/05C;
        //  1662: aload           8
        //  1664: getfield        androidx/constraintlayout/widget/05X.bottomMargin:I
        //  1667: aload           8
        //  1669: getfield        androidx/constraintlayout/widget/05X.goneBottomMargin:I
        //  1672: invokevirtual   X/05G.immediateConnect:(LX/05C;LX/05G;LX/05C;II)V
        //  1675: goto            1440
        //  1678: aload           8
        //  1680: getfield        androidx/constraintlayout/widget/05X.topToBottom:I
        //  1683: iconst_m1      
        //  1684: if_icmpeq       1392
        //  1687: aload_0        
        //  1688: aload           8
        //  1690: getfield        androidx/constraintlayout/widget/05X.topToBottom:I
        //  1693: invokespecial   androidx/constraintlayout/widget/ConstraintLayout.getTargetWidget:(I)LX/05G;
        //  1696: astore          5
        //  1698: aload           5
        //  1700: ifnull          1392
        //  1703: aload           6
        //  1705: getstatic       X/05C.TOP:LX/05C;
        //  1708: aload           5
        //  1710: getstatic       X/05C.BOTTOM:LX/05C;
        //  1713: aload           8
        //  1715: getfield        androidx/constraintlayout/widget/05X.topMargin:I
        //  1718: aload           8
        //  1720: getfield        androidx/constraintlayout/widget/05X.goneTopMargin:I
        //  1723: invokevirtual   X/05G.immediateConnect:(LX/05C;LX/05G;LX/05C;II)V
        //  1726: goto            1392
        //  1729: iload           7
        //  1731: iconst_m1      
        //  1732: if_icmpeq       1344
        //  1735: aload_0        
        //  1736: iload           7
        //  1738: invokespecial   androidx/constraintlayout/widget/ConstraintLayout.getTargetWidget:(I)LX/05G;
        //  1741: astore          5
        //  1743: aload           5
        //  1745: ifnull          1344
        //  1748: aload           6
        //  1750: getstatic       X/05C.RIGHT:LX/05C;
        //  1753: aload           5
        //  1755: getstatic       X/05C.RIGHT:LX/05C;
        //  1758: aload           8
        //  1760: getfield        androidx/constraintlayout/widget/05X.rightMargin:I
        //  1763: iload           9
        //  1765: invokevirtual   X/05G.immediateConnect:(LX/05C;LX/05G;LX/05C;II)V
        //  1768: goto            1344
        //  1771: iload           11
        //  1773: iconst_m1      
        //  1774: if_icmpeq       1305
        //  1777: aload_0        
        //  1778: iload           11
        //  1780: invokespecial   androidx/constraintlayout/widget/ConstraintLayout.getTargetWidget:(I)LX/05G;
        //  1783: astore          5
        //  1785: aload           5
        //  1787: ifnull          1305
        //  1790: aload           6
        //  1792: getstatic       X/05C.LEFT:LX/05C;
        //  1795: aload           5
        //  1797: getstatic       X/05C.RIGHT:LX/05C;
        //  1800: aload           8
        //  1802: getfield        androidx/constraintlayout/widget/05X.leftMargin:I
        //  1805: iload           13
        //  1807: invokevirtual   X/05G.immediateConnect:(LX/05C;LX/05G;LX/05C;II)V
        //  1810: goto            1305
        //  1813: iload_1        
        //  1814: ifeq            464
        //  1817: aload_0        
        //  1818: invokevirtual   androidx/constraintlayout/widget/ConstraintLayout.getResources:()Landroid/content/res/Resources;
        //  1821: aload           5
        //  1823: invokevirtual   android/view/View.getId:()I
        //  1826: invokevirtual   android/content/res/Resources.getResourceName:(I)Ljava/lang/String;
        //  1829: astore          14
        //  1831: aload_0        
        //  1832: iload_3        
        //  1833: aload           14
        //  1835: aload           5
        //  1837: invokevirtual   android/view/View.getId:()I
        //  1840: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1843: invokevirtual   androidx/constraintlayout/widget/ConstraintLayout.setDesignInformation:(ILjava/lang/Object;Ljava/lang/Object;)V
        //  1846: aload           14
        //  1848: aload           14
        //  1850: ldc_w           "id/"
        //  1853: invokevirtual   java/lang/String.indexOf:(Ljava/lang/String;)I
        //  1856: iconst_3       
        //  1857: iadd           
        //  1858: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //  1861: astore          14
        //  1863: aload_0        
        //  1864: aload           5
        //  1866: invokevirtual   android/view/View.getId:()I
        //  1869: invokespecial   androidx/constraintlayout/widget/ConstraintLayout.getTargetWidget:(I)LX/05G;
        //  1872: aload           14
        //  1874: putfield        X/05G.mDebugName:Ljava/lang/String;
        //  1877: goto            464
        //  1880: return         
        //  1881: astore          8
        //  1883: goto            106
        //  1886: astore          14
        //  1888: goto            464
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                             
        //  -----  -----  -----  -----  -------------------------------------------------
        //  33     71     1881   1886   Landroid/content/res/Resources$NotFoundException;
        //  81     92     1881   1886   Landroid/content/res/Resources$NotFoundException;
        //  92     106    1881   1886   Landroid/content/res/Resources$NotFoundException;
        //  1817   1877   1886   1891   Landroid/content/res/Resources$NotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_1880:
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
    
    private void setSelfDimensionBehaviour(int size, int size2) {
        final int mode = View$MeasureSpec.getMode(size);
        size = View$MeasureSpec.getSize(size);
        final int mode2 = View$MeasureSpec.getMode(size2);
        size2 = View$MeasureSpec.getSize(size2);
        final int paddingTop = this.getPaddingTop();
        final int paddingBottom = this.getPaddingBottom();
        final int paddingLeft = this.getPaddingLeft();
        final int paddingRight = this.getPaddingRight();
        05G.a horizontalDimensionBehaviour = 05G.a.FIXED;
        05G.a verticalDimensionBehaviour = 05G.a.FIXED;
        this.getLayoutParams();
        Label_0080: {
            if (mode != Integer.MIN_VALUE) {
                if (mode != 0) {
                    if (mode == 1073741824) {
                        size = Math.min(this.mMaxWidth, size) - (paddingLeft + paddingRight);
                        break Label_0080;
                    }
                }
                else {
                    horizontalDimensionBehaviour = 05G.a.WRAP_CONTENT;
                }
                size = 0;
            }
            else {
                horizontalDimensionBehaviour = 05G.a.WRAP_CONTENT;
            }
        }
        Label_0103: {
            if (mode2 != Integer.MIN_VALUE) {
                if (mode2 != 0) {
                    if (mode2 == 1073741824) {
                        size2 = Math.min(this.mMaxHeight, size2) - (paddingTop + paddingBottom);
                        break Label_0103;
                    }
                }
                else {
                    verticalDimensionBehaviour = 05G.a.WRAP_CONTENT;
                }
                size2 = 0;
            }
            else {
                verticalDimensionBehaviour = 05G.a.WRAP_CONTENT;
            }
        }
        this.mLayoutWidget.setMinWidth(0);
        this.mLayoutWidget.setMinHeight(0);
        this.mLayoutWidget.setHorizontalDimensionBehaviour(horizontalDimensionBehaviour);
        this.mLayoutWidget.setWidth(size);
        this.mLayoutWidget.setVerticalDimensionBehaviour(verticalDimensionBehaviour);
        this.mLayoutWidget.setHeight(size2);
        this.mLayoutWidget.setMinWidth(this.mMinWidth - this.getPaddingLeft() - this.getPaddingRight());
        this.mLayoutWidget.setMinHeight(this.mMinHeight - this.getPaddingTop() - this.getPaddingBottom());
    }
    
    private void updateHierarchy() {
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            if (this.getChildAt(i).isLayoutRequested()) {
                this.mVariableDimensionsWidgets.clear();
                this.setChildrenConstraints();
                break;
            }
        }
    }
    
    private void updatePostMeasures() {
        final int childCount = this.getChildCount();
        final int n = 0;
        for (int i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            if (child instanceof 05Z) {
                final 05Z 05Z = (05Z)child;
                if (05Z.LIZIZ != null) {
                    final ConstraintLayout.a a = (ConstraintLayout.a)05Z.getLayoutParams();
                    final ConstraintLayout.a a2 = (ConstraintLayout.a)05Z.LIZIZ.getLayoutParams();
                    a2.widget.mVisibility = 0;
                    a.widget.setWidth(a2.widget.getWidth());
                    a.widget.setHeight(a2.widget.getHeight());
                    a2.widget.mVisibility = 8;
                }
            }
        }
        final int size = this.mConstraintHelpers.size();
        if (size > 0) {
            int n2 = n;
            do {
                this.mConstraintHelpers.get(n2).updatePostMeasure(this);
            } while (++n2 < size);
        }
    }
    
    public void addView(final View view, final int n, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        super.addView(view, n, viewGroup$LayoutParams);
    }
    
    public boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof ConstraintLayout.a;
    }
    
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.isInEditMode()) {
            final int childCount = this.getChildCount();
            final float n = (float)this.getWidth();
            final float n2 = (float)this.getHeight();
            Canvas canvas2;
            for (int i = 0; i < childCount; ++i, canvas = canvas2) {
                final View child = this.getChildAt(i);
                canvas2 = canvas;
                if (child.getVisibility() != 8) {
                    final Object tag = child.getTag();
                    canvas2 = canvas;
                    if (tag != null) {
                        canvas2 = canvas;
                        if (tag instanceof String) {
                            final String[] split = ((String)tag).split(",");
                            canvas2 = canvas;
                            if (split.length == 4) {
                                final int int1 = Integer.parseInt(split[0]);
                                final int int2 = Integer.parseInt(split[1]);
                                final int int3 = Integer.parseInt(split[2]);
                                final int int4 = Integer.parseInt(split[3]);
                                final int n3 = (int)(int1 / 1080.0f * n);
                                final int n4 = (int)(int2 / 1920.0f * n2);
                                final int n5 = (int)(int3 / 1080.0f * n);
                                final int n6 = (int)(int4 / 1920.0f * n2);
                                final Paint paint = new Paint();
                                paint.setColor(-65536);
                                final float n7 = (float)n3;
                                final float n8 = (float)n4;
                                final float n9 = (float)(n3 + n5);
                                canvas.drawLine(n7, n8, n9, n8, paint);
                                final float n10 = (float)(n4 + n6);
                                canvas.drawLine(n9, n8, n9, n10, paint);
                                canvas.drawLine(n9, n10, n7, n10, paint);
                                canvas.drawLine(n7, n10, n7, n8, paint);
                                paint.setColor(-16711936);
                                canvas.drawLine(n7, n8, n9, n10, paint);
                                canvas.drawLine(n7, n10, n9, n8, paint);
                                canvas2 = canvas;
                            }
                        }
                    }
                }
            }
        }
    }
    
    public void fillMetrics(final 05R 05R) {
        this.mMetrics = 05R;
        05Q.LJII = 05R;
    }
    
    public ConstraintLayout.a generateDefaultLayoutParams() {
        return new ConstraintLayout.a(-2, -2);
    }
    
    public ConstraintLayout.a generateLayoutParams(final AttributeSet set) {
        return new ConstraintLayout.a(this.getContext(), set);
    }
    
    public ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return (ViewGroup$LayoutParams)new ConstraintLayout.a(viewGroup$LayoutParams);
    }
    
    public Object getDesignInformation(final int n, final Object o) {
        if (n == 0 && o instanceof String) {
            final HashMap<String, Integer> mDesignIds = this.mDesignIds;
            if (mDesignIds != null && mDesignIds.containsKey(o)) {
                return this.mDesignIds.get(o);
            }
        }
        return null;
    }
    
    public int getMaxHeight() {
        return this.mMaxHeight;
    }
    
    public int getMaxWidth() {
        return this.mMaxWidth;
    }
    
    public int getMinHeight() {
        return this.mMinHeight;
    }
    
    public int getMinWidth() {
        return this.mMinWidth;
    }
    
    public int getOptimizationLevel() {
        return this.mLayoutWidget.LJIILLIIL;
    }
    
    public View getViewById(final int n) {
        return (View)this.mChildrenByIds.get(n);
    }
    
    public final 05G getViewWidget(final View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        return ((ConstraintLayout.a)view.getLayoutParams()).widget;
    }
    
    public void onLayout(final boolean b, int i, int n, int n2, int drawX) {
        n2 = this.getChildCount();
        final boolean inEditMode = this.isInEditMode();
        n = 0;
        View child;
        ConstraintLayout.a a;
        05G widget;
        int drawY;
        int n3;
        int n4;
        View content;
        for (i = 0; i < n2; ++i) {
            child = this.getChildAt(i);
            a = (ConstraintLayout.a)child.getLayoutParams();
            widget = a.widget;
            if ((child.getVisibility() != 8 || a.isGuideline || a.isHelper || inEditMode) && !a.isInPlaceholder) {
                drawX = widget.getDrawX();
                drawY = widget.getDrawY();
                n3 = widget.getWidth() + drawX;
                n4 = widget.getHeight() + drawY;
                child.layout(drawX, drawY, n3, n4);
                if (child instanceof 05Z) {
                    content = ((05Z)child).getContent();
                    if (content != null) {
                        content.setVisibility(0);
                        content.layout(drawX, drawY, n3, n4);
                    }
                }
            }
        }
        n2 = this.mConstraintHelpers.size();
        if (n2 > 0) {
            i = n;
            do {
                this.mConstraintHelpers.get(i).updatePostLayout(this);
            } while (++i < n2);
        }
    }
    
    public void onMeasure(int resolveSizeAndState, int min) {
        System.currentTimeMillis();
        final int mode = View$MeasureSpec.getMode(resolveSizeAndState);
        final int size = View$MeasureSpec.getSize(resolveSizeAndState);
        final int mode2 = View$MeasureSpec.getMode(min);
        final int size2 = View$MeasureSpec.getSize(min);
        final int paddingLeft = this.getPaddingLeft();
        final int paddingTop = this.getPaddingTop();
        this.mLayoutWidget.mX = paddingLeft;
        this.mLayoutWidget.mY = paddingTop;
        this.mLayoutWidget.setMaxWidth(this.mMaxWidth);
        this.mLayoutWidget.setMaxHeight(this.mMaxHeight);
        this.mLayoutWidget.LIZ = (this.getLayoutDirection() == 1);
        this.setSelfDimensionBehaviour(resolveSizeAndState, min);
        final int width = this.mLayoutWidget.getWidth();
        final int height = this.mLayoutWidget.getHeight();
        boolean b;
        if (this.mDirtyHierarchy) {
            this.mDirtyHierarchy = false;
            this.updateHierarchy();
            b = true;
        }
        else {
            b = false;
        }
        boolean b2;
        if ((this.mOptimizationLevel & 0x8) == 0x8) {
            b2 = true;
            final 1fh mLayoutWidget = this.mLayoutWidget;
            mLayoutWidget.LIZJ();
            mLayoutWidget.analyze(mLayoutWidget.LJIILLIIL);
            this.mLayoutWidget.LIZ(width, height);
            this.internalMeasureDimensions(resolveSizeAndState, min);
        }
        else {
            b2 = false;
            this.internalMeasureChildren(resolveSizeAndState, min);
        }
        this.updatePostMeasures();
        Label_0239: {
            if (this.getChildCount() > 0 && b) {
                final 1fh mLayoutWidget2 = this.mLayoutWidget;
                if ((mLayoutWidget2.LJIILLIIL & 0x20) != 0x20) {
                    057.LIZ(mLayoutWidget2);
                }
                else {
                    mLayoutWidget2.LJIIZILJ = true;
                    mLayoutWidget2.LJIIJJI = false;
                    mLayoutWidget2.LJIIL = false;
                    mLayoutWidget2.LJIILIIL = false;
                    final ArrayList<05G> ljijj = mLayoutWidget2.LJIJJ;
                    final List<05H> ljiij = mLayoutWidget2.LJIIJ;
                    boolean b3;
                    if (mLayoutWidget2.getHorizontalDimensionBehaviour() == 05G.a.WRAP_CONTENT) {
                        b3 = true;
                    }
                    else {
                        b3 = false;
                    }
                    boolean b4;
                    if (mLayoutWidget2.getVerticalDimensionBehaviour() == 05G.a.WRAP_CONTENT) {
                        b4 = true;
                    }
                    else {
                        b4 = false;
                    }
                    final boolean b5 = b3 || b4;
                    ljiij.clear();
                    for (final 05G 05G : ljijj) {
                        05G.mBelongingGroup = null;
                        05G.mGroupsToSolver = false;
                        05G.resetResolutionNodes();
                    }
                    for (final 05G 05G2 : ljijj) {
                        if (05G2.mBelongingGroup == null) {
                            final 05H 05H = new 05H(new ArrayList<05G>(), (byte)0);
                            ljiij.add(05H);
                            if (!057.LIZ(05G2, 05H, ljiij, b5)) {
                                057.LIZ(mLayoutWidget2);
                                mLayoutWidget2.LJIIZILJ = false;
                                break Label_0239;
                            }
                            continue;
                        }
                    }
                    final Iterator<05H> iterator3 = ljiij.iterator();
                    int max = 0;
                    int max2 = 0;
                    while (iterator3.hasNext()) {
                        final 05H 05H2 = iterator3.next();
                        max = Math.max(max, 057.LIZ(05H2, 0));
                        max2 = Math.max(max2, 057.LIZ(05H2, 1));
                    }
                    if (b3) {
                        mLayoutWidget2.setHorizontalDimensionBehaviour(05G.a.FIXED);
                        mLayoutWidget2.setWidth(max);
                        mLayoutWidget2.LJIIJJI = true;
                        mLayoutWidget2.LJIIL = true;
                        mLayoutWidget2.LJIILJJIL = max;
                    }
                    if (b4) {
                        mLayoutWidget2.setVerticalDimensionBehaviour(05G.a.FIXED);
                        mLayoutWidget2.setHeight(max2);
                        mLayoutWidget2.LJIIJJI = true;
                        mLayoutWidget2.LJIILIIL = true;
                        mLayoutWidget2.LJIILL = max2;
                    }
                    057.LIZ(ljiij, 0, mLayoutWidget2.getWidth());
                    057.LIZ(ljiij, 1, mLayoutWidget2.getHeight());
                }
            }
        }
        if (this.mLayoutWidget.LJIIJJI) {
            if (this.mLayoutWidget.LJIIL && mode == Integer.MIN_VALUE) {
                if (this.mLayoutWidget.LJIILJJIL < size) {
                    final 1fh mLayoutWidget3 = this.mLayoutWidget;
                    mLayoutWidget3.setWidth(mLayoutWidget3.LJIILJJIL);
                }
                this.mLayoutWidget.setHorizontalDimensionBehaviour(05G.a.FIXED);
            }
            if (this.mLayoutWidget.LJIILIIL && mode2 == Integer.MIN_VALUE) {
                if (this.mLayoutWidget.LJIILL < size2) {
                    final 1fh mLayoutWidget4 = this.mLayoutWidget;
                    mLayoutWidget4.setHeight(mLayoutWidget4.LJIILL);
                }
                this.mLayoutWidget.setVerticalDimensionBehaviour(05G.a.FIXED);
            }
        }
        if ((this.mOptimizationLevel & 0x20) == 0x20) {
            final int width2 = this.mLayoutWidget.getWidth();
            final int height2 = this.mLayoutWidget.getHeight();
            if (this.mLastMeasureWidth != width2 && mode == 1073741824) {
                057.LIZ(this.mLayoutWidget.LJIIJ, 0, width2);
            }
            if (this.mLastMeasureHeight != height2 && mode2 == 1073741824) {
                057.LIZ(this.mLayoutWidget.LJIIJ, 1, height2);
            }
            if (this.mLayoutWidget.LJIIL && this.mLayoutWidget.LJIILJJIL > size) {
                057.LIZ(this.mLayoutWidget.LJIIJ, 0, size);
            }
            if (this.mLayoutWidget.LJIILIIL && this.mLayoutWidget.LJIILL > size2) {
                057.LIZ(this.mLayoutWidget.LJIIJ, 1, size2);
            }
        }
        if (this.getChildCount() > 0) {
            this.solveLinearSystem("First pass");
        }
        final int size3 = this.mVariableDimensionsWidgets.size();
        final int n = paddingTop + this.getPaddingBottom();
        final int n2 = paddingLeft + this.getPaddingRight();
        int n14;
        if (size3 > 0) {
            boolean b6;
            if (this.mLayoutWidget.getHorizontalDimensionBehaviour() == 05G.a.WRAP_CONTENT) {
                b6 = true;
            }
            else {
                b6 = false;
            }
            boolean b7;
            if (this.mLayoutWidget.getVerticalDimensionBehaviour() == 05G.a.WRAP_CONTENT) {
                b7 = true;
            }
            else {
                b7 = false;
            }
            int max3 = Math.max(this.mLayoutWidget.getWidth(), this.mMinWidth);
            int max4 = Math.max(this.mLayoutWidget.getHeight(), this.mMinHeight);
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            int n6;
            int height3;
            int width3;
            int n7;
            while (true) {
                final 05G 05G3 = this.mVariableDimensionsWidgets.get(n3);
                final View view = (View)05G3.mCompanionWidget;
                n6 = n5;
                height3 = max4;
                width3 = max3;
                n7 = n4;
                Label_1169: {
                    if (view != null) {
                        final ConstraintLayout.a a = (ConstraintLayout.a)view.getLayoutParams();
                        n6 = n5;
                        height3 = max4;
                        width3 = max3;
                        n7 = n4;
                        if (!a.isHelper) {
                            n6 = n5;
                            height3 = max4;
                            width3 = max3;
                            n7 = n4;
                            if (!a.isGuideline) {
                                n6 = n5;
                                height3 = max4;
                                width3 = max3;
                                n7 = n4;
                                if (view.getVisibility() != 8) {
                                    if (b2 && 05G3.getResolutionWidth().LJ()) {
                                        n6 = n5;
                                        height3 = max4;
                                        width3 = max3;
                                        n7 = n4;
                                        if (05G3.getResolutionHeight().LJ()) {
                                            break Label_1169;
                                        }
                                    }
                                    int n8;
                                    if (a.width == -2 && a.horizontalDimensionFixed) {
                                        n8 = getChildMeasureSpec(resolveSizeAndState, n2, a.width);
                                    }
                                    else {
                                        n8 = View$MeasureSpec.makeMeasureSpec(05G3.getWidth(), 1073741824);
                                    }
                                    int n9;
                                    if (a.height == -2 && a.verticalDimensionFixed) {
                                        n9 = getChildMeasureSpec(min, n, a.height);
                                    }
                                    else {
                                        n9 = View$MeasureSpec.makeMeasureSpec(05G3.getHeight(), 1073741824);
                                    }
                                    view.measure(n8, n9);
                                    final 05R mMetrics = this.mMetrics;
                                    if (mMetrics != null) {
                                        ++mMetrics.LIZIZ;
                                    }
                                    final int measuredWidth = view.getMeasuredWidth();
                                    final int measuredHeight = view.getMeasuredHeight();
                                    int max5 = max3;
                                    if (measuredWidth != 05G3.getWidth()) {
                                        05G3.setWidth(measuredWidth);
                                        if (b2) {
                                            05G3.getResolutionWidth().LIZ(measuredWidth);
                                        }
                                        max5 = max3;
                                        if (b6 && 05G3.getRight() > (max5 = max3)) {
                                            max5 = Math.max(max3, 05G3.getRight() + 05G3.getAnchor(05D.b.RIGHT).LIZIZ());
                                        }
                                        n4 = 1;
                                    }
                                    int max6 = max4;
                                    if (measuredHeight != 05G3.getHeight()) {
                                        05G3.setHeight(measuredHeight);
                                        if (b2) {
                                            05G3.getResolutionHeight().LIZ(measuredHeight);
                                        }
                                        max6 = max4;
                                        if (b7 && 05G3.getBottom() > (max6 = max4)) {
                                            max6 = Math.max(max4, 05G3.getBottom() + 05G3.getAnchor(05D.b.BOTTOM).LIZIZ());
                                        }
                                        n4 = 1;
                                    }
                                    int n10 = n4;
                                    if (a.needsBaseline) {
                                        final int baseline = view.getBaseline();
                                        n10 = n4;
                                        if (baseline != -1) {
                                            n10 = n4;
                                            if (baseline != 05G3.mBaselineDistance) {
                                                05G3.mBaselineDistance = baseline;
                                                n10 = 1;
                                            }
                                        }
                                    }
                                    final int combineMeasuredStates = combineMeasuredStates(n5, view.getMeasuredState());
                                    n7 = n10;
                                    width3 = max5;
                                    height3 = max6;
                                    n6 = combineMeasuredStates;
                                }
                            }
                        }
                    }
                }
                if (++n3 >= size3) {
                    break;
                }
                n5 = n6;
                max4 = height3;
                max3 = width3;
                n4 = n7;
            }
            Label_1780: {
                if (n7 != 0) {
                    this.mLayoutWidget.setWidth(width);
                    this.mLayoutWidget.setHeight(height);
                    if (b2) {
                        this.mLayoutWidget.LIZIZ();
                    }
                    this.solveLinearSystem("2nd pass");
                    int n11;
                    if (this.mLayoutWidget.getWidth() < width3) {
                        this.mLayoutWidget.setWidth(width3);
                        n11 = 1;
                    }
                    else {
                        n11 = 0;
                    }
                    if (this.mLayoutWidget.getHeight() < height3) {
                        this.mLayoutWidget.setHeight(height3);
                    }
                    else if (n11 == 0) {
                        break Label_1780;
                    }
                    this.solveLinearSystem("3rd pass");
                }
            }
            int n12 = 0;
            while (true) {
                final 05G 05G4 = this.mVariableDimensionsWidgets.get(n12);
                final View view2 = (View)05G4.mCompanionWidget;
                if (view2 != null && (view2.getMeasuredWidth() != 05G4.getWidth() || view2.getMeasuredHeight() != 05G4.getHeight()) && 05G4.mVisibility != 8) {
                    view2.measure(View$MeasureSpec.makeMeasureSpec(05G4.getWidth(), 1073741824), View$MeasureSpec.makeMeasureSpec(05G4.getHeight(), 1073741824));
                    final 05R mMetrics2 = this.mMetrics;
                    if (mMetrics2 != null) {
                        ++mMetrics2.LIZIZ;
                    }
                }
                final int n13 = n12 + 1;
                n14 = n6;
                if (n13 >= size3) {
                    break;
                }
                n12 = n13;
            }
        }
        else {
            n14 = 0;
        }
        final int width4 = this.mLayoutWidget.getWidth();
        final int height4 = this.mLayoutWidget.getHeight();
        resolveSizeAndState = resolveSizeAndState(width4 + n2, resolveSizeAndState, n14);
        final int resolveSizeAndState2 = resolveSizeAndState(height4 + n, min, n14 << 16);
        min = Math.min(this.mMaxWidth, resolveSizeAndState & 0xFFFFFF);
        final int min2 = Math.min(this.mMaxHeight, resolveSizeAndState2 & 0xFFFFFF);
        resolveSizeAndState = min;
        if (this.mLayoutWidget.LJIJ) {
            resolveSizeAndState = (min | 0x1000000);
        }
        min = min2;
        if (this.mLayoutWidget.LJIJI) {
            min = (min2 | 0x1000000);
        }
        this.setMeasuredDimension(resolveSizeAndState, min);
        this.mLastMeasureWidth = resolveSizeAndState;
        this.mLastMeasureHeight = min;
    }
    
    public void onViewAdded(final View view) {
        super.onViewAdded(view);
        final 05G viewWidget = this.getViewWidget(view);
        if (view instanceof 05Y && !(viewWidget instanceof 13m)) {
            final ConstraintLayout.a a = (ConstraintLayout.a)view.getLayoutParams();
            a.widget = new 13m();
            a.isGuideline = true;
            ((13m)a.widget).LIZ(a.orientation);
        }
        if (view instanceof 05a) {
            final 05a 05a = (05a)view;
            05a.validateParams();
            ((ConstraintLayout.a)view.getLayoutParams()).isHelper = true;
            if (!this.mConstraintHelpers.contains(05a)) {
                this.mConstraintHelpers.add(05a);
            }
        }
        this.mChildrenByIds.put(view.getId(), (Object)view);
        this.mDirtyHierarchy = true;
    }
    
    public void onViewRemoved(final View view) {
        super.onViewRemoved(view);
        this.mChildrenByIds.remove(view.getId());
        final 05G viewWidget = this.getViewWidget(view);
        this.mLayoutWidget.LIZ(viewWidget);
        this.mConstraintHelpers.remove(view);
        this.mVariableDimensionsWidgets.remove(viewWidget);
        this.mDirtyHierarchy = true;
    }
    
    public void removeView(final View view) {
        super.removeView(view);
    }
    
    public void requestLayout() {
        super.requestLayout();
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
    }
    
    public void setConstraintSet(final 05c mConstraintSet) {
        this.mConstraintSet = mConstraintSet;
    }
    
    public void setDesignInformation(int n, final Object o, final Object o2) {
        if (n == 0 && o instanceof String && o2 instanceof Integer) {
            if (this.mDesignIds == null) {
                this.mDesignIds = new HashMap<String, Integer>();
            }
            final String s = (String)o;
            n = s.indexOf("/");
            String substring = s;
            if (n != -1) {
                substring = s.substring(n + 1);
            }
            n = (int)o2;
            this.mDesignIds.put(substring, n);
        }
    }
    
    public void setId(final int id) {
        this.mChildrenByIds.remove(this.getId());
        super.setId(id);
        this.mChildrenByIds.put(this.getId(), (Object)this);
    }
    
    public void setMaxHeight(final int mMaxHeight) {
        if (mMaxHeight == this.mMaxHeight) {
            return;
        }
        this.mMaxHeight = mMaxHeight;
        this.requestLayout();
    }
    
    public void setMaxWidth(final int mMaxWidth) {
        if (mMaxWidth == this.mMaxWidth) {
            return;
        }
        this.mMaxWidth = mMaxWidth;
        this.requestLayout();
    }
    
    public void setMinHeight(final int mMinHeight) {
        if (mMinHeight == this.mMinHeight) {
            return;
        }
        this.mMinHeight = mMinHeight;
        this.requestLayout();
    }
    
    public void setMinWidth(final int mMinWidth) {
        if (mMinWidth == this.mMinWidth) {
            return;
        }
        this.mMinWidth = mMinWidth;
        this.requestLayout();
    }
    
    public void setOptimizationLevel(final int ljiilliil) {
        this.mLayoutWidget.LJIILLIIL = ljiilliil;
    }
    
    public boolean shouldDelayChildPressedState() {
        return false;
    }
    
    public void solveLinearSystem(final String s) {
        this.mLayoutWidget.LIZ();
        final 05R mMetrics = this.mMetrics;
        if (mMetrics != null) {
            ++mMetrics.LIZJ;
        }
    }
}
