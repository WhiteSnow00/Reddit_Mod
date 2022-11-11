// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Arrays;
import java.util.ArrayList;
import com.bytedance.covode.number.Covode;
import java.util.List;

public class 1fh extends 13q
{
    public boolean LIZ;
    public 05Q LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public 059[] LJIIIIZZ;
    public 059[] LJIIIZ;
    public List<05H> LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public int LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;
    public boolean LJIIZILJ;
    public boolean LJIJ;
    public boolean LJIJI;
    public 05M LJIJJLI;
    
    static {
        Covode.recordClassIndex(608);
    }
    
    public 1fh() {
        this.LIZIZ = new 05Q();
        this.LJI = 0;
        this.LJII = 0;
        this.LJIIIIZZ = new 059[4];
        this.LJIIIZ = new 059[4];
        this.LJIIJ = new ArrayList<05H>();
        this.LJIIJJI = false;
        this.LJIIL = false;
        this.LJIILIIL = false;
        this.LJIILJJIL = 0;
        this.LJIILL = 0;
        this.LJIILLIIL = 7;
        this.LJIIZILJ = false;
        this.LJIJ = false;
        this.LJIJI = false;
    }
    
    private void LIZIZ(final 05G 05G) {
        final int lji = this.LJI;
        final 059[] ljiiiz = this.LJIIIZ;
        if (lji + 1 >= ljiiiz.length) {
            this.LJIIIZ = Arrays.copyOf(ljiiiz, ljiiiz.length * 2);
        }
        this.LJIIIZ[this.LJI] = new 059(05G, 0, this.LIZ);
        ++this.LJI;
    }
    
    private void LIZJ(final 05G 05G) {
        final int ljii = this.LJII;
        final 059[] ljiiiizz = this.LJIIIIZZ;
        if (ljii + 1 >= ljiiiizz.length) {
            this.LJIIIIZZ = Arrays.copyOf(ljiiiizz, ljiiiizz.length * 2);
        }
        this.LJIIIIZZ[this.LJII] = new 059(05G, 1, this.LIZ);
        ++this.LJII;
    }
    
    private void LIZLLL() {
        this.LJI = 0;
        this.LJII = 0;
    }
    
