// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.video.normalize;

import sg2.e;
import android.util.Size;
import com.reddit.video.creation.widgets.widget.clipseekbar.model.AdjustableClip;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007?\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007?\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005?\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e?\u0006\u0019" }, d2 = { "Lcom/reddit/video/creation/video/normalize/NormalizationTargetResult;", "", "clip", "Lcom/reddit/video/creation/widgets/widget/clipseekbar/model/AdjustableClip;", "requiresVideoNormalization", "", "requestedSize", "Landroid/util/Size;", "(Lcom/reddit/video/creation/widgets/widget/clipseekbar/model/AdjustableClip;ZLandroid/util/Size;)V", "getClip", "()Lcom/reddit/video/creation/widgets/widget/clipseekbar/model/AdjustableClip;", "getRequestedSize", "()Landroid/util/Size;", "getRequiresVideoNormalization", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "creation_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class NormalizationTargetResult
{
    public static final int $stable = 8;
    private final AdjustableClip clip;
    private final Size requestedSize;
    private final boolean requiresVideoNormalization;
    
    public NormalizationTargetResult(final AdjustableClip clip, final boolean requiresVideoNormalization, final Size requestedSize) {
        e.f((Object)clip, "clip");
        e.f((Object)requestedSize, "requestedSize");
        this.clip = clip;
        this.requiresVideoNormalization = requiresVideoNormalization;
        this.requestedSize = requestedSize;
    }
    
    public final AdjustableClip component1() {
        return this.clip;
    }
    
    public final boolean component2() {
        return this.requiresVideoNormalization;
    }
    
    public final Size component3() {
        return this.requestedSize;
    }
    
    public final NormalizationTargetResult copy(final AdjustableClip adjustableClip, final boolean b, final Size size) {
        e.f((Object)adjustableClip, "clip");
        e.f((Object)size, "requestedSize");
        return new NormalizationTargetResult(adjustableClip, b, size);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NormalizationTargetResult)) {
            return false;
        }
        final NormalizationTargetResult normalizationTargetResult = (NormalizationTargetResult)o;
        return e.a((Object)this.clip, (Object)normalizationTargetResult.clip) && this.requiresVideoNormalization == normalizationTargetResult.requiresVideoNormalization && e.a((Object)this.requestedSize, (Object)normalizationTargetResult.requestedSize);
    }
    
    public final AdjustableClip getClip() {
        return this.clip;
    }
    
    public final Size getRequestedSize() {
        return this.requestedSize;
    }
    
    public final boolean getRequiresVideoNormalization() {
        return this.requiresVideoNormalization;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.clip.hashCode();
        int requiresVideoNormalization;
        if ((requiresVideoNormalization = (this.requiresVideoNormalization ? 1 : 0)) != 0) {
            requiresVideoNormalization = 1;
        }
        return this.requestedSize.hashCode() + (hashCode * 31 + requiresVideoNormalization) * 31;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("NormalizationTargetResult(clip=");
        r.append(this.clip);
        r.append(", requiresVideoNormalization=");
        r.append(this.requiresVideoNormalization);
        r.append(", requestedSize=");
        r.append(this.requestedSize);
        r.append(')');
        return r.toString();
    }
}
