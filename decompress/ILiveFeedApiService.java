// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.feed.api;

import X.Flv;
import X.0VW;
import java.util.Map;
import androidx.fragment.app.Fragment;
import X.GCK;
import com.bytedance.covode.number.Covode;
import X.0Vq;

public interface ILiveFeedApiService extends 0Vq
{
    default static {
        Covode.recordClassIndex(4805);
    }
    
    Fragment createDrawerFeedFragment(final GCK p0);
    
    Fragment createDrawerFeedFragmentV2(final GCK p0, final String p1);
    
    void delayInit();
    
    Map<String, Object> getFeedTab(final long p0);
    
    Map<String, Object> getFeedTabForyouPage(final long p0);
    
    0VW getMinimizeManager();
    
    Flv getStartLiveRoomInterceptor();
    
    void init();
    
    void recordNeedRetryTabApi();
    
    void requestTabInNetWorkState();
    
    void requestTabListForyouPage();
}