    @Override
    public final void LIZ() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        X/05G.mX:I
        //     4: istore_1       
        //     5: aload_0        
        //     6: getfield        X/05G.mY:I
        //     9: istore_2       
        //    10: iconst_0       
        //    11: aload_0        
        //    12: invokevirtual   X/05G.getWidth:()I
        //    15: invokestatic    java/lang/Math.max:(II)I
        //    18: istore_3       
        //    19: iconst_0       
        //    20: aload_0        
        //    21: invokevirtual   X/05G.getHeight:()I
        //    24: invokestatic    java/lang/Math.max:(II)I
        //    27: istore          4
        //    29: aload_0        
        //    30: iconst_0       
        //    31: putfield        X/1fh.LJIJ:Z
        //    34: aload_0        
        //    35: iconst_0       
        //    36: putfield        X/1fh.LJIJI:Z
        //    39: aload_0        
        //    40: getfield        X/05G.mParent:LX/05G;
        //    43: ifnull          288
        //    46: aload_0        
        //    47: getfield        X/1fh.LJIJJLI:LX/05M;
        //    50: ifnonnull       65
        //    53: aload_0        
        //    54: new             LX/05M;
        //    57: dup            
        //    58: aload_0        
        //    59: invokespecial   X/05M.<init>:(LX/05G;)V
        //    62: putfield        X/1fh.LJIJJLI:LX/05M;
        //    65: aload_0        
        //    66: getfield        X/1fh.LJIJJLI:LX/05M;
        //    69: astore          5
        //    71: aload           5
        //    73: aload_0        
        //    74: getfield        X/05G.mX:I
        //    77: putfield        X/05M.LIZ:I
        //    80: aload           5
        //    82: aload_0        
        //    83: getfield        X/05G.mY:I
        //    86: putfield        X/05M.LIZIZ:I
        //    89: aload           5
        //    91: aload_0        
        //    92: invokevirtual   X/05G.getWidth:()I
        //    95: putfield        X/05M.LIZJ:I
        //    98: aload           5
        //   100: aload_0        
        //   101: invokevirtual   X/05G.getHeight:()I
        //   104: putfield        X/05M.LIZLLL:I
        //   107: aload           5
        //   109: getfield        X/05M.LJ:Ljava/util/ArrayList;
        //   112: invokevirtual   java/util/ArrayList.size:()I
        //   115: istore          6
        //   117: iconst_0       
        //   118: istore          7
        //   120: iload           7
        //   122: iload           6
        //   124: if_icmpge       254
        //   127: aload           5
        //   129: getfield        X/05M.LJ:Ljava/util/ArrayList;
        //   132: iload           7
        //   134: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   137: checkcast       LX/05L;
        //   140: astore          8
        //   142: aload           8
        //   144: aload_0        
        //   145: aload           8
        //   147: getfield        X/05L.LIZ:LX/05D;
        //   150: getfield        X/05D.LIZJ:LX/05C;
        //   153: invokevirtual   X/05G.getAnchor:(LX/05C;)LX/05D;
        //   156: putfield        X/05L.LIZ:LX/05D;
        //   159: aload           8
        //   161: getfield        X/05L.LIZ:LX/05D;
        //   164: ifnull          225
        //   167: aload           8
        //   169: aload           8
        //   171: getfield        X/05L.LIZ:LX/05D;
        //   174: getfield        X/05D.LIZLLL:LX/05D;
        //   177: putfield        X/05L.LIZIZ:LX/05D;
        //   180: aload           8
        //   182: aload           8
        //   184: getfield        X/05L.LIZ:LX/05D;
        //   187: invokevirtual   X/05D.LIZIZ:()I
        //   190: putfield        X/05L.LIZJ:I
        //   193: aload           8
        //   195: aload           8
        //   197: getfield        X/05L.LIZ:LX/05D;
        //   200: getfield        X/05D.LJI:LX/05B;
        //   203: putfield        X/05L.LIZLLL:LX/05B;
        //   206: aload           8
        //   208: aload           8
        //   210: getfield        X/05L.LIZ:LX/05D;
        //   213: getfield        X/05D.LJII:I
        //   216: putfield        X/05L.LJ:I
        //   219: iinc            7, 1
        //   222: goto            120
        //   225: aload           8
        //   227: aconst_null    
        //   228: putfield        X/05L.LIZIZ:LX/05D;
        //   231: aload           8
        //   233: iconst_0       
        //   234: putfield        X/05L.LIZJ:I
        //   237: aload           8
        //   239: getstatic       X/05B.STRONG:LX/05B;
        //   242: putfield        X/05L.LIZLLL:LX/05B;
        //   245: aload           8
        //   247: iconst_0       
        //   248: putfield        X/05L.LJ:I
        //   251: goto            219
        //   254: aload_0        
        //   255: aload_0        
        //   256: getfield        X/1fh.LIZJ:I
        //   259: putfield        X/05G.mX:I
        //   262: aload_0        
        //   263: aload_0        
        //   264: getfield        X/1fh.LIZLLL:I
        //   267: putfield        X/05G.mY:I
        //   270: aload_0        
        //   271: invokevirtual   X/05G.resetAnchors:()V
        //   274: aload_0        
        //   275: aload_0        
        //   276: getfield        X/1fh.LIZIZ:LX/05Q;
        //   279: getfield        X/05Q.LJI:LX/05O;
        //   282: invokevirtual   X/05G.resetSolverVariables:(LX/05O;)V
        //   285: goto            298
        //   288: aload_0        
        //   289: iconst_0       
        //   290: putfield        X/05G.mX:I
        //   293: aload_0        
        //   294: iconst_0       
        //   295: putfield        X/05G.mY:I
        //   298: aload_0        
        //   299: getfield        X/1fh.LJIILLIIL:I
        //   302: ifeq            1956
        //   305: aload_0        
        //   306: bipush          8
        //   308: invokevirtual   X/1fh.LIZ:(I)Z
        //   311: ifne            318
        //   314: aload_0        
        //   315: invokevirtual   X/1fh.LIZJ:()V
        //   318: aload_0        
        //   319: bipush          32
        //   321: invokevirtual   X/1fh.LIZ:(I)Z
        //   324: ifne            348
        //   327: aload_0        
        //   328: bipush          8
        //   330: invokevirtual   X/1fh.LIZ:(I)Z
        //   333: ifne            344
        //   336: aload_0        
        //   337: aload_0        
        //   338: getfield        X/1fh.LJIILLIIL:I
        //   341: invokevirtual   X/05G.analyze:(I)V
        //   344: aload_0        
        //   345: invokevirtual   X/1fh.LIZIZ:()V
        //   348: aload_0        
        //   349: getfield        X/1fh.LIZIZ:LX/05Q;
        //   352: iconst_1       
        //   353: putfield        X/05Q.LIZLLL:Z
        //   356: aload_0        
        //   357: getfield        X/05G.mListDimensionBehaviors:[LX/05F;
        //   360: iconst_1       
        //   361: aaload         
        //   362: astore          8
        //   364: aload_0        
        //   365: getfield        X/05G.mListDimensionBehaviors:[LX/05F;
        //   368: iconst_0       
        //   369: aaload         
        //   370: astore          9
        //   372: aload_0        
        //   373: invokespecial   X/1fh.LIZLLL:()V
        //   376: aload_0        
        //   377: getfield        X/1fh.LJIIJ:Ljava/util/List;
        //   380: invokeinterface java/util/List.size:()I
        //   385: ifne            418
        //   388: aload_0        
        //   389: getfield        X/1fh.LJIIJ:Ljava/util/List;
        //   392: invokeinterface java/util/List.clear:()V
        //   397: aload_0        
        //   398: getfield        X/1fh.LJIIJ:Ljava/util/List;
        //   401: iconst_0       
        //   402: new             LX/05H;
        //   405: dup            
        //   406: aload_0        
        //   407: getfield        X/13q.LJIJJ:Ljava/util/ArrayList;
        //   410: invokespecial   X/05H.<init>:(Ljava/util/List;)V
        //   413: invokeinterface java/util/List.add:(ILjava/lang/Object;)V
        //   418: aload_0        
        //   419: getfield        X/1fh.LJIIJ:Ljava/util/List;
        //   422: invokeinterface java/util/List.size:()I
        //   427: istore          10
        //   429: aload_0        
        //   430: getfield        X/13q.LJIJJ:Ljava/util/ArrayList;
        //   433: astore          11
        //   435: aload_0        
        //   436: invokevirtual   X/05G.getHorizontalDimensionBehaviour:()LX/05F;
        //   439: getstatic       X/05F.WRAP_CONTENT:LX/05F;
        //   442: if_acmpeq       455
        //   445: aload_0        
        //   446: invokevirtual   X/05G.getVerticalDimensionBehaviour:()LX/05F;
        //   449: getstatic       X/05F.WRAP_CONTENT:LX/05F;
        //   452: if_acmpne       1950
        //   455: iconst_1       
        //   456: istore          12
        //   458: iconst_0       
        //   459: istore          7
        //   461: iconst_0       
        //   462: istore          13
        //   464: iconst_0       
        //   465: istore          6
        //   467: iload           13
        //   469: iload           10
        //   471: if_icmpge       1967
        //   474: aload_0        
        //   475: getfield        X/1fh.LJIIZILJ:Z
        //   478: ifne            1967
        //   481: aload_0        
        //   482: getfield        X/1fh.LJIIJ:Ljava/util/List;
        //   485: iload           13
        //   487: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   492: checkcast       LX/05H;
        //   495: getfield        X/05H.LIZLLL:Z
        //   498: ifne            1936
        //   501: aload_0        
        //   502: bipush          32
        //   504: invokevirtual   X/1fh.LIZ:(I)Z
        //   507: ifeq            575
        //   510: aload_0        
        //   511: invokevirtual   X/05G.getHorizontalDimensionBehaviour:()LX/05F;
        //   514: getstatic       X/05F.FIXED:LX/05F;
        //   517: if_acmpne       1909
        //   520: aload_0        
        //   521: invokevirtual   X/05G.getVerticalDimensionBehaviour:()LX/05F;
        //   524: getstatic       X/05F.FIXED:LX/05F;
        //   527: if_acmpne       1909
        //   530: aload_0        
        //   531: getfield        X/1fh.LJIIJ:Ljava/util/List;
        //   534: iload           13
        //   536: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   541: checkcast       LX/05H;
        //   544: astore          14
        //   546: aload           14
        //   548: getfield        X/05H.LJIIIZ:Ljava/util/List;
        //   551: invokeinterface java/util/List.isEmpty:()Z
        //   556: ifne            1792
        //   559: aload           14
        //   561: getfield        X/05H.LJIIIZ:Ljava/util/List;
        //   564: astore          5
        //   566: aload_0        
        //   567: aload           5
        //   569: checkcast       Ljava/util/ArrayList;
        //   572: putfield        X/13q.LJIJJ:Ljava/util/ArrayList;
        //   575: aload_0        
        //   576: invokespecial   X/1fh.LIZLLL:()V
        //   579: aload_0        
        //   580: getfield        X/13q.LJIJJ:Ljava/util/ArrayList;
        //   583: invokevirtual   java/util/ArrayList.size:()I
        //   586: istore          15
        //   588: iconst_0       
        //   589: istore          6
        //   591: iload           6
        //   593: iload           15
        //   595: if_icmpge       634
        //   598: aload_0        
        //   599: getfield        X/13q.LJIJJ:Ljava/util/ArrayList;
        //   602: iload           6
        //   604: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   607: checkcast       LX/05G;
        //   610: astore          5
        //   612: aload           5
        //   614: instanceof      LX/13q;
        //   617: ifeq            628
        //   620: aload           5
        //   622: checkcast       LX/13q;
        //   625: invokevirtual   X/13q.LIZ:()V
        //   628: iinc            6, 1
        //   631: goto            591
        //   634: iconst_0       
        //   635: istore          6
        //   637: iload           6
        //   639: iconst_1       
        //   640: iadd           
        //   641: istore          16
        //   643: aload_0        
        //   644: getfield        X/1fh.LIZIZ:LX/05Q;
        //   647: invokevirtual   X/05Q.LIZ:()V
        //   650: aload_0        
        //   651: invokespecial   X/1fh.LIZLLL:()V
        //   654: aload_0        
        //   655: aload_0        
        //   656: getfield        X/1fh.LIZIZ:LX/05Q;
        //   659: invokevirtual   X/05G.createObjectVariables:(LX/05Q;)V
        //   662: iconst_0       
        //   663: istore          6
        //   665: iload           6
        //   667: iload           15
        //   669: if_icmpge       706
        //   672: aload_0        
        //   673: getfield        X/13q.LJIJJ:Ljava/util/ArrayList;
        //   676: iload           6
        //   678: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   681: checkcast       LX/05G;
        //   684: astore          5
        //   686: aload           5
        //   688: aload_0        
        //   689: getfield        X/1fh.LIZIZ:LX/05Q;
        //   692: invokevirtual   X/05G.createObjectVariables:(LX/05Q;)V
        //   695: iinc            6, 1
        //   698: goto            665
        //   701: astore          5
        //   703: goto            1080
        //   706: aload_0        
        //   707: getfield        X/1fh.LIZIZ:LX/05Q;
        //   710: astore          5
        //   712: aload_0        
        //   713: aload           5
        //   715: invokevirtual   X/05G.addToSolver:(LX/05Q;)V
        //   718: aload_0        
        //   719: getfield        X/13q.LJIJJ:Ljava/util/ArrayList;
        //   722: invokevirtual   java/util/ArrayList.size:()I
        //   725: istore          17
        //   727: iconst_0       
        //   728: istore          6
        //   730: iload           6
        //   732: iload           17
        //   734: if_icmpge       875
        //   737: aload_0        
        //   738: getfield        X/13q.LJIJJ:Ljava/util/ArrayList;
        //   741: iload           6
        //   743: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   746: checkcast       LX/05G;
        //   749: astore          18
        //   751: aload           18
        //   753: instanceof      LX/1fh;
        //   756: ifeq            849
        //   759: aload           18
        //   761: getfield        X/05G.mListDimensionBehaviors:[LX/05F;
        //   764: iconst_0       
        //   765: aaload         
        //   766: astore          19
        //   768: aload           18
        //   770: getfield        X/05G.mListDimensionBehaviors:[LX/05F;
        //   773: iconst_1       
        //   774: aaload         
        //   775: astore          14
        //   777: aload           19
        //   779: getstatic       X/05F.WRAP_CONTENT:LX/05F;
        //   782: if_acmpne       793
        //   785: aload           18
        //   787: getstatic       X/05F.FIXED:LX/05F;
        //   790: invokevirtual   X/05G.setHorizontalDimensionBehaviour:(LX/05F;)V
        //   793: aload           14
        //   795: getstatic       X/05F.WRAP_CONTENT:LX/05F;
        //   798: if_acmpne       809
        //   801: aload           18
        //   803: getstatic       X/05F.FIXED:LX/05F;
        //   806: invokevirtual   X/05G.setVerticalDimensionBehaviour:(LX/05F;)V
        //   809: aload           18
        //   811: aload           5
        //   813: invokevirtual   X/05G.addToSolver:(LX/05Q;)V
        //   816: aload           19
        //   818: getstatic       X/05F.WRAP_CONTENT:LX/05F;
        //   821: if_acmpne       831
        //   824: aload           18
        //   826: aload           19
        //   828: invokevirtual   X/05G.setHorizontalDimensionBehaviour:(LX/05F;)V
        //   831: aload           14
        //   833: getstatic       X/05F.WRAP_CONTENT:LX/05F;
        //   836: if_acmpne       864
        //   839: aload           18
        //   841: aload           14
        //   843: invokevirtual   X/05G.setVerticalDimensionBehaviour:(LX/05F;)V
        //   846: goto            864
        //   849: aload_0        
        //   850: aload           5
        //   852: aload           18
        //   854: invokestatic    X/05J.LIZ:(LX/1fh;LX/05Q;LX/05G;)V
        //   857: aload           18
        //   859: aload           5
        //   861: invokevirtual   X/05G.addToSolver:(LX/05Q;)V
        //   864: iinc            6, 1
        //   867: goto            730
        //   870: astore          5
        //   872: goto            1080
        //   875: aload_0        
        //   876: getfield        X/1fh.LJI:I
        //   879: ifle            889
        //   882: aload_0        
        //   883: aload           5
        //   885: iconst_0       
        //   886: invokestatic    X/058.LIZ:(LX/1fh;LX/05Q;I)V
        //   889: aload_0        
        //   890: getfield        X/1fh.LJII:I
        //   893: ifle            903
        //   896: aload_0        
        //   897: aload           5
        //   899: iconst_1       
        //   900: invokestatic    X/058.LIZ:(LX/1fh;LX/05Q;I)V
        //   903: aload_0        
        //   904: getfield        X/1fh.LIZIZ:LX/05Q;
        //   907: astore          5
        //   909: getstatic       X/05Q.LJII:LX/05R;
        //   912: ifnull          932
        //   915: getstatic       X/05Q.LJII:LX/05R;
        //   918: astore          14
        //   920: aload           14
        //   922: aload           14
        //   924: getfield        X/05R.LJ:J
        //   927: lconst_1       
        //   928: ladd           
        //   929: putfield        X/05R.LJ:J
        //   932: aload           5
        //   934: getfield        X/05Q.LIZLLL:Z
        //   937: ifeq            1040
        //   940: getstatic       X/05Q.LJII:LX/05R;
        //   943: ifnull          963
        //   946: getstatic       X/05Q.LJII:LX/05R;
        //   949: astore          14
        //   951: aload           14
        //   953: aload           14
        //   955: getfield        X/05R.LJIIZILJ:J
        //   958: lconst_1       
        //   959: ladd           
        //   960: putfield        X/05R.LJIIZILJ:J
        //   963: iconst_0       
        //   964: istore          6
        //   966: iload           6
        //   968: aload           5
        //   970: getfield        X/05Q.LJFF:I
        //   973: if_icmpge       1009
        //   976: aload           5
        //   978: getfield        X/05Q.LIZJ:[LX/13r;
        //   981: iload           6
        //   983: aaload         
        //   984: getfield        X/13r.LIZLLL:Z
        //   987: ifne            1003
        //   990: aload           5
        //   992: aload           5
        //   994: getfield        X/05Q.LIZIZ:LX/05P;
        //   997: invokevirtual   X/05Q.LIZ:(LX/05P;)V
        //  1000: goto            1102
        //  1003: iinc            6, 1
        //  1006: goto            966
        //  1009: getstatic       X/05Q.LJII:LX/05R;
        //  1012: ifnull          1032
        //  1015: getstatic       X/05Q.LJII:LX/05R;
        //  1018: astore          14
        //  1020: aload           14
        //  1022: aload           14
        //  1024: getfield        X/05R.LJIILLIIL:J
        //  1027: lconst_1       
        //  1028: ladd           
        //  1029: putfield        X/05R.LJIILLIIL:J
        //  1032: aload           5
        //  1034: invokevirtual   X/05Q.LIZLLL:()V
        //  1037: goto            1102
        //  1040: aload           5
        //  1042: aload           5
        //  1044: getfield        X/05Q.LIZIZ:LX/05P;
        //  1047: invokevirtual   X/05Q.LIZ:(LX/05P;)V
        //  1050: goto            1102
        //  1053: astore          5
        //  1055: goto            1080
        //  1058: astore          5
        //  1060: goto            1080
        //  1063: astore          5
        //  1065: goto            1080
        //  1068: astore          5
        //  1070: goto            1080
        //  1073: astore          5
        //  1075: goto            1080
        //  1078: astore          5
        //  1080: aload           5
        //  1082: invokestatic    X/0II.LIZ:(Ljava/lang/Exception;)V
        //  1085: getstatic       java/lang/System.out:Ljava/io/PrintStream;
        //  1088: ldc_w           "EXCEPTION : "
        //  1091: aload           5
        //  1093: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //  1096: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //  1099: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //  1102: aload_0        
        //  1103: getfield        X/1fh.LIZIZ:LX/05Q;
        //  1106: astore          14
        //  1108: getstatic       X/05J.LIZ:[Z
        //  1111: astore          19
        //  1113: aload           19
        //  1115: iconst_2       
        //  1116: iconst_0       
        //  1117: bastore        
        //  1118: aload_0        
        //  1119: aload           14
        //  1121: invokevirtual   X/05G.updateFromSolver:(LX/05Q;)V
        //  1124: aload_0        
        //  1125: getfield        X/13q.LJIJJ:Ljava/util/ArrayList;
        //  1128: invokevirtual   java/util/ArrayList.size:()I
        //  1131: istore          17
        //  1133: iconst_0       
        //  1134: istore          6
        //  1136: iload           6
        //  1138: iload           17
        //  1140: if_icmpge       1235
        //  1143: aload_0        
        //  1144: getfield        X/13q.LJIJJ:Ljava/util/ArrayList;
        //  1147: iload           6
        //  1149: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  1152: checkcast       LX/05G;
        //  1155: astore          5
        //  1157: aload           5
        //  1159: aload           14
        //  1161: invokevirtual   X/05G.updateFromSolver:(LX/05Q;)V
        //  1164: aload           5
        //  1166: getfield        X/05G.mListDimensionBehaviors:[LX/05F;
        //  1169: iconst_0       
        //  1170: aaload         
        //  1171: getstatic       X/05F.MATCH_CONSTRAINT:LX/05F;
        //  1174: if_acmpne       1232
        //  1177: aload           5
        //  1179: invokevirtual   X/05G.getWidth:()I
        //  1182: aload           5
        //  1184: getfield        X/05G.mWrapWidth:I
        //  1187: if_icmpge       1232
        //  1190: aload           19
        //  1192: iconst_2       
        //  1193: iconst_1       
        //  1194: bastore        
        //  1195: aload           5
        //  1197: getfield        X/05G.mListDimensionBehaviors:[LX/05F;
        //  1200: iconst_1       
        //  1201: aaload         
        //  1202: getstatic       X/05F.MATCH_CONSTRAINT:LX/05F;
        //  1205: if_acmpne       1226
        //  1208: aload           5
        //  1210: invokevirtual   X/05G.getHeight:()I
        //  1213: aload           5
        //  1215: getfield        X/05G.mWrapHeight:I
        //  1218: if_icmpge       1226
        //  1221: aload           19
        //  1223: iconst_2       
        //  1224: iconst_1       
        //  1225: bastore        
        //  1226: iinc            6, 1
        //  1229: goto            1136
        //  1232: goto            1195
        //  1235: iload           12
        //  1237: ifeq            1454
        //  1240: iload           16
        //  1242: bipush          8
        //  1244: if_icmpge       1454
        //  1247: getstatic       X/05J.LIZ:[Z
        //  1250: iconst_2       
        //  1251: baload         
        //  1252: ifeq            1454
        //  1255: iconst_0       
        //  1256: istore          6
        //  1258: iconst_0       
        //  1259: istore          20
        //  1261: iconst_0       
        //  1262: istore          17
        //  1264: iload           6
        //  1266: iload           15
        //  1268: if_icmpge       1327
        //  1271: aload_0        
        //  1272: getfield        X/13q.LJIJJ:Ljava/util/ArrayList;
        //  1275: iload           6
        //  1277: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  1280: checkcast       LX/05G;
        //  1283: astore          5
        //  1285: iload           20
        //  1287: aload           5
        //  1289: getfield        X/05G.mX:I
        //  1292: aload           5
        //  1294: invokevirtual   X/05G.getWidth:()I
        //  1297: iadd           
        //  1298: invokestatic    java/lang/Math.max:(II)I
        //  1301: istore          20
        //  1303: iload           17
        //  1305: aload           5
        //  1307: getfield        X/05G.mY:I
        //  1310: aload           5
        //  1312: invokevirtual   X/05G.getHeight:()I
        //  1315: iadd           
        //  1316: invokestatic    java/lang/Math.max:(II)I
        //  1319: istore          17
        //  1321: iinc            6, 1
        //  1324: goto            1264
        //  1327: aload_0        
        //  1328: getfield        X/05G.mMinWidth:I
        //  1331: iload           20
        //  1333: invokestatic    java/lang/Math.max:(II)I
        //  1336: istore          6
        //  1338: aload_0        
        //  1339: getfield        X/05G.mMinHeight:I
        //  1342: iload           17
        //  1344: invokestatic    java/lang/Math.max:(II)I
        //  1347: istore          21
        //  1349: aload           9
        //  1351: getstatic       X/05F.WRAP_CONTENT:LX/05F;
        //  1354: if_acmpne       1444
        //  1357: aload_0        
        //  1358: invokevirtual   X/05G.getWidth:()I
        //  1361: iload           6
        //  1363: if_icmpge       1444
        //  1366: aload_0        
        //  1367: iload           6
        //  1369: invokevirtual   X/05G.setWidth:(I)V
        //  1372: aload_0        
        //  1373: getfield        X/05G.mListDimensionBehaviors:[LX/05F;
        //  1376: iconst_0       
        //  1377: getstatic       X/05F.WRAP_CONTENT:LX/05F;
        //  1380: aastore        
        //  1381: iconst_1       
        //  1382: istore          6
        //  1384: iconst_1       
        //  1385: istore          20
        //  1387: iload           6
        //  1389: istore          17
        //  1391: iload           20
        //  1393: istore          7
        //  1395: aload           8
        //  1397: getstatic       X/05F.WRAP_CONTENT:LX/05F;
        //  1400: if_acmpne       1457
        //  1403: iload           6
        //  1405: istore          17
        //  1407: iload           20
        //  1409: istore          7
        //  1411: aload_0        
        //  1412: invokevirtual   X/05G.getHeight:()I
        //  1415: iload           21
        //  1417: if_icmpge       1457
        //  1420: aload_0        
        //  1421: iload           21
        //  1423: invokevirtual   X/05G.setHeight:(I)V
        //  1426: aload_0        
        //  1427: getfield        X/05G.mListDimensionBehaviors:[LX/05F;
        //  1430: iconst_1       
        //  1431: getstatic       X/05F.WRAP_CONTENT:LX/05F;
        //  1434: aastore        
        //  1435: iconst_1       
        //  1436: istore          17
        //  1438: iconst_1       
        //  1439: istore          7
        //  1441: goto            1457
        //  1444: iconst_0       
        //  1445: istore          6
        //  1447: iload           7
        //  1449: istore          20
        //  1451: goto            1387
        //  1454: iconst_0       
        //  1455: istore          17
        //  1457: aload_0        
        //  1458: getfield        X/05G.mMinWidth:I
        //  1461: aload_0        
        //  1462: invokevirtual   X/05G.getWidth:()I
        //  1465: invokestatic    java/lang/Math.max:(II)I
        //  1468: istore          20
        //  1470: iload           7
        //  1472: istore          6
        //  1474: iload           20
        //  1476: aload_0        
        //  1477: invokevirtual   X/05G.getWidth:()I
        //  1480: if_icmple       1504
        //  1483: aload_0        
        //  1484: iload           20
        //  1486: invokevirtual   X/05G.setWidth:(I)V
        //  1489: aload_0        
        //  1490: getfield        X/05G.mListDimensionBehaviors:[LX/05F;
        //  1493: iconst_0       
        //  1494: getstatic       X/05F.FIXED:LX/05F;
        //  1497: aastore        
        //  1498: iconst_1       
        //  1499: istore          17
        //  1501: iconst_1       
        //  1502: istore          6
        //  1504: aload_0        
        //  1505: getfield        X/05G.mMinHeight:I
        //  1508: aload_0        
        //  1509: invokevirtual   X/05G.getHeight:()I
        //  1512: invokestatic    java/lang/Math.max:(II)I
        //  1515: istore          7
        //  1517: iload           7
        //  1519: aload_0        
        //  1520: invokevirtual   X/05G.getHeight:()I
        //  1523: if_icmple       1559
        //  1526: aload_0        
        //  1527: iload           7
        //  1529: invokevirtual   X/05G.setHeight:(I)V
        //  1532: aload_0        
        //  1533: getfield        X/05G.mListDimensionBehaviors:[LX/05F;
        //  1536: iconst_1       
        //  1537: getstatic       X/05F.FIXED:LX/05F;
        //  1540: aastore        
        //  1541: iconst_1       
        //  1542: istore          20
        //  1544: iconst_1       
        //  1545: istore          7
        //  1547: iload           20
        //  1549: ifeq            1724
        //  1552: iload           16
        //  1554: istore          6
        //  1556: goto            637
        //  1559: iload           17
        //  1561: istore          20
        //  1563: iload           6
        //  1565: istore          7
        //  1567: iload           6
        //  1569: ifne            1547
        //  1572: iload           17
        //  1574: istore          22
        //  1576: iload           6
        //  1578: istore          21
        //  1580: aload_0        
        //  1581: getfield        X/05G.mListDimensionBehaviors:[LX/05F;
        //  1584: iconst_0       
        //  1585: aaload         
        //  1586: getstatic       X/05F.WRAP_CONTENT:LX/05F;
        //  1589: if_acmpne       1645
        //  1592: iload           17
        //  1594: istore          22
        //  1596: iload           6
        //  1598: istore          21
        //  1600: iload_3        
        //  1601: ifle            1645
        //  1604: iload           17
        //  1606: istore          22
        //  1608: iload           6
        //  1610: istore          21
        //  1612: aload_0        
        //  1613: invokevirtual   X/05G.getWidth:()I
        //  1616: iload_3        
        //  1617: if_icmple       1645
        //  1620: aload_0        
        //  1621: iconst_1       
        //  1622: putfield        X/1fh.LJIJ:Z
        //  1625: aload_0        
        //  1626: getfield        X/05G.mListDimensionBehaviors:[LX/05F;
        //  1629: iconst_0       
        //  1630: getstatic       X/05F.FIXED:LX/05F;
        //  1633: aastore        
        //  1634: aload_0        
        //  1635: iload_3        
        //  1636: invokevirtual   X/05G.setWidth:(I)V
        //  1639: iconst_1       
        //  1640: istore          22
        //  1642: iconst_1       
        //  1643: istore          21
        //  1645: iload           22
        //  1647: istore          20
        //  1649: iload           21
        //  1651: istore          7
        //  1653: aload_0        
        //  1654: getfield        X/05G.mListDimensionBehaviors:[LX/05F;
        //  1657: iconst_1       
        //  1658: aaload         
        //  1659: getstatic       X/05F.WRAP_CONTENT:LX/05F;
        //  1662: if_acmpne       1547
        //  1665: iload           22
        //  1667: istore          20
        //  1669: iload           21
        //  1671: istore          7
        //  1673: iload           4
        //  1675: ifle            1547
        //  1678: iload           22
        //  1680: istore          20
        //  1682: iload           21
        //  1684: istore          7
        //  1686: aload_0        
        //  1687: invokevirtual   X/05G.getHeight:()I
        //  1690: iload           4
        //  1692: if_icmple       1547
        //  1695: aload_0        
        //  1696: iconst_1       
        //  1697: putfield        X/1fh.LJIJI:Z
        //  1700: aload_0        
        //  1701: getfield        X/05G.mListDimensionBehaviors:[LX/05F;
        //  1704: iconst_1       
        //  1705: getstatic       X/05F.FIXED:LX/05F;
        //  1708: aastore        
        //  1709: aload_0        
        //  1710: iload           4
        //  1712: invokevirtual   X/05G.setHeight:(I)V
        //  1715: iconst_1       
        //  1716: istore          20
        //  1718: iconst_1       
        //  1719: istore          7
        //  1721: goto            1547
        //  1724: aload_0        
        //  1725: getfield        X/1fh.LJIIJ:Ljava/util/List;
        //  1728: iload           13
        //  1730: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  1735: checkcast       LX/05H;
        //  1738: astore          5
        //  1740: aload           5
        //  1742: getfield        X/05H.LJIIJ:Ljava/util/List;
        //  1745: invokeinterface java/util/List.size:()I
        //  1750: istore          20
        //  1752: iconst_0       
        //  1753: istore          17
        //  1755: iload           7
        //  1757: istore          6
        //  1759: iload           17
        //  1761: iload           20
        //  1763: if_icmpge       1940
        //  1766: aload           5
        //  1768: aload           5
        //  1770: getfield        X/05H.LJIIJ:Ljava/util/List;
        //  1773: iload           17
        //  1775: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  1780: checkcast       LX/05G;
        //  1783: invokevirtual   X/05H.LIZ:(LX/05G;)V
        //  1786: iinc            17, 1
        //  1789: goto            1755
        //  1792: aload           14
        //  1794: getfield        X/05H.LIZ:Ljava/util/List;
        //  1797: invokeinterface java/util/List.size:()I
        //  1802: istore          17
        //  1804: iload           6
        //  1806: iload           17
        //  1808: if_icmpge       1857
        //  1811: aload           14
        //  1813: getfield        X/05H.LIZ:Ljava/util/List;
        //  1816: iload           6
        //  1818: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  1823: checkcast       LX/05G;
        //  1826: astore          5
        //  1828: aload           5
        //  1830: getfield        X/05G.mOptimizerMeasurable:Z
        //  1833: ifne            1851
        //  1836: aload           14
        //  1838: aload           14
        //  1840: getfield        X/05H.LJIIIZ:Ljava/util/List;
        //  1843: checkcast       Ljava/util/ArrayList;
        //  1846: aload           5
        //  1848: invokevirtual   X/05H.LIZ:(Ljava/util/ArrayList;LX/05G;)V
        //  1851: iinc            6, 1
        //  1854: goto            1804
        //  1857: aload           14
        //  1859: getfield        X/05H.LJIIJ:Ljava/util/List;
        //  1862: invokeinterface java/util/List.clear:()V
        //  1867: aload           14
        //  1869: getfield        X/05H.LJIIJ:Ljava/util/List;
        //  1872: aload           14
        //  1874: getfield        X/05H.LIZ:Ljava/util/List;
        //  1877: invokeinterface java/util/List.addAll:(Ljava/util/Collection;)Z
        //  1882: pop            
        //  1883: aload           14
        //  1885: getfield        X/05H.LJIIJ:Ljava/util/List;
        //  1888: aload           14
        //  1890: getfield        X/05H.LJIIIZ:Ljava/util/List;
        //  1893: invokeinterface java/util/List.removeAll:(Ljava/util/Collection;)Z
        //  1898: pop            
        //  1899: aload           14
        //  1901: getfield        X/05H.LJIIIZ:Ljava/util/List;
        //  1904: astore          5
        //  1906: goto            566
        //  1909: aload_0        
        //  1910: aload_0        
        //  1911: getfield        X/1fh.LJIIJ:Ljava/util/List;
        //  1914: iload           13
        //  1916: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  1921: checkcast       LX/05H;
        //  1924: getfield        X/05H.LIZ:Ljava/util/List;
        //  1927: checkcast       Ljava/util/ArrayList;
        //  1930: putfield        X/13q.LJIJJ:Ljava/util/ArrayList;
        //  1933: goto            575
        //  1936: iload           7
        //  1938: istore          6
        //  1940: iinc            13, 1
        //  1943: iload           6
        //  1945: istore          7
        //  1947: goto            464
        //  1950: iconst_0       
        //  1951: istore          12
        //  1953: goto            458
        //  1956: aload_0        
        //  1957: getfield        X/1fh.LIZIZ:LX/05Q;
        //  1960: iconst_0       
        //  1961: putfield        X/05Q.LIZLLL:Z
        //  1964: goto            356
        //  1967: aload_0        
        //  1968: aload           11
        //  1970: putfield        X/13q.LJIJJ:Ljava/util/ArrayList;
        //  1973: aload_0        
        //  1974: getfield        X/05G.mParent:LX/05G;
        //  1977: ifnull          2160
        //  1980: aload_0        
        //  1981: getfield        X/05G.mMinWidth:I
        //  1984: aload_0        
        //  1985: invokevirtual   X/05G.getWidth:()I
        //  1988: invokestatic    java/lang/Math.max:(II)I
        //  1991: istore          20
        //  1993: aload_0        
        //  1994: getfield        X/05G.mMinHeight:I
        //  1997: aload_0        
        //  1998: invokevirtual   X/05G.getHeight:()I
        //  2001: invokestatic    java/lang/Math.max:(II)I
        //  2004: istore          21
        //  2006: aload_0        
        //  2007: getfield        X/1fh.LJIJJLI:LX/05M;
        //  2010: astore          5
        //  2012: aload_0        
        //  2013: aload           5
        //  2015: getfield        X/05M.LIZ:I
        //  2018: putfield        X/05G.mX:I
        //  2021: aload_0        
        //  2022: aload           5
        //  2024: getfield        X/05M.LIZIZ:I
        //  2027: putfield        X/05G.mY:I
        //  2030: aload_0        
        //  2031: aload           5
        //  2033: getfield        X/05M.LIZJ:I
        //  2036: invokevirtual   X/05G.setWidth:(I)V
        //  2039: aload_0        
        //  2040: aload           5
        //  2042: getfield        X/05M.LIZLLL:I
        //  2045: invokevirtual   X/05G.setHeight:(I)V
        //  2048: aload           5
        //  2050: getfield        X/05M.LJ:Ljava/util/ArrayList;
        //  2053: invokevirtual   java/util/ArrayList.size:()I
        //  2056: istore          17
        //  2058: iconst_0       
        //  2059: istore          6
        //  2061: iload           6
        //  2063: iload           17
        //  2065: if_icmpge       2125
        //  2068: aload           5
        //  2070: getfield        X/05M.LJ:Ljava/util/ArrayList;
        //  2073: iload           6
        //  2075: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  2078: checkcast       LX/05L;
        //  2081: astore          11
        //  2083: aload_0        
        //  2084: aload           11
        //  2086: getfield        X/05L.LIZ:LX/05D;
        //  2089: getfield        X/05D.LIZJ:LX/05C;
        //  2092: invokevirtual   X/05G.getAnchor:(LX/05C;)LX/05D;
        //  2095: aload           11
        //  2097: getfield        X/05L.LIZIZ:LX/05D;
        //  2100: aload           11
        //  2102: getfield        X/05L.LIZJ:I
        //  2105: aload           11
        //  2107: getfield        X/05L.LIZLLL:LX/05B;
        //  2110: aload           11
        //  2112: getfield        X/05L.LJ:I
        //  2115: invokevirtual   X/05D.LIZ:(LX/05D;ILX/05B;I)Z
        //  2118: pop            
        //  2119: iinc            6, 1
        //  2122: goto            2061
        //  2125: aload_0        
        //  2126: iload           20
        //  2128: aload_0        
        //  2129: getfield        X/1fh.LIZJ:I
        //  2132: iadd           
        //  2133: aload_0        
        //  2134: getfield        X/1fh.LJ:I
        //  2137: iadd           
        //  2138: invokevirtual   X/05G.setWidth:(I)V
        //  2141: aload_0        
        //  2142: iload           21
        //  2144: aload_0        
        //  2145: getfield        X/1fh.LIZLLL:I
        //  2148: iadd           
        //  2149: aload_0        
        //  2150: getfield        X/1fh.LJFF:I
        //  2153: iadd           
        //  2154: invokevirtual   X/05G.setHeight:(I)V
        //  2157: goto            2170
        //  2160: aload_0        
        //  2161: iload_1        
        //  2162: putfield        X/05G.mX:I
        //  2165: aload_0        
        //  2166: iload_2        
        //  2167: putfield        X/05G.mY:I
        //  2170: iload           7
        //  2172: ifeq            2191
        //  2175: aload_0        
        //  2176: getfield        X/05G.mListDimensionBehaviors:[LX/05F;
        //  2179: iconst_0       
        //  2180: aload           9
        //  2182: aastore        
        //  2183: aload_0        
        //  2184: getfield        X/05G.mListDimensionBehaviors:[LX/05F;
        //  2187: iconst_1       
        //  2188: aload           8
        //  2190: aastore        
        //  2191: aload_0        
        //  2192: aload_0        
        //  2193: getfield        X/1fh.LIZIZ:LX/05Q;
        //  2196: getfield        X/05Q.LJI:LX/05O;
        //  2199: invokevirtual   X/05G.resetSolverVariables:(LX/05O;)V
        //  2202: aload_0        
        //  2203: getfield        X/05G.mParent:LX/05G;
        //  2206: astore          5
        //  2208: aload_0        
        //  2209: astore          8
        //  2211: aload           5
        //  2213: ifnull          2242
        //  2216: aload           5
        //  2218: getfield        X/05G.mParent:LX/05G;
        //  2221: astore          9
        //  2223: aload           5
        //  2225: instanceof      LX/1fh;
        //  2228: ifeq            2235
        //  2231: aload           5
        //  2233: astore          8
        //  2235: aload           9
        //  2237: astore          5
        //  2239: goto            2211
        //  2242: aload_0        
        //  2243: aload           8
        //  2245: if_acmpne       2252
        //  2248: aload_0        
        //  2249: invokevirtual   X/05G.updateDrawPosition:()V
        //  2252: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  643    662    1073   1078   Ljava/lang/Exception;
        //  672    686    701    706    Ljava/lang/Exception;
        //  686    695    1068   1073   Ljava/lang/Exception;
        //  706    727    1068   1073   Ljava/lang/Exception;
        //  737    751    1068   1073   Ljava/lang/Exception;
        //  751    768    870    875    Ljava/lang/Exception;
        //  768    777    1078   1080   Ljava/lang/Exception;
        //  777    793    1063   1068   Ljava/lang/Exception;
        //  793    809    1063   1068   Ljava/lang/Exception;
        //  809    831    1063   1068   Ljava/lang/Exception;
        //  831    846    1063   1068   Ljava/lang/Exception;
        //  849    864    1063   1068   Ljava/lang/Exception;
        //  875    889    1063   1068   Ljava/lang/Exception;
        //  889    903    1063   1068   Ljava/lang/Exception;
        //  903    920    1058   1063   Ljava/lang/Exception;
        //  920    932    1053   1058   Ljava/lang/Exception;
        //  932    963    1053   1058   Ljava/lang/Exception;
        //  966    1000   1053   1058   Ljava/lang/Exception;
        //  1009   1032   1053   1058   Ljava/lang/Exception;
        //  1032   1037   1053   1058   Ljava/lang/Exception;
        //  1040   1050   1053   1058   Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0793:
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
    
