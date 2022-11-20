// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.widgets.base.bottomSheetDialog;

import com.reddit.video.creation.widgets.widget.trimclipview.TrimClipUnits;
import kotlin.Pair;
import af2.t;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H&J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH&R&\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00120\u00110\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0018" }, d2 = { "Lcom/reddit/video/creation/widgets/base/bottomSheetDialog/BaseOverlaysBottomSheetDialogView;", "Lcom/reddit/video/creation/widgets/base/bottomSheetDialog/BaseTrimView;", "Lcom/reddit/video/creation/widgets/base/bottomSheetDialog/TrimClipViewState;", "trimClipViewState", "Lcg2/j;", "setScrubberState", "Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Milliseconds;", "startTime", "updateSelectedOverlayStartTime", "endTime", "clipDuration", "updateSelectedOverlayEndTime", "time", "", "isPlaying", "updateOverlayVisibilityForTime", "Laf2/t;", "Lkotlin/Pair;", "", "getUserSeekPositionObservable", "()Laf2/t;", "userSeekPositionObservable", "getUserSeekProgressPositionObservable", "userSeekProgressPositionObservable", "creation_release" }, k = 1, mv = { 1, 7, 1 })
public interface BaseOverlaysBottomSheetDialogView extends BaseTrimView
{
    t<Pair<TrimClipUnits.Milliseconds, Integer>> getUserSeekPositionObservable();
    
    t<TrimClipUnits.Milliseconds> getUserSeekProgressPositionObservable();
    
    void setScrubberState(final TrimClipViewState p0);
    
    void updateOverlayVisibilityForTime(final TrimClipUnits.Milliseconds p0, final boolean p1);
    
    void updateSelectedOverlayEndTime(final TrimClipUnits.Milliseconds p0, final TrimClipUnits.Milliseconds p1);
    
    void updateSelectedOverlayStartTime(final TrimClipUnits.Milliseconds p0);
}
