// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.gold;

import android.os.Parcel;
import ah2.f;
import android.os.Parcelable$Creator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007" }, d2 = { "Lcom/reddit/domain/model/gold/UsableAwardsParams;", "Landroid/os/Parcelable;", "()V", "Subreddit", "UserProfile", "Lcom/reddit/domain/model/gold/UsableAwardsParams$Subreddit;", "Lcom/reddit/domain/model/gold/UsableAwardsParams$UserProfile;", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public abstract class UsableAwardsParams implements Parcelable
{
    private UsableAwardsParams() {
    }
    
    @Metadata(bv = {}, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002H\u00c6\u0001J\t\u0010\u0006\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\b\u001a\u00020\u0007H\u00d6\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u00d6\u0003J\t\u0010\r\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0007H\u00d6\u0001R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018" }, d2 = { "Lcom/reddit/domain/model/gold/UsableAwardsParams$Subreddit;", "Lcom/reddit/domain/model/gold/UsableAwardsParams;", "", "component1", "kindWithId", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lpg2/j;", "writeToParcel", "Ljava/lang/String;", "getKindWithId", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class Subreddit extends UsableAwardsParams
    {
        public static final Parcelable$Creator<Subreddit> CREATOR;
        private final String kindWithId;
        
        static {
            CREATOR = (Parcelable$Creator)new Creator();
        }
        
        public Subreddit(final String kindWithId) {
            f.f((Object)kindWithId, "kindWithId");
            super(null);
            this.kindWithId = kindWithId;
        }
        
        public final String component1() {
            return this.kindWithId;
        }
        
        public final Subreddit copy(final String s) {
            f.f((Object)s, "kindWithId");
            return new Subreddit(s);
        }
        
        public int describeContents() {
            return 0;
        }
        
        @Override
        public boolean equals(final Object o) {
            return this == o || (o instanceof Subreddit && f.a((Object)this.kindWithId, (Object)((Subreddit)o).kindWithId));
        }
        
        public final String getKindWithId() {
            return this.kindWithId;
        }
        
        @Override
        public int hashCode() {
            return this.kindWithId.hashCode();
        }
        
        @Override
        public String toString() {
            return b.k(a.k("Subreddit(kindWithId="), this.kindWithId, ')');
        }
        
        public void writeToParcel(final Parcel parcel, final int n) {
            f.f((Object)parcel, "out");
            parcel.writeString(this.kindWithId);
        }
        
        @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
        public static final class Creator implements Parcelable$Creator<Subreddit>
        {
            public final Subreddit createFromParcel(final Parcel parcel) {
                f.f((Object)parcel, "parcel");
                return new Subreddit(parcel.readString());
            }
            
            public final Subreddit[] newArray(final int n) {
                return new Subreddit[n];
            }
        }
    }
    
    @Metadata(bv = {}, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002H\u00c6\u0001J\t\u0010\u0006\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\b\u001a\u00020\u0007H\u00d6\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u00d6\u0003J\t\u0010\r\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0007H\u00d6\u0001R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018" }, d2 = { "Lcom/reddit/domain/model/gold/UsableAwardsParams$UserProfile;", "Lcom/reddit/domain/model/gold/UsableAwardsParams;", "", "component1", "name", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lpg2/j;", "writeToParcel", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class UserProfile extends UsableAwardsParams
    {
        public static final Parcelable$Creator<UserProfile> CREATOR;
        private final String name;
        
        static {
            CREATOR = (Parcelable$Creator)new Creator();
        }
        
        public UserProfile(final String name) {
            f.f((Object)name, "name");
            super(null);
            this.name = name;
        }
        
        public final String component1() {
            return this.name;
        }
        
        public final UserProfile copy(final String s) {
            f.f((Object)s, "name");
            return new UserProfile(s);
        }
        
        public int describeContents() {
            return 0;
        }
        
        @Override
        public boolean equals(final Object o) {
            return this == o || (o instanceof UserProfile && f.a((Object)this.name, (Object)((UserProfile)o).name));
        }
        
        public final String getName() {
            return this.name;
        }
        
        @Override
        public int hashCode() {
            return this.name.hashCode();
        }
        
        @Override
        public String toString() {
            return b.k(a.k("UserProfile(name="), this.name, ')');
        }
        
        public void writeToParcel(final Parcel parcel, final int n) {
            f.f((Object)parcel, "out");
            parcel.writeString(this.name);
        }
        
        @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
        public static final class Creator implements Parcelable$Creator<UserProfile>
        {
            public final UserProfile createFromParcel(final Parcel parcel) {
                f.f((Object)parcel, "parcel");
                return new UserProfile(parcel.readString());
            }
            
            public final UserProfile[] newArray(final int n) {
                return new UserProfile[n];
            }
        }
    }
}
