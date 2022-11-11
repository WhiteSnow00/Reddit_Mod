// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.modtools.crowdcontrol;

import sg2.e;
import android.os.Parcel;
import al0.b;
import com.reddit.domain.model.mod.CrowdControlFilterLevel;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = {}, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0017\u001a\u00020\r\u0012\u0006\u0010\u0019\u001a\u00020\r\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001f\u0010 J\t\u0010\u0003\u001a\u00020\u0002H\u00d6\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u00d6\u0001R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0018\u0010\u0011R\u0017\u0010\u0019\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u001a\u0010\u0011R\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006!" }, d2 = { "Lcom/reddit/domain/modtools/crowdcontrol/CrowdControlFilteringActionArg;", "Landroid/os/Parcelable;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lhg2/j;", "writeToParcel", "modelPosition", "I", "getModelPosition", "()I", "", "postKindWithId", "Ljava/lang/String;", "getPostKindWithId", "()Ljava/lang/String;", "Lcom/reddit/domain/model/mod/CrowdControlFilterLevel;", "postCrowdControlLevel", "Lcom/reddit/domain/model/mod/CrowdControlFilterLevel;", "getPostCrowdControlLevel", "()Lcom/reddit/domain/model/mod/CrowdControlFilterLevel;", "subredditName", "getSubredditName", "subredditKindWithId", "getSubredditKindWithId", "", "isFilterEnabled", "Z", "()Z", "<init>", "(ILjava/lang/String;Lcom/reddit/domain/model/mod/CrowdControlFilterLevel;Ljava/lang/String;Ljava/lang/String;Z)V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class CrowdControlFilteringActionArg implements Parcelable
{
    public static final Parcelable$Creator<CrowdControlFilteringActionArg> CREATOR;
    private final boolean isFilterEnabled;
    private final int modelPosition;
    private final CrowdControlFilterLevel postCrowdControlLevel;
    private final String postKindWithId;
    private final String subredditKindWithId;
    private final String subredditName;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public CrowdControlFilteringActionArg(final int modelPosition, final String postKindWithId, final CrowdControlFilterLevel postCrowdControlLevel, final String subredditName, final String subredditKindWithId, final boolean isFilterEnabled) {
        b.q(postKindWithId, "postKindWithId", subredditName, "subredditName", subredditKindWithId, "subredditKindWithId");
        this.modelPosition = modelPosition;
        this.postKindWithId = postKindWithId;
        this.postCrowdControlLevel = postCrowdControlLevel;
        this.subredditName = subredditName;
        this.subredditKindWithId = subredditKindWithId;
        this.isFilterEnabled = isFilterEnabled;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public final int getModelPosition() {
        return this.modelPosition;
    }
    
    public final CrowdControlFilterLevel getPostCrowdControlLevel() {
        return this.postCrowdControlLevel;
    }
    
    public final String getPostKindWithId() {
        return this.postKindWithId;
    }
    
    public final String getSubredditKindWithId() {
        return this.subredditKindWithId;
    }
    
    public final String getSubredditName() {
        return this.subredditName;
    }
    
    public final boolean isFilterEnabled() {
        return this.isFilterEnabled;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        e.f((Object)parcel, "out");
        parcel.writeInt(this.modelPosition);
        parcel.writeString(this.postKindWithId);
        parcel.writeParcelable((Parcelable)this.postCrowdControlLevel, n);
        parcel.writeString(this.subredditName);
        parcel.writeString(this.subredditKindWithId);
        parcel.writeInt((int)(this.isFilterEnabled ? 1 : 0));
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<CrowdControlFilteringActionArg>
    {
        public final CrowdControlFilteringActionArg createFromParcel(final Parcel parcel) {
            e.f((Object)parcel, "parcel");
            return new CrowdControlFilteringActionArg(parcel.readInt(), parcel.readString(), (CrowdControlFilterLevel)parcel.readParcelable(CrowdControlFilteringActionArg.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }
        
        public final CrowdControlFilteringActionArg[] newArray(final int n) {
            return new CrowdControlFilteringActionArg[n];
        }
    }
}
