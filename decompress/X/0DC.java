// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Iterator;
import java.util.List;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView.s;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.view.ViewGroup;
import android.view.MotionEvent;
import android.view.GestureDetector;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.widget.FrameLayout$LayoutParams;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.FrameLayout;

public class 0dc extends FrameLayout
{
    public RecyclerView LIZ;
    public g LIZIZ;
    public a LIZJ;
    
    static {
        Covode.recordClassIndex(5864);
    }
    
    public 0dc(final Context context, final AttributeSet set) {
        super(context, set);
        MethodCollector.i(10017);
        this.removeAllViews();
        this.LIZ = new RecyclerView(this.getContext());
        this.getContext();
        final a a = new a();
        this.LIZJ = a;
        this.LIZ.setLayoutManager((RecyclerView.i)a);
        (this.LIZIZ = new g((byte)0)).LIZ(this.LIZ);
        this.addView((View)this.LIZ, (ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-1, -1));
        this.setWillNotDraw(false);
        MethodCollector.o(10017);
    }
    
    public final void LIZ(final int n) {
        this.LIZJ.LIZ = false;
        this.LIZ.LJ(n + 1);
    }
    
    public final void LIZIZ(final int n) {
        final RecyclerView.a adapter = this.LIZ.getAdapter();
        if (adapter == null) {
            return;
        }
        adapter.notifyItemChanged(n + 1);
    }
    
    public int getHalfScreenWidth() {
        return (int)(this.getResources().getDisplayMetrics().widthPixels * 1.0f / 4.0f * 3.0f);
    }
    
    public float getLeftFadingEdgeStrength() {
        if (0cB.LJI()) {
            return 0.0f;
        }
        return 1.0f;
    }
    
    public float getRightFadingEdgeStrength() {
        if (0cB.LJI()) {
            return 1.0f;
        }
        return 0.0f;
    }
    
    public void setAdapter(final RecyclerView.a a) {
        final RecyclerView liz = this.LIZ;
        if (liz == null) {
            return;
        }
        liz.setAdapter((RecyclerView.a)new f(a));
    }
    
    public interface c
    {
        default static {
            Covode.recordClassIndex(5867);
        }
        
        void LIZ(final int p0);
    }
    
    public interface d
    {
        default static {
            Covode.recordClassIndex(5868);
        }
        
        void LIZ(final int p0);
    }
    
    public static final class e implements m
    {
        public c LIZ;
        public GestureDetector LIZIZ;
        
        static {
            Covode.recordClassIndex(5869);
        }
        
        public e(final Context context, final RecyclerView recyclerView, final c liz) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: invokespecial   java/lang/Object.<init>:()V
            //     4: aload_0        
            //     5: aload_3        
            //     6: putfield        X/1IC.LIZ:LX/0dZ;
            //     9: aload_0        
            //    10: new             Landroid/view/GestureDetector;
            //    13: dup            
            //    14: aload_1        
            //    15: new             LX/0db;
            //    18: dup            
            //    19: aload_0        
            //    20: aload_2        
            //    21: invokespecial   X/0db.<init>:(LX/1IC;Landroidx/recyclerview/widget/RecyclerView;)V
            //    24: invokespecial   android/view/GestureDetector.<init>:(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V
            //    27: putfield        X/1IC.LIZIZ:Landroid/view/GestureDetector;
            //    30: return         
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
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:662)
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
        public final void LIZ(final boolean b) {
        }
        
        @Override
        public final boolean LIZ(final RecyclerView recyclerView, final MotionEvent motionEvent) {
            return this.LIZIZ.onTouchEvent(motionEvent);
        }
        
