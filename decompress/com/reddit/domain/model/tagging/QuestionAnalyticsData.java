// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.tagging;

import android.os.Parcel;
import ah2.f;
import com.squareup.moshi.n;
import com.reddit.domain.model.Subreddit;
import com.reddit.domain.model.mod.ModPermissions;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = {}, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u001f\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0006\u001a\u00020\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001J\t\u0010\n\u001a\u00020\tH\u00d6\u0001J\t\u0010\f\u001a\u00020\u000bH\u00d6\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u000bH\u00d6\u0001J\u0019\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000bH\u00d6\u0001R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f" }, d2 = { "Lcom/reddit/domain/model/tagging/QuestionAnalyticsData;", "Landroid/os/Parcelable;", "Lcom/reddit/domain/model/Subreddit;", "component1", "Lcom/reddit/domain/model/mod/ModPermissions;", "component2", "subreddit", "modPermissions", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lpg2/j;", "writeToParcel", "Lcom/reddit/domain/model/Subreddit;", "getSubreddit", "()Lcom/reddit/domain/model/Subreddit;", "Lcom/reddit/domain/model/mod/ModPermissions;", "getModPermissions", "()Lcom/reddit/domain/model/mod/ModPermissions;", "<init>", "(Lcom/reddit/domain/model/Subreddit;Lcom/reddit/domain/model/mod/ModPermissions;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class QuestionAnalyticsData implements Parcelable
{
    public static final Parcelable$Creator<QuestionAnalyticsData> CREATOR;
    private final ModPermissions modPermissions;
    private final Subreddit subreddit;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public QuestionAnalyticsData(@n(name = "subreddit") final Subreddit subreddit, @n(name = "mod_permissions") final ModPermissions modPermissions) {
        f.f((Object)subreddit, "subreddit");
        this.subreddit = subreddit;
        this.modPermissions = modPermissions;
    }
    
    public final Subreddit component1() {
        return this.subreddit;
    }
    
    public final ModPermissions component2() {
        return this.modPermissions;
    }
    
    public final QuestionAnalyticsData copy(@n(name = "subreddit") final Subreddit subreddit, @n(name = "mod_permissions") final ModPermissions modPermissions) {
        f.f((Object)subreddit, "subreddit");
        return new QuestionAnalyticsData(subreddit, modPermissions);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof QuestionAnalyticsData)) {
            return false;
        }
        final QuestionAnalyticsData questionAnalyticsData = (QuestionAnalyticsData)o;
        return f.a((Object)this.subreddit, (Object)questionAnalyticsData.subreddit) && f.a((Object)this.modPermissions, (Object)questionAnalyticsData.modPermissions);
    }
    
    public final ModPermissions getModPermissions() {
        return this.modPermissions;
    }
    
    public final Subreddit getSubreddit() {
        return this.subreddit;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.subreddit.hashCode();
        final ModPermissions modPermissions = this.modPermissions;
        int hashCode2;
        if (modPermissions == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = modPermissions.hashCode();
        }
        return hashCode * 31 + hashCode2;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("QuestionAnalyticsData(subreddit=");
        k.append(this.subreddit);
        k.append(", modPermissions=");
        k.append(this.modPermissions);
        k.append(')');
        return k.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        f.f((Object)parcel, "out");
        this.subreddit.writeToParcel(parcel, n);
        final ModPermissions modPermissions = this.modPermissions;
        if (modPermissions == null) {
            parcel.writeInt(0);
        }
        else {
            parcel.writeInt(1);
            modPermissions.writeToParcel(parcel, n);
        }
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<QuestionAnalyticsData>
    {
        public final QuestionAnalyticsData createFromParcel(final Parcel parcel) {
            f.f((Object)parcel, "parcel");
            final Subreddit subreddit = (Subreddit)Subreddit.CREATOR.createFromParcel(parcel);
            Object fromParcel;
            if (parcel.readInt() == 0) {
                fromParcel = null;
            }
            else {
                fromParcel = ModPermissions.CREATOR.createFromParcel(parcel);
            }
            return new QuestionAnalyticsData(subreddit, (ModPermissions)fromParcel);
        }
        
        public final QuestionAnalyticsData[] newArray(final int n) {
            return new QuestionAnalyticsData[n];
        }
    }
}
