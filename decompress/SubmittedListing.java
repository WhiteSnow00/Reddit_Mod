// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.listing;

import a2.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ah2.f;
import com.reddit.domain.model.VideoUpload;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = { "\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002BE\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u000bJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u00c6\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bH\u00c6\u0003JS\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\bH\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\bH\u00d6\u0001R\u0013\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u001f" }, d2 = { "Lcom/reddit/domain/model/listing/SubmittedListing;", "T", "", "children", "", "videoUploads", "Lcom/reddit/domain/model/VideoUpload;", "after", "", "before", "adDistance", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAdDistance", "()Ljava/lang/String;", "getAfter", "getBefore", "getChildren", "()Ljava/util/List;", "getVideoUploads", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class SubmittedListing<T>
{
    private final String adDistance;
    private final String after;
    private final String before;
    private final List<T> children;
    private final List<VideoUpload> videoUploads;
    
    public SubmittedListing(final List<? extends T> children, final List<VideoUpload> videoUploads, final String after, final String before, final String adDistance) {
        f.f((Object)children, "children");
        f.f((Object)videoUploads, "videoUploads");
        this.children = (List<T>)children;
        this.videoUploads = videoUploads;
        this.after = after;
        this.before = before;
        this.adDistance = adDistance;
    }
    
    public final List<T> component1() {
        return this.children;
    }
    
    public final List<VideoUpload> component2() {
        return this.videoUploads;
    }
    
    public final String component3() {
        return this.after;
    }
    
    public final String component4() {
        return this.before;
    }
    
    public final String component5() {
        return this.adDistance;
    }
    
    public final SubmittedListing<T> copy(final List<? extends T> list, final List<VideoUpload> list2, final String s, final String s2, final String s3) {
        f.f((Object)list, "children");
        f.f((Object)list2, "videoUploads");
        return new SubmittedListing<T>(list, list2, s, s2, s3);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubmittedListing)) {
            return false;
        }
        final SubmittedListing submittedListing = (SubmittedListing)o;
        return f.a((Object)this.children, (Object)submittedListing.children) && f.a((Object)this.videoUploads, (Object)submittedListing.videoUploads) && f.a((Object)this.after, (Object)submittedListing.after) && f.a((Object)this.before, (Object)submittedListing.before) && f.a((Object)this.adDistance, (Object)submittedListing.adDistance);
    }
    
    public final String getAdDistance() {
        return this.adDistance;
    }
    
    public final String getAfter() {
        return this.after;
    }
    
    public final String getBefore() {
        return this.before;
    }
    
    public final List<T> getChildren() {
        return this.children;
    }
    
    public final List<VideoUpload> getVideoUploads() {
        return this.videoUploads;
    }
    
    @Override
    public int hashCode() {
        final int a = b.a((List)this.videoUploads, this.children.hashCode() * 31, 31);
        final String after = this.after;
        int hashCode = 0;
        int hashCode2;
        if (after == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = after.hashCode();
        }
        final String before = this.before;
        int hashCode3;
        if (before == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = before.hashCode();
        }
        final String adDistance = this.adDistance;
        if (adDistance != null) {
            hashCode = adDistance.hashCode();
        }
        return ((a + hashCode2) * 31 + hashCode3) * 31 + hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("SubmittedListing(children=");
        k.append(this.children);
        k.append(", videoUploads=");
        k.append(this.videoUploads);
        k.append(", after=");
        k.append(this.after);
        k.append(", before=");
        k.append(this.before);
        k.append(", adDistance=");
        return b.k(k, this.adDistance, ')');
    }
}
