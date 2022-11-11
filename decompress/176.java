// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.lang.ref.WeakReference;
import androidx.recyclerview.widget.RecyclerView.a;
import java.util.ArrayList;
import java.util.Collections;
import android.view.ViewGroup;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import com.bytedance.covode.number.Covode;
import androidx.recyclerview.widget.RecyclerView;

public final class 176 extends RecyclerView.a<ViewHolder>
{
    public final 177 LIZ;
    
    static {
        Covode.recordClassIndex(1603);
    }
    
    public 176(final a a, final List<? extends RecyclerView.a<? extends ViewHolder>> list) {
        this.LIZ = new 177(this, a);
        final Iterator<? extends RecyclerView.a<? extends ViewHolder>> iterator = list.iterator();
        while (iterator.hasNext()) {
            this.LIZ((RecyclerView.a<? extends ViewHolder>)iterator.next());
        }
        super.setHasStableIds(this.LIZ.LIZLLL());
    }
    
    public 176(final a a, final RecyclerView.a<? extends ViewHolder>... array) {
        this(a, Arrays.asList(array));
    }
    
    public 176(final List<? extends RecyclerView.a<? extends ViewHolder>> list) {
        this(a.LIZJ, list);
    }
    
    public 176(final RecyclerView.a<? extends ViewHolder>... array) {
        this(a.LIZJ, array);
    }
    
