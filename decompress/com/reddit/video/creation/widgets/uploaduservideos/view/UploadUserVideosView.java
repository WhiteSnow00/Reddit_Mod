// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.widgets.uploaduservideos.view;

import com.reddit.video.creation.widgets.uploaduservideos.model.LocalUserVideo;
import java.util.List;
import kotlin.Metadata;
import com.reddit.video.creation.widgets.base.interfaces.LoadingView;
import com.reddit.video.creation.widgets.base.BaseMVPView;

@Metadata(bv = {}, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&J\u0012\u0010\r\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u000bH&J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\bH&R\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017" }, d2 = { "Lcom/reddit/video/creation/widgets/uploaduservideos/view/UploadUserVideosView;", "Lcom/reddit/video/creation/widgets/base/BaseMVPView;", "Lcom/reddit/video/creation/widgets/base/interfaces/LoadingView;", "", "Lcom/reddit/video/creation/widgets/uploaduservideos/model/LocalUserVideo;", "data", "Lcg2/j;", "showData", "", "isEnabled", "setNextButtonState", "", "message", "showToast", "withImages", "initTabs", "", "getMaxAllowedDuration", "()J", "maxAllowedDuration", "getHasOtherVideos", "()Z", "hasOtherVideos", "creation_release" }, k = 1, mv = { 1, 7, 1 })
public interface UploadUserVideosView extends BaseMVPView, LoadingView
{
    boolean getHasOtherVideos();
    
    long getMaxAllowedDuration();
    
    void initTabs(final boolean p0);
    
    void setNextButtonState(final boolean p0);
    
    void showData(final List<LocalUserVideo> p0);
    
    void showToast(final int p0);
}