    public final void LIZ(final int n, final int n2) {
        if (super.mListDimensionBehaviors[0] != a.WRAP_CONTENT && super.mResolutionWidth != null) {
            super.mResolutionWidth.LIZ(n);
        }
        if (super.mListDimensionBehaviors[1] != a.WRAP_CONTENT && super.mResolutionHeight != null) {
            super.mResolutionHeight.LIZ(n2);
        }
    }
    
    public final void LIZ(final 05G 05G, final int n) {
        if (n == 0) {
            this.LIZIZ(05G);
            return;
        }
        if (n == 1) {
            this.LIZJ(05G);
        }
    }
    
    public final boolean LIZ(final int n) {
        return (this.LJIILLIIL & n) == n;
    }
    
    public final void LIZIZ() {
        final 13o liz = this.getAnchor(05D.b.LEFT).LIZ;
        final 13o liz2 = this.getAnchor(05D.b.TOP).LIZ;
        liz.LIZ(null, 0.0f);
        liz2.LIZ(null, 0.0f);
    }
    
    public final void LIZJ() {
        final int size = super.LJIJJ.size();
        this.resetResolutionNodes();
        for (int i = 0; i < size; ++i) {
            super.LJIJJ.get(i).resetResolutionNodes();
        }
    }
    
    @Override
    public void analyze(final int n) {
        super.analyze(n);
        for (int size = super.LJIJJ.size(), i = 0; i < size; ++i) {
            super.LJIJJ.get(i).analyze(n);
        }
    }
    
    @Override
    public String getType() {
        return "ConstraintLayout";
    }
    
    @Override
    public void reset() {
        this.LIZIZ.LIZ();
        this.LIZJ = 0;
        this.LJ = 0;
        this.LIZLLL = 0;
        this.LJFF = 0;
        this.LJIIJ.clear();
        this.LJIIZILJ = false;
        super.reset();
    }
}
