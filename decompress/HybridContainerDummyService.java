// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.browser;

import X.Q3j;
import X.CTM;
import X.QEA;
import X.2P9;
import com.bytedance.hybrid.spark.SparkContext;
import X.SRS;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public class HybridContainerDummyService implements IHybridContainerService
{
    static {
        Covode.recordClassIndex(5575);
    }
    
    @Override
    public QEA createLynxSparkView(final Context context, final String s, final String s2, final boolean b, final boolean b2, final SRS<? super SparkContext, 2P9> srs) {
        CTM.LIZ((Object)context, (Object)s);
        return Q3j.LJIIJJI.LIZ(context, new SparkContext()).LIZIZ();
    }
    
    public Q3j createSparkContainer(final Context context, final String s, final SRS<? super SparkContext, 2P9> srs) {
        CTM.LIZ((Object)context, (Object)s);
        return Q3j.LJIIJJI.LIZ(context, new SparkContext());
    }
    
    @Override
    public QEA createSparkView(final Context context, final String s, final boolean b, final SRS<? super SparkContext, 2P9> srs) {
        CTM.LIZ((Object)context, (Object)s);
        return Q3j.LJIIJJI.LIZ(context, new SparkContext()).LIZIZ();
    }
    
    @Override
    public QEA createWebSparkView(final Context context, final String s, final boolean b, final boolean b2, final SRS<? super SparkContext, 2P9> srs) {
        CTM.LIZ((Object)context, (Object)s);
        return Q3j.LJIIJJI.LIZ(context, new SparkContext()).LIZIZ();
    }
    
    @Override
    public QEA getSparkViewFromCache(final Context context, final String s, final String s2, final SRS<? super SparkContext, 2P9> srs) {
        CTM.LIZ((Object)context, (Object)s, (Object)s2);
        return null;
    }
    
    @Override
    public void onInit() {
    }
    
    @Override
    public SparkContext openSparkContainer(final Context context, final String s, final SRS<? super SparkContext, 2P9> srs) {
        CTM.LIZ((Object)context, (Object)s);
        return new SparkContext();
    }
}