    public static ViewHolder LIZ(final 176 p0, final ViewGroup p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        X/176.LIZ:LX/177;
        //     4: getfield        X/177.LIZIZ:LX/0Eo;
        //     7: iload_2        
        //     8: invokeinterface X/0Eo.LIZ:(I)LX/0Fg;
        //    13: astore_0       
        //    14: aload_0        
        //    15: getfield        X/0Fg.LIZ:LX/0En;
        //    18: iload_2        
        //    19: invokeinterface X/0En.LIZIZ:(I)I
        //    24: istore_3       
        //    25: aload_0        
        //    26: getfield        X/0Fg.LIZJ:LX/0EA;
        //    29: aload_1        
        //    30: iload_3        
        //    31: invokevirtual   X/0EA.onCreateViewHolder:(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
        //    34: astore_0       
        //    35: aload_0        
        //    36: getfield        androidx/recyclerview/widget/RecyclerView$ViewHolder.itemView:Landroid/view/View;
        //    39: ldc             2131372584
        //    41: aload_1        
        //    42: invokevirtual   java/lang/Object.hashCode:()I
        //    45: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    48: invokevirtual   android/view/View.setTag:(ILjava/lang/Object;)V
        //    51: aload_0        
        //    52: getfield        androidx/recyclerview/widget/RecyclerView$ViewHolder.itemView:Landroid/view/View;
        //    55: ifnull          71
        //    58: aload_0        
        //    59: getfield        androidx/recyclerview/widget/RecyclerView$ViewHolder.itemView:Landroid/view/View;
        //    62: ldc             2131363869
        //    64: aload_1        
        //    65: invokestatic    X/2sV.LIZ:(Landroid/view/View;)Landroidx/fragment/app/Fragment;
        //    68: invokevirtual   android/view/View.setTag:(ILjava/lang/Object;)V
        //    71: aload_0        
        //    72: getfield        androidx/recyclerview/widget/RecyclerView$ViewHolder.itemView:Landroid/view/View;
        //    75: invokevirtual   android/view/View.getParent:()Landroid/view/ViewParent;
        //    78: ifnull          210
        //    81: iconst_1       
        //    82: istore          4
        //    84: invokestatic    com/bytedance/ies/abmock/SettingsManager.LIZ:()Lcom/bytedance/ies/abmock/SettingsManager;
        //    87: ldc             "catch_onCreateViewHolder_crash"
        //    89: iconst_1       
        //    90: invokevirtual   com/bytedance/ies/abmock/SettingsManager.LIZ:(Ljava/lang/String;Z)Z
        //    93: istore          5
        //    95: iload           5
        //    97: ifeq            210
        //   100: new             Ljava/lang/StringBuffer;
        //   103: astore          6
        //   105: aload           6
        //   107: invokespecial   java/lang/StringBuffer.<init>:()V
        //   110: aload           6
        //   112: ldc             "onCreateViewHolder getParent() != null crash hook, holder "
        //   114: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   117: pop            
        //   118: aload           6
        //   120: aload_0        
        //   121: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   124: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //   127: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   130: pop            
        //   131: aload           6
        //   133: ldc             " parent "
        //   135: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   138: pop            
        //   139: aload           6
        //   141: aload_1        
        //   142: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   145: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //   148: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   151: pop            
        //   152: aload           6
        //   154: ldc             " viewType "
        //   156: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   159: pop            
        //   160: aload           6
        //   162: iload_2        
        //   163: invokevirtual   java/lang/StringBuffer.append:(I)Ljava/lang/StringBuffer;
        //   166: pop            
        //   167: aload           6
        //   169: invokevirtual   java/lang/StringBuffer.toString:()Ljava/lang/String;
        //   172: invokestatic    X/VYh.LIZ:(Ljava/lang/String;)V
        //   175: aload_0        
        //   176: getfield        androidx/recyclerview/widget/RecyclerView$ViewHolder.itemView:Landroid/view/View;
        //   179: invokevirtual   android/view/View.getParent:()Landroid/view/ViewParent;
        //   182: checkcast       Landroid/view/ViewGroup;
        //   185: astore_1       
        //   186: aload_1        
        //   187: ifnull          210
        //   190: aload_1        
        //   191: aload_0        
        //   192: getfield        androidx/recyclerview/widget/RecyclerView$ViewHolder.itemView:Landroid/view/View;
        //   195: invokevirtual   android/view/ViewGroup.removeView:(Landroid/view/View;)V
        //   198: goto            210
        //   201: astore_1       
        //   202: aload_1        
        //   203: invokestatic    X/3Z3.LIZ:(Ljava/lang/Exception;)V
        //   206: aload_1        
        //   207: invokestatic    X/4ch.LIZ:(Ljava/lang/Exception;)V
        //   210: aload_0        
        //   211: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   214: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //   217: putstatic       X/2ex.LIZ:Ljava/lang/String;
        //   220: aload_0        
        //   221: areturn        
        //   222: astore          6
        //   224: iload           4
        //   226: istore          5
        //   228: goto            95
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  71     81     201    210    Ljava/lang/Exception;
        //  84     95     222    231    Ljava/lang/Exception;
        //  100    186    201    210    Ljava/lang/Exception;
        //  190    198    201    210    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0095:
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
    
    public final List<? extends RecyclerView.a<? extends ViewHolder>> LIZ() {
        final 177 liz = this.LIZ;
        List<Object> emptyList;
        if (liz.LJ.isEmpty()) {
            emptyList = Collections.emptyList();
        }
        else {
            final ArrayList list = new ArrayList<RecyclerView.a<ViewHolder>>(liz.LJ.size());
            final Iterator<0Fg> iterator = liz.LJ.iterator();
            while (true) {
                emptyList = (List<Object>)list;
                if (!iterator.hasNext()) {
                    break;
                }
                list.add(iterator.next().LIZJ);
            }
        }
        return Collections.unmodifiableList((List<? extends RecyclerView.a<? extends ViewHolder>>)emptyList);
    }
    
    public final void LIZ(final RecyclerView.a.a stateRestorationPolicy) {
        super.setStateRestorationPolicy(stateRestorationPolicy);
    }
    
    public final boolean LIZ(final int n, final RecyclerView.a<? extends ViewHolder> a) {
        return this.LIZ.LIZ(n, (RecyclerView.a<ViewHolder>)a);
    }
    
    public final boolean LIZ(final RecyclerView.a<? extends ViewHolder> a) {
        return this.LIZ.LIZIZ((RecyclerView.a<ViewHolder>)a);
    }
    
    public final boolean LIZIZ(final RecyclerView.a<? extends ViewHolder> a) {
        final 177 liz = this.LIZ;
        final int liz2 = liz.LIZ((RecyclerView.a<ViewHolder>)a);
        if (liz2 == -1) {
            return false;
        }
        final 0Fg 0Fg = liz.LJ.get(liz2);
        final int liz3 = liz.LIZ(0Fg);
        liz.LJ.remove(liz2);
        ((RecyclerView.a)liz.LIZ).notifyItemRangeRemoved(liz3, 0Fg.LJ);
        final Iterator<WeakReference<RecyclerView>> iterator = liz.LIZJ.iterator();
        while (iterator.hasNext()) {
            final RecyclerView recyclerView = iterator.next().get();
            if (recyclerView != null) {
                a.onDetachedFromRecyclerView(recyclerView);
            }
        }
        0Fg.LIZJ.unregisterAdapterDataObserver(0Fg.LJFF);
        0Fg.LIZ.LIZ();
        liz.LIZJ();
        return true;
    }
    
    public final int findRelativeAdapterPositionIn(final RecyclerView.a<? extends ViewHolder> a, final ViewHolder viewHolder, int n) {
        final 177 liz = this.LIZ;
        final 0Fg 0Fg = liz.LIZLLL.get(viewHolder);
        if (0Fg == null) {
            return -1;
        }
        n -= liz.LIZ(0Fg);
        final int itemCount = 0Fg.LIZJ.getItemCount();
        if (n >= 0 && n < itemCount) {
            return 0Fg.LIZJ.findRelativeAdapterPositionIn((RecyclerView.a)a, viewHolder, n);
        }
        final StringBuilder sb = new StringBuilder("Detected inconsistent adapter updates. The local position of the view holder maps to ");
        sb.append(n);
        sb.append(" which is out of bounds for the adapter with size ");
        sb.append(itemCount);
        sb.append(".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:");
        sb.append(viewHolder);
        sb.append("adapter:");
        sb.append(a);
        throw new IllegalStateException(sb.toString());
    }
    
    @Override
    public final int getItemCount() {
        final Iterator<0Fg> iterator = this.LIZ.LJ.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            n += iterator.next().LJ;
        }
        return n;
    }
    
