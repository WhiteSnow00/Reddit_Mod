// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.browser;

import android.webkit.WebView;
import X.HqE;
import androidx.fragment.app.Fragment;
import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import X.0Vq;

public interface IContainerService extends 0Vq
{
    default static {
        Covode.recordClassIndex(5579);
    }
    
    Fragment createPageFragment(final Uri p0, final Context p1);
    
    HqE<?> getLynxCustomReport();
    
    HqE<WebView> getWebViewCustomReport();
    
    boolean handleScheme(final Uri p0, final Context p1);
    
    boolean isContainerScheme(final Uri p0);
}
