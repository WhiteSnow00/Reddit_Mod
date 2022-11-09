// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.browser;

import X.QEA;
import X.2P9;
import com.bytedance.hybrid.spark.SparkContext;
import X.SRS;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import X.0Vq;

public interface IHybridContainerService extends 0Vq
{
    default static {
        Covode.recordClassIndex(5580);
    }
    
    QEA createLynxSparkView(final Context p0, final String p1, final String p2, final boolean p3, final boolean p4, final SRS<? super SparkContext, 2P9> p5);
    
    QEA createSparkView(final Context p0, final String p1, final boolean p2, final SRS<? super SparkContext, 2P9> p3);
    
    QEA createWebSparkView(final Context p0, final String p1, final boolean p2, final boolean p3, final SRS<? super SparkContext, 2P9> p4);
    
    QEA getSparkViewFromCache(final Context p0, final String p1, final String p2, final SRS<? super SparkContext, 2P9> p3);
    
    SparkContext openSparkContainer(final Context p0, final String p1, final SRS<? super SparkContext, 2P9> p2);
    
    public static final class a
    {
        static {
            Covode.recordClassIndex(5581);
        }
    }
}