        @Override
        public final void LIZIZ(final RecyclerView recyclerView, final MotionEvent motionEvent) {
        }
    }
    
    public final class f extends RecyclerView.a
    {
        public RecyclerView.a LIZIZ;
        
        static {
            Covode.recordClassIndex(5871);
        }
        
        public f(final RecyclerView.a liziz) {
            this.LIZIZ = liziz;
        }
        
        public static ViewHolder LIZ(final f p0, final ViewGroup p1, final int p2) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     3: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.i:(I)V
            //     6: iload_2        
            //     7: iconst_m1      
            //     8: if_icmpne       91
            //    11: new             Landroid/widget/Space;
            //    14: dup            
            //    15: aload_1        
            //    16: invokevirtual   android/view/ViewGroup.getContext:()Landroid/content/Context;
            //    19: invokespecial   android/widget/Space.<init>:(Landroid/content/Context;)V
            //    22: astore_3       
            //    23: aload_3        
            //    24: new             Landroid/view/ViewGroup$LayoutParams;
            //    27: dup            
            //    28: aload_0        
            //    29: getfield        X/1ID.LIZ:LX/0dc;
            //    32: invokevirtual   X/0dc.getHalfScreenWidth:()I
            //    35: bipush          -2
            //    37: invokespecial   android/view/ViewGroup$LayoutParams.<init>:(II)V
            //    40: invokevirtual   android/widget/Space.setLayoutParams:(Landroid/view/ViewGroup$LayoutParams;)V
            //    43: new             LX/1IE;
            //    46: dup            
            //    47: aload_3        
            //    48: invokespecial   X/1IE.<init>:(Landroid/view/View;)V
            //    51: astore_0       
            //    52: aload_0        
            //    53: getfield        androidx/recyclerview/widget/RecyclerView$ViewHolder.itemView:Landroid/view/View;
            //    56: ldc             2131372584
            //    58: aload_1        
            //    59: invokevirtual   java/lang/Object.hashCode:()I
            //    62: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //    65: invokevirtual   android/view/View.setTag:(ILjava/lang/Object;)V
            //    68: aload_0        
            //    69: getfield        androidx/recyclerview/widget/RecyclerView$ViewHolder.itemView:Landroid/view/View;
            //    72: ifnull          104
            //    75: aload_0        
            //    76: getfield        androidx/recyclerview/widget/RecyclerView$ViewHolder.itemView:Landroid/view/View;
            //    79: ldc             2131363869
            //    81: aload_1        
            //    82: invokestatic    X/2sV.LIZ:(Landroid/view/View;)Landroidx/fragment/app/Fragment;
            //    85: invokevirtual   android/view/View.setTag:(ILjava/lang/Object;)V
            //    88: goto            104
            //    91: aload_0        
            //    92: getfield        X/1ID.LIZIZ:LX/0EA;
            //    95: aload_1        
            //    96: iload_2        
            //    97: invokevirtual   X/0EA.onCreateViewHolder:(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
            //   100: astore_0       
            //   101: goto            52
            //   104: aload_0        
            //   105: getfield        androidx/recyclerview/widget/RecyclerView$ViewHolder.itemView:Landroid/view/View;
            //   108: invokevirtual   android/view/View.getParent:()Landroid/view/ViewParent;
            //   111: ifnull          238
            //   114: iconst_1       
            //   115: istore          4
            //   117: invokestatic    com/bytedance/ies/abmock/SettingsManager.LIZ:()Lcom/bytedance/ies/abmock/SettingsManager;
            //   120: ldc             "catch_onCreateViewHolder_crash"
            //   122: iconst_1       
            //   123: invokevirtual   com/bytedance/ies/abmock/SettingsManager.LIZ:(Ljava/lang/String;Z)Z
            //   126: istore          5
            //   128: iload           5
            //   130: istore          4
            //   132: iload           4
            //   134: ifeq            238
            //   137: new             Ljava/lang/StringBuffer;
            //   140: astore_3       
            //   141: aload_3        
            //   142: invokespecial   java/lang/StringBuffer.<init>:()V
            //   145: aload_3        
            //   146: ldc             "onCreateViewHolder getParent() != null crash hook, holder "
            //   148: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
            //   151: pop            
            //   152: aload_3        
            //   153: aload_0        
            //   154: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
            //   157: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
            //   160: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
            //   163: pop            
            //   164: aload_3        
            //   165: ldc             " parent "
            //   167: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
            //   170: pop            
            //   171: aload_3        
            //   172: aload_1        
            //   173: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
            //   176: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
            //   179: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
            //   182: pop            
            //   183: aload_3        
            //   184: ldc             " viewType "
            //   186: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
            //   189: pop            
            //   190: aload_3        
            //   191: iload_2        
            //   192: invokevirtual   java/lang/StringBuffer.append:(I)Ljava/lang/StringBuffer;
            //   195: pop            
            //   196: aload_3        
            //   197: invokevirtual   java/lang/StringBuffer.toString:()Ljava/lang/String;
            //   200: invokestatic    X/VYh.LIZ:(Ljava/lang/String;)V
            //   203: aload_0        
            //   204: getfield        androidx/recyclerview/widget/RecyclerView$ViewHolder.itemView:Landroid/view/View;
            //   207: invokevirtual   android/view/View.getParent:()Landroid/view/ViewParent;
            //   210: checkcast       Landroid/view/ViewGroup;
            //   213: astore_1       
            //   214: aload_1        
            //   215: ifnull          238
            //   218: aload_1        
            //   219: aload_0        
            //   220: getfield        androidx/recyclerview/widget/RecyclerView$ViewHolder.itemView:Landroid/view/View;
            //   223: invokevirtual   android/view/ViewGroup.removeView:(Landroid/view/View;)V
            //   226: goto            238
            //   229: astore_1       
            //   230: aload_1        
            //   231: invokestatic    X/3Z3.LIZ:(Ljava/lang/Exception;)V
            //   234: aload_1        
            //   235: invokestatic    X/4ch.LIZ:(Ljava/lang/Exception;)V
            //   238: aload_0        
            //   239: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
            //   242: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
            //   245: putstatic       X/2ex.LIZ:Ljava/lang/String;
            //   248: sipush          7870
            //   251: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
            //   254: aload_0        
            //   255: areturn        
            //   256: astore_3       
            //   257: goto            132
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                 
            //  -----  -----  -----  -----  ---------------------
            //  104    114    229    238    Ljava/lang/Exception;
            //  117    128    256    260    Ljava/lang/Exception;
            //  137    214    229    238    Ljava/lang/Exception;
            //  218    226    229    238    Ljava/lang/Exception;
            // 
            // The error that occurred was:
            // 
            // java.lang.IllegalStateException: Expression is linked from several locations: Label_0132:
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
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:662)
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
        public final int getItemCount() {
            return this.LIZIZ.getItemCount() + 2;
        }
        
        @Override
        public final int getItemViewType(final int n) {
            if (n == 0 || n == this.getItemCount() - 1) {
                return -1;
            }
            return this.LIZIZ.getItemViewType(n);
        }
        
        @Override
        public final void onBindViewHolder(final ViewHolder viewHolder, final int n) {
            this.LIZIZ.onBindViewHolder(viewHolder, n - 1);
        }
        
        @Override
        public final ViewHolder onCreateViewHolder(final ViewGroup viewGroup, final int n) {
            return LIZ(this, viewGroup, n);
        }
    }
    
    public static final class h extends ViewHolder
    {
        static {
            Covode.recordClassIndex(5873);
        }
        
        public h(final View view) {
            super(view);
        }
    }
    
    public static final class a extends LinearLayoutManager
    {
        public boolean LIZ;
        
        static {
            Covode.recordClassIndex(5865);
        }
        
        public a() {
            super(0, false);
        }
        
        @Override
        public final void LIZ(final RecyclerView recyclerView, final t t, final int lji) {
            final 0dc.b b = new 0dc.b(recyclerView.getContext());
            b.LJFF = this.LIZ;
            b.LJI = lji;
            ((RecyclerView.i)this).LIZ(b);
        }
    }
    
    public static final class b extends 17G
    {
        public boolean LJFF;
        
        static {
            Covode.recordClassIndex(5866);
        }
        
        public b(final Context context) {
            super(context);
        }
        
        @Override
        public final float LIZ(final DisplayMetrics displayMetrics) {
            return 80.0f / displayMetrics.densityDpi;
        }
        
        @Override
        public final int LIZ(final int n, final int n2, final int n3, final int n4, final int n5) {
            return n3 + (n4 - n3) / 2 - (n + (n2 - n) / 2);
        }
        
        @Override
        public final void LIZ(final View view, final t t, final s.a a) {
            final int liziz = this.LIZIZ(view, this.LIZIZ());
            final int liz = this.LIZ(view, this.LIZJ());
            final int liz2 = this.LIZ((int)Math.sqrt(liziz * liziz + liz * liz));
            if (this.LJFF) {
                a.LIZ(-liziz, -liz, 1, null);
                return;
            }
            if (liz2 > 0) {
                a.LIZ(-liziz, -liz, liz2, (Interpolator)super.LIZIZ);
            }
        }
    }
    
    public static final class g extends 1gi
    {
        public List<d> LIZIZ;
        
        static {
            Covode.recordClassIndex(5872);
        }
        
        @Override
        public final View LIZ(final i i) {
            View view = super.LIZ(i);
            int n;
            if (view != null) {
                final int bindingAdapterPosition = ((j)view.getLayoutParams()).LIZJ.getBindingAdapterPosition();
                if (bindingAdapterPosition == 0) {
                    view = i.LIZJ(1);
                    n = 1;
                }
                else if ((n = bindingAdapterPosition) == i.LJJIII() - 1) {
                    n = i.LJJIII() - 2;
                    view = i.LIZJ(n);
                }
            }
            else {
                n = -1;
            }
            final List<d> liziz = this.LIZIZ;
            if (liziz != null && !liziz.isEmpty()) {
                final Iterator<d> iterator = this.LIZIZ.iterator();
                while (iterator.hasNext()) {
                    iterator.next().LIZ(n - 1);
                }
            }
            return view;
        }
    }
}