    @Override
    public final long getItemId(int liziz) {
        final 177 liz = this.LIZ;
        final 177.a liz2 = liz.LIZ(liziz);
        final 0Fg liz3 = liz2.LIZ;
        liziz = liz2.LIZIZ;
        final long liz4 = liz3.LIZIZ.LIZ(liz3.LIZJ.getItemId(liziz));
        liz.LIZ(liz2);
        return liz4;
    }
    
    @Override
    public final int getItemViewType(int n) {
        final 177 liz = this.LIZ;
        final 177.a liz2 = liz.LIZ(n);
        final 0Fg liz3 = liz2.LIZ;
        n = liz2.LIZIZ;
        n = liz3.LIZ.LIZ(liz3.LIZJ.getItemViewType(n));
        liz.LIZ(liz2);
        return n;
    }
    
    @Override
    public final void onAttachedToRecyclerView(final RecyclerView recyclerView) {
        final 177 liz = this.LIZ;
        final Iterator<WeakReference<RecyclerView>> iterator = liz.LIZJ.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().get() == recyclerView) {
                return;
            }
        }
        liz.LIZJ.add(new WeakReference<RecyclerView>(recyclerView));
        final Iterator<0Fg> iterator2 = liz.LJ.iterator();
        while (iterator2.hasNext()) {
            iterator2.next().LIZJ.onAttachedToRecyclerView(recyclerView);
        }
    }
    
    @Override
    public final void onBindViewHolder(final ViewHolder viewHolder, int liziz) {
        final 177 liz = this.LIZ;
        final 177.a liz2 = liz.LIZ(liziz);
        liz.LIZLLL.put(viewHolder, liz2.LIZ);
        final 0Fg liz3 = liz2.LIZ;
        liziz = liz2.LIZIZ;
        liz3.LIZJ.bindViewHolder(viewHolder, liziz);
        liz.LIZ(liz2);
    }
    
    @Override
    public final ViewHolder onCreateViewHolder(final ViewGroup viewGroup, final int n) {
        return LIZ(this, viewGroup, n);
    }
    
    @Override
    public final void onDetachedFromRecyclerView(final RecyclerView recyclerView) {
        final 177 liz = this.LIZ;
        for (int i = liz.LIZJ.size() - 1; i >= 0; --i) {
            final WeakReference weakReference = liz.LIZJ.get(i);
            if (weakReference.get() == null) {
                liz.LIZJ.remove(i);
            }
            else if (weakReference.get() == recyclerView) {
                liz.LIZJ.remove(i);
                break;
            }
        }
        final Iterator<0Fg> iterator = liz.LJ.iterator();
        while (iterator.hasNext()) {
            iterator.next().LIZJ.onDetachedFromRecyclerView(recyclerView);
        }
    }
    
    @Override
    public final boolean onFailedToRecycleView(final ViewHolder viewHolder) {
        final 177 liz = this.LIZ;
        final 0Fg 0Fg = liz.LIZLLL.get(viewHolder);
        if (0Fg != null) {
            final boolean onFailedToRecycleView = 0Fg.LIZJ.onFailedToRecycleView(viewHolder);
            liz.LIZLLL.remove(viewHolder);
            return onFailedToRecycleView;
        }
        final StringBuilder sb = new StringBuilder("Cannot find wrapper for ");
        sb.append(viewHolder);
        sb.append(", seems like it is not bound by this adapter: ");
        sb.append(liz);
        throw new IllegalStateException(sb.toString());
    }
    
    @Override
    public final void onViewAttachedToWindow(final ViewHolder viewHolder) {
        this.LIZ.LIZ(viewHolder).LIZJ.onViewAttachedToWindow(viewHolder);
    }
    
    @Override
    public final void onViewDetachedFromWindow(final ViewHolder viewHolder) {
        this.LIZ.LIZ(viewHolder).LIZJ.onViewDetachedFromWindow(viewHolder);
    }
    
    @Override
    public final void onViewRecycled(final ViewHolder viewHolder) {
        final 177 liz = this.LIZ;
        final 0Fg 0Fg = liz.LIZLLL.get(viewHolder);
        if (0Fg != null) {
            0Fg.LIZJ.onViewRecycled(viewHolder);
            liz.LIZLLL.remove(viewHolder);
            return;
        }
        final StringBuilder sb = new StringBuilder("Cannot find wrapper for ");
        sb.append(viewHolder);
        sb.append(", seems like it is not bound by this adapter: ");
        sb.append(liz);
        throw new IllegalStateException(sb.toString());
    }
    
    @Override
    public final void setHasStableIds(final boolean b) {
        throw new UnsupportedOperationException("Calling setHasStableIds is not allowed on the ConcatAdapter. Use the Config object passed in the constructor to control this behavior");
    }
    
    public final void setStateRestorationPolicy(final RecyclerView.a.a a) {
        throw new UnsupportedOperationException("Calling setStateRestorationPolicy is not allowed on the ConcatAdapter. This value is inferred from added adapters");
    }
    
    public static final class a
    {
        public static final 176.a LIZJ;
        public final boolean LIZ;
        public final b LIZIZ;
        
        static {
            Covode.recordClassIndex(1604);
            LIZJ = new 176.a(true, b.NO_STABLE_IDS);
        }
        
        public a(final boolean liz, final b liziz) {
            this.LIZ = liz;
            this.LIZIZ = liziz;
        }
        
        public static final class a
        {
            public boolean LIZ;
            public b LIZIZ;
            
            static {
                Covode.recordClassIndex(1605);
            }
            
            public a() {
                this.LIZ = 176.a.LIZJ.LIZ;
                this.LIZIZ = 176.a.LIZJ.LIZIZ;
            }
            
            public final 176.a LIZ() {
                return new 176.a(this.LIZ, this.LIZIZ);
            }
        }
        
        public enum b
        {
            ISOLATED_STABLE_IDS, 
            NO_STABLE_IDS, 
            SHARED_STABLE_IDS;
            
            static {
                Covode.recordClassIndex(1606);
            }
        }
    }
}
